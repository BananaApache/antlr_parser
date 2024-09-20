

import re

lexer_rules = {'Or': '|', 'And': '&', 'Iff': '<=>', 'Impl': '=>', 'If': '<=', 'Niff': '<~>', 'Nor': '~|', 'Nand': '~&', 'Not': '~', 'ForallComb': '!!', 'TyForall': '!>', 'Infix_inequality': '!=', 'Infix_equality': '=', 'Forall': '!', 'ExistsComb': '??', 'TyExists': '?*', 'Exists': '?', 'Lambda': '^', 'ChoiceComb': '@@+', 'Choice': '@+', 'DescriptionComb': '@@-', 'Description': '@-', 'EqComb': '@=', 'App': '@', 'Assignment': '', 'Identical': '==', 'Arrow': '>', 'Star': '*', 'Plus': '+', 'Hash': '#', 'Subtype_sign': '<<', 'Gentzen_arrow': '-->'}


def get_optional_rules():
    file = open("bnf/SyntaxBNF-v9.0.0.3", "r")
    text = file.readlines()
    file.close()

    text = clean_up(text)
    
    optional_rules = []
    
    for line in text:
        if "|<null>" in line.replace(" ", ""):
            optional_rules.append(line.split(">")[0].split("<")[1])
    
    return optional_rules


def read_bnf_file(file_path):
    with open(file_path, "r") as file:
        lines = file.readlines()
    return lines


def write_antlr_file(antlr_lines):
    file = open("g4/TPTPv9.g4", "w")
    
    new_lines = []
    
    lexer_rules = r"""
grammar TPTPv9;
WS : [ \r\t\n]+ -> skip ;
    """

    for line in lexer_rules.split("\n"):
        if line != "":
            new_lines.append(line.strip())

    antlr_lines = new_lines + antlr_lines

    for line in antlr_lines:
        file.write(line + '\n')

    file.close()

  
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


def another_clean_up(raw_lines):
    symbols = {
        # "|": "Or",
        "&": "And",
        "<=>": "Iff",
        "=>": "Impl",
        "<=": "If",
        "<~>": "Niff",
        "~|": "Nor",
        "~&": "Nand",
        # "~": "Not",
        "!!": "ForallComb",
        "!>": "TyForall",
        "!=": "Infix_inequality",
        # "=": "Infix_equality",
        "!": "Forall",
        "??": "ExistsComb",
        "?*": "TyExists",
        "?": "Exists",
        "^": "Lambda",
        "@@+": "ChoiceComb",
        "@+": "Choice",
        "@@-": "DescriptionComb",
        "@-": "Description",
        "@=": "EqComb",
        "@": "App",
        # ":=": "Assignment",
        # "==": "Identical",
        "-->": "Gentzen_arrow",
        "<<": "Subtype_sign",
        # "*": "Star",
        # "+": "Plus",
        # ">": "Arrow",
        # "#": "Hash"
    }

    for index in range(len(raw_lines)):
        for key in symbols.keys():
            if key in raw_lines[index]:
                raw_lines[index] = raw_lines[index].replace(key, "<" + symbols[key] + ">")
                # print(raw_lines[index])
        
        index += 1
                
    return raw_lines

#comment is %
def convert_comment(line):
    return "//" + line


# semantic rule is :==
def convert_semantic_rule(line):
    return "// " + line


def remove_quotes(line):
    if "''" in line:
        return line.replace("''", "")
    else:
        return line




#~ CONVERT RULES


# grammar rule is ::=
def convert_grammar_rule(line, append_EOF=False):
    if append_EOF:
        return "tptp_file               : tptp_input* EOF;"
    elif line.startswith("<TPTP_input> "):
        return "tptp_input              : annotated_formula | include;"
    
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
    
            
    return before_line + " : " + remove_quotes(result_str) + ";"


# token rule is ::-
def convert_lexer_rule(line):
    line = line.replace("><", "> <")
    
    before_line = line.split("::-")[0].strip()
    before_line = before_line.replace(">", "")
    before_line = before_line.replace("<", "")
    
    after_line = line.split("::-")[1].strip()
    
    if after_line.count('[') == 1 and after_line.count(']') == 1:
        after_line = "'" + after_line.replace("[", "").replace("]", "") + "'"
        
        return before_line + " : " + remove_quotes(after_line) + ";"
        
    else:
        
        result_str = ""
        isInAlligator = False
        
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
        
                
        return before_line + " : " + remove_quotes(result_str) + ";"


# token rule is :::
def convert_character_classes(line):
    
    if line.startswith("<do_char>"):
        return r"do_char : '\\' ('" + '"' + r"' | '\\') ;"
    elif line.startswith("<sq_char>"):
        return r"sq_char : '\\' ('\'' | '\\');"
    elif line.startswith("<viewable_char>"):
        return r"viewable_char : '.\n';"
    elif line.startswith("<slosh_char>"):
        return r"slosh_char : '\\\\';"
    elif line.startswith("<single_quote>"):
        return r"single_quote : '\'';"
        
    line = line.replace("><", "> <")
    
    before_line = line.split(":::")[0].strip()
    before_line = before_line.replace(">", "")
    before_line = before_line.replace("<", "")
    
    after_line = line.split(":::")[1].strip()
    after_line = after_line.replace("<", " ")
    after_line = after_line.replace(">", " ")
    
    # result_str = ""
    # isInAlligator = False
    
    # index = 0
    # for char in after_line:
        
    #     if char == "<" and after_line[index + 1].isalpha():
    #         isInAlligator = True
            
    #     if char == ">" and not isInAlligator:
    #         result_str += "'>'"
            
    #     if char == ">" and after_line[index - 1].isalpha():
    #         isInAlligator = False
            
    #     if not isInAlligator and char != "|" and char != ">" and char != " ":
    #         result_str += "'" + char + "'"
            
    #     elif isInAlligator and char != "<":
    #         result_str += char
            
    #     elif char == "|":
    #         result_str += " | "
        
    #     elif char == " ":
    #         result_str += " "
            
    #     index += 1
    
    first_char = before_line[0].upper()
    before_line = first_char + before_line[1:]
    
    return before_line + " : " + after_line + ";"
    

def replace_capitals(lines):
    lexer_rules = []
    
    for line in lines:
        if line[0].isupper():
            lexer_rules.append(line.split(":")[0].strip().lower())
            
    pattern = r'\b(' + '|'.join(re.escape(word) for word in lexer_rules) + r')\b'
    
    def replace_func(match):
        return match.group(0).capitalize()
    
    return [re.sub(pattern, replace_func, line) for line in lines]


def main():
    bnf_lines = read_bnf_file("bnf/SyntaxBNF-v9.0.0.3")
    antlr_lines = []
    bnf_line = ""
    
    # run a clean up
    bnf_lines = clean_up(bnf_lines)
    # bnf_lines = another_clean_up(bnf_lines)
    grammar_count = 0
    
    for index in range(len(bnf_lines)):
        if bnf_lines[index].startswith("%"):
            bnf_line = convert_comment(bnf_lines[index])
        elif "::=" in bnf_lines[index]:
            if grammar_count == 0:
                bnf_line = convert_grammar_rule(bnf_lines[index], append_EOF=True)
            else:
                bnf_line = convert_grammar_rule(bnf_lines[index])
                
            grammar_count += 1
            
        elif "::-" in bnf_lines[index]:
            bnf_line = convert_lexer_rule(bnf_lines[index])
            # bnf_line = convert_comment(bnf_lines[index])
            
        elif  ":::" in bnf_lines[index]:
            # bnf_line = convert_lexer_rule(bnf_lines[index])
            # bnf_line = convert_comment(bnf_lines[index])
            bnf_line = convert_character_classes(bnf_lines[index])
            
        elif ":==" in bnf_lines[index]:
            bnf_line = convert_semantic_rule(bnf_lines[index])
            
        antlr_lines.append(bnf_line)
        
    antlr_lines = replace_capitals(antlr_lines)
    write_antlr_file(antlr_lines)
        
    
main()
