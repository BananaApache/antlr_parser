// Generated from /Users/daniel/Documents/coding_stuff/antlr_parser/g4/TPTP.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TPTPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, WS=59, Comment_line=60, 
		Comment_block=61, Single_quoted=62, Back_quoted=63, Distinct_object=64, 
		Dollar_word=65, Dollar_dollar_word=66, Upper_word=67, Lower_word=68, Real=69, 
		Signed_real=70, Unsigned_real=71, Decimal_exponent=72, Decimal_fraction=73, 
		Exp_integer=74, Signed_exp_integer=75, Rational=76, Signed_rational=77, 
		Unsigned_rational=78, Integer=79, Signed_integer=80, Unsigned_integer=81, 
		Positive_integer=82, Integer_digits=83, Slash=84, Slosh=85, Vline=86, 
		Star=87, Plus=88, Arrow=89, Less_sign=90, Hash=91, Not_star_slash=92, 
		Percentage_sign=93, Double_quote=94, Single_quote=95, Back_quote=96, Dot=97, 
		Slash_char=98, Slosh_char=99, Zero_numeric=100, Underscore=101, Alpha=102, 
		Dollar=103, Printable_char=104, Viewable_char=105;
	public static final int
		RULE_tptp_file = 0, RULE_tptp_input = 1, RULE_annotated_formula = 2, RULE_tpi_annotated = 3, 
		RULE_tpi_formula = 4, RULE_thf_annotated = 5, RULE_tff_annotated = 6, 
		RULE_tcf_annotated = 7, RULE_fof_annotated = 8, RULE_cnf_annotated = 9, 
		RULE_annotations = 10, RULE_formula_role = 11, RULE_thf_formula = 12, 
		RULE_thf_logic_formula = 13, RULE_thf_binary_formula = 14, RULE_thf_binary_nonassoc = 15, 
		RULE_thf_binary_assoc = 16, RULE_thf_or_formula = 17, RULE_thf_and_formula = 18, 
		RULE_thf_apply_formula = 19, RULE_thf_unit_formula = 20, RULE_thf_preunit_formula = 21, 
		RULE_thf_unitary_formula = 22, RULE_thf_quantified_formula = 23, RULE_thf_quantification = 24, 
		RULE_thf_variable_list = 25, RULE_thf_typed_variable = 26, RULE_thf_unary_formula = 27, 
		RULE_thf_prefix_unary = 28, RULE_thf_infix_unary = 29, RULE_thf_atomic_formula = 30, 
		RULE_thf_plain_atomic = 31, RULE_thf_defined_atomic = 32, RULE_thf_defined_term = 33, 
		RULE_thf_defined_infix = 34, RULE_thf_system_atomic = 35, RULE_thf_let = 36, 
		RULE_thf_let_types = 37, RULE_thf_atom_typing_list = 38, RULE_thf_let_defns = 39, 
		RULE_thf_let_defn = 40, RULE_thf_let_defn_list = 41, RULE_thf_unitary_term = 42, 
		RULE_thf_conn_term = 43, RULE_thf_tuple = 44, RULE_thf_fof_function = 45, 
		RULE_thf_arguments = 46, RULE_thf_formula_list = 47, RULE_comma_thf_logic_formula = 48, 
		RULE_thf_atom_typing = 49, RULE_thf_top_level_type = 50, RULE_thf_unitary_type = 51, 
		RULE_thf_apply_type = 52, RULE_thf_binary_type = 53, RULE_thf_mapping_type = 54, 
		RULE_thf_xprod_type = 55, RULE_thf_union_type = 56, RULE_thf_subtype = 57, 
		RULE_thf_definition = 58, RULE_thf_sequent = 59, RULE_tff_formula = 60, 
		RULE_tff_logic_formula = 61, RULE_tff_binary_formula = 62, RULE_tff_binary_nonassoc = 63, 
		RULE_tff_binary_assoc = 64, RULE_tff_or_formula = 65, RULE_tff_and_formula = 66, 
		RULE_tff_unit_formula = 67, RULE_tff_preunit_formula = 68, RULE_tff_unitary_formula = 69, 
		RULE_txf_unitary_formula = 70, RULE_tff_quantified_formula = 71, RULE_tff_variable_list = 72, 
		RULE_tff_variable = 73, RULE_tff_typed_variable = 74, RULE_tff_unary_formula = 75, 
		RULE_tff_prefix_unary = 76, RULE_tff_infix_unary = 77, RULE_tff_atomic_formula = 78, 
		RULE_tff_plain_atomic = 79, RULE_tff_defined_atomic = 80, RULE_tff_defined_plain = 81, 
		RULE_tff_defined_infix = 82, RULE_tff_system_atomic = 83, RULE_txf_let = 84, 
		RULE_txf_let_types = 85, RULE_tff_atom_typing_list = 86, RULE_txf_let_defns = 87, 
		RULE_txf_let_defn = 88, RULE_txf_let_LHS = 89, RULE_txf_let_defn_list = 90, 
		RULE_nxf_atom = 91, RULE_tff_term = 92, RULE_tff_unitary_term = 93, RULE_txf_tuple = 94, 
		RULE_tff_arguments = 95, RULE_comma_tff_term = 96, RULE_tff_atom_typing = 97, 
		RULE_tff_top_level_type = 98, RULE_tff_non_atomic_type = 99, RULE_tf1_quantified_type = 100, 
		RULE_tff_monotype = 101, RULE_tff_unitary_type = 102, RULE_tff_atomic_type = 103, 
		RULE_tff_type_arguments = 104, RULE_tff_mapping_type = 105, RULE_tff_xprod_type = 106, 
		RULE_txf_tuple_type = 107, RULE_tff_type_list = 108, RULE_tff_subtype = 109, 
		RULE_txf_definition = 110, RULE_txf_sequent = 111, RULE_nhf_long_connective = 112, 
		RULE_nhf_parameter_list = 113, RULE_nhf_parameter = 114, RULE_nhf_key_pair = 115, 
		RULE_nxf_long_connective = 116, RULE_nxf_parameter_list = 117, RULE_nxf_parameter = 118, 
		RULE_nxf_key_pair = 119, RULE_ntf_connective_name = 120, RULE_ntf_defined_connective = 121, 
		RULE_ntf_index = 122, RULE_ntf_short_connective = 123, RULE_tcf_formula = 124, 
		RULE_tcf_logic_formula = 125, RULE_tcf_quantified_formula = 126, RULE_fof_formula = 127, 
		RULE_fof_logic_formula = 128, RULE_fof_binary_formula = 129, RULE_fof_binary_nonassoc = 130, 
		RULE_fof_binary_assoc = 131, RULE_fof_or_formula = 132, RULE_fof_and_formula = 133, 
		RULE_fof_unary_formula = 134, RULE_fof_infix_unary = 135, RULE_fof_unit_formula = 136, 
		RULE_fof_unitary_formula = 137, RULE_fof_quantified_formula = 138, RULE_fof_variable_list = 139, 
		RULE_fof_atomic_formula = 140, RULE_fof_plain_atomic_formula = 141, RULE_fof_defined_atomic_formula = 142, 
		RULE_fof_defined_plain_formula = 143, RULE_fof_defined_infix_formula = 144, 
		RULE_fof_system_atomic_formula = 145, RULE_fof_plain_term = 146, RULE_fof_defined_term = 147, 
		RULE_fof_defined_atomic_term = 148, RULE_fof_defined_plain_term = 149, 
		RULE_fof_system_term = 150, RULE_fof_arguments = 151, RULE_fof_term = 152, 
		RULE_fof_function_term = 153, RULE_fof_sequent = 154, RULE_fof_formula_tuple = 155, 
		RULE_fof_formula_tuple_list = 156, RULE_comma_fof_logic_formula = 157, 
		RULE_cnf_formula = 158, RULE_cnf_disjunction = 159, RULE_cnf_literal = 160, 
		RULE_thf_quantifier = 161, RULE_thf_unary_connective = 162, RULE_th0_quantifier = 163, 
		RULE_type_quantifier = 164, RULE_subtype_sign = 165, RULE_tff_unary_connective = 166, 
		RULE_tff_quantifier = 167, RULE_fof_quantifier = 168, RULE_nonassoc_connective = 169, 
		RULE_assoc_connective = 170, RULE_unary_connective = 171, RULE_gentzen_arrow = 172, 
		RULE_assignment = 173, RULE_identical = 174, RULE_typeable_atom = 175, 
		RULE_atomic_type = 176, RULE_type_constant = 177, RULE_type_functor = 178, 
		RULE_defined_type = 179, RULE_system_type = 180, RULE_defined_infix_pred = 181, 
		RULE_infix_equality = 182, RULE_infix_inequality = 183, RULE_constant = 184, 
		RULE_functor = 185, RULE_defined_constant = 186, RULE_defined_functor = 187, 
		RULE_system_constant = 188, RULE_system_functor = 189, RULE_th1_defined_term = 190, 
		RULE_defined_term = 191, RULE_variable = 192, RULE_source = 193, RULE_sources = 194, 
		RULE_dag_source = 195, RULE_inference_record = 196, RULE_inference_rule = 197, 
		RULE_internal_source = 198, RULE_intro_type = 199, RULE_external_source = 200, 
		RULE_file_source = 201, RULE_file_info = 202, RULE_parents = 203, RULE_parent_list = 204, 
		RULE_comma_parent_info = 205, RULE_parent_info = 206, RULE_parent_details = 207, 
		RULE_optional_info = 208, RULE_useful_info = 209, RULE_include = 210, 
		RULE_include_optionals = 211, RULE_formula_selection = 212, RULE_name_list = 213, 
		RULE_space_name = 214, RULE_general_term = 215, RULE_general_data = 216, 
		RULE_general_function = 217, RULE_formula_data = 218, RULE_general_list = 219, 
		RULE_general_terms = 220, RULE_comma_general_term = 221, RULE_name = 222, 
		RULE_atomic_word = 223, RULE_atomic_defined_word = 224, RULE_atomic_system_word = 225, 
		RULE_number = 226, RULE_file_name = 227, RULE_nothing = 228;
	private static String[] makeRuleNames() {
		return new String[] {
			"tptp_file", "tptp_input", "annotated_formula", "tpi_annotated", "tpi_formula", 
			"thf_annotated", "tff_annotated", "tcf_annotated", "fof_annotated", "cnf_annotated", 
			"annotations", "formula_role", "thf_formula", "thf_logic_formula", "thf_binary_formula", 
			"thf_binary_nonassoc", "thf_binary_assoc", "thf_or_formula", "thf_and_formula", 
			"thf_apply_formula", "thf_unit_formula", "thf_preunit_formula", "thf_unitary_formula", 
			"thf_quantified_formula", "thf_quantification", "thf_variable_list", 
			"thf_typed_variable", "thf_unary_formula", "thf_prefix_unary", "thf_infix_unary", 
			"thf_atomic_formula", "thf_plain_atomic", "thf_defined_atomic", "thf_defined_term", 
			"thf_defined_infix", "thf_system_atomic", "thf_let", "thf_let_types", 
			"thf_atom_typing_list", "thf_let_defns", "thf_let_defn", "thf_let_defn_list", 
			"thf_unitary_term", "thf_conn_term", "thf_tuple", "thf_fof_function", 
			"thf_arguments", "thf_formula_list", "comma_thf_logic_formula", "thf_atom_typing", 
			"thf_top_level_type", "thf_unitary_type", "thf_apply_type", "thf_binary_type", 
			"thf_mapping_type", "thf_xprod_type", "thf_union_type", "thf_subtype", 
			"thf_definition", "thf_sequent", "tff_formula", "tff_logic_formula", 
			"tff_binary_formula", "tff_binary_nonassoc", "tff_binary_assoc", "tff_or_formula", 
			"tff_and_formula", "tff_unit_formula", "tff_preunit_formula", "tff_unitary_formula", 
			"txf_unitary_formula", "tff_quantified_formula", "tff_variable_list", 
			"tff_variable", "tff_typed_variable", "tff_unary_formula", "tff_prefix_unary", 
			"tff_infix_unary", "tff_atomic_formula", "tff_plain_atomic", "tff_defined_atomic", 
			"tff_defined_plain", "tff_defined_infix", "tff_system_atomic", "txf_let", 
			"txf_let_types", "tff_atom_typing_list", "txf_let_defns", "txf_let_defn", 
			"txf_let_LHS", "txf_let_defn_list", "nxf_atom", "tff_term", "tff_unitary_term", 
			"txf_tuple", "tff_arguments", "comma_tff_term", "tff_atom_typing", "tff_top_level_type", 
			"tff_non_atomic_type", "tf1_quantified_type", "tff_monotype", "tff_unitary_type", 
			"tff_atomic_type", "tff_type_arguments", "tff_mapping_type", "tff_xprod_type", 
			"txf_tuple_type", "tff_type_list", "tff_subtype", "txf_definition", "txf_sequent", 
			"nhf_long_connective", "nhf_parameter_list", "nhf_parameter", "nhf_key_pair", 
			"nxf_long_connective", "nxf_parameter_list", "nxf_parameter", "nxf_key_pair", 
			"ntf_connective_name", "ntf_defined_connective", "ntf_index", "ntf_short_connective", 
			"tcf_formula", "tcf_logic_formula", "tcf_quantified_formula", "fof_formula", 
			"fof_logic_formula", "fof_binary_formula", "fof_binary_nonassoc", "fof_binary_assoc", 
			"fof_or_formula", "fof_and_formula", "fof_unary_formula", "fof_infix_unary", 
			"fof_unit_formula", "fof_unitary_formula", "fof_quantified_formula", 
			"fof_variable_list", "fof_atomic_formula", "fof_plain_atomic_formula", 
			"fof_defined_atomic_formula", "fof_defined_plain_formula", "fof_defined_infix_formula", 
			"fof_system_atomic_formula", "fof_plain_term", "fof_defined_term", "fof_defined_atomic_term", 
			"fof_defined_plain_term", "fof_system_term", "fof_arguments", "fof_term", 
			"fof_function_term", "fof_sequent", "fof_formula_tuple", "fof_formula_tuple_list", 
			"comma_fof_logic_formula", "cnf_formula", "cnf_disjunction", "cnf_literal", 
			"thf_quantifier", "thf_unary_connective", "th0_quantifier", "type_quantifier", 
			"subtype_sign", "tff_unary_connective", "tff_quantifier", "fof_quantifier", 
			"nonassoc_connective", "assoc_connective", "unary_connective", "gentzen_arrow", 
			"assignment", "identical", "typeable_atom", "atomic_type", "type_constant", 
			"type_functor", "defined_type", "system_type", "defined_infix_pred", 
			"infix_equality", "infix_inequality", "constant", "functor", "defined_constant", 
			"defined_functor", "system_constant", "system_functor", "th1_defined_term", 
			"defined_term", "variable", "source", "sources", "dag_source", "inference_record", 
			"inference_rule", "internal_source", "intro_type", "external_source", 
			"file_source", "file_info", "parents", "parent_list", "comma_parent_info", 
			"parent_info", "parent_details", "optional_info", "useful_info", "include", 
			"include_optionals", "formula_selection", "name_list", "space_name", 
			"general_term", "general_data", "general_function", "formula_data", "general_list", 
			"general_terms", "comma_general_term", "name", "atomic_word", "atomic_defined_word", 
			"atomic_system_word", "number", "file_name", "nothing"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'tpi('", "','", "').'", "'thf('", "'tff('", "'tcf('", "'fof('", 
			"'cnf('", "'-'", "'&'", "'@'", "'('", "')'", "'['", "']'", "':'", "'$let('", 
			"'[]'", "'{'", "'}'", "')}'", "'[.]'", "'.'", "'{.}'", "'(.)'", "'!'", 
			"'~'", "'^'", "'@+'", "'@-'", "'!>'", "'?'", "'<<'", "'<=>'", "'=>'", 
			"'<='", "'<~>'", "'~&'", "'-->'", "':='", "'=='", "'='", "'!='", "'!!'", 
			"'??'", "'@@+'", "'@@-'", "'@='", "'unknown'", "'inference('", "'introduced('", 
			"'file('", "'include('", "'$thf('", "'$tff('", "'$fof('", "'$cnf('", 
			"'$fot('", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'+'", "'>'", "'<'", "'#'", 
			null, null, null, "'''", null, null, null, "'\\\\'", null, null, null, 
			null, null, "'.\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "WS", 
			"Comment_line", "Comment_block", "Single_quoted", "Back_quoted", "Distinct_object", 
			"Dollar_word", "Dollar_dollar_word", "Upper_word", "Lower_word", "Real", 
			"Signed_real", "Unsigned_real", "Decimal_exponent", "Decimal_fraction", 
			"Exp_integer", "Signed_exp_integer", "Rational", "Signed_rational", "Unsigned_rational", 
			"Integer", "Signed_integer", "Unsigned_integer", "Positive_integer", 
			"Integer_digits", "Slash", "Slosh", "Vline", "Star", "Plus", "Arrow", 
			"Less_sign", "Hash", "Not_star_slash", "Percentage_sign", "Double_quote", 
			"Single_quote", "Back_quote", "Dot", "Slash_char", "Slosh_char", "Zero_numeric", 
			"Underscore", "Alpha", "Dollar", "Printable_char", "Viewable_char"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TPTP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TPTPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tptp_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TPTPParser.EOF, 0); }
		public List<Tptp_inputContext> tptp_input() {
			return getRuleContexts(Tptp_inputContext.class);
		}
		public Tptp_inputContext tptp_input(int i) {
			return getRuleContext(Tptp_inputContext.class,i);
		}
		public Tptp_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tptp_file; }
	}

	public final Tptp_fileContext tptp_file() throws RecognitionException {
		Tptp_fileContext _localctx = new Tptp_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tptp_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007199254741490L) != 0)) {
				{
				{
				setState(458);
				tptp_input();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tptp_inputContext extends ParserRuleContext {
		public Annotated_formulaContext annotated_formula() {
			return getRuleContext(Annotated_formulaContext.class,0);
		}
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public Tptp_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tptp_input; }
	}

	public final Tptp_inputContext tptp_input() throws RecognitionException {
		Tptp_inputContext _localctx = new Tptp_inputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tptp_input);
		try {
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				annotated_formula();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				include();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Annotated_formulaContext extends ParserRuleContext {
		public Thf_annotatedContext thf_annotated() {
			return getRuleContext(Thf_annotatedContext.class,0);
		}
		public Tff_annotatedContext tff_annotated() {
			return getRuleContext(Tff_annotatedContext.class,0);
		}
		public Tcf_annotatedContext tcf_annotated() {
			return getRuleContext(Tcf_annotatedContext.class,0);
		}
		public Fof_annotatedContext fof_annotated() {
			return getRuleContext(Fof_annotatedContext.class,0);
		}
		public Cnf_annotatedContext cnf_annotated() {
			return getRuleContext(Cnf_annotatedContext.class,0);
		}
		public Tpi_annotatedContext tpi_annotated() {
			return getRuleContext(Tpi_annotatedContext.class,0);
		}
		public Annotated_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotated_formula; }
	}

	public final Annotated_formulaContext annotated_formula() throws RecognitionException {
		Annotated_formulaContext _localctx = new Annotated_formulaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_annotated_formula);
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				thf_annotated();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				tff_annotated();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				tcf_annotated();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				fof_annotated();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(474);
				cnf_annotated();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(475);
				tpi_annotated();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tpi_annotatedContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Formula_roleContext formula_role() {
			return getRuleContext(Formula_roleContext.class,0);
		}
		public Tpi_formulaContext tpi_formula() {
			return getRuleContext(Tpi_formulaContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public Tpi_annotatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tpi_annotated; }
	}

	public final Tpi_annotatedContext tpi_annotated() throws RecognitionException {
		Tpi_annotatedContext _localctx = new Tpi_annotatedContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tpi_annotated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(T__0);
			setState(479);
			name();
			setState(480);
			match(T__1);
			setState(481);
			formula_role();
			setState(482);
			match(T__1);
			setState(483);
			tpi_formula();
			setState(484);
			annotations();
			setState(485);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tpi_formulaContext extends ParserRuleContext {
		public Fof_formulaContext fof_formula() {
			return getRuleContext(Fof_formulaContext.class,0);
		}
		public Tpi_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tpi_formula; }
	}

	public final Tpi_formulaContext tpi_formula() throws RecognitionException {
		Tpi_formulaContext _localctx = new Tpi_formulaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tpi_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			fof_formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_annotatedContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Formula_roleContext formula_role() {
			return getRuleContext(Formula_roleContext.class,0);
		}
		public Thf_formulaContext thf_formula() {
			return getRuleContext(Thf_formulaContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public Thf_annotatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_annotated; }
	}

	public final Thf_annotatedContext thf_annotated() throws RecognitionException {
		Thf_annotatedContext _localctx = new Thf_annotatedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_thf_annotated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(T__3);
			setState(490);
			name();
			setState(491);
			match(T__1);
			setState(492);
			formula_role();
			setState(493);
			match(T__1);
			setState(494);
			thf_formula();
			setState(495);
			annotations();
			setState(496);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_annotatedContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Formula_roleContext formula_role() {
			return getRuleContext(Formula_roleContext.class,0);
		}
		public Tff_formulaContext tff_formula() {
			return getRuleContext(Tff_formulaContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public Tff_annotatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_annotated; }
	}

	public final Tff_annotatedContext tff_annotated() throws RecognitionException {
		Tff_annotatedContext _localctx = new Tff_annotatedContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tff_annotated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(T__4);
			setState(499);
			name();
			setState(500);
			match(T__1);
			setState(501);
			formula_role();
			setState(502);
			match(T__1);
			setState(503);
			tff_formula();
			setState(504);
			annotations();
			setState(505);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tcf_annotatedContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Formula_roleContext formula_role() {
			return getRuleContext(Formula_roleContext.class,0);
		}
		public Tcf_formulaContext tcf_formula() {
			return getRuleContext(Tcf_formulaContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public Tcf_annotatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tcf_annotated; }
	}

	public final Tcf_annotatedContext tcf_annotated() throws RecognitionException {
		Tcf_annotatedContext _localctx = new Tcf_annotatedContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tcf_annotated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(T__5);
			setState(508);
			name();
			setState(509);
			match(T__1);
			setState(510);
			formula_role();
			setState(511);
			match(T__1);
			setState(512);
			tcf_formula();
			setState(513);
			annotations();
			setState(514);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_annotatedContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Formula_roleContext formula_role() {
			return getRuleContext(Formula_roleContext.class,0);
		}
		public Fof_formulaContext fof_formula() {
			return getRuleContext(Fof_formulaContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public Fof_annotatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_annotated; }
	}

	public final Fof_annotatedContext fof_annotated() throws RecognitionException {
		Fof_annotatedContext _localctx = new Fof_annotatedContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fof_annotated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(T__6);
			setState(517);
			name();
			setState(518);
			match(T__1);
			setState(519);
			formula_role();
			setState(520);
			match(T__1);
			setState(521);
			fof_formula();
			setState(522);
			annotations();
			setState(523);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cnf_annotatedContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Formula_roleContext formula_role() {
			return getRuleContext(Formula_roleContext.class,0);
		}
		public Cnf_formulaContext cnf_formula() {
			return getRuleContext(Cnf_formulaContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public Cnf_annotatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnf_annotated; }
	}

	public final Cnf_annotatedContext cnf_annotated() throws RecognitionException {
		Cnf_annotatedContext _localctx = new Cnf_annotatedContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cnf_annotated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(T__7);
			setState(526);
			name();
			setState(527);
			match(T__1);
			setState(528);
			formula_role();
			setState(529);
			match(T__1);
			setState(530);
			cnf_formula();
			setState(531);
			annotations();
			setState(532);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationsContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public Optional_infoContext optional_info() {
			return getRuleContext(Optional_infoContext.class,0);
		}
		public NothingContext nothing() {
			return getRuleContext(NothingContext.class,0);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_annotations);
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(T__1);
				setState(535);
				source();
				setState(536);
				optional_info();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				nothing();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formula_roleContext extends ParserRuleContext {
		public TerminalNode Lower_word() { return getToken(TPTPParser.Lower_word, 0); }
		public General_termContext general_term() {
			return getRuleContext(General_termContext.class,0);
		}
		public Formula_roleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula_role; }
	}

	public final Formula_roleContext formula_role() throws RecognitionException {
		Formula_roleContext _localctx = new Formula_roleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formula_role);
		try {
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(Lower_word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(Lower_word);
				setState(543);
				match(T__8);
				setState(544);
				general_term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_formulaContext extends ParserRuleContext {
		public Thf_logic_formulaContext thf_logic_formula() {
			return getRuleContext(Thf_logic_formulaContext.class,0);
		}
		public Thf_atom_typingContext thf_atom_typing() {
			return getRuleContext(Thf_atom_typingContext.class,0);
		}
		public Thf_subtypeContext thf_subtype() {
			return getRuleContext(Thf_subtypeContext.class,0);
		}
		public Thf_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_formula; }
	}

	public final Thf_formulaContext thf_formula() throws RecognitionException {
		Thf_formulaContext _localctx = new Thf_formulaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_thf_formula);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				thf_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				thf_atom_typing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				thf_subtype();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_logic_formulaContext extends ParserRuleContext {
		public Thf_unitary_formulaContext thf_unitary_formula() {
			return getRuleContext(Thf_unitary_formulaContext.class,0);
		}
		public Thf_unary_formulaContext thf_unary_formula() {
			return getRuleContext(Thf_unary_formulaContext.class,0);
		}
		public Thf_binary_formulaContext thf_binary_formula() {
			return getRuleContext(Thf_binary_formulaContext.class,0);
		}
		public Thf_defined_infixContext thf_defined_infix() {
			return getRuleContext(Thf_defined_infixContext.class,0);
		}
		public Thf_definitionContext thf_definition() {
			return getRuleContext(Thf_definitionContext.class,0);
		}
		public Thf_sequentContext thf_sequent() {
			return getRuleContext(Thf_sequentContext.class,0);
		}
		public Thf_logic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_logic_formula; }
	}

	public final Thf_logic_formulaContext thf_logic_formula() throws RecognitionException {
		Thf_logic_formulaContext _localctx = new Thf_logic_formulaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_thf_logic_formula);
		try {
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				thf_unitary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				thf_unary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
				thf_binary_formula();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(555);
				thf_defined_infix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(556);
				thf_definition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(557);
				thf_sequent();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_binary_formulaContext extends ParserRuleContext {
		public Thf_binary_nonassocContext thf_binary_nonassoc() {
			return getRuleContext(Thf_binary_nonassocContext.class,0);
		}
		public Thf_binary_assocContext thf_binary_assoc() {
			return getRuleContext(Thf_binary_assocContext.class,0);
		}
		public Thf_binary_typeContext thf_binary_type() {
			return getRuleContext(Thf_binary_typeContext.class,0);
		}
		public Thf_binary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_binary_formula; }
	}

	public final Thf_binary_formulaContext thf_binary_formula() throws RecognitionException {
		Thf_binary_formulaContext _localctx = new Thf_binary_formulaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_thf_binary_formula);
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				thf_binary_nonassoc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				thf_binary_assoc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(562);
				thf_binary_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_binary_nonassocContext extends ParserRuleContext {
		public List<Thf_unit_formulaContext> thf_unit_formula() {
			return getRuleContexts(Thf_unit_formulaContext.class);
		}
		public Thf_unit_formulaContext thf_unit_formula(int i) {
			return getRuleContext(Thf_unit_formulaContext.class,i);
		}
		public Nonassoc_connectiveContext nonassoc_connective() {
			return getRuleContext(Nonassoc_connectiveContext.class,0);
		}
		public Thf_binary_nonassocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_binary_nonassoc; }
	}

	public final Thf_binary_nonassocContext thf_binary_nonassoc() throws RecognitionException {
		Thf_binary_nonassocContext _localctx = new Thf_binary_nonassocContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_thf_binary_nonassoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			thf_unit_formula();
			setState(566);
			nonassoc_connective();
			setState(567);
			thf_unit_formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_binary_assocContext extends ParserRuleContext {
		public Thf_or_formulaContext thf_or_formula() {
			return getRuleContext(Thf_or_formulaContext.class,0);
		}
		public Thf_and_formulaContext thf_and_formula() {
			return getRuleContext(Thf_and_formulaContext.class,0);
		}
		public Thf_apply_formulaContext thf_apply_formula() {
			return getRuleContext(Thf_apply_formulaContext.class,0);
		}
		public Thf_binary_assocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_binary_assoc; }
	}

	public final Thf_binary_assocContext thf_binary_assoc() throws RecognitionException {
		Thf_binary_assocContext _localctx = new Thf_binary_assocContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_thf_binary_assoc);
		try {
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				thf_or_formula(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				thf_and_formula(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				thf_apply_formula(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_or_formulaContext extends ParserRuleContext {
		public List<Thf_unit_formulaContext> thf_unit_formula() {
			return getRuleContexts(Thf_unit_formulaContext.class);
		}
		public Thf_unit_formulaContext thf_unit_formula(int i) {
			return getRuleContext(Thf_unit_formulaContext.class,i);
		}
		public TerminalNode Vline() { return getToken(TPTPParser.Vline, 0); }
		public Thf_or_formulaContext thf_or_formula() {
			return getRuleContext(Thf_or_formulaContext.class,0);
		}
		public Thf_or_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_or_formula; }
	}

	public final Thf_or_formulaContext thf_or_formula() throws RecognitionException {
		return thf_or_formula(0);
	}

	private Thf_or_formulaContext thf_or_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Thf_or_formulaContext _localctx = new Thf_or_formulaContext(_ctx, _parentState);
		Thf_or_formulaContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_thf_or_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(575);
			thf_unit_formula();
			setState(576);
			match(Vline);
			setState(577);
			thf_unit_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Thf_or_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_thf_or_formula);
					setState(579);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(580);
					match(Vline);
					setState(581);
					thf_unit_formula();
					}
					} 
				}
				setState(586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_and_formulaContext extends ParserRuleContext {
		public List<Thf_unit_formulaContext> thf_unit_formula() {
			return getRuleContexts(Thf_unit_formulaContext.class);
		}
		public Thf_unit_formulaContext thf_unit_formula(int i) {
			return getRuleContext(Thf_unit_formulaContext.class,i);
		}
		public Thf_and_formulaContext thf_and_formula() {
			return getRuleContext(Thf_and_formulaContext.class,0);
		}
		public Thf_and_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_and_formula; }
	}

	public final Thf_and_formulaContext thf_and_formula() throws RecognitionException {
		return thf_and_formula(0);
	}

	private Thf_and_formulaContext thf_and_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Thf_and_formulaContext _localctx = new Thf_and_formulaContext(_ctx, _parentState);
		Thf_and_formulaContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_thf_and_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(588);
			thf_unit_formula();
			setState(589);
			match(T__9);
			setState(590);
			thf_unit_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Thf_and_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_thf_and_formula);
					setState(592);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(593);
					match(T__9);
					setState(594);
					thf_unit_formula();
					}
					} 
				}
				setState(599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_apply_formulaContext extends ParserRuleContext {
		public List<Thf_unit_formulaContext> thf_unit_formula() {
			return getRuleContexts(Thf_unit_formulaContext.class);
		}
		public Thf_unit_formulaContext thf_unit_formula(int i) {
			return getRuleContext(Thf_unit_formulaContext.class,i);
		}
		public Thf_apply_formulaContext thf_apply_formula() {
			return getRuleContext(Thf_apply_formulaContext.class,0);
		}
		public Thf_apply_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_apply_formula; }
	}

	public final Thf_apply_formulaContext thf_apply_formula() throws RecognitionException {
		return thf_apply_formula(0);
	}

	private Thf_apply_formulaContext thf_apply_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Thf_apply_formulaContext _localctx = new Thf_apply_formulaContext(_ctx, _parentState);
		Thf_apply_formulaContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_thf_apply_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(601);
			thf_unit_formula();
			setState(602);
			match(T__10);
			setState(603);
			thf_unit_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Thf_apply_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_thf_apply_formula);
					setState(605);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(606);
					match(T__10);
					setState(607);
					thf_unit_formula();
					}
					} 
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_unit_formulaContext extends ParserRuleContext {
		public Thf_unitary_formulaContext thf_unitary_formula() {
			return getRuleContext(Thf_unitary_formulaContext.class,0);
		}
		public Thf_unary_formulaContext thf_unary_formula() {
			return getRuleContext(Thf_unary_formulaContext.class,0);
		}
		public Thf_defined_infixContext thf_defined_infix() {
			return getRuleContext(Thf_defined_infixContext.class,0);
		}
		public Thf_unit_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_unit_formula; }
	}

	public final Thf_unit_formulaContext thf_unit_formula() throws RecognitionException {
		Thf_unit_formulaContext _localctx = new Thf_unit_formulaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_thf_unit_formula);
		try {
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				thf_unitary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				thf_unary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(615);
				thf_defined_infix();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_preunit_formulaContext extends ParserRuleContext {
		public Thf_unitary_formulaContext thf_unitary_formula() {
			return getRuleContext(Thf_unitary_formulaContext.class,0);
		}
		public Thf_prefix_unaryContext thf_prefix_unary() {
			return getRuleContext(Thf_prefix_unaryContext.class,0);
		}
		public Thf_preunit_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_preunit_formula; }
	}

	public final Thf_preunit_formulaContext thf_preunit_formula() throws RecognitionException {
		Thf_preunit_formulaContext _localctx = new Thf_preunit_formulaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_thf_preunit_formula);
		try {
			setState(620);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__13:
			case T__16:
			case T__17:
			case T__18:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case Single_quoted:
			case Back_quoted:
			case Distinct_object:
			case Dollar_word:
			case Dollar_dollar_word:
			case Upper_word:
			case Lower_word:
			case Real:
			case Rational:
			case Integer:
			case Hash:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				thf_unitary_formula();
				}
				break;
			case T__21:
			case T__23:
			case T__24:
			case T__26:
			case Less_sign:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				thf_prefix_unary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_unitary_formulaContext extends ParserRuleContext {
		public Thf_quantified_formulaContext thf_quantified_formula() {
			return getRuleContext(Thf_quantified_formulaContext.class,0);
		}
		public Thf_atomic_formulaContext thf_atomic_formula() {
			return getRuleContext(Thf_atomic_formulaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Thf_logic_formulaContext thf_logic_formula() {
			return getRuleContext(Thf_logic_formulaContext.class,0);
		}
		public Thf_unitary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_unitary_formula; }
	}

	public final Thf_unitary_formulaContext thf_unitary_formula() throws RecognitionException {
		Thf_unitary_formulaContext _localctx = new Thf_unitary_formulaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_thf_unitary_formula);
		try {
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				thf_quantified_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				thf_atomic_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(625);
				match(T__11);
				setState(626);
				thf_logic_formula();
				setState(627);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_quantified_formulaContext extends ParserRuleContext {
		public Thf_quantificationContext thf_quantification() {
			return getRuleContext(Thf_quantificationContext.class,0);
		}
		public Thf_unit_formulaContext thf_unit_formula() {
			return getRuleContext(Thf_unit_formulaContext.class,0);
		}
		public Thf_quantified_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_quantified_formula; }
	}

	public final Thf_quantified_formulaContext thf_quantified_formula() throws RecognitionException {
		Thf_quantified_formulaContext _localctx = new Thf_quantified_formulaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_thf_quantified_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			thf_quantification();
			setState(632);
			thf_unit_formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_quantificationContext extends ParserRuleContext {
		public Thf_quantifierContext thf_quantifier() {
			return getRuleContext(Thf_quantifierContext.class,0);
		}
		public Thf_variable_listContext thf_variable_list() {
			return getRuleContext(Thf_variable_listContext.class,0);
		}
		public Thf_quantificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_quantification; }
	}

	public final Thf_quantificationContext thf_quantification() throws RecognitionException {
		Thf_quantificationContext _localctx = new Thf_quantificationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_thf_quantification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			thf_quantifier();
			setState(635);
			match(T__13);
			setState(636);
			thf_variable_list();
			setState(637);
			match(T__14);
			setState(638);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_variable_listContext extends ParserRuleContext {
		public Thf_typed_variableContext thf_typed_variable() {
			return getRuleContext(Thf_typed_variableContext.class,0);
		}
		public Thf_variable_listContext thf_variable_list() {
			return getRuleContext(Thf_variable_listContext.class,0);
		}
		public Thf_variable_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_variable_list; }
	}

	public final Thf_variable_listContext thf_variable_list() throws RecognitionException {
		Thf_variable_listContext _localctx = new Thf_variable_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_thf_variable_list);
		try {
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				thf_typed_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				thf_typed_variable();
				setState(642);
				match(T__1);
				setState(643);
				thf_variable_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_typed_variableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Thf_top_level_typeContext thf_top_level_type() {
			return getRuleContext(Thf_top_level_typeContext.class,0);
		}
		public Thf_typed_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_typed_variable; }
	}

	public final Thf_typed_variableContext thf_typed_variable() throws RecognitionException {
		Thf_typed_variableContext _localctx = new Thf_typed_variableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_thf_typed_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			variable();
			setState(648);
			match(T__15);
			setState(649);
			thf_top_level_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_unary_formulaContext extends ParserRuleContext {
		public Thf_prefix_unaryContext thf_prefix_unary() {
			return getRuleContext(Thf_prefix_unaryContext.class,0);
		}
		public Thf_infix_unaryContext thf_infix_unary() {
			return getRuleContext(Thf_infix_unaryContext.class,0);
		}
		public Thf_unary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_unary_formula; }
	}

	public final Thf_unary_formulaContext thf_unary_formula() throws RecognitionException {
		Thf_unary_formulaContext _localctx = new Thf_unary_formulaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_thf_unary_formula);
		try {
			setState(653);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__23:
			case T__24:
			case T__26:
			case Less_sign:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				thf_prefix_unary();
				}
				break;
			case T__11:
			case T__13:
			case T__16:
			case T__17:
			case T__18:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case Single_quoted:
			case Back_quoted:
			case Distinct_object:
			case Dollar_word:
			case Dollar_dollar_word:
			case Upper_word:
			case Lower_word:
			case Real:
			case Rational:
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				thf_infix_unary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_prefix_unaryContext extends ParserRuleContext {
		public Thf_unary_connectiveContext thf_unary_connective() {
			return getRuleContext(Thf_unary_connectiveContext.class,0);
		}
		public Thf_preunit_formulaContext thf_preunit_formula() {
			return getRuleContext(Thf_preunit_formulaContext.class,0);
		}
		public Thf_prefix_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_prefix_unary; }
	}

	public final Thf_prefix_unaryContext thf_prefix_unary() throws RecognitionException {
		Thf_prefix_unaryContext _localctx = new Thf_prefix_unaryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_thf_prefix_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			thf_unary_connective();
			setState(656);
			thf_preunit_formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_infix_unaryContext extends ParserRuleContext {
		public List<Thf_unitary_termContext> thf_unitary_term() {
			return getRuleContexts(Thf_unitary_termContext.class);
		}
		public Thf_unitary_termContext thf_unitary_term(int i) {
			return getRuleContext(Thf_unitary_termContext.class,i);
		}
		public Infix_inequalityContext infix_inequality() {
			return getRuleContext(Infix_inequalityContext.class,0);
		}
		public Thf_infix_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_infix_unary; }
	}

	public final Thf_infix_unaryContext thf_infix_unary() throws RecognitionException {
		Thf_infix_unaryContext _localctx = new Thf_infix_unaryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_thf_infix_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			thf_unitary_term();
			setState(659);
			infix_inequality();
			setState(660);
			thf_unitary_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_atomic_formulaContext extends ParserRuleContext {
		public Thf_plain_atomicContext thf_plain_atomic() {
			return getRuleContext(Thf_plain_atomicContext.class,0);
		}
		public Thf_defined_atomicContext thf_defined_atomic() {
			return getRuleContext(Thf_defined_atomicContext.class,0);
		}
		public Thf_system_atomicContext thf_system_atomic() {
			return getRuleContext(Thf_system_atomicContext.class,0);
		}
		public Thf_fof_functionContext thf_fof_function() {
			return getRuleContext(Thf_fof_functionContext.class,0);
		}
		public Thf_atomic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_atomic_formula; }
	}

	public final Thf_atomic_formulaContext thf_atomic_formula() throws RecognitionException {
		Thf_atomic_formulaContext _localctx = new Thf_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_thf_atomic_formula);
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				thf_plain_atomic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				thf_defined_atomic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				thf_system_atomic();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
				thf_fof_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_plain_atomicContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Thf_tupleContext thf_tuple() {
			return getRuleContext(Thf_tupleContext.class,0);
		}
		public Thf_plain_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_plain_atomic; }
	}

	public final Thf_plain_atomicContext thf_plain_atomic() throws RecognitionException {
		Thf_plain_atomicContext _localctx = new Thf_plain_atomicContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_thf_plain_atomic);
		try {
			setState(670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Single_quoted:
			case Back_quoted:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				constant();
				}
				break;
			case T__13:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				thf_tuple();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_defined_atomicContext extends ParserRuleContext {
		public Defined_constantContext defined_constant() {
			return getRuleContext(Defined_constantContext.class,0);
		}
		public Thf_defined_termContext thf_defined_term() {
			return getRuleContext(Thf_defined_termContext.class,0);
		}
		public Thf_conn_termContext thf_conn_term() {
			return getRuleContext(Thf_conn_termContext.class,0);
		}
		public Nhf_long_connectiveContext nhf_long_connective() {
			return getRuleContext(Nhf_long_connectiveContext.class,0);
		}
		public Thf_letContext thf_let() {
			return getRuleContext(Thf_letContext.class,0);
		}
		public Thf_defined_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_defined_atomic; }
	}

	public final Thf_defined_atomicContext thf_defined_atomic() throws RecognitionException {
		Thf_defined_atomicContext _localctx = new Thf_defined_atomicContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_thf_defined_atomic);
		try {
			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				defined_constant();
				}
				break;
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case Distinct_object:
			case Real:
			case Rational:
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				thf_defined_term();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(674);
				match(T__11);
				setState(675);
				thf_conn_term();
				setState(676);
				match(T__12);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(678);
				nhf_long_connective();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(679);
				thf_let();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_defined_termContext extends ParserRuleContext {
		public Defined_termContext defined_term() {
			return getRuleContext(Defined_termContext.class,0);
		}
		public Th1_defined_termContext th1_defined_term() {
			return getRuleContext(Th1_defined_termContext.class,0);
		}
		public Thf_defined_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_defined_term; }
	}

	public final Thf_defined_termContext thf_defined_term() throws RecognitionException {
		Thf_defined_termContext _localctx = new Thf_defined_termContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_thf_defined_term);
		try {
			setState(684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Distinct_object:
			case Real:
			case Rational:
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				defined_term();
				}
				break;
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				th1_defined_term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_defined_infixContext extends ParserRuleContext {
		public List<Thf_unitary_termContext> thf_unitary_term() {
			return getRuleContexts(Thf_unitary_termContext.class);
		}
		public Thf_unitary_termContext thf_unitary_term(int i) {
			return getRuleContext(Thf_unitary_termContext.class,i);
		}
		public Defined_infix_predContext defined_infix_pred() {
			return getRuleContext(Defined_infix_predContext.class,0);
		}
		public Thf_defined_infixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_defined_infix; }
	}

	public final Thf_defined_infixContext thf_defined_infix() throws RecognitionException {
		Thf_defined_infixContext _localctx = new Thf_defined_infixContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_thf_defined_infix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			thf_unitary_term();
			setState(687);
			defined_infix_pred();
			setState(688);
			thf_unitary_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_system_atomicContext extends ParserRuleContext {
		public System_constantContext system_constant() {
			return getRuleContext(System_constantContext.class,0);
		}
		public Thf_system_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_system_atomic; }
	}

	public final Thf_system_atomicContext thf_system_atomic() throws RecognitionException {
		Thf_system_atomicContext _localctx = new Thf_system_atomicContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_thf_system_atomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			system_constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_letContext extends ParserRuleContext {
		public Thf_let_typesContext thf_let_types() {
			return getRuleContext(Thf_let_typesContext.class,0);
		}
		public Thf_let_defnsContext thf_let_defns() {
			return getRuleContext(Thf_let_defnsContext.class,0);
		}
		public Thf_logic_formulaContext thf_logic_formula() {
			return getRuleContext(Thf_logic_formulaContext.class,0);
		}
		public Thf_letContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_let; }
	}

	public final Thf_letContext thf_let() throws RecognitionException {
		Thf_letContext _localctx = new Thf_letContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_thf_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(T__16);
			setState(693);
			thf_let_types();
			setState(694);
			match(T__1);
			setState(695);
			thf_let_defns();
			setState(696);
			match(T__1);
			setState(697);
			thf_logic_formula();
			setState(698);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_let_typesContext extends ParserRuleContext {
		public Thf_atom_typingContext thf_atom_typing() {
			return getRuleContext(Thf_atom_typingContext.class,0);
		}
		public Thf_atom_typing_listContext thf_atom_typing_list() {
			return getRuleContext(Thf_atom_typing_listContext.class,0);
		}
		public Thf_let_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_let_types; }
	}

	public final Thf_let_typesContext thf_let_types() throws RecognitionException {
		Thf_let_typesContext _localctx = new Thf_let_typesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_thf_let_types);
		try {
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case Single_quoted:
			case Back_quoted:
			case Distinct_object:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				thf_atom_typing();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				match(T__13);
				setState(702);
				thf_atom_typing_list();
				setState(703);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_atom_typing_listContext extends ParserRuleContext {
		public Thf_atom_typingContext thf_atom_typing() {
			return getRuleContext(Thf_atom_typingContext.class,0);
		}
		public Thf_atom_typing_listContext thf_atom_typing_list() {
			return getRuleContext(Thf_atom_typing_listContext.class,0);
		}
		public Thf_atom_typing_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_atom_typing_list; }
	}

	public final Thf_atom_typing_listContext thf_atom_typing_list() throws RecognitionException {
		Thf_atom_typing_listContext _localctx = new Thf_atom_typing_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_thf_atom_typing_list);
		try {
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				thf_atom_typing();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				thf_atom_typing();
				setState(709);
				match(T__1);
				setState(710);
				thf_atom_typing_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_let_defnsContext extends ParserRuleContext {
		public Thf_let_defnContext thf_let_defn() {
			return getRuleContext(Thf_let_defnContext.class,0);
		}
		public Thf_let_defn_listContext thf_let_defn_list() {
			return getRuleContext(Thf_let_defn_listContext.class,0);
		}
		public Thf_let_defnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_let_defns; }
	}

	public final Thf_let_defnsContext thf_let_defns() throws RecognitionException {
		Thf_let_defnsContext _localctx = new Thf_let_defnsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_thf_let_defns);
		try {
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				thf_let_defn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				match(T__13);
				setState(716);
				thf_let_defn_list();
				setState(717);
				match(T__14);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_let_defnContext extends ParserRuleContext {
		public List<Thf_logic_formulaContext> thf_logic_formula() {
			return getRuleContexts(Thf_logic_formulaContext.class);
		}
		public Thf_logic_formulaContext thf_logic_formula(int i) {
			return getRuleContext(Thf_logic_formulaContext.class,i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Thf_let_defnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_let_defn; }
	}

	public final Thf_let_defnContext thf_let_defn() throws RecognitionException {
		Thf_let_defnContext _localctx = new Thf_let_defnContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_thf_let_defn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			thf_logic_formula();
			setState(722);
			assignment();
			setState(723);
			thf_logic_formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_let_defn_listContext extends ParserRuleContext {
		public Thf_let_defnContext thf_let_defn() {
			return getRuleContext(Thf_let_defnContext.class,0);
		}
		public Thf_let_defn_listContext thf_let_defn_list() {
			return getRuleContext(Thf_let_defn_listContext.class,0);
		}
		public Thf_let_defn_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_let_defn_list; }
	}

	public final Thf_let_defn_listContext thf_let_defn_list() throws RecognitionException {
		Thf_let_defn_listContext _localctx = new Thf_let_defn_listContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_thf_let_defn_list);
		try {
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				thf_let_defn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				thf_let_defn();
				setState(727);
				match(T__1);
				setState(728);
				thf_let_defn_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_unitary_termContext extends ParserRuleContext {
		public Thf_atomic_formulaContext thf_atomic_formula() {
			return getRuleContext(Thf_atomic_formulaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Thf_logic_formulaContext thf_logic_formula() {
			return getRuleContext(Thf_logic_formulaContext.class,0);
		}
		public Thf_unitary_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_unitary_term; }
	}

	public final Thf_unitary_termContext thf_unitary_term() throws RecognitionException {
		Thf_unitary_termContext _localctx = new Thf_unitary_termContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_thf_unitary_term);
		try {
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				thf_atomic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(734);
				match(T__11);
				setState(735);
				thf_logic_formula();
				setState(736);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_conn_termContext extends ParserRuleContext {
		public Nonassoc_connectiveContext nonassoc_connective() {
			return getRuleContext(Nonassoc_connectiveContext.class,0);
		}
		public Assoc_connectiveContext assoc_connective() {
			return getRuleContext(Assoc_connectiveContext.class,0);
		}
		public Infix_equalityContext infix_equality() {
			return getRuleContext(Infix_equalityContext.class,0);
		}
		public Infix_inequalityContext infix_inequality() {
			return getRuleContext(Infix_inequalityContext.class,0);
		}
		public Thf_unary_connectiveContext thf_unary_connective() {
			return getRuleContext(Thf_unary_connectiveContext.class,0);
		}
		public Thf_conn_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_conn_term; }
	}

	public final Thf_conn_termContext thf_conn_term() throws RecognitionException {
		Thf_conn_termContext _localctx = new Thf_conn_termContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_thf_conn_term);
		try {
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				nonassoc_connective();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				assoc_connective();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(742);
				infix_equality();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(743);
				infix_inequality();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(744);
				thf_unary_connective();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_tupleContext extends ParserRuleContext {
		public Thf_formula_listContext thf_formula_list() {
			return getRuleContext(Thf_formula_listContext.class,0);
		}
		public Thf_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_tuple; }
	}

	public final Thf_tupleContext thf_tuple() throws RecognitionException {
		Thf_tupleContext _localctx = new Thf_tupleContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_thf_tuple);
		try {
			setState(752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				match(T__17);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				match(T__13);
				setState(749);
				thf_formula_list();
				setState(750);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_fof_functionContext extends ParserRuleContext {
		public Defined_functorContext defined_functor() {
			return getRuleContext(Defined_functorContext.class,0);
		}
		public Thf_argumentsContext thf_arguments() {
			return getRuleContext(Thf_argumentsContext.class,0);
		}
		public System_functorContext system_functor() {
			return getRuleContext(System_functorContext.class,0);
		}
		public FunctorContext functor() {
			return getRuleContext(FunctorContext.class,0);
		}
		public Thf_fof_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_fof_function; }
	}

	public final Thf_fof_functionContext thf_fof_function() throws RecognitionException {
		Thf_fof_functionContext _localctx = new Thf_fof_functionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_thf_fof_function);
		try {
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(754);
				defined_functor();
				setState(755);
				match(T__11);
				setState(756);
				thf_arguments();
				setState(757);
				match(T__12);
				}
				break;
			case Dollar_dollar_word:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				system_functor();
				setState(760);
				match(T__11);
				setState(761);
				thf_arguments();
				setState(762);
				match(T__12);
				}
				break;
			case Single_quoted:
			case Back_quoted:
			case Lower_word:
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
				functor();
				setState(765);
				match(T__11);
				setState(766);
				thf_arguments();
				setState(767);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_argumentsContext extends ParserRuleContext {
		public Thf_formula_listContext thf_formula_list() {
			return getRuleContext(Thf_formula_listContext.class,0);
		}
		public Thf_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_arguments; }
	}

	public final Thf_argumentsContext thf_arguments() throws RecognitionException {
		Thf_argumentsContext _localctx = new Thf_argumentsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_thf_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			thf_formula_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_formula_listContext extends ParserRuleContext {
		public Thf_logic_formulaContext thf_logic_formula() {
			return getRuleContext(Thf_logic_formulaContext.class,0);
		}
		public List<Comma_thf_logic_formulaContext> comma_thf_logic_formula() {
			return getRuleContexts(Comma_thf_logic_formulaContext.class);
		}
		public Comma_thf_logic_formulaContext comma_thf_logic_formula(int i) {
			return getRuleContext(Comma_thf_logic_formulaContext.class,i);
		}
		public Thf_formula_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_formula_list; }
	}

	public final Thf_formula_listContext thf_formula_list() throws RecognitionException {
		Thf_formula_listContext _localctx = new Thf_formula_listContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_thf_formula_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			thf_logic_formula();
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(774);
				comma_thf_logic_formula();
				}
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comma_thf_logic_formulaContext extends ParserRuleContext {
		public Thf_logic_formulaContext thf_logic_formula() {
			return getRuleContext(Thf_logic_formulaContext.class,0);
		}
		public Comma_thf_logic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_thf_logic_formula; }
	}

	public final Comma_thf_logic_formulaContext comma_thf_logic_formula() throws RecognitionException {
		Comma_thf_logic_formulaContext _localctx = new Comma_thf_logic_formulaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_comma_thf_logic_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(T__1);
			setState(781);
			thf_logic_formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_atom_typingContext extends ParserRuleContext {
		public Typeable_atomContext typeable_atom() {
			return getRuleContext(Typeable_atomContext.class,0);
		}
		public Thf_top_level_typeContext thf_top_level_type() {
			return getRuleContext(Thf_top_level_typeContext.class,0);
		}
		public Thf_atom_typingContext thf_atom_typing() {
			return getRuleContext(Thf_atom_typingContext.class,0);
		}
		public Thf_atom_typingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_atom_typing; }
	}

	public final Thf_atom_typingContext thf_atom_typing() throws RecognitionException {
		Thf_atom_typingContext _localctx = new Thf_atom_typingContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_thf_atom_typing);
		try {
			setState(791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Single_quoted:
			case Back_quoted:
			case Distinct_object:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				typeable_atom();
				setState(784);
				match(T__15);
				setState(785);
				thf_top_level_type();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				match(T__11);
				setState(788);
				thf_atom_typing();
				setState(789);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_top_level_typeContext extends ParserRuleContext {
		public Thf_unitary_typeContext thf_unitary_type() {
			return getRuleContext(Thf_unitary_typeContext.class,0);
		}
		public Thf_mapping_typeContext thf_mapping_type() {
			return getRuleContext(Thf_mapping_typeContext.class,0);
		}
		public Thf_apply_typeContext thf_apply_type() {
			return getRuleContext(Thf_apply_typeContext.class,0);
		}
		public Thf_top_level_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_top_level_type; }
	}

	public final Thf_top_level_typeContext thf_top_level_type() throws RecognitionException {
		Thf_top_level_typeContext _localctx = new Thf_top_level_typeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_thf_top_level_type);
		try {
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				thf_unitary_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				thf_mapping_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(795);
				thf_apply_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_unitary_typeContext extends ParserRuleContext {
		public Thf_unitary_formulaContext thf_unitary_formula() {
			return getRuleContext(Thf_unitary_formulaContext.class,0);
		}
		public Thf_unitary_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_unitary_type; }
	}

	public final Thf_unitary_typeContext thf_unitary_type() throws RecognitionException {
		Thf_unitary_typeContext _localctx = new Thf_unitary_typeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_thf_unitary_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			thf_unitary_formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_apply_typeContext extends ParserRuleContext {
		public Thf_apply_formulaContext thf_apply_formula() {
			return getRuleContext(Thf_apply_formulaContext.class,0);
		}
		public Thf_apply_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_apply_type; }
	}

	public final Thf_apply_typeContext thf_apply_type() throws RecognitionException {
		Thf_apply_typeContext _localctx = new Thf_apply_typeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_thf_apply_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			thf_apply_formula(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_binary_typeContext extends ParserRuleContext {
		public Thf_mapping_typeContext thf_mapping_type() {
			return getRuleContext(Thf_mapping_typeContext.class,0);
		}
		public Thf_xprod_typeContext thf_xprod_type() {
			return getRuleContext(Thf_xprod_typeContext.class,0);
		}
		public Thf_union_typeContext thf_union_type() {
			return getRuleContext(Thf_union_typeContext.class,0);
		}
		public Thf_binary_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_binary_type; }
	}

	public final Thf_binary_typeContext thf_binary_type() throws RecognitionException {
		Thf_binary_typeContext _localctx = new Thf_binary_typeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_thf_binary_type);
		try {
			setState(805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				thf_mapping_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				thf_xprod_type(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(804);
				thf_union_type(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_mapping_typeContext extends ParserRuleContext {
		public List<Thf_unitary_typeContext> thf_unitary_type() {
			return getRuleContexts(Thf_unitary_typeContext.class);
		}
		public Thf_unitary_typeContext thf_unitary_type(int i) {
			return getRuleContext(Thf_unitary_typeContext.class,i);
		}
		public TerminalNode Arrow() { return getToken(TPTPParser.Arrow, 0); }
		public Thf_mapping_typeContext thf_mapping_type() {
			return getRuleContext(Thf_mapping_typeContext.class,0);
		}
		public Thf_mapping_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_mapping_type; }
	}

	public final Thf_mapping_typeContext thf_mapping_type() throws RecognitionException {
		Thf_mapping_typeContext _localctx = new Thf_mapping_typeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_thf_mapping_type);
		try {
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				thf_unitary_type();
				setState(808);
				match(Arrow);
				setState(809);
				thf_unitary_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				thf_unitary_type();
				setState(812);
				match(Arrow);
				setState(813);
				thf_mapping_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_xprod_typeContext extends ParserRuleContext {
		public List<Thf_unitary_typeContext> thf_unitary_type() {
			return getRuleContexts(Thf_unitary_typeContext.class);
		}
		public Thf_unitary_typeContext thf_unitary_type(int i) {
			return getRuleContext(Thf_unitary_typeContext.class,i);
		}
		public TerminalNode Star() { return getToken(TPTPParser.Star, 0); }
		public Thf_xprod_typeContext thf_xprod_type() {
			return getRuleContext(Thf_xprod_typeContext.class,0);
		}
		public Thf_xprod_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_xprod_type; }
	}

	public final Thf_xprod_typeContext thf_xprod_type() throws RecognitionException {
		return thf_xprod_type(0);
	}

	private Thf_xprod_typeContext thf_xprod_type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Thf_xprod_typeContext _localctx = new Thf_xprod_typeContext(_ctx, _parentState);
		Thf_xprod_typeContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_thf_xprod_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(818);
			thf_unitary_type();
			setState(819);
			match(Star);
			setState(820);
			thf_unitary_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(827);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Thf_xprod_typeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_thf_xprod_type);
					setState(822);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(823);
					match(Star);
					setState(824);
					thf_unitary_type();
					}
					} 
				}
				setState(829);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_union_typeContext extends ParserRuleContext {
		public List<Thf_unitary_typeContext> thf_unitary_type() {
			return getRuleContexts(Thf_unitary_typeContext.class);
		}
		public Thf_unitary_typeContext thf_unitary_type(int i) {
			return getRuleContext(Thf_unitary_typeContext.class,i);
		}
		public TerminalNode Plus() { return getToken(TPTPParser.Plus, 0); }
		public Thf_union_typeContext thf_union_type() {
			return getRuleContext(Thf_union_typeContext.class,0);
		}
		public Thf_union_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_union_type; }
	}

	public final Thf_union_typeContext thf_union_type() throws RecognitionException {
		return thf_union_type(0);
	}

	private Thf_union_typeContext thf_union_type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Thf_union_typeContext _localctx = new Thf_union_typeContext(_ctx, _parentState);
		Thf_union_typeContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_thf_union_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(831);
			thf_unitary_type();
			setState(832);
			match(Plus);
			setState(833);
			thf_unitary_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Thf_union_typeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_thf_union_type);
					setState(835);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(836);
					match(Plus);
					setState(837);
					thf_unitary_type();
					}
					} 
				}
				setState(842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_subtypeContext extends ParserRuleContext {
		public List<Atomic_typeContext> atomic_type() {
			return getRuleContexts(Atomic_typeContext.class);
		}
		public Atomic_typeContext atomic_type(int i) {
			return getRuleContext(Atomic_typeContext.class,i);
		}
		public Subtype_signContext subtype_sign() {
			return getRuleContext(Subtype_signContext.class,0);
		}
		public Thf_subtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_subtype; }
	}

	public final Thf_subtypeContext thf_subtype() throws RecognitionException {
		Thf_subtypeContext _localctx = new Thf_subtypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_thf_subtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			atomic_type();
			setState(844);
			subtype_sign();
			setState(845);
			atomic_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_definitionContext extends ParserRuleContext {
		public Thf_atomic_formulaContext thf_atomic_formula() {
			return getRuleContext(Thf_atomic_formulaContext.class,0);
		}
		public IdenticalContext identical() {
			return getRuleContext(IdenticalContext.class,0);
		}
		public Thf_logic_formulaContext thf_logic_formula() {
			return getRuleContext(Thf_logic_formulaContext.class,0);
		}
		public Thf_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_definition; }
	}

	public final Thf_definitionContext thf_definition() throws RecognitionException {
		Thf_definitionContext _localctx = new Thf_definitionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_thf_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			thf_atomic_formula();
			setState(848);
			identical();
			setState(849);
			thf_logic_formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_sequentContext extends ParserRuleContext {
		public List<Thf_tupleContext> thf_tuple() {
			return getRuleContexts(Thf_tupleContext.class);
		}
		public Thf_tupleContext thf_tuple(int i) {
			return getRuleContext(Thf_tupleContext.class,i);
		}
		public Gentzen_arrowContext gentzen_arrow() {
			return getRuleContext(Gentzen_arrowContext.class,0);
		}
		public Thf_sequentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_sequent; }
	}

	public final Thf_sequentContext thf_sequent() throws RecognitionException {
		Thf_sequentContext _localctx = new Thf_sequentContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_thf_sequent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			thf_tuple();
			setState(852);
			gentzen_arrow();
			setState(853);
			thf_tuple();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_formulaContext extends ParserRuleContext {
		public Tff_logic_formulaContext tff_logic_formula() {
			return getRuleContext(Tff_logic_formulaContext.class,0);
		}
		public Tff_atom_typingContext tff_atom_typing() {
			return getRuleContext(Tff_atom_typingContext.class,0);
		}
		public Tff_subtypeContext tff_subtype() {
			return getRuleContext(Tff_subtypeContext.class,0);
		}
		public Tff_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_formula; }
	}

	public final Tff_formulaContext tff_formula() throws RecognitionException {
		Tff_formulaContext _localctx = new Tff_formulaContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_tff_formula);
		try {
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				tff_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				tff_atom_typing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(857);
				tff_subtype();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_logic_formulaContext extends ParserRuleContext {
		public Tff_unitary_formulaContext tff_unitary_formula() {
			return getRuleContext(Tff_unitary_formulaContext.class,0);
		}
		public Tff_unary_formulaContext tff_unary_formula() {
			return getRuleContext(Tff_unary_formulaContext.class,0);
		}
		public Tff_binary_formulaContext tff_binary_formula() {
			return getRuleContext(Tff_binary_formulaContext.class,0);
		}
		public Tff_defined_infixContext tff_defined_infix() {
			return getRuleContext(Tff_defined_infixContext.class,0);
		}
		public Txf_definitionContext txf_definition() {
			return getRuleContext(Txf_definitionContext.class,0);
		}
		public Txf_sequentContext txf_sequent() {
			return getRuleContext(Txf_sequentContext.class,0);
		}
		public Tff_logic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_logic_formula; }
	}

	public final Tff_logic_formulaContext tff_logic_formula() throws RecognitionException {
		Tff_logic_formulaContext _localctx = new Tff_logic_formulaContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_tff_logic_formula);
		try {
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				tff_unitary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				tff_unary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(862);
				tff_binary_formula();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(863);
				tff_defined_infix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(864);
				txf_definition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(865);
				txf_sequent();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_binary_formulaContext extends ParserRuleContext {
		public Tff_binary_nonassocContext tff_binary_nonassoc() {
			return getRuleContext(Tff_binary_nonassocContext.class,0);
		}
		public Tff_binary_assocContext tff_binary_assoc() {
			return getRuleContext(Tff_binary_assocContext.class,0);
		}
		public Tff_binary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_binary_formula; }
	}

	public final Tff_binary_formulaContext tff_binary_formula() throws RecognitionException {
		Tff_binary_formulaContext _localctx = new Tff_binary_formulaContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_tff_binary_formula);
		try {
			setState(870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				tff_binary_nonassoc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				tff_binary_assoc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_binary_nonassocContext extends ParserRuleContext {
		public List<Tff_unit_formulaContext> tff_unit_formula() {
			return getRuleContexts(Tff_unit_formulaContext.class);
		}
		public Tff_unit_formulaContext tff_unit_formula(int i) {
			return getRuleContext(Tff_unit_formulaContext.class,i);
		}
		public Nonassoc_connectiveContext nonassoc_connective() {
			return getRuleContext(Nonassoc_connectiveContext.class,0);
		}
		public Tff_binary_nonassocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_binary_nonassoc; }
	}

	public final Tff_binary_nonassocContext tff_binary_nonassoc() throws RecognitionException {
		Tff_binary_nonassocContext _localctx = new Tff_binary_nonassocContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_tff_binary_nonassoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			tff_unit_formula();
			setState(873);
			nonassoc_connective();
			setState(874);
			tff_unit_formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_binary_assocContext extends ParserRuleContext {
		public Tff_or_formulaContext tff_or_formula() {
			return getRuleContext(Tff_or_formulaContext.class,0);
		}
		public Tff_and_formulaContext tff_and_formula() {
			return getRuleContext(Tff_and_formulaContext.class,0);
		}
		public Tff_binary_assocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_binary_assoc; }
	}

	public final Tff_binary_assocContext tff_binary_assoc() throws RecognitionException {
		Tff_binary_assocContext _localctx = new Tff_binary_assocContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_tff_binary_assoc);
		try {
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				tff_or_formula(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				tff_and_formula(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_or_formulaContext extends ParserRuleContext {
		public List<Tff_unit_formulaContext> tff_unit_formula() {
			return getRuleContexts(Tff_unit_formulaContext.class);
		}
		public Tff_unit_formulaContext tff_unit_formula(int i) {
			return getRuleContext(Tff_unit_formulaContext.class,i);
		}
		public TerminalNode Vline() { return getToken(TPTPParser.Vline, 0); }
		public Tff_or_formulaContext tff_or_formula() {
			return getRuleContext(Tff_or_formulaContext.class,0);
		}
		public Tff_or_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_or_formula; }
	}

	public final Tff_or_formulaContext tff_or_formula() throws RecognitionException {
		return tff_or_formula(0);
	}

	private Tff_or_formulaContext tff_or_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tff_or_formulaContext _localctx = new Tff_or_formulaContext(_ctx, _parentState);
		Tff_or_formulaContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_tff_or_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(881);
			tff_unit_formula();
			setState(882);
			match(Vline);
			setState(883);
			tff_unit_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(890);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Tff_or_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tff_or_formula);
					setState(885);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(886);
					match(Vline);
					setState(887);
					tff_unit_formula();
					}
					} 
				}
				setState(892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_and_formulaContext extends ParserRuleContext {
		public List<Tff_unit_formulaContext> tff_unit_formula() {
			return getRuleContexts(Tff_unit_formulaContext.class);
		}
		public Tff_unit_formulaContext tff_unit_formula(int i) {
			return getRuleContext(Tff_unit_formulaContext.class,i);
		}
		public Tff_and_formulaContext tff_and_formula() {
			return getRuleContext(Tff_and_formulaContext.class,0);
		}
		public Tff_and_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_and_formula; }
	}

	public final Tff_and_formulaContext tff_and_formula() throws RecognitionException {
		return tff_and_formula(0);
	}

	private Tff_and_formulaContext tff_and_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tff_and_formulaContext _localctx = new Tff_and_formulaContext(_ctx, _parentState);
		Tff_and_formulaContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_tff_and_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(894);
			tff_unit_formula();
			setState(895);
			match(T__9);
			setState(896);
			tff_unit_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(903);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Tff_and_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tff_and_formula);
					setState(898);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(899);
					match(T__9);
					setState(900);
					tff_unit_formula();
					}
					} 
				}
				setState(905);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_unit_formulaContext extends ParserRuleContext {
		public Tff_unitary_formulaContext tff_unitary_formula() {
			return getRuleContext(Tff_unitary_formulaContext.class,0);
		}
		public Tff_unary_formulaContext tff_unary_formula() {
			return getRuleContext(Tff_unary_formulaContext.class,0);
		}
		public Tff_defined_infixContext tff_defined_infix() {
			return getRuleContext(Tff_defined_infixContext.class,0);
		}
		public Tff_unit_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_unit_formula; }
	}

	public final Tff_unit_formulaContext tff_unit_formula() throws RecognitionException {
		Tff_unit_formulaContext _localctx = new Tff_unit_formulaContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_tff_unit_formula);
		try {
			setState(909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				tff_unitary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				tff_unary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(908);
				tff_defined_infix();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_preunit_formulaContext extends ParserRuleContext {
		public Tff_unitary_formulaContext tff_unitary_formula() {
			return getRuleContext(Tff_unitary_formulaContext.class,0);
		}
		public Tff_prefix_unaryContext tff_prefix_unary() {
			return getRuleContext(Tff_prefix_unaryContext.class,0);
		}
		public Tff_preunit_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_preunit_formula; }
	}

	public final Tff_preunit_formulaContext tff_preunit_formula() throws RecognitionException {
		Tff_preunit_formulaContext _localctx = new Tff_preunit_formulaContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_tff_preunit_formula);
		try {
			setState(913);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__16:
			case T__18:
			case T__25:
			case T__31:
			case Single_quoted:
			case Back_quoted:
			case Dollar_word:
			case Dollar_dollar_word:
			case Upper_word:
			case Lower_word:
			case Hash:
				enterOuterAlt(_localctx, 1);
				{
				setState(911);
				tff_unitary_formula();
				}
				break;
			case T__21:
			case T__23:
			case T__24:
			case T__26:
			case Less_sign:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				tff_prefix_unary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_unitary_formulaContext extends ParserRuleContext {
		public Tff_quantified_formulaContext tff_quantified_formula() {
			return getRuleContext(Tff_quantified_formulaContext.class,0);
		}
		public Tff_atomic_formulaContext tff_atomic_formula() {
			return getRuleContext(Tff_atomic_formulaContext.class,0);
		}
		public Txf_unitary_formulaContext txf_unitary_formula() {
			return getRuleContext(Txf_unitary_formulaContext.class,0);
		}
		public Tff_logic_formulaContext tff_logic_formula() {
			return getRuleContext(Tff_logic_formulaContext.class,0);
		}
		public Tff_unitary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_unitary_formula; }
	}

	public final Tff_unitary_formulaContext tff_unitary_formula() throws RecognitionException {
		Tff_unitary_formulaContext _localctx = new Tff_unitary_formulaContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_tff_unitary_formula);
		try {
			setState(922);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__31:
			case Hash:
				enterOuterAlt(_localctx, 1);
				{
				setState(915);
				tff_quantified_formula();
				}
				break;
			case T__16:
			case T__18:
			case Single_quoted:
			case Back_quoted:
			case Dollar_word:
			case Dollar_dollar_word:
			case Lower_word:
				enterOuterAlt(_localctx, 2);
				{
				setState(916);
				tff_atomic_formula();
				}
				break;
			case Upper_word:
				enterOuterAlt(_localctx, 3);
				{
				setState(917);
				txf_unitary_formula();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(918);
				match(T__11);
				setState(919);
				tff_logic_formula();
				setState(920);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Txf_unitary_formulaContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Txf_unitary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txf_unitary_formula; }
	}

	public final Txf_unitary_formulaContext txf_unitary_formula() throws RecognitionException {
		Txf_unitary_formulaContext _localctx = new Txf_unitary_formulaContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_txf_unitary_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_quantified_formulaContext extends ParserRuleContext {
		public Tff_quantifierContext tff_quantifier() {
			return getRuleContext(Tff_quantifierContext.class,0);
		}
		public Tff_variable_listContext tff_variable_list() {
			return getRuleContext(Tff_variable_listContext.class,0);
		}
		public Tff_unit_formulaContext tff_unit_formula() {
			return getRuleContext(Tff_unit_formulaContext.class,0);
		}
		public Tff_quantified_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_quantified_formula; }
	}

	public final Tff_quantified_formulaContext tff_quantified_formula() throws RecognitionException {
		Tff_quantified_formulaContext _localctx = new Tff_quantified_formulaContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_tff_quantified_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			tff_quantifier();
			setState(927);
			match(T__13);
			setState(928);
			tff_variable_list();
			setState(929);
			match(T__14);
			setState(930);
			match(T__15);
			setState(931);
			tff_unit_formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_variable_listContext extends ParserRuleContext {
		public Tff_variableContext tff_variable() {
			return getRuleContext(Tff_variableContext.class,0);
		}
		public Tff_variable_listContext tff_variable_list() {
			return getRuleContext(Tff_variable_listContext.class,0);
		}
		public Tff_variable_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_variable_list; }
	}

	public final Tff_variable_listContext tff_variable_list() throws RecognitionException {
		Tff_variable_listContext _localctx = new Tff_variable_listContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_tff_variable_list);
		try {
			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(933);
				tff_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(934);
				tff_variable();
				setState(935);
				match(T__1);
				setState(936);
				tff_variable_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_variableContext extends ParserRuleContext {
		public Tff_typed_variableContext tff_typed_variable() {
			return getRuleContext(Tff_typed_variableContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Tff_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_variable; }
	}

	public final Tff_variableContext tff_variable() throws RecognitionException {
		Tff_variableContext _localctx = new Tff_variableContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_tff_variable);
		try {
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(940);
				tff_typed_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				variable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_typed_variableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Tff_atomic_typeContext tff_atomic_type() {
			return getRuleContext(Tff_atomic_typeContext.class,0);
		}
		public Tff_typed_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_typed_variable; }
	}

	public final Tff_typed_variableContext tff_typed_variable() throws RecognitionException {
		Tff_typed_variableContext _localctx = new Tff_typed_variableContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_tff_typed_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			variable();
			setState(945);
			match(T__15);
			setState(946);
			tff_atomic_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_unary_formulaContext extends ParserRuleContext {
		public Tff_prefix_unaryContext tff_prefix_unary() {
			return getRuleContext(Tff_prefix_unaryContext.class,0);
		}
		public Tff_infix_unaryContext tff_infix_unary() {
			return getRuleContext(Tff_infix_unaryContext.class,0);
		}
		public Tff_unary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_unary_formula; }
	}

	public final Tff_unary_formulaContext tff_unary_formula() throws RecognitionException {
		Tff_unary_formulaContext _localctx = new Tff_unary_formulaContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_tff_unary_formula);
		try {
			setState(950);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__23:
			case T__24:
			case T__26:
			case Less_sign:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				tff_prefix_unary();
				}
				break;
			case T__11:
			case T__13:
			case T__16:
			case T__17:
			case T__18:
			case Single_quoted:
			case Back_quoted:
			case Distinct_object:
			case Dollar_word:
			case Dollar_dollar_word:
			case Upper_word:
			case Lower_word:
			case Real:
			case Rational:
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(949);
				tff_infix_unary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_prefix_unaryContext extends ParserRuleContext {
		public Tff_unary_connectiveContext tff_unary_connective() {
			return getRuleContext(Tff_unary_connectiveContext.class,0);
		}
		public Tff_preunit_formulaContext tff_preunit_formula() {
			return getRuleContext(Tff_preunit_formulaContext.class,0);
		}
		public Tff_prefix_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_prefix_unary; }
	}

	public final Tff_prefix_unaryContext tff_prefix_unary() throws RecognitionException {
		Tff_prefix_unaryContext _localctx = new Tff_prefix_unaryContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_tff_prefix_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			tff_unary_connective();
			setState(953);
			tff_preunit_formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_infix_unaryContext extends ParserRuleContext {
		public List<Tff_unitary_termContext> tff_unitary_term() {
			return getRuleContexts(Tff_unitary_termContext.class);
		}
		public Tff_unitary_termContext tff_unitary_term(int i) {
			return getRuleContext(Tff_unitary_termContext.class,i);
		}
		public Infix_inequalityContext infix_inequality() {
			return getRuleContext(Infix_inequalityContext.class,0);
		}
		public Tff_infix_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_infix_unary; }
	}

	public final Tff_infix_unaryContext tff_infix_unary() throws RecognitionException {
		Tff_infix_unaryContext _localctx = new Tff_infix_unaryContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_tff_infix_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			tff_unitary_term();
			setState(956);
			infix_inequality();
			setState(957);
			tff_unitary_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_atomic_formulaContext extends ParserRuleContext {
		public Tff_plain_atomicContext tff_plain_atomic() {
			return getRuleContext(Tff_plain_atomicContext.class,0);
		}
		public Tff_defined_atomicContext tff_defined_atomic() {
			return getRuleContext(Tff_defined_atomicContext.class,0);
		}
		public Tff_system_atomicContext tff_system_atomic() {
			return getRuleContext(Tff_system_atomicContext.class,0);
		}
		public Tff_atomic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_atomic_formula; }
	}

	public final Tff_atomic_formulaContext tff_atomic_formula() throws RecognitionException {
		Tff_atomic_formulaContext _localctx = new Tff_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_tff_atomic_formula);
		try {
			setState(962);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Single_quoted:
			case Back_quoted:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				tff_plain_atomic();
				}
				break;
			case T__16:
			case T__18:
			case Dollar_word:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
				tff_defined_atomic();
				}
				break;
			case Dollar_dollar_word:
				enterOuterAlt(_localctx, 3);
				{
				setState(961);
				tff_system_atomic();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_plain_atomicContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FunctorContext functor() {
			return getRuleContext(FunctorContext.class,0);
		}
		public Tff_argumentsContext tff_arguments() {
			return getRuleContext(Tff_argumentsContext.class,0);
		}
		public Tff_plain_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_plain_atomic; }
	}

	public final Tff_plain_atomicContext tff_plain_atomic() throws RecognitionException {
		Tff_plain_atomicContext _localctx = new Tff_plain_atomicContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_tff_plain_atomic);
		try {
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				functor();
				setState(966);
				match(T__11);
				setState(967);
				tff_arguments();
				setState(968);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_defined_atomicContext extends ParserRuleContext {
		public Tff_defined_plainContext tff_defined_plain() {
			return getRuleContext(Tff_defined_plainContext.class,0);
		}
		public Tff_defined_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_defined_atomic; }
	}

	public final Tff_defined_atomicContext tff_defined_atomic() throws RecognitionException {
		Tff_defined_atomicContext _localctx = new Tff_defined_atomicContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_tff_defined_atomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			tff_defined_plain();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_defined_plainContext extends ParserRuleContext {
		public Defined_constantContext defined_constant() {
			return getRuleContext(Defined_constantContext.class,0);
		}
		public Defined_functorContext defined_functor() {
			return getRuleContext(Defined_functorContext.class,0);
		}
		public Tff_argumentsContext tff_arguments() {
			return getRuleContext(Tff_argumentsContext.class,0);
		}
		public Nxf_atomContext nxf_atom() {
			return getRuleContext(Nxf_atomContext.class,0);
		}
		public Txf_letContext txf_let() {
			return getRuleContext(Txf_letContext.class,0);
		}
		public Tff_defined_plainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_defined_plain; }
	}

	public final Tff_defined_plainContext tff_defined_plain() throws RecognitionException {
		Tff_defined_plainContext _localctx = new Tff_defined_plainContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_tff_defined_plain);
		try {
			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(974);
				defined_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				defined_functor();
				setState(976);
				match(T__11);
				setState(977);
				tff_arguments();
				setState(978);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(980);
				nxf_atom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(981);
				txf_let();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_defined_infixContext extends ParserRuleContext {
		public List<Tff_unitary_termContext> tff_unitary_term() {
			return getRuleContexts(Tff_unitary_termContext.class);
		}
		public Tff_unitary_termContext tff_unitary_term(int i) {
			return getRuleContext(Tff_unitary_termContext.class,i);
		}
		public Defined_infix_predContext defined_infix_pred() {
			return getRuleContext(Defined_infix_predContext.class,0);
		}
		public Tff_defined_infixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_defined_infix; }
	}

	public final Tff_defined_infixContext tff_defined_infix() throws RecognitionException {
		Tff_defined_infixContext _localctx = new Tff_defined_infixContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_tff_defined_infix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			tff_unitary_term();
			setState(985);
			defined_infix_pred();
			setState(986);
			tff_unitary_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_system_atomicContext extends ParserRuleContext {
		public System_constantContext system_constant() {
			return getRuleContext(System_constantContext.class,0);
		}
		public System_functorContext system_functor() {
			return getRuleContext(System_functorContext.class,0);
		}
		public Tff_argumentsContext tff_arguments() {
			return getRuleContext(Tff_argumentsContext.class,0);
		}
		public Tff_system_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_system_atomic; }
	}

	public final Tff_system_atomicContext tff_system_atomic() throws RecognitionException {
		Tff_system_atomicContext _localctx = new Tff_system_atomicContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_tff_system_atomic);
		try {
			setState(994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(988);
				system_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(989);
				system_functor();
				setState(990);
				match(T__11);
				setState(991);
				tff_arguments();
				setState(992);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Txf_letContext extends ParserRuleContext {
		public Txf_let_typesContext txf_let_types() {
			return getRuleContext(Txf_let_typesContext.class,0);
		}
		public Txf_let_defnsContext txf_let_defns() {
			return getRuleContext(Txf_let_defnsContext.class,0);
		}
		public Tff_termContext tff_term() {
			return getRuleContext(Tff_termContext.class,0);
		}
		public Txf_letContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txf_let; }
	}

	public final Txf_letContext txf_let() throws RecognitionException {
		Txf_letContext _localctx = new Txf_letContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_txf_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			match(T__16);
			setState(997);
			txf_let_types();
			setState(998);
			match(T__1);
			setState(999);
			txf_let_defns();
			setState(1000);
			match(T__1);
			setState(1001);
			tff_term();
			setState(1002);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Txf_let_typesContext extends ParserRuleContext {
		public Tff_atom_typingContext tff_atom_typing() {
			return getRuleContext(Tff_atom_typingContext.class,0);
		}
		public Tff_atom_typing_listContext tff_atom_typing_list() {
			return getRuleContext(Tff_atom_typing_listContext.class,0);
		}
		public Txf_let_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txf_let_types; }
	}

	public final Txf_let_typesContext txf_let_types() throws RecognitionException {
		Txf_let_typesContext _localctx = new Txf_let_typesContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_txf_let_types);
		try {
			setState(1009);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case Single_quoted:
			case Back_quoted:
			case Distinct_object:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				tff_atom_typing();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
				match(T__13);
				setState(1006);
				tff_atom_typing_list();
				setState(1007);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_atom_typing_listContext extends ParserRuleContext {
		public Tff_atom_typingContext tff_atom_typing() {
			return getRuleContext(Tff_atom_typingContext.class,0);
		}
		public Tff_atom_typing_listContext tff_atom_typing_list() {
			return getRuleContext(Tff_atom_typing_listContext.class,0);
		}
		public Tff_atom_typing_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_atom_typing_list; }
	}

	public final Tff_atom_typing_listContext tff_atom_typing_list() throws RecognitionException {
		Tff_atom_typing_listContext _localctx = new Tff_atom_typing_listContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_tff_atom_typing_list);
		try {
			setState(1016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				tff_atom_typing();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1012);
				tff_atom_typing();
				setState(1013);
				match(T__1);
				setState(1014);
				tff_atom_typing_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Txf_let_defnsContext extends ParserRuleContext {
		public Txf_let_defnContext txf_let_defn() {
			return getRuleContext(Txf_let_defnContext.class,0);
		}
		public Txf_let_defn_listContext txf_let_defn_list() {
			return getRuleContext(Txf_let_defn_listContext.class,0);
		}
		public Txf_let_defnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txf_let_defns; }
	}

	public final Txf_let_defnsContext txf_let_defns() throws RecognitionException {
		Txf_let_defnsContext _localctx = new Txf_let_defnsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_txf_let_defns);
		try {
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1018);
				txf_let_defn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				match(T__13);
				setState(1020);
				txf_let_defn_list();
				setState(1021);
				match(T__14);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Txf_let_defnContext extends ParserRuleContext {
		public Txf_let_LHSContext txf_let_LHS() {
			return getRuleContext(Txf_let_LHSContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Tff_termContext tff_term() {
			return getRuleContext(Tff_termContext.class,0);
		}
		public Txf_let_defnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txf_let_defn; }
	}

	public final Txf_let_defnContext txf_let_defn() throws RecognitionException {
		Txf_let_defnContext _localctx = new Txf_let_defnContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_txf_let_defn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			txf_let_LHS();
			setState(1026);
			assignment();
			setState(1027);
			tff_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Txf_let_LHSContext extends ParserRuleContext {
		public Tff_plain_atomicContext tff_plain_atomic() {
			return getRuleContext(Tff_plain_atomicContext.class,0);
		}
		public Txf_tupleContext txf_tuple() {
			return getRuleContext(Txf_tupleContext.class,0);
		}
		public Txf_let_LHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txf_let_LHS; }
	}

	public final Txf_let_LHSContext txf_let_LHS() throws RecognitionException {
		Txf_let_LHSContext _localctx = new Txf_let_LHSContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_txf_let_LHS);
		try {
			setState(1031);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Single_quoted:
			case Back_quoted:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(1029);
				tff_plain_atomic();
				}
				break;
			case T__13:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(1030);
				txf_tuple();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Txf_let_defn_listContext extends ParserRuleContext {
		public Txf_let_defnContext txf_let_defn() {
			return getRuleContext(Txf_let_defnContext.class,0);
		}
		public Txf_let_defn_listContext txf_let_defn_list() {
			return getRuleContext(Txf_let_defn_listContext.class,0);
		}
		public Txf_let_defn_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txf_let_defn_list; }
	}

	public final Txf_let_defn_listContext txf_let_defn_list() throws RecognitionException {
		Txf_let_defn_listContext _localctx = new Txf_let_defn_listContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_txf_let_defn_list);
		try {
			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				txf_let_defn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1034);
				txf_let_defn();
				setState(1035);
				match(T__1);
				setState(1036);
				txf_let_defn_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nxf_atomContext extends ParserRuleContext {
		public Nxf_long_connectiveContext nxf_long_connective() {
			return getRuleContext(Nxf_long_connectiveContext.class,0);
		}
		public Tff_argumentsContext tff_arguments() {
			return getRuleContext(Tff_argumentsContext.class,0);
		}
		public Nxf_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nxf_atom; }
	}

	public final Nxf_atomContext nxf_atom() throws RecognitionException {
		Nxf_atomContext _localctx = new Nxf_atomContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_nxf_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			nxf_long_connective();
			setState(1041);
			match(T__10);
			setState(1042);
			match(T__11);
			setState(1043);
			tff_arguments();
			setState(1044);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_termContext extends ParserRuleContext {
		public Tff_logic_formulaContext tff_logic_formula() {
			return getRuleContext(Tff_logic_formulaContext.class,0);
		}
		public Defined_termContext defined_term() {
			return getRuleContext(Defined_termContext.class,0);
		}
		public Txf_tupleContext txf_tuple() {
			return getRuleContext(Txf_tupleContext.class,0);
		}
		public Tff_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_term; }
	}

	public final Tff_termContext tff_term() throws RecognitionException {
		Tff_termContext _localctx = new Tff_termContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_tff_term);
		try {
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1046);
				tff_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047);
				defined_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1048);
				txf_tuple();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_unitary_termContext extends ParserRuleContext {
		public Tff_atomic_formulaContext tff_atomic_formula() {
			return getRuleContext(Tff_atomic_formulaContext.class,0);
		}
		public Defined_termContext defined_term() {
			return getRuleContext(Defined_termContext.class,0);
		}
		public Txf_tupleContext txf_tuple() {
			return getRuleContext(Txf_tupleContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Tff_logic_formulaContext tff_logic_formula() {
			return getRuleContext(Tff_logic_formulaContext.class,0);
		}
		public Tff_unitary_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_unitary_term; }
	}

	public final Tff_unitary_termContext tff_unitary_term() throws RecognitionException {
		Tff_unitary_termContext _localctx = new Tff_unitary_termContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_tff_unitary_term);
		try {
			setState(1059);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__18:
			case Single_quoted:
			case Back_quoted:
			case Dollar_word:
			case Dollar_dollar_word:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(1051);
				tff_atomic_formula();
				}
				break;
			case Distinct_object:
			case Real:
			case Rational:
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052);
				defined_term();
				}
				break;
			case T__13:
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(1053);
				txf_tuple();
				}
				break;
			case Upper_word:
				enterOuterAlt(_localctx, 4);
				{
				setState(1054);
				variable();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(1055);
				match(T__11);
				setState(1056);
				tff_logic_formula();
				setState(1057);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Txf_tupleContext extends ParserRuleContext {
		public Tff_argumentsContext tff_arguments() {
			return getRuleContext(Tff_argumentsContext.class,0);
		}
		public Txf_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txf_tuple; }
	}

	public final Txf_tupleContext txf_tuple() throws RecognitionException {
		Txf_tupleContext _localctx = new Txf_tupleContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_txf_tuple);
		try {
			setState(1066);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(1061);
				match(T__17);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(1062);
				match(T__13);
				setState(1063);
				tff_arguments();
				setState(1064);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_argumentsContext extends ParserRuleContext {
		public Tff_termContext tff_term() {
			return getRuleContext(Tff_termContext.class,0);
		}
		public List<Comma_tff_termContext> comma_tff_term() {
			return getRuleContexts(Comma_tff_termContext.class);
		}
		public Comma_tff_termContext comma_tff_term(int i) {
			return getRuleContext(Comma_tff_termContext.class,i);
		}
		public Tff_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_arguments; }
	}

	public final Tff_argumentsContext tff_arguments() throws RecognitionException {
		Tff_argumentsContext _localctx = new Tff_argumentsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_tff_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			tff_term();
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1069);
				comma_tff_term();
				}
				}
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comma_tff_termContext extends ParserRuleContext {
		public Tff_termContext tff_term() {
			return getRuleContext(Tff_termContext.class,0);
		}
		public Comma_tff_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_tff_term; }
	}

	public final Comma_tff_termContext comma_tff_term() throws RecognitionException {
		Comma_tff_termContext _localctx = new Comma_tff_termContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_comma_tff_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(T__1);
			setState(1076);
			tff_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_atom_typingContext extends ParserRuleContext {
		public Typeable_atomContext typeable_atom() {
			return getRuleContext(Typeable_atomContext.class,0);
		}
		public Tff_top_level_typeContext tff_top_level_type() {
			return getRuleContext(Tff_top_level_typeContext.class,0);
		}
		public Tff_atom_typingContext tff_atom_typing() {
			return getRuleContext(Tff_atom_typingContext.class,0);
		}
		public Tff_atom_typingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_atom_typing; }
	}

	public final Tff_atom_typingContext tff_atom_typing() throws RecognitionException {
		Tff_atom_typingContext _localctx = new Tff_atom_typingContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_tff_atom_typing);
		try {
			setState(1086);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Single_quoted:
			case Back_quoted:
			case Distinct_object:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(1078);
				typeable_atom();
				setState(1079);
				match(T__15);
				setState(1080);
				tff_top_level_type();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(1082);
				match(T__11);
				setState(1083);
				tff_atom_typing();
				setState(1084);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_top_level_typeContext extends ParserRuleContext {
		public Tff_atomic_typeContext tff_atomic_type() {
			return getRuleContext(Tff_atomic_typeContext.class,0);
		}
		public Tff_non_atomic_typeContext tff_non_atomic_type() {
			return getRuleContext(Tff_non_atomic_typeContext.class,0);
		}
		public Tff_top_level_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_top_level_type; }
	}

	public final Tff_top_level_typeContext tff_top_level_type() throws RecognitionException {
		Tff_top_level_typeContext _localctx = new Tff_top_level_typeContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_tff_top_level_type);
		try {
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				tff_atomic_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
				tff_non_atomic_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_non_atomic_typeContext extends ParserRuleContext {
		public Tff_mapping_typeContext tff_mapping_type() {
			return getRuleContext(Tff_mapping_typeContext.class,0);
		}
		public Tf1_quantified_typeContext tf1_quantified_type() {
			return getRuleContext(Tf1_quantified_typeContext.class,0);
		}
		public Tff_non_atomic_typeContext tff_non_atomic_type() {
			return getRuleContext(Tff_non_atomic_typeContext.class,0);
		}
		public Tff_non_atomic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_non_atomic_type; }
	}

	public final Tff_non_atomic_typeContext tff_non_atomic_type() throws RecognitionException {
		Tff_non_atomic_typeContext _localctx = new Tff_non_atomic_typeContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_tff_non_atomic_type);
		try {
			setState(1098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1092);
				tff_mapping_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1093);
				tf1_quantified_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1094);
				match(T__11);
				setState(1095);
				tff_non_atomic_type();
				setState(1096);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tf1_quantified_typeContext extends ParserRuleContext {
		public Type_quantifierContext type_quantifier() {
			return getRuleContext(Type_quantifierContext.class,0);
		}
		public Tff_variable_listContext tff_variable_list() {
			return getRuleContext(Tff_variable_listContext.class,0);
		}
		public Tff_monotypeContext tff_monotype() {
			return getRuleContext(Tff_monotypeContext.class,0);
		}
		public Tf1_quantified_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tf1_quantified_type; }
	}

	public final Tf1_quantified_typeContext tf1_quantified_type() throws RecognitionException {
		Tf1_quantified_typeContext _localctx = new Tf1_quantified_typeContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_tf1_quantified_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			type_quantifier();
			setState(1101);
			match(T__13);
			setState(1102);
			tff_variable_list();
			setState(1103);
			match(T__14);
			setState(1104);
			match(T__15);
			setState(1105);
			tff_monotype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_monotypeContext extends ParserRuleContext {
		public Tff_atomic_typeContext tff_atomic_type() {
			return getRuleContext(Tff_atomic_typeContext.class,0);
		}
		public Tff_mapping_typeContext tff_mapping_type() {
			return getRuleContext(Tff_mapping_typeContext.class,0);
		}
		public Tf1_quantified_typeContext tf1_quantified_type() {
			return getRuleContext(Tf1_quantified_typeContext.class,0);
		}
		public Tff_monotypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_monotype; }
	}

	public final Tff_monotypeContext tff_monotype() throws RecognitionException {
		Tff_monotypeContext _localctx = new Tff_monotypeContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_tff_monotype);
		try {
			setState(1113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1107);
				tff_atomic_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1108);
				match(T__11);
				setState(1109);
				tff_mapping_type();
				setState(1110);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1112);
				tf1_quantified_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_unitary_typeContext extends ParserRuleContext {
		public Tff_atomic_typeContext tff_atomic_type() {
			return getRuleContext(Tff_atomic_typeContext.class,0);
		}
		public Tff_xprod_typeContext tff_xprod_type() {
			return getRuleContext(Tff_xprod_typeContext.class,0);
		}
		public Tff_unitary_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_unitary_type; }
	}

	public final Tff_unitary_typeContext tff_unitary_type() throws RecognitionException {
		Tff_unitary_typeContext _localctx = new Tff_unitary_typeContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_tff_unitary_type);
		try {
			setState(1120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1115);
				tff_atomic_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1116);
				match(T__11);
				setState(1117);
				tff_xprod_type(0);
				setState(1118);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_atomic_typeContext extends ParserRuleContext {
		public Type_constantContext type_constant() {
			return getRuleContext(Type_constantContext.class,0);
		}
		public Defined_typeContext defined_type() {
			return getRuleContext(Defined_typeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Type_functorContext type_functor() {
			return getRuleContext(Type_functorContext.class,0);
		}
		public Tff_type_argumentsContext tff_type_arguments() {
			return getRuleContext(Tff_type_argumentsContext.class,0);
		}
		public Tff_atomic_typeContext tff_atomic_type() {
			return getRuleContext(Tff_atomic_typeContext.class,0);
		}
		public Txf_tuple_typeContext txf_tuple_type() {
			return getRuleContext(Txf_tuple_typeContext.class,0);
		}
		public Tff_atomic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_atomic_type; }
	}

	public final Tff_atomic_typeContext tff_atomic_type() throws RecognitionException {
		Tff_atomic_typeContext _localctx = new Tff_atomic_typeContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_tff_atomic_type);
		try {
			setState(1135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1122);
				type_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				defined_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1124);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1125);
				type_functor();
				setState(1126);
				match(T__11);
				setState(1127);
				tff_type_arguments();
				setState(1128);
				match(T__12);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1130);
				match(T__11);
				setState(1131);
				tff_atomic_type();
				setState(1132);
				match(T__12);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1134);
				txf_tuple_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_type_argumentsContext extends ParserRuleContext {
		public Tff_atomic_typeContext tff_atomic_type() {
			return getRuleContext(Tff_atomic_typeContext.class,0);
		}
		public Tff_type_argumentsContext tff_type_arguments() {
			return getRuleContext(Tff_type_argumentsContext.class,0);
		}
		public Tff_type_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_type_arguments; }
	}

	public final Tff_type_argumentsContext tff_type_arguments() throws RecognitionException {
		Tff_type_argumentsContext _localctx = new Tff_type_argumentsContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_tff_type_arguments);
		try {
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1137);
				tff_atomic_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				tff_atomic_type();
				setState(1139);
				match(T__1);
				setState(1140);
				tff_type_arguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_mapping_typeContext extends ParserRuleContext {
		public Tff_unitary_typeContext tff_unitary_type() {
			return getRuleContext(Tff_unitary_typeContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(TPTPParser.Arrow, 0); }
		public Tff_atomic_typeContext tff_atomic_type() {
			return getRuleContext(Tff_atomic_typeContext.class,0);
		}
		public Tff_mapping_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_mapping_type; }
	}

	public final Tff_mapping_typeContext tff_mapping_type() throws RecognitionException {
		Tff_mapping_typeContext _localctx = new Tff_mapping_typeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_tff_mapping_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			tff_unitary_type();
			setState(1145);
			match(Arrow);
			setState(1146);
			tff_atomic_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_xprod_typeContext extends ParserRuleContext {
		public Tff_unitary_typeContext tff_unitary_type() {
			return getRuleContext(Tff_unitary_typeContext.class,0);
		}
		public TerminalNode Star() { return getToken(TPTPParser.Star, 0); }
		public Tff_atomic_typeContext tff_atomic_type() {
			return getRuleContext(Tff_atomic_typeContext.class,0);
		}
		public Tff_xprod_typeContext tff_xprod_type() {
			return getRuleContext(Tff_xprod_typeContext.class,0);
		}
		public Tff_xprod_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_xprod_type; }
	}

	public final Tff_xprod_typeContext tff_xprod_type() throws RecognitionException {
		return tff_xprod_type(0);
	}

	private Tff_xprod_typeContext tff_xprod_type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tff_xprod_typeContext _localctx = new Tff_xprod_typeContext(_ctx, _parentState);
		Tff_xprod_typeContext _prevctx = _localctx;
		int _startState = 212;
		enterRecursionRule(_localctx, 212, RULE_tff_xprod_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1149);
			tff_unitary_type();
			setState(1150);
			match(Star);
			setState(1151);
			tff_atomic_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(1158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Tff_xprod_typeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tff_xprod_type);
					setState(1153);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1154);
					match(Star);
					setState(1155);
					tff_atomic_type();
					}
					} 
				}
				setState(1160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Txf_tuple_typeContext extends ParserRuleContext {
		public Tff_type_listContext tff_type_list() {
			return getRuleContext(Tff_type_listContext.class,0);
		}
		public Txf_tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txf_tuple_type; }
	}

	public final Txf_tuple_typeContext txf_tuple_type() throws RecognitionException {
		Txf_tuple_typeContext _localctx = new Txf_tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_txf_tuple_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			match(T__13);
			setState(1162);
			tff_type_list();
			setState(1163);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_type_listContext extends ParserRuleContext {
		public Tff_top_level_typeContext tff_top_level_type() {
			return getRuleContext(Tff_top_level_typeContext.class,0);
		}
		public Tff_type_listContext tff_type_list() {
			return getRuleContext(Tff_type_listContext.class,0);
		}
		public Tff_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_type_list; }
	}

	public final Tff_type_listContext tff_type_list() throws RecognitionException {
		Tff_type_listContext _localctx = new Tff_type_listContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_tff_type_list);
		try {
			setState(1170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1165);
				tff_top_level_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1166);
				tff_top_level_type();
				setState(1167);
				match(T__1);
				setState(1168);
				tff_type_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_subtypeContext extends ParserRuleContext {
		public List<Atomic_typeContext> atomic_type() {
			return getRuleContexts(Atomic_typeContext.class);
		}
		public Atomic_typeContext atomic_type(int i) {
			return getRuleContext(Atomic_typeContext.class,i);
		}
		public Subtype_signContext subtype_sign() {
			return getRuleContext(Subtype_signContext.class,0);
		}
		public Tff_subtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_subtype; }
	}

	public final Tff_subtypeContext tff_subtype() throws RecognitionException {
		Tff_subtypeContext _localctx = new Tff_subtypeContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_tff_subtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			atomic_type();
			setState(1173);
			subtype_sign();
			setState(1174);
			atomic_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Txf_definitionContext extends ParserRuleContext {
		public Tff_atomic_formulaContext tff_atomic_formula() {
			return getRuleContext(Tff_atomic_formulaContext.class,0);
		}
		public IdenticalContext identical() {
			return getRuleContext(IdenticalContext.class,0);
		}
		public Tff_termContext tff_term() {
			return getRuleContext(Tff_termContext.class,0);
		}
		public Txf_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txf_definition; }
	}

	public final Txf_definitionContext txf_definition() throws RecognitionException {
		Txf_definitionContext _localctx = new Txf_definitionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_txf_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			tff_atomic_formula();
			setState(1177);
			identical();
			setState(1178);
			tff_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Txf_sequentContext extends ParserRuleContext {
		public List<Txf_tupleContext> txf_tuple() {
			return getRuleContexts(Txf_tupleContext.class);
		}
		public Txf_tupleContext txf_tuple(int i) {
			return getRuleContext(Txf_tupleContext.class,i);
		}
		public Gentzen_arrowContext gentzen_arrow() {
			return getRuleContext(Gentzen_arrowContext.class,0);
		}
		public Txf_sequentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txf_sequent; }
	}

	public final Txf_sequentContext txf_sequent() throws RecognitionException {
		Txf_sequentContext _localctx = new Txf_sequentContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_txf_sequent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			txf_tuple();
			setState(1181);
			gentzen_arrow();
			setState(1182);
			txf_tuple();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nhf_long_connectiveContext extends ParserRuleContext {
		public Ntf_connective_nameContext ntf_connective_name() {
			return getRuleContext(Ntf_connective_nameContext.class,0);
		}
		public Nhf_parameter_listContext nhf_parameter_list() {
			return getRuleContext(Nhf_parameter_listContext.class,0);
		}
		public Nhf_long_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nhf_long_connective; }
	}

	public final Nhf_long_connectiveContext nhf_long_connective() throws RecognitionException {
		Nhf_long_connectiveContext _localctx = new Nhf_long_connectiveContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_nhf_long_connective);
		try {
			setState(1194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1184);
				match(T__18);
				setState(1185);
				ntf_connective_name();
				setState(1186);
				match(T__19);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1188);
				match(T__18);
				setState(1189);
				ntf_connective_name();
				setState(1190);
				match(T__11);
				setState(1191);
				nhf_parameter_list();
				setState(1192);
				match(T__20);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nhf_parameter_listContext extends ParserRuleContext {
		public Nhf_parameterContext nhf_parameter() {
			return getRuleContext(Nhf_parameterContext.class,0);
		}
		public Nhf_parameter_listContext nhf_parameter_list() {
			return getRuleContext(Nhf_parameter_listContext.class,0);
		}
		public Nhf_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nhf_parameter_list; }
	}

	public final Nhf_parameter_listContext nhf_parameter_list() throws RecognitionException {
		Nhf_parameter_listContext _localctx = new Nhf_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_nhf_parameter_list);
		try {
			setState(1201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1196);
				nhf_parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1197);
				nhf_parameter();
				setState(1198);
				match(T__1);
				setState(1199);
				nhf_parameter_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nhf_parameterContext extends ParserRuleContext {
		public Ntf_indexContext ntf_index() {
			return getRuleContext(Ntf_indexContext.class,0);
		}
		public Nhf_key_pairContext nhf_key_pair() {
			return getRuleContext(Nhf_key_pairContext.class,0);
		}
		public Nhf_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nhf_parameter; }
	}

	public final Nhf_parameterContext nhf_parameter() throws RecognitionException {
		Nhf_parameterContext _localctx = new Nhf_parameterContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_nhf_parameter);
		try {
			setState(1205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Hash:
				enterOuterAlt(_localctx, 1);
				{
				setState(1203);
				ntf_index();
				}
				break;
			case T__11:
			case T__13:
			case T__16:
			case T__17:
			case T__18:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case Single_quoted:
			case Back_quoted:
			case Distinct_object:
			case Dollar_word:
			case Dollar_dollar_word:
			case Lower_word:
			case Real:
			case Rational:
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(1204);
				nhf_key_pair();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nhf_key_pairContext extends ParserRuleContext {
		public Thf_definitionContext thf_definition() {
			return getRuleContext(Thf_definitionContext.class,0);
		}
		public Nhf_key_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nhf_key_pair; }
	}

	public final Nhf_key_pairContext nhf_key_pair() throws RecognitionException {
		Nhf_key_pairContext _localctx = new Nhf_key_pairContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_nhf_key_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			thf_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nxf_long_connectiveContext extends ParserRuleContext {
		public Ntf_connective_nameContext ntf_connective_name() {
			return getRuleContext(Ntf_connective_nameContext.class,0);
		}
		public Nxf_parameter_listContext nxf_parameter_list() {
			return getRuleContext(Nxf_parameter_listContext.class,0);
		}
		public Nxf_long_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nxf_long_connective; }
	}

	public final Nxf_long_connectiveContext nxf_long_connective() throws RecognitionException {
		Nxf_long_connectiveContext _localctx = new Nxf_long_connectiveContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_nxf_long_connective);
		try {
			setState(1219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1209);
				match(T__18);
				setState(1210);
				ntf_connective_name();
				setState(1211);
				match(T__19);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1213);
				match(T__18);
				setState(1214);
				ntf_connective_name();
				setState(1215);
				match(T__11);
				setState(1216);
				nxf_parameter_list();
				setState(1217);
				match(T__20);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nxf_parameter_listContext extends ParserRuleContext {
		public Nxf_parameterContext nxf_parameter() {
			return getRuleContext(Nxf_parameterContext.class,0);
		}
		public Nxf_parameter_listContext nxf_parameter_list() {
			return getRuleContext(Nxf_parameter_listContext.class,0);
		}
		public Nxf_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nxf_parameter_list; }
	}

	public final Nxf_parameter_listContext nxf_parameter_list() throws RecognitionException {
		Nxf_parameter_listContext _localctx = new Nxf_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_nxf_parameter_list);
		try {
			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1221);
				nxf_parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1222);
				nxf_parameter();
				setState(1223);
				match(T__1);
				setState(1224);
				nxf_parameter_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nxf_parameterContext extends ParserRuleContext {
		public Ntf_indexContext ntf_index() {
			return getRuleContext(Ntf_indexContext.class,0);
		}
		public Nxf_key_pairContext nxf_key_pair() {
			return getRuleContext(Nxf_key_pairContext.class,0);
		}
		public Nxf_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nxf_parameter; }
	}

	public final Nxf_parameterContext nxf_parameter() throws RecognitionException {
		Nxf_parameterContext _localctx = new Nxf_parameterContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_nxf_parameter);
		try {
			setState(1230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Hash:
				enterOuterAlt(_localctx, 1);
				{
				setState(1228);
				ntf_index();
				}
				break;
			case T__16:
			case T__18:
			case Single_quoted:
			case Back_quoted:
			case Dollar_word:
			case Dollar_dollar_word:
			case Lower_word:
				enterOuterAlt(_localctx, 2);
				{
				setState(1229);
				nxf_key_pair();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nxf_key_pairContext extends ParserRuleContext {
		public Txf_definitionContext txf_definition() {
			return getRuleContext(Txf_definitionContext.class,0);
		}
		public Nxf_key_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nxf_key_pair; }
	}

	public final Nxf_key_pairContext nxf_key_pair() throws RecognitionException {
		Nxf_key_pairContext _localctx = new Nxf_key_pairContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_nxf_key_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			txf_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ntf_connective_nameContext extends ParserRuleContext {
		public Ntf_defined_connectiveContext ntf_defined_connective() {
			return getRuleContext(Ntf_defined_connectiveContext.class,0);
		}
		public Atomic_system_wordContext atomic_system_word() {
			return getRuleContext(Atomic_system_wordContext.class,0);
		}
		public Ntf_connective_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ntf_connective_name; }
	}

	public final Ntf_connective_nameContext ntf_connective_name() throws RecognitionException {
		Ntf_connective_nameContext _localctx = new Ntf_connective_nameContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_ntf_connective_name);
		try {
			setState(1236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(1234);
				ntf_defined_connective();
				}
				break;
			case Dollar_dollar_word:
				enterOuterAlt(_localctx, 2);
				{
				setState(1235);
				atomic_system_word();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ntf_defined_connectiveContext extends ParserRuleContext {
		public Atomic_defined_wordContext atomic_defined_word() {
			return getRuleContext(Atomic_defined_wordContext.class,0);
		}
		public Ntf_defined_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ntf_defined_connective; }
	}

	public final Ntf_defined_connectiveContext ntf_defined_connective() throws RecognitionException {
		Ntf_defined_connectiveContext _localctx = new Ntf_defined_connectiveContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_ntf_defined_connective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			atomic_defined_word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ntf_indexContext extends ParserRuleContext {
		public TerminalNode Hash() { return getToken(TPTPParser.Hash, 0); }
		public Tff_unitary_termContext tff_unitary_term() {
			return getRuleContext(Tff_unitary_termContext.class,0);
		}
		public Ntf_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ntf_index; }
	}

	public final Ntf_indexContext ntf_index() throws RecognitionException {
		Ntf_indexContext _localctx = new Ntf_indexContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_ntf_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			match(Hash);
			setState(1241);
			tff_unitary_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ntf_short_connectiveContext extends ParserRuleContext {
		public TerminalNode Less_sign() { return getToken(TPTPParser.Less_sign, 0); }
		public TerminalNode Arrow() { return getToken(TPTPParser.Arrow, 0); }
		public Ntf_short_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ntf_short_connective; }
	}

	public final Ntf_short_connectiveContext ntf_short_connective() throws RecognitionException {
		Ntf_short_connectiveContext _localctx = new Ntf_short_connectiveContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_ntf_short_connective);
		try {
			setState(1249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(1243);
				match(T__21);
				}
				break;
			case Less_sign:
				enterOuterAlt(_localctx, 2);
				{
				setState(1244);
				match(Less_sign);
				setState(1245);
				match(T__22);
				setState(1246);
				match(Arrow);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(1247);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(1248);
				match(T__24);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tcf_formulaContext extends ParserRuleContext {
		public Tcf_logic_formulaContext tcf_logic_formula() {
			return getRuleContext(Tcf_logic_formulaContext.class,0);
		}
		public Tff_atom_typingContext tff_atom_typing() {
			return getRuleContext(Tff_atom_typingContext.class,0);
		}
		public Tcf_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tcf_formula; }
	}

	public final Tcf_formulaContext tcf_formula() throws RecognitionException {
		Tcf_formulaContext _localctx = new Tcf_formulaContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_tcf_formula);
		try {
			setState(1253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1251);
				tcf_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1252);
				tff_atom_typing();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tcf_logic_formulaContext extends ParserRuleContext {
		public Tcf_quantified_formulaContext tcf_quantified_formula() {
			return getRuleContext(Tcf_quantified_formulaContext.class,0);
		}
		public Cnf_formulaContext cnf_formula() {
			return getRuleContext(Cnf_formulaContext.class,0);
		}
		public Tcf_logic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tcf_logic_formula; }
	}

	public final Tcf_logic_formulaContext tcf_logic_formula() throws RecognitionException {
		Tcf_logic_formulaContext _localctx = new Tcf_logic_formulaContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_tcf_logic_formula);
		try {
			setState(1257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(1255);
				tcf_quantified_formula();
				}
				break;
			case T__11:
			case T__26:
			case Single_quoted:
			case Back_quoted:
			case Distinct_object:
			case Dollar_word:
			case Dollar_dollar_word:
			case Upper_word:
			case Lower_word:
			case Real:
			case Rational:
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(1256);
				cnf_formula();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tcf_quantified_formulaContext extends ParserRuleContext {
		public Tff_variable_listContext tff_variable_list() {
			return getRuleContext(Tff_variable_listContext.class,0);
		}
		public Tcf_logic_formulaContext tcf_logic_formula() {
			return getRuleContext(Tcf_logic_formulaContext.class,0);
		}
		public Tcf_quantified_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tcf_quantified_formula; }
	}

	public final Tcf_quantified_formulaContext tcf_quantified_formula() throws RecognitionException {
		Tcf_quantified_formulaContext _localctx = new Tcf_quantified_formulaContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_tcf_quantified_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			match(T__25);
			setState(1260);
			match(T__13);
			setState(1261);
			tff_variable_list();
			setState(1262);
			match(T__14);
			setState(1263);
			match(T__15);
			setState(1264);
			tcf_logic_formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_formulaContext extends ParserRuleContext {
		public Fof_logic_formulaContext fof_logic_formula() {
			return getRuleContext(Fof_logic_formulaContext.class,0);
		}
		public Fof_sequentContext fof_sequent() {
			return getRuleContext(Fof_sequentContext.class,0);
		}
		public Fof_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_formula; }
	}

	public final Fof_formulaContext fof_formula() throws RecognitionException {
		Fof_formulaContext _localctx = new Fof_formulaContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_fof_formula);
		try {
			setState(1268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1266);
				fof_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1267);
				fof_sequent();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_logic_formulaContext extends ParserRuleContext {
		public Fof_binary_formulaContext fof_binary_formula() {
			return getRuleContext(Fof_binary_formulaContext.class,0);
		}
		public Fof_unary_formulaContext fof_unary_formula() {
			return getRuleContext(Fof_unary_formulaContext.class,0);
		}
		public Fof_unitary_formulaContext fof_unitary_formula() {
			return getRuleContext(Fof_unitary_formulaContext.class,0);
		}
		public Fof_logic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_logic_formula; }
	}

	public final Fof_logic_formulaContext fof_logic_formula() throws RecognitionException {
		Fof_logic_formulaContext _localctx = new Fof_logic_formulaContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_fof_logic_formula);
		try {
			setState(1273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1270);
				fof_binary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1271);
				fof_unary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1272);
				fof_unitary_formula();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_binary_formulaContext extends ParserRuleContext {
		public Fof_binary_nonassocContext fof_binary_nonassoc() {
			return getRuleContext(Fof_binary_nonassocContext.class,0);
		}
		public Fof_binary_assocContext fof_binary_assoc() {
			return getRuleContext(Fof_binary_assocContext.class,0);
		}
		public Fof_binary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_binary_formula; }
	}

	public final Fof_binary_formulaContext fof_binary_formula() throws RecognitionException {
		Fof_binary_formulaContext _localctx = new Fof_binary_formulaContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_fof_binary_formula);
		try {
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1275);
				fof_binary_nonassoc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1276);
				fof_binary_assoc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_binary_nonassocContext extends ParserRuleContext {
		public List<Fof_unit_formulaContext> fof_unit_formula() {
			return getRuleContexts(Fof_unit_formulaContext.class);
		}
		public Fof_unit_formulaContext fof_unit_formula(int i) {
			return getRuleContext(Fof_unit_formulaContext.class,i);
		}
		public Nonassoc_connectiveContext nonassoc_connective() {
			return getRuleContext(Nonassoc_connectiveContext.class,0);
		}
		public Fof_binary_nonassocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_binary_nonassoc; }
	}

	public final Fof_binary_nonassocContext fof_binary_nonassoc() throws RecognitionException {
		Fof_binary_nonassocContext _localctx = new Fof_binary_nonassocContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_fof_binary_nonassoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			fof_unit_formula();
			setState(1280);
			nonassoc_connective();
			setState(1281);
			fof_unit_formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_binary_assocContext extends ParserRuleContext {
		public Fof_or_formulaContext fof_or_formula() {
			return getRuleContext(Fof_or_formulaContext.class,0);
		}
		public Fof_and_formulaContext fof_and_formula() {
			return getRuleContext(Fof_and_formulaContext.class,0);
		}
		public Fof_binary_assocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_binary_assoc; }
	}

	public final Fof_binary_assocContext fof_binary_assoc() throws RecognitionException {
		Fof_binary_assocContext _localctx = new Fof_binary_assocContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_fof_binary_assoc);
		try {
			setState(1285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1283);
				fof_or_formula(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1284);
				fof_and_formula(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_or_formulaContext extends ParserRuleContext {
		public List<Fof_unit_formulaContext> fof_unit_formula() {
			return getRuleContexts(Fof_unit_formulaContext.class);
		}
		public Fof_unit_formulaContext fof_unit_formula(int i) {
			return getRuleContext(Fof_unit_formulaContext.class,i);
		}
		public TerminalNode Vline() { return getToken(TPTPParser.Vline, 0); }
		public Fof_or_formulaContext fof_or_formula() {
			return getRuleContext(Fof_or_formulaContext.class,0);
		}
		public Fof_or_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_or_formula; }
	}

	public final Fof_or_formulaContext fof_or_formula() throws RecognitionException {
		return fof_or_formula(0);
	}

	private Fof_or_formulaContext fof_or_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Fof_or_formulaContext _localctx = new Fof_or_formulaContext(_ctx, _parentState);
		Fof_or_formulaContext _prevctx = _localctx;
		int _startState = 264;
		enterRecursionRule(_localctx, 264, RULE_fof_or_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1288);
			fof_unit_formula();
			setState(1289);
			match(Vline);
			setState(1290);
			fof_unit_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(1297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Fof_or_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fof_or_formula);
					setState(1292);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1293);
					match(Vline);
					setState(1294);
					fof_unit_formula();
					}
					} 
				}
				setState(1299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_and_formulaContext extends ParserRuleContext {
		public List<Fof_unit_formulaContext> fof_unit_formula() {
			return getRuleContexts(Fof_unit_formulaContext.class);
		}
		public Fof_unit_formulaContext fof_unit_formula(int i) {
			return getRuleContext(Fof_unit_formulaContext.class,i);
		}
		public Fof_and_formulaContext fof_and_formula() {
			return getRuleContext(Fof_and_formulaContext.class,0);
		}
		public Fof_and_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_and_formula; }
	}

	public final Fof_and_formulaContext fof_and_formula() throws RecognitionException {
		return fof_and_formula(0);
	}

	private Fof_and_formulaContext fof_and_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Fof_and_formulaContext _localctx = new Fof_and_formulaContext(_ctx, _parentState);
		Fof_and_formulaContext _prevctx = _localctx;
		int _startState = 266;
		enterRecursionRule(_localctx, 266, RULE_fof_and_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1301);
			fof_unit_formula();
			setState(1302);
			match(T__9);
			setState(1303);
			fof_unit_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(1310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Fof_and_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fof_and_formula);
					setState(1305);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1306);
					match(T__9);
					setState(1307);
					fof_unit_formula();
					}
					} 
				}
				setState(1312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_unary_formulaContext extends ParserRuleContext {
		public Unary_connectiveContext unary_connective() {
			return getRuleContext(Unary_connectiveContext.class,0);
		}
		public Fof_unit_formulaContext fof_unit_formula() {
			return getRuleContext(Fof_unit_formulaContext.class,0);
		}
		public Fof_infix_unaryContext fof_infix_unary() {
			return getRuleContext(Fof_infix_unaryContext.class,0);
		}
		public Fof_unary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_unary_formula; }
	}

	public final Fof_unary_formulaContext fof_unary_formula() throws RecognitionException {
		Fof_unary_formulaContext _localctx = new Fof_unary_formulaContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_fof_unary_formula);
		try {
			setState(1317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(1313);
				unary_connective();
				setState(1314);
				fof_unit_formula();
				}
				break;
			case Single_quoted:
			case Back_quoted:
			case Distinct_object:
			case Dollar_word:
			case Dollar_dollar_word:
			case Upper_word:
			case Lower_word:
			case Real:
			case Rational:
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(1316);
				fof_infix_unary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_infix_unaryContext extends ParserRuleContext {
		public List<Fof_termContext> fof_term() {
			return getRuleContexts(Fof_termContext.class);
		}
		public Fof_termContext fof_term(int i) {
			return getRuleContext(Fof_termContext.class,i);
		}
		public Infix_inequalityContext infix_inequality() {
			return getRuleContext(Infix_inequalityContext.class,0);
		}
		public Fof_infix_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_infix_unary; }
	}

	public final Fof_infix_unaryContext fof_infix_unary() throws RecognitionException {
		Fof_infix_unaryContext _localctx = new Fof_infix_unaryContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_fof_infix_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			fof_term();
			setState(1320);
			infix_inequality();
			setState(1321);
			fof_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_unit_formulaContext extends ParserRuleContext {
		public Fof_unitary_formulaContext fof_unitary_formula() {
			return getRuleContext(Fof_unitary_formulaContext.class,0);
		}
		public Fof_unary_formulaContext fof_unary_formula() {
			return getRuleContext(Fof_unary_formulaContext.class,0);
		}
		public Fof_unit_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_unit_formula; }
	}

	public final Fof_unit_formulaContext fof_unit_formula() throws RecognitionException {
		Fof_unit_formulaContext _localctx = new Fof_unit_formulaContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_fof_unit_formula);
		try {
			setState(1325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1323);
				fof_unitary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1324);
				fof_unary_formula();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_unitary_formulaContext extends ParserRuleContext {
		public Fof_quantified_formulaContext fof_quantified_formula() {
			return getRuleContext(Fof_quantified_formulaContext.class,0);
		}
		public Fof_atomic_formulaContext fof_atomic_formula() {
			return getRuleContext(Fof_atomic_formulaContext.class,0);
		}
		public Fof_logic_formulaContext fof_logic_formula() {
			return getRuleContext(Fof_logic_formulaContext.class,0);
		}
		public Fof_unitary_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_unitary_formula; }
	}

	public final Fof_unitary_formulaContext fof_unitary_formula() throws RecognitionException {
		Fof_unitary_formulaContext _localctx = new Fof_unitary_formulaContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_fof_unitary_formula);
		try {
			setState(1333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(1327);
				fof_quantified_formula();
				}
				break;
			case Single_quoted:
			case Back_quoted:
			case Distinct_object:
			case Dollar_word:
			case Dollar_dollar_word:
			case Upper_word:
			case Lower_word:
			case Real:
			case Rational:
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(1328);
				fof_atomic_formula();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(1329);
				match(T__11);
				setState(1330);
				fof_logic_formula();
				setState(1331);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_quantified_formulaContext extends ParserRuleContext {
		public Fof_quantifierContext fof_quantifier() {
			return getRuleContext(Fof_quantifierContext.class,0);
		}
		public Fof_variable_listContext fof_variable_list() {
			return getRuleContext(Fof_variable_listContext.class,0);
		}
		public Fof_unit_formulaContext fof_unit_formula() {
			return getRuleContext(Fof_unit_formulaContext.class,0);
		}
		public Fof_quantified_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_quantified_formula; }
	}

	public final Fof_quantified_formulaContext fof_quantified_formula() throws RecognitionException {
		Fof_quantified_formulaContext _localctx = new Fof_quantified_formulaContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_fof_quantified_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			fof_quantifier();
			setState(1336);
			match(T__13);
			setState(1337);
			fof_variable_list();
			setState(1338);
			match(T__14);
			setState(1339);
			match(T__15);
			setState(1340);
			fof_unit_formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_variable_listContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Fof_variable_listContext fof_variable_list() {
			return getRuleContext(Fof_variable_listContext.class,0);
		}
		public Fof_variable_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_variable_list; }
	}

	public final Fof_variable_listContext fof_variable_list() throws RecognitionException {
		Fof_variable_listContext _localctx = new Fof_variable_listContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_fof_variable_list);
		try {
			setState(1347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1342);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1343);
				variable();
				setState(1344);
				match(T__1);
				setState(1345);
				fof_variable_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_atomic_formulaContext extends ParserRuleContext {
		public Fof_plain_atomic_formulaContext fof_plain_atomic_formula() {
			return getRuleContext(Fof_plain_atomic_formulaContext.class,0);
		}
		public Fof_defined_atomic_formulaContext fof_defined_atomic_formula() {
			return getRuleContext(Fof_defined_atomic_formulaContext.class,0);
		}
		public Fof_system_atomic_formulaContext fof_system_atomic_formula() {
			return getRuleContext(Fof_system_atomic_formulaContext.class,0);
		}
		public Fof_atomic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_atomic_formula; }
	}

	public final Fof_atomic_formulaContext fof_atomic_formula() throws RecognitionException {
		Fof_atomic_formulaContext _localctx = new Fof_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_fof_atomic_formula);
		try {
			setState(1352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1349);
				fof_plain_atomic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1350);
				fof_defined_atomic_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1351);
				fof_system_atomic_formula();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_plain_atomic_formulaContext extends ParserRuleContext {
		public Fof_plain_termContext fof_plain_term() {
			return getRuleContext(Fof_plain_termContext.class,0);
		}
		public Fof_plain_atomic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_plain_atomic_formula; }
	}

	public final Fof_plain_atomic_formulaContext fof_plain_atomic_formula() throws RecognitionException {
		Fof_plain_atomic_formulaContext _localctx = new Fof_plain_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_fof_plain_atomic_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			fof_plain_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_defined_atomic_formulaContext extends ParserRuleContext {
		public Fof_defined_plain_formulaContext fof_defined_plain_formula() {
			return getRuleContext(Fof_defined_plain_formulaContext.class,0);
		}
		public Fof_defined_infix_formulaContext fof_defined_infix_formula() {
			return getRuleContext(Fof_defined_infix_formulaContext.class,0);
		}
		public Fof_defined_atomic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_defined_atomic_formula; }
	}

	public final Fof_defined_atomic_formulaContext fof_defined_atomic_formula() throws RecognitionException {
		Fof_defined_atomic_formulaContext _localctx = new Fof_defined_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_fof_defined_atomic_formula);
		try {
			setState(1358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1356);
				fof_defined_plain_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				fof_defined_infix_formula();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_defined_plain_formulaContext extends ParserRuleContext {
		public Fof_defined_plain_termContext fof_defined_plain_term() {
			return getRuleContext(Fof_defined_plain_termContext.class,0);
		}
		public Fof_defined_plain_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_defined_plain_formula; }
	}

	public final Fof_defined_plain_formulaContext fof_defined_plain_formula() throws RecognitionException {
		Fof_defined_plain_formulaContext _localctx = new Fof_defined_plain_formulaContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_fof_defined_plain_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			fof_defined_plain_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_defined_infix_formulaContext extends ParserRuleContext {
		public List<Fof_termContext> fof_term() {
			return getRuleContexts(Fof_termContext.class);
		}
		public Fof_termContext fof_term(int i) {
			return getRuleContext(Fof_termContext.class,i);
		}
		public Defined_infix_predContext defined_infix_pred() {
			return getRuleContext(Defined_infix_predContext.class,0);
		}
		public Fof_defined_infix_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_defined_infix_formula; }
	}

	public final Fof_defined_infix_formulaContext fof_defined_infix_formula() throws RecognitionException {
		Fof_defined_infix_formulaContext _localctx = new Fof_defined_infix_formulaContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_fof_defined_infix_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			fof_term();
			setState(1363);
			defined_infix_pred();
			setState(1364);
			fof_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_system_atomic_formulaContext extends ParserRuleContext {
		public Fof_system_termContext fof_system_term() {
			return getRuleContext(Fof_system_termContext.class,0);
		}
		public Fof_system_atomic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_system_atomic_formula; }
	}

	public final Fof_system_atomic_formulaContext fof_system_atomic_formula() throws RecognitionException {
		Fof_system_atomic_formulaContext _localctx = new Fof_system_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_fof_system_atomic_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			fof_system_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_plain_termContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FunctorContext functor() {
			return getRuleContext(FunctorContext.class,0);
		}
		public Fof_argumentsContext fof_arguments() {
			return getRuleContext(Fof_argumentsContext.class,0);
		}
		public Fof_plain_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_plain_term; }
	}

	public final Fof_plain_termContext fof_plain_term() throws RecognitionException {
		Fof_plain_termContext _localctx = new Fof_plain_termContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_fof_plain_term);
		try {
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1368);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1369);
				functor();
				setState(1370);
				match(T__11);
				setState(1371);
				fof_arguments();
				setState(1372);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_defined_termContext extends ParserRuleContext {
		public Defined_termContext defined_term() {
			return getRuleContext(Defined_termContext.class,0);
		}
		public Fof_defined_atomic_termContext fof_defined_atomic_term() {
			return getRuleContext(Fof_defined_atomic_termContext.class,0);
		}
		public Fof_defined_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_defined_term; }
	}

	public final Fof_defined_termContext fof_defined_term() throws RecognitionException {
		Fof_defined_termContext _localctx = new Fof_defined_termContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_fof_defined_term);
		try {
			setState(1378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Distinct_object:
			case Real:
			case Rational:
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(1376);
				defined_term();
				}
				break;
			case Dollar_word:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
				fof_defined_atomic_term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_defined_atomic_termContext extends ParserRuleContext {
		public Fof_defined_plain_termContext fof_defined_plain_term() {
			return getRuleContext(Fof_defined_plain_termContext.class,0);
		}
		public Fof_defined_atomic_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_defined_atomic_term; }
	}

	public final Fof_defined_atomic_termContext fof_defined_atomic_term() throws RecognitionException {
		Fof_defined_atomic_termContext _localctx = new Fof_defined_atomic_termContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_fof_defined_atomic_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			fof_defined_plain_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_defined_plain_termContext extends ParserRuleContext {
		public Defined_constantContext defined_constant() {
			return getRuleContext(Defined_constantContext.class,0);
		}
		public Defined_functorContext defined_functor() {
			return getRuleContext(Defined_functorContext.class,0);
		}
		public Fof_argumentsContext fof_arguments() {
			return getRuleContext(Fof_argumentsContext.class,0);
		}
		public Fof_defined_plain_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_defined_plain_term; }
	}

	public final Fof_defined_plain_termContext fof_defined_plain_term() throws RecognitionException {
		Fof_defined_plain_termContext _localctx = new Fof_defined_plain_termContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_fof_defined_plain_term);
		try {
			setState(1388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1382);
				defined_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1383);
				defined_functor();
				setState(1384);
				match(T__11);
				setState(1385);
				fof_arguments();
				setState(1386);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_system_termContext extends ParserRuleContext {
		public System_constantContext system_constant() {
			return getRuleContext(System_constantContext.class,0);
		}
		public System_functorContext system_functor() {
			return getRuleContext(System_functorContext.class,0);
		}
		public Fof_argumentsContext fof_arguments() {
			return getRuleContext(Fof_argumentsContext.class,0);
		}
		public Fof_system_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_system_term; }
	}

	public final Fof_system_termContext fof_system_term() throws RecognitionException {
		Fof_system_termContext _localctx = new Fof_system_termContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_fof_system_term);
		try {
			setState(1396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1390);
				system_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1391);
				system_functor();
				setState(1392);
				match(T__11);
				setState(1393);
				fof_arguments();
				setState(1394);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_argumentsContext extends ParserRuleContext {
		public Fof_termContext fof_term() {
			return getRuleContext(Fof_termContext.class,0);
		}
		public Fof_argumentsContext fof_arguments() {
			return getRuleContext(Fof_argumentsContext.class,0);
		}
		public Fof_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_arguments; }
	}

	public final Fof_argumentsContext fof_arguments() throws RecognitionException {
		Fof_argumentsContext _localctx = new Fof_argumentsContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_fof_arguments);
		try {
			setState(1403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1398);
				fof_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1399);
				fof_term();
				setState(1400);
				match(T__1);
				setState(1401);
				fof_arguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_termContext extends ParserRuleContext {
		public Fof_function_termContext fof_function_term() {
			return getRuleContext(Fof_function_termContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Fof_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_term; }
	}

	public final Fof_termContext fof_term() throws RecognitionException {
		Fof_termContext _localctx = new Fof_termContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_fof_term);
		try {
			setState(1407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Single_quoted:
			case Back_quoted:
			case Distinct_object:
			case Dollar_word:
			case Dollar_dollar_word:
			case Lower_word:
			case Real:
			case Rational:
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(1405);
				fof_function_term();
				}
				break;
			case Upper_word:
				enterOuterAlt(_localctx, 2);
				{
				setState(1406);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_function_termContext extends ParserRuleContext {
		public Fof_plain_termContext fof_plain_term() {
			return getRuleContext(Fof_plain_termContext.class,0);
		}
		public Fof_defined_termContext fof_defined_term() {
			return getRuleContext(Fof_defined_termContext.class,0);
		}
		public Fof_system_termContext fof_system_term() {
			return getRuleContext(Fof_system_termContext.class,0);
		}
		public Fof_function_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_function_term; }
	}

	public final Fof_function_termContext fof_function_term() throws RecognitionException {
		Fof_function_termContext _localctx = new Fof_function_termContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_fof_function_term);
		try {
			setState(1412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Single_quoted:
			case Back_quoted:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(1409);
				fof_plain_term();
				}
				break;
			case Distinct_object:
			case Dollar_word:
			case Real:
			case Rational:
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(1410);
				fof_defined_term();
				}
				break;
			case Dollar_dollar_word:
				enterOuterAlt(_localctx, 3);
				{
				setState(1411);
				fof_system_term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_sequentContext extends ParserRuleContext {
		public List<Fof_formula_tupleContext> fof_formula_tuple() {
			return getRuleContexts(Fof_formula_tupleContext.class);
		}
		public Fof_formula_tupleContext fof_formula_tuple(int i) {
			return getRuleContext(Fof_formula_tupleContext.class,i);
		}
		public Gentzen_arrowContext gentzen_arrow() {
			return getRuleContext(Gentzen_arrowContext.class,0);
		}
		public Fof_sequentContext fof_sequent() {
			return getRuleContext(Fof_sequentContext.class,0);
		}
		public Fof_sequentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_sequent; }
	}

	public final Fof_sequentContext fof_sequent() throws RecognitionException {
		Fof_sequentContext _localctx = new Fof_sequentContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_fof_sequent);
		try {
			setState(1422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(1414);
				fof_formula_tuple();
				setState(1415);
				gentzen_arrow();
				setState(1416);
				fof_formula_tuple();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(1418);
				match(T__11);
				setState(1419);
				fof_sequent();
				setState(1420);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_formula_tupleContext extends ParserRuleContext {
		public Fof_formula_tuple_listContext fof_formula_tuple_list() {
			return getRuleContext(Fof_formula_tuple_listContext.class,0);
		}
		public Fof_formula_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_formula_tuple; }
	}

	public final Fof_formula_tupleContext fof_formula_tuple() throws RecognitionException {
		Fof_formula_tupleContext _localctx = new Fof_formula_tupleContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_fof_formula_tuple);
		try {
			setState(1429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(1424);
				match(T__17);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(1425);
				match(T__13);
				setState(1426);
				fof_formula_tuple_list();
				setState(1427);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_formula_tuple_listContext extends ParserRuleContext {
		public Fof_logic_formulaContext fof_logic_formula() {
			return getRuleContext(Fof_logic_formulaContext.class,0);
		}
		public List<Comma_fof_logic_formulaContext> comma_fof_logic_formula() {
			return getRuleContexts(Comma_fof_logic_formulaContext.class);
		}
		public Comma_fof_logic_formulaContext comma_fof_logic_formula(int i) {
			return getRuleContext(Comma_fof_logic_formulaContext.class,i);
		}
		public Fof_formula_tuple_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_formula_tuple_list; }
	}

	public final Fof_formula_tuple_listContext fof_formula_tuple_list() throws RecognitionException {
		Fof_formula_tuple_listContext _localctx = new Fof_formula_tuple_listContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_fof_formula_tuple_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			fof_logic_formula();
			setState(1435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1432);
				comma_fof_logic_formula();
				}
				}
				setState(1437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comma_fof_logic_formulaContext extends ParserRuleContext {
		public Fof_logic_formulaContext fof_logic_formula() {
			return getRuleContext(Fof_logic_formulaContext.class,0);
		}
		public Comma_fof_logic_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_fof_logic_formula; }
	}

	public final Comma_fof_logic_formulaContext comma_fof_logic_formula() throws RecognitionException {
		Comma_fof_logic_formulaContext _localctx = new Comma_fof_logic_formulaContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_comma_fof_logic_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1438);
			match(T__1);
			setState(1439);
			fof_logic_formula();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cnf_formulaContext extends ParserRuleContext {
		public Cnf_disjunctionContext cnf_disjunction() {
			return getRuleContext(Cnf_disjunctionContext.class,0);
		}
		public Cnf_formulaContext cnf_formula() {
			return getRuleContext(Cnf_formulaContext.class,0);
		}
		public Cnf_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnf_formula; }
	}

	public final Cnf_formulaContext cnf_formula() throws RecognitionException {
		Cnf_formulaContext _localctx = new Cnf_formulaContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_cnf_formula);
		try {
			setState(1446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case Single_quoted:
			case Back_quoted:
			case Distinct_object:
			case Dollar_word:
			case Dollar_dollar_word:
			case Upper_word:
			case Lower_word:
			case Real:
			case Rational:
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(1441);
				cnf_disjunction(0);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(1442);
				match(T__11);
				setState(1443);
				cnf_formula();
				setState(1444);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cnf_disjunctionContext extends ParserRuleContext {
		public Cnf_literalContext cnf_literal() {
			return getRuleContext(Cnf_literalContext.class,0);
		}
		public Cnf_disjunctionContext cnf_disjunction() {
			return getRuleContext(Cnf_disjunctionContext.class,0);
		}
		public TerminalNode Vline() { return getToken(TPTPParser.Vline, 0); }
		public Cnf_disjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnf_disjunction; }
	}

	public final Cnf_disjunctionContext cnf_disjunction() throws RecognitionException {
		return cnf_disjunction(0);
	}

	private Cnf_disjunctionContext cnf_disjunction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Cnf_disjunctionContext _localctx = new Cnf_disjunctionContext(_ctx, _parentState);
		Cnf_disjunctionContext _prevctx = _localctx;
		int _startState = 318;
		enterRecursionRule(_localctx, 318, RULE_cnf_disjunction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1449);
			cnf_literal();
			}
			_ctx.stop = _input.LT(-1);
			setState(1456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Cnf_disjunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cnf_disjunction);
					setState(1451);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1452);
					match(Vline);
					setState(1453);
					cnf_literal();
					}
					} 
				}
				setState(1458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cnf_literalContext extends ParserRuleContext {
		public Fof_atomic_formulaContext fof_atomic_formula() {
			return getRuleContext(Fof_atomic_formulaContext.class,0);
		}
		public Fof_infix_unaryContext fof_infix_unary() {
			return getRuleContext(Fof_infix_unaryContext.class,0);
		}
		public Cnf_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnf_literal; }
	}

	public final Cnf_literalContext cnf_literal() throws RecognitionException {
		Cnf_literalContext _localctx = new Cnf_literalContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_cnf_literal);
		try {
			setState(1468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1459);
				fof_atomic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1460);
				match(T__26);
				setState(1461);
				fof_atomic_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1462);
				match(T__26);
				setState(1463);
				match(T__11);
				setState(1464);
				fof_atomic_formula();
				setState(1465);
				match(T__12);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1467);
				fof_infix_unary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_quantifierContext extends ParserRuleContext {
		public Tff_quantifierContext tff_quantifier() {
			return getRuleContext(Tff_quantifierContext.class,0);
		}
		public Th0_quantifierContext th0_quantifier() {
			return getRuleContext(Th0_quantifierContext.class,0);
		}
		public Type_quantifierContext type_quantifier() {
			return getRuleContext(Type_quantifierContext.class,0);
		}
		public Thf_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_quantifier; }
	}

	public final Thf_quantifierContext thf_quantifier() throws RecognitionException {
		Thf_quantifierContext _localctx = new Thf_quantifierContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_thf_quantifier);
		try {
			setState(1473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1470);
				tff_quantifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1471);
				th0_quantifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1472);
				type_quantifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Thf_unary_connectiveContext extends ParserRuleContext {
		public Unary_connectiveContext unary_connective() {
			return getRuleContext(Unary_connectiveContext.class,0);
		}
		public Ntf_short_connectiveContext ntf_short_connective() {
			return getRuleContext(Ntf_short_connectiveContext.class,0);
		}
		public Thf_unary_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_unary_connective; }
	}

	public final Thf_unary_connectiveContext thf_unary_connective() throws RecognitionException {
		Thf_unary_connectiveContext _localctx = new Thf_unary_connectiveContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_thf_unary_connective);
		try {
			setState(1477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(1475);
				unary_connective();
				}
				break;
			case T__21:
			case T__23:
			case T__24:
			case Less_sign:
				enterOuterAlt(_localctx, 2);
				{
				setState(1476);
				ntf_short_connective();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Th0_quantifierContext extends ParserRuleContext {
		public Th0_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_th0_quantifier; }
	}

	public final Th0_quantifierContext th0_quantifier() throws RecognitionException {
		Th0_quantifierContext _localctx = new Th0_quantifierContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_th0_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_quantifierContext extends ParserRuleContext {
		public Type_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_quantifier; }
	}

	public final Type_quantifierContext type_quantifier() throws RecognitionException {
		Type_quantifierContext _localctx = new Type_quantifierContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_type_quantifier);
		int _la;
		try {
			setState(1488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(1481);
				match(T__30);
				}
				break;
			case T__13:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(1485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31) {
					{
					{
					setState(1482);
					match(T__31);
					}
					}
					setState(1487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subtype_signContext extends ParserRuleContext {
		public Subtype_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtype_sign; }
	}

	public final Subtype_signContext subtype_sign() throws RecognitionException {
		Subtype_signContext _localctx = new Subtype_signContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_subtype_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_unary_connectiveContext extends ParserRuleContext {
		public Unary_connectiveContext unary_connective() {
			return getRuleContext(Unary_connectiveContext.class,0);
		}
		public Ntf_short_connectiveContext ntf_short_connective() {
			return getRuleContext(Ntf_short_connectiveContext.class,0);
		}
		public Tff_unary_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_unary_connective; }
	}

	public final Tff_unary_connectiveContext tff_unary_connective() throws RecognitionException {
		Tff_unary_connectiveContext _localctx = new Tff_unary_connectiveContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_tff_unary_connective);
		try {
			setState(1494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(1492);
				unary_connective();
				}
				break;
			case T__21:
			case T__23:
			case T__24:
			case Less_sign:
				enterOuterAlt(_localctx, 2);
				{
				setState(1493);
				ntf_short_connective();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tff_quantifierContext extends ParserRuleContext {
		public Fof_quantifierContext fof_quantifier() {
			return getRuleContext(Fof_quantifierContext.class,0);
		}
		public TerminalNode Hash() { return getToken(TPTPParser.Hash, 0); }
		public Tff_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_quantifier; }
	}

	public final Tff_quantifierContext tff_quantifier() throws RecognitionException {
		Tff_quantifierContext _localctx = new Tff_quantifierContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_tff_quantifier);
		try {
			setState(1498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(1496);
				fof_quantifier();
				}
				break;
			case Hash:
				enterOuterAlt(_localctx, 2);
				{
				setState(1497);
				match(Hash);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fof_quantifierContext extends ParserRuleContext {
		public Fof_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_quantifier; }
	}

	public final Fof_quantifierContext fof_quantifier() throws RecognitionException {
		Fof_quantifierContext _localctx = new Fof_quantifierContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_fof_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__31) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nonassoc_connectiveContext extends ParserRuleContext {
		public TerminalNode Vline() { return getToken(TPTPParser.Vline, 0); }
		public Nonassoc_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonassoc_connective; }
	}

	public final Nonassoc_connectiveContext nonassoc_connective() throws RecognitionException {
		Nonassoc_connectiveContext _localctx = new Nonassoc_connectiveContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_nonassoc_connective);
		try {
			setState(1509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(1502);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(1503);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(1504);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 4);
				{
				setState(1505);
				match(T__36);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(1506);
				match(T__26);
				setState(1507);
				match(Vline);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 6);
				{
				setState(1508);
				match(T__37);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assoc_connectiveContext extends ParserRuleContext {
		public TerminalNode Vline() { return getToken(TPTPParser.Vline, 0); }
		public Assoc_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assoc_connective; }
	}

	public final Assoc_connectiveContext assoc_connective() throws RecognitionException {
		Assoc_connectiveContext _localctx = new Assoc_connectiveContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_assoc_connective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1511);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==Vline) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_connectiveContext extends ParserRuleContext {
		public Unary_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_connective; }
	}

	public final Unary_connectiveContext unary_connective() throws RecognitionException {
		Unary_connectiveContext _localctx = new Unary_connectiveContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_unary_connective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Gentzen_arrowContext extends ParserRuleContext {
		public Gentzen_arrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gentzen_arrow; }
	}

	public final Gentzen_arrowContext gentzen_arrow() throws RecognitionException {
		Gentzen_arrowContext _localctx = new Gentzen_arrowContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_gentzen_arrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			match(T__39);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdenticalContext extends ParserRuleContext {
		public IdenticalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identical; }
	}

	public final IdenticalContext identical() throws RecognitionException {
		IdenticalContext _localctx = new IdenticalContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_identical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
			match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Typeable_atomContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode Distinct_object() { return getToken(TPTPParser.Distinct_object, 0); }
		public Typeable_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeable_atom; }
	}

	public final Typeable_atomContext typeable_atom() throws RecognitionException {
		Typeable_atomContext _localctx = new Typeable_atomContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_typeable_atom);
		try {
			setState(1523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Single_quoted:
			case Back_quoted:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				constant();
				}
				break;
			case Distinct_object:
				enterOuterAlt(_localctx, 2);
				{
				setState(1522);
				match(Distinct_object);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Atomic_typeContext extends ParserRuleContext {
		public Typeable_atomContext typeable_atom() {
			return getRuleContext(Typeable_atomContext.class,0);
		}
		public Defined_constantContext defined_constant() {
			return getRuleContext(Defined_constantContext.class,0);
		}
		public System_typeContext system_type() {
			return getRuleContext(System_typeContext.class,0);
		}
		public Atomic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_type; }
	}

	public final Atomic_typeContext atomic_type() throws RecognitionException {
		Atomic_typeContext _localctx = new Atomic_typeContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_atomic_type);
		try {
			setState(1528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Single_quoted:
			case Back_quoted:
			case Distinct_object:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(1525);
				typeable_atom();
				}
				break;
			case Dollar_word:
				enterOuterAlt(_localctx, 2);
				{
				setState(1526);
				defined_constant();
				}
				break;
			case Dollar_dollar_word:
				enterOuterAlt(_localctx, 3);
				{
				setState(1527);
				system_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_constantContext extends ParserRuleContext {
		public Type_functorContext type_functor() {
			return getRuleContext(Type_functorContext.class,0);
		}
		public Type_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_constant; }
	}

	public final Type_constantContext type_constant() throws RecognitionException {
		Type_constantContext _localctx = new Type_constantContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_type_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			type_functor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_functorContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public Type_functorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_functor; }
	}

	public final Type_functorContext type_functor() throws RecognitionException {
		Type_functorContext _localctx = new Type_functorContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_type_functor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			atomic_word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Defined_typeContext extends ParserRuleContext {
		public Atomic_defined_wordContext atomic_defined_word() {
			return getRuleContext(Atomic_defined_wordContext.class,0);
		}
		public Defined_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_type; }
	}

	public final Defined_typeContext defined_type() throws RecognitionException {
		Defined_typeContext _localctx = new Defined_typeContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_defined_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			atomic_defined_word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class System_typeContext extends ParserRuleContext {
		public Atomic_system_wordContext atomic_system_word() {
			return getRuleContext(Atomic_system_wordContext.class,0);
		}
		public System_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_type; }
	}

	public final System_typeContext system_type() throws RecognitionException {
		System_typeContext _localctx = new System_typeContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_system_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			atomic_system_word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Defined_infix_predContext extends ParserRuleContext {
		public Infix_equalityContext infix_equality() {
			return getRuleContext(Infix_equalityContext.class,0);
		}
		public Defined_infix_predContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_infix_pred; }
	}

	public final Defined_infix_predContext defined_infix_pred() throws RecognitionException {
		Defined_infix_predContext _localctx = new Defined_infix_predContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_defined_infix_pred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			infix_equality();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Infix_equalityContext extends ParserRuleContext {
		public Infix_equalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_equality; }
	}

	public final Infix_equalityContext infix_equality() throws RecognitionException {
		Infix_equalityContext _localctx = new Infix_equalityContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_infix_equality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			match(T__41);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Infix_inequalityContext extends ParserRuleContext {
		public Infix_inequalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_inequality; }
	}

	public final Infix_inequalityContext infix_inequality() throws RecognitionException {
		Infix_inequalityContext _localctx = new Infix_inequalityContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_infix_inequality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			match(T__42);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public FunctorContext functor() {
			return getRuleContext(FunctorContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			functor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctorContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public FunctorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functor; }
	}

	public final FunctorContext functor() throws RecognitionException {
		FunctorContext _localctx = new FunctorContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_functor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			atomic_word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Defined_constantContext extends ParserRuleContext {
		public Defined_functorContext defined_functor() {
			return getRuleContext(Defined_functorContext.class,0);
		}
		public Defined_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_constant; }
	}

	public final Defined_constantContext defined_constant() throws RecognitionException {
		Defined_constantContext _localctx = new Defined_constantContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_defined_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			defined_functor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Defined_functorContext extends ParserRuleContext {
		public Atomic_defined_wordContext atomic_defined_word() {
			return getRuleContext(Atomic_defined_wordContext.class,0);
		}
		public Defined_functorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_functor; }
	}

	public final Defined_functorContext defined_functor() throws RecognitionException {
		Defined_functorContext _localctx = new Defined_functorContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_defined_functor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			atomic_defined_word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class System_constantContext extends ParserRuleContext {
		public System_functorContext system_functor() {
			return getRuleContext(System_functorContext.class,0);
		}
		public System_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_constant; }
	}

	public final System_constantContext system_constant() throws RecognitionException {
		System_constantContext _localctx = new System_constantContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_system_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			system_functor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class System_functorContext extends ParserRuleContext {
		public Atomic_system_wordContext atomic_system_word() {
			return getRuleContext(Atomic_system_wordContext.class,0);
		}
		public System_functorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_functor; }
	}

	public final System_functorContext system_functor() throws RecognitionException {
		System_functorContext _localctx = new System_functorContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_system_functor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			atomic_system_word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Th1_defined_termContext extends ParserRuleContext {
		public Th1_defined_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_th1_defined_term; }
	}

	public final Th1_defined_termContext th1_defined_term() throws RecognitionException {
		Th1_defined_termContext _localctx = new Th1_defined_termContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_th1_defined_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 545357767376896L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Defined_termContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode Distinct_object() { return getToken(TPTPParser.Distinct_object, 0); }
		public Defined_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_term; }
	}

	public final Defined_termContext defined_term() throws RecognitionException {
		Defined_termContext _localctx = new Defined_termContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_defined_term);
		try {
			setState(1560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Real:
			case Rational:
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(1558);
				number();
				}
				break;
			case Distinct_object:
				enterOuterAlt(_localctx, 2);
				{
				setState(1559);
				match(Distinct_object);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Upper_word() { return getToken(TPTPParser.Upper_word, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			match(Upper_word);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceContext extends ParserRuleContext {
		public Dag_sourceContext dag_source() {
			return getRuleContext(Dag_sourceContext.class,0);
		}
		public Internal_sourceContext internal_source() {
			return getRuleContext(Internal_sourceContext.class,0);
		}
		public External_sourceContext external_source() {
			return getRuleContext(External_sourceContext.class,0);
		}
		public SourcesContext sources() {
			return getRuleContext(SourcesContext.class,0);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_source);
		try {
			setState(1572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
			case Single_quoted:
			case Back_quoted:
			case Lower_word:
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(1564);
				dag_source();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(1565);
				internal_source();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 3);
				{
				setState(1566);
				external_source();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 4);
				{
				setState(1567);
				match(T__48);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(1568);
				match(T__13);
				setState(1569);
				sources();
				setState(1570);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourcesContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public SourcesContext sources() {
			return getRuleContext(SourcesContext.class,0);
		}
		public SourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sources; }
	}

	public final SourcesContext sources() throws RecognitionException {
		SourcesContext _localctx = new SourcesContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_sources);
		try {
			setState(1579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1574);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1575);
				source();
				setState(1576);
				match(T__1);
				setState(1577);
				sources();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dag_sourceContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Inference_recordContext inference_record() {
			return getRuleContext(Inference_recordContext.class,0);
		}
		public Dag_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dag_source; }
	}

	public final Dag_sourceContext dag_source() throws RecognitionException {
		Dag_sourceContext _localctx = new Dag_sourceContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_dag_source);
		try {
			setState(1583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Single_quoted:
			case Back_quoted:
			case Lower_word:
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(1581);
				name();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(1582);
				inference_record();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Inference_recordContext extends ParserRuleContext {
		public Inference_ruleContext inference_rule() {
			return getRuleContext(Inference_ruleContext.class,0);
		}
		public Useful_infoContext useful_info() {
			return getRuleContext(Useful_infoContext.class,0);
		}
		public ParentsContext parents() {
			return getRuleContext(ParentsContext.class,0);
		}
		public Inference_recordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inference_record; }
	}

	public final Inference_recordContext inference_record() throws RecognitionException {
		Inference_recordContext _localctx = new Inference_recordContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_inference_record);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			match(T__49);
			setState(1586);
			inference_rule();
			setState(1587);
			match(T__1);
			setState(1588);
			useful_info();
			setState(1589);
			match(T__1);
			setState(1590);
			parents();
			setState(1591);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Inference_ruleContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public Inference_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inference_rule; }
	}

	public final Inference_ruleContext inference_rule() throws RecognitionException {
		Inference_ruleContext _localctx = new Inference_ruleContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_inference_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593);
			atomic_word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Internal_sourceContext extends ParserRuleContext {
		public Intro_typeContext intro_type() {
			return getRuleContext(Intro_typeContext.class,0);
		}
		public Useful_infoContext useful_info() {
			return getRuleContext(Useful_infoContext.class,0);
		}
		public ParentsContext parents() {
			return getRuleContext(ParentsContext.class,0);
		}
		public Internal_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internal_source; }
	}

	public final Internal_sourceContext internal_source() throws RecognitionException {
		Internal_sourceContext _localctx = new Internal_sourceContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_internal_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			match(T__50);
			setState(1596);
			intro_type();
			setState(1597);
			match(T__1);
			setState(1598);
			useful_info();
			setState(1599);
			match(T__1);
			setState(1600);
			parents();
			setState(1601);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Intro_typeContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public Intro_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intro_type; }
	}

	public final Intro_typeContext intro_type() throws RecognitionException {
		Intro_typeContext _localctx = new Intro_typeContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_intro_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			atomic_word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class External_sourceContext extends ParserRuleContext {
		public File_sourceContext file_source() {
			return getRuleContext(File_sourceContext.class,0);
		}
		public External_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_source; }
	}

	public final External_sourceContext external_source() throws RecognitionException {
		External_sourceContext _localctx = new External_sourceContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_external_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			file_source();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_sourceContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public File_infoContext file_info() {
			return getRuleContext(File_infoContext.class,0);
		}
		public File_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_source; }
	}

	public final File_sourceContext file_source() throws RecognitionException {
		File_sourceContext _localctx = new File_sourceContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_file_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			match(T__51);
			setState(1608);
			file_name();
			setState(1609);
			file_info();
			setState(1610);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_infoContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NothingContext nothing() {
			return getRuleContext(NothingContext.class,0);
		}
		public File_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_info; }
	}

	public final File_infoContext file_info() throws RecognitionException {
		File_infoContext _localctx = new File_infoContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_file_info);
		try {
			setState(1615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1612);
				match(T__1);
				setState(1613);
				name();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(1614);
				nothing();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParentsContext extends ParserRuleContext {
		public Parent_listContext parent_list() {
			return getRuleContext(Parent_listContext.class,0);
		}
		public ParentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parents; }
	}

	public final ParentsContext parents() throws RecognitionException {
		ParentsContext _localctx = new ParentsContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_parents);
		try {
			setState(1622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(1617);
				match(T__17);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(1618);
				match(T__13);
				setState(1619);
				parent_list();
				setState(1620);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parent_listContext extends ParserRuleContext {
		public Parent_infoContext parent_info() {
			return getRuleContext(Parent_infoContext.class,0);
		}
		public List<Comma_parent_infoContext> comma_parent_info() {
			return getRuleContexts(Comma_parent_infoContext.class);
		}
		public Comma_parent_infoContext comma_parent_info(int i) {
			return getRuleContext(Comma_parent_infoContext.class,i);
		}
		public Parent_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent_list; }
	}

	public final Parent_listContext parent_list() throws RecognitionException {
		Parent_listContext _localctx = new Parent_listContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_parent_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			parent_info();
			setState(1628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1625);
				comma_parent_info();
				}
				}
				setState(1630);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comma_parent_infoContext extends ParserRuleContext {
		public Parent_infoContext parent_info() {
			return getRuleContext(Parent_infoContext.class,0);
		}
		public Comma_parent_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_parent_info; }
	}

	public final Comma_parent_infoContext comma_parent_info() throws RecognitionException {
		Comma_parent_infoContext _localctx = new Comma_parent_infoContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_comma_parent_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			match(T__1);
			setState(1632);
			parent_info();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parent_infoContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public Parent_detailsContext parent_details() {
			return getRuleContext(Parent_detailsContext.class,0);
		}
		public Parent_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent_info; }
	}

	public final Parent_infoContext parent_info() throws RecognitionException {
		Parent_infoContext _localctx = new Parent_infoContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_parent_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			source();
			setState(1635);
			parent_details();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parent_detailsContext extends ParserRuleContext {
		public General_termContext general_term() {
			return getRuleContext(General_termContext.class,0);
		}
		public NothingContext nothing() {
			return getRuleContext(NothingContext.class,0);
		}
		public Parent_detailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent_details; }
	}

	public final Parent_detailsContext parent_details() throws RecognitionException {
		Parent_detailsContext _localctx = new Parent_detailsContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_parent_details);
		try {
			setState(1640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(1637);
				match(T__15);
				setState(1638);
				general_term();
				}
				break;
			case T__1:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(1639);
				nothing();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Optional_infoContext extends ParserRuleContext {
		public Useful_infoContext useful_info() {
			return getRuleContext(Useful_infoContext.class,0);
		}
		public NothingContext nothing() {
			return getRuleContext(NothingContext.class,0);
		}
		public Optional_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_info; }
	}

	public final Optional_infoContext optional_info() throws RecognitionException {
		Optional_infoContext _localctx = new Optional_infoContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_optional_info);
		try {
			setState(1645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1642);
				match(T__1);
				setState(1643);
				useful_info();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1644);
				nothing();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Useful_infoContext extends ParserRuleContext {
		public General_listContext general_list() {
			return getRuleContext(General_listContext.class,0);
		}
		public Useful_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useful_info; }
	}

	public final Useful_infoContext useful_info() throws RecognitionException {
		Useful_infoContext _localctx = new Useful_infoContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_useful_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			general_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncludeContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public Include_optionalsContext include_optionals() {
			return getRuleContext(Include_optionalsContext.class,0);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			match(T__52);
			setState(1650);
			file_name();
			setState(1651);
			include_optionals();
			setState(1652);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Include_optionalsContext extends ParserRuleContext {
		public NothingContext nothing() {
			return getRuleContext(NothingContext.class,0);
		}
		public Formula_selectionContext formula_selection() {
			return getRuleContext(Formula_selectionContext.class,0);
		}
		public Space_nameContext space_name() {
			return getRuleContext(Space_nameContext.class,0);
		}
		public Include_optionalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_optionals; }
	}

	public final Include_optionalsContext include_optionals() throws RecognitionException {
		Include_optionalsContext _localctx = new Include_optionalsContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_include_optionals);
		try {
			setState(1662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1654);
				nothing();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1655);
				match(T__1);
				setState(1656);
				formula_selection();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1657);
				match(T__1);
				setState(1658);
				formula_selection();
				setState(1659);
				match(T__1);
				setState(1660);
				space_name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formula_selectionContext extends ParserRuleContext {
		public Name_listContext name_list() {
			return getRuleContext(Name_listContext.class,0);
		}
		public TerminalNode Star() { return getToken(TPTPParser.Star, 0); }
		public Formula_selectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula_selection; }
	}

	public final Formula_selectionContext formula_selection() throws RecognitionException {
		Formula_selectionContext _localctx = new Formula_selectionContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_formula_selection);
		try {
			setState(1669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(1664);
				match(T__13);
				setState(1665);
				name_list();
				setState(1666);
				match(T__14);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				setState(1668);
				match(Star);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Name_listContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Name_listContext name_list() {
			return getRuleContext(Name_listContext.class,0);
		}
		public Name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_list; }
	}

	public final Name_listContext name_list() throws RecognitionException {
		Name_listContext _localctx = new Name_listContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_name_list);
		try {
			setState(1676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1671);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1672);
				name();
				setState(1673);
				match(T__1);
				setState(1674);
				name_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Space_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Space_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space_name; }
	}

	public final Space_nameContext space_name() throws RecognitionException {
		Space_nameContext _localctx = new Space_nameContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_space_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class General_termContext extends ParserRuleContext {
		public General_dataContext general_data() {
			return getRuleContext(General_dataContext.class,0);
		}
		public General_termContext general_term() {
			return getRuleContext(General_termContext.class,0);
		}
		public General_listContext general_list() {
			return getRuleContext(General_listContext.class,0);
		}
		public General_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_term; }
	}

	public final General_termContext general_term() throws RecognitionException {
		General_termContext _localctx = new General_termContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_general_term);
		try {
			setState(1686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1680);
				general_data();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1681);
				general_data();
				setState(1682);
				match(T__15);
				setState(1683);
				general_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1685);
				general_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class General_dataContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public General_functionContext general_function() {
			return getRuleContext(General_functionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode Distinct_object() { return getToken(TPTPParser.Distinct_object, 0); }
		public Formula_dataContext formula_data() {
			return getRuleContext(Formula_dataContext.class,0);
		}
		public General_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_data; }
	}

	public final General_dataContext general_data() throws RecognitionException {
		General_dataContext _localctx = new General_dataContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_general_data);
		try {
			setState(1694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1688);
				atomic_word();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1689);
				general_function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1690);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1691);
				number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1692);
				match(Distinct_object);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1693);
				formula_data();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class General_functionContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public General_termsContext general_terms() {
			return getRuleContext(General_termsContext.class,0);
		}
		public General_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_function; }
	}

	public final General_functionContext general_function() throws RecognitionException {
		General_functionContext _localctx = new General_functionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_general_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			atomic_word();
			setState(1697);
			match(T__11);
			setState(1698);
			general_terms();
			setState(1699);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formula_dataContext extends ParserRuleContext {
		public Thf_formulaContext thf_formula() {
			return getRuleContext(Thf_formulaContext.class,0);
		}
		public Tff_formulaContext tff_formula() {
			return getRuleContext(Tff_formulaContext.class,0);
		}
		public Fof_formulaContext fof_formula() {
			return getRuleContext(Fof_formulaContext.class,0);
		}
		public Cnf_formulaContext cnf_formula() {
			return getRuleContext(Cnf_formulaContext.class,0);
		}
		public Fof_termContext fof_term() {
			return getRuleContext(Fof_termContext.class,0);
		}
		public Formula_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula_data; }
	}

	public final Formula_dataContext formula_data() throws RecognitionException {
		Formula_dataContext _localctx = new Formula_dataContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_formula_data);
		try {
			setState(1721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(1701);
				match(T__53);
				setState(1702);
				thf_formula();
				setState(1703);
				match(T__12);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(1705);
				match(T__54);
				setState(1706);
				tff_formula();
				setState(1707);
				match(T__12);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 3);
				{
				setState(1709);
				match(T__55);
				setState(1710);
				fof_formula();
				setState(1711);
				match(T__12);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 4);
				{
				setState(1713);
				match(T__56);
				setState(1714);
				cnf_formula();
				setState(1715);
				match(T__12);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 5);
				{
				setState(1717);
				match(T__57);
				setState(1718);
				fof_term();
				setState(1719);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class General_listContext extends ParserRuleContext {
		public General_termsContext general_terms() {
			return getRuleContext(General_termsContext.class,0);
		}
		public General_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_list; }
	}

	public final General_listContext general_list() throws RecognitionException {
		General_listContext _localctx = new General_listContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_general_list);
		try {
			setState(1728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(1723);
				match(T__17);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(1724);
				match(T__13);
				setState(1725);
				general_terms();
				setState(1726);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class General_termsContext extends ParserRuleContext {
		public General_termContext general_term() {
			return getRuleContext(General_termContext.class,0);
		}
		public List<Comma_general_termContext> comma_general_term() {
			return getRuleContexts(Comma_general_termContext.class);
		}
		public Comma_general_termContext comma_general_term(int i) {
			return getRuleContext(Comma_general_termContext.class,i);
		}
		public General_termsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_terms; }
	}

	public final General_termsContext general_terms() throws RecognitionException {
		General_termsContext _localctx = new General_termsContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_general_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			general_term();
			setState(1734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1731);
				comma_general_term();
				}
				}
				setState(1736);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comma_general_termContext extends ParserRuleContext {
		public General_termContext general_term() {
			return getRuleContext(General_termContext.class,0);
		}
		public Comma_general_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_general_term; }
	}

	public final Comma_general_termContext comma_general_term() throws RecognitionException {
		Comma_general_termContext _localctx = new Comma_general_termContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_comma_general_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			match(T__1);
			setState(1738);
			general_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public TerminalNode Integer() { return getToken(TPTPParser.Integer, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_name);
		try {
			setState(1742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Single_quoted:
			case Back_quoted:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(1740);
				atomic_word();
				}
				break;
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(1741);
				match(Integer);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Atomic_wordContext extends ParserRuleContext {
		public TerminalNode Lower_word() { return getToken(TPTPParser.Lower_word, 0); }
		public TerminalNode Single_quoted() { return getToken(TPTPParser.Single_quoted, 0); }
		public TerminalNode Back_quoted() { return getToken(TPTPParser.Back_quoted, 0); }
		public Atomic_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_word; }
	}

	public final Atomic_wordContext atomic_word() throws RecognitionException {
		Atomic_wordContext _localctx = new Atomic_wordContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_atomic_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 67L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Atomic_defined_wordContext extends ParserRuleContext {
		public TerminalNode Dollar_word() { return getToken(TPTPParser.Dollar_word, 0); }
		public Atomic_defined_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_defined_word; }
	}

	public final Atomic_defined_wordContext atomic_defined_word() throws RecognitionException {
		Atomic_defined_wordContext _localctx = new Atomic_defined_wordContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_atomic_defined_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			match(Dollar_word);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Atomic_system_wordContext extends ParserRuleContext {
		public TerminalNode Dollar_dollar_word() { return getToken(TPTPParser.Dollar_dollar_word, 0); }
		public Atomic_system_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_system_word; }
	}

	public final Atomic_system_wordContext atomic_system_word() throws RecognitionException {
		Atomic_system_wordContext _localctx = new Atomic_system_wordContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_atomic_system_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			match(Dollar_dollar_word);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(TPTPParser.Integer, 0); }
		public TerminalNode Rational() { return getToken(TPTPParser.Rational, 0); }
		public TerminalNode Real() { return getToken(TPTPParser.Real, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 1153L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_nameContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			atomic_word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NothingContext extends ParserRuleContext {
		public NothingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nothing; }
	}

	public final NothingContext nothing() throws RecognitionException {
		NothingContext _localctx = new NothingContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_nothing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return thf_or_formula_sempred((Thf_or_formulaContext)_localctx, predIndex);
		case 18:
			return thf_and_formula_sempred((Thf_and_formulaContext)_localctx, predIndex);
		case 19:
			return thf_apply_formula_sempred((Thf_apply_formulaContext)_localctx, predIndex);
		case 55:
			return thf_xprod_type_sempred((Thf_xprod_typeContext)_localctx, predIndex);
		case 56:
			return thf_union_type_sempred((Thf_union_typeContext)_localctx, predIndex);
		case 65:
			return tff_or_formula_sempred((Tff_or_formulaContext)_localctx, predIndex);
		case 66:
			return tff_and_formula_sempred((Tff_and_formulaContext)_localctx, predIndex);
		case 106:
			return tff_xprod_type_sempred((Tff_xprod_typeContext)_localctx, predIndex);
		case 132:
			return fof_or_formula_sempred((Fof_or_formulaContext)_localctx, predIndex);
		case 133:
			return fof_and_formula_sempred((Fof_and_formulaContext)_localctx, predIndex);
		case 159:
			return cnf_disjunction_sempred((Cnf_disjunctionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean thf_or_formula_sempred(Thf_or_formulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean thf_and_formula_sempred(Thf_and_formulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean thf_apply_formula_sempred(Thf_apply_formulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean thf_xprod_type_sempred(Thf_xprod_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean thf_union_type_sempred(Thf_union_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean tff_or_formula_sempred(Tff_or_formulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean tff_and_formula_sempred(Tff_and_formulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean tff_xprod_type_sempred(Tff_xprod_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean fof_or_formula_sempred(Fof_or_formulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean fof_and_formula_sempred(Fof_and_formulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean cnf_disjunction_sempred(Cnf_disjunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001i\u06dd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007m\u0002"+
		"n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007r\u0002"+
		"s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007w\u0002"+
		"x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007|\u0002"+
		"}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007\u0080"+
		"\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007\u0083"+
		"\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007\u0086"+
		"\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007\u0089"+
		"\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007\u008c"+
		"\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007\u008f"+
		"\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007\u0092"+
		"\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007\u0095"+
		"\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007\u0098"+
		"\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007\u009b"+
		"\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007\u009e"+
		"\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007\u00a1"+
		"\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007\u00a4"+
		"\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007\u00a7"+
		"\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007\u00aa"+
		"\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007\u00ad"+
		"\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007\u00b0"+
		"\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007\u00b3"+
		"\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007\u00b6"+
		"\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007\u00b9"+
		"\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007\u00bc"+
		"\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0002\u00bf\u0007\u00bf"+
		"\u0002\u00c0\u0007\u00c0\u0002\u00c1\u0007\u00c1\u0002\u00c2\u0007\u00c2"+
		"\u0002\u00c3\u0007\u00c3\u0002\u00c4\u0007\u00c4\u0002\u00c5\u0007\u00c5"+
		"\u0002\u00c6\u0007\u00c6\u0002\u00c7\u0007\u00c7\u0002\u00c8\u0007\u00c8"+
		"\u0002\u00c9\u0007\u00c9\u0002\u00ca\u0007\u00ca\u0002\u00cb\u0007\u00cb"+
		"\u0002\u00cc\u0007\u00cc\u0002\u00cd\u0007\u00cd\u0002\u00ce\u0007\u00ce"+
		"\u0002\u00cf\u0007\u00cf\u0002\u00d0\u0007\u00d0\u0002\u00d1\u0007\u00d1"+
		"\u0002\u00d2\u0007\u00d2\u0002\u00d3\u0007\u00d3\u0002\u00d4\u0007\u00d4"+
		"\u0002\u00d5\u0007\u00d5\u0002\u00d6\u0007\u00d6\u0002\u00d7\u0007\u00d7"+
		"\u0002\u00d8\u0007\u00d8\u0002\u00d9\u0007\u00d9\u0002\u00da\u0007\u00da"+
		"\u0002\u00db\u0007\u00db\u0002\u00dc\u0007\u00dc\u0002\u00dd\u0007\u00dd"+
		"\u0002\u00de\u0007\u00de\u0002\u00df\u0007\u00df\u0002\u00e0\u0007\u00e0"+
		"\u0002\u00e1\u0007\u00e1\u0002\u00e2\u0007\u00e2\u0002\u00e3\u0007\u00e3"+
		"\u0002\u00e4\u0007\u00e4\u0001\u0000\u0005\u0000\u01cc\b\u0000\n\u0000"+
		"\f\u0000\u01cf\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u01d5\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u01dd\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u021c\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0222\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u0227\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u022f\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0234\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u023d\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0247\b\u0011\n\u0011\f\u0011\u024a\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u0254\b\u0012\n\u0012\f\u0012\u0257\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u0261\b\u0013\n\u0013\f\u0013\u0264\t\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0269\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u026d\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0276\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0286\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u028e\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u029b\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u029f\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u02a9\b \u0001"+
		"!\u0001!\u0003!\u02ad\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0003%\u02c2\b%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u02c9\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u02d0"+
		"\b\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0003"+
		")\u02db\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u02e3\b*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u02ea\b+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u02f1\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0302"+
		"\b-\u0001.\u0001.\u0001/\u0001/\u0005/\u0308\b/\n/\f/\u030b\t/\u00010"+
		"\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00031\u0318\b1\u00012\u00012\u00012\u00032\u031d\b2\u00013\u00013\u0001"+
		"4\u00014\u00015\u00015\u00015\u00035\u0326\b5\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00036\u0330\b6\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00057\u033a\b7\n7\f7\u033d\t7\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00058\u0347\b8\n8\f8\u034a"+
		"\t8\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001;\u0001"+
		";\u0001;\u0001;\u0001<\u0001<\u0001<\u0003<\u035b\b<\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0003=\u0363\b=\u0001>\u0001>\u0003>\u0367\b>\u0001"+
		"?\u0001?\u0001?\u0001?\u0001@\u0001@\u0003@\u036f\b@\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0005A\u0379\bA\nA\fA\u037c\tA\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0005B\u0386\bB\nB"+
		"\fB\u0389\tB\u0001C\u0001C\u0001C\u0003C\u038e\bC\u0001D\u0001D\u0003"+
		"D\u0392\bD\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u039b"+
		"\bE\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0003H\u03ab\bH\u0001I\u0001I\u0003I\u03af"+
		"\bI\u0001J\u0001J\u0001J\u0001J\u0001K\u0001K\u0003K\u03b7\bK\u0001L\u0001"+
		"L\u0001L\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0003N\u03c3"+
		"\bN\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u03cb\bO\u0001P\u0001"+
		"P\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u03d7"+
		"\bQ\u0001R\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0003S\u03e3\bS\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001"+
		"T\u0001U\u0001U\u0001U\u0001U\u0001U\u0003U\u03f2\bU\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0003V\u03f9\bV\u0001W\u0001W\u0001W\u0001W\u0001W\u0003"+
		"W\u0400\bW\u0001X\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0003Y\u0408\bY\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001Z\u0003Z\u040f\bZ\u0001[\u0001[\u0001[\u0001"+
		"[\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0003\\\u041a\b\\\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0003]\u0424\b]\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0003^\u042b\b^\u0001_\u0001_\u0005_\u042f\b_\n"+
		"_\f_\u0432\t_\u0001`\u0001`\u0001`\u0001a\u0001a\u0001a\u0001a\u0001a"+
		"\u0001a\u0001a\u0001a\u0003a\u043f\ba\u0001b\u0001b\u0003b\u0443\bb\u0001"+
		"c\u0001c\u0001c\u0001c\u0001c\u0001c\u0003c\u044b\bc\u0001d\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0003e\u045a\be\u0001f\u0001f\u0001f\u0001f\u0001f\u0003f\u0461\bf\u0001"+
		"g\u0001g\u0001g\u0001g\u0001g\u0001g\u0001g\u0001g\u0001g\u0001g\u0001"+
		"g\u0001g\u0001g\u0003g\u0470\bg\u0001h\u0001h\u0001h\u0001h\u0001h\u0003"+
		"h\u0477\bh\u0001i\u0001i\u0001i\u0001i\u0001j\u0001j\u0001j\u0001j\u0001"+
		"j\u0001j\u0001j\u0001j\u0005j\u0485\bj\nj\fj\u0488\tj\u0001k\u0001k\u0001"+
		"k\u0001k\u0001l\u0001l\u0001l\u0001l\u0001l\u0003l\u0493\bl\u0001m\u0001"+
		"m\u0001m\u0001m\u0001n\u0001n\u0001n\u0001n\u0001o\u0001o\u0001o\u0001"+
		"o\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001"+
		"p\u0003p\u04ab\bp\u0001q\u0001q\u0001q\u0001q\u0001q\u0003q\u04b2\bq\u0001"+
		"r\u0001r\u0003r\u04b6\br\u0001s\u0001s\u0001t\u0001t\u0001t\u0001t\u0001"+
		"t\u0001t\u0001t\u0001t\u0001t\u0001t\u0003t\u04c4\bt\u0001u\u0001u\u0001"+
		"u\u0001u\u0001u\u0003u\u04cb\bu\u0001v\u0001v\u0003v\u04cf\bv\u0001w\u0001"+
		"w\u0001x\u0001x\u0003x\u04d5\bx\u0001y\u0001y\u0001z\u0001z\u0001z\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0003{\u04e2\b{\u0001|\u0001|\u0003"+
		"|\u04e6\b|\u0001}\u0001}\u0003}\u04ea\b}\u0001~\u0001~\u0001~\u0001~\u0001"+
		"~\u0001~\u0001~\u0001\u007f\u0001\u007f\u0003\u007f\u04f5\b\u007f\u0001"+
		"\u0080\u0001\u0080\u0001\u0080\u0003\u0080\u04fa\b\u0080\u0001\u0081\u0001"+
		"\u0081\u0003\u0081\u04fe\b\u0081\u0001\u0082\u0001\u0082\u0001\u0082\u0001"+
		"\u0082\u0001\u0083\u0001\u0083\u0003\u0083\u0506\b\u0083\u0001\u0084\u0001"+
		"\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001"+
		"\u0084\u0005\u0084\u0510\b\u0084\n\u0084\f\u0084\u0513\t\u0084\u0001\u0085"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085"+
		"\u0001\u0085\u0005\u0085\u051d\b\u0085\n\u0085\f\u0085\u0520\t\u0085\u0001"+
		"\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0003\u0086\u0526\b\u0086\u0001"+
		"\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0088\u0001\u0088\u0003"+
		"\u0088\u052e\b\u0088\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0003\u0089\u0536\b\u0089\u0001\u008a\u0001\u008a\u0001"+
		"\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008b\u0001"+
		"\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0003\u008b\u0544\b\u008b\u0001"+
		"\u008c\u0001\u008c\u0001\u008c\u0003\u008c\u0549\b\u008c\u0001\u008d\u0001"+
		"\u008d\u0001\u008e\u0001\u008e\u0003\u008e\u054f\b\u008e\u0001\u008f\u0001"+
		"\u008f\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0091\u0001"+
		"\u0091\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0001"+
		"\u0092\u0003\u0092\u055f\b\u0092\u0001\u0093\u0001\u0093\u0003\u0093\u0563"+
		"\b\u0093\u0001\u0094\u0001\u0094\u0001\u0095\u0001\u0095\u0001\u0095\u0001"+
		"\u0095\u0001\u0095\u0001\u0095\u0003\u0095\u056d\b\u0095\u0001\u0096\u0001"+
		"\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0003\u0096\u0575"+
		"\b\u0096\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0003"+
		"\u0097\u057c\b\u0097\u0001\u0098\u0001\u0098\u0003\u0098\u0580\b\u0098"+
		"\u0001\u0099\u0001\u0099\u0001\u0099\u0003\u0099\u0585\b\u0099\u0001\u009a"+
		"\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a"+
		"\u0001\u009a\u0003\u009a\u058f\b\u009a\u0001\u009b\u0001\u009b\u0001\u009b"+
		"\u0001\u009b\u0001\u009b\u0003\u009b\u0596\b\u009b\u0001\u009c\u0001\u009c"+
		"\u0005\u009c\u059a\b\u009c\n\u009c\f\u009c\u059d\t\u009c\u0001\u009d\u0001"+
		"\u009d\u0001\u009d\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0001"+
		"\u009e\u0003\u009e\u05a7\b\u009e\u0001\u009f\u0001\u009f\u0001\u009f\u0001"+
		"\u009f\u0001\u009f\u0001\u009f\u0005\u009f\u05af\b\u009f\n\u009f\f\u009f"+
		"\u05b2\t\u009f\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0"+
		"\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0003\u00a0\u05bd\b\u00a0"+
		"\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0003\u00a1\u05c2\b\u00a1\u0001\u00a2"+
		"\u0001\u00a2\u0003\u00a2\u05c6\b\u00a2\u0001\u00a3\u0001\u00a3\u0001\u00a4"+
		"\u0001\u00a4\u0005\u00a4\u05cc\b\u00a4\n\u00a4\f\u00a4\u05cf\t\u00a4\u0003"+
		"\u00a4\u05d1\b\u00a4\u0001\u00a5\u0001\u00a5\u0001\u00a6\u0001\u00a6\u0003"+
		"\u00a6\u05d7\b\u00a6\u0001\u00a7\u0001\u00a7\u0003\u00a7\u05db\b\u00a7"+
		"\u0001\u00a8\u0001\u00a8\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9"+
		"\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0003\u00a9\u05e6\b\u00a9\u0001\u00aa"+
		"\u0001\u00aa\u0001\u00ab\u0001\u00ab\u0001\u00ac\u0001\u00ac\u0001\u00ad"+
		"\u0001\u00ad\u0001\u00ae\u0001\u00ae\u0001\u00af\u0001\u00af\u0003\u00af"+
		"\u05f4\b\u00af\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0003\u00b0\u05f9\b"+
		"\u00b0\u0001\u00b1\u0001\u00b1\u0001\u00b2\u0001\u00b2\u0001\u00b3\u0001"+
		"\u00b3\u0001\u00b4\u0001\u00b4\u0001\u00b5\u0001\u00b5\u0001\u00b6\u0001"+
		"\u00b6\u0001\u00b7\u0001\u00b7\u0001\u00b8\u0001\u00b8\u0001\u00b9\u0001"+
		"\u00b9\u0001\u00ba\u0001\u00ba\u0001\u00bb\u0001\u00bb\u0001\u00bc\u0001"+
		"\u00bc\u0001\u00bd\u0001\u00bd\u0001\u00be\u0001\u00be\u0001\u00bf\u0001"+
		"\u00bf\u0003\u00bf\u0619\b\u00bf\u0001\u00c0\u0001\u00c0\u0001\u00c1\u0001"+
		"\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001"+
		"\u00c1\u0003\u00c1\u0625\b\u00c1\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0003\u00c2\u062c\b\u00c2\u0001\u00c3\u0001\u00c3\u0003"+
		"\u00c3\u0630\b\u00c3\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0001"+
		"\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c5\u0001\u00c5\u0001"+
		"\u00c6\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0001"+
		"\u00c6\u0001\u00c6\u0001\u00c7\u0001\u00c7\u0001\u00c8\u0001\u00c8\u0001"+
		"\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00ca\u0001"+
		"\u00ca\u0001\u00ca\u0003\u00ca\u0650\b\u00ca\u0001\u00cb\u0001\u00cb\u0001"+
		"\u00cb\u0001\u00cb\u0001\u00cb\u0003\u00cb\u0657\b\u00cb\u0001\u00cc\u0001"+
		"\u00cc\u0005\u00cc\u065b\b\u00cc\n\u00cc\f\u00cc\u065e\t\u00cc\u0001\u00cd"+
		"\u0001\u00cd\u0001\u00cd\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00cf"+
		"\u0001\u00cf\u0001\u00cf\u0003\u00cf\u0669\b\u00cf\u0001\u00d0\u0001\u00d0"+
		"\u0001\u00d0\u0003\u00d0\u066e\b\u00d0\u0001\u00d1\u0001\u00d1\u0001\u00d2"+
		"\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0001\u00d3\u0001\u00d3"+
		"\u0001\u00d3\u0001\u00d3\u0001\u00d3\u0001\u00d3\u0001\u00d3\u0001\u00d3"+
		"\u0003\u00d3\u067f\b\u00d3\u0001\u00d4\u0001\u00d4\u0001\u00d4\u0001\u00d4"+
		"\u0001\u00d4\u0003\u00d4\u0686\b\u00d4\u0001\u00d5\u0001\u00d5\u0001\u00d5"+
		"\u0001\u00d5\u0001\u00d5\u0003\u00d5\u068d\b\u00d5\u0001\u00d6\u0001\u00d6"+
		"\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7"+
		"\u0003\u00d7\u0697\b\u00d7\u0001\u00d8\u0001\u00d8\u0001\u00d8\u0001\u00d8"+
		"\u0001\u00d8\u0001\u00d8\u0003\u00d8\u069f\b\u00d8\u0001\u00d9\u0001\u00d9"+
		"\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00da\u0001\u00da\u0001\u00da"+
		"\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da"+
		"\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da"+
		"\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0001\u00da\u0003\u00da"+
		"\u06ba\b\u00da\u0001\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001\u00db"+
		"\u0003\u00db\u06c1\b\u00db\u0001\u00dc\u0001\u00dc\u0005\u00dc\u06c5\b"+
		"\u00dc\n\u00dc\f\u00dc\u06c8\t\u00dc\u0001\u00dd\u0001\u00dd\u0001\u00dd"+
		"\u0001\u00de\u0001\u00de\u0003\u00de\u06cf\b\u00de\u0001\u00df\u0001\u00df"+
		"\u0001\u00e0\u0001\u00e0\u0001\u00e1\u0001\u00e1\u0001\u00e2\u0001\u00e2"+
		"\u0001\u00e3\u0001\u00e3\u0001\u00e4\u0001\u00e4\u0001\u00e4\u0000\u000b"+
		"\"$&np\u0082\u0084\u00d4\u0108\u010a\u013e\u00e5\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130"+
		"\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148"+
		"\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160"+
		"\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178"+
		"\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190"+
		"\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8"+
		"\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0"+
		"\u01c2\u01c4\u01c6\u01c8\u0000\u0006\u0001\u0000\u001c\u001e\u0002\u0000"+
		"\u001a\u001a  \u0002\u0000\n\nVV\u0001\u0000,0\u0002\u0000>?DD\u0003\u0000"+
		"EELLOO\u06c4\u0000\u01cd\u0001\u0000\u0000\u0000\u0002\u01d4\u0001\u0000"+
		"\u0000\u0000\u0004\u01dc\u0001\u0000\u0000\u0000\u0006\u01de\u0001\u0000"+
		"\u0000\u0000\b\u01e7\u0001\u0000\u0000\u0000\n\u01e9\u0001\u0000\u0000"+
		"\u0000\f\u01f2\u0001\u0000\u0000\u0000\u000e\u01fb\u0001\u0000\u0000\u0000"+
		"\u0010\u0204\u0001\u0000\u0000\u0000\u0012\u020d\u0001\u0000\u0000\u0000"+
		"\u0014\u021b\u0001\u0000\u0000\u0000\u0016\u0221\u0001\u0000\u0000\u0000"+
		"\u0018\u0226\u0001\u0000\u0000\u0000\u001a\u022e\u0001\u0000\u0000\u0000"+
		"\u001c\u0233\u0001\u0000\u0000\u0000\u001e\u0235\u0001\u0000\u0000\u0000"+
		" \u023c\u0001\u0000\u0000\u0000\"\u023e\u0001\u0000\u0000\u0000$\u024b"+
		"\u0001\u0000\u0000\u0000&\u0258\u0001\u0000\u0000\u0000(\u0268\u0001\u0000"+
		"\u0000\u0000*\u026c\u0001\u0000\u0000\u0000,\u0275\u0001\u0000\u0000\u0000"+
		".\u0277\u0001\u0000\u0000\u00000\u027a\u0001\u0000\u0000\u00002\u0285"+
		"\u0001\u0000\u0000\u00004\u0287\u0001\u0000\u0000\u00006\u028d\u0001\u0000"+
		"\u0000\u00008\u028f\u0001\u0000\u0000\u0000:\u0292\u0001\u0000\u0000\u0000"+
		"<\u029a\u0001\u0000\u0000\u0000>\u029e\u0001\u0000\u0000\u0000@\u02a8"+
		"\u0001\u0000\u0000\u0000B\u02ac\u0001\u0000\u0000\u0000D\u02ae\u0001\u0000"+
		"\u0000\u0000F\u02b2\u0001\u0000\u0000\u0000H\u02b4\u0001\u0000\u0000\u0000"+
		"J\u02c1\u0001\u0000\u0000\u0000L\u02c8\u0001\u0000\u0000\u0000N\u02cf"+
		"\u0001\u0000\u0000\u0000P\u02d1\u0001\u0000\u0000\u0000R\u02da\u0001\u0000"+
		"\u0000\u0000T\u02e2\u0001\u0000\u0000\u0000V\u02e9\u0001\u0000\u0000\u0000"+
		"X\u02f0\u0001\u0000\u0000\u0000Z\u0301\u0001\u0000\u0000\u0000\\\u0303"+
		"\u0001\u0000\u0000\u0000^\u0305\u0001\u0000\u0000\u0000`\u030c\u0001\u0000"+
		"\u0000\u0000b\u0317\u0001\u0000\u0000\u0000d\u031c\u0001\u0000\u0000\u0000"+
		"f\u031e\u0001\u0000\u0000\u0000h\u0320\u0001\u0000\u0000\u0000j\u0325"+
		"\u0001\u0000\u0000\u0000l\u032f\u0001\u0000\u0000\u0000n\u0331\u0001\u0000"+
		"\u0000\u0000p\u033e\u0001\u0000\u0000\u0000r\u034b\u0001\u0000\u0000\u0000"+
		"t\u034f\u0001\u0000\u0000\u0000v\u0353\u0001\u0000\u0000\u0000x\u035a"+
		"\u0001\u0000\u0000\u0000z\u0362\u0001\u0000\u0000\u0000|\u0366\u0001\u0000"+
		"\u0000\u0000~\u0368\u0001\u0000\u0000\u0000\u0080\u036e\u0001\u0000\u0000"+
		"\u0000\u0082\u0370\u0001\u0000\u0000\u0000\u0084\u037d\u0001\u0000\u0000"+
		"\u0000\u0086\u038d\u0001\u0000\u0000\u0000\u0088\u0391\u0001\u0000\u0000"+
		"\u0000\u008a\u039a\u0001\u0000\u0000\u0000\u008c\u039c\u0001\u0000\u0000"+
		"\u0000\u008e\u039e\u0001\u0000\u0000\u0000\u0090\u03aa\u0001\u0000\u0000"+
		"\u0000\u0092\u03ae\u0001\u0000\u0000\u0000\u0094\u03b0\u0001\u0000\u0000"+
		"\u0000\u0096\u03b6\u0001\u0000\u0000\u0000\u0098\u03b8\u0001\u0000\u0000"+
		"\u0000\u009a\u03bb\u0001\u0000\u0000\u0000\u009c\u03c2\u0001\u0000\u0000"+
		"\u0000\u009e\u03ca\u0001\u0000\u0000\u0000\u00a0\u03cc\u0001\u0000\u0000"+
		"\u0000\u00a2\u03d6\u0001\u0000\u0000\u0000\u00a4\u03d8\u0001\u0000\u0000"+
		"\u0000\u00a6\u03e2\u0001\u0000\u0000\u0000\u00a8\u03e4\u0001\u0000\u0000"+
		"\u0000\u00aa\u03f1\u0001\u0000\u0000\u0000\u00ac\u03f8\u0001\u0000\u0000"+
		"\u0000\u00ae\u03ff\u0001\u0000\u0000\u0000\u00b0\u0401\u0001\u0000\u0000"+
		"\u0000\u00b2\u0407\u0001\u0000\u0000\u0000\u00b4\u040e\u0001\u0000\u0000"+
		"\u0000\u00b6\u0410\u0001\u0000\u0000\u0000\u00b8\u0419\u0001\u0000\u0000"+
		"\u0000\u00ba\u0423\u0001\u0000\u0000\u0000\u00bc\u042a\u0001\u0000\u0000"+
		"\u0000\u00be\u042c\u0001\u0000\u0000\u0000\u00c0\u0433\u0001\u0000\u0000"+
		"\u0000\u00c2\u043e\u0001\u0000\u0000\u0000\u00c4\u0442\u0001\u0000\u0000"+
		"\u0000\u00c6\u044a\u0001\u0000\u0000\u0000\u00c8\u044c\u0001\u0000\u0000"+
		"\u0000\u00ca\u0459\u0001\u0000\u0000\u0000\u00cc\u0460\u0001\u0000\u0000"+
		"\u0000\u00ce\u046f\u0001\u0000\u0000\u0000\u00d0\u0476\u0001\u0000\u0000"+
		"\u0000\u00d2\u0478\u0001\u0000\u0000\u0000\u00d4\u047c\u0001\u0000\u0000"+
		"\u0000\u00d6\u0489\u0001\u0000\u0000\u0000\u00d8\u0492\u0001\u0000\u0000"+
		"\u0000\u00da\u0494\u0001\u0000\u0000\u0000\u00dc\u0498\u0001\u0000\u0000"+
		"\u0000\u00de\u049c\u0001\u0000\u0000\u0000\u00e0\u04aa\u0001\u0000\u0000"+
		"\u0000\u00e2\u04b1\u0001\u0000\u0000\u0000\u00e4\u04b5\u0001\u0000\u0000"+
		"\u0000\u00e6\u04b7\u0001\u0000\u0000\u0000\u00e8\u04c3\u0001\u0000\u0000"+
		"\u0000\u00ea\u04ca\u0001\u0000\u0000\u0000\u00ec\u04ce\u0001\u0000\u0000"+
		"\u0000\u00ee\u04d0\u0001\u0000\u0000\u0000\u00f0\u04d4\u0001\u0000\u0000"+
		"\u0000\u00f2\u04d6\u0001\u0000\u0000\u0000\u00f4\u04d8\u0001\u0000\u0000"+
		"\u0000\u00f6\u04e1\u0001\u0000\u0000\u0000\u00f8\u04e5\u0001\u0000\u0000"+
		"\u0000\u00fa\u04e9\u0001\u0000\u0000\u0000\u00fc\u04eb\u0001\u0000\u0000"+
		"\u0000\u00fe\u04f4\u0001\u0000\u0000\u0000\u0100\u04f9\u0001\u0000\u0000"+
		"\u0000\u0102\u04fd\u0001\u0000\u0000\u0000\u0104\u04ff\u0001\u0000\u0000"+
		"\u0000\u0106\u0505\u0001\u0000\u0000\u0000\u0108\u0507\u0001\u0000\u0000"+
		"\u0000\u010a\u0514\u0001\u0000\u0000\u0000\u010c\u0525\u0001\u0000\u0000"+
		"\u0000\u010e\u0527\u0001\u0000\u0000\u0000\u0110\u052d\u0001\u0000\u0000"+
		"\u0000\u0112\u0535\u0001\u0000\u0000\u0000\u0114\u0537\u0001\u0000\u0000"+
		"\u0000\u0116\u0543\u0001\u0000\u0000\u0000\u0118\u0548\u0001\u0000\u0000"+
		"\u0000\u011a\u054a\u0001\u0000\u0000\u0000\u011c\u054e\u0001\u0000\u0000"+
		"\u0000\u011e\u0550\u0001\u0000\u0000\u0000\u0120\u0552\u0001\u0000\u0000"+
		"\u0000\u0122\u0556\u0001\u0000\u0000\u0000\u0124\u055e\u0001\u0000\u0000"+
		"\u0000\u0126\u0562\u0001\u0000\u0000\u0000\u0128\u0564\u0001\u0000\u0000"+
		"\u0000\u012a\u056c\u0001\u0000\u0000\u0000\u012c\u0574\u0001\u0000\u0000"+
		"\u0000\u012e\u057b\u0001\u0000\u0000\u0000\u0130\u057f\u0001\u0000\u0000"+
		"\u0000\u0132\u0584\u0001\u0000\u0000\u0000\u0134\u058e\u0001\u0000\u0000"+
		"\u0000\u0136\u0595\u0001\u0000\u0000\u0000\u0138\u0597\u0001\u0000\u0000"+
		"\u0000\u013a\u059e\u0001\u0000\u0000\u0000\u013c\u05a6\u0001\u0000\u0000"+
		"\u0000\u013e\u05a8\u0001\u0000\u0000\u0000\u0140\u05bc\u0001\u0000\u0000"+
		"\u0000\u0142\u05c1\u0001\u0000\u0000\u0000\u0144\u05c5\u0001\u0000\u0000"+
		"\u0000\u0146\u05c7\u0001\u0000\u0000\u0000\u0148\u05d0\u0001\u0000\u0000"+
		"\u0000\u014a\u05d2\u0001\u0000\u0000\u0000\u014c\u05d6\u0001\u0000\u0000"+
		"\u0000\u014e\u05da\u0001\u0000\u0000\u0000\u0150\u05dc\u0001\u0000\u0000"+
		"\u0000\u0152\u05e5\u0001\u0000\u0000\u0000\u0154\u05e7\u0001\u0000\u0000"+
		"\u0000\u0156\u05e9\u0001\u0000\u0000\u0000\u0158\u05eb\u0001\u0000\u0000"+
		"\u0000\u015a\u05ed\u0001\u0000\u0000\u0000\u015c\u05ef\u0001\u0000\u0000"+
		"\u0000\u015e\u05f3\u0001\u0000\u0000\u0000\u0160\u05f8\u0001\u0000\u0000"+
		"\u0000\u0162\u05fa\u0001\u0000\u0000\u0000\u0164\u05fc\u0001\u0000\u0000"+
		"\u0000\u0166\u05fe\u0001\u0000\u0000\u0000\u0168\u0600\u0001\u0000\u0000"+
		"\u0000\u016a\u0602\u0001\u0000\u0000\u0000\u016c\u0604\u0001\u0000\u0000"+
		"\u0000\u016e\u0606\u0001\u0000\u0000\u0000\u0170\u0608\u0001\u0000\u0000"+
		"\u0000\u0172\u060a\u0001\u0000\u0000\u0000\u0174\u060c\u0001\u0000\u0000"+
		"\u0000\u0176\u060e\u0001\u0000\u0000\u0000\u0178\u0610\u0001\u0000\u0000"+
		"\u0000\u017a\u0612\u0001\u0000\u0000\u0000\u017c\u0614\u0001\u0000\u0000"+
		"\u0000\u017e\u0618\u0001\u0000\u0000\u0000\u0180\u061a\u0001\u0000\u0000"+
		"\u0000\u0182\u0624\u0001\u0000\u0000\u0000\u0184\u062b\u0001\u0000\u0000"+
		"\u0000\u0186\u062f\u0001\u0000\u0000\u0000\u0188\u0631\u0001\u0000\u0000"+
		"\u0000\u018a\u0639\u0001\u0000\u0000\u0000\u018c\u063b\u0001\u0000\u0000"+
		"\u0000\u018e\u0643\u0001\u0000\u0000\u0000\u0190\u0645\u0001\u0000\u0000"+
		"\u0000\u0192\u0647\u0001\u0000\u0000\u0000\u0194\u064f\u0001\u0000\u0000"+
		"\u0000\u0196\u0656\u0001\u0000\u0000\u0000\u0198\u0658\u0001\u0000\u0000"+
		"\u0000\u019a\u065f\u0001\u0000\u0000\u0000\u019c\u0662\u0001\u0000\u0000"+
		"\u0000\u019e\u0668\u0001\u0000\u0000\u0000\u01a0\u066d\u0001\u0000\u0000"+
		"\u0000\u01a2\u066f\u0001\u0000\u0000\u0000\u01a4\u0671\u0001\u0000\u0000"+
		"\u0000\u01a6\u067e\u0001\u0000\u0000\u0000\u01a8\u0685\u0001\u0000\u0000"+
		"\u0000\u01aa\u068c\u0001\u0000\u0000\u0000\u01ac\u068e\u0001\u0000\u0000"+
		"\u0000\u01ae\u0696\u0001\u0000\u0000\u0000\u01b0\u069e\u0001\u0000\u0000"+
		"\u0000\u01b2\u06a0\u0001\u0000\u0000\u0000\u01b4\u06b9\u0001\u0000\u0000"+
		"\u0000\u01b6\u06c0\u0001\u0000\u0000\u0000\u01b8\u06c2\u0001\u0000\u0000"+
		"\u0000\u01ba\u06c9\u0001\u0000\u0000\u0000\u01bc\u06ce\u0001\u0000\u0000"+
		"\u0000\u01be\u06d0\u0001\u0000\u0000\u0000\u01c0\u06d2\u0001\u0000\u0000"+
		"\u0000\u01c2\u06d4\u0001\u0000\u0000\u0000\u01c4\u06d6\u0001\u0000\u0000"+
		"\u0000\u01c6\u06d8\u0001\u0000\u0000\u0000\u01c8\u06da\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cc\u0003\u0002\u0001\u0000\u01cb\u01ca\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000"+
		"\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005\u0000\u0000"+
		"\u0001\u01d1\u0001\u0001\u0000\u0000\u0000\u01d2\u01d5\u0003\u0004\u0002"+
		"\u0000\u01d3\u01d5\u0003\u01a4\u00d2\u0000\u01d4\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d5\u0003\u0001\u0000\u0000"+
		"\u0000\u01d6\u01dd\u0003\n\u0005\u0000\u01d7\u01dd\u0003\f\u0006\u0000"+
		"\u01d8\u01dd\u0003\u000e\u0007\u0000\u01d9\u01dd\u0003\u0010\b\u0000\u01da"+
		"\u01dd\u0003\u0012\t\u0000\u01db\u01dd\u0003\u0006\u0003\u0000\u01dc\u01d6"+
		"\u0001\u0000\u0000\u0000\u01dc\u01d7\u0001\u0000\u0000\u0000\u01dc\u01d8"+
		"\u0001\u0000\u0000\u0000\u01dc\u01d9\u0001\u0000\u0000\u0000\u01dc\u01da"+
		"\u0001\u0000\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd\u0005"+
		"\u0001\u0000\u0000\u0000\u01de\u01df\u0005\u0001\u0000\u0000\u01df\u01e0"+
		"\u0003\u01bc\u00de\u0000\u01e0\u01e1\u0005\u0002\u0000\u0000\u01e1\u01e2"+
		"\u0003\u0016\u000b\u0000\u01e2\u01e3\u0005\u0002\u0000\u0000\u01e3\u01e4"+
		"\u0003\b\u0004\u0000\u01e4\u01e5\u0003\u0014\n\u0000\u01e5\u01e6\u0005"+
		"\u0003\u0000\u0000\u01e6\u0007\u0001\u0000\u0000\u0000\u01e7\u01e8\u0003"+
		"\u00fe\u007f\u0000\u01e8\t\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005\u0004"+
		"\u0000\u0000\u01ea\u01eb\u0003\u01bc\u00de\u0000\u01eb\u01ec\u0005\u0002"+
		"\u0000\u0000\u01ec\u01ed\u0003\u0016\u000b\u0000\u01ed\u01ee\u0005\u0002"+
		"\u0000\u0000\u01ee\u01ef\u0003\u0018\f\u0000\u01ef\u01f0\u0003\u0014\n"+
		"\u0000\u01f0\u01f1\u0005\u0003\u0000\u0000\u01f1\u000b\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0005\u0005\u0000\u0000\u01f3\u01f4\u0003\u01bc\u00de"+
		"\u0000\u01f4\u01f5\u0005\u0002\u0000\u0000\u01f5\u01f6\u0003\u0016\u000b"+
		"\u0000\u01f6\u01f7\u0005\u0002\u0000\u0000\u01f7\u01f8\u0003x<\u0000\u01f8"+
		"\u01f9\u0003\u0014\n\u0000\u01f9\u01fa\u0005\u0003\u0000\u0000\u01fa\r"+
		"\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005\u0006\u0000\u0000\u01fc\u01fd"+
		"\u0003\u01bc\u00de\u0000\u01fd\u01fe\u0005\u0002\u0000\u0000\u01fe\u01ff"+
		"\u0003\u0016\u000b\u0000\u01ff\u0200\u0005\u0002\u0000\u0000\u0200\u0201"+
		"\u0003\u00f8|\u0000\u0201\u0202\u0003\u0014\n\u0000\u0202\u0203\u0005"+
		"\u0003\u0000\u0000\u0203\u000f\u0001\u0000\u0000\u0000\u0204\u0205\u0005"+
		"\u0007\u0000\u0000\u0205\u0206\u0003\u01bc\u00de\u0000\u0206\u0207\u0005"+
		"\u0002\u0000\u0000\u0207\u0208\u0003\u0016\u000b\u0000\u0208\u0209\u0005"+
		"\u0002\u0000\u0000\u0209\u020a\u0003\u00fe\u007f\u0000\u020a\u020b\u0003"+
		"\u0014\n\u0000\u020b\u020c\u0005\u0003\u0000\u0000\u020c\u0011\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0005\b\u0000\u0000\u020e\u020f\u0003\u01bc\u00de"+
		"\u0000\u020f\u0210\u0005\u0002\u0000\u0000\u0210\u0211\u0003\u0016\u000b"+
		"\u0000\u0211\u0212\u0005\u0002\u0000\u0000\u0212\u0213\u0003\u013c\u009e"+
		"\u0000\u0213\u0214\u0003\u0014\n\u0000\u0214\u0215\u0005\u0003\u0000\u0000"+
		"\u0215\u0013\u0001\u0000\u0000\u0000\u0216\u0217\u0005\u0002\u0000\u0000"+
		"\u0217\u0218\u0003\u0182\u00c1\u0000\u0218\u0219\u0003\u01a0\u00d0\u0000"+
		"\u0219\u021c\u0001\u0000\u0000\u0000\u021a\u021c\u0003\u01c8\u00e4\u0000"+
		"\u021b\u0216\u0001\u0000\u0000\u0000\u021b\u021a\u0001\u0000\u0000\u0000"+
		"\u021c\u0015\u0001\u0000\u0000\u0000\u021d\u0222\u0005D\u0000\u0000\u021e"+
		"\u021f\u0005D\u0000\u0000\u021f\u0220\u0005\t\u0000\u0000\u0220\u0222"+
		"\u0003\u01ae\u00d7\u0000\u0221\u021d\u0001\u0000\u0000\u0000\u0221\u021e"+
		"\u0001\u0000\u0000\u0000\u0222\u0017\u0001\u0000\u0000\u0000\u0223\u0227"+
		"\u0003\u001a\r\u0000\u0224\u0227\u0003b1\u0000\u0225\u0227\u0003r9\u0000"+
		"\u0226\u0223\u0001\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000"+
		"\u0226\u0225\u0001\u0000\u0000\u0000\u0227\u0019\u0001\u0000\u0000\u0000"+
		"\u0228\u022f\u0003,\u0016\u0000\u0229\u022f\u00036\u001b\u0000\u022a\u022f"+
		"\u0003\u001c\u000e\u0000\u022b\u022f\u0003D\"\u0000\u022c\u022f\u0003"+
		"t:\u0000\u022d\u022f\u0003v;\u0000\u022e\u0228\u0001\u0000\u0000\u0000"+
		"\u022e\u0229\u0001\u0000\u0000\u0000\u022e\u022a\u0001\u0000\u0000\u0000"+
		"\u022e\u022b\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000"+
		"\u022e\u022d\u0001\u0000\u0000\u0000\u022f\u001b\u0001\u0000\u0000\u0000"+
		"\u0230\u0234\u0003\u001e\u000f\u0000\u0231\u0234\u0003 \u0010\u0000\u0232"+
		"\u0234\u0003j5\u0000\u0233\u0230\u0001\u0000\u0000\u0000\u0233\u0231\u0001"+
		"\u0000\u0000\u0000\u0233\u0232\u0001\u0000\u0000\u0000\u0234\u001d\u0001"+
		"\u0000\u0000\u0000\u0235\u0236\u0003(\u0014\u0000\u0236\u0237\u0003\u0152"+
		"\u00a9\u0000\u0237\u0238\u0003(\u0014\u0000\u0238\u001f\u0001\u0000\u0000"+
		"\u0000\u0239\u023d\u0003\"\u0011\u0000\u023a\u023d\u0003$\u0012\u0000"+
		"\u023b\u023d\u0003&\u0013\u0000\u023c\u0239\u0001\u0000\u0000\u0000\u023c"+
		"\u023a\u0001\u0000\u0000\u0000\u023c\u023b\u0001\u0000\u0000\u0000\u023d"+
		"!\u0001\u0000\u0000\u0000\u023e\u023f\u0006\u0011\uffff\uffff\u0000\u023f"+
		"\u0240\u0003(\u0014\u0000\u0240\u0241\u0005V\u0000\u0000\u0241\u0242\u0003"+
		"(\u0014\u0000\u0242\u0248\u0001\u0000\u0000\u0000\u0243\u0244\n\u0001"+
		"\u0000\u0000\u0244\u0245\u0005V\u0000\u0000\u0245\u0247\u0003(\u0014\u0000"+
		"\u0246\u0243\u0001\u0000\u0000\u0000\u0247\u024a\u0001\u0000\u0000\u0000"+
		"\u0248\u0246\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000"+
		"\u0249#\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u0006\u0012\uffff\uffff\u0000\u024c\u024d\u0003(\u0014\u0000\u024d"+
		"\u024e\u0005\n\u0000\u0000\u024e\u024f\u0003(\u0014\u0000\u024f\u0255"+
		"\u0001\u0000\u0000\u0000\u0250\u0251\n\u0001\u0000\u0000\u0251\u0252\u0005"+
		"\n\u0000\u0000\u0252\u0254\u0003(\u0014\u0000\u0253\u0250\u0001\u0000"+
		"\u0000\u0000\u0254\u0257\u0001\u0000\u0000\u0000\u0255\u0253\u0001\u0000"+
		"\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256%\u0001\u0000\u0000"+
		"\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0258\u0259\u0006\u0013\uffff"+
		"\uffff\u0000\u0259\u025a\u0003(\u0014\u0000\u025a\u025b\u0005\u000b\u0000"+
		"\u0000\u025b\u025c\u0003(\u0014\u0000\u025c\u0262\u0001\u0000\u0000\u0000"+
		"\u025d\u025e\n\u0001\u0000\u0000\u025e\u025f\u0005\u000b\u0000\u0000\u025f"+
		"\u0261\u0003(\u0014\u0000\u0260\u025d\u0001\u0000\u0000\u0000\u0261\u0264"+
		"\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0262\u0263"+
		"\u0001\u0000\u0000\u0000\u0263\'\u0001\u0000\u0000\u0000\u0264\u0262\u0001"+
		"\u0000\u0000\u0000\u0265\u0269\u0003,\u0016\u0000\u0266\u0269\u00036\u001b"+
		"\u0000\u0267\u0269\u0003D\"\u0000\u0268\u0265\u0001\u0000\u0000\u0000"+
		"\u0268\u0266\u0001\u0000\u0000\u0000\u0268\u0267\u0001\u0000\u0000\u0000"+
		"\u0269)\u0001\u0000\u0000\u0000\u026a\u026d\u0003,\u0016\u0000\u026b\u026d"+
		"\u00038\u001c\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026b\u0001"+
		"\u0000\u0000\u0000\u026d+\u0001\u0000\u0000\u0000\u026e\u0276\u0003.\u0017"+
		"\u0000\u026f\u0276\u0003<\u001e\u0000\u0270\u0276\u0003\u0180\u00c0\u0000"+
		"\u0271\u0272\u0005\f\u0000\u0000\u0272\u0273\u0003\u001a\r\u0000\u0273"+
		"\u0274\u0005\r\u0000\u0000\u0274\u0276\u0001\u0000\u0000\u0000\u0275\u026e"+
		"\u0001\u0000\u0000\u0000\u0275\u026f\u0001\u0000\u0000\u0000\u0275\u0270"+
		"\u0001\u0000\u0000\u0000\u0275\u0271\u0001\u0000\u0000\u0000\u0276-\u0001"+
		"\u0000\u0000\u0000\u0277\u0278\u00030\u0018\u0000\u0278\u0279\u0003(\u0014"+
		"\u0000\u0279/\u0001\u0000\u0000\u0000\u027a\u027b\u0003\u0142\u00a1\u0000"+
		"\u027b\u027c\u0005\u000e\u0000\u0000\u027c\u027d\u00032\u0019\u0000\u027d"+
		"\u027e\u0005\u000f\u0000\u0000\u027e\u027f\u0005\u0010\u0000\u0000\u027f"+
		"1\u0001\u0000\u0000\u0000\u0280\u0286\u00034\u001a\u0000\u0281\u0282\u0003"+
		"4\u001a\u0000\u0282\u0283\u0005\u0002\u0000\u0000\u0283\u0284\u00032\u0019"+
		"\u0000\u0284\u0286\u0001\u0000\u0000\u0000\u0285\u0280\u0001\u0000\u0000"+
		"\u0000\u0285\u0281\u0001\u0000\u0000\u0000\u02863\u0001\u0000\u0000\u0000"+
		"\u0287\u0288\u0003\u0180\u00c0\u0000\u0288\u0289\u0005\u0010\u0000\u0000"+
		"\u0289\u028a\u0003d2\u0000\u028a5\u0001\u0000\u0000\u0000\u028b\u028e"+
		"\u00038\u001c\u0000\u028c\u028e\u0003:\u001d\u0000\u028d\u028b\u0001\u0000"+
		"\u0000\u0000\u028d\u028c\u0001\u0000\u0000\u0000\u028e7\u0001\u0000\u0000"+
		"\u0000\u028f\u0290\u0003\u0144\u00a2\u0000\u0290\u0291\u0003*\u0015\u0000"+
		"\u02919\u0001\u0000\u0000\u0000\u0292\u0293\u0003T*\u0000\u0293\u0294"+
		"\u0003\u016e\u00b7\u0000\u0294\u0295\u0003T*\u0000\u0295;\u0001\u0000"+
		"\u0000\u0000\u0296\u029b\u0003>\u001f\u0000\u0297\u029b\u0003@ \u0000"+
		"\u0298\u029b\u0003F#\u0000\u0299\u029b\u0003Z-\u0000\u029a\u0296\u0001"+
		"\u0000\u0000\u0000\u029a\u0297\u0001\u0000\u0000\u0000\u029a\u0298\u0001"+
		"\u0000\u0000\u0000\u029a\u0299\u0001\u0000\u0000\u0000\u029b=\u0001\u0000"+
		"\u0000\u0000\u029c\u029f\u0003\u0170\u00b8\u0000\u029d\u029f\u0003X,\u0000"+
		"\u029e\u029c\u0001\u0000\u0000\u0000\u029e\u029d\u0001\u0000\u0000\u0000"+
		"\u029f?\u0001\u0000\u0000\u0000\u02a0\u02a9\u0003\u0174\u00ba\u0000\u02a1"+
		"\u02a9\u0003B!\u0000\u02a2\u02a3\u0005\f\u0000\u0000\u02a3\u02a4\u0003"+
		"V+\u0000\u02a4\u02a5\u0005\r\u0000\u0000\u02a5\u02a9\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a9\u0003\u00e0p\u0000\u02a7\u02a9\u0003H$\u0000\u02a8"+
		"\u02a0\u0001\u0000\u0000\u0000\u02a8\u02a1\u0001\u0000\u0000\u0000\u02a8"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a8"+
		"\u02a7\u0001\u0000\u0000\u0000\u02a9A\u0001\u0000\u0000\u0000\u02aa\u02ad"+
		"\u0003\u017e\u00bf\u0000\u02ab\u02ad\u0003\u017c\u00be\u0000\u02ac\u02aa"+
		"\u0001\u0000\u0000\u0000\u02ac\u02ab\u0001\u0000\u0000\u0000\u02adC\u0001"+
		"\u0000\u0000\u0000\u02ae\u02af\u0003T*\u0000\u02af\u02b0\u0003\u016a\u00b5"+
		"\u0000\u02b0\u02b1\u0003T*\u0000\u02b1E\u0001\u0000\u0000\u0000\u02b2"+
		"\u02b3\u0003\u0178\u00bc\u0000\u02b3G\u0001\u0000\u0000\u0000\u02b4\u02b5"+
		"\u0005\u0011\u0000\u0000\u02b5\u02b6\u0003J%\u0000\u02b6\u02b7\u0005\u0002"+
		"\u0000\u0000\u02b7\u02b8\u0003N\'\u0000\u02b8\u02b9\u0005\u0002\u0000"+
		"\u0000\u02b9\u02ba\u0003\u001a\r\u0000\u02ba\u02bb\u0005\r\u0000\u0000"+
		"\u02bbI\u0001\u0000\u0000\u0000\u02bc\u02c2\u0003b1\u0000\u02bd\u02be"+
		"\u0005\u000e\u0000\u0000\u02be\u02bf\u0003L&\u0000\u02bf\u02c0\u0005\u000f"+
		"\u0000\u0000\u02c0\u02c2\u0001\u0000\u0000\u0000\u02c1\u02bc\u0001\u0000"+
		"\u0000\u0000\u02c1\u02bd\u0001\u0000\u0000\u0000\u02c2K\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c9\u0003b1\u0000\u02c4\u02c5\u0003b1\u0000\u02c5\u02c6"+
		"\u0005\u0002\u0000\u0000\u02c6\u02c7\u0003L&\u0000\u02c7\u02c9\u0001\u0000"+
		"\u0000\u0000\u02c8\u02c3\u0001\u0000\u0000\u0000\u02c8\u02c4\u0001\u0000"+
		"\u0000\u0000\u02c9M\u0001\u0000\u0000\u0000\u02ca\u02d0\u0003P(\u0000"+
		"\u02cb\u02cc\u0005\u000e\u0000\u0000\u02cc\u02cd\u0003R)\u0000\u02cd\u02ce"+
		"\u0005\u000f\u0000\u0000\u02ce\u02d0\u0001\u0000\u0000\u0000\u02cf\u02ca"+
		"\u0001\u0000\u0000\u0000\u02cf\u02cb\u0001\u0000\u0000\u0000\u02d0O\u0001"+
		"\u0000\u0000\u0000\u02d1\u02d2\u0003\u001a\r\u0000\u02d2\u02d3\u0003\u015a"+
		"\u00ad\u0000\u02d3\u02d4\u0003\u001a\r\u0000\u02d4Q\u0001\u0000\u0000"+
		"\u0000\u02d5\u02db\u0003P(\u0000\u02d6\u02d7\u0003P(\u0000\u02d7\u02d8"+
		"\u0005\u0002\u0000\u0000\u02d8\u02d9\u0003R)\u0000\u02d9\u02db\u0001\u0000"+
		"\u0000\u0000\u02da\u02d5\u0001\u0000\u0000\u0000\u02da\u02d6\u0001\u0000"+
		"\u0000\u0000\u02dbS\u0001\u0000\u0000\u0000\u02dc\u02e3\u0003<\u001e\u0000"+
		"\u02dd\u02e3\u0003\u0180\u00c0\u0000\u02de\u02df\u0005\f\u0000\u0000\u02df"+
		"\u02e0\u0003\u001a\r\u0000\u02e0\u02e1\u0005\r\u0000\u0000\u02e1\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e2\u02dc\u0001\u0000\u0000\u0000\u02e2\u02dd"+
		"\u0001\u0000\u0000\u0000\u02e2\u02de\u0001\u0000\u0000\u0000\u02e3U\u0001"+
		"\u0000\u0000\u0000\u02e4\u02ea\u0003\u0152\u00a9\u0000\u02e5\u02ea\u0003"+
		"\u0154\u00aa\u0000\u02e6\u02ea\u0003\u016c\u00b6\u0000\u02e7\u02ea\u0003"+
		"\u016e\u00b7\u0000\u02e8\u02ea\u0003\u0144\u00a2\u0000\u02e9\u02e4\u0001"+
		"\u0000\u0000\u0000\u02e9\u02e5\u0001\u0000\u0000\u0000\u02e9\u02e6\u0001"+
		"\u0000\u0000\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02e9\u02e8\u0001"+
		"\u0000\u0000\u0000\u02eaW\u0001\u0000\u0000\u0000\u02eb\u02f1\u0005\u0012"+
		"\u0000\u0000\u02ec\u02ed\u0005\u000e\u0000\u0000\u02ed\u02ee\u0003^/\u0000"+
		"\u02ee\u02ef\u0005\u000f\u0000\u0000\u02ef\u02f1\u0001\u0000\u0000\u0000"+
		"\u02f0\u02eb\u0001\u0000\u0000\u0000\u02f0\u02ec\u0001\u0000\u0000\u0000"+
		"\u02f1Y\u0001\u0000\u0000\u0000\u02f2\u02f3\u0003\u0176\u00bb\u0000\u02f3"+
		"\u02f4\u0005\f\u0000\u0000\u02f4\u02f5\u0003\\.\u0000\u02f5\u02f6\u0005"+
		"\r\u0000\u0000\u02f6\u0302\u0001\u0000\u0000\u0000\u02f7\u02f8\u0003\u017a"+
		"\u00bd\u0000\u02f8\u02f9\u0005\f\u0000\u0000\u02f9\u02fa\u0003\\.\u0000"+
		"\u02fa\u02fb\u0005\r\u0000\u0000\u02fb\u0302\u0001\u0000\u0000\u0000\u02fc"+
		"\u02fd\u0003\u0172\u00b9\u0000\u02fd\u02fe\u0005\f\u0000\u0000\u02fe\u02ff"+
		"\u0003\\.\u0000\u02ff\u0300\u0005\r\u0000\u0000\u0300\u0302\u0001\u0000"+
		"\u0000\u0000\u0301\u02f2\u0001\u0000\u0000\u0000\u0301\u02f7\u0001\u0000"+
		"\u0000\u0000\u0301\u02fc\u0001\u0000\u0000\u0000\u0302[\u0001\u0000\u0000"+
		"\u0000\u0303\u0304\u0003^/\u0000\u0304]\u0001\u0000\u0000\u0000\u0305"+
		"\u0309\u0003\u001a\r\u0000\u0306\u0308\u0003`0\u0000\u0307\u0306\u0001"+
		"\u0000\u0000\u0000\u0308\u030b\u0001\u0000\u0000\u0000\u0309\u0307\u0001"+
		"\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000\u030a_\u0001\u0000"+
		"\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030c\u030d\u0005\u0002"+
		"\u0000\u0000\u030d\u030e\u0003\u001a\r\u0000\u030ea\u0001\u0000\u0000"+
		"\u0000\u030f\u0310\u0003\u015e\u00af\u0000\u0310\u0311\u0005\u0010\u0000"+
		"\u0000\u0311\u0312\u0003d2\u0000\u0312\u0318\u0001\u0000\u0000\u0000\u0313"+
		"\u0314\u0005\f\u0000\u0000\u0314\u0315\u0003b1\u0000\u0315\u0316\u0005"+
		"\r\u0000\u0000\u0316\u0318\u0001\u0000\u0000\u0000\u0317\u030f\u0001\u0000"+
		"\u0000\u0000\u0317\u0313\u0001\u0000\u0000\u0000\u0318c\u0001\u0000\u0000"+
		"\u0000\u0319\u031d\u0003f3\u0000\u031a\u031d\u0003l6\u0000\u031b\u031d"+
		"\u0003h4\u0000\u031c\u0319\u0001\u0000\u0000\u0000\u031c\u031a\u0001\u0000"+
		"\u0000\u0000\u031c\u031b\u0001\u0000\u0000\u0000\u031de\u0001\u0000\u0000"+
		"\u0000\u031e\u031f\u0003,\u0016\u0000\u031fg\u0001\u0000\u0000\u0000\u0320"+
		"\u0321\u0003&\u0013\u0000\u0321i\u0001\u0000\u0000\u0000\u0322\u0326\u0003"+
		"l6\u0000\u0323\u0326\u0003n7\u0000\u0324\u0326\u0003p8\u0000\u0325\u0322"+
		"\u0001\u0000\u0000\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0325\u0324"+
		"\u0001\u0000\u0000\u0000\u0326k\u0001\u0000\u0000\u0000\u0327\u0328\u0003"+
		"f3\u0000\u0328\u0329\u0005Y\u0000\u0000\u0329\u032a\u0003f3\u0000\u032a"+
		"\u0330\u0001\u0000\u0000\u0000\u032b\u032c\u0003f3\u0000\u032c\u032d\u0005"+
		"Y\u0000\u0000\u032d\u032e\u0003l6\u0000\u032e\u0330\u0001\u0000\u0000"+
		"\u0000\u032f\u0327\u0001\u0000\u0000\u0000\u032f\u032b\u0001\u0000\u0000"+
		"\u0000\u0330m\u0001\u0000\u0000\u0000\u0331\u0332\u00067\uffff\uffff\u0000"+
		"\u0332\u0333\u0003f3\u0000\u0333\u0334\u0005W\u0000\u0000\u0334\u0335"+
		"\u0003f3\u0000\u0335\u033b\u0001\u0000\u0000\u0000\u0336\u0337\n\u0001"+
		"\u0000\u0000\u0337\u0338\u0005W\u0000\u0000\u0338\u033a\u0003f3\u0000"+
		"\u0339\u0336\u0001\u0000\u0000\u0000\u033a\u033d\u0001\u0000\u0000\u0000"+
		"\u033b\u0339\u0001\u0000\u0000\u0000\u033b\u033c\u0001\u0000\u0000\u0000"+
		"\u033co\u0001\u0000\u0000\u0000\u033d\u033b\u0001\u0000\u0000\u0000\u033e"+
		"\u033f\u00068\uffff\uffff\u0000\u033f\u0340\u0003f3\u0000\u0340\u0341"+
		"\u0005X\u0000\u0000\u0341\u0342\u0003f3\u0000\u0342\u0348\u0001\u0000"+
		"\u0000\u0000\u0343\u0344\n\u0001\u0000\u0000\u0344\u0345\u0005X\u0000"+
		"\u0000\u0345\u0347\u0003f3\u0000\u0346\u0343\u0001\u0000\u0000\u0000\u0347"+
		"\u034a\u0001\u0000\u0000\u0000\u0348\u0346\u0001\u0000\u0000\u0000\u0348"+
		"\u0349\u0001\u0000\u0000\u0000\u0349q\u0001\u0000\u0000\u0000\u034a\u0348"+
		"\u0001\u0000\u0000\u0000\u034b\u034c\u0003\u0160\u00b0\u0000\u034c\u034d"+
		"\u0003\u014a\u00a5\u0000\u034d\u034e\u0003\u0160\u00b0\u0000\u034es\u0001"+
		"\u0000\u0000\u0000\u034f\u0350\u0003<\u001e\u0000\u0350\u0351\u0003\u015c"+
		"\u00ae\u0000\u0351\u0352\u0003\u001a\r\u0000\u0352u\u0001\u0000\u0000"+
		"\u0000\u0353\u0354\u0003X,\u0000\u0354\u0355\u0003\u0158\u00ac\u0000\u0355"+
		"\u0356\u0003X,\u0000\u0356w\u0001\u0000\u0000\u0000\u0357\u035b\u0003"+
		"z=\u0000\u0358\u035b\u0003\u00c2a\u0000\u0359\u035b\u0003\u00dam\u0000"+
		"\u035a\u0357\u0001\u0000\u0000\u0000\u035a\u0358\u0001\u0000\u0000\u0000"+
		"\u035a\u0359\u0001\u0000\u0000\u0000\u035by\u0001\u0000\u0000\u0000\u035c"+
		"\u0363\u0003\u008aE\u0000\u035d\u0363\u0003\u0096K\u0000\u035e\u0363\u0003"+
		"|>\u0000\u035f\u0363\u0003\u00a4R\u0000\u0360\u0363\u0003\u00dcn\u0000"+
		"\u0361\u0363\u0003\u00deo\u0000\u0362\u035c\u0001\u0000\u0000\u0000\u0362"+
		"\u035d\u0001\u0000\u0000\u0000\u0362\u035e\u0001\u0000\u0000\u0000\u0362"+
		"\u035f\u0001\u0000\u0000\u0000\u0362\u0360\u0001\u0000\u0000\u0000\u0362"+
		"\u0361\u0001\u0000\u0000\u0000\u0363{\u0001\u0000\u0000\u0000\u0364\u0367"+
		"\u0003~?\u0000\u0365\u0367\u0003\u0080@\u0000\u0366\u0364\u0001\u0000"+
		"\u0000\u0000\u0366\u0365\u0001\u0000\u0000\u0000\u0367}\u0001\u0000\u0000"+
		"\u0000\u0368\u0369\u0003\u0086C\u0000\u0369\u036a\u0003\u0152\u00a9\u0000"+
		"\u036a\u036b\u0003\u0086C\u0000\u036b\u007f\u0001\u0000\u0000\u0000\u036c"+
		"\u036f\u0003\u0082A\u0000\u036d\u036f\u0003\u0084B\u0000\u036e\u036c\u0001"+
		"\u0000\u0000\u0000\u036e\u036d\u0001\u0000\u0000\u0000\u036f\u0081\u0001"+
		"\u0000\u0000\u0000\u0370\u0371\u0006A\uffff\uffff\u0000\u0371\u0372\u0003"+
		"\u0086C\u0000\u0372\u0373\u0005V\u0000\u0000\u0373\u0374\u0003\u0086C"+
		"\u0000\u0374\u037a\u0001\u0000\u0000\u0000\u0375\u0376\n\u0001\u0000\u0000"+
		"\u0376\u0377\u0005V\u0000\u0000\u0377\u0379\u0003\u0086C\u0000\u0378\u0375"+
		"\u0001\u0000\u0000\u0000\u0379\u037c\u0001\u0000\u0000\u0000\u037a\u0378"+
		"\u0001\u0000\u0000\u0000\u037a\u037b\u0001\u0000\u0000\u0000\u037b\u0083"+
		"\u0001\u0000\u0000\u0000\u037c\u037a\u0001\u0000\u0000\u0000\u037d\u037e"+
		"\u0006B\uffff\uffff\u0000\u037e\u037f\u0003\u0086C\u0000\u037f\u0380\u0005"+
		"\n\u0000\u0000\u0380\u0381\u0003\u0086C\u0000\u0381\u0387\u0001\u0000"+
		"\u0000\u0000\u0382\u0383\n\u0001\u0000\u0000\u0383\u0384\u0005\n\u0000"+
		"\u0000\u0384\u0386\u0003\u0086C\u0000\u0385\u0382\u0001\u0000\u0000\u0000"+
		"\u0386\u0389\u0001\u0000\u0000\u0000\u0387\u0385\u0001\u0000\u0000\u0000"+
		"\u0387\u0388\u0001\u0000\u0000\u0000\u0388\u0085\u0001\u0000\u0000\u0000"+
		"\u0389\u0387\u0001\u0000\u0000\u0000\u038a\u038e\u0003\u008aE\u0000\u038b"+
		"\u038e\u0003\u0096K\u0000\u038c\u038e\u0003\u00a4R\u0000\u038d\u038a\u0001"+
		"\u0000\u0000\u0000\u038d\u038b\u0001\u0000\u0000\u0000\u038d\u038c\u0001"+
		"\u0000\u0000\u0000\u038e\u0087\u0001\u0000\u0000\u0000\u038f\u0392\u0003"+
		"\u008aE\u0000\u0390\u0392\u0003\u0098L\u0000\u0391\u038f\u0001\u0000\u0000"+
		"\u0000\u0391\u0390\u0001\u0000\u0000\u0000\u0392\u0089\u0001\u0000\u0000"+
		"\u0000\u0393\u039b\u0003\u008eG\u0000\u0394\u039b\u0003\u009cN\u0000\u0395"+
		"\u039b\u0003\u008cF\u0000\u0396\u0397\u0005\f\u0000\u0000\u0397\u0398"+
		"\u0003z=\u0000\u0398\u0399\u0005\r\u0000\u0000\u0399\u039b\u0001\u0000"+
		"\u0000\u0000\u039a\u0393\u0001\u0000\u0000\u0000\u039a\u0394\u0001\u0000"+
		"\u0000\u0000\u039a\u0395\u0001\u0000\u0000\u0000\u039a\u0396\u0001\u0000"+
		"\u0000\u0000\u039b\u008b\u0001\u0000\u0000\u0000\u039c\u039d\u0003\u0180"+
		"\u00c0\u0000\u039d\u008d\u0001\u0000\u0000\u0000\u039e\u039f\u0003\u014e"+
		"\u00a7\u0000\u039f\u03a0\u0005\u000e\u0000\u0000\u03a0\u03a1\u0003\u0090"+
		"H\u0000\u03a1\u03a2\u0005\u000f\u0000\u0000\u03a2\u03a3\u0005\u0010\u0000"+
		"\u0000\u03a3\u03a4\u0003\u0086C\u0000\u03a4\u008f\u0001\u0000\u0000\u0000"+
		"\u03a5\u03ab\u0003\u0092I\u0000\u03a6\u03a7\u0003\u0092I\u0000\u03a7\u03a8"+
		"\u0005\u0002\u0000\u0000\u03a8\u03a9\u0003\u0090H\u0000\u03a9\u03ab\u0001"+
		"\u0000\u0000\u0000\u03aa\u03a5\u0001\u0000\u0000\u0000\u03aa\u03a6\u0001"+
		"\u0000\u0000\u0000\u03ab\u0091\u0001\u0000\u0000\u0000\u03ac\u03af\u0003"+
		"\u0094J\u0000\u03ad\u03af\u0003\u0180\u00c0\u0000\u03ae\u03ac\u0001\u0000"+
		"\u0000\u0000\u03ae\u03ad\u0001\u0000\u0000\u0000\u03af\u0093\u0001\u0000"+
		"\u0000\u0000\u03b0\u03b1\u0003\u0180\u00c0\u0000\u03b1\u03b2\u0005\u0010"+
		"\u0000\u0000\u03b2\u03b3\u0003\u00ceg\u0000\u03b3\u0095\u0001\u0000\u0000"+
		"\u0000\u03b4\u03b7\u0003\u0098L\u0000\u03b5\u03b7\u0003\u009aM\u0000\u03b6"+
		"\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b7"+
		"\u0097\u0001\u0000\u0000\u0000\u03b8\u03b9\u0003\u014c\u00a6\u0000\u03b9"+
		"\u03ba\u0003\u0088D\u0000\u03ba\u0099\u0001\u0000\u0000\u0000\u03bb\u03bc"+
		"\u0003\u00ba]\u0000\u03bc\u03bd\u0003\u016e\u00b7\u0000\u03bd\u03be\u0003"+
		"\u00ba]\u0000\u03be\u009b\u0001\u0000\u0000\u0000\u03bf\u03c3\u0003\u009e"+
		"O\u0000\u03c0\u03c3\u0003\u00a0P\u0000\u03c1\u03c3\u0003\u00a6S\u0000"+
		"\u03c2\u03bf\u0001\u0000\u0000\u0000\u03c2\u03c0\u0001\u0000\u0000\u0000"+
		"\u03c2\u03c1\u0001\u0000\u0000\u0000\u03c3\u009d\u0001\u0000\u0000\u0000"+
		"\u03c4\u03cb\u0003\u0170\u00b8\u0000\u03c5\u03c6\u0003\u0172\u00b9\u0000"+
		"\u03c6\u03c7\u0005\f\u0000\u0000\u03c7\u03c8\u0003\u00be_\u0000\u03c8"+
		"\u03c9\u0005\r\u0000\u0000\u03c9\u03cb\u0001\u0000\u0000\u0000\u03ca\u03c4"+
		"\u0001\u0000\u0000\u0000\u03ca\u03c5\u0001\u0000\u0000\u0000\u03cb\u009f"+
		"\u0001\u0000\u0000\u0000\u03cc\u03cd\u0003\u00a2Q\u0000\u03cd\u00a1\u0001"+
		"\u0000\u0000\u0000\u03ce\u03d7\u0003\u0174\u00ba\u0000\u03cf\u03d0\u0003"+
		"\u0176\u00bb\u0000\u03d0\u03d1\u0005\f\u0000\u0000\u03d1\u03d2\u0003\u00be"+
		"_\u0000\u03d2\u03d3\u0005\r\u0000\u0000\u03d3\u03d7\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d7\u0003\u00b6[\u0000\u03d5\u03d7\u0003\u00a8T\u0000\u03d6"+
		"\u03ce\u0001\u0000\u0000\u0000\u03d6\u03cf\u0001\u0000\u0000\u0000\u03d6"+
		"\u03d4\u0001\u0000\u0000\u0000\u03d6\u03d5\u0001\u0000\u0000\u0000\u03d7"+
		"\u00a3\u0001\u0000\u0000\u0000\u03d8\u03d9\u0003\u00ba]\u0000\u03d9\u03da"+
		"\u0003\u016a\u00b5\u0000\u03da\u03db\u0003\u00ba]\u0000\u03db\u00a5\u0001"+
		"\u0000\u0000\u0000\u03dc\u03e3\u0003\u0178\u00bc\u0000\u03dd\u03de\u0003"+
		"\u017a\u00bd\u0000\u03de\u03df\u0005\f\u0000\u0000\u03df\u03e0\u0003\u00be"+
		"_\u0000\u03e0\u03e1\u0005\r\u0000\u0000\u03e1\u03e3\u0001\u0000\u0000"+
		"\u0000\u03e2\u03dc\u0001\u0000\u0000\u0000\u03e2\u03dd\u0001\u0000\u0000"+
		"\u0000\u03e3\u00a7\u0001\u0000\u0000\u0000\u03e4\u03e5\u0005\u0011\u0000"+
		"\u0000\u03e5\u03e6\u0003\u00aaU\u0000\u03e6\u03e7\u0005\u0002\u0000\u0000"+
		"\u03e7\u03e8\u0003\u00aeW\u0000\u03e8\u03e9\u0005\u0002\u0000\u0000\u03e9"+
		"\u03ea\u0003\u00b8\\\u0000\u03ea\u03eb\u0005\r\u0000\u0000\u03eb\u00a9"+
		"\u0001\u0000\u0000\u0000\u03ec\u03f2\u0003\u00c2a\u0000\u03ed\u03ee\u0005"+
		"\u000e\u0000\u0000\u03ee\u03ef\u0003\u00acV\u0000\u03ef\u03f0\u0005\u000f"+
		"\u0000\u0000\u03f0\u03f2\u0001\u0000\u0000\u0000\u03f1\u03ec\u0001\u0000"+
		"\u0000\u0000\u03f1\u03ed\u0001\u0000\u0000\u0000\u03f2\u00ab\u0001\u0000"+
		"\u0000\u0000\u03f3\u03f9\u0003\u00c2a\u0000\u03f4\u03f5\u0003\u00c2a\u0000"+
		"\u03f5\u03f6\u0005\u0002\u0000\u0000\u03f6\u03f7\u0003\u00acV\u0000\u03f7"+
		"\u03f9\u0001\u0000\u0000\u0000\u03f8\u03f3\u0001\u0000\u0000\u0000\u03f8"+
		"\u03f4\u0001\u0000\u0000\u0000\u03f9\u00ad\u0001\u0000\u0000\u0000\u03fa"+
		"\u0400\u0003\u00b0X\u0000\u03fb\u03fc\u0005\u000e\u0000\u0000\u03fc\u03fd"+
		"\u0003\u00b4Z\u0000\u03fd\u03fe\u0005\u000f\u0000\u0000\u03fe\u0400\u0001"+
		"\u0000\u0000\u0000\u03ff\u03fa\u0001\u0000\u0000\u0000\u03ff\u03fb\u0001"+
		"\u0000\u0000\u0000\u0400\u00af\u0001\u0000\u0000\u0000\u0401\u0402\u0003"+
		"\u00b2Y\u0000\u0402\u0403\u0003\u015a\u00ad\u0000\u0403\u0404\u0003\u00b8"+
		"\\\u0000\u0404\u00b1\u0001\u0000\u0000\u0000\u0405\u0408\u0003\u009eO"+
		"\u0000\u0406\u0408\u0003\u00bc^\u0000\u0407\u0405\u0001\u0000\u0000\u0000"+
		"\u0407\u0406\u0001\u0000\u0000\u0000\u0408\u00b3\u0001\u0000\u0000\u0000"+
		"\u0409\u040f\u0003\u00b0X\u0000\u040a\u040b\u0003\u00b0X\u0000\u040b\u040c"+
		"\u0005\u0002\u0000\u0000\u040c\u040d\u0003\u00b4Z\u0000\u040d\u040f\u0001"+
		"\u0000\u0000\u0000\u040e\u0409\u0001\u0000\u0000\u0000\u040e\u040a\u0001"+
		"\u0000\u0000\u0000\u040f\u00b5\u0001\u0000\u0000\u0000\u0410\u0411\u0003"+
		"\u00e8t\u0000\u0411\u0412\u0005\u000b\u0000\u0000\u0412\u0413\u0005\f"+
		"\u0000\u0000\u0413\u0414\u0003\u00be_\u0000\u0414\u0415\u0005\r\u0000"+
		"\u0000\u0415\u00b7\u0001\u0000\u0000\u0000\u0416\u041a\u0003z=\u0000\u0417"+
		"\u041a\u0003\u017e\u00bf\u0000\u0418\u041a\u0003\u00bc^\u0000\u0419\u0416"+
		"\u0001\u0000\u0000\u0000\u0419\u0417\u0001\u0000\u0000\u0000\u0419\u0418"+
		"\u0001\u0000\u0000\u0000\u041a\u00b9\u0001\u0000\u0000\u0000\u041b\u0424"+
		"\u0003\u009cN\u0000\u041c\u0424\u0003\u017e\u00bf\u0000\u041d\u0424\u0003"+
		"\u00bc^\u0000\u041e\u0424\u0003\u0180\u00c0\u0000\u041f\u0420\u0005\f"+
		"\u0000\u0000\u0420\u0421\u0003z=\u0000\u0421\u0422\u0005\r\u0000\u0000"+
		"\u0422\u0424\u0001\u0000\u0000\u0000\u0423\u041b\u0001\u0000\u0000\u0000"+
		"\u0423\u041c\u0001\u0000\u0000\u0000\u0423\u041d\u0001\u0000\u0000\u0000"+
		"\u0423\u041e\u0001\u0000\u0000\u0000\u0423\u041f\u0001\u0000\u0000\u0000"+
		"\u0424\u00bb\u0001\u0000\u0000\u0000\u0425\u042b\u0005\u0012\u0000\u0000"+
		"\u0426\u0427\u0005\u000e\u0000\u0000\u0427\u0428\u0003\u00be_\u0000\u0428"+
		"\u0429\u0005\u000f\u0000\u0000\u0429\u042b\u0001\u0000\u0000\u0000\u042a"+
		"\u0425\u0001\u0000\u0000\u0000\u042a\u0426\u0001\u0000\u0000\u0000\u042b"+
		"\u00bd\u0001\u0000\u0000\u0000\u042c\u0430\u0003\u00b8\\\u0000\u042d\u042f"+
		"\u0003\u00c0`\u0000\u042e\u042d\u0001\u0000\u0000\u0000\u042f\u0432\u0001"+
		"\u0000\u0000\u0000\u0430\u042e\u0001\u0000\u0000\u0000\u0430\u0431\u0001"+
		"\u0000\u0000\u0000\u0431\u00bf\u0001\u0000\u0000\u0000\u0432\u0430\u0001"+
		"\u0000\u0000\u0000\u0433\u0434\u0005\u0002\u0000\u0000\u0434\u0435\u0003"+
		"\u00b8\\\u0000\u0435\u00c1\u0001\u0000\u0000\u0000\u0436\u0437\u0003\u015e"+
		"\u00af\u0000\u0437\u0438\u0005\u0010\u0000\u0000\u0438\u0439\u0003\u00c4"+
		"b\u0000\u0439\u043f\u0001\u0000\u0000\u0000\u043a\u043b\u0005\f\u0000"+
		"\u0000\u043b\u043c\u0003\u00c2a\u0000\u043c\u043d\u0005\r\u0000\u0000"+
		"\u043d\u043f\u0001\u0000\u0000\u0000\u043e\u0436\u0001\u0000\u0000\u0000"+
		"\u043e\u043a\u0001\u0000\u0000\u0000\u043f\u00c3\u0001\u0000\u0000\u0000"+
		"\u0440\u0443\u0003\u00ceg\u0000\u0441\u0443\u0003\u00c6c\u0000\u0442\u0440"+
		"\u0001\u0000\u0000\u0000\u0442\u0441\u0001\u0000\u0000\u0000\u0443\u00c5"+
		"\u0001\u0000\u0000\u0000\u0444\u044b\u0003\u00d2i\u0000\u0445\u044b\u0003"+
		"\u00c8d\u0000\u0446\u0447\u0005\f\u0000\u0000\u0447\u0448\u0003\u00c6"+
		"c\u0000\u0448\u0449\u0005\r\u0000\u0000\u0449\u044b\u0001\u0000\u0000"+
		"\u0000\u044a\u0444\u0001\u0000\u0000\u0000\u044a\u0445\u0001\u0000\u0000"+
		"\u0000\u044a\u0446\u0001\u0000\u0000\u0000\u044b\u00c7\u0001\u0000\u0000"+
		"\u0000\u044c\u044d\u0003\u0148\u00a4\u0000\u044d\u044e\u0005\u000e\u0000"+
		"\u0000\u044e\u044f\u0003\u0090H\u0000\u044f\u0450\u0005\u000f\u0000\u0000"+
		"\u0450\u0451\u0005\u0010\u0000\u0000\u0451\u0452\u0003\u00cae\u0000\u0452"+
		"\u00c9\u0001\u0000\u0000\u0000\u0453\u045a\u0003\u00ceg\u0000\u0454\u0455"+
		"\u0005\f\u0000\u0000\u0455\u0456\u0003\u00d2i\u0000\u0456\u0457\u0005"+
		"\r\u0000\u0000\u0457\u045a\u0001\u0000\u0000\u0000\u0458\u045a\u0003\u00c8"+
		"d\u0000\u0459\u0453\u0001\u0000\u0000\u0000\u0459\u0454\u0001\u0000\u0000"+
		"\u0000\u0459\u0458\u0001\u0000\u0000\u0000\u045a\u00cb\u0001\u0000\u0000"+
		"\u0000\u045b\u0461\u0003\u00ceg\u0000\u045c\u045d\u0005\f\u0000\u0000"+
		"\u045d\u045e\u0003\u00d4j\u0000\u045e\u045f\u0005\r\u0000\u0000\u045f"+
		"\u0461\u0001\u0000\u0000\u0000\u0460\u045b\u0001\u0000\u0000\u0000\u0460"+
		"\u045c\u0001\u0000\u0000\u0000\u0461\u00cd\u0001\u0000\u0000\u0000\u0462"+
		"\u0470\u0003\u0162\u00b1\u0000\u0463\u0470\u0003\u0166\u00b3\u0000\u0464"+
		"\u0470\u0003\u0180\u00c0\u0000\u0465\u0466\u0003\u0164\u00b2\u0000\u0466"+
		"\u0467\u0005\f\u0000\u0000\u0467\u0468\u0003\u00d0h\u0000\u0468\u0469"+
		"\u0005\r\u0000\u0000\u0469\u0470\u0001\u0000\u0000\u0000\u046a\u046b\u0005"+
		"\f\u0000\u0000\u046b\u046c\u0003\u00ceg\u0000\u046c\u046d\u0005\r\u0000"+
		"\u0000\u046d\u0470\u0001\u0000\u0000\u0000\u046e\u0470\u0003\u00d6k\u0000"+
		"\u046f\u0462\u0001\u0000\u0000\u0000\u046f\u0463\u0001\u0000\u0000\u0000"+
		"\u046f\u0464\u0001\u0000\u0000\u0000\u046f\u0465\u0001\u0000\u0000\u0000"+
		"\u046f\u046a\u0001\u0000\u0000\u0000\u046f\u046e\u0001\u0000\u0000\u0000"+
		"\u0470\u00cf\u0001\u0000\u0000\u0000\u0471\u0477\u0003\u00ceg\u0000\u0472"+
		"\u0473\u0003\u00ceg\u0000\u0473\u0474\u0005\u0002\u0000\u0000\u0474\u0475"+
		"\u0003\u00d0h\u0000\u0475\u0477\u0001\u0000\u0000\u0000\u0476\u0471\u0001"+
		"\u0000\u0000\u0000\u0476\u0472\u0001\u0000\u0000\u0000\u0477\u00d1\u0001"+
		"\u0000\u0000\u0000\u0478\u0479\u0003\u00ccf\u0000\u0479\u047a\u0005Y\u0000"+
		"\u0000\u047a\u047b\u0003\u00ceg\u0000\u047b\u00d3\u0001\u0000\u0000\u0000"+
		"\u047c\u047d\u0006j\uffff\uffff\u0000\u047d\u047e\u0003\u00ccf\u0000\u047e"+
		"\u047f\u0005W\u0000\u0000\u047f\u0480\u0003\u00ceg\u0000\u0480\u0486\u0001"+
		"\u0000\u0000\u0000\u0481\u0482\n\u0001\u0000\u0000\u0482\u0483\u0005W"+
		"\u0000\u0000\u0483\u0485\u0003\u00ceg\u0000\u0484\u0481\u0001\u0000\u0000"+
		"\u0000\u0485\u0488\u0001\u0000\u0000\u0000\u0486\u0484\u0001\u0000\u0000"+
		"\u0000\u0486\u0487\u0001\u0000\u0000\u0000\u0487\u00d5\u0001\u0000\u0000"+
		"\u0000\u0488\u0486\u0001\u0000\u0000\u0000\u0489\u048a\u0005\u000e\u0000"+
		"\u0000\u048a\u048b\u0003\u00d8l\u0000\u048b\u048c\u0005\u000f\u0000\u0000"+
		"\u048c\u00d7\u0001\u0000\u0000\u0000\u048d\u0493\u0003\u00c4b\u0000\u048e"+
		"\u048f\u0003\u00c4b\u0000\u048f\u0490\u0005\u0002\u0000\u0000\u0490\u0491"+
		"\u0003\u00d8l\u0000\u0491\u0493\u0001\u0000\u0000\u0000\u0492\u048d\u0001"+
		"\u0000\u0000\u0000\u0492\u048e\u0001\u0000\u0000\u0000\u0493\u00d9\u0001"+
		"\u0000\u0000\u0000\u0494\u0495\u0003\u0160\u00b0\u0000\u0495\u0496\u0003"+
		"\u014a\u00a5\u0000\u0496\u0497\u0003\u0160\u00b0\u0000\u0497\u00db\u0001"+
		"\u0000\u0000\u0000\u0498\u0499\u0003\u009cN\u0000\u0499\u049a\u0003\u015c"+
		"\u00ae\u0000\u049a\u049b\u0003\u00b8\\\u0000\u049b\u00dd\u0001\u0000\u0000"+
		"\u0000\u049c\u049d\u0003\u00bc^\u0000\u049d\u049e\u0003\u0158\u00ac\u0000"+
		"\u049e\u049f\u0003\u00bc^\u0000\u049f\u00df\u0001\u0000\u0000\u0000\u04a0"+
		"\u04a1\u0005\u0013\u0000\u0000\u04a1\u04a2\u0003\u00f0x\u0000\u04a2\u04a3"+
		"\u0005\u0014\u0000\u0000\u04a3\u04ab\u0001\u0000\u0000\u0000\u04a4\u04a5"+
		"\u0005\u0013\u0000\u0000\u04a5\u04a6\u0003\u00f0x\u0000\u04a6\u04a7\u0005"+
		"\f\u0000\u0000\u04a7\u04a8\u0003\u00e2q\u0000\u04a8\u04a9\u0005\u0015"+
		"\u0000\u0000\u04a9\u04ab\u0001\u0000\u0000\u0000\u04aa\u04a0\u0001\u0000"+
		"\u0000\u0000\u04aa\u04a4\u0001\u0000\u0000\u0000\u04ab\u00e1\u0001\u0000"+
		"\u0000\u0000\u04ac\u04b2\u0003\u00e4r\u0000\u04ad\u04ae\u0003\u00e4r\u0000"+
		"\u04ae\u04af\u0005\u0002\u0000\u0000\u04af\u04b0\u0003\u00e2q\u0000\u04b0"+
		"\u04b2\u0001\u0000\u0000\u0000\u04b1\u04ac\u0001\u0000\u0000\u0000\u04b1"+
		"\u04ad\u0001\u0000\u0000\u0000\u04b2\u00e3\u0001\u0000\u0000\u0000\u04b3"+
		"\u04b6\u0003\u00f4z\u0000\u04b4\u04b6\u0003\u00e6s\u0000\u04b5\u04b3\u0001"+
		"\u0000\u0000\u0000\u04b5\u04b4\u0001\u0000\u0000\u0000\u04b6\u00e5\u0001"+
		"\u0000\u0000\u0000\u04b7\u04b8\u0003t:\u0000\u04b8\u00e7\u0001\u0000\u0000"+
		"\u0000\u04b9\u04ba\u0005\u0013\u0000\u0000\u04ba\u04bb\u0003\u00f0x\u0000"+
		"\u04bb\u04bc\u0005\u0014\u0000\u0000\u04bc\u04c4\u0001\u0000\u0000\u0000"+
		"\u04bd\u04be\u0005\u0013\u0000\u0000\u04be\u04bf\u0003\u00f0x\u0000\u04bf"+
		"\u04c0\u0005\f\u0000\u0000\u04c0\u04c1\u0003\u00eau\u0000\u04c1\u04c2"+
		"\u0005\u0015\u0000\u0000\u04c2\u04c4\u0001\u0000\u0000\u0000\u04c3\u04b9"+
		"\u0001\u0000\u0000\u0000\u04c3\u04bd\u0001\u0000\u0000\u0000\u04c4\u00e9"+
		"\u0001\u0000\u0000\u0000\u04c5\u04cb\u0003\u00ecv\u0000\u04c6\u04c7\u0003"+
		"\u00ecv\u0000\u04c7\u04c8\u0005\u0002\u0000\u0000\u04c8\u04c9\u0003\u00ea"+
		"u\u0000\u04c9\u04cb\u0001\u0000\u0000\u0000\u04ca\u04c5\u0001\u0000\u0000"+
		"\u0000\u04ca\u04c6\u0001\u0000\u0000\u0000\u04cb\u00eb\u0001\u0000\u0000"+
		"\u0000\u04cc\u04cf\u0003\u00f4z\u0000\u04cd\u04cf\u0003\u00eew\u0000\u04ce"+
		"\u04cc\u0001\u0000\u0000\u0000\u04ce\u04cd\u0001\u0000\u0000\u0000\u04cf"+
		"\u00ed\u0001\u0000\u0000\u0000\u04d0\u04d1\u0003\u00dcn\u0000\u04d1\u00ef"+
		"\u0001\u0000\u0000\u0000\u04d2\u04d5\u0003\u00f2y\u0000\u04d3\u04d5\u0003"+
		"\u01c2\u00e1\u0000\u04d4\u04d2\u0001\u0000\u0000\u0000\u04d4\u04d3\u0001"+
		"\u0000\u0000\u0000\u04d5\u00f1\u0001\u0000\u0000\u0000\u04d6\u04d7\u0003"+
		"\u01c0\u00e0\u0000\u04d7\u00f3\u0001\u0000\u0000\u0000\u04d8\u04d9\u0005"+
		"[\u0000\u0000\u04d9\u04da\u0003\u00ba]\u0000\u04da\u00f5\u0001\u0000\u0000"+
		"\u0000\u04db\u04e2\u0005\u0016\u0000\u0000\u04dc\u04dd\u0005Z\u0000\u0000"+
		"\u04dd\u04de\u0005\u0017\u0000\u0000\u04de\u04e2\u0005Y\u0000\u0000\u04df"+
		"\u04e2\u0005\u0018\u0000\u0000\u04e0\u04e2\u0005\u0019\u0000\u0000\u04e1"+
		"\u04db\u0001\u0000\u0000\u0000\u04e1\u04dc\u0001\u0000\u0000\u0000\u04e1"+
		"\u04df\u0001\u0000\u0000\u0000\u04e1\u04e0\u0001\u0000\u0000\u0000\u04e2"+
		"\u00f7\u0001\u0000\u0000\u0000\u04e3\u04e6\u0003\u00fa}\u0000\u04e4\u04e6"+
		"\u0003\u00c2a\u0000\u04e5\u04e3\u0001\u0000\u0000\u0000\u04e5\u04e4\u0001"+
		"\u0000\u0000\u0000\u04e6\u00f9\u0001\u0000\u0000\u0000\u04e7\u04ea\u0003"+
		"\u00fc~\u0000\u04e8\u04ea\u0003\u013c\u009e\u0000\u04e9\u04e7\u0001\u0000"+
		"\u0000\u0000\u04e9\u04e8\u0001\u0000\u0000\u0000\u04ea\u00fb\u0001\u0000"+
		"\u0000\u0000\u04eb\u04ec\u0005\u001a\u0000\u0000\u04ec\u04ed\u0005\u000e"+
		"\u0000\u0000\u04ed\u04ee\u0003\u0090H\u0000\u04ee\u04ef\u0005\u000f\u0000"+
		"\u0000\u04ef\u04f0\u0005\u0010\u0000\u0000\u04f0\u04f1\u0003\u00fa}\u0000"+
		"\u04f1\u00fd\u0001\u0000\u0000\u0000\u04f2\u04f5\u0003\u0100\u0080\u0000"+
		"\u04f3\u04f5\u0003\u0134\u009a\u0000\u04f4\u04f2\u0001\u0000\u0000\u0000"+
		"\u04f4\u04f3\u0001\u0000\u0000\u0000\u04f5\u00ff\u0001\u0000\u0000\u0000"+
		"\u04f6\u04fa\u0003\u0102\u0081\u0000\u04f7\u04fa\u0003\u010c\u0086\u0000"+
		"\u04f8\u04fa\u0003\u0112\u0089\u0000\u04f9\u04f6\u0001\u0000\u0000\u0000"+
		"\u04f9\u04f7\u0001\u0000\u0000\u0000\u04f9\u04f8\u0001\u0000\u0000\u0000"+
		"\u04fa\u0101\u0001\u0000\u0000\u0000\u04fb\u04fe\u0003\u0104\u0082\u0000"+
		"\u04fc\u04fe\u0003\u0106\u0083\u0000\u04fd\u04fb\u0001\u0000\u0000\u0000"+
		"\u04fd\u04fc\u0001\u0000\u0000\u0000\u04fe\u0103\u0001\u0000\u0000\u0000"+
		"\u04ff\u0500\u0003\u0110\u0088\u0000\u0500\u0501\u0003\u0152\u00a9\u0000"+
		"\u0501\u0502\u0003\u0110\u0088\u0000\u0502\u0105\u0001\u0000\u0000\u0000"+
		"\u0503\u0506\u0003\u0108\u0084\u0000\u0504\u0506\u0003\u010a\u0085\u0000"+
		"\u0505\u0503\u0001\u0000\u0000\u0000\u0505\u0504\u0001\u0000\u0000\u0000"+
		"\u0506\u0107\u0001\u0000\u0000\u0000\u0507\u0508\u0006\u0084\uffff\uffff"+
		"\u0000\u0508\u0509\u0003\u0110\u0088\u0000\u0509\u050a\u0005V\u0000\u0000"+
		"\u050a\u050b\u0003\u0110\u0088\u0000\u050b\u0511\u0001\u0000\u0000\u0000"+
		"\u050c\u050d\n\u0001\u0000\u0000\u050d\u050e\u0005V\u0000\u0000\u050e"+
		"\u0510\u0003\u0110\u0088\u0000\u050f\u050c\u0001\u0000\u0000\u0000\u0510"+
		"\u0513\u0001\u0000\u0000\u0000\u0511\u050f\u0001\u0000\u0000\u0000\u0511"+
		"\u0512\u0001\u0000\u0000\u0000\u0512\u0109\u0001\u0000\u0000\u0000\u0513"+
		"\u0511\u0001\u0000\u0000\u0000\u0514\u0515\u0006\u0085\uffff\uffff\u0000"+
		"\u0515\u0516\u0003\u0110\u0088\u0000\u0516\u0517\u0005\n\u0000\u0000\u0517"+
		"\u0518\u0003\u0110\u0088\u0000\u0518\u051e\u0001\u0000\u0000\u0000\u0519"+
		"\u051a\n\u0001\u0000\u0000\u051a\u051b\u0005\n\u0000\u0000\u051b\u051d"+
		"\u0003\u0110\u0088\u0000\u051c\u0519\u0001\u0000\u0000\u0000\u051d\u0520"+
		"\u0001\u0000\u0000\u0000\u051e\u051c\u0001\u0000\u0000\u0000\u051e\u051f"+
		"\u0001\u0000\u0000\u0000\u051f\u010b\u0001\u0000\u0000\u0000\u0520\u051e"+
		"\u0001\u0000\u0000\u0000\u0521\u0522\u0003\u0156\u00ab\u0000\u0522\u0523"+
		"\u0003\u0110\u0088\u0000\u0523\u0526\u0001\u0000\u0000\u0000\u0524\u0526"+
		"\u0003\u010e\u0087\u0000\u0525\u0521\u0001\u0000\u0000\u0000\u0525\u0524"+
		"\u0001\u0000\u0000\u0000\u0526\u010d\u0001\u0000\u0000\u0000\u0527\u0528"+
		"\u0003\u0130\u0098\u0000\u0528\u0529\u0003\u016e\u00b7\u0000\u0529\u052a"+
		"\u0003\u0130\u0098\u0000\u052a\u010f\u0001\u0000\u0000\u0000\u052b\u052e"+
		"\u0003\u0112\u0089\u0000\u052c\u052e\u0003\u010c\u0086\u0000\u052d\u052b"+
		"\u0001\u0000\u0000\u0000\u052d\u052c\u0001\u0000\u0000\u0000\u052e\u0111"+
		"\u0001\u0000\u0000\u0000\u052f\u0536\u0003\u0114\u008a\u0000\u0530\u0536"+
		"\u0003\u0118\u008c\u0000\u0531\u0532\u0005\f\u0000\u0000\u0532\u0533\u0003"+
		"\u0100\u0080\u0000\u0533\u0534\u0005\r\u0000\u0000\u0534\u0536\u0001\u0000"+
		"\u0000\u0000\u0535\u052f\u0001\u0000\u0000\u0000\u0535\u0530\u0001\u0000"+
		"\u0000\u0000\u0535\u0531\u0001\u0000\u0000\u0000\u0536\u0113\u0001\u0000"+
		"\u0000\u0000\u0537\u0538\u0003\u0150\u00a8\u0000\u0538\u0539\u0005\u000e"+
		"\u0000\u0000\u0539\u053a\u0003\u0116\u008b\u0000\u053a\u053b\u0005\u000f"+
		"\u0000\u0000\u053b\u053c\u0005\u0010\u0000\u0000\u053c\u053d\u0003\u0110"+
		"\u0088\u0000\u053d\u0115\u0001\u0000\u0000\u0000\u053e\u0544\u0003\u0180"+
		"\u00c0\u0000\u053f\u0540\u0003\u0180\u00c0\u0000\u0540\u0541\u0005\u0002"+
		"\u0000\u0000\u0541\u0542\u0003\u0116\u008b\u0000\u0542\u0544\u0001\u0000"+
		"\u0000\u0000\u0543\u053e\u0001\u0000\u0000\u0000\u0543\u053f\u0001\u0000"+
		"\u0000\u0000\u0544\u0117\u0001\u0000\u0000\u0000\u0545\u0549\u0003\u011a"+
		"\u008d\u0000\u0546\u0549\u0003\u011c\u008e\u0000\u0547\u0549\u0003\u0122"+
		"\u0091\u0000\u0548\u0545\u0001\u0000\u0000\u0000\u0548\u0546\u0001\u0000"+
		"\u0000\u0000\u0548\u0547\u0001\u0000\u0000\u0000\u0549\u0119\u0001\u0000"+
		"\u0000\u0000\u054a\u054b\u0003\u0124\u0092\u0000\u054b\u011b\u0001\u0000"+
		"\u0000\u0000\u054c\u054f\u0003\u011e\u008f\u0000\u054d\u054f\u0003\u0120"+
		"\u0090\u0000\u054e\u054c\u0001\u0000\u0000\u0000\u054e\u054d\u0001\u0000"+
		"\u0000\u0000\u054f\u011d\u0001\u0000\u0000\u0000\u0550\u0551\u0003\u012a"+
		"\u0095\u0000\u0551\u011f\u0001\u0000\u0000\u0000\u0552\u0553\u0003\u0130"+
		"\u0098\u0000\u0553\u0554\u0003\u016a\u00b5\u0000\u0554\u0555\u0003\u0130"+
		"\u0098\u0000\u0555\u0121\u0001\u0000\u0000\u0000\u0556\u0557\u0003\u012c"+
		"\u0096\u0000\u0557\u0123\u0001\u0000\u0000\u0000\u0558\u055f\u0003\u0170"+
		"\u00b8\u0000\u0559\u055a\u0003\u0172\u00b9\u0000\u055a\u055b\u0005\f\u0000"+
		"\u0000\u055b\u055c\u0003\u012e\u0097\u0000\u055c\u055d\u0005\r\u0000\u0000"+
		"\u055d\u055f\u0001\u0000\u0000\u0000\u055e\u0558\u0001\u0000\u0000\u0000"+
		"\u055e\u0559\u0001\u0000\u0000\u0000\u055f\u0125\u0001\u0000\u0000\u0000"+
		"\u0560\u0563\u0003\u017e\u00bf\u0000\u0561\u0563\u0003\u0128\u0094\u0000"+
		"\u0562\u0560\u0001\u0000\u0000\u0000\u0562\u0561\u0001\u0000\u0000\u0000"+
		"\u0563\u0127\u0001\u0000\u0000\u0000\u0564\u0565\u0003\u012a\u0095\u0000"+
		"\u0565\u0129\u0001\u0000\u0000\u0000\u0566\u056d\u0003\u0174\u00ba\u0000"+
		"\u0567\u0568\u0003\u0176\u00bb\u0000\u0568\u0569\u0005\f\u0000\u0000\u0569"+
		"\u056a\u0003\u012e\u0097\u0000\u056a\u056b\u0005\r\u0000\u0000\u056b\u056d"+
		"\u0001\u0000\u0000\u0000\u056c\u0566\u0001\u0000\u0000\u0000\u056c\u0567"+
		"\u0001\u0000\u0000\u0000\u056d\u012b\u0001\u0000\u0000\u0000\u056e\u0575"+
		"\u0003\u0178\u00bc\u0000\u056f\u0570\u0003\u017a\u00bd\u0000\u0570\u0571"+
		"\u0005\f\u0000\u0000\u0571\u0572\u0003\u012e\u0097\u0000\u0572\u0573\u0005"+
		"\r\u0000\u0000\u0573\u0575\u0001\u0000\u0000\u0000\u0574\u056e\u0001\u0000"+
		"\u0000\u0000\u0574\u056f\u0001\u0000\u0000\u0000\u0575\u012d\u0001\u0000"+
		"\u0000\u0000\u0576\u057c\u0003\u0130\u0098\u0000\u0577\u0578\u0003\u0130"+
		"\u0098\u0000\u0578\u0579\u0005\u0002\u0000\u0000\u0579\u057a\u0003\u012e"+
		"\u0097\u0000\u057a\u057c\u0001\u0000\u0000\u0000\u057b\u0576\u0001\u0000"+
		"\u0000\u0000\u057b\u0577\u0001\u0000\u0000\u0000\u057c\u012f\u0001\u0000"+
		"\u0000\u0000\u057d\u0580\u0003\u0132\u0099\u0000\u057e\u0580\u0003\u0180"+
		"\u00c0\u0000\u057f\u057d\u0001\u0000\u0000\u0000\u057f\u057e\u0001\u0000"+
		"\u0000\u0000\u0580\u0131\u0001\u0000\u0000\u0000\u0581\u0585\u0003\u0124"+
		"\u0092\u0000\u0582\u0585\u0003\u0126\u0093\u0000\u0583\u0585\u0003\u012c"+
		"\u0096\u0000\u0584\u0581\u0001\u0000\u0000\u0000\u0584\u0582\u0001\u0000"+
		"\u0000\u0000\u0584\u0583\u0001\u0000\u0000\u0000\u0585\u0133\u0001\u0000"+
		"\u0000\u0000\u0586\u0587\u0003\u0136\u009b\u0000\u0587\u0588\u0003\u0158"+
		"\u00ac\u0000\u0588\u0589\u0003\u0136\u009b\u0000\u0589\u058f\u0001\u0000"+
		"\u0000\u0000\u058a\u058b\u0005\f\u0000\u0000\u058b\u058c\u0003\u0134\u009a"+
		"\u0000\u058c\u058d\u0005\r\u0000\u0000\u058d\u058f\u0001\u0000\u0000\u0000"+
		"\u058e\u0586\u0001\u0000\u0000\u0000\u058e\u058a\u0001\u0000\u0000\u0000"+
		"\u058f\u0135\u0001\u0000\u0000\u0000\u0590\u0596\u0005\u0012\u0000\u0000"+
		"\u0591\u0592\u0005\u000e\u0000\u0000\u0592\u0593\u0003\u0138\u009c\u0000"+
		"\u0593\u0594\u0005\u000f\u0000\u0000\u0594\u0596\u0001\u0000\u0000\u0000"+
		"\u0595\u0590\u0001\u0000\u0000\u0000\u0595\u0591\u0001\u0000\u0000\u0000"+
		"\u0596\u0137\u0001\u0000\u0000\u0000\u0597\u059b\u0003\u0100\u0080\u0000"+
		"\u0598\u059a\u0003\u013a\u009d\u0000\u0599\u0598\u0001\u0000\u0000\u0000"+
		"\u059a\u059d\u0001\u0000\u0000\u0000\u059b\u0599\u0001\u0000\u0000\u0000"+
		"\u059b\u059c\u0001\u0000\u0000\u0000\u059c\u0139\u0001\u0000\u0000\u0000"+
		"\u059d\u059b\u0001\u0000\u0000\u0000\u059e\u059f\u0005\u0002\u0000\u0000"+
		"\u059f\u05a0\u0003\u0100\u0080\u0000\u05a0\u013b\u0001\u0000\u0000\u0000"+
		"\u05a1\u05a7\u0003\u013e\u009f\u0000\u05a2\u05a3\u0005\f\u0000\u0000\u05a3"+
		"\u05a4\u0003\u013c\u009e\u0000\u05a4\u05a5\u0005\r\u0000\u0000\u05a5\u05a7"+
		"\u0001\u0000\u0000\u0000\u05a6\u05a1\u0001\u0000\u0000\u0000\u05a6\u05a2"+
		"\u0001\u0000\u0000\u0000\u05a7\u013d\u0001\u0000\u0000\u0000\u05a8\u05a9"+
		"\u0006\u009f\uffff\uffff\u0000\u05a9\u05aa\u0003\u0140\u00a0\u0000\u05aa"+
		"\u05b0\u0001\u0000\u0000\u0000\u05ab\u05ac\n\u0001\u0000\u0000\u05ac\u05ad"+
		"\u0005V\u0000\u0000\u05ad\u05af\u0003\u0140\u00a0\u0000\u05ae\u05ab\u0001"+
		"\u0000\u0000\u0000\u05af\u05b2\u0001\u0000\u0000\u0000\u05b0\u05ae\u0001"+
		"\u0000\u0000\u0000\u05b0\u05b1\u0001\u0000\u0000\u0000\u05b1\u013f\u0001"+
		"\u0000\u0000\u0000\u05b2\u05b0\u0001\u0000\u0000\u0000\u05b3\u05bd\u0003"+
		"\u0118\u008c\u0000\u05b4\u05b5\u0005\u001b\u0000\u0000\u05b5\u05bd\u0003"+
		"\u0118\u008c\u0000\u05b6\u05b7\u0005\u001b\u0000\u0000\u05b7\u05b8\u0005"+
		"\f\u0000\u0000\u05b8\u05b9\u0003\u0118\u008c\u0000\u05b9\u05ba\u0005\r"+
		"\u0000\u0000\u05ba\u05bd\u0001\u0000\u0000\u0000\u05bb\u05bd\u0003\u010e"+
		"\u0087\u0000\u05bc\u05b3\u0001\u0000\u0000\u0000\u05bc\u05b4\u0001\u0000"+
		"\u0000\u0000\u05bc\u05b6\u0001\u0000\u0000\u0000\u05bc\u05bb\u0001\u0000"+
		"\u0000\u0000\u05bd\u0141\u0001\u0000\u0000\u0000\u05be\u05c2\u0003\u014e"+
		"\u00a7\u0000\u05bf\u05c2\u0003\u0146\u00a3\u0000\u05c0\u05c2\u0003\u0148"+
		"\u00a4\u0000\u05c1\u05be\u0001\u0000\u0000\u0000\u05c1\u05bf\u0001\u0000"+
		"\u0000\u0000\u05c1\u05c0\u0001\u0000\u0000\u0000\u05c2\u0143\u0001\u0000"+
		"\u0000\u0000\u05c3\u05c6\u0003\u0156\u00ab\u0000\u05c4\u05c6\u0003\u00f6"+
		"{\u0000\u05c5\u05c3\u0001\u0000\u0000\u0000\u05c5\u05c4\u0001\u0000\u0000"+
		"\u0000\u05c6\u0145\u0001\u0000\u0000\u0000\u05c7\u05c8\u0007\u0000\u0000"+
		"\u0000\u05c8\u0147\u0001\u0000\u0000\u0000\u05c9\u05d1\u0005\u001f\u0000"+
		"\u0000\u05ca\u05cc\u0005 \u0000\u0000\u05cb\u05ca\u0001\u0000\u0000\u0000"+
		"\u05cc\u05cf\u0001\u0000\u0000\u0000\u05cd\u05cb\u0001\u0000\u0000\u0000"+
		"\u05cd\u05ce\u0001\u0000\u0000\u0000\u05ce\u05d1\u0001\u0000\u0000\u0000"+
		"\u05cf\u05cd\u0001\u0000\u0000\u0000\u05d0\u05c9\u0001\u0000\u0000\u0000"+
		"\u05d0\u05cd\u0001\u0000\u0000\u0000\u05d1\u0149\u0001\u0000\u0000\u0000"+
		"\u05d2\u05d3\u0005!\u0000\u0000\u05d3\u014b\u0001\u0000\u0000\u0000\u05d4"+
		"\u05d7\u0003\u0156\u00ab\u0000\u05d5\u05d7\u0003\u00f6{\u0000\u05d6\u05d4"+
		"\u0001\u0000\u0000\u0000\u05d6\u05d5\u0001\u0000\u0000\u0000\u05d7\u014d"+
		"\u0001\u0000\u0000\u0000\u05d8\u05db\u0003\u0150\u00a8\u0000\u05d9\u05db"+
		"\u0005[\u0000\u0000\u05da\u05d8\u0001\u0000\u0000\u0000\u05da\u05d9\u0001"+
		"\u0000\u0000\u0000\u05db\u014f\u0001\u0000\u0000\u0000\u05dc\u05dd\u0007"+
		"\u0001\u0000\u0000\u05dd\u0151\u0001\u0000\u0000\u0000\u05de\u05e6\u0005"+
		"\"\u0000\u0000\u05df\u05e6\u0005#\u0000\u0000\u05e0\u05e6\u0005$\u0000"+
		"\u0000\u05e1\u05e6\u0005%\u0000\u0000\u05e2\u05e3\u0005\u001b\u0000\u0000"+
		"\u05e3\u05e6\u0005V\u0000\u0000\u05e4\u05e6\u0005&\u0000\u0000\u05e5\u05de"+
		"\u0001\u0000\u0000\u0000\u05e5\u05df\u0001\u0000\u0000\u0000\u05e5\u05e0"+
		"\u0001\u0000\u0000\u0000\u05e5\u05e1\u0001\u0000\u0000\u0000\u05e5\u05e2"+
		"\u0001\u0000\u0000\u0000\u05e5\u05e4\u0001\u0000\u0000\u0000\u05e6\u0153"+
		"\u0001\u0000\u0000\u0000\u05e7\u05e8\u0007\u0002\u0000\u0000\u05e8\u0155"+
		"\u0001\u0000\u0000\u0000\u05e9\u05ea\u0005\u001b\u0000\u0000\u05ea\u0157"+
		"\u0001\u0000\u0000\u0000\u05eb\u05ec\u0005\'\u0000\u0000\u05ec\u0159\u0001"+
		"\u0000\u0000\u0000\u05ed\u05ee\u0005(\u0000\u0000\u05ee\u015b\u0001\u0000"+
		"\u0000\u0000\u05ef\u05f0\u0005)\u0000\u0000\u05f0\u015d\u0001\u0000\u0000"+
		"\u0000\u05f1\u05f4\u0003\u0170\u00b8\u0000\u05f2\u05f4\u0005@\u0000\u0000"+
		"\u05f3\u05f1\u0001\u0000\u0000\u0000\u05f3\u05f2\u0001\u0000\u0000\u0000"+
		"\u05f4\u015f\u0001\u0000\u0000\u0000\u05f5\u05f9\u0003\u015e\u00af\u0000"+
		"\u05f6\u05f9\u0003\u0174\u00ba\u0000\u05f7\u05f9\u0003\u0168\u00b4\u0000"+
		"\u05f8\u05f5\u0001\u0000\u0000\u0000\u05f8\u05f6\u0001\u0000\u0000\u0000"+
		"\u05f8\u05f7\u0001\u0000\u0000\u0000\u05f9\u0161\u0001\u0000\u0000\u0000"+
		"\u05fa\u05fb\u0003\u0164\u00b2\u0000\u05fb\u0163\u0001\u0000\u0000\u0000"+
		"\u05fc\u05fd\u0003\u01be\u00df\u0000\u05fd\u0165\u0001\u0000\u0000\u0000"+
		"\u05fe\u05ff\u0003\u01c0\u00e0\u0000\u05ff\u0167\u0001\u0000\u0000\u0000"+
		"\u0600\u0601\u0003\u01c2\u00e1\u0000\u0601\u0169\u0001\u0000\u0000\u0000"+
		"\u0602\u0603\u0003\u016c\u00b6\u0000\u0603\u016b\u0001\u0000\u0000\u0000"+
		"\u0604\u0605\u0005*\u0000\u0000\u0605\u016d\u0001\u0000\u0000\u0000\u0606"+
		"\u0607\u0005+\u0000\u0000\u0607\u016f\u0001\u0000\u0000\u0000\u0608\u0609"+
		"\u0003\u0172\u00b9\u0000\u0609\u0171\u0001\u0000\u0000\u0000\u060a\u060b"+
		"\u0003\u01be\u00df\u0000\u060b\u0173\u0001\u0000\u0000\u0000\u060c\u060d"+
		"\u0003\u0176\u00bb\u0000\u060d\u0175\u0001\u0000\u0000\u0000\u060e\u060f"+
		"\u0003\u01c0\u00e0\u0000\u060f\u0177\u0001\u0000\u0000\u0000\u0610\u0611"+
		"\u0003\u017a\u00bd\u0000\u0611\u0179\u0001\u0000\u0000\u0000\u0612\u0613"+
		"\u0003\u01c2\u00e1\u0000\u0613\u017b\u0001\u0000\u0000\u0000\u0614\u0615"+
		"\u0007\u0003\u0000\u0000\u0615\u017d\u0001\u0000\u0000\u0000\u0616\u0619"+
		"\u0003\u01c4\u00e2\u0000\u0617\u0619\u0005@\u0000\u0000\u0618\u0616\u0001"+
		"\u0000\u0000\u0000\u0618\u0617\u0001\u0000\u0000\u0000\u0619\u017f\u0001"+
		"\u0000\u0000\u0000\u061a\u061b\u0005C\u0000\u0000\u061b\u0181\u0001\u0000"+
		"\u0000\u0000\u061c\u0625\u0003\u0186\u00c3\u0000\u061d\u0625\u0003\u018c"+
		"\u00c6\u0000\u061e\u0625\u0003\u0190\u00c8\u0000\u061f\u0625\u00051\u0000"+
		"\u0000\u0620\u0621\u0005\u000e\u0000\u0000\u0621\u0622\u0003\u0184\u00c2"+
		"\u0000\u0622\u0623\u0005\u000f\u0000\u0000\u0623\u0625\u0001\u0000\u0000"+
		"\u0000\u0624\u061c\u0001\u0000\u0000\u0000\u0624\u061d\u0001\u0000\u0000"+
		"\u0000\u0624\u061e\u0001\u0000\u0000\u0000\u0624\u061f\u0001\u0000\u0000"+
		"\u0000\u0624\u0620\u0001\u0000\u0000\u0000\u0625\u0183\u0001\u0000\u0000"+
		"\u0000\u0626\u062c\u0003\u0182\u00c1\u0000\u0627\u0628\u0003\u0182\u00c1"+
		"\u0000\u0628\u0629\u0005\u0002\u0000\u0000\u0629\u062a\u0003\u0184\u00c2"+
		"\u0000\u062a\u062c\u0001\u0000\u0000\u0000\u062b\u0626\u0001\u0000\u0000"+
		"\u0000\u062b\u0627\u0001\u0000\u0000\u0000\u062c\u0185\u0001\u0000\u0000"+
		"\u0000\u062d\u0630\u0003\u01bc\u00de\u0000\u062e\u0630\u0003\u0188\u00c4"+
		"\u0000\u062f\u062d\u0001\u0000\u0000\u0000\u062f\u062e\u0001\u0000\u0000"+
		"\u0000\u0630\u0187\u0001\u0000\u0000\u0000\u0631\u0632\u00052\u0000\u0000"+
		"\u0632\u0633\u0003\u018a\u00c5\u0000\u0633\u0634\u0005\u0002\u0000\u0000"+
		"\u0634\u0635\u0003\u01a2\u00d1\u0000\u0635\u0636\u0005\u0002\u0000\u0000"+
		"\u0636\u0637\u0003\u0196\u00cb\u0000\u0637\u0638\u0005\r\u0000\u0000\u0638"+
		"\u0189\u0001\u0000\u0000\u0000\u0639\u063a\u0003\u01be\u00df\u0000\u063a"+
		"\u018b\u0001\u0000\u0000\u0000\u063b\u063c\u00053\u0000\u0000\u063c\u063d"+
		"\u0003\u018e\u00c7\u0000\u063d\u063e\u0005\u0002\u0000\u0000\u063e\u063f"+
		"\u0003\u01a2\u00d1\u0000\u063f\u0640\u0005\u0002\u0000\u0000\u0640\u0641"+
		"\u0003\u0196\u00cb\u0000\u0641\u0642\u0005\r\u0000\u0000\u0642\u018d\u0001"+
		"\u0000\u0000\u0000\u0643\u0644\u0003\u01be\u00df\u0000\u0644\u018f\u0001"+
		"\u0000\u0000\u0000\u0645\u0646\u0003\u0192\u00c9\u0000\u0646\u0191\u0001"+
		"\u0000\u0000\u0000\u0647\u0648\u00054\u0000\u0000\u0648\u0649\u0003\u01c6"+
		"\u00e3\u0000\u0649\u064a\u0003\u0194\u00ca\u0000\u064a\u064b\u0005\r\u0000"+
		"\u0000\u064b\u0193\u0001\u0000\u0000\u0000\u064c\u064d\u0005\u0002\u0000"+
		"\u0000\u064d\u0650\u0003\u01bc\u00de\u0000\u064e\u0650\u0003\u01c8\u00e4"+
		"\u0000\u064f\u064c\u0001\u0000\u0000\u0000\u064f\u064e\u0001\u0000\u0000"+
		"\u0000\u0650\u0195\u0001\u0000\u0000\u0000\u0651\u0657\u0005\u0012\u0000"+
		"\u0000\u0652\u0653\u0005\u000e\u0000\u0000\u0653\u0654\u0003\u0198\u00cc"+
		"\u0000\u0654\u0655\u0005\u000f\u0000\u0000\u0655\u0657\u0001\u0000\u0000"+
		"\u0000\u0656\u0651\u0001\u0000\u0000\u0000\u0656\u0652\u0001\u0000\u0000"+
		"\u0000\u0657\u0197\u0001\u0000\u0000\u0000\u0658\u065c\u0003\u019c\u00ce"+
		"\u0000\u0659\u065b\u0003\u019a\u00cd\u0000\u065a\u0659\u0001\u0000\u0000"+
		"\u0000\u065b\u065e\u0001\u0000\u0000\u0000\u065c\u065a\u0001\u0000\u0000"+
		"\u0000\u065c\u065d\u0001\u0000\u0000\u0000\u065d\u0199\u0001\u0000\u0000"+
		"\u0000\u065e\u065c\u0001\u0000\u0000\u0000\u065f\u0660\u0005\u0002\u0000"+
		"\u0000\u0660\u0661\u0003\u019c\u00ce\u0000\u0661\u019b\u0001\u0000\u0000"+
		"\u0000\u0662\u0663\u0003\u0182\u00c1\u0000\u0663\u0664\u0003\u019e\u00cf"+
		"\u0000\u0664\u019d\u0001\u0000\u0000\u0000\u0665\u0666\u0005\u0010\u0000"+
		"\u0000\u0666\u0669\u0003\u01ae\u00d7\u0000\u0667\u0669\u0003\u01c8\u00e4"+
		"\u0000\u0668\u0665\u0001\u0000\u0000\u0000\u0668\u0667\u0001\u0000\u0000"+
		"\u0000\u0669\u019f\u0001\u0000\u0000\u0000\u066a\u066b\u0005\u0002\u0000"+
		"\u0000\u066b\u066e\u0003\u01a2\u00d1\u0000\u066c\u066e\u0003\u01c8\u00e4"+
		"\u0000\u066d\u066a\u0001\u0000\u0000\u0000\u066d\u066c\u0001\u0000\u0000"+
		"\u0000\u066e\u01a1\u0001\u0000\u0000\u0000\u066f\u0670\u0003\u01b6\u00db"+
		"\u0000\u0670\u01a3\u0001\u0000\u0000\u0000\u0671\u0672\u00055\u0000\u0000"+
		"\u0672\u0673\u0003\u01c6\u00e3\u0000\u0673\u0674\u0003\u01a6\u00d3\u0000"+
		"\u0674\u0675\u0005\u0003\u0000\u0000\u0675\u01a5\u0001\u0000\u0000\u0000"+
		"\u0676\u067f\u0003\u01c8\u00e4\u0000\u0677\u0678\u0005\u0002\u0000\u0000"+
		"\u0678\u067f\u0003\u01a8\u00d4\u0000\u0679\u067a\u0005\u0002\u0000\u0000"+
		"\u067a\u067b\u0003\u01a8\u00d4\u0000\u067b\u067c\u0005\u0002\u0000\u0000"+
		"\u067c\u067d\u0003\u01ac\u00d6\u0000\u067d\u067f\u0001\u0000\u0000\u0000"+
		"\u067e\u0676\u0001\u0000\u0000\u0000\u067e\u0677\u0001\u0000\u0000\u0000"+
		"\u067e\u0679\u0001\u0000\u0000\u0000\u067f\u01a7\u0001\u0000\u0000\u0000"+
		"\u0680\u0681\u0005\u000e\u0000\u0000\u0681\u0682\u0003\u01aa\u00d5\u0000"+
		"\u0682\u0683\u0005\u000f\u0000\u0000\u0683\u0686\u0001\u0000\u0000\u0000"+
		"\u0684\u0686\u0005W\u0000\u0000\u0685\u0680\u0001\u0000\u0000\u0000\u0685"+
		"\u0684\u0001\u0000\u0000\u0000\u0686\u01a9\u0001\u0000\u0000\u0000\u0687"+
		"\u068d\u0003\u01bc\u00de\u0000\u0688\u0689\u0003\u01bc\u00de\u0000\u0689"+
		"\u068a\u0005\u0002\u0000\u0000\u068a\u068b\u0003\u01aa\u00d5\u0000\u068b"+
		"\u068d\u0001\u0000\u0000\u0000\u068c\u0687\u0001\u0000\u0000\u0000\u068c"+
		"\u0688\u0001\u0000\u0000\u0000\u068d\u01ab\u0001\u0000\u0000\u0000\u068e"+
		"\u068f\u0003\u01bc\u00de\u0000\u068f\u01ad\u0001\u0000\u0000\u0000\u0690"+
		"\u0697\u0003\u01b0\u00d8\u0000\u0691\u0692\u0003\u01b0\u00d8\u0000\u0692"+
		"\u0693\u0005\u0010\u0000\u0000\u0693\u0694\u0003\u01ae\u00d7\u0000\u0694"+
		"\u0697\u0001\u0000\u0000\u0000\u0695\u0697\u0003\u01b6\u00db\u0000\u0696"+
		"\u0690\u0001\u0000\u0000\u0000\u0696\u0691\u0001\u0000\u0000\u0000\u0696"+
		"\u0695\u0001\u0000\u0000\u0000\u0697\u01af\u0001\u0000\u0000\u0000\u0698"+
		"\u069f\u0003\u01be\u00df\u0000\u0699\u069f\u0003\u01b2\u00d9\u0000\u069a"+
		"\u069f\u0003\u0180\u00c0\u0000\u069b\u069f\u0003\u01c4\u00e2\u0000\u069c"+
		"\u069f\u0005@\u0000\u0000\u069d\u069f\u0003\u01b4\u00da\u0000\u069e\u0698"+
		"\u0001\u0000\u0000\u0000\u069e\u0699\u0001\u0000\u0000\u0000\u069e\u069a"+
		"\u0001\u0000\u0000\u0000\u069e\u069b\u0001\u0000\u0000\u0000\u069e\u069c"+
		"\u0001\u0000\u0000\u0000\u069e\u069d\u0001\u0000\u0000\u0000\u069f\u01b1"+
		"\u0001\u0000\u0000\u0000\u06a0\u06a1\u0003\u01be\u00df\u0000\u06a1\u06a2"+
		"\u0005\f\u0000\u0000\u06a2\u06a3\u0003\u01b8\u00dc\u0000\u06a3\u06a4\u0005"+
		"\r\u0000\u0000\u06a4\u01b3\u0001\u0000\u0000\u0000\u06a5\u06a6\u00056"+
		"\u0000\u0000\u06a6\u06a7\u0003\u0018\f\u0000\u06a7\u06a8\u0005\r\u0000"+
		"\u0000\u06a8\u06ba\u0001\u0000\u0000\u0000\u06a9\u06aa\u00057\u0000\u0000"+
		"\u06aa\u06ab\u0003x<\u0000\u06ab\u06ac\u0005\r\u0000\u0000\u06ac\u06ba"+
		"\u0001\u0000\u0000\u0000\u06ad\u06ae\u00058\u0000\u0000\u06ae\u06af\u0003"+
		"\u00fe\u007f\u0000\u06af\u06b0\u0005\r\u0000\u0000\u06b0\u06ba\u0001\u0000"+
		"\u0000\u0000\u06b1\u06b2\u00059\u0000\u0000\u06b2\u06b3\u0003\u013c\u009e"+
		"\u0000\u06b3\u06b4\u0005\r\u0000\u0000\u06b4\u06ba\u0001\u0000\u0000\u0000"+
		"\u06b5\u06b6\u0005:\u0000\u0000\u06b6\u06b7\u0003\u0130\u0098\u0000\u06b7"+
		"\u06b8\u0005\r\u0000\u0000\u06b8\u06ba\u0001\u0000\u0000\u0000\u06b9\u06a5"+
		"\u0001\u0000\u0000\u0000\u06b9\u06a9\u0001\u0000\u0000\u0000\u06b9\u06ad"+
		"\u0001\u0000\u0000\u0000\u06b9\u06b1\u0001\u0000\u0000\u0000\u06b9\u06b5"+
		"\u0001\u0000\u0000\u0000\u06ba\u01b5\u0001\u0000\u0000\u0000\u06bb\u06c1"+
		"\u0005\u0012\u0000\u0000\u06bc\u06bd\u0005\u000e\u0000\u0000\u06bd\u06be"+
		"\u0003\u01b8\u00dc\u0000\u06be\u06bf\u0005\u000f\u0000\u0000\u06bf\u06c1"+
		"\u0001\u0000\u0000\u0000\u06c0\u06bb\u0001\u0000\u0000\u0000\u06c0\u06bc"+
		"\u0001\u0000\u0000\u0000\u06c1\u01b7\u0001\u0000\u0000\u0000\u06c2\u06c6"+
		"\u0003\u01ae\u00d7\u0000\u06c3\u06c5\u0003\u01ba\u00dd\u0000\u06c4\u06c3"+
		"\u0001\u0000\u0000\u0000\u06c5\u06c8\u0001\u0000\u0000\u0000\u06c6\u06c4"+
		"\u0001\u0000\u0000\u0000\u06c6\u06c7\u0001\u0000\u0000\u0000\u06c7\u01b9"+
		"\u0001\u0000\u0000\u0000\u06c8\u06c6\u0001\u0000\u0000\u0000\u06c9\u06ca"+
		"\u0005\u0002\u0000\u0000\u06ca\u06cb\u0003\u01ae\u00d7\u0000\u06cb\u01bb"+
		"\u0001\u0000\u0000\u0000\u06cc\u06cf\u0003\u01be\u00df\u0000\u06cd\u06cf"+
		"\u0005O\u0000\u0000\u06ce\u06cc\u0001\u0000\u0000\u0000\u06ce\u06cd\u0001"+
		"\u0000\u0000\u0000\u06cf\u01bd\u0001\u0000\u0000\u0000\u06d0\u06d1\u0007"+
		"\u0004\u0000\u0000\u06d1\u01bf\u0001\u0000\u0000\u0000\u06d2\u06d3\u0005"+
		"A\u0000\u0000\u06d3\u01c1\u0001\u0000\u0000\u0000\u06d4\u06d5\u0005B\u0000"+
		"\u0000\u06d5\u01c3\u0001\u0000\u0000\u0000\u06d6\u06d7\u0007\u0005\u0000"+
		"\u0000\u06d7\u01c5\u0001\u0000\u0000\u0000\u06d8\u06d9\u0003\u01be\u00df"+
		"\u0000\u06d9\u01c7\u0001\u0000\u0000\u0000\u06da\u06db\u0001\u0000\u0000"+
		"\u0000\u06db\u01c9\u0001\u0000\u0000\u0000\u0084\u01cd\u01d4\u01dc\u021b"+
		"\u0221\u0226\u022e\u0233\u023c\u0248\u0255\u0262\u0268\u026c\u0275\u0285"+
		"\u028d\u029a\u029e\u02a8\u02ac\u02c1\u02c8\u02cf\u02da\u02e2\u02e9\u02f0"+
		"\u0301\u0309\u0317\u031c\u0325\u032f\u033b\u0348\u035a\u0362\u0366\u036e"+
		"\u037a\u0387\u038d\u0391\u039a\u03aa\u03ae\u03b6\u03c2\u03ca\u03d6\u03e2"+
		"\u03f1\u03f8\u03ff\u0407\u040e\u0419\u0423\u042a\u0430\u043e\u0442\u044a"+
		"\u0459\u0460\u046f\u0476\u0486\u0492\u04aa\u04b1\u04b5\u04c3\u04ca\u04ce"+
		"\u04d4\u04e1\u04e5\u04e9\u04f4\u04f9\u04fd\u0505\u0511\u051e\u0525\u052d"+
		"\u0535\u0543\u0548\u054e\u055e\u0562\u056c\u0574\u057b\u057f\u0584\u058e"+
		"\u0595\u059b\u05a6\u05b0\u05bc\u05c1\u05c5\u05cd\u05d0\u05d6\u05da\u05e5"+
		"\u05f3\u05f8\u0618\u0624\u062b\u062f\u064f\u0656\u065c\u0668\u066d\u067e"+
		"\u0685\u068c\u0696\u069e\u06b9\u06c0\u06c6\u06ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}