import re

def clean_up(bnf_lines):
    cleaned_bnf_text = []
    
    for line in bnf_lines:
        line = line.replace("><", "> <")
        cleaned_bnf_text.append(line)
        
    cleaned_bnf_text = [s.replace('\n', ' ') for s in cleaned_bnf_text]
        
    if len(cleaned_bnf_text) > 1:
        i = 1
        while i < len(cleaned_bnf_text):
            if cleaned_bnf_text[i].startswith(" "):
                cleaned_bnf_text[i - 1] += cleaned_bnf_text[i].lstrip()
                cleaned_bnf_text.pop(i)
            else:
                i += 1
                
    return cleaned_bnf_text
def get_lexer_rules():
    text = """Or: '|';
    And: '&';
    Iff : '<=>';
    Impl : '=>';
    If: '<=';
    Niff: '<~>';
    Nor: '~|';
    Nand: '~&';
    Not: '~';
    ForallComb: '!!';
    TyForall: '!>';
    Infix_inequality : '!=';
    Infix_equality : '=';
    Forall: '!';
    ExistsComb: '??';
    TyExists: '?*';
    Exists: '?';
    Lambda: '^';
    ChoiceComb: '@@+';
    Choice: '@+';
    DescriptionComb: '@@-';
    Description: '@-';
    EqComb: '@=';
    App: '@';
    Assignment: ':=';
    Identical: '==';
    Arrow: '>';
    Star: '*';
    Plus: '+';
    Hash: '#';
    Subtype_sign: '<<';
    Gentzen_arrow: '-->';"""
    
    lexer_list = {}
    
    text = text.replace(";", "")
    for line in text.split("\n"):
        lexer_list[line.split(":")[0].strip()] = line.split(":")[1].strip().replace("'", "")
        
    return lexer_list
def get_optional_rules():
    file = open("bin/input/SyntaxBNF", "r")
    text = file.readlines()
    file.close()

    text = clean_up(text)
    
    optional_rules = []
    
    for line in text:
        if "|<null>" in line.replace(" ", ""):
            optional_rules.append(line.split(">")[0].split("<")[1])
    
    return optional_rules


def convertGrammarRuleNoPipes(bnf_line, append_EOF=False):
    # match all <expressions> in the line
    pattern = r'<(.*?)>'
    matches = re.findall(pattern, bnf_line)
    symbols = ["<" + match + ">" for match in matches]
    lexer_list = get_lexer_rules()
    
    bnf_line = bnf_line.replace("><", "> <")

    symbols_dict = {}
    
    # create a dictionary of symbols and their corresponding values
    count = 0
    for symbol in symbols:
        symbols_dict[str(count)] = symbol
        count += 1

    # first replace the "is defined as" symbol ::= with :
    bnf_line = bnf_line.replace("::=", ":")
    

    # replace the values with my symbol representation so that they can be replaced later
    for key, value in symbols_dict.items():
        bnf_line = bnf_line.replace(f"{value}", f"`my_symbol{key}`")
    

    # surround characters from lexer list with quotes
    #~ NO PIPE METHOD
    for item in bnf_line.split(":")[1].split("`"):
        if item.replace(" ", "") not in lexer_list and not item.replace(" ", "").startswith("my_symbol") and item.replace(" ", "") != "":
            if "," in item:
                bnf_line = re.sub(r"(?<!')\,(?![^']*')", f'\'{item.replace(" ", "")}\'', bnf_line)
            else:
                bnf_line = bnf_line.replace(item.replace(" ", ""), "'" + item.replace(" ", "") + "'")

    
    # replace each unique symbol with it's corresponding value
    for key, value in symbols_dict.items():
        bnf_line = bnf_line.replace(f"`my_symbol{key}`", f"{value[1:-1].lower()}")
        
    # appending '?' if rule is optional in definition
    optional_rules = get_optional_rules()
    
    for optional_rule in optional_rules:
        if optional_rule in bnf_line and not bnf_line.startswith(optional_rule):
            bnf_line = bnf_line.replace(optional_rule, f"{optional_rule}?")
            
    # replacing &s
    bnf_line = bnf_line.replace("&", "And")
    
    # replacing @s
    bnf_line = bnf_line.replace("@", "App")

    # finally append the semicolon at the end
    if append_EOF:
        return bnf_line + " EOF;"
    else:
        return bnf_line + ";"
    
      
def convert(line):
    
    line = line.replace("><", "> <")
    
    before_line = line.split("::=")[0].strip()
    before_line = before_line.replace(">", "")
    before_line = before_line.replace("<", "")
    
    after_line = line.split("::=")[1].strip()
    result_str = ""
    isInAlligator = False
    
    index = 0
    for char in after_line:
        if "<<" in after_line:
            return before_line + " : " + "'<<'" + ";"
        
        if char == "<" and after_line[index + 1].isalpha():
            isInAlligator = True
            
        if char == ">" and not isInAlligator:
            result_str += "'>'"
            
        if char == ">" and after_line[index - 1].isalpha():
            isInAlligator = False
            
        if not isInAlligator and char != "|" and char != ">" and char != " ":
            result_str += "'" + char + "'"
            
        elif isInAlligator and char != "<":
            result_str += char
            
        elif char == "|":
            result_str += " | "
        
        elif char == " ":
            result_str += " "
            
        index += 1
            
    # result_str = result_str.replace(">", "")
    # result_str = result_str.replace("<", "")
    
            
    return before_line + " : " + result_str + ";"
        

def convert_lexer(line):
    line = line.replace("><", "> <")
    
    before_line = line.split("::-")[0].strip()
    before_line = before_line.replace(">", "")
    before_line = before_line.replace("<", "")
    
    after_line = line.split("::-")[1].strip()
    
    if after_line.count('[') == 1 and after_line.count(']') == 1:
        after_line = "'" + after_line.replace("[", "").replace("]", "") + "'"
        
        return before_line + " : " + after_line + ";"
        
    else:
        
        result_str = ""
        
        for char in after_line:
            if char == "<":
                isInAlligator = True
                
            if char == ">":
                isInAlligator = False
                
            if not isInAlligator and char != "|" and char != ">" and char != " ":
                result_str += "'" + char + "'"
                
            else:
                result_str += char
                
        result_str = result_str.replace(">", "")
        result_str = result_str.replace("<", "")
        
                
        return before_line + " : " + result_str + ";"
            

# Test the function
test_cases1 = [
    "<annotated_formula> ::= <thf_annotated> | <tff_annotated> | <tcf_annotated> | <fof_annotated> | <cnf_annotated> | <tpi_annotated>",
    "<tpi_annotated> ::= tpi(<name>,<formula_role>,<tpi_formula><annotations>).",
    "<nonassoc_connective>  ::= <=> | => | <= | <~> | ~<vline> | ~&",
    "<th1_quantifier>       ::= !> | ?*",
    "<subtype_sign>         ::= <<",
]

test_cases2 = [
    "<hash>                 ::- [#]",
    "<less_sign>            ::- [<]",
    "<lower_word>           ::- <lower_alpha><alpha_numeric>*",
]
import re

wordlist = ['comment_block', 'not_star_slash', 'percentage_sign', 'double_quote', 'sign', 'dot', 'exponent', 
            'slash_char', 'zero_numeric', 'non_zero_numeric', 'numeric', 'lower_alpha', 'upper_alpha', 
            'alpha_numeric', 'dollar', 'printable_char']

lines = [
    "signed_integer : sign unsigned_integer;",
    "signed_rational : sign unsigned_rational;",
    "upper_word : upper_alpha alpha_numeric'*';"
]

def capitalize_words(text, words):
    pattern = r'\b(' + '|'.join(re.escape(word) for word in words) + r')\b'
    
    def replace_func(match):
        return match.group(0).capitalize()
    
    return [re.sub(pattern, replace_func, line) for line in text]

capitalized_lines = capitalize_words(lines, wordlist)

for line in capitalized_lines:
    print(line)
