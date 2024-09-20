// Generated from g4/TPTPv9.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TPTPv9Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, WS=68, Comment_block=69, Not_star_slash=70, Lower_word=71, Percentage_sign=72, 
		Double_quote=73, Sign=74, Dot=75, Exponent=76, Slash_char=77, Zero_numeric=78, 
		Non_zero_numeric=79, Numeric=80, Lower_alpha=81, Upper_alpha=82, Alpha_numeric=83, 
		Dollar=84, Printable_char=85;
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
		RULE_thf_arguments = 46, RULE_thf_formula_list = 47, RULE_thf_atom_typing = 48, 
		RULE_thf_top_level_type = 49, RULE_thf_unitary_type = 50, RULE_thf_apply_type = 51, 
		RULE_thf_binary_type = 52, RULE_thf_mapping_type = 53, RULE_thf_xprod_type = 54, 
		RULE_thf_union_type = 55, RULE_thf_subtype = 56, RULE_thf_definition = 57, 
		RULE_thf_sequent = 58, RULE_tff_formula = 59, RULE_tff_logic_formula = 60, 
		RULE_tff_binary_formula = 61, RULE_tff_binary_nonassoc = 62, RULE_tff_binary_assoc = 63, 
		RULE_tff_or_formula = 64, RULE_tff_and_formula = 65, RULE_tff_unit_formula = 66, 
		RULE_tff_preunit_formula = 67, RULE_tff_unitary_formula = 68, RULE_txf_unitary_formula = 69, 
		RULE_tff_quantified_formula = 70, RULE_tff_variable_list = 71, RULE_tff_variable = 72, 
		RULE_tff_typed_variable = 73, RULE_tff_unary_formula = 74, RULE_tff_prefix_unary = 75, 
		RULE_tff_infix_unary = 76, RULE_tff_atomic_formula = 77, RULE_tff_plain_atomic = 78, 
		RULE_tff_defined_atomic = 79, RULE_tff_defined_plain = 80, RULE_tff_defined_infix = 81, 
		RULE_tff_system_atomic = 82, RULE_txf_let = 83, RULE_txf_let_types = 84, 
		RULE_tff_atom_typing_list = 85, RULE_txf_let_defns = 86, RULE_txf_let_defn = 87, 
		RULE_txf_let_LHS = 88, RULE_txf_let_defn_list = 89, RULE_nxf_atom = 90, 
		RULE_tff_term = 91, RULE_tff_unitary_term = 92, RULE_txf_tuple = 93, RULE_tff_arguments = 94, 
		RULE_tff_atom_typing = 95, RULE_tff_top_level_type = 96, RULE_tff_non_atomic_type = 97, 
		RULE_tf1_quantified_type = 98, RULE_tff_monotype = 99, RULE_tff_unitary_type = 100, 
		RULE_tff_atomic_type = 101, RULE_tff_type_arguments = 102, RULE_tff_mapping_type = 103, 
		RULE_tff_xprod_type = 104, RULE_txf_tuple_type = 105, RULE_tff_type_list = 106, 
		RULE_tff_subtype = 107, RULE_txf_definition = 108, RULE_txf_sequent = 109, 
		RULE_nhf_long_connective = 110, RULE_nhf_parameter_list = 111, RULE_nhf_parameter = 112, 
		RULE_nhf_key_pair = 113, RULE_nxf_long_connective = 114, RULE_nxf_parameter_list = 115, 
		RULE_nxf_parameter = 116, RULE_nxf_key_pair = 117, RULE_ntf_connective_name = 118, 
		RULE_ntf_index = 119, RULE_ntf_short_connective = 120, RULE_tcf_formula = 121, 
		RULE_tcf_logic_formula = 122, RULE_tcf_quantified_formula = 123, RULE_fof_formula = 124, 
		RULE_fof_logic_formula = 125, RULE_fof_binary_formula = 126, RULE_fof_binary_nonassoc = 127, 
		RULE_fof_binary_assoc = 128, RULE_fof_or_formula = 129, RULE_fof_and_formula = 130, 
		RULE_fof_unary_formula = 131, RULE_fof_infix_unary = 132, RULE_fof_unit_formula = 133, 
		RULE_fof_unitary_formula = 134, RULE_fof_quantified_formula = 135, RULE_fof_variable_list = 136, 
		RULE_fof_atomic_formula = 137, RULE_fof_plain_atomic_formula = 138, RULE_fof_defined_atomic_formula = 139, 
		RULE_fof_defined_plain_formula = 140, RULE_fof_defined_infix_formula = 141, 
		RULE_fof_system_atomic_formula = 142, RULE_fof_plain_term = 143, RULE_fof_defined_term = 144, 
		RULE_fof_defined_atomic_term = 145, RULE_fof_defined_plain_term = 146, 
		RULE_fof_system_term = 147, RULE_fof_arguments = 148, RULE_fof_term = 149, 
		RULE_fof_function_term = 150, RULE_fof_sequent = 151, RULE_fof_formula_tuple = 152, 
		RULE_fof_formula_tuple_list = 153, RULE_cnf_formula = 154, RULE_cnf_disjunction = 155, 
		RULE_cnf_literal = 156, RULE_thf_quantifier = 157, RULE_thf_unary_connective = 158, 
		RULE_th1_quantifier = 159, RULE_th0_quantifier = 160, RULE_subtype_sign = 161, 
		RULE_tff_unary_connective = 162, RULE_tff_quantifier = 163, RULE_fof_quantifier = 164, 
		RULE_nonassoc_connective = 165, RULE_assoc_connective = 166, RULE_unary_connective = 167, 
		RULE_gentzen_arrow = 168, RULE_assignment = 169, RULE_identical = 170, 
		RULE_type_constant = 171, RULE_type_functor = 172, RULE_defined_type = 173, 
		RULE_atom = 174, RULE_untyped_atom = 175, RULE_defined_infix_pred = 176, 
		RULE_infix_equality = 177, RULE_infix_inequality = 178, RULE_constant = 179, 
		RULE_functor = 180, RULE_defined_constant = 181, RULE_defined_functor = 182, 
		RULE_system_constant = 183, RULE_system_functor = 184, RULE_def_or_sys_constant = 185, 
		RULE_th1_defined_term = 186, RULE_defined_term = 187, RULE_variable = 188, 
		RULE_source = 189, RULE_optional_info = 190, RULE_useful_info = 191, RULE_include = 192, 
		RULE_include_optionals = 193, RULE_formula_selection = 194, RULE_name_list = 195, 
		RULE_space_name = 196, RULE_general_term = 197, RULE_general_data = 198, 
		RULE_general_function = 199, RULE_formula_data = 200, RULE_general_list = 201, 
		RULE_general_terms = 202, RULE_name = 203, RULE_atomic_word = 204, RULE_atomic_defined_word = 205, 
		RULE_atomic_system_word = 206, RULE_number = 207, RULE_file_name = 208, 
		RULE_null = 209, RULE_comment = 210, RULE_comment_line = 211, RULE_single_quoted = 212, 
		RULE_distinct_object = 213, RULE_dollar_word = 214, RULE_dollar_dollar_word = 215, 
		RULE_upper_word = 216, RULE_vline = 217, RULE_star = 218, RULE_plus = 219, 
		RULE_arrow = 220, RULE_less_sign = 221, RULE_hash = 222, RULE_real = 223, 
		RULE_signed_real = 224, RULE_unsigned_real = 225, RULE_rational = 226, 
		RULE_signed_rational = 227, RULE_unsigned_rational = 228, RULE_integer = 229, 
		RULE_signed_integer = 230, RULE_unsigned_integer = 231, RULE_decimal = 232, 
		RULE_positive_decimal = 233, RULE_decimal_exponent = 234, RULE_decimal_fraction = 235, 
		RULE_dot_decimal = 236, RULE_exp_integer = 237, RULE_signed_exp_integer = 238, 
		RULE_unsigned_exp_integer = 239, RULE_slash = 240, RULE_slosh = 241, RULE_do_char = 242, 
		RULE_single_quote = 243, RULE_sq_char = 244, RULE_slosh_char = 245, RULE_viewable_char = 246;
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
			"thf_arguments", "thf_formula_list", "thf_atom_typing", "thf_top_level_type", 
			"thf_unitary_type", "thf_apply_type", "thf_binary_type", "thf_mapping_type", 
			"thf_xprod_type", "thf_union_type", "thf_subtype", "thf_definition", 
			"thf_sequent", "tff_formula", "tff_logic_formula", "tff_binary_formula", 
			"tff_binary_nonassoc", "tff_binary_assoc", "tff_or_formula", "tff_and_formula", 
			"tff_unit_formula", "tff_preunit_formula", "tff_unitary_formula", "txf_unitary_formula", 
			"tff_quantified_formula", "tff_variable_list", "tff_variable", "tff_typed_variable", 
			"tff_unary_formula", "tff_prefix_unary", "tff_infix_unary", "tff_atomic_formula", 
			"tff_plain_atomic", "tff_defined_atomic", "tff_defined_plain", "tff_defined_infix", 
			"tff_system_atomic", "txf_let", "txf_let_types", "tff_atom_typing_list", 
			"txf_let_defns", "txf_let_defn", "txf_let_LHS", "txf_let_defn_list", 
			"nxf_atom", "tff_term", "tff_unitary_term", "txf_tuple", "tff_arguments", 
			"tff_atom_typing", "tff_top_level_type", "tff_non_atomic_type", "tf1_quantified_type", 
			"tff_monotype", "tff_unitary_type", "tff_atomic_type", "tff_type_arguments", 
			"tff_mapping_type", "tff_xprod_type", "txf_tuple_type", "tff_type_list", 
			"tff_subtype", "txf_definition", "txf_sequent", "nhf_long_connective", 
			"nhf_parameter_list", "nhf_parameter", "nhf_key_pair", "nxf_long_connective", 
			"nxf_parameter_list", "nxf_parameter", "nxf_key_pair", "ntf_connective_name", 
			"ntf_index", "ntf_short_connective", "tcf_formula", "tcf_logic_formula", 
			"tcf_quantified_formula", "fof_formula", "fof_logic_formula", "fof_binary_formula", 
			"fof_binary_nonassoc", "fof_binary_assoc", "fof_or_formula", "fof_and_formula", 
			"fof_unary_formula", "fof_infix_unary", "fof_unit_formula", "fof_unitary_formula", 
			"fof_quantified_formula", "fof_variable_list", "fof_atomic_formula", 
			"fof_plain_atomic_formula", "fof_defined_atomic_formula", "fof_defined_plain_formula", 
			"fof_defined_infix_formula", "fof_system_atomic_formula", "fof_plain_term", 
			"fof_defined_term", "fof_defined_atomic_term", "fof_defined_plain_term", 
			"fof_system_term", "fof_arguments", "fof_term", "fof_function_term", 
			"fof_sequent", "fof_formula_tuple", "fof_formula_tuple_list", "cnf_formula", 
			"cnf_disjunction", "cnf_literal", "thf_quantifier", "thf_unary_connective", 
			"th1_quantifier", "th0_quantifier", "subtype_sign", "tff_unary_connective", 
			"tff_quantifier", "fof_quantifier", "nonassoc_connective", "assoc_connective", 
			"unary_connective", "gentzen_arrow", "assignment", "identical", "type_constant", 
			"type_functor", "defined_type", "atom", "untyped_atom", "defined_infix_pred", 
			"infix_equality", "infix_inequality", "constant", "functor", "defined_constant", 
			"defined_functor", "system_constant", "system_functor", "def_or_sys_constant", 
			"th1_defined_term", "defined_term", "variable", "source", "optional_info", 
			"useful_info", "include", "include_optionals", "formula_selection", "name_list", 
			"space_name", "general_term", "general_data", "general_function", "formula_data", 
			"general_list", "general_terms", "name", "atomic_word", "atomic_defined_word", 
			"atomic_system_word", "number", "file_name", "null", "comment", "comment_line", 
			"single_quoted", "distinct_object", "dollar_word", "dollar_dollar_word", 
			"upper_word", "vline", "star", "plus", "arrow", "less_sign", "hash", 
			"real", "signed_real", "unsigned_real", "rational", "signed_rational", 
			"unsigned_rational", "integer", "signed_integer", "unsigned_integer", 
			"decimal", "positive_decimal", "decimal_exponent", "decimal_fraction", 
			"dot_decimal", "exp_integer", "signed_exp_integer", "unsigned_exp_integer", 
			"slash", "slosh", "do_char", "single_quote", "sq_char", "slosh_char", 
			"viewable_char"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'tpi('", "','", "').'", "'thf('", "'tff('", "'tcf('", "'fof('", 
			"'cnf('", "'-'", "'&'", "'@'", "'('", "')'", "'['", "']'", "':'", "'$let('", 
			"'[]'", "'!>'", "'{'", "'}'", "')}'", "'[.]'", "'.'", "'{.}'", "'(.)'", 
			"'!'", "'~'", "'?*'", "'^'", "'@+'", "'@-'", "'<<'", "'?'", "'<=>'", 
			"'=>'", "'<='", "'<~>'", "'~&'", "'-->'", "':='", "'=='", "'='", "'!='", 
			"'!!'", "'??'", "'@@+'", "'@@-'", "'@='", "'include('", "'$thf('", "'$tff('", 
			"'$fof('", "'$cnf('", "'$fot('", "'%<Printable_char>*'", "'*'", "'|'", 
			"'+'", "'>'", "'<'", "'#'", "'\\'", "'\"'", "'''", "'\\\\'", "'.\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "Comment_block", 
			"Not_star_slash", "Lower_word", "Percentage_sign", "Double_quote", "Sign", 
			"Dot", "Exponent", "Slash_char", "Zero_numeric", "Non_zero_numeric", 
			"Numeric", "Lower_alpha", "Upper_alpha", "Alpha_numeric", "Dollar", "Printable_char"
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
	public String getGrammarFileName() { return "TPTPv9.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TPTPv9Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tptp_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TPTPv9Parser.EOF, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTptp_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTptp_file(this);
		}
	}

	public final Tptp_fileContext tptp_file() throws RecognitionException {
		Tptp_fileContext _localctx = new Tptp_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tptp_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125899906843122L) != 0)) {
				{
				{
				setState(494);
				tptp_input();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTptp_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTptp_input(this);
		}
	}

	public final Tptp_inputContext tptp_input() throws RecognitionException {
		Tptp_inputContext _localctx = new Tptp_inputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tptp_input);
		try {
			setState(504);
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
				setState(502);
				annotated_formula();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterAnnotated_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitAnnotated_formula(this);
		}
	}

	public final Annotated_formulaContext annotated_formula() throws RecognitionException {
		Annotated_formulaContext _localctx = new Annotated_formulaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_annotated_formula);
		try {
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				thf_annotated();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				tff_annotated();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				tcf_annotated();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(509);
				fof_annotated();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(510);
				cnf_annotated();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(511);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTpi_annotated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTpi_annotated(this);
		}
	}

	public final Tpi_annotatedContext tpi_annotated() throws RecognitionException {
		Tpi_annotatedContext _localctx = new Tpi_annotatedContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tpi_annotated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(T__0);
			setState(515);
			name();
			setState(516);
			match(T__1);
			setState(517);
			formula_role();
			setState(518);
			match(T__1);
			setState(519);
			tpi_formula();
			setState(520);
			annotations();
			setState(521);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTpi_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTpi_formula(this);
		}
	}

	public final Tpi_formulaContext tpi_formula() throws RecognitionException {
		Tpi_formulaContext _localctx = new Tpi_formulaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tpi_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_annotated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_annotated(this);
		}
	}

	public final Thf_annotatedContext thf_annotated() throws RecognitionException {
		Thf_annotatedContext _localctx = new Thf_annotatedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_thf_annotated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(T__3);
			setState(526);
			name();
			setState(527);
			match(T__1);
			setState(528);
			formula_role();
			setState(529);
			match(T__1);
			setState(530);
			thf_formula();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_annotated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_annotated(this);
		}
	}

	public final Tff_annotatedContext tff_annotated() throws RecognitionException {
		Tff_annotatedContext _localctx = new Tff_annotatedContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tff_annotated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(T__4);
			setState(535);
			name();
			setState(536);
			match(T__1);
			setState(537);
			formula_role();
			setState(538);
			match(T__1);
			setState(539);
			tff_formula();
			setState(540);
			annotations();
			setState(541);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTcf_annotated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTcf_annotated(this);
		}
	}

	public final Tcf_annotatedContext tcf_annotated() throws RecognitionException {
		Tcf_annotatedContext _localctx = new Tcf_annotatedContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tcf_annotated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(T__5);
			setState(544);
			name();
			setState(545);
			match(T__1);
			setState(546);
			formula_role();
			setState(547);
			match(T__1);
			setState(548);
			tcf_formula();
			setState(549);
			annotations();
			setState(550);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_annotated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_annotated(this);
		}
	}

	public final Fof_annotatedContext fof_annotated() throws RecognitionException {
		Fof_annotatedContext _localctx = new Fof_annotatedContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fof_annotated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(T__6);
			setState(553);
			name();
			setState(554);
			match(T__1);
			setState(555);
			formula_role();
			setState(556);
			match(T__1);
			setState(557);
			fof_formula();
			setState(558);
			annotations();
			setState(559);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterCnf_annotated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitCnf_annotated(this);
		}
	}

	public final Cnf_annotatedContext cnf_annotated() throws RecognitionException {
		Cnf_annotatedContext _localctx = new Cnf_annotatedContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cnf_annotated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(T__7);
			setState(562);
			name();
			setState(563);
			match(T__1);
			setState(564);
			formula_role();
			setState(565);
			match(T__1);
			setState(566);
			cnf_formula();
			setState(567);
			annotations();
			setState(568);
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
		public NullContext null_() {
			return getRuleContext(NullContext.class,0);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitAnnotations(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_annotations);
		try {
			setState(575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				match(T__1);
				setState(571);
				source();
				setState(572);
				optional_info();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				null_();
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
		public TerminalNode Lower_word() { return getToken(TPTPv9Parser.Lower_word, 0); }
		public General_termContext general_term() {
			return getRuleContext(General_termContext.class,0);
		}
		public Formula_roleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula_role; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFormula_role(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFormula_role(this);
		}
	}

	public final Formula_roleContext formula_role() throws RecognitionException {
		Formula_roleContext _localctx = new Formula_roleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formula_role);
		try {
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				match(Lower_word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				match(Lower_word);
				setState(579);
				match(T__8);
				setState(580);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_formula(this);
		}
	}

	public final Thf_formulaContext thf_formula() throws RecognitionException {
		Thf_formulaContext _localctx = new Thf_formulaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_thf_formula);
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				thf_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				thf_atom_typing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_logic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_logic_formula(this);
		}
	}

	public final Thf_logic_formulaContext thf_logic_formula() throws RecognitionException {
		Thf_logic_formulaContext _localctx = new Thf_logic_formulaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_thf_logic_formula);
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				thf_unitary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				thf_unary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				thf_binary_formula();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				thf_defined_infix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(592);
				thf_definition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(593);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_binary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_binary_formula(this);
		}
	}

	public final Thf_binary_formulaContext thf_binary_formula() throws RecognitionException {
		Thf_binary_formulaContext _localctx = new Thf_binary_formulaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_thf_binary_formula);
		try {
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				thf_binary_nonassoc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				thf_binary_assoc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(598);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_binary_nonassoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_binary_nonassoc(this);
		}
	}

	public final Thf_binary_nonassocContext thf_binary_nonassoc() throws RecognitionException {
		Thf_binary_nonassocContext _localctx = new Thf_binary_nonassocContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_thf_binary_nonassoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			thf_unit_formula();
			setState(602);
			nonassoc_connective();
			setState(603);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_binary_assoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_binary_assoc(this);
		}
	}

	public final Thf_binary_assocContext thf_binary_assoc() throws RecognitionException {
		Thf_binary_assocContext _localctx = new Thf_binary_assocContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_thf_binary_assoc);
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				thf_or_formula(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				thf_and_formula(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(607);
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
		public VlineContext vline() {
			return getRuleContext(VlineContext.class,0);
		}
		public Thf_or_formulaContext thf_or_formula() {
			return getRuleContext(Thf_or_formulaContext.class,0);
		}
		public Thf_or_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_or_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_or_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_or_formula(this);
		}
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
			setState(611);
			thf_unit_formula();
			setState(612);
			vline();
			setState(613);
			thf_unit_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(621);
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
					setState(615);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(616);
					vline();
					setState(617);
					thf_unit_formula();
					}
					} 
				}
				setState(623);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_and_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_and_formula(this);
		}
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
			setState(625);
			thf_unit_formula();
			setState(626);
			match(T__9);
			setState(627);
			thf_unit_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(634);
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
					setState(629);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(630);
					match(T__9);
					setState(631);
					thf_unit_formula();
					}
					} 
				}
				setState(636);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_apply_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_apply_formula(this);
		}
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
			setState(638);
			thf_unit_formula();
			setState(639);
			match(T__10);
			setState(640);
			thf_unit_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(647);
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
					setState(642);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(643);
					match(T__10);
					setState(644);
					thf_unit_formula();
					}
					} 
				}
				setState(649);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_unit_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_unit_formula(this);
		}
	}

	public final Thf_unit_formulaContext thf_unit_formula() throws RecognitionException {
		Thf_unit_formulaContext _localctx = new Thf_unit_formulaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_thf_unit_formula);
		try {
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				thf_unitary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				thf_unary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(652);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_preunit_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_preunit_formula(this);
		}
	}

	public final Thf_preunit_formulaContext thf_preunit_formula() throws RecognitionException {
		Thf_preunit_formulaContext _localctx = new Thf_preunit_formulaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_thf_preunit_formula);
		try {
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__13:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__26:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__33:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__61:
			case T__64:
			case Lower_word:
			case Double_quote:
			case Non_zero_numeric:
			case Upper_alpha:
			case Dollar:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				thf_unitary_formula();
				}
				break;
			case T__22:
			case T__24:
			case T__25:
			case T__27:
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_unitary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_unitary_formula(this);
		}
	}

	public final Thf_unitary_formulaContext thf_unitary_formula() throws RecognitionException {
		Thf_unitary_formulaContext _localctx = new Thf_unitary_formulaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_thf_unitary_formula);
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				thf_quantified_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				thf_atomic_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(662);
				match(T__11);
				setState(663);
				thf_logic_formula();
				setState(664);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_quantified_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_quantified_formula(this);
		}
	}

	public final Thf_quantified_formulaContext thf_quantified_formula() throws RecognitionException {
		Thf_quantified_formulaContext _localctx = new Thf_quantified_formulaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_thf_quantified_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			thf_quantification();
			setState(669);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_quantification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_quantification(this);
		}
	}

	public final Thf_quantificationContext thf_quantification() throws RecognitionException {
		Thf_quantificationContext _localctx = new Thf_quantificationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_thf_quantification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			thf_quantifier();
			setState(672);
			match(T__13);
			setState(673);
			thf_variable_list();
			setState(674);
			match(T__14);
			setState(675);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_variable_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_variable_list(this);
		}
	}

	public final Thf_variable_listContext thf_variable_list() throws RecognitionException {
		Thf_variable_listContext _localctx = new Thf_variable_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_thf_variable_list);
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				thf_typed_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				thf_typed_variable();
				setState(679);
				match(T__1);
				setState(680);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_typed_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_typed_variable(this);
		}
	}

	public final Thf_typed_variableContext thf_typed_variable() throws RecognitionException {
		Thf_typed_variableContext _localctx = new Thf_typed_variableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_thf_typed_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			variable();
			setState(685);
			match(T__15);
			setState(686);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_unary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_unary_formula(this);
		}
	}

	public final Thf_unary_formulaContext thf_unary_formula() throws RecognitionException {
		Thf_unary_formulaContext _localctx = new Thf_unary_formulaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_thf_unary_formula);
		try {
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__24:
			case T__25:
			case T__27:
			case T__60:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				thf_prefix_unary();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_prefix_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_prefix_unary(this);
		}
	}

	public final Thf_prefix_unaryContext thf_prefix_unary() throws RecognitionException {
		Thf_prefix_unaryContext _localctx = new Thf_prefix_unaryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_thf_prefix_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			thf_unary_connective();
			setState(693);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_infix_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_infix_unary(this);
		}
	}

	public final Thf_infix_unaryContext thf_infix_unary() throws RecognitionException {
		Thf_infix_unaryContext _localctx = new Thf_infix_unaryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_thf_infix_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(T__11);
			setState(696);
			thf_unitary_term();
			setState(697);
			infix_inequality();
			setState(698);
			thf_unitary_term();
			setState(699);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_atomic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_atomic_formula(this);
		}
	}

	public final Thf_atomic_formulaContext thf_atomic_formula() throws RecognitionException {
		Thf_atomic_formulaContext _localctx = new Thf_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_thf_atomic_formula);
		try {
			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				thf_plain_atomic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				thf_defined_atomic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(703);
				thf_system_atomic();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(704);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_plain_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_plain_atomic(this);
		}
	}

	public final Thf_plain_atomicContext thf_plain_atomic() throws RecognitionException {
		Thf_plain_atomicContext _localctx = new Thf_plain_atomicContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_thf_plain_atomic);
		try {
			setState(709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__64:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				constant();
				}
				break;
			case T__13:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_defined_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_defined_atomic(this);
		}
	}

	public final Thf_defined_atomicContext thf_defined_atomic() throws RecognitionException {
		Thf_defined_atomicContext _localctx = new Thf_defined_atomicContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_thf_defined_atomic);
		try {
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				defined_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				thf_defined_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(713);
				match(T__11);
				setState(714);
				thf_conn_term();
				setState(715);
				match(T__12);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(717);
				nhf_long_connective();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(718);
				thf_let();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_defined_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_defined_term(this);
		}
	}

	public final Thf_defined_termContext thf_defined_term() throws RecognitionException {
		Thf_defined_termContext _localctx = new Thf_defined_termContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_thf_defined_term);
		try {
			setState(723);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case Double_quote:
			case Non_zero_numeric:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				defined_term();
				}
				break;
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_defined_infix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_defined_infix(this);
		}
	}

	public final Thf_defined_infixContext thf_defined_infix() throws RecognitionException {
		Thf_defined_infixContext _localctx = new Thf_defined_infixContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_thf_defined_infix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(T__11);
			setState(726);
			thf_unitary_term();
			setState(727);
			defined_infix_pred();
			setState(728);
			thf_unitary_term();
			setState(729);
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
	public static class Thf_system_atomicContext extends ParserRuleContext {
		public System_constantContext system_constant() {
			return getRuleContext(System_constantContext.class,0);
		}
		public Thf_system_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_system_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_system_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_system_atomic(this);
		}
	}

	public final Thf_system_atomicContext thf_system_atomic() throws RecognitionException {
		Thf_system_atomicContext _localctx = new Thf_system_atomicContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_thf_system_atomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_let(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_let(this);
		}
	}

	public final Thf_letContext thf_let() throws RecognitionException {
		Thf_letContext _localctx = new Thf_letContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_thf_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(T__16);
			setState(734);
			thf_let_types();
			setState(735);
			match(T__1);
			setState(736);
			thf_let_defns();
			setState(737);
			match(T__1);
			setState(738);
			thf_logic_formula();
			setState(739);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_let_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_let_types(this);
		}
	}

	public final Thf_let_typesContext thf_let_types() throws RecognitionException {
		Thf_let_typesContext _localctx = new Thf_let_typesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_thf_let_types);
		try {
			setState(746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__64:
			case Lower_word:
			case Dollar:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				thf_atom_typing();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				match(T__13);
				setState(743);
				thf_atom_typing_list();
				setState(744);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_atom_typing_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_atom_typing_list(this);
		}
	}

	public final Thf_atom_typing_listContext thf_atom_typing_list() throws RecognitionException {
		Thf_atom_typing_listContext _localctx = new Thf_atom_typing_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_thf_atom_typing_list);
		try {
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				thf_atom_typing();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				thf_atom_typing();
				setState(750);
				match(T__1);
				setState(751);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_let_defns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_let_defns(this);
		}
	}

	public final Thf_let_defnsContext thf_let_defns() throws RecognitionException {
		Thf_let_defnsContext _localctx = new Thf_let_defnsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_thf_let_defns);
		try {
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				thf_let_defn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				match(T__13);
				setState(757);
				thf_let_defn_list();
				setState(758);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_let_defn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_let_defn(this);
		}
	}

	public final Thf_let_defnContext thf_let_defn() throws RecognitionException {
		Thf_let_defnContext _localctx = new Thf_let_defnContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_thf_let_defn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			thf_logic_formula();
			setState(763);
			assignment();
			setState(764);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_let_defn_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_let_defn_list(this);
		}
	}

	public final Thf_let_defn_listContext thf_let_defn_list() throws RecognitionException {
		Thf_let_defn_listContext _localctx = new Thf_let_defn_listContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_thf_let_defn_list);
		try {
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				thf_let_defn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				thf_let_defn();
				setState(768);
				match(T__1);
				setState(769);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_unitary_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_unitary_term(this);
		}
	}

	public final Thf_unitary_termContext thf_unitary_term() throws RecognitionException {
		Thf_unitary_termContext _localctx = new Thf_unitary_termContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_thf_unitary_term);
		try {
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				thf_atomic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(775);
				match(T__11);
				setState(776);
				thf_logic_formula();
				setState(777);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_conn_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_conn_term(this);
		}
	}

	public final Thf_conn_termContext thf_conn_term() throws RecognitionException {
		Thf_conn_termContext _localctx = new Thf_conn_termContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_thf_conn_term);
		try {
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				nonassoc_connective();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				assoc_connective();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(783);
				infix_equality();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(784);
				infix_inequality();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(785);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_tuple(this);
		}
	}

	public final Thf_tupleContext thf_tuple() throws RecognitionException {
		Thf_tupleContext _localctx = new Thf_tupleContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_thf_tuple);
		try {
			setState(793);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				match(T__17);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				match(T__13);
				setState(790);
				thf_formula_list();
				setState(791);
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
		public FunctorContext functor() {
			return getRuleContext(FunctorContext.class,0);
		}
		public Thf_argumentsContext thf_arguments() {
			return getRuleContext(Thf_argumentsContext.class,0);
		}
		public Defined_functorContext defined_functor() {
			return getRuleContext(Defined_functorContext.class,0);
		}
		public System_functorContext system_functor() {
			return getRuleContext(System_functorContext.class,0);
		}
		public Thf_fof_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_fof_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_fof_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_fof_function(this);
		}
	}

	public final Thf_fof_functionContext thf_fof_function() throws RecognitionException {
		Thf_fof_functionContext _localctx = new Thf_fof_functionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_thf_fof_function);
		try {
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(795);
				functor();
				setState(796);
				match(T__11);
				setState(797);
				thf_arguments();
				setState(798);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
				defined_functor();
				setState(801);
				match(T__11);
				setState(802);
				thf_arguments();
				setState(803);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(805);
				system_functor();
				setState(806);
				match(T__11);
				setState(807);
				thf_arguments();
				setState(808);
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
	public static class Thf_argumentsContext extends ParserRuleContext {
		public Thf_formula_listContext thf_formula_list() {
			return getRuleContext(Thf_formula_listContext.class,0);
		}
		public Thf_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_arguments(this);
		}
	}

	public final Thf_argumentsContext thf_arguments() throws RecognitionException {
		Thf_argumentsContext _localctx = new Thf_argumentsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_thf_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
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
		public Thf_formula_listContext thf_formula_list() {
			return getRuleContext(Thf_formula_listContext.class,0);
		}
		public Thf_formula_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_formula_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_formula_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_formula_list(this);
		}
	}

	public final Thf_formula_listContext thf_formula_list() throws RecognitionException {
		Thf_formula_listContext _localctx = new Thf_formula_listContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_thf_formula_list);
		try {
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				thf_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				thf_logic_formula();
				setState(816);
				match(T__1);
				setState(817);
				thf_formula_list();
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
	public static class Thf_atom_typingContext extends ParserRuleContext {
		public Untyped_atomContext untyped_atom() {
			return getRuleContext(Untyped_atomContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_atom_typing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_atom_typing(this);
		}
	}

	public final Thf_atom_typingContext thf_atom_typing() throws RecognitionException {
		Thf_atom_typingContext _localctx = new Thf_atom_typingContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_thf_atom_typing);
		try {
			setState(829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__64:
			case Lower_word:
			case Dollar:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				untyped_atom();
				setState(822);
				match(T__15);
				setState(823);
				thf_top_level_type();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				match(T__11);
				setState(826);
				thf_atom_typing();
				setState(827);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_top_level_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_top_level_type(this);
		}
	}

	public final Thf_top_level_typeContext thf_top_level_type() throws RecognitionException {
		Thf_top_level_typeContext _localctx = new Thf_top_level_typeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_thf_top_level_type);
		try {
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				thf_unitary_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				thf_mapping_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(833);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_unitary_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_unitary_type(this);
		}
	}

	public final Thf_unitary_typeContext thf_unitary_type() throws RecognitionException {
		Thf_unitary_typeContext _localctx = new Thf_unitary_typeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_thf_unitary_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_apply_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_apply_type(this);
		}
	}

	public final Thf_apply_typeContext thf_apply_type() throws RecognitionException {
		Thf_apply_typeContext _localctx = new Thf_apply_typeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_thf_apply_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_binary_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_binary_type(this);
		}
	}

	public final Thf_binary_typeContext thf_binary_type() throws RecognitionException {
		Thf_binary_typeContext _localctx = new Thf_binary_typeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_thf_binary_type);
		try {
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				thf_mapping_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				thf_xprod_type(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(842);
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
		public ArrowContext arrow() {
			return getRuleContext(ArrowContext.class,0);
		}
		public Thf_mapping_typeContext thf_mapping_type() {
			return getRuleContext(Thf_mapping_typeContext.class,0);
		}
		public Thf_mapping_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_mapping_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_mapping_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_mapping_type(this);
		}
	}

	public final Thf_mapping_typeContext thf_mapping_type() throws RecognitionException {
		Thf_mapping_typeContext _localctx = new Thf_mapping_typeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_thf_mapping_type);
		try {
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(845);
				thf_unitary_type();
				setState(846);
				arrow();
				setState(847);
				thf_unitary_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				thf_unitary_type();
				setState(850);
				arrow();
				setState(851);
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
		public StarContext star() {
			return getRuleContext(StarContext.class,0);
		}
		public Thf_xprod_typeContext thf_xprod_type() {
			return getRuleContext(Thf_xprod_typeContext.class,0);
		}
		public Thf_xprod_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_xprod_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_xprod_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_xprod_type(this);
		}
	}

	public final Thf_xprod_typeContext thf_xprod_type() throws RecognitionException {
		return thf_xprod_type(0);
	}

	private Thf_xprod_typeContext thf_xprod_type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Thf_xprod_typeContext _localctx = new Thf_xprod_typeContext(_ctx, _parentState);
		Thf_xprod_typeContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_thf_xprod_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(856);
			thf_unitary_type();
			setState(857);
			star();
			setState(858);
			thf_unitary_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(866);
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
					setState(860);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(861);
					star();
					setState(862);
					thf_unitary_type();
					}
					} 
				}
				setState(868);
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
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public Thf_union_typeContext thf_union_type() {
			return getRuleContext(Thf_union_typeContext.class,0);
		}
		public Thf_union_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_union_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_union_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_union_type(this);
		}
	}

	public final Thf_union_typeContext thf_union_type() throws RecognitionException {
		return thf_union_type(0);
	}

	private Thf_union_typeContext thf_union_type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Thf_union_typeContext _localctx = new Thf_union_typeContext(_ctx, _parentState);
		Thf_union_typeContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_thf_union_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(870);
			thf_unitary_type();
			setState(871);
			plus();
			setState(872);
			thf_unitary_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(880);
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
					setState(874);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(875);
					plus();
					setState(876);
					thf_unitary_type();
					}
					} 
				}
				setState(882);
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
		public Untyped_atomContext untyped_atom() {
			return getRuleContext(Untyped_atomContext.class,0);
		}
		public Subtype_signContext subtype_sign() {
			return getRuleContext(Subtype_signContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Thf_subtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_subtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_subtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_subtype(this);
		}
	}

	public final Thf_subtypeContext thf_subtype() throws RecognitionException {
		Thf_subtypeContext _localctx = new Thf_subtypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_thf_subtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			untyped_atom();
			setState(884);
			subtype_sign();
			setState(885);
			atom();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_definition(this);
		}
	}

	public final Thf_definitionContext thf_definition() throws RecognitionException {
		Thf_definitionContext _localctx = new Thf_definitionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_thf_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			thf_atomic_formula();
			setState(888);
			identical();
			setState(889);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_sequent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_sequent(this);
		}
	}

	public final Thf_sequentContext thf_sequent() throws RecognitionException {
		Thf_sequentContext _localctx = new Thf_sequentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_thf_sequent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			thf_tuple();
			setState(892);
			gentzen_arrow();
			setState(893);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_formula(this);
		}
	}

	public final Tff_formulaContext tff_formula() throws RecognitionException {
		Tff_formulaContext _localctx = new Tff_formulaContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_tff_formula);
		try {
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(895);
				tff_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(896);
				tff_atom_typing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(897);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_logic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_logic_formula(this);
		}
	}

	public final Tff_logic_formulaContext tff_logic_formula() throws RecognitionException {
		Tff_logic_formulaContext _localctx = new Tff_logic_formulaContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_tff_logic_formula);
		try {
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				tff_unitary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				tff_unary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(902);
				tff_binary_formula();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(903);
				tff_defined_infix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(904);
				txf_definition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(905);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_binary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_binary_formula(this);
		}
	}

	public final Tff_binary_formulaContext tff_binary_formula() throws RecognitionException {
		Tff_binary_formulaContext _localctx = new Tff_binary_formulaContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_tff_binary_formula);
		try {
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				tff_binary_nonassoc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_binary_nonassoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_binary_nonassoc(this);
		}
	}

	public final Tff_binary_nonassocContext tff_binary_nonassoc() throws RecognitionException {
		Tff_binary_nonassocContext _localctx = new Tff_binary_nonassocContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_tff_binary_nonassoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			tff_unit_formula();
			setState(913);
			nonassoc_connective();
			setState(914);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_binary_assoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_binary_assoc(this);
		}
	}

	public final Tff_binary_assocContext tff_binary_assoc() throws RecognitionException {
		Tff_binary_assocContext _localctx = new Tff_binary_assocContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_tff_binary_assoc);
		try {
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				tff_or_formula(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
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
		public VlineContext vline() {
			return getRuleContext(VlineContext.class,0);
		}
		public Tff_or_formulaContext tff_or_formula() {
			return getRuleContext(Tff_or_formulaContext.class,0);
		}
		public Tff_or_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_or_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_or_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_or_formula(this);
		}
	}

	public final Tff_or_formulaContext tff_or_formula() throws RecognitionException {
		return tff_or_formula(0);
	}

	private Tff_or_formulaContext tff_or_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tff_or_formulaContext _localctx = new Tff_or_formulaContext(_ctx, _parentState);
		Tff_or_formulaContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_tff_or_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(921);
			tff_unit_formula();
			setState(922);
			vline();
			setState(923);
			tff_unit_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(931);
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
					setState(925);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(926);
					vline();
					setState(927);
					tff_unit_formula();
					}
					} 
				}
				setState(933);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_and_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_and_formula(this);
		}
	}

	public final Tff_and_formulaContext tff_and_formula() throws RecognitionException {
		return tff_and_formula(0);
	}

	private Tff_and_formulaContext tff_and_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tff_and_formulaContext _localctx = new Tff_and_formulaContext(_ctx, _parentState);
		Tff_and_formulaContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_tff_and_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(935);
			tff_unit_formula();
			setState(936);
			match(T__9);
			setState(937);
			tff_unit_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(944);
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
					setState(939);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(940);
					match(T__9);
					setState(941);
					tff_unit_formula();
					}
					} 
				}
				setState(946);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_unit_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_unit_formula(this);
		}
	}

	public final Tff_unit_formulaContext tff_unit_formula() throws RecognitionException {
		Tff_unit_formulaContext _localctx = new Tff_unit_formulaContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_tff_unit_formula);
		try {
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				tff_unitary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				tff_unary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(949);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_preunit_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_preunit_formula(this);
		}
	}

	public final Tff_preunit_formulaContext tff_preunit_formula() throws RecognitionException {
		Tff_preunit_formulaContext _localctx = new Tff_preunit_formulaContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_tff_preunit_formula);
		try {
			setState(954);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__16:
			case T__19:
			case T__26:
			case T__33:
			case T__61:
			case T__64:
			case Lower_word:
			case Upper_alpha:
			case Dollar:
				enterOuterAlt(_localctx, 1);
				{
				setState(952);
				tff_unitary_formula();
				}
				break;
			case T__22:
			case T__24:
			case T__25:
			case T__27:
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				setState(953);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_unitary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_unitary_formula(this);
		}
	}

	public final Tff_unitary_formulaContext tff_unitary_formula() throws RecognitionException {
		Tff_unitary_formulaContext _localctx = new Tff_unitary_formulaContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_tff_unitary_formula);
		try {
			setState(963);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__33:
			case T__61:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				tff_quantified_formula();
				}
				break;
			case T__16:
			case T__19:
			case T__64:
			case Lower_word:
			case Dollar:
				enterOuterAlt(_localctx, 2);
				{
				setState(957);
				tff_atomic_formula();
				}
				break;
			case Upper_alpha:
				enterOuterAlt(_localctx, 3);
				{
				setState(958);
				txf_unitary_formula();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(959);
				match(T__11);
				setState(960);
				tff_logic_formula();
				setState(961);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTxf_unitary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTxf_unitary_formula(this);
		}
	}

	public final Txf_unitary_formulaContext txf_unitary_formula() throws RecognitionException {
		Txf_unitary_formulaContext _localctx = new Txf_unitary_formulaContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_txf_unitary_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_quantified_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_quantified_formula(this);
		}
	}

	public final Tff_quantified_formulaContext tff_quantified_formula() throws RecognitionException {
		Tff_quantified_formulaContext _localctx = new Tff_quantified_formulaContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_tff_quantified_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			tff_quantifier();
			setState(968);
			match(T__13);
			setState(969);
			tff_variable_list();
			setState(970);
			match(T__14);
			setState(971);
			match(T__15);
			setState(972);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_variable_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_variable_list(this);
		}
	}

	public final Tff_variable_listContext tff_variable_list() throws RecognitionException {
		Tff_variable_listContext _localctx = new Tff_variable_listContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_tff_variable_list);
		try {
			setState(979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(974);
				tff_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				tff_variable();
				setState(976);
				match(T__1);
				setState(977);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_variable(this);
		}
	}

	public final Tff_variableContext tff_variable() throws RecognitionException {
		Tff_variableContext _localctx = new Tff_variableContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_tff_variable);
		try {
			setState(983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(981);
				tff_typed_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(982);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_typed_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_typed_variable(this);
		}
	}

	public final Tff_typed_variableContext tff_typed_variable() throws RecognitionException {
		Tff_typed_variableContext _localctx = new Tff_typed_variableContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_tff_typed_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			variable();
			setState(986);
			match(T__15);
			setState(987);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_unary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_unary_formula(this);
		}
	}

	public final Tff_unary_formulaContext tff_unary_formula() throws RecognitionException {
		Tff_unary_formulaContext _localctx = new Tff_unary_formulaContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_tff_unary_formula);
		try {
			setState(991);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__24:
			case T__25:
			case T__27:
			case T__60:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				tff_prefix_unary();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_prefix_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_prefix_unary(this);
		}
	}

	public final Tff_prefix_unaryContext tff_prefix_unary() throws RecognitionException {
		Tff_prefix_unaryContext _localctx = new Tff_prefix_unaryContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_tff_prefix_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			tff_unary_connective();
			setState(994);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_infix_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_infix_unary(this);
		}
	}

	public final Tff_infix_unaryContext tff_infix_unary() throws RecognitionException {
		Tff_infix_unaryContext _localctx = new Tff_infix_unaryContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_tff_infix_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			match(T__11);
			setState(997);
			tff_unitary_term();
			setState(998);
			infix_inequality();
			setState(999);
			tff_unitary_term();
			setState(1000);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_atomic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_atomic_formula(this);
		}
	}

	public final Tff_atomic_formulaContext tff_atomic_formula() throws RecognitionException {
		Tff_atomic_formulaContext _localctx = new Tff_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_tff_atomic_formula);
		try {
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				tff_plain_atomic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				tff_defined_atomic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1004);
				tff_system_atomic();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_plain_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_plain_atomic(this);
		}
	}

	public final Tff_plain_atomicContext tff_plain_atomic() throws RecognitionException {
		Tff_plain_atomicContext _localctx = new Tff_plain_atomicContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_tff_plain_atomic);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1007);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				functor();
				setState(1009);
				match(T__11);
				setState(1010);
				tff_arguments();
				setState(1011);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_defined_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_defined_atomic(this);
		}
	}

	public final Tff_defined_atomicContext tff_defined_atomic() throws RecognitionException {
		Tff_defined_atomicContext _localctx = new Tff_defined_atomicContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_tff_defined_atomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_defined_plain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_defined_plain(this);
		}
	}

	public final Tff_defined_plainContext tff_defined_plain() throws RecognitionException {
		Tff_defined_plainContext _localctx = new Tff_defined_plainContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_tff_defined_plain);
		try {
			setState(1025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1017);
				defined_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1018);
				defined_functor();
				setState(1019);
				match(T__11);
				setState(1020);
				tff_arguments();
				setState(1021);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1023);
				nxf_atom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1024);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_defined_infix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_defined_infix(this);
		}
	}

	public final Tff_defined_infixContext tff_defined_infix() throws RecognitionException {
		Tff_defined_infixContext _localctx = new Tff_defined_infixContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_tff_defined_infix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(T__11);
			setState(1028);
			tff_unitary_term();
			setState(1029);
			defined_infix_pred();
			setState(1030);
			tff_unitary_term();
			setState(1031);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_system_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_system_atomic(this);
		}
	}

	public final Tff_system_atomicContext tff_system_atomic() throws RecognitionException {
		Tff_system_atomicContext _localctx = new Tff_system_atomicContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_tff_system_atomic);
		try {
			setState(1039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				system_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1034);
				system_functor();
				setState(1035);
				match(T__11);
				setState(1036);
				tff_arguments();
				setState(1037);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTxf_let(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTxf_let(this);
		}
	}

	public final Txf_letContext txf_let() throws RecognitionException {
		Txf_letContext _localctx = new Txf_letContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_txf_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(T__16);
			setState(1042);
			txf_let_types();
			setState(1043);
			match(T__1);
			setState(1044);
			txf_let_defns();
			setState(1045);
			match(T__1);
			setState(1046);
			tff_term();
			setState(1047);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTxf_let_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTxf_let_types(this);
		}
	}

	public final Txf_let_typesContext txf_let_types() throws RecognitionException {
		Txf_let_typesContext _localctx = new Txf_let_typesContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_txf_let_types);
		try {
			setState(1054);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__64:
			case Lower_word:
			case Dollar:
				enterOuterAlt(_localctx, 1);
				{
				setState(1049);
				tff_atom_typing();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(1050);
				match(T__13);
				setState(1051);
				tff_atom_typing_list();
				setState(1052);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_atom_typing_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_atom_typing_list(this);
		}
	}

	public final Tff_atom_typing_listContext tff_atom_typing_list() throws RecognitionException {
		Tff_atom_typing_listContext _localctx = new Tff_atom_typing_listContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_tff_atom_typing_list);
		try {
			setState(1061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1056);
				tff_atom_typing();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057);
				tff_atom_typing();
				setState(1058);
				match(T__1);
				setState(1059);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTxf_let_defns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTxf_let_defns(this);
		}
	}

	public final Txf_let_defnsContext txf_let_defns() throws RecognitionException {
		Txf_let_defnsContext _localctx = new Txf_let_defnsContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_txf_let_defns);
		try {
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				txf_let_defn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1064);
				match(T__13);
				setState(1065);
				txf_let_defn_list();
				setState(1066);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTxf_let_defn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTxf_let_defn(this);
		}
	}

	public final Txf_let_defnContext txf_let_defn() throws RecognitionException {
		Txf_let_defnContext _localctx = new Txf_let_defnContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_txf_let_defn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			txf_let_LHS();
			setState(1071);
			assignment();
			setState(1072);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTxf_let_LHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTxf_let_LHS(this);
		}
	}

	public final Txf_let_LHSContext txf_let_LHS() throws RecognitionException {
		Txf_let_LHSContext _localctx = new Txf_let_LHSContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_txf_let_LHS);
		try {
			setState(1076);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__64:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(1074);
				tff_plain_atomic();
				}
				break;
			case T__13:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(1075);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTxf_let_defn_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTxf_let_defn_list(this);
		}
	}

	public final Txf_let_defn_listContext txf_let_defn_list() throws RecognitionException {
		Txf_let_defn_listContext _localctx = new Txf_let_defn_listContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_txf_let_defn_list);
		try {
			setState(1083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1078);
				txf_let_defn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1079);
				txf_let_defn();
				setState(1080);
				match(T__1);
				setState(1081);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterNxf_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitNxf_atom(this);
		}
	}

	public final Nxf_atomContext nxf_atom() throws RecognitionException {
		Nxf_atomContext _localctx = new Nxf_atomContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_nxf_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			nxf_long_connective();
			setState(1086);
			match(T__10);
			setState(1087);
			match(T__11);
			setState(1088);
			tff_arguments();
			setState(1089);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_term(this);
		}
	}

	public final Tff_termContext tff_term() throws RecognitionException {
		Tff_termContext _localctx = new Tff_termContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_tff_term);
		try {
			setState(1094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1091);
				tff_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				defined_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1093);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_unitary_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_unitary_term(this);
		}
	}

	public final Tff_unitary_termContext tff_unitary_term() throws RecognitionException {
		Tff_unitary_termContext _localctx = new Tff_unitary_termContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_tff_unitary_term);
		try {
			setState(1104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				tff_atomic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1097);
				defined_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1098);
				txf_tuple();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1099);
				variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1100);
				match(T__11);
				setState(1101);
				tff_logic_formula();
				setState(1102);
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
	public static class Txf_tupleContext extends ParserRuleContext {
		public Tff_argumentsContext tff_arguments() {
			return getRuleContext(Tff_argumentsContext.class,0);
		}
		public Txf_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txf_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTxf_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTxf_tuple(this);
		}
	}

	public final Txf_tupleContext txf_tuple() throws RecognitionException {
		Txf_tupleContext _localctx = new Txf_tupleContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_txf_tuple);
		try {
			setState(1111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(1106);
				match(T__17);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(1107);
				match(T__13);
				setState(1108);
				tff_arguments();
				setState(1109);
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
		public Tff_argumentsContext tff_arguments() {
			return getRuleContext(Tff_argumentsContext.class,0);
		}
		public Tff_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_arguments(this);
		}
	}

	public final Tff_argumentsContext tff_arguments() throws RecognitionException {
		Tff_argumentsContext _localctx = new Tff_argumentsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_tff_arguments);
		try {
			setState(1118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				tff_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				tff_term();
				setState(1115);
				match(T__1);
				setState(1116);
				tff_arguments();
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
	public static class Tff_atom_typingContext extends ParserRuleContext {
		public Untyped_atomContext untyped_atom() {
			return getRuleContext(Untyped_atomContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_atom_typing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_atom_typing(this);
		}
	}

	public final Tff_atom_typingContext tff_atom_typing() throws RecognitionException {
		Tff_atom_typingContext _localctx = new Tff_atom_typingContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_tff_atom_typing);
		try {
			setState(1128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__64:
			case Lower_word:
			case Dollar:
				enterOuterAlt(_localctx, 1);
				{
				setState(1120);
				untyped_atom();
				setState(1121);
				match(T__15);
				setState(1122);
				tff_top_level_type();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(1124);
				match(T__11);
				setState(1125);
				tff_atom_typing();
				setState(1126);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_top_level_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_top_level_type(this);
		}
	}

	public final Tff_top_level_typeContext tff_top_level_type() throws RecognitionException {
		Tff_top_level_typeContext _localctx = new Tff_top_level_typeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_tff_top_level_type);
		try {
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				tff_atomic_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_non_atomic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_non_atomic_type(this);
		}
	}

	public final Tff_non_atomic_typeContext tff_non_atomic_type() throws RecognitionException {
		Tff_non_atomic_typeContext _localctx = new Tff_non_atomic_typeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_tff_non_atomic_type);
		try {
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				tff_mapping_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1135);
				tf1_quantified_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1136);
				match(T__11);
				setState(1137);
				tff_non_atomic_type();
				setState(1138);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTf1_quantified_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTf1_quantified_type(this);
		}
	}

	public final Tf1_quantified_typeContext tf1_quantified_type() throws RecognitionException {
		Tf1_quantified_typeContext _localctx = new Tf1_quantified_typeContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_tf1_quantified_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			match(T__18);
			setState(1143);
			match(T__13);
			setState(1144);
			tff_variable_list();
			setState(1145);
			match(T__14);
			setState(1146);
			match(T__15);
			setState(1147);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_monotype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_monotype(this);
		}
	}

	public final Tff_monotypeContext tff_monotype() throws RecognitionException {
		Tff_monotypeContext _localctx = new Tff_monotypeContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_tff_monotype);
		try {
			setState(1155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1149);
				tff_atomic_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
				match(T__11);
				setState(1151);
				tff_mapping_type();
				setState(1152);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1154);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_unitary_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_unitary_type(this);
		}
	}

	public final Tff_unitary_typeContext tff_unitary_type() throws RecognitionException {
		Tff_unitary_typeContext _localctx = new Tff_unitary_typeContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_tff_unitary_type);
		try {
			setState(1162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1157);
				tff_atomic_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1158);
				match(T__11);
				setState(1159);
				tff_xprod_type(0);
				setState(1160);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_atomic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_atomic_type(this);
		}
	}

	public final Tff_atomic_typeContext tff_atomic_type() throws RecognitionException {
		Tff_atomic_typeContext _localctx = new Tff_atomic_typeContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_tff_atomic_type);
		try {
			setState(1177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1164);
				type_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1165);
				defined_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1166);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1167);
				type_functor();
				setState(1168);
				match(T__11);
				setState(1169);
				tff_type_arguments();
				setState(1170);
				match(T__12);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1172);
				match(T__11);
				setState(1173);
				tff_atomic_type();
				setState(1174);
				match(T__12);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1176);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_type_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_type_arguments(this);
		}
	}

	public final Tff_type_argumentsContext tff_type_arguments() throws RecognitionException {
		Tff_type_argumentsContext _localctx = new Tff_type_argumentsContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_tff_type_arguments);
		try {
			setState(1184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1179);
				tff_atomic_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1180);
				tff_atomic_type();
				setState(1181);
				match(T__1);
				setState(1182);
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
		public ArrowContext arrow() {
			return getRuleContext(ArrowContext.class,0);
		}
		public Tff_atomic_typeContext tff_atomic_type() {
			return getRuleContext(Tff_atomic_typeContext.class,0);
		}
		public Tff_mapping_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_mapping_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_mapping_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_mapping_type(this);
		}
	}

	public final Tff_mapping_typeContext tff_mapping_type() throws RecognitionException {
		Tff_mapping_typeContext _localctx = new Tff_mapping_typeContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_tff_mapping_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			tff_unitary_type();
			setState(1187);
			arrow();
			setState(1188);
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
		public StarContext star() {
			return getRuleContext(StarContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_xprod_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_xprod_type(this);
		}
	}

	public final Tff_xprod_typeContext tff_xprod_type() throws RecognitionException {
		return tff_xprod_type(0);
	}

	private Tff_xprod_typeContext tff_xprod_type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tff_xprod_typeContext _localctx = new Tff_xprod_typeContext(_ctx, _parentState);
		Tff_xprod_typeContext _prevctx = _localctx;
		int _startState = 208;
		enterRecursionRule(_localctx, 208, RULE_tff_xprod_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1191);
			tff_unitary_type();
			setState(1192);
			star();
			setState(1193);
			tff_atomic_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(1201);
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
					setState(1195);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1196);
					star();
					setState(1197);
					tff_atomic_type();
					}
					} 
				}
				setState(1203);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTxf_tuple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTxf_tuple_type(this);
		}
	}

	public final Txf_tuple_typeContext txf_tuple_type() throws RecognitionException {
		Txf_tuple_typeContext _localctx = new Txf_tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_txf_tuple_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			match(T__13);
			setState(1205);
			tff_type_list();
			setState(1206);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_type_list(this);
		}
	}

	public final Tff_type_listContext tff_type_list() throws RecognitionException {
		Tff_type_listContext _localctx = new Tff_type_listContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_tff_type_list);
		try {
			setState(1213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208);
				tff_top_level_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1209);
				tff_top_level_type();
				setState(1210);
				match(T__1);
				setState(1211);
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
		public Untyped_atomContext untyped_atom() {
			return getRuleContext(Untyped_atomContext.class,0);
		}
		public Subtype_signContext subtype_sign() {
			return getRuleContext(Subtype_signContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Tff_subtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_subtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_subtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_subtype(this);
		}
	}

	public final Tff_subtypeContext tff_subtype() throws RecognitionException {
		Tff_subtypeContext _localctx = new Tff_subtypeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_tff_subtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			untyped_atom();
			setState(1216);
			subtype_sign();
			setState(1217);
			atom();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTxf_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTxf_definition(this);
		}
	}

	public final Txf_definitionContext txf_definition() throws RecognitionException {
		Txf_definitionContext _localctx = new Txf_definitionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_txf_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			tff_atomic_formula();
			setState(1220);
			identical();
			setState(1221);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTxf_sequent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTxf_sequent(this);
		}
	}

	public final Txf_sequentContext txf_sequent() throws RecognitionException {
		Txf_sequentContext _localctx = new Txf_sequentContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_txf_sequent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			txf_tuple();
			setState(1224);
			gentzen_arrow();
			setState(1225);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterNhf_long_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitNhf_long_connective(this);
		}
	}

	public final Nhf_long_connectiveContext nhf_long_connective() throws RecognitionException {
		Nhf_long_connectiveContext _localctx = new Nhf_long_connectiveContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_nhf_long_connective);
		try {
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1227);
				match(T__19);
				setState(1228);
				ntf_connective_name();
				setState(1229);
				match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1231);
				match(T__19);
				setState(1232);
				ntf_connective_name();
				setState(1233);
				match(T__11);
				setState(1234);
				nhf_parameter_list();
				setState(1235);
				match(T__21);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterNhf_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitNhf_parameter_list(this);
		}
	}

	public final Nhf_parameter_listContext nhf_parameter_list() throws RecognitionException {
		Nhf_parameter_listContext _localctx = new Nhf_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_nhf_parameter_list);
		try {
			setState(1244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1239);
				nhf_parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1240);
				nhf_parameter();
				setState(1241);
				match(T__1);
				setState(1242);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterNhf_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitNhf_parameter(this);
		}
	}

	public final Nhf_parameterContext nhf_parameter() throws RecognitionException {
		Nhf_parameterContext _localctx = new Nhf_parameterContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_nhf_parameter);
		try {
			setState(1248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__61:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246);
				ntf_index();
				}
				break;
			case T__11:
			case T__13:
			case T__16:
			case T__17:
			case T__19:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__64:
			case Lower_word:
			case Double_quote:
			case Non_zero_numeric:
			case Dollar:
				enterOuterAlt(_localctx, 2);
				{
				setState(1247);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterNhf_key_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitNhf_key_pair(this);
		}
	}

	public final Nhf_key_pairContext nhf_key_pair() throws RecognitionException {
		Nhf_key_pairContext _localctx = new Nhf_key_pairContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_nhf_key_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterNxf_long_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitNxf_long_connective(this);
		}
	}

	public final Nxf_long_connectiveContext nxf_long_connective() throws RecognitionException {
		Nxf_long_connectiveContext _localctx = new Nxf_long_connectiveContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_nxf_long_connective);
		try {
			setState(1262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1252);
				match(T__19);
				setState(1253);
				ntf_connective_name();
				setState(1254);
				match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1256);
				match(T__19);
				setState(1257);
				ntf_connective_name();
				setState(1258);
				match(T__11);
				setState(1259);
				nxf_parameter_list();
				setState(1260);
				match(T__21);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterNxf_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitNxf_parameter_list(this);
		}
	}

	public final Nxf_parameter_listContext nxf_parameter_list() throws RecognitionException {
		Nxf_parameter_listContext _localctx = new Nxf_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_nxf_parameter_list);
		try {
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				nxf_parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1265);
				nxf_parameter();
				setState(1266);
				match(T__1);
				setState(1267);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterNxf_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitNxf_parameter(this);
		}
	}

	public final Nxf_parameterContext nxf_parameter() throws RecognitionException {
		Nxf_parameterContext _localctx = new Nxf_parameterContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_nxf_parameter);
		try {
			setState(1273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__61:
				enterOuterAlt(_localctx, 1);
				{
				setState(1271);
				ntf_index();
				}
				break;
			case T__16:
			case T__19:
			case T__64:
			case Lower_word:
			case Dollar:
				enterOuterAlt(_localctx, 2);
				{
				setState(1272);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterNxf_key_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitNxf_key_pair(this);
		}
	}

	public final Nxf_key_pairContext nxf_key_pair() throws RecognitionException {
		Nxf_key_pairContext _localctx = new Nxf_key_pairContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_nxf_key_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
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
		public Def_or_sys_constantContext def_or_sys_constant() {
			return getRuleContext(Def_or_sys_constantContext.class,0);
		}
		public Ntf_connective_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ntf_connective_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterNtf_connective_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitNtf_connective_name(this);
		}
	}

	public final Ntf_connective_nameContext ntf_connective_name() throws RecognitionException {
		Ntf_connective_nameContext _localctx = new Ntf_connective_nameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_ntf_connective_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			def_or_sys_constant();
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
		public HashContext hash() {
			return getRuleContext(HashContext.class,0);
		}
		public Tff_unitary_termContext tff_unitary_term() {
			return getRuleContext(Tff_unitary_termContext.class,0);
		}
		public Ntf_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ntf_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterNtf_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitNtf_index(this);
		}
	}

	public final Ntf_indexContext ntf_index() throws RecognitionException {
		Ntf_indexContext _localctx = new Ntf_indexContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_ntf_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			hash();
			setState(1280);
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
		public Less_signContext less_sign() {
			return getRuleContext(Less_signContext.class,0);
		}
		public ArrowContext arrow() {
			return getRuleContext(ArrowContext.class,0);
		}
		public Ntf_short_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ntf_short_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterNtf_short_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitNtf_short_connective(this);
		}
	}

	public final Ntf_short_connectiveContext ntf_short_connective() throws RecognitionException {
		Ntf_short_connectiveContext _localctx = new Ntf_short_connectiveContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_ntf_short_connective);
		try {
			setState(1289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(1282);
				match(T__22);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				setState(1283);
				less_sign();
				setState(1284);
				match(T__23);
				setState(1285);
				arrow();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(1287);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(1288);
				match(T__25);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTcf_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTcf_formula(this);
		}
	}

	public final Tcf_formulaContext tcf_formula() throws RecognitionException {
		Tcf_formulaContext _localctx = new Tcf_formulaContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_tcf_formula);
		try {
			setState(1293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1291);
				tcf_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1292);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTcf_logic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTcf_logic_formula(this);
		}
	}

	public final Tcf_logic_formulaContext tcf_logic_formula() throws RecognitionException {
		Tcf_logic_formulaContext _localctx = new Tcf_logic_formulaContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_tcf_logic_formula);
		try {
			setState(1297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(1295);
				tcf_quantified_formula();
				}
				break;
			case T__11:
			case T__27:
			case T__64:
			case Lower_word:
			case Double_quote:
			case Non_zero_numeric:
			case Upper_alpha:
			case Dollar:
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTcf_quantified_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTcf_quantified_formula(this);
		}
	}

	public final Tcf_quantified_formulaContext tcf_quantified_formula() throws RecognitionException {
		Tcf_quantified_formulaContext _localctx = new Tcf_quantified_formulaContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_tcf_quantified_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			match(T__26);
			setState(1300);
			match(T__13);
			setState(1301);
			tff_variable_list();
			setState(1302);
			match(T__14);
			setState(1303);
			match(T__15);
			setState(1304);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_formula(this);
		}
	}

	public final Fof_formulaContext fof_formula() throws RecognitionException {
		Fof_formulaContext _localctx = new Fof_formulaContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_fof_formula);
		try {
			setState(1308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1306);
				fof_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1307);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_logic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_logic_formula(this);
		}
	}

	public final Fof_logic_formulaContext fof_logic_formula() throws RecognitionException {
		Fof_logic_formulaContext _localctx = new Fof_logic_formulaContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_fof_logic_formula);
		try {
			setState(1313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1310);
				fof_binary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1311);
				fof_unary_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1312);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_binary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_binary_formula(this);
		}
	}

	public final Fof_binary_formulaContext fof_binary_formula() throws RecognitionException {
		Fof_binary_formulaContext _localctx = new Fof_binary_formulaContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_fof_binary_formula);
		try {
			setState(1317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1315);
				fof_binary_nonassoc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1316);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_binary_nonassoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_binary_nonassoc(this);
		}
	}

	public final Fof_binary_nonassocContext fof_binary_nonassoc() throws RecognitionException {
		Fof_binary_nonassocContext _localctx = new Fof_binary_nonassocContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_fof_binary_nonassoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			fof_unit_formula();
			setState(1320);
			nonassoc_connective();
			setState(1321);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_binary_assoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_binary_assoc(this);
		}
	}

	public final Fof_binary_assocContext fof_binary_assoc() throws RecognitionException {
		Fof_binary_assocContext _localctx = new Fof_binary_assocContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_fof_binary_assoc);
		try {
			setState(1325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1323);
				fof_or_formula(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1324);
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
		public VlineContext vline() {
			return getRuleContext(VlineContext.class,0);
		}
		public Fof_or_formulaContext fof_or_formula() {
			return getRuleContext(Fof_or_formulaContext.class,0);
		}
		public Fof_or_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_or_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_or_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_or_formula(this);
		}
	}

	public final Fof_or_formulaContext fof_or_formula() throws RecognitionException {
		return fof_or_formula(0);
	}

	private Fof_or_formulaContext fof_or_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Fof_or_formulaContext _localctx = new Fof_or_formulaContext(_ctx, _parentState);
		Fof_or_formulaContext _prevctx = _localctx;
		int _startState = 258;
		enterRecursionRule(_localctx, 258, RULE_fof_or_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1328);
			fof_unit_formula();
			setState(1329);
			vline();
			setState(1330);
			fof_unit_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(1338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Fof_or_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fof_or_formula);
					setState(1332);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1333);
					vline();
					setState(1334);
					fof_unit_formula();
					}
					} 
				}
				setState(1340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_and_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_and_formula(this);
		}
	}

	public final Fof_and_formulaContext fof_and_formula() throws RecognitionException {
		return fof_and_formula(0);
	}

	private Fof_and_formulaContext fof_and_formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Fof_and_formulaContext _localctx = new Fof_and_formulaContext(_ctx, _parentState);
		Fof_and_formulaContext _prevctx = _localctx;
		int _startState = 260;
		enterRecursionRule(_localctx, 260, RULE_fof_and_formula, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1342);
			fof_unit_formula();
			setState(1343);
			match(T__9);
			setState(1344);
			fof_unit_formula();
			}
			_ctx.stop = _input.LT(-1);
			setState(1351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Fof_and_formulaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fof_and_formula);
					setState(1346);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1347);
					match(T__9);
					setState(1348);
					fof_unit_formula();
					}
					} 
				}
				setState(1353);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_unary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_unary_formula(this);
		}
	}

	public final Fof_unary_formulaContext fof_unary_formula() throws RecognitionException {
		Fof_unary_formulaContext _localctx = new Fof_unary_formulaContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_fof_unary_formula);
		try {
			setState(1358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(1354);
				unary_connective();
				setState(1355);
				fof_unit_formula();
				}
				break;
			case T__11:
			case T__64:
			case Lower_word:
			case Double_quote:
			case Non_zero_numeric:
			case Upper_alpha:
			case Dollar:
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_infix_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_infix_unary(this);
		}
	}

	public final Fof_infix_unaryContext fof_infix_unary() throws RecognitionException {
		Fof_infix_unaryContext _localctx = new Fof_infix_unaryContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_fof_infix_unary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			fof_term();
			setState(1361);
			infix_inequality();
			setState(1362);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_unit_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_unit_formula(this);
		}
	}

	public final Fof_unit_formulaContext fof_unit_formula() throws RecognitionException {
		Fof_unit_formulaContext _localctx = new Fof_unit_formulaContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_fof_unit_formula);
		try {
			setState(1366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1364);
				fof_unitary_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1365);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_unitary_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_unitary_formula(this);
		}
	}

	public final Fof_unitary_formulaContext fof_unitary_formula() throws RecognitionException {
		Fof_unitary_formulaContext _localctx = new Fof_unitary_formulaContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_fof_unitary_formula);
		try {
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1368);
				fof_quantified_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1369);
				fof_atomic_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1370);
				match(T__11);
				setState(1371);
				fof_logic_formula();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_quantified_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_quantified_formula(this);
		}
	}

	public final Fof_quantified_formulaContext fof_quantified_formula() throws RecognitionException {
		Fof_quantified_formulaContext _localctx = new Fof_quantified_formulaContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_fof_quantified_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			fof_quantifier();
			setState(1377);
			match(T__13);
			setState(1378);
			fof_variable_list();
			setState(1379);
			match(T__14);
			setState(1380);
			match(T__15);
			setState(1381);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_variable_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_variable_list(this);
		}
	}

	public final Fof_variable_listContext fof_variable_list() throws RecognitionException {
		Fof_variable_listContext _localctx = new Fof_variable_listContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_fof_variable_list);
		try {
			setState(1388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1383);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1384);
				variable();
				setState(1385);
				match(T__1);
				setState(1386);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_atomic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_atomic_formula(this);
		}
	}

	public final Fof_atomic_formulaContext fof_atomic_formula() throws RecognitionException {
		Fof_atomic_formulaContext _localctx = new Fof_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_fof_atomic_formula);
		try {
			setState(1393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1390);
				fof_plain_atomic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1391);
				fof_defined_atomic_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1392);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_plain_atomic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_plain_atomic_formula(this);
		}
	}

	public final Fof_plain_atomic_formulaContext fof_plain_atomic_formula() throws RecognitionException {
		Fof_plain_atomic_formulaContext _localctx = new Fof_plain_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_fof_plain_atomic_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_defined_atomic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_defined_atomic_formula(this);
		}
	}

	public final Fof_defined_atomic_formulaContext fof_defined_atomic_formula() throws RecognitionException {
		Fof_defined_atomic_formulaContext _localctx = new Fof_defined_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_fof_defined_atomic_formula);
		try {
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1397);
				fof_defined_plain_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1398);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_defined_plain_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_defined_plain_formula(this);
		}
	}

	public final Fof_defined_plain_formulaContext fof_defined_plain_formula() throws RecognitionException {
		Fof_defined_plain_formulaContext _localctx = new Fof_defined_plain_formulaContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_fof_defined_plain_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_defined_infix_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_defined_infix_formula(this);
		}
	}

	public final Fof_defined_infix_formulaContext fof_defined_infix_formula() throws RecognitionException {
		Fof_defined_infix_formulaContext _localctx = new Fof_defined_infix_formulaContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_fof_defined_infix_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			fof_term();
			setState(1404);
			defined_infix_pred();
			setState(1405);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_system_atomic_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_system_atomic_formula(this);
		}
	}

	public final Fof_system_atomic_formulaContext fof_system_atomic_formula() throws RecognitionException {
		Fof_system_atomic_formulaContext _localctx = new Fof_system_atomic_formulaContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_fof_system_atomic_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_plain_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_plain_term(this);
		}
	}

	public final Fof_plain_termContext fof_plain_term() throws RecognitionException {
		Fof_plain_termContext _localctx = new Fof_plain_termContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_fof_plain_term);
		try {
			setState(1415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1409);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1410);
				functor();
				setState(1411);
				match(T__11);
				setState(1412);
				fof_arguments();
				setState(1413);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_defined_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_defined_term(this);
		}
	}

	public final Fof_defined_termContext fof_defined_term() throws RecognitionException {
		Fof_defined_termContext _localctx = new Fof_defined_termContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_fof_defined_term);
		try {
			setState(1419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case Double_quote:
			case Non_zero_numeric:
				enterOuterAlt(_localctx, 1);
				{
				setState(1417);
				defined_term();
				}
				break;
			case Dollar:
				enterOuterAlt(_localctx, 2);
				{
				setState(1418);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_defined_atomic_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_defined_atomic_term(this);
		}
	}

	public final Fof_defined_atomic_termContext fof_defined_atomic_term() throws RecognitionException {
		Fof_defined_atomic_termContext _localctx = new Fof_defined_atomic_termContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_fof_defined_atomic_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_defined_plain_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_defined_plain_term(this);
		}
	}

	public final Fof_defined_plain_termContext fof_defined_plain_term() throws RecognitionException {
		Fof_defined_plain_termContext _localctx = new Fof_defined_plain_termContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_fof_defined_plain_term);
		try {
			setState(1429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1423);
				defined_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1424);
				defined_functor();
				setState(1425);
				match(T__11);
				setState(1426);
				fof_arguments();
				setState(1427);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_system_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_system_term(this);
		}
	}

	public final Fof_system_termContext fof_system_term() throws RecognitionException {
		Fof_system_termContext _localctx = new Fof_system_termContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_fof_system_term);
		try {
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1431);
				system_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1432);
				system_functor();
				setState(1433);
				match(T__11);
				setState(1434);
				fof_arguments();
				setState(1435);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_arguments(this);
		}
	}

	public final Fof_argumentsContext fof_arguments() throws RecognitionException {
		Fof_argumentsContext _localctx = new Fof_argumentsContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_fof_arguments);
		try {
			setState(1444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1439);
				fof_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1440);
				fof_term();
				setState(1441);
				match(T__1);
				setState(1442);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_term(this);
		}
	}

	public final Fof_termContext fof_term() throws RecognitionException {
		Fof_termContext _localctx = new Fof_termContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_fof_term);
		try {
			setState(1448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__64:
			case Lower_word:
			case Double_quote:
			case Non_zero_numeric:
			case Dollar:
				enterOuterAlt(_localctx, 1);
				{
				setState(1446);
				fof_function_term();
				}
				break;
			case Upper_alpha:
				enterOuterAlt(_localctx, 2);
				{
				setState(1447);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_function_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_function_term(this);
		}
	}

	public final Fof_function_termContext fof_function_term() throws RecognitionException {
		Fof_function_termContext _localctx = new Fof_function_termContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_fof_function_term);
		try {
			setState(1453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1450);
				fof_plain_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1451);
				fof_defined_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1452);
				fof_system_term();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_sequent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_sequent(this);
		}
	}

	public final Fof_sequentContext fof_sequent() throws RecognitionException {
		Fof_sequentContext _localctx = new Fof_sequentContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_fof_sequent);
		try {
			setState(1463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				fof_formula_tuple();
				setState(1456);
				gentzen_arrow();
				setState(1457);
				fof_formula_tuple();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(1459);
				match(T__11);
				setState(1460);
				fof_sequent();
				setState(1461);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_formula_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_formula_tuple(this);
		}
	}

	public final Fof_formula_tupleContext fof_formula_tuple() throws RecognitionException {
		Fof_formula_tupleContext _localctx = new Fof_formula_tupleContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_fof_formula_tuple);
		try {
			setState(1470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465);
				match(T__17);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(1466);
				match(T__13);
				setState(1467);
				fof_formula_tuple_list();
				setState(1468);
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
		public Fof_formula_tuple_listContext fof_formula_tuple_list() {
			return getRuleContext(Fof_formula_tuple_listContext.class,0);
		}
		public Fof_formula_tuple_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_formula_tuple_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_formula_tuple_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_formula_tuple_list(this);
		}
	}

	public final Fof_formula_tuple_listContext fof_formula_tuple_list() throws RecognitionException {
		Fof_formula_tuple_listContext _localctx = new Fof_formula_tuple_listContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_fof_formula_tuple_list);
		try {
			setState(1477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1472);
				fof_logic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
				fof_logic_formula();
				setState(1474);
				match(T__1);
				setState(1475);
				fof_formula_tuple_list();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterCnf_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitCnf_formula(this);
		}
	}

	public final Cnf_formulaContext cnf_formula() throws RecognitionException {
		Cnf_formulaContext _localctx = new Cnf_formulaContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_cnf_formula);
		try {
			setState(1484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1479);
				cnf_disjunction(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1480);
				match(T__11);
				setState(1481);
				cnf_formula();
				setState(1482);
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
	public static class Cnf_disjunctionContext extends ParserRuleContext {
		public Cnf_literalContext cnf_literal() {
			return getRuleContext(Cnf_literalContext.class,0);
		}
		public Cnf_disjunctionContext cnf_disjunction() {
			return getRuleContext(Cnf_disjunctionContext.class,0);
		}
		public VlineContext vline() {
			return getRuleContext(VlineContext.class,0);
		}
		public Cnf_disjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnf_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterCnf_disjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitCnf_disjunction(this);
		}
	}

	public final Cnf_disjunctionContext cnf_disjunction() throws RecognitionException {
		return cnf_disjunction(0);
	}

	private Cnf_disjunctionContext cnf_disjunction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Cnf_disjunctionContext _localctx = new Cnf_disjunctionContext(_ctx, _parentState);
		Cnf_disjunctionContext _prevctx = _localctx;
		int _startState = 310;
		enterRecursionRule(_localctx, 310, RULE_cnf_disjunction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1487);
			cnf_literal();
			}
			_ctx.stop = _input.LT(-1);
			setState(1495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Cnf_disjunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cnf_disjunction);
					setState(1489);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1490);
					vline();
					setState(1491);
					cnf_literal();
					}
					} 
				}
				setState(1497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterCnf_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitCnf_literal(this);
		}
	}

	public final Cnf_literalContext cnf_literal() throws RecognitionException {
		Cnf_literalContext _localctx = new Cnf_literalContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_cnf_literal);
		try {
			setState(1507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1498);
				fof_atomic_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				match(T__27);
				setState(1500);
				fof_atomic_formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1501);
				match(T__27);
				setState(1502);
				match(T__11);
				setState(1503);
				fof_atomic_formula();
				setState(1504);
				match(T__12);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1506);
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
		public Fof_quantifierContext fof_quantifier() {
			return getRuleContext(Fof_quantifierContext.class,0);
		}
		public Th0_quantifierContext th0_quantifier() {
			return getRuleContext(Th0_quantifierContext.class,0);
		}
		public Th1_quantifierContext th1_quantifier() {
			return getRuleContext(Th1_quantifierContext.class,0);
		}
		public Thf_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thf_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_quantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_quantifier(this);
		}
	}

	public final Thf_quantifierContext thf_quantifier() throws RecognitionException {
		Thf_quantifierContext _localctx = new Thf_quantifierContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_thf_quantifier);
		try {
			setState(1512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__33:
			case T__61:
				enterOuterAlt(_localctx, 1);
				{
				setState(1509);
				fof_quantifier();
				}
				break;
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(1510);
				th0_quantifier();
				}
				break;
			case T__18:
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(1511);
				th1_quantifier();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterThf_unary_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitThf_unary_connective(this);
		}
	}

	public final Thf_unary_connectiveContext thf_unary_connective() throws RecognitionException {
		Thf_unary_connectiveContext _localctx = new Thf_unary_connectiveContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_thf_unary_connective);
		try {
			setState(1516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(1514);
				unary_connective();
				}
				break;
			case T__22:
			case T__24:
			case T__25:
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				setState(1515);
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
	public static class Th1_quantifierContext extends ParserRuleContext {
		public Th1_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_th1_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTh1_quantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTh1_quantifier(this);
		}
	}

	public final Th1_quantifierContext th1_quantifier() throws RecognitionException {
		Th1_quantifierContext _localctx = new Th1_quantifierContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_th1_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__28) ) {
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
	public static class Th0_quantifierContext extends ParserRuleContext {
		public Th0_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_th0_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTh0_quantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTh0_quantifier(this);
		}
	}

	public final Th0_quantifierContext th0_quantifier() throws RecognitionException {
		Th0_quantifierContext _localctx = new Th0_quantifierContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_th0_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) ) {
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
	public static class Subtype_signContext extends ParserRuleContext {
		public Subtype_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtype_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterSubtype_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitSubtype_sign(this);
		}
	}

	public final Subtype_signContext subtype_sign() throws RecognitionException {
		Subtype_signContext _localctx = new Subtype_signContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_subtype_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_unary_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_unary_connective(this);
		}
	}

	public final Tff_unary_connectiveContext tff_unary_connective() throws RecognitionException {
		Tff_unary_connectiveContext _localctx = new Tff_unary_connectiveContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_tff_unary_connective);
		try {
			setState(1526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(1524);
				unary_connective();
				}
				break;
			case T__22:
			case T__24:
			case T__25:
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				setState(1525);
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
		public Tff_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tff_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTff_quantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTff_quantifier(this);
		}
	}

	public final Tff_quantifierContext tff_quantifier() throws RecognitionException {
		Tff_quantifierContext _localctx = new Tff_quantifierContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_tff_quantifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			fof_quantifier();
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
		public HashContext hash() {
			return getRuleContext(HashContext.class,0);
		}
		public Fof_quantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fof_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFof_quantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFof_quantifier(this);
		}
	}

	public final Fof_quantifierContext fof_quantifier() throws RecognitionException {
		Fof_quantifierContext _localctx = new Fof_quantifierContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_fof_quantifier);
		try {
			setState(1533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(1530);
				match(T__26);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(1531);
				match(T__33);
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 3);
				{
				setState(1532);
				hash();
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
	public static class Nonassoc_connectiveContext extends ParserRuleContext {
		public VlineContext vline() {
			return getRuleContext(VlineContext.class,0);
		}
		public Nonassoc_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonassoc_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterNonassoc_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitNonassoc_connective(this);
		}
	}

	public final Nonassoc_connectiveContext nonassoc_connective() throws RecognitionException {
		Nonassoc_connectiveContext _localctx = new Nonassoc_connectiveContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_nonassoc_connective);
		try {
			setState(1542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(1535);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(1536);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(1537);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 4);
				{
				setState(1538);
				match(T__37);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(1539);
				match(T__27);
				setState(1540);
				vline();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 6);
				{
				setState(1541);
				match(T__38);
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
		public VlineContext vline() {
			return getRuleContext(VlineContext.class,0);
		}
		public Assoc_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assoc_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterAssoc_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitAssoc_connective(this);
		}
	}

	public final Assoc_connectiveContext assoc_connective() throws RecognitionException {
		Assoc_connectiveContext _localctx = new Assoc_connectiveContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_assoc_connective);
		try {
			setState(1546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(1544);
				vline();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(1545);
				match(T__9);
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
	public static class Unary_connectiveContext extends ParserRuleContext {
		public Unary_connectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_connective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterUnary_connective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitUnary_connective(this);
		}
	}

	public final Unary_connectiveContext unary_connective() throws RecognitionException {
		Unary_connectiveContext _localctx = new Unary_connectiveContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_unary_connective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			match(T__27);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterGentzen_arrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitGentzen_arrow(this);
		}
	}

	public final Gentzen_arrowContext gentzen_arrow() throws RecognitionException {
		Gentzen_arrowContext _localctx = new Gentzen_arrowContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_gentzen_arrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
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
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
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
	public static class IdenticalContext extends ParserRuleContext {
		public IdenticalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterIdentical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitIdentical(this);
		}
	}

	public final IdenticalContext identical() throws RecognitionException {
		IdenticalContext _localctx = new IdenticalContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_identical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
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
	public static class Type_constantContext extends ParserRuleContext {
		public Type_functorContext type_functor() {
			return getRuleContext(Type_functorContext.class,0);
		}
		public Type_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterType_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitType_constant(this);
		}
	}

	public final Type_constantContext type_constant() throws RecognitionException {
		Type_constantContext _localctx = new Type_constantContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_type_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterType_functor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitType_functor(this);
		}
	}

	public final Type_functorContext type_functor() throws RecognitionException {
		Type_functorContext _localctx = new Type_functorContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_type_functor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterDefined_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitDefined_type(this);
		}
	}

	public final Defined_typeContext defined_type() throws RecognitionException {
		Defined_typeContext _localctx = new Defined_typeContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_defined_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
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
	public static class AtomContext extends ParserRuleContext {
		public Untyped_atomContext untyped_atom() {
			return getRuleContext(Untyped_atomContext.class,0);
		}
		public Defined_constantContext defined_constant() {
			return getRuleContext(Defined_constantContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_atom);
		try {
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1562);
				untyped_atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563);
				defined_constant();
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
	public static class Untyped_atomContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public System_constantContext system_constant() {
			return getRuleContext(System_constantContext.class,0);
		}
		public Untyped_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untyped_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterUntyped_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitUntyped_atom(this);
		}
	}

	public final Untyped_atomContext untyped_atom() throws RecognitionException {
		Untyped_atomContext _localctx = new Untyped_atomContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_untyped_atom);
		try {
			setState(1568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__64:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(1566);
				constant();
				}
				break;
			case Dollar:
				enterOuterAlt(_localctx, 2);
				{
				setState(1567);
				system_constant();
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
	public static class Defined_infix_predContext extends ParserRuleContext {
		public Infix_equalityContext infix_equality() {
			return getRuleContext(Infix_equalityContext.class,0);
		}
		public Defined_infix_predContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_infix_pred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterDefined_infix_pred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitDefined_infix_pred(this);
		}
	}

	public final Defined_infix_predContext defined_infix_pred() throws RecognitionException {
		Defined_infix_predContext _localctx = new Defined_infix_predContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_defined_infix_pred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterInfix_equality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitInfix_equality(this);
		}
	}

	public final Infix_equalityContext infix_equality() throws RecognitionException {
		Infix_equalityContext _localctx = new Infix_equalityContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_infix_equality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
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
	public static class Infix_inequalityContext extends ParserRuleContext {
		public Infix_inequalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_inequality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterInfix_inequality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitInfix_inequality(this);
		}
	}

	public final Infix_inequalityContext infix_inequality() throws RecognitionException {
		Infix_inequalityContext _localctx = new Infix_inequalityContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_infix_inequality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			match(T__43);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFunctor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFunctor(this);
		}
	}

	public final FunctorContext functor() throws RecognitionException {
		FunctorContext _localctx = new FunctorContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_functor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterDefined_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitDefined_constant(this);
		}
	}

	public final Defined_constantContext defined_constant() throws RecognitionException {
		Defined_constantContext _localctx = new Defined_constantContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_defined_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterDefined_functor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitDefined_functor(this);
		}
	}

	public final Defined_functorContext defined_functor() throws RecognitionException {
		Defined_functorContext _localctx = new Defined_functorContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_defined_functor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterSystem_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitSystem_constant(this);
		}
	}

	public final System_constantContext system_constant() throws RecognitionException {
		System_constantContext _localctx = new System_constantContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_system_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterSystem_functor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitSystem_functor(this);
		}
	}

	public final System_functorContext system_functor() throws RecognitionException {
		System_functorContext _localctx = new System_functorContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_system_functor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
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
	public static class Def_or_sys_constantContext extends ParserRuleContext {
		public Defined_constantContext defined_constant() {
			return getRuleContext(Defined_constantContext.class,0);
		}
		public System_constantContext system_constant() {
			return getRuleContext(System_constantContext.class,0);
		}
		public Def_or_sys_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_or_sys_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterDef_or_sys_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitDef_or_sys_constant(this);
		}
	}

	public final Def_or_sys_constantContext def_or_sys_constant() throws RecognitionException {
		Def_or_sys_constantContext _localctx = new Def_or_sys_constantContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_def_or_sys_constant);
		try {
			setState(1590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1588);
				defined_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1589);
				system_constant();
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
	public static class Th1_defined_termContext extends ParserRuleContext {
		public Th1_defined_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_th1_defined_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterTh1_defined_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitTh1_defined_term(this);
		}
	}

	public final Th1_defined_termContext th1_defined_term() throws RecognitionException {
		Th1_defined_termContext _localctx = new Th1_defined_termContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_th1_defined_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090715534753792L) != 0)) ) {
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
		public Distinct_objectContext distinct_object() {
			return getRuleContext(Distinct_objectContext.class,0);
		}
		public Defined_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterDefined_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitDefined_term(this);
		}
	}

	public final Defined_termContext defined_term() throws RecognitionException {
		Defined_termContext _localctx = new Defined_termContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_defined_term);
		try {
			setState(1596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case Non_zero_numeric:
				enterOuterAlt(_localctx, 1);
				{
				setState(1594);
				number();
				}
				break;
			case Double_quote:
				enterOuterAlt(_localctx, 2);
				{
				setState(1595);
				distinct_object();
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
		public Upper_wordContext upper_word() {
			return getRuleContext(Upper_wordContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			upper_word();
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
		public General_termContext general_term() {
			return getRuleContext(General_termContext.class,0);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitSource(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
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
	public static class Optional_infoContext extends ParserRuleContext {
		public Useful_infoContext useful_info() {
			return getRuleContext(Useful_infoContext.class,0);
		}
		public NullContext null_() {
			return getRuleContext(NullContext.class,0);
		}
		public Optional_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterOptional_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitOptional_info(this);
		}
	}

	public final Optional_infoContext optional_info() throws RecognitionException {
		Optional_infoContext _localctx = new Optional_infoContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_optional_info);
		try {
			setState(1605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1602);
				match(T__1);
				setState(1603);
				useful_info();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1604);
				null_();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterUseful_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitUseful_info(this);
		}
	}

	public final Useful_infoContext useful_info() throws RecognitionException {
		Useful_infoContext _localctx = new Useful_infoContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_useful_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			match(T__49);
			setState(1610);
			file_name();
			setState(1611);
			include_optionals();
			setState(1612);
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
		public NullContext null_() {
			return getRuleContext(NullContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterInclude_optionals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitInclude_optionals(this);
		}
	}

	public final Include_optionalsContext include_optionals() throws RecognitionException {
		Include_optionalsContext _localctx = new Include_optionalsContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_include_optionals);
		try {
			setState(1622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1614);
				null_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1615);
				match(T__1);
				setState(1616);
				formula_selection();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1617);
				match(T__1);
				setState(1618);
				formula_selection();
				setState(1619);
				match(T__1);
				setState(1620);
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
		public StarContext star() {
			return getRuleContext(StarContext.class,0);
		}
		public Formula_selectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFormula_selection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFormula_selection(this);
		}
	}

	public final Formula_selectionContext formula_selection() throws RecognitionException {
		Formula_selectionContext _localctx = new Formula_selectionContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_formula_selection);
		try {
			setState(1629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(1624);
				match(T__13);
				setState(1625);
				name_list();
				setState(1626);
				match(T__14);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 2);
				{
				setState(1628);
				star();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterName_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitName_list(this);
		}
	}

	public final Name_listContext name_list() throws RecognitionException {
		Name_listContext _localctx = new Name_listContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_name_list);
		try {
			setState(1636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1631);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1632);
				name();
				setState(1633);
				match(T__1);
				setState(1634);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterSpace_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitSpace_name(this);
		}
	}

	public final Space_nameContext space_name() throws RecognitionException {
		Space_nameContext _localctx = new Space_nameContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_space_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterGeneral_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitGeneral_term(this);
		}
	}

	public final General_termContext general_term() throws RecognitionException {
		General_termContext _localctx = new General_termContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_general_term);
		try {
			setState(1646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1640);
				general_data();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1641);
				general_data();
				setState(1642);
				match(T__15);
				setState(1643);
				general_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1645);
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
		public Distinct_objectContext distinct_object() {
			return getRuleContext(Distinct_objectContext.class,0);
		}
		public Formula_dataContext formula_data() {
			return getRuleContext(Formula_dataContext.class,0);
		}
		public General_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterGeneral_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitGeneral_data(this);
		}
	}

	public final General_dataContext general_data() throws RecognitionException {
		General_dataContext _localctx = new General_dataContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_general_data);
		try {
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1648);
				atomic_word();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1649);
				general_function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1650);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1651);
				number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1652);
				distinct_object();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1653);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterGeneral_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitGeneral_function(this);
		}
	}

	public final General_functionContext general_function() throws RecognitionException {
		General_functionContext _localctx = new General_functionContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_general_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			atomic_word();
			setState(1657);
			match(T__11);
			setState(1658);
			general_terms();
			setState(1659);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFormula_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFormula_data(this);
		}
	}

	public final Formula_dataContext formula_data() throws RecognitionException {
		Formula_dataContext _localctx = new Formula_dataContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_formula_data);
		try {
			setState(1681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(1661);
				match(T__50);
				setState(1662);
				thf_formula();
				setState(1663);
				match(T__12);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
				setState(1665);
				match(T__51);
				setState(1666);
				tff_formula();
				setState(1667);
				match(T__12);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 3);
				{
				setState(1669);
				match(T__52);
				setState(1670);
				fof_formula();
				setState(1671);
				match(T__12);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 4);
				{
				setState(1673);
				match(T__53);
				setState(1674);
				cnf_formula();
				setState(1675);
				match(T__12);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 5);
				{
				setState(1677);
				match(T__54);
				setState(1678);
				fof_term();
				setState(1679);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterGeneral_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitGeneral_list(this);
		}
	}

	public final General_listContext general_list() throws RecognitionException {
		General_listContext _localctx = new General_listContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_general_list);
		try {
			setState(1688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(1683);
				match(T__17);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(1684);
				match(T__13);
				setState(1685);
				general_terms();
				setState(1686);
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
		public General_termsContext general_terms() {
			return getRuleContext(General_termsContext.class,0);
		}
		public General_termsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterGeneral_terms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitGeneral_terms(this);
		}
	}

	public final General_termsContext general_terms() throws RecognitionException {
		General_termsContext _localctx = new General_termsContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_general_terms);
		try {
			setState(1695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1690);
				general_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1691);
				general_term();
				setState(1692);
				match(T__1);
				setState(1693);
				general_terms();
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
	public static class NameContext extends ParserRuleContext {
		public Atomic_wordContext atomic_word() {
			return getRuleContext(Atomic_wordContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_name);
		try {
			setState(1699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__64:
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(1697);
				atomic_word();
				}
				break;
			case T__11:
			case Non_zero_numeric:
				enterOuterAlt(_localctx, 2);
				{
				setState(1698);
				integer();
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
		public TerminalNode Lower_word() { return getToken(TPTPv9Parser.Lower_word, 0); }
		public Single_quotedContext single_quoted() {
			return getRuleContext(Single_quotedContext.class,0);
		}
		public Atomic_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterAtomic_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitAtomic_word(this);
		}
	}

	public final Atomic_wordContext atomic_word() throws RecognitionException {
		Atomic_wordContext _localctx = new Atomic_wordContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_atomic_word);
		try {
			setState(1703);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Lower_word:
				enterOuterAlt(_localctx, 1);
				{
				setState(1701);
				match(Lower_word);
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 2);
				{
				setState(1702);
				single_quoted();
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
	public static class Atomic_defined_wordContext extends ParserRuleContext {
		public Dollar_wordContext dollar_word() {
			return getRuleContext(Dollar_wordContext.class,0);
		}
		public Atomic_defined_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_defined_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterAtomic_defined_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitAtomic_defined_word(this);
		}
	}

	public final Atomic_defined_wordContext atomic_defined_word() throws RecognitionException {
		Atomic_defined_wordContext _localctx = new Atomic_defined_wordContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_atomic_defined_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1705);
			dollar_word();
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
		public Dollar_dollar_wordContext dollar_dollar_word() {
			return getRuleContext(Dollar_dollar_wordContext.class,0);
		}
		public Atomic_system_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_system_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterAtomic_system_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitAtomic_system_word(this);
		}
	}

	public final Atomic_system_wordContext atomic_system_word() throws RecognitionException {
		Atomic_system_wordContext _localctx = new Atomic_system_wordContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_atomic_system_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			dollar_dollar_word();
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public RationalContext rational() {
			return getRuleContext(RationalContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_number);
		try {
			setState(1712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1709);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1710);
				rational();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1711);
				real();
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
	public static class File_nameContext extends ParserRuleContext {
		public Single_quotedContext single_quoted() {
			return getRuleContext(Single_quotedContext.class,0);
		}
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterFile_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitFile_name(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			single_quoted();
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
	public static class NullContext extends ParserRuleContext {
		public NullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitNull(this);
		}
	}

	public final NullContext null_() throws RecognitionException {
		NullContext _localctx = new NullContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_null);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public Comment_lineContext comment_line() {
			return getRuleContext(Comment_lineContext.class,0);
		}
		public TerminalNode Comment_block() { return getToken(TPTPv9Parser.Comment_block, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_comment);
		try {
			setState(1720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				enterOuterAlt(_localctx, 1);
				{
				setState(1718);
				comment_line();
				}
				break;
			case Comment_block:
				enterOuterAlt(_localctx, 2);
				{
				setState(1719);
				match(Comment_block);
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
	public static class Comment_lineContext extends ParserRuleContext {
		public Comment_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterComment_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitComment_line(this);
		}
	}

	public final Comment_lineContext comment_line() throws RecognitionException {
		Comment_lineContext _localctx = new Comment_lineContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_comment_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			match(T__55);
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
	public static class Single_quotedContext extends ParserRuleContext {
		public List<Single_quoteContext> single_quote() {
			return getRuleContexts(Single_quoteContext.class);
		}
		public Single_quoteContext single_quote(int i) {
			return getRuleContext(Single_quoteContext.class,i);
		}
		public List<Sq_charContext> sq_char() {
			return getRuleContexts(Sq_charContext.class);
		}
		public Sq_charContext sq_char(int i) {
			return getRuleContext(Sq_charContext.class,i);
		}
		public Single_quotedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_quoted; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterSingle_quoted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitSingle_quoted(this);
		}
	}

	public final Single_quotedContext single_quoted() throws RecognitionException {
		Single_quotedContext _localctx = new Single_quotedContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_single_quoted);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			single_quote();
			setState(1725);
			sq_char();
			setState(1726);
			sq_char();
			setState(1727);
			match(T__56);
			setState(1728);
			single_quote();
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
	public static class Distinct_objectContext extends ParserRuleContext {
		public List<TerminalNode> Double_quote() { return getTokens(TPTPv9Parser.Double_quote); }
		public TerminalNode Double_quote(int i) {
			return getToken(TPTPv9Parser.Double_quote, i);
		}
		public Do_charContext do_char() {
			return getRuleContext(Do_charContext.class,0);
		}
		public Distinct_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterDistinct_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitDistinct_object(this);
		}
	}

	public final Distinct_objectContext distinct_object() throws RecognitionException {
		Distinct_objectContext _localctx = new Distinct_objectContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_distinct_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			match(Double_quote);
			setState(1731);
			do_char();
			setState(1732);
			match(T__56);
			setState(1733);
			match(Double_quote);
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
	public static class Dollar_wordContext extends ParserRuleContext {
		public TerminalNode Dollar() { return getToken(TPTPv9Parser.Dollar, 0); }
		public TerminalNode Alpha_numeric() { return getToken(TPTPv9Parser.Alpha_numeric, 0); }
		public Dollar_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dollar_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterDollar_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitDollar_word(this);
		}
	}

	public final Dollar_wordContext dollar_word() throws RecognitionException {
		Dollar_wordContext _localctx = new Dollar_wordContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_dollar_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735);
			match(Dollar);
			setState(1736);
			match(Alpha_numeric);
			setState(1737);
			match(T__56);
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
	public static class Dollar_dollar_wordContext extends ParserRuleContext {
		public List<TerminalNode> Dollar() { return getTokens(TPTPv9Parser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(TPTPv9Parser.Dollar, i);
		}
		public TerminalNode Alpha_numeric() { return getToken(TPTPv9Parser.Alpha_numeric, 0); }
		public Dollar_dollar_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dollar_dollar_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterDollar_dollar_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitDollar_dollar_word(this);
		}
	}

	public final Dollar_dollar_wordContext dollar_dollar_word() throws RecognitionException {
		Dollar_dollar_wordContext _localctx = new Dollar_dollar_wordContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_dollar_dollar_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1739);
			match(Dollar);
			setState(1740);
			match(Dollar);
			setState(1741);
			match(Alpha_numeric);
			setState(1742);
			match(T__56);
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
	public static class Upper_wordContext extends ParserRuleContext {
		public TerminalNode Upper_alpha() { return getToken(TPTPv9Parser.Upper_alpha, 0); }
		public TerminalNode Alpha_numeric() { return getToken(TPTPv9Parser.Alpha_numeric, 0); }
		public Upper_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upper_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterUpper_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitUpper_word(this);
		}
	}

	public final Upper_wordContext upper_word() throws RecognitionException {
		Upper_wordContext _localctx = new Upper_wordContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_upper_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			match(Upper_alpha);
			setState(1745);
			match(Alpha_numeric);
			setState(1746);
			match(T__56);
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
	public static class VlineContext extends ParserRuleContext {
		public VlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterVline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitVline(this);
		}
	}

	public final VlineContext vline() throws RecognitionException {
		VlineContext _localctx = new VlineContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_vline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			match(T__57);
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
	public static class StarContext extends ParserRuleContext {
		public StarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitStar(this);
		}
	}

	public final StarContext star() throws RecognitionException {
		StarContext _localctx = new StarContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_star);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			match(T__56);
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
	public static class PlusContext extends ParserRuleContext {
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitPlus(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			match(T__58);
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
	public static class ArrowContext extends ParserRuleContext {
		public ArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitArrow(this);
		}
	}

	public final ArrowContext arrow() throws RecognitionException {
		ArrowContext _localctx = new ArrowContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_arrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			match(T__59);
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
	public static class Less_signContext extends ParserRuleContext {
		public Less_signContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterLess_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitLess_sign(this);
		}
	}

	public final Less_signContext less_sign() throws RecognitionException {
		Less_signContext _localctx = new Less_signContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_less_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
			match(T__60);
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
	public static class HashContext extends ParserRuleContext {
		public HashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitHash(this);
		}
	}

	public final HashContext hash() throws RecognitionException {
		HashContext _localctx = new HashContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			match(T__61);
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
	public static class RealContext extends ParserRuleContext {
		public Signed_realContext signed_real() {
			return getRuleContext(Signed_realContext.class,0);
		}
		public Unsigned_realContext unsigned_real() {
			return getRuleContext(Unsigned_realContext.class,0);
		}
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitReal(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_real);
		try {
			setState(1765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1760);
				match(T__11);
				setState(1761);
				signed_real();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1762);
				unsigned_real();
				setState(1763);
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
	public static class Signed_realContext extends ParserRuleContext {
		public TerminalNode Sign() { return getToken(TPTPv9Parser.Sign, 0); }
		public Unsigned_realContext unsigned_real() {
			return getRuleContext(Unsigned_realContext.class,0);
		}
		public Signed_realContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterSigned_real(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitSigned_real(this);
		}
	}

	public final Signed_realContext signed_real() throws RecognitionException {
		Signed_realContext _localctx = new Signed_realContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_signed_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
			match(Sign);
			setState(1768);
			unsigned_real();
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
	public static class Unsigned_realContext extends ParserRuleContext {
		public Decimal_fractionContext decimal_fraction() {
			return getRuleContext(Decimal_fractionContext.class,0);
		}
		public Decimal_exponentContext decimal_exponent() {
			return getRuleContext(Decimal_exponentContext.class,0);
		}
		public Unsigned_realContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterUnsigned_real(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitUnsigned_real(this);
		}
	}

	public final Unsigned_realContext unsigned_real() throws RecognitionException {
		Unsigned_realContext _localctx = new Unsigned_realContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_unsigned_real);
		try {
			setState(1775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1770);
				match(T__11);
				setState(1771);
				decimal_fraction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1772);
				decimal_exponent();
				setState(1773);
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
	public static class RationalContext extends ParserRuleContext {
		public Signed_rationalContext signed_rational() {
			return getRuleContext(Signed_rationalContext.class,0);
		}
		public Unsigned_rationalContext unsigned_rational() {
			return getRuleContext(Unsigned_rationalContext.class,0);
		}
		public RationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rational; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterRational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitRational(this);
		}
	}

	public final RationalContext rational() throws RecognitionException {
		RationalContext _localctx = new RationalContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_rational);
		try {
			setState(1782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1777);
				match(T__11);
				setState(1778);
				signed_rational();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1779);
				unsigned_rational();
				setState(1780);
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
	public static class Signed_rationalContext extends ParserRuleContext {
		public TerminalNode Sign() { return getToken(TPTPv9Parser.Sign, 0); }
		public Unsigned_rationalContext unsigned_rational() {
			return getRuleContext(Unsigned_rationalContext.class,0);
		}
		public Signed_rationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_rational; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterSigned_rational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitSigned_rational(this);
		}
	}

	public final Signed_rationalContext signed_rational() throws RecognitionException {
		Signed_rationalContext _localctx = new Signed_rationalContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_signed_rational);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			match(Sign);
			setState(1785);
			unsigned_rational();
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
	public static class Unsigned_rationalContext extends ParserRuleContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public SlashContext slash() {
			return getRuleContext(SlashContext.class,0);
		}
		public Positive_decimalContext positive_decimal() {
			return getRuleContext(Positive_decimalContext.class,0);
		}
		public Unsigned_rationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_rational; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterUnsigned_rational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitUnsigned_rational(this);
		}
	}

	public final Unsigned_rationalContext unsigned_rational() throws RecognitionException {
		Unsigned_rationalContext _localctx = new Unsigned_rationalContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_unsigned_rational);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			decimal();
			setState(1788);
			slash();
			setState(1789);
			positive_decimal();
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
	public static class IntegerContext extends ParserRuleContext {
		public Signed_integerContext signed_integer() {
			return getRuleContext(Signed_integerContext.class,0);
		}
		public Unsigned_integerContext unsigned_integer() {
			return getRuleContext(Unsigned_integerContext.class,0);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_integer);
		try {
			setState(1796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1791);
				match(T__11);
				setState(1792);
				signed_integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1793);
				unsigned_integer();
				setState(1794);
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
	public static class Signed_integerContext extends ParserRuleContext {
		public TerminalNode Sign() { return getToken(TPTPv9Parser.Sign, 0); }
		public Unsigned_integerContext unsigned_integer() {
			return getRuleContext(Unsigned_integerContext.class,0);
		}
		public Signed_integerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterSigned_integer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitSigned_integer(this);
		}
	}

	public final Signed_integerContext signed_integer() throws RecognitionException {
		Signed_integerContext _localctx = new Signed_integerContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_signed_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			match(Sign);
			setState(1799);
			unsigned_integer();
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
	public static class Unsigned_integerContext extends ParserRuleContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public Unsigned_integerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterUnsigned_integer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitUnsigned_integer(this);
		}
	}

	public final Unsigned_integerContext unsigned_integer() throws RecognitionException {
		Unsigned_integerContext _localctx = new Unsigned_integerContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_unsigned_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801);
			decimal();
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
	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode Zero_numeric() { return getToken(TPTPv9Parser.Zero_numeric, 0); }
		public Positive_decimalContext positive_decimal() {
			return getRuleContext(Positive_decimalContext.class,0);
		}
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitDecimal(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_decimal);
		try {
			setState(1808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(1803);
				match(T__11);
				setState(1804);
				match(Zero_numeric);
				}
				break;
			case Non_zero_numeric:
				enterOuterAlt(_localctx, 2);
				{
				setState(1805);
				positive_decimal();
				setState(1806);
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
	public static class Positive_decimalContext extends ParserRuleContext {
		public TerminalNode Non_zero_numeric() { return getToken(TPTPv9Parser.Non_zero_numeric, 0); }
		public TerminalNode Numeric() { return getToken(TPTPv9Parser.Numeric, 0); }
		public Positive_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positive_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterPositive_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitPositive_decimal(this);
		}
	}

	public final Positive_decimalContext positive_decimal() throws RecognitionException {
		Positive_decimalContext _localctx = new Positive_decimalContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_positive_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			match(Non_zero_numeric);
			setState(1811);
			match(Numeric);
			setState(1812);
			match(T__56);
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
	public static class Decimal_exponentContext extends ParserRuleContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public Decimal_fractionContext decimal_fraction() {
			return getRuleContext(Decimal_fractionContext.class,0);
		}
		public TerminalNode Exponent() { return getToken(TPTPv9Parser.Exponent, 0); }
		public Exp_integerContext exp_integer() {
			return getRuleContext(Exp_integerContext.class,0);
		}
		public Decimal_exponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_exponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterDecimal_exponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitDecimal_exponent(this);
		}
	}

	public final Decimal_exponentContext decimal_exponent() throws RecognitionException {
		Decimal_exponentContext _localctx = new Decimal_exponentContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_decimal_exponent);
		try {
			setState(1821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1814);
				match(T__11);
				setState(1815);
				decimal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1816);
				decimal_fraction();
				setState(1817);
				match(T__12);
				setState(1818);
				match(Exponent);
				setState(1819);
				exp_integer();
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
	public static class Decimal_fractionContext extends ParserRuleContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public Dot_decimalContext dot_decimal() {
			return getRuleContext(Dot_decimalContext.class,0);
		}
		public Decimal_fractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_fraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterDecimal_fraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitDecimal_fraction(this);
		}
	}

	public final Decimal_fractionContext decimal_fraction() throws RecognitionException {
		Decimal_fractionContext _localctx = new Decimal_fractionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_decimal_fraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			decimal();
			setState(1824);
			dot_decimal();
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
	public static class Dot_decimalContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(TPTPv9Parser.Dot, 0); }
		public List<TerminalNode> Numeric() { return getTokens(TPTPv9Parser.Numeric); }
		public TerminalNode Numeric(int i) {
			return getToken(TPTPv9Parser.Numeric, i);
		}
		public Dot_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterDot_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitDot_decimal(this);
		}
	}

	public final Dot_decimalContext dot_decimal() throws RecognitionException {
		Dot_decimalContext _localctx = new Dot_decimalContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_dot_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			match(Dot);
			setState(1827);
			match(Numeric);
			setState(1828);
			match(Numeric);
			setState(1829);
			match(T__56);
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
	public static class Exp_integerContext extends ParserRuleContext {
		public Signed_exp_integerContext signed_exp_integer() {
			return getRuleContext(Signed_exp_integerContext.class,0);
		}
		public Unsigned_exp_integerContext unsigned_exp_integer() {
			return getRuleContext(Unsigned_exp_integerContext.class,0);
		}
		public Exp_integerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterExp_integer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitExp_integer(this);
		}
	}

	public final Exp_integerContext exp_integer() throws RecognitionException {
		Exp_integerContext _localctx = new Exp_integerContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_exp_integer);
		try {
			setState(1836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(1831);
				match(T__11);
				setState(1832);
				signed_exp_integer();
				}
				break;
			case Numeric:
				enterOuterAlt(_localctx, 2);
				{
				setState(1833);
				unsigned_exp_integer();
				setState(1834);
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
	public static class Signed_exp_integerContext extends ParserRuleContext {
		public TerminalNode Sign() { return getToken(TPTPv9Parser.Sign, 0); }
		public Unsigned_exp_integerContext unsigned_exp_integer() {
			return getRuleContext(Unsigned_exp_integerContext.class,0);
		}
		public Signed_exp_integerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_exp_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterSigned_exp_integer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitSigned_exp_integer(this);
		}
	}

	public final Signed_exp_integerContext signed_exp_integer() throws RecognitionException {
		Signed_exp_integerContext _localctx = new Signed_exp_integerContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_signed_exp_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			match(Sign);
			setState(1839);
			unsigned_exp_integer();
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
	public static class Unsigned_exp_integerContext extends ParserRuleContext {
		public List<TerminalNode> Numeric() { return getTokens(TPTPv9Parser.Numeric); }
		public TerminalNode Numeric(int i) {
			return getToken(TPTPv9Parser.Numeric, i);
		}
		public Unsigned_exp_integerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_exp_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterUnsigned_exp_integer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitUnsigned_exp_integer(this);
		}
	}

	public final Unsigned_exp_integerContext unsigned_exp_integer() throws RecognitionException {
		Unsigned_exp_integerContext _localctx = new Unsigned_exp_integerContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_unsigned_exp_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1841);
			match(Numeric);
			setState(1842);
			match(Numeric);
			setState(1843);
			match(T__56);
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
	public static class SlashContext extends ParserRuleContext {
		public TerminalNode Slash_char() { return getToken(TPTPv9Parser.Slash_char, 0); }
		public SlashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitSlash(this);
		}
	}

	public final SlashContext slash() throws RecognitionException {
		SlashContext _localctx = new SlashContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_slash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			match(Slash_char);
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
	public static class SloshContext extends ParserRuleContext {
		public Slosh_charContext slosh_char() {
			return getRuleContext(Slosh_charContext.class,0);
		}
		public SloshContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slosh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterSlosh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitSlosh(this);
		}
	}

	public final SloshContext slosh() throws RecognitionException {
		SloshContext _localctx = new SloshContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_slosh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			slosh_char();
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
	public static class Do_charContext extends ParserRuleContext {
		public Do_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterDo_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitDo_char(this);
		}
	}

	public final Do_charContext do_char() throws RecognitionException {
		Do_charContext _localctx = new Do_charContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_do_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1849);
			match(T__62);
			setState(1850);
			_la = _input.LA(1);
			if ( !(_la==T__62 || _la==T__63) ) {
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
	public static class Single_quoteContext extends ParserRuleContext {
		public Single_quoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterSingle_quote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitSingle_quote(this);
		}
	}

	public final Single_quoteContext single_quote() throws RecognitionException {
		Single_quoteContext _localctx = new Single_quoteContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_single_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			match(T__64);
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
	public static class Sq_charContext extends ParserRuleContext {
		public Sq_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sq_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterSq_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitSq_char(this);
		}
	}

	public final Sq_charContext sq_char() throws RecognitionException {
		Sq_charContext _localctx = new Sq_charContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_sq_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			match(T__62);
			setState(1855);
			_la = _input.LA(1);
			if ( !(_la==T__62 || _la==T__64) ) {
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
	public static class Slosh_charContext extends ParserRuleContext {
		public Slosh_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slosh_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterSlosh_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitSlosh_char(this);
		}
	}

	public final Slosh_charContext slosh_char() throws RecognitionException {
		Slosh_charContext _localctx = new Slosh_charContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_slosh_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
			match(T__65);
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
	public static class Viewable_charContext extends ParserRuleContext {
		public Viewable_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewable_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).enterViewable_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPTPv9Listener ) ((TPTPv9Listener)listener).exitViewable_char(this);
		}
	}

	public final Viewable_charContext viewable_char() throws RecognitionException {
		Viewable_charContext _localctx = new Viewable_charContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_viewable_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			match(T__66);
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
		case 54:
			return thf_xprod_type_sempred((Thf_xprod_typeContext)_localctx, predIndex);
		case 55:
			return thf_union_type_sempred((Thf_union_typeContext)_localctx, predIndex);
		case 64:
			return tff_or_formula_sempred((Tff_or_formulaContext)_localctx, predIndex);
		case 65:
			return tff_and_formula_sempred((Tff_and_formulaContext)_localctx, predIndex);
		case 104:
			return tff_xprod_type_sempred((Tff_xprod_typeContext)_localctx, predIndex);
		case 129:
			return fof_or_formula_sempred((Fof_or_formulaContext)_localctx, predIndex);
		case 130:
			return fof_and_formula_sempred((Fof_and_formulaContext)_localctx, predIndex);
		case 155:
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
		"\u0004\u0001U\u0746\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0002\u00e4\u0007\u00e4\u0002\u00e5\u0007\u00e5\u0002\u00e6\u0007\u00e6"+
		"\u0002\u00e7\u0007\u00e7\u0002\u00e8\u0007\u00e8\u0002\u00e9\u0007\u00e9"+
		"\u0002\u00ea\u0007\u00ea\u0002\u00eb\u0007\u00eb\u0002\u00ec\u0007\u00ec"+
		"\u0002\u00ed\u0007\u00ed\u0002\u00ee\u0007\u00ee\u0002\u00ef\u0007\u00ef"+
		"\u0002\u00f0\u0007\u00f0\u0002\u00f1\u0007\u00f1\u0002\u00f2\u0007\u00f2"+
		"\u0002\u00f3\u0007\u00f3\u0002\u00f4\u0007\u00f4\u0002\u00f5\u0007\u00f5"+
		"\u0002\u00f6\u0007\u00f6\u0001\u0000\u0005\u0000\u01f0\b\u0000\n\u0000"+
		"\f\u0000\u01f3\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u01f9\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0201\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0240\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0246\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u024b\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0253\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0258\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0261\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u026c\b\u0011\n\u0011\f\u0011\u026f\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0279\b\u0012\n\u0012\f\u0012\u027c"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0286\b\u0013\n\u0013\f\u0013"+
		"\u0289\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u028e\b"+
		"\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0292\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u029b\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u02ab\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u02b3\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u02c2\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u02c6\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u02d0\b \u0001!\u0001!\u0003!\u02d4\b!\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u02eb\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02f2\b&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u02f9\b\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0304\b)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0003*\u030c\b*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0003+\u0313\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u031a"+
		"\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u032b\b-\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0003/\u0334\b/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00030\u033e\b0\u00011\u00011\u00011\u0003"+
		"1\u0343\b1\u00012\u00012\u00013\u00013\u00014\u00014\u00014\u00034\u034c"+
		"\b4\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u0356"+
		"\b5\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0005"+
		"6\u0361\b6\n6\f6\u0364\t6\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00057\u036f\b7\n7\f7\u0372\t7\u00018\u00018\u00018\u0001"+
		"8\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001;\u0001"+
		";\u0001;\u0003;\u0383\b;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003"+
		"<\u038b\b<\u0001=\u0001=\u0003=\u038f\b=\u0001>\u0001>\u0001>\u0001>\u0001"+
		"?\u0001?\u0003?\u0397\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0005@\u03a2\b@\n@\f@\u03a5\t@\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0005A\u03af\bA\nA\fA\u03b2\tA\u0001B\u0001"+
		"B\u0001B\u0003B\u03b7\bB\u0001C\u0001C\u0003C\u03bb\bC\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0003D\u03c4\bD\u0001E\u0001E\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0003G\u03d4\bG\u0001H\u0001H\u0003H\u03d8\bH\u0001I\u0001I\u0001I\u0001"+
		"I\u0001J\u0001J\u0003J\u03e0\bJ\u0001K\u0001K\u0001K\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001M\u0003M\u03ee\bM\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0003N\u03f6\bN\u0001O\u0001O\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u0402\bP\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001R\u0001"+
		"R\u0003R\u0410\bR\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001T\u0001T\u0001T\u0001T\u0001T\u0003T\u041f\bT\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0003U\u0426\bU\u0001V\u0001V\u0001V\u0001V\u0001V\u0003"+
		"V\u042d\bV\u0001W\u0001W\u0001W\u0001W\u0001X\u0001X\u0003X\u0435\bX\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0001Y\u0003Y\u043c\bY\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0003[\u0447\b[\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u0451\b\\\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0003]\u0458\b]\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0003^\u045f\b^\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0003_\u0469\b_\u0001`\u0001`\u0003`\u046d\b`\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0003a\u0475\ba\u0001b\u0001b\u0001b\u0001b\u0001b\u0001"+
		"b\u0001b\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0003c\u0484\bc\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0003d\u048b\bd\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0003"+
		"e\u049a\be\u0001f\u0001f\u0001f\u0001f\u0001f\u0003f\u04a1\bf\u0001g\u0001"+
		"g\u0001g\u0001g\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001"+
		"h\u0001h\u0005h\u04b0\bh\nh\fh\u04b3\th\u0001i\u0001i\u0001i\u0001i\u0001"+
		"j\u0001j\u0001j\u0001j\u0001j\u0003j\u04be\bj\u0001k\u0001k\u0001k\u0001"+
		"k\u0001l\u0001l\u0001l\u0001l\u0001m\u0001m\u0001m\u0001m\u0001n\u0001"+
		"n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0003n\u04d6"+
		"\bn\u0001o\u0001o\u0001o\u0001o\u0001o\u0003o\u04dd\bo\u0001p\u0001p\u0003"+
		"p\u04e1\bp\u0001q\u0001q\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001"+
		"r\u0001r\u0001r\u0001r\u0003r\u04ef\br\u0001s\u0001s\u0001s\u0001s\u0001"+
		"s\u0003s\u04f6\bs\u0001t\u0001t\u0003t\u04fa\bt\u0001u\u0001u\u0001v\u0001"+
		"v\u0001w\u0001w\u0001w\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0003x\u050a\bx\u0001y\u0001y\u0003y\u050e\by\u0001z\u0001z\u0003z\u0512"+
		"\bz\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001|\u0001|\u0003"+
		"|\u051d\b|\u0001}\u0001}\u0001}\u0003}\u0522\b}\u0001~\u0001~\u0003~\u0526"+
		"\b~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u0080\u0001"+
		"\u0080\u0003\u0080\u052e\b\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001"+
		"\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0005"+
		"\u0081\u0539\b\u0081\n\u0081\f\u0081\u053c\t\u0081\u0001\u0082\u0001\u0082"+
		"\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082"+
		"\u0005\u0082\u0546\b\u0082\n\u0082\f\u0082\u0549\t\u0082\u0001\u0083\u0001"+
		"\u0083\u0001\u0083\u0001\u0083\u0003\u0083\u054f\b\u0083\u0001\u0084\u0001"+
		"\u0084\u0001\u0084\u0001\u0084\u0001\u0085\u0001\u0085\u0003\u0085\u0557"+
		"\b\u0085\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001"+
		"\u0086\u0003\u0086\u055f\b\u0086\u0001\u0087\u0001\u0087\u0001\u0087\u0001"+
		"\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0088\u0001\u0088\u0001"+
		"\u0088\u0001\u0088\u0001\u0088\u0003\u0088\u056d\b\u0088\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0003\u0089\u0572\b\u0089\u0001\u008a\u0001\u008a\u0001"+
		"\u008b\u0001\u008b\u0003\u008b\u0578\b\u008b\u0001\u008c\u0001\u008c\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008e\u0001\u008e\u0001"+
		"\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0003"+
		"\u008f\u0588\b\u008f\u0001\u0090\u0001\u0090\u0003\u0090\u058c\b\u0090"+
		"\u0001\u0091\u0001\u0091\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092"+
		"\u0001\u0092\u0001\u0092\u0003\u0092\u0596\b\u0092\u0001\u0093\u0001\u0093"+
		"\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0003\u0093\u059e\b\u0093"+
		"\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0003\u0094"+
		"\u05a5\b\u0094\u0001\u0095\u0001\u0095\u0003\u0095\u05a9\b\u0095\u0001"+
		"\u0096\u0001\u0096\u0001\u0096\u0003\u0096\u05ae\b\u0096\u0001\u0097\u0001"+
		"\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001"+
		"\u0097\u0003\u0097\u05b8\b\u0097\u0001\u0098\u0001\u0098\u0001\u0098\u0001"+
		"\u0098\u0001\u0098\u0003\u0098\u05bf\b\u0098\u0001\u0099\u0001\u0099\u0001"+
		"\u0099\u0001\u0099\u0001\u0099\u0003\u0099\u05c6\b\u0099\u0001\u009a\u0001"+
		"\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0003\u009a\u05cd\b\u009a\u0001"+
		"\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001"+
		"\u009b\u0005\u009b\u05d6\b\u009b\n\u009b\f\u009b\u05d9\t\u009b\u0001\u009c"+
		"\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c"+
		"\u0001\u009c\u0001\u009c\u0003\u009c\u05e4\b\u009c\u0001\u009d\u0001\u009d"+
		"\u0001\u009d\u0003\u009d\u05e9\b\u009d\u0001\u009e\u0001\u009e\u0003\u009e"+
		"\u05ed\b\u009e\u0001\u009f\u0001\u009f\u0001\u00a0\u0001\u00a0\u0001\u00a1"+
		"\u0001\u00a1\u0001\u00a2\u0001\u00a2\u0003\u00a2\u05f7\b\u00a2\u0001\u00a3"+
		"\u0001\u00a3\u0001\u00a4\u0001\u00a4\u0001\u00a4\u0003\u00a4\u05fe\b\u00a4"+
		"\u0001\u00a5\u0001\u00a5\u0001\u00a5\u0001\u00a5\u0001\u00a5\u0001\u00a5"+
		"\u0001\u00a5\u0003\u00a5\u0607\b\u00a5\u0001\u00a6\u0001\u00a6\u0003\u00a6"+
		"\u060b\b\u00a6\u0001\u00a7\u0001\u00a7\u0001\u00a8\u0001\u00a8\u0001\u00a9"+
		"\u0001\u00a9\u0001\u00aa\u0001\u00aa\u0001\u00ab\u0001\u00ab\u0001\u00ac"+
		"\u0001\u00ac\u0001\u00ad\u0001\u00ad\u0001\u00ae\u0001\u00ae\u0003\u00ae"+
		"\u061d\b\u00ae\u0001\u00af\u0001\u00af\u0003\u00af\u0621\b\u00af\u0001"+
		"\u00b0\u0001\u00b0\u0001\u00b1\u0001\u00b1\u0001\u00b2\u0001\u00b2\u0001"+
		"\u00b3\u0001\u00b3\u0001\u00b4\u0001\u00b4\u0001\u00b5\u0001\u00b5\u0001"+
		"\u00b6\u0001\u00b6\u0001\u00b7\u0001\u00b7\u0001\u00b8\u0001\u00b8\u0001"+
		"\u00b9\u0001\u00b9\u0003\u00b9\u0637\b\u00b9\u0001\u00ba\u0001\u00ba\u0001"+
		"\u00bb\u0001\u00bb\u0003\u00bb\u063d\b\u00bb\u0001\u00bc\u0001\u00bc\u0001"+
		"\u00bd\u0001\u00bd\u0001\u00be\u0001\u00be\u0001\u00be\u0003\u00be\u0646"+
		"\b\u00be\u0001\u00bf\u0001\u00bf\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001"+
		"\u00c0\u0001\u00c0\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001"+
		"\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0003\u00c1\u0657\b\u00c1\u0001"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0003\u00c2\u065e"+
		"\b\u00c2\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0003"+
		"\u00c3\u0665\b\u00c3\u0001\u00c4\u0001\u00c4\u0001\u00c5\u0001\u00c5\u0001"+
		"\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0003\u00c5\u066f\b\u00c5\u0001"+
		"\u00c6\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0003"+
		"\u00c6\u0677\b\u00c6\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0001"+
		"\u00c7\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001"+
		"\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001"+
		"\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001"+
		"\u00c8\u0001\u00c8\u0001\u00c8\u0003\u00c8\u0692\b\u00c8\u0001\u00c9\u0001"+
		"\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0003\u00c9\u0699\b\u00c9\u0001"+
		"\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0003\u00ca\u06a0"+
		"\b\u00ca\u0001\u00cb\u0001\u00cb\u0003\u00cb\u06a4\b\u00cb\u0001\u00cc"+
		"\u0001\u00cc\u0003\u00cc\u06a8\b\u00cc\u0001\u00cd\u0001\u00cd\u0001\u00ce"+
		"\u0001\u00ce\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0003\u00cf\u06b1\b\u00cf"+
		"\u0001\u00d0\u0001\u00d0\u0001\u00d1\u0001\u00d1\u0001\u00d2\u0001\u00d2"+
		"\u0003\u00d2\u06b9\b\u00d2\u0001\u00d3\u0001\u00d3\u0001\u00d4\u0001\u00d4"+
		"\u0001\u00d4\u0001\u00d4\u0001\u00d4\u0001\u00d4\u0001\u00d5\u0001\u00d5"+
		"\u0001\u00d5\u0001\u00d5\u0001\u00d5\u0001\u00d6\u0001\u00d6\u0001\u00d6"+
		"\u0001\u00d6\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7"+
		"\u0001\u00d8\u0001\u00d8\u0001\u00d8\u0001\u00d8\u0001\u00d9\u0001\u00d9"+
		"\u0001\u00da\u0001\u00da\u0001\u00db\u0001\u00db\u0001\u00dc\u0001\u00dc"+
		"\u0001\u00dd\u0001\u00dd\u0001\u00de\u0001\u00de\u0001\u00df\u0001\u00df"+
		"\u0001\u00df\u0001\u00df\u0001\u00df\u0003\u00df\u06e6\b\u00df\u0001\u00e0"+
		"\u0001\u00e0\u0001\u00e0\u0001\u00e1\u0001\u00e1\u0001\u00e1\u0001\u00e1"+
		"\u0001\u00e1\u0003\u00e1\u06f0\b\u00e1\u0001\u00e2\u0001\u00e2\u0001\u00e2"+
		"\u0001\u00e2\u0001\u00e2\u0003\u00e2\u06f7\b\u00e2\u0001\u00e3\u0001\u00e3"+
		"\u0001\u00e3\u0001\u00e4\u0001\u00e4\u0001\u00e4\u0001\u00e4\u0001\u00e5"+
		"\u0001\u00e5\u0001\u00e5\u0001\u00e5\u0001\u00e5\u0003\u00e5\u0705\b\u00e5"+
		"\u0001\u00e6\u0001\u00e6\u0001\u00e6\u0001\u00e7\u0001\u00e7\u0001\u00e8"+
		"\u0001\u00e8\u0001\u00e8\u0001\u00e8\u0001\u00e8\u0003\u00e8\u0711\b\u00e8"+
		"\u0001\u00e9\u0001\u00e9\u0001\u00e9\u0001\u00e9\u0001\u00ea\u0001\u00ea"+
		"\u0001\u00ea\u0001\u00ea\u0001\u00ea\u0001\u00ea\u0001\u00ea\u0003\u00ea"+
		"\u071e\b\u00ea\u0001\u00eb\u0001\u00eb\u0001\u00eb\u0001\u00ec\u0001\u00ec"+
		"\u0001\u00ec\u0001\u00ec\u0001\u00ec\u0001\u00ed\u0001\u00ed\u0001\u00ed"+
		"\u0001\u00ed\u0001\u00ed\u0003\u00ed\u072d\b\u00ed\u0001\u00ee\u0001\u00ee"+
		"\u0001\u00ee\u0001\u00ef\u0001\u00ef\u0001\u00ef\u0001\u00ef\u0001\u00f0"+
		"\u0001\u00f0\u0001\u00f1\u0001\u00f1\u0001\u00f2\u0001\u00f2\u0001\u00f2"+
		"\u0001\u00f3\u0001\u00f3\u0001\u00f4\u0001\u00f4\u0001\u00f4\u0001\u00f5"+
		"\u0001\u00f5\u0001\u00f6\u0001\u00f6\u0001\u00f6\u0000\u000b\"$&ln\u0080"+
		"\u0082\u00d0\u0102\u0104\u0136\u00f7\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
		"\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164"+
		"\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c"+
		"\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194"+
		"\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac"+
		"\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4"+
		"\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc"+
		"\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u0000\u0005\u0002\u0000"+
		"\u0013\u0013\u001d\u001d\u0001\u0000\u001e \u0001\u0000-1\u0001\u0000"+
		"?@\u0002\u0000??AA\u071b\u0000\u01f1\u0001\u0000\u0000\u0000\u0002\u01f8"+
		"\u0001\u0000\u0000\u0000\u0004\u0200\u0001\u0000\u0000\u0000\u0006\u0202"+
		"\u0001\u0000\u0000\u0000\b\u020b\u0001\u0000\u0000\u0000\n\u020d\u0001"+
		"\u0000\u0000\u0000\f\u0216\u0001\u0000\u0000\u0000\u000e\u021f\u0001\u0000"+
		"\u0000\u0000\u0010\u0228\u0001\u0000\u0000\u0000\u0012\u0231\u0001\u0000"+
		"\u0000\u0000\u0014\u023f\u0001\u0000\u0000\u0000\u0016\u0245\u0001\u0000"+
		"\u0000\u0000\u0018\u024a\u0001\u0000\u0000\u0000\u001a\u0252\u0001\u0000"+
		"\u0000\u0000\u001c\u0257\u0001\u0000\u0000\u0000\u001e\u0259\u0001\u0000"+
		"\u0000\u0000 \u0260\u0001\u0000\u0000\u0000\"\u0262\u0001\u0000\u0000"+
		"\u0000$\u0270\u0001\u0000\u0000\u0000&\u027d\u0001\u0000\u0000\u0000("+
		"\u028d\u0001\u0000\u0000\u0000*\u0291\u0001\u0000\u0000\u0000,\u029a\u0001"+
		"\u0000\u0000\u0000.\u029c\u0001\u0000\u0000\u00000\u029f\u0001\u0000\u0000"+
		"\u00002\u02aa\u0001\u0000\u0000\u00004\u02ac\u0001\u0000\u0000\u00006"+
		"\u02b2\u0001\u0000\u0000\u00008\u02b4\u0001\u0000\u0000\u0000:\u02b7\u0001"+
		"\u0000\u0000\u0000<\u02c1\u0001\u0000\u0000\u0000>\u02c5\u0001\u0000\u0000"+
		"\u0000@\u02cf\u0001\u0000\u0000\u0000B\u02d3\u0001\u0000\u0000\u0000D"+
		"\u02d5\u0001\u0000\u0000\u0000F\u02db\u0001\u0000\u0000\u0000H\u02dd\u0001"+
		"\u0000\u0000\u0000J\u02ea\u0001\u0000\u0000\u0000L\u02f1\u0001\u0000\u0000"+
		"\u0000N\u02f8\u0001\u0000\u0000\u0000P\u02fa\u0001\u0000\u0000\u0000R"+
		"\u0303\u0001\u0000\u0000\u0000T\u030b\u0001\u0000\u0000\u0000V\u0312\u0001"+
		"\u0000\u0000\u0000X\u0319\u0001\u0000\u0000\u0000Z\u032a\u0001\u0000\u0000"+
		"\u0000\\\u032c\u0001\u0000\u0000\u0000^\u0333\u0001\u0000\u0000\u0000"+
		"`\u033d\u0001\u0000\u0000\u0000b\u0342\u0001\u0000\u0000\u0000d\u0344"+
		"\u0001\u0000\u0000\u0000f\u0346\u0001\u0000\u0000\u0000h\u034b\u0001\u0000"+
		"\u0000\u0000j\u0355\u0001\u0000\u0000\u0000l\u0357\u0001\u0000\u0000\u0000"+
		"n\u0365\u0001\u0000\u0000\u0000p\u0373\u0001\u0000\u0000\u0000r\u0377"+
		"\u0001\u0000\u0000\u0000t\u037b\u0001\u0000\u0000\u0000v\u0382\u0001\u0000"+
		"\u0000\u0000x\u038a\u0001\u0000\u0000\u0000z\u038e\u0001\u0000\u0000\u0000"+
		"|\u0390\u0001\u0000\u0000\u0000~\u0396\u0001\u0000\u0000\u0000\u0080\u0398"+
		"\u0001\u0000\u0000\u0000\u0082\u03a6\u0001\u0000\u0000\u0000\u0084\u03b6"+
		"\u0001\u0000\u0000\u0000\u0086\u03ba\u0001\u0000\u0000\u0000\u0088\u03c3"+
		"\u0001\u0000\u0000\u0000\u008a\u03c5\u0001\u0000\u0000\u0000\u008c\u03c7"+
		"\u0001\u0000\u0000\u0000\u008e\u03d3\u0001\u0000\u0000\u0000\u0090\u03d7"+
		"\u0001\u0000\u0000\u0000\u0092\u03d9\u0001\u0000\u0000\u0000\u0094\u03df"+
		"\u0001\u0000\u0000\u0000\u0096\u03e1\u0001\u0000\u0000\u0000\u0098\u03e4"+
		"\u0001\u0000\u0000\u0000\u009a\u03ed\u0001\u0000\u0000\u0000\u009c\u03f5"+
		"\u0001\u0000\u0000\u0000\u009e\u03f7\u0001\u0000\u0000\u0000\u00a0\u0401"+
		"\u0001\u0000\u0000\u0000\u00a2\u0403\u0001\u0000\u0000\u0000\u00a4\u040f"+
		"\u0001\u0000\u0000\u0000\u00a6\u0411\u0001\u0000\u0000\u0000\u00a8\u041e"+
		"\u0001\u0000\u0000\u0000\u00aa\u0425\u0001\u0000\u0000\u0000\u00ac\u042c"+
		"\u0001\u0000\u0000\u0000\u00ae\u042e\u0001\u0000\u0000\u0000\u00b0\u0434"+
		"\u0001\u0000\u0000\u0000\u00b2\u043b\u0001\u0000\u0000\u0000\u00b4\u043d"+
		"\u0001\u0000\u0000\u0000\u00b6\u0446\u0001\u0000\u0000\u0000\u00b8\u0450"+
		"\u0001\u0000\u0000\u0000\u00ba\u0457\u0001\u0000\u0000\u0000\u00bc\u045e"+
		"\u0001\u0000\u0000\u0000\u00be\u0468\u0001\u0000\u0000\u0000\u00c0\u046c"+
		"\u0001\u0000\u0000\u0000\u00c2\u0474\u0001\u0000\u0000\u0000\u00c4\u0476"+
		"\u0001\u0000\u0000\u0000\u00c6\u0483\u0001\u0000\u0000\u0000\u00c8\u048a"+
		"\u0001\u0000\u0000\u0000\u00ca\u0499\u0001\u0000\u0000\u0000\u00cc\u04a0"+
		"\u0001\u0000\u0000\u0000\u00ce\u04a2\u0001\u0000\u0000\u0000\u00d0\u04a6"+
		"\u0001\u0000\u0000\u0000\u00d2\u04b4\u0001\u0000\u0000\u0000\u00d4\u04bd"+
		"\u0001\u0000\u0000\u0000\u00d6\u04bf\u0001\u0000\u0000\u0000\u00d8\u04c3"+
		"\u0001\u0000\u0000\u0000\u00da\u04c7\u0001\u0000\u0000\u0000\u00dc\u04d5"+
		"\u0001\u0000\u0000\u0000\u00de\u04dc\u0001\u0000\u0000\u0000\u00e0\u04e0"+
		"\u0001\u0000\u0000\u0000\u00e2\u04e2\u0001\u0000\u0000\u0000\u00e4\u04ee"+
		"\u0001\u0000\u0000\u0000\u00e6\u04f5\u0001\u0000\u0000\u0000\u00e8\u04f9"+
		"\u0001\u0000\u0000\u0000\u00ea\u04fb\u0001\u0000\u0000\u0000\u00ec\u04fd"+
		"\u0001\u0000\u0000\u0000\u00ee\u04ff\u0001\u0000\u0000\u0000\u00f0\u0509"+
		"\u0001\u0000\u0000\u0000\u00f2\u050d\u0001\u0000\u0000\u0000\u00f4\u0511"+
		"\u0001\u0000\u0000\u0000\u00f6\u0513\u0001\u0000\u0000\u0000\u00f8\u051c"+
		"\u0001\u0000\u0000\u0000\u00fa\u0521\u0001\u0000\u0000\u0000\u00fc\u0525"+
		"\u0001\u0000\u0000\u0000\u00fe\u0527\u0001\u0000\u0000\u0000\u0100\u052d"+
		"\u0001\u0000\u0000\u0000\u0102\u052f\u0001\u0000\u0000\u0000\u0104\u053d"+
		"\u0001\u0000\u0000\u0000\u0106\u054e\u0001\u0000\u0000\u0000\u0108\u0550"+
		"\u0001\u0000\u0000\u0000\u010a\u0556\u0001\u0000\u0000\u0000\u010c\u055e"+
		"\u0001\u0000\u0000\u0000\u010e\u0560\u0001\u0000\u0000\u0000\u0110\u056c"+
		"\u0001\u0000\u0000\u0000\u0112\u0571\u0001\u0000\u0000\u0000\u0114\u0573"+
		"\u0001\u0000\u0000\u0000\u0116\u0577\u0001\u0000\u0000\u0000\u0118\u0579"+
		"\u0001\u0000\u0000\u0000\u011a\u057b\u0001\u0000\u0000\u0000\u011c\u057f"+
		"\u0001\u0000\u0000\u0000\u011e\u0587\u0001\u0000\u0000\u0000\u0120\u058b"+
		"\u0001\u0000\u0000\u0000\u0122\u058d\u0001\u0000\u0000\u0000\u0124\u0595"+
		"\u0001\u0000\u0000\u0000\u0126\u059d\u0001\u0000\u0000\u0000\u0128\u05a4"+
		"\u0001\u0000\u0000\u0000\u012a\u05a8\u0001\u0000\u0000\u0000\u012c\u05ad"+
		"\u0001\u0000\u0000\u0000\u012e\u05b7\u0001\u0000\u0000\u0000\u0130\u05be"+
		"\u0001\u0000\u0000\u0000\u0132\u05c5\u0001\u0000\u0000\u0000\u0134\u05cc"+
		"\u0001\u0000\u0000\u0000\u0136\u05ce\u0001\u0000\u0000\u0000\u0138\u05e3"+
		"\u0001\u0000\u0000\u0000\u013a\u05e8\u0001\u0000\u0000\u0000\u013c\u05ec"+
		"\u0001\u0000\u0000\u0000\u013e\u05ee\u0001\u0000\u0000\u0000\u0140\u05f0"+
		"\u0001\u0000\u0000\u0000\u0142\u05f2\u0001\u0000\u0000\u0000\u0144\u05f6"+
		"\u0001\u0000\u0000\u0000\u0146\u05f8\u0001\u0000\u0000\u0000\u0148\u05fd"+
		"\u0001\u0000\u0000\u0000\u014a\u0606\u0001\u0000\u0000\u0000\u014c\u060a"+
		"\u0001\u0000\u0000\u0000\u014e\u060c\u0001\u0000\u0000\u0000\u0150\u060e"+
		"\u0001\u0000\u0000\u0000\u0152\u0610\u0001\u0000\u0000\u0000\u0154\u0612"+
		"\u0001\u0000\u0000\u0000\u0156\u0614\u0001\u0000\u0000\u0000\u0158\u0616"+
		"\u0001\u0000\u0000\u0000\u015a\u0618\u0001\u0000\u0000\u0000\u015c\u061c"+
		"\u0001\u0000\u0000\u0000\u015e\u0620\u0001\u0000\u0000\u0000\u0160\u0622"+
		"\u0001\u0000\u0000\u0000\u0162\u0624\u0001\u0000\u0000\u0000\u0164\u0626"+
		"\u0001\u0000\u0000\u0000\u0166\u0628\u0001\u0000\u0000\u0000\u0168\u062a"+
		"\u0001\u0000\u0000\u0000\u016a\u062c\u0001\u0000\u0000\u0000\u016c\u062e"+
		"\u0001\u0000\u0000\u0000\u016e\u0630\u0001\u0000\u0000\u0000\u0170\u0632"+
		"\u0001\u0000\u0000\u0000\u0172\u0636\u0001\u0000\u0000\u0000\u0174\u0638"+
		"\u0001\u0000\u0000\u0000\u0176\u063c\u0001\u0000\u0000\u0000\u0178\u063e"+
		"\u0001\u0000\u0000\u0000\u017a\u0640\u0001\u0000\u0000\u0000\u017c\u0645"+
		"\u0001\u0000\u0000\u0000\u017e\u0647\u0001\u0000\u0000\u0000\u0180\u0649"+
		"\u0001\u0000\u0000\u0000\u0182\u0656\u0001\u0000\u0000\u0000\u0184\u065d"+
		"\u0001\u0000\u0000\u0000\u0186\u0664\u0001\u0000\u0000\u0000\u0188\u0666"+
		"\u0001\u0000\u0000\u0000\u018a\u066e\u0001\u0000\u0000\u0000\u018c\u0676"+
		"\u0001\u0000\u0000\u0000\u018e\u0678\u0001\u0000\u0000\u0000\u0190\u0691"+
		"\u0001\u0000\u0000\u0000\u0192\u0698\u0001\u0000\u0000\u0000\u0194\u069f"+
		"\u0001\u0000\u0000\u0000\u0196\u06a3\u0001\u0000\u0000\u0000\u0198\u06a7"+
		"\u0001\u0000\u0000\u0000\u019a\u06a9\u0001\u0000\u0000\u0000\u019c\u06ab"+
		"\u0001\u0000\u0000\u0000\u019e\u06b0\u0001\u0000\u0000\u0000\u01a0\u06b2"+
		"\u0001\u0000\u0000\u0000\u01a2\u06b4\u0001\u0000\u0000\u0000\u01a4\u06b8"+
		"\u0001\u0000\u0000\u0000\u01a6\u06ba\u0001\u0000\u0000\u0000\u01a8\u06bc"+
		"\u0001\u0000\u0000\u0000\u01aa\u06c2\u0001\u0000\u0000\u0000\u01ac\u06c7"+
		"\u0001\u0000\u0000\u0000\u01ae\u06cb\u0001\u0000\u0000\u0000\u01b0\u06d0"+
		"\u0001\u0000\u0000\u0000\u01b2\u06d4\u0001\u0000\u0000\u0000\u01b4\u06d6"+
		"\u0001\u0000\u0000\u0000\u01b6\u06d8\u0001\u0000\u0000\u0000\u01b8\u06da"+
		"\u0001\u0000\u0000\u0000\u01ba\u06dc\u0001\u0000\u0000\u0000\u01bc\u06de"+
		"\u0001\u0000\u0000\u0000\u01be\u06e5\u0001\u0000\u0000\u0000\u01c0\u06e7"+
		"\u0001\u0000\u0000\u0000\u01c2\u06ef\u0001\u0000\u0000\u0000\u01c4\u06f6"+
		"\u0001\u0000\u0000\u0000\u01c6\u06f8\u0001\u0000\u0000\u0000\u01c8\u06fb"+
		"\u0001\u0000\u0000\u0000\u01ca\u0704\u0001\u0000\u0000\u0000\u01cc\u0706"+
		"\u0001\u0000\u0000\u0000\u01ce\u0709\u0001\u0000\u0000\u0000\u01d0\u0710"+
		"\u0001\u0000\u0000\u0000\u01d2\u0712\u0001\u0000\u0000\u0000\u01d4\u071d"+
		"\u0001\u0000\u0000\u0000\u01d6\u071f\u0001\u0000\u0000\u0000\u01d8\u0722"+
		"\u0001\u0000\u0000\u0000\u01da\u072c\u0001\u0000\u0000\u0000\u01dc\u072e"+
		"\u0001\u0000\u0000\u0000\u01de\u0731\u0001\u0000\u0000\u0000\u01e0\u0735"+
		"\u0001\u0000\u0000\u0000\u01e2\u0737\u0001\u0000\u0000\u0000\u01e4\u0739"+
		"\u0001\u0000\u0000\u0000\u01e6\u073c\u0001\u0000\u0000\u0000\u01e8\u073e"+
		"\u0001\u0000\u0000\u0000\u01ea\u0741\u0001\u0000\u0000\u0000\u01ec\u0743"+
		"\u0001\u0000\u0000\u0000\u01ee\u01f0\u0003\u0002\u0001\u0000\u01ef\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f0\u01f3\u0001\u0000\u0000\u0000\u01f1\u01ef"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f5"+
		"\u0005\u0000\u0000\u0001\u01f5\u0001\u0001\u0000\u0000\u0000\u01f6\u01f9"+
		"\u0003\u0004\u0002\u0000\u01f7\u01f9\u0003\u0180\u00c0\u0000\u01f8\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f9\u0003"+
		"\u0001\u0000\u0000\u0000\u01fa\u0201\u0003\n\u0005\u0000\u01fb\u0201\u0003"+
		"\f\u0006\u0000\u01fc\u0201\u0003\u000e\u0007\u0000\u01fd\u0201\u0003\u0010"+
		"\b\u0000\u01fe\u0201\u0003\u0012\t\u0000\u01ff\u0201\u0003\u0006\u0003"+
		"\u0000\u0200\u01fa\u0001\u0000\u0000\u0000\u0200\u01fb\u0001\u0000\u0000"+
		"\u0000\u0200\u01fc\u0001\u0000\u0000\u0000\u0200\u01fd\u0001\u0000\u0000"+
		"\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0200\u01ff\u0001\u0000\u0000"+
		"\u0000\u0201\u0005\u0001\u0000\u0000\u0000\u0202\u0203\u0005\u0001\u0000"+
		"\u0000\u0203\u0204\u0003\u0196\u00cb\u0000\u0204\u0205\u0005\u0002\u0000"+
		"\u0000\u0205\u0206\u0003\u0016\u000b\u0000\u0206\u0207\u0005\u0002\u0000"+
		"\u0000\u0207\u0208\u0003\b\u0004\u0000\u0208\u0209\u0003\u0014\n\u0000"+
		"\u0209\u020a\u0005\u0003\u0000\u0000\u020a\u0007\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0003\u00f8|\u0000\u020c\t\u0001\u0000\u0000\u0000\u020d"+
		"\u020e\u0005\u0004\u0000\u0000\u020e\u020f\u0003\u0196\u00cb\u0000\u020f"+
		"\u0210\u0005\u0002\u0000\u0000\u0210\u0211\u0003\u0016\u000b\u0000\u0211"+
		"\u0212\u0005\u0002\u0000\u0000\u0212\u0213\u0003\u0018\f\u0000\u0213\u0214"+
		"\u0003\u0014\n\u0000\u0214\u0215\u0005\u0003\u0000\u0000\u0215\u000b\u0001"+
		"\u0000\u0000\u0000\u0216\u0217\u0005\u0005\u0000\u0000\u0217\u0218\u0003"+
		"\u0196\u00cb\u0000\u0218\u0219\u0005\u0002\u0000\u0000\u0219\u021a\u0003"+
		"\u0016\u000b\u0000\u021a\u021b\u0005\u0002\u0000\u0000\u021b\u021c\u0003"+
		"v;\u0000\u021c\u021d\u0003\u0014\n\u0000\u021d\u021e\u0005\u0003\u0000"+
		"\u0000\u021e\r\u0001\u0000\u0000\u0000\u021f\u0220\u0005\u0006\u0000\u0000"+
		"\u0220\u0221\u0003\u0196\u00cb\u0000\u0221\u0222\u0005\u0002\u0000\u0000"+
		"\u0222\u0223\u0003\u0016\u000b\u0000\u0223\u0224\u0005\u0002\u0000\u0000"+
		"\u0224\u0225\u0003\u00f2y\u0000\u0225\u0226\u0003\u0014\n\u0000\u0226"+
		"\u0227\u0005\u0003\u0000\u0000\u0227\u000f\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0005\u0007\u0000\u0000\u0229\u022a\u0003\u0196\u00cb\u0000\u022a"+
		"\u022b\u0005\u0002\u0000\u0000\u022b\u022c\u0003\u0016\u000b\u0000\u022c"+
		"\u022d\u0005\u0002\u0000\u0000\u022d\u022e\u0003\u00f8|\u0000\u022e\u022f"+
		"\u0003\u0014\n\u0000\u022f\u0230\u0005\u0003\u0000\u0000\u0230\u0011\u0001"+
		"\u0000\u0000\u0000\u0231\u0232\u0005\b\u0000\u0000\u0232\u0233\u0003\u0196"+
		"\u00cb\u0000\u0233\u0234\u0005\u0002\u0000\u0000\u0234\u0235\u0003\u0016"+
		"\u000b\u0000\u0235\u0236\u0005\u0002\u0000\u0000\u0236\u0237\u0003\u0134"+
		"\u009a\u0000\u0237\u0238\u0003\u0014\n\u0000\u0238\u0239\u0005\u0003\u0000"+
		"\u0000\u0239\u0013\u0001\u0000\u0000\u0000\u023a\u023b\u0005\u0002\u0000"+
		"\u0000\u023b\u023c\u0003\u017a\u00bd\u0000\u023c\u023d\u0003\u017c\u00be"+
		"\u0000\u023d\u0240\u0001\u0000\u0000\u0000\u023e\u0240\u0003\u01a2\u00d1"+
		"\u0000\u023f\u023a\u0001\u0000\u0000\u0000\u023f\u023e\u0001\u0000\u0000"+
		"\u0000\u0240\u0015\u0001\u0000\u0000\u0000\u0241\u0246\u0005G\u0000\u0000"+
		"\u0242\u0243\u0005G\u0000\u0000\u0243\u0244\u0005\t\u0000\u0000\u0244"+
		"\u0246\u0003\u018a\u00c5\u0000\u0245\u0241\u0001\u0000\u0000\u0000\u0245"+
		"\u0242\u0001\u0000\u0000\u0000\u0246\u0017\u0001\u0000\u0000\u0000\u0247"+
		"\u024b\u0003\u001a\r\u0000\u0248\u024b\u0003`0\u0000\u0249\u024b\u0003"+
		"p8\u0000\u024a\u0247\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000"+
		"\u0000\u024a\u0249\u0001\u0000\u0000\u0000\u024b\u0019\u0001\u0000\u0000"+
		"\u0000\u024c\u0253\u0003,\u0016\u0000\u024d\u0253\u00036\u001b\u0000\u024e"+
		"\u0253\u0003\u001c\u000e\u0000\u024f\u0253\u0003D\"\u0000\u0250\u0253"+
		"\u0003r9\u0000\u0251\u0253\u0003t:\u0000\u0252\u024c\u0001\u0000\u0000"+
		"\u0000\u0252\u024d\u0001\u0000\u0000\u0000\u0252\u024e\u0001\u0000\u0000"+
		"\u0000\u0252\u024f\u0001\u0000\u0000\u0000\u0252\u0250\u0001\u0000\u0000"+
		"\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0253\u001b\u0001\u0000\u0000"+
		"\u0000\u0254\u0258\u0003\u001e\u000f\u0000\u0255\u0258\u0003 \u0010\u0000"+
		"\u0256\u0258\u0003h4\u0000\u0257\u0254\u0001\u0000\u0000\u0000\u0257\u0255"+
		"\u0001\u0000\u0000\u0000\u0257\u0256\u0001\u0000\u0000\u0000\u0258\u001d"+
		"\u0001\u0000\u0000\u0000\u0259\u025a\u0003(\u0014\u0000\u025a\u025b\u0003"+
		"\u014a\u00a5\u0000\u025b\u025c\u0003(\u0014\u0000\u025c\u001f\u0001\u0000"+
		"\u0000\u0000\u025d\u0261\u0003\"\u0011\u0000\u025e\u0261\u0003$\u0012"+
		"\u0000\u025f\u0261\u0003&\u0013\u0000\u0260\u025d\u0001\u0000\u0000\u0000"+
		"\u0260\u025e\u0001\u0000\u0000\u0000\u0260\u025f\u0001\u0000\u0000\u0000"+
		"\u0261!\u0001\u0000\u0000\u0000\u0262\u0263\u0006\u0011\uffff\uffff\u0000"+
		"\u0263\u0264\u0003(\u0014\u0000\u0264\u0265\u0003\u01b2\u00d9\u0000\u0265"+
		"\u0266\u0003(\u0014\u0000\u0266\u026d\u0001\u0000\u0000\u0000\u0267\u0268"+
		"\n\u0001\u0000\u0000\u0268\u0269\u0003\u01b2\u00d9\u0000\u0269\u026a\u0003"+
		"(\u0014\u0000\u026a\u026c\u0001\u0000\u0000\u0000\u026b\u0267\u0001\u0000"+
		"\u0000\u0000\u026c\u026f\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000"+
		"\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e#\u0001\u0000\u0000"+
		"\u0000\u026f\u026d\u0001\u0000\u0000\u0000\u0270\u0271\u0006\u0012\uffff"+
		"\uffff\u0000\u0271\u0272\u0003(\u0014\u0000\u0272\u0273\u0005\n\u0000"+
		"\u0000\u0273\u0274\u0003(\u0014\u0000\u0274\u027a\u0001\u0000\u0000\u0000"+
		"\u0275\u0276\n\u0001\u0000\u0000\u0276\u0277\u0005\n\u0000\u0000\u0277"+
		"\u0279\u0003(\u0014\u0000\u0278\u0275\u0001\u0000\u0000\u0000\u0279\u027c"+
		"\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027a\u027b"+
		"\u0001\u0000\u0000\u0000\u027b%\u0001\u0000\u0000\u0000\u027c\u027a\u0001"+
		"\u0000\u0000\u0000\u027d\u027e\u0006\u0013\uffff\uffff\u0000\u027e\u027f"+
		"\u0003(\u0014\u0000\u027f\u0280\u0005\u000b\u0000\u0000\u0280\u0281\u0003"+
		"(\u0014\u0000\u0281\u0287\u0001\u0000\u0000\u0000\u0282\u0283\n\u0001"+
		"\u0000\u0000\u0283\u0284\u0005\u000b\u0000\u0000\u0284\u0286\u0003(\u0014"+
		"\u0000\u0285\u0282\u0001\u0000\u0000\u0000\u0286\u0289\u0001\u0000\u0000"+
		"\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000"+
		"\u0000\u0288\'\u0001\u0000\u0000\u0000\u0289\u0287\u0001\u0000\u0000\u0000"+
		"\u028a\u028e\u0003,\u0016\u0000\u028b\u028e\u00036\u001b\u0000\u028c\u028e"+
		"\u0003D\"\u0000\u028d\u028a\u0001\u0000\u0000\u0000\u028d\u028b\u0001"+
		"\u0000\u0000\u0000\u028d\u028c\u0001\u0000\u0000\u0000\u028e)\u0001\u0000"+
		"\u0000\u0000\u028f\u0292\u0003,\u0016\u0000\u0290\u0292\u00038\u001c\u0000"+
		"\u0291\u028f\u0001\u0000\u0000\u0000\u0291\u0290\u0001\u0000\u0000\u0000"+
		"\u0292+\u0001\u0000\u0000\u0000\u0293\u029b\u0003.\u0017\u0000\u0294\u029b"+
		"\u0003<\u001e\u0000\u0295\u029b\u0003\u0178\u00bc\u0000\u0296\u0297\u0005"+
		"\f\u0000\u0000\u0297\u0298\u0003\u001a\r\u0000\u0298\u0299\u0005\r\u0000"+
		"\u0000\u0299\u029b\u0001\u0000\u0000\u0000\u029a\u0293\u0001\u0000\u0000"+
		"\u0000\u029a\u0294\u0001\u0000\u0000\u0000\u029a\u0295\u0001\u0000\u0000"+
		"\u0000\u029a\u0296\u0001\u0000\u0000\u0000\u029b-\u0001\u0000\u0000\u0000"+
		"\u029c\u029d\u00030\u0018\u0000\u029d\u029e\u0003(\u0014\u0000\u029e/"+
		"\u0001\u0000\u0000\u0000\u029f\u02a0\u0003\u013a\u009d\u0000\u02a0\u02a1"+
		"\u0005\u000e\u0000\u0000\u02a1\u02a2\u00032\u0019\u0000\u02a2\u02a3\u0005"+
		"\u000f\u0000\u0000\u02a3\u02a4\u0005\u0010\u0000\u0000\u02a41\u0001\u0000"+
		"\u0000\u0000\u02a5\u02ab\u00034\u001a\u0000\u02a6\u02a7\u00034\u001a\u0000"+
		"\u02a7\u02a8\u0005\u0002\u0000\u0000\u02a8\u02a9\u00032\u0019\u0000\u02a9"+
		"\u02ab\u0001\u0000\u0000\u0000\u02aa\u02a5\u0001\u0000\u0000\u0000\u02aa"+
		"\u02a6\u0001\u0000\u0000\u0000\u02ab3\u0001\u0000\u0000\u0000\u02ac\u02ad"+
		"\u0003\u0178\u00bc\u0000\u02ad\u02ae\u0005\u0010\u0000\u0000\u02ae\u02af"+
		"\u0003b1\u0000\u02af5\u0001\u0000\u0000\u0000\u02b0\u02b3\u00038\u001c"+
		"\u0000\u02b1\u02b3\u0003:\u001d\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b37\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b5\u0003\u013c\u009e\u0000\u02b5\u02b6\u0003*\u0015\u0000\u02b69\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b8\u0005\f\u0000\u0000\u02b8\u02b9\u0003T"+
		"*\u0000\u02b9\u02ba\u0003\u0164\u00b2\u0000\u02ba\u02bb\u0003T*\u0000"+
		"\u02bb\u02bc\u0005\r\u0000\u0000\u02bc;\u0001\u0000\u0000\u0000\u02bd"+
		"\u02c2\u0003>\u001f\u0000\u02be\u02c2\u0003@ \u0000\u02bf\u02c2\u0003"+
		"F#\u0000\u02c0\u02c2\u0003Z-\u0000\u02c1\u02bd\u0001\u0000\u0000\u0000"+
		"\u02c1\u02be\u0001\u0000\u0000\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000"+
		"\u02c1\u02c0\u0001\u0000\u0000\u0000\u02c2=\u0001\u0000\u0000\u0000\u02c3"+
		"\u02c6\u0003\u0166\u00b3\u0000\u02c4\u02c6\u0003X,\u0000\u02c5\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c6?\u0001\u0000"+
		"\u0000\u0000\u02c7\u02d0\u0003\u016a\u00b5\u0000\u02c8\u02d0\u0003B!\u0000"+
		"\u02c9\u02ca\u0005\f\u0000\u0000\u02ca\u02cb\u0003V+\u0000\u02cb\u02cc"+
		"\u0005\r\u0000\u0000\u02cc\u02d0\u0001\u0000\u0000\u0000\u02cd\u02d0\u0003"+
		"\u00dcn\u0000\u02ce\u02d0\u0003H$\u0000\u02cf\u02c7\u0001\u0000\u0000"+
		"\u0000\u02cf\u02c8\u0001\u0000\u0000\u0000\u02cf\u02c9\u0001\u0000\u0000"+
		"\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000\u02cf\u02ce\u0001\u0000\u0000"+
		"\u0000\u02d0A\u0001\u0000\u0000\u0000\u02d1\u02d4\u0003\u0176\u00bb\u0000"+
		"\u02d2\u02d4\u0003\u0174\u00ba\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d2\u0001\u0000\u0000\u0000\u02d4C\u0001\u0000\u0000\u0000\u02d5"+
		"\u02d6\u0005\f\u0000\u0000\u02d6\u02d7\u0003T*\u0000\u02d7\u02d8\u0003"+
		"\u0160\u00b0\u0000\u02d8\u02d9\u0003T*\u0000\u02d9\u02da\u0005\r\u0000"+
		"\u0000\u02daE\u0001\u0000\u0000\u0000\u02db\u02dc\u0003\u016e\u00b7\u0000"+
		"\u02dcG\u0001\u0000\u0000\u0000\u02dd\u02de\u0005\u0011\u0000\u0000\u02de"+
		"\u02df\u0003J%\u0000\u02df\u02e0\u0005\u0002\u0000\u0000\u02e0\u02e1\u0003"+
		"N\'\u0000\u02e1\u02e2\u0005\u0002\u0000\u0000\u02e2\u02e3\u0003\u001a"+
		"\r\u0000\u02e3\u02e4\u0005\r\u0000\u0000\u02e4I\u0001\u0000\u0000\u0000"+
		"\u02e5\u02eb\u0003`0\u0000\u02e6\u02e7\u0005\u000e\u0000\u0000\u02e7\u02e8"+
		"\u0003L&\u0000\u02e8\u02e9\u0005\u000f\u0000\u0000\u02e9\u02eb\u0001\u0000"+
		"\u0000\u0000\u02ea\u02e5\u0001\u0000\u0000\u0000\u02ea\u02e6\u0001\u0000"+
		"\u0000\u0000\u02ebK\u0001\u0000\u0000\u0000\u02ec\u02f2\u0003`0\u0000"+
		"\u02ed\u02ee\u0003`0\u0000\u02ee\u02ef\u0005\u0002\u0000\u0000\u02ef\u02f0"+
		"\u0003L&\u0000\u02f0\u02f2\u0001\u0000\u0000\u0000\u02f1\u02ec\u0001\u0000"+
		"\u0000\u0000\u02f1\u02ed\u0001\u0000\u0000\u0000\u02f2M\u0001\u0000\u0000"+
		"\u0000\u02f3\u02f9\u0003P(\u0000\u02f4\u02f5\u0005\u000e\u0000\u0000\u02f5"+
		"\u02f6\u0003R)\u0000\u02f6\u02f7\u0005\u000f\u0000\u0000\u02f7\u02f9\u0001"+
		"\u0000\u0000\u0000\u02f8\u02f3\u0001\u0000\u0000\u0000\u02f8\u02f4\u0001"+
		"\u0000\u0000\u0000\u02f9O\u0001\u0000\u0000\u0000\u02fa\u02fb\u0003\u001a"+
		"\r\u0000\u02fb\u02fc\u0003\u0152\u00a9\u0000\u02fc\u02fd\u0003\u001a\r"+
		"\u0000\u02fdQ\u0001\u0000\u0000\u0000\u02fe\u0304\u0003P(\u0000\u02ff"+
		"\u0300\u0003P(\u0000\u0300\u0301\u0005\u0002\u0000\u0000\u0301\u0302\u0003"+
		"R)\u0000\u0302\u0304\u0001\u0000\u0000\u0000\u0303\u02fe\u0001\u0000\u0000"+
		"\u0000\u0303\u02ff\u0001\u0000\u0000\u0000\u0304S\u0001\u0000\u0000\u0000"+
		"\u0305\u030c\u0003<\u001e\u0000\u0306\u030c\u0003\u0178\u00bc\u0000\u0307"+
		"\u0308\u0005\f\u0000\u0000\u0308\u0309\u0003\u001a\r\u0000\u0309\u030a"+
		"\u0005\r\u0000\u0000\u030a\u030c\u0001\u0000\u0000\u0000\u030b\u0305\u0001"+
		"\u0000\u0000\u0000\u030b\u0306\u0001\u0000\u0000\u0000\u030b\u0307\u0001"+
		"\u0000\u0000\u0000\u030cU\u0001\u0000\u0000\u0000\u030d\u0313\u0003\u014a"+
		"\u00a5\u0000\u030e\u0313\u0003\u014c\u00a6\u0000\u030f\u0313\u0003\u0162"+
		"\u00b1\u0000\u0310\u0313\u0003\u0164\u00b2\u0000\u0311\u0313\u0003\u013c"+
		"\u009e\u0000\u0312\u030d\u0001\u0000\u0000\u0000\u0312\u030e\u0001\u0000"+
		"\u0000\u0000\u0312\u030f\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000"+
		"\u0000\u0000\u0312\u0311\u0001\u0000\u0000\u0000\u0313W\u0001\u0000\u0000"+
		"\u0000\u0314\u031a\u0005\u0012\u0000\u0000\u0315\u0316\u0005\u000e\u0000"+
		"\u0000\u0316\u0317\u0003^/\u0000\u0317\u0318\u0005\u000f\u0000\u0000\u0318"+
		"\u031a\u0001\u0000\u0000\u0000\u0319\u0314\u0001\u0000\u0000\u0000\u0319"+
		"\u0315\u0001\u0000\u0000\u0000\u031aY\u0001\u0000\u0000\u0000\u031b\u031c"+
		"\u0003\u0168\u00b4\u0000\u031c\u031d\u0005\f\u0000\u0000\u031d\u031e\u0003"+
		"\\.\u0000\u031e\u031f\u0005\r\u0000\u0000\u031f\u032b\u0001\u0000\u0000"+
		"\u0000\u0320\u0321\u0003\u016c\u00b6\u0000\u0321\u0322\u0005\f\u0000\u0000"+
		"\u0322\u0323\u0003\\.\u0000\u0323\u0324\u0005\r\u0000\u0000\u0324\u032b"+
		"\u0001\u0000\u0000\u0000\u0325\u0326\u0003\u0170\u00b8\u0000\u0326\u0327"+
		"\u0005\f\u0000\u0000\u0327\u0328\u0003\\.\u0000\u0328\u0329\u0005\r\u0000"+
		"\u0000\u0329\u032b\u0001\u0000\u0000\u0000\u032a\u031b\u0001\u0000\u0000"+
		"\u0000\u032a\u0320\u0001\u0000\u0000\u0000\u032a\u0325\u0001\u0000\u0000"+
		"\u0000\u032b[\u0001\u0000\u0000\u0000\u032c\u032d\u0003^/\u0000\u032d"+
		"]\u0001\u0000\u0000\u0000\u032e\u0334\u0003\u001a\r\u0000\u032f\u0330"+
		"\u0003\u001a\r\u0000\u0330\u0331\u0005\u0002\u0000\u0000\u0331\u0332\u0003"+
		"^/\u0000\u0332\u0334\u0001\u0000\u0000\u0000\u0333\u032e\u0001\u0000\u0000"+
		"\u0000\u0333\u032f\u0001\u0000\u0000\u0000\u0334_\u0001\u0000\u0000\u0000"+
		"\u0335\u0336\u0003\u015e\u00af\u0000\u0336\u0337\u0005\u0010\u0000\u0000"+
		"\u0337\u0338\u0003b1\u0000\u0338\u033e\u0001\u0000\u0000\u0000\u0339\u033a"+
		"\u0005\f\u0000\u0000\u033a\u033b\u0003`0\u0000\u033b\u033c\u0005\r\u0000"+
		"\u0000\u033c\u033e\u0001\u0000\u0000\u0000\u033d\u0335\u0001\u0000\u0000"+
		"\u0000\u033d\u0339\u0001\u0000\u0000\u0000\u033ea\u0001\u0000\u0000\u0000"+
		"\u033f\u0343\u0003d2\u0000\u0340\u0343\u0003j5\u0000\u0341\u0343\u0003"+
		"f3\u0000\u0342\u033f\u0001\u0000\u0000\u0000\u0342\u0340\u0001\u0000\u0000"+
		"\u0000\u0342\u0341\u0001\u0000\u0000\u0000\u0343c\u0001\u0000\u0000\u0000"+
		"\u0344\u0345\u0003,\u0016\u0000\u0345e\u0001\u0000\u0000\u0000\u0346\u0347"+
		"\u0003&\u0013\u0000\u0347g\u0001\u0000\u0000\u0000\u0348\u034c\u0003j"+
		"5\u0000\u0349\u034c\u0003l6\u0000\u034a\u034c\u0003n7\u0000\u034b\u0348"+
		"\u0001\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034b\u034a"+
		"\u0001\u0000\u0000\u0000\u034ci\u0001\u0000\u0000\u0000\u034d\u034e\u0003"+
		"d2\u0000\u034e\u034f\u0003\u01b8\u00dc\u0000\u034f\u0350\u0003d2\u0000"+
		"\u0350\u0356\u0001\u0000\u0000\u0000\u0351\u0352\u0003d2\u0000\u0352\u0353"+
		"\u0003\u01b8\u00dc\u0000\u0353\u0354\u0003j5\u0000\u0354\u0356\u0001\u0000"+
		"\u0000\u0000\u0355\u034d\u0001\u0000\u0000\u0000\u0355\u0351\u0001\u0000"+
		"\u0000\u0000\u0356k\u0001\u0000\u0000\u0000\u0357\u0358\u00066\uffff\uffff"+
		"\u0000\u0358\u0359\u0003d2\u0000\u0359\u035a\u0003\u01b4\u00da\u0000\u035a"+
		"\u035b\u0003d2\u0000\u035b\u0362\u0001\u0000\u0000\u0000\u035c\u035d\n"+
		"\u0001\u0000\u0000\u035d\u035e\u0003\u01b4\u00da\u0000\u035e\u035f\u0003"+
		"d2\u0000\u035f\u0361\u0001\u0000\u0000\u0000\u0360\u035c\u0001\u0000\u0000"+
		"\u0000\u0361\u0364\u0001\u0000\u0000\u0000\u0362\u0360\u0001\u0000\u0000"+
		"\u0000\u0362\u0363\u0001\u0000\u0000\u0000\u0363m\u0001\u0000\u0000\u0000"+
		"\u0364\u0362\u0001\u0000\u0000\u0000\u0365\u0366\u00067\uffff\uffff\u0000"+
		"\u0366\u0367\u0003d2\u0000\u0367\u0368\u0003\u01b6\u00db\u0000\u0368\u0369"+
		"\u0003d2\u0000\u0369\u0370\u0001\u0000\u0000\u0000\u036a\u036b\n\u0001"+
		"\u0000\u0000\u036b\u036c\u0003\u01b6\u00db\u0000\u036c\u036d\u0003d2\u0000"+
		"\u036d\u036f\u0001\u0000\u0000\u0000\u036e\u036a\u0001\u0000\u0000\u0000"+
		"\u036f\u0372\u0001\u0000\u0000\u0000\u0370\u036e\u0001\u0000\u0000\u0000"+
		"\u0370\u0371\u0001\u0000\u0000\u0000\u0371o\u0001\u0000\u0000\u0000\u0372"+
		"\u0370\u0001\u0000\u0000\u0000\u0373\u0374\u0003\u015e\u00af\u0000\u0374"+
		"\u0375\u0003\u0142\u00a1\u0000\u0375\u0376\u0003\u015c\u00ae\u0000\u0376"+
		"q\u0001\u0000\u0000\u0000\u0377\u0378\u0003<\u001e\u0000\u0378\u0379\u0003"+
		"\u0154\u00aa\u0000\u0379\u037a\u0003\u001a\r\u0000\u037as\u0001\u0000"+
		"\u0000\u0000\u037b\u037c\u0003X,\u0000\u037c\u037d\u0003\u0150\u00a8\u0000"+
		"\u037d\u037e\u0003X,\u0000\u037eu\u0001\u0000\u0000\u0000\u037f\u0383"+
		"\u0003x<\u0000\u0380\u0383\u0003\u00be_\u0000\u0381\u0383\u0003\u00d6"+
		"k\u0000\u0382\u037f\u0001\u0000\u0000\u0000\u0382\u0380\u0001\u0000\u0000"+
		"\u0000\u0382\u0381\u0001\u0000\u0000\u0000\u0383w\u0001\u0000\u0000\u0000"+
		"\u0384\u038b\u0003\u0088D\u0000\u0385\u038b\u0003\u0094J\u0000\u0386\u038b"+
		"\u0003z=\u0000\u0387\u038b\u0003\u00a2Q\u0000\u0388\u038b\u0003\u00d8"+
		"l\u0000\u0389\u038b\u0003\u00dam\u0000\u038a\u0384\u0001\u0000\u0000\u0000"+
		"\u038a\u0385\u0001\u0000\u0000\u0000\u038a\u0386\u0001\u0000\u0000\u0000"+
		"\u038a\u0387\u0001\u0000\u0000\u0000\u038a\u0388\u0001\u0000\u0000\u0000"+
		"\u038a\u0389\u0001\u0000\u0000\u0000\u038by\u0001\u0000\u0000\u0000\u038c"+
		"\u038f\u0003|>\u0000\u038d\u038f\u0003~?\u0000\u038e\u038c\u0001\u0000"+
		"\u0000\u0000\u038e\u038d\u0001\u0000\u0000\u0000\u038f{\u0001\u0000\u0000"+
		"\u0000\u0390\u0391\u0003\u0084B\u0000\u0391\u0392\u0003\u014a\u00a5\u0000"+
		"\u0392\u0393\u0003\u0084B\u0000\u0393}\u0001\u0000\u0000\u0000\u0394\u0397"+
		"\u0003\u0080@\u0000\u0395\u0397\u0003\u0082A\u0000\u0396\u0394\u0001\u0000"+
		"\u0000\u0000\u0396\u0395\u0001\u0000\u0000\u0000\u0397\u007f\u0001\u0000"+
		"\u0000\u0000\u0398\u0399\u0006@\uffff\uffff\u0000\u0399\u039a\u0003\u0084"+
		"B\u0000\u039a\u039b\u0003\u01b2\u00d9\u0000\u039b\u039c\u0003\u0084B\u0000"+
		"\u039c\u03a3\u0001\u0000\u0000\u0000\u039d\u039e\n\u0001\u0000\u0000\u039e"+
		"\u039f\u0003\u01b2\u00d9\u0000\u039f\u03a0\u0003\u0084B\u0000\u03a0\u03a2"+
		"\u0001\u0000\u0000\u0000\u03a1\u039d\u0001\u0000\u0000\u0000\u03a2\u03a5"+
		"\u0001\u0000\u0000\u0000\u03a3\u03a1\u0001\u0000\u0000\u0000\u03a3\u03a4"+
		"\u0001\u0000\u0000\u0000\u03a4\u0081\u0001\u0000\u0000\u0000\u03a5\u03a3"+
		"\u0001\u0000\u0000\u0000\u03a6\u03a7\u0006A\uffff\uffff\u0000\u03a7\u03a8"+
		"\u0003\u0084B\u0000\u03a8\u03a9\u0005\n\u0000\u0000\u03a9\u03aa\u0003"+
		"\u0084B\u0000\u03aa\u03b0\u0001\u0000\u0000\u0000\u03ab\u03ac\n\u0001"+
		"\u0000\u0000\u03ac\u03ad\u0005\n\u0000\u0000\u03ad\u03af\u0003\u0084B"+
		"\u0000\u03ae\u03ab\u0001\u0000\u0000\u0000\u03af\u03b2\u0001\u0000\u0000"+
		"\u0000\u03b0\u03ae\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001\u0000\u0000"+
		"\u0000\u03b1\u0083\u0001\u0000\u0000\u0000\u03b2\u03b0\u0001\u0000\u0000"+
		"\u0000\u03b3\u03b7\u0003\u0088D\u0000\u03b4\u03b7\u0003\u0094J\u0000\u03b5"+
		"\u03b7\u0003\u00a2Q\u0000\u03b6\u03b3\u0001\u0000\u0000\u0000\u03b6\u03b4"+
		"\u0001\u0000\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b7\u0085"+
		"\u0001\u0000\u0000\u0000\u03b8\u03bb\u0003\u0088D\u0000\u03b9\u03bb\u0003"+
		"\u0096K\u0000\u03ba\u03b8\u0001\u0000\u0000\u0000\u03ba\u03b9\u0001\u0000"+
		"\u0000\u0000\u03bb\u0087\u0001\u0000\u0000\u0000\u03bc\u03c4\u0003\u008c"+
		"F\u0000\u03bd\u03c4\u0003\u009aM\u0000\u03be\u03c4\u0003\u008aE\u0000"+
		"\u03bf\u03c0\u0005\f\u0000\u0000\u03c0\u03c1\u0003x<\u0000\u03c1\u03c2"+
		"\u0005\r\u0000\u0000\u03c2\u03c4\u0001\u0000\u0000\u0000\u03c3\u03bc\u0001"+
		"\u0000\u0000\u0000\u03c3\u03bd\u0001\u0000\u0000\u0000\u03c3\u03be\u0001"+
		"\u0000\u0000\u0000\u03c3\u03bf\u0001\u0000\u0000\u0000\u03c4\u0089\u0001"+
		"\u0000\u0000\u0000\u03c5\u03c6\u0003\u0178\u00bc\u0000\u03c6\u008b\u0001"+
		"\u0000\u0000\u0000\u03c7\u03c8\u0003\u0146\u00a3\u0000\u03c8\u03c9\u0005"+
		"\u000e\u0000\u0000\u03c9\u03ca\u0003\u008eG\u0000\u03ca\u03cb\u0005\u000f"+
		"\u0000\u0000\u03cb\u03cc\u0005\u0010\u0000\u0000\u03cc\u03cd\u0003\u0084"+
		"B\u0000\u03cd\u008d\u0001\u0000\u0000\u0000\u03ce\u03d4\u0003\u0090H\u0000"+
		"\u03cf\u03d0\u0003\u0090H\u0000\u03d0\u03d1\u0005\u0002\u0000\u0000\u03d1"+
		"\u03d2\u0003\u008eG\u0000\u03d2\u03d4\u0001\u0000\u0000\u0000\u03d3\u03ce"+
		"\u0001\u0000\u0000\u0000\u03d3\u03cf\u0001\u0000\u0000\u0000\u03d4\u008f"+
		"\u0001\u0000\u0000\u0000\u03d5\u03d8\u0003\u0092I\u0000\u03d6\u03d8\u0003"+
		"\u0178\u00bc\u0000\u03d7\u03d5\u0001\u0000\u0000\u0000\u03d7\u03d6\u0001"+
		"\u0000\u0000\u0000\u03d8\u0091\u0001\u0000\u0000\u0000\u03d9\u03da\u0003"+
		"\u0178\u00bc\u0000\u03da\u03db\u0005\u0010\u0000\u0000\u03db\u03dc\u0003"+
		"\u00cae\u0000\u03dc\u0093\u0001\u0000\u0000\u0000\u03dd\u03e0\u0003\u0096"+
		"K\u0000\u03de\u03e0\u0003\u0098L\u0000\u03df\u03dd\u0001\u0000\u0000\u0000"+
		"\u03df\u03de\u0001\u0000\u0000\u0000\u03e0\u0095\u0001\u0000\u0000\u0000"+
		"\u03e1\u03e2\u0003\u0144\u00a2\u0000\u03e2\u03e3\u0003\u0086C\u0000\u03e3"+
		"\u0097\u0001\u0000\u0000\u0000\u03e4\u03e5\u0005\f\u0000\u0000\u03e5\u03e6"+
		"\u0003\u00b8\\\u0000\u03e6\u03e7\u0003\u0164\u00b2\u0000\u03e7\u03e8\u0003"+
		"\u00b8\\\u0000\u03e8\u03e9\u0005\r\u0000\u0000\u03e9\u0099\u0001\u0000"+
		"\u0000\u0000\u03ea\u03ee\u0003\u009cN\u0000\u03eb\u03ee\u0003\u009eO\u0000"+
		"\u03ec\u03ee\u0003\u00a4R\u0000\u03ed\u03ea\u0001\u0000\u0000\u0000\u03ed"+
		"\u03eb\u0001\u0000\u0000\u0000\u03ed\u03ec\u0001\u0000\u0000\u0000\u03ee"+
		"\u009b\u0001\u0000\u0000\u0000\u03ef\u03f6\u0003\u0166\u00b3\u0000\u03f0"+
		"\u03f1\u0003\u0168\u00b4\u0000\u03f1\u03f2\u0005\f\u0000\u0000\u03f2\u03f3"+
		"\u0003\u00bc^\u0000\u03f3\u03f4\u0005\r\u0000\u0000\u03f4\u03f6\u0001"+
		"\u0000\u0000\u0000\u03f5\u03ef\u0001\u0000\u0000\u0000\u03f5\u03f0\u0001"+
		"\u0000\u0000\u0000\u03f6\u009d\u0001\u0000\u0000\u0000\u03f7\u03f8\u0003"+
		"\u00a0P\u0000\u03f8\u009f\u0001\u0000\u0000\u0000\u03f9\u0402\u0003\u016a"+
		"\u00b5\u0000\u03fa\u03fb\u0003\u016c\u00b6\u0000\u03fb\u03fc\u0005\f\u0000"+
		"\u0000\u03fc\u03fd\u0003\u00bc^\u0000\u03fd\u03fe\u0005\r\u0000\u0000"+
		"\u03fe\u0402\u0001\u0000\u0000\u0000\u03ff\u0402\u0003\u00b4Z\u0000\u0400"+
		"\u0402\u0003\u00a6S\u0000\u0401\u03f9\u0001\u0000\u0000\u0000\u0401\u03fa"+
		"\u0001\u0000\u0000\u0000\u0401\u03ff\u0001\u0000\u0000\u0000\u0401\u0400"+
		"\u0001\u0000\u0000\u0000\u0402\u00a1\u0001\u0000\u0000\u0000\u0403\u0404"+
		"\u0005\f\u0000\u0000\u0404\u0405\u0003\u00b8\\\u0000\u0405\u0406\u0003"+
		"\u0160\u00b0\u0000\u0406\u0407\u0003\u00b8\\\u0000\u0407\u0408\u0005\r"+
		"\u0000\u0000\u0408\u00a3\u0001\u0000\u0000\u0000\u0409\u0410\u0003\u016e"+
		"\u00b7\u0000\u040a\u040b\u0003\u0170\u00b8\u0000\u040b\u040c\u0005\f\u0000"+
		"\u0000\u040c\u040d\u0003\u00bc^\u0000\u040d\u040e\u0005\r\u0000\u0000"+
		"\u040e\u0410\u0001\u0000\u0000\u0000\u040f\u0409\u0001\u0000\u0000\u0000"+
		"\u040f\u040a\u0001\u0000\u0000\u0000\u0410\u00a5\u0001\u0000\u0000\u0000"+
		"\u0411\u0412\u0005\u0011\u0000\u0000\u0412\u0413\u0003\u00a8T\u0000\u0413"+
		"\u0414\u0005\u0002\u0000\u0000\u0414\u0415\u0003\u00acV\u0000\u0415\u0416"+
		"\u0005\u0002\u0000\u0000\u0416\u0417\u0003\u00b6[\u0000\u0417\u0418\u0005"+
		"\r\u0000\u0000\u0418\u00a7\u0001\u0000\u0000\u0000\u0419\u041f\u0003\u00be"+
		"_\u0000\u041a\u041b\u0005\u000e\u0000\u0000\u041b\u041c\u0003\u00aaU\u0000"+
		"\u041c\u041d\u0005\u000f\u0000\u0000\u041d\u041f\u0001\u0000\u0000\u0000"+
		"\u041e\u0419\u0001\u0000\u0000\u0000\u041e\u041a\u0001\u0000\u0000\u0000"+
		"\u041f\u00a9\u0001\u0000\u0000\u0000\u0420\u0426\u0003\u00be_\u0000\u0421"+
		"\u0422\u0003\u00be_\u0000\u0422\u0423\u0005\u0002\u0000\u0000\u0423\u0424"+
		"\u0003\u00aaU\u0000\u0424\u0426\u0001\u0000\u0000\u0000\u0425\u0420\u0001"+
		"\u0000\u0000\u0000\u0425\u0421\u0001\u0000\u0000\u0000\u0426\u00ab\u0001"+
		"\u0000\u0000\u0000\u0427\u042d\u0003\u00aeW\u0000\u0428\u0429\u0005\u000e"+
		"\u0000\u0000\u0429\u042a\u0003\u00b2Y\u0000\u042a\u042b\u0005\u000f\u0000"+
		"\u0000\u042b\u042d\u0001\u0000\u0000\u0000\u042c\u0427\u0001\u0000\u0000"+
		"\u0000\u042c\u0428\u0001\u0000\u0000\u0000\u042d\u00ad\u0001\u0000\u0000"+
		"\u0000\u042e\u042f\u0003\u00b0X\u0000\u042f\u0430\u0003\u0152\u00a9\u0000"+
		"\u0430\u0431\u0003\u00b6[\u0000\u0431\u00af\u0001\u0000\u0000\u0000\u0432"+
		"\u0435\u0003\u009cN\u0000\u0433\u0435\u0003\u00ba]\u0000\u0434\u0432\u0001"+
		"\u0000\u0000\u0000\u0434\u0433\u0001\u0000\u0000\u0000\u0435\u00b1\u0001"+
		"\u0000\u0000\u0000\u0436\u043c\u0003\u00aeW\u0000\u0437\u0438\u0003\u00ae"+
		"W\u0000\u0438\u0439\u0005\u0002\u0000\u0000\u0439\u043a\u0003\u00b2Y\u0000"+
		"\u043a\u043c\u0001\u0000\u0000\u0000\u043b\u0436\u0001\u0000\u0000\u0000"+
		"\u043b\u0437\u0001\u0000\u0000\u0000\u043c\u00b3\u0001\u0000\u0000\u0000"+
		"\u043d\u043e\u0003\u00e4r\u0000\u043e\u043f\u0005\u000b\u0000\u0000\u043f"+
		"\u0440\u0005\f\u0000\u0000\u0440\u0441\u0003\u00bc^\u0000\u0441\u0442"+
		"\u0005\r\u0000\u0000\u0442\u00b5\u0001\u0000\u0000\u0000\u0443\u0447\u0003"+
		"x<\u0000\u0444\u0447\u0003\u0176\u00bb\u0000\u0445\u0447\u0003\u00ba]"+
		"\u0000\u0446\u0443\u0001\u0000\u0000\u0000\u0446\u0444\u0001\u0000\u0000"+
		"\u0000\u0446\u0445\u0001\u0000\u0000\u0000\u0447\u00b7\u0001\u0000\u0000"+
		"\u0000\u0448\u0451\u0003\u009aM\u0000\u0449\u0451\u0003\u0176\u00bb\u0000"+
		"\u044a\u0451\u0003\u00ba]\u0000\u044b\u0451\u0003\u0178\u00bc\u0000\u044c"+
		"\u044d\u0005\f\u0000\u0000\u044d\u044e\u0003x<\u0000\u044e\u044f\u0005"+
		"\r\u0000\u0000\u044f\u0451\u0001\u0000\u0000\u0000\u0450\u0448\u0001\u0000"+
		"\u0000\u0000\u0450\u0449\u0001\u0000\u0000\u0000\u0450\u044a\u0001\u0000"+
		"\u0000\u0000\u0450\u044b\u0001\u0000\u0000\u0000\u0450\u044c\u0001\u0000"+
		"\u0000\u0000\u0451\u00b9\u0001\u0000\u0000\u0000\u0452\u0458\u0005\u0012"+
		"\u0000\u0000\u0453\u0454\u0005\u000e\u0000\u0000\u0454\u0455\u0003\u00bc"+
		"^\u0000\u0455\u0456\u0005\u000f\u0000\u0000\u0456\u0458\u0001\u0000\u0000"+
		"\u0000\u0457\u0452\u0001\u0000\u0000\u0000\u0457\u0453\u0001\u0000\u0000"+
		"\u0000\u0458\u00bb\u0001\u0000\u0000\u0000\u0459\u045f\u0003\u00b6[\u0000"+
		"\u045a\u045b\u0003\u00b6[\u0000\u045b\u045c\u0005\u0002\u0000\u0000\u045c"+
		"\u045d\u0003\u00bc^\u0000\u045d\u045f\u0001\u0000\u0000\u0000\u045e\u0459"+
		"\u0001\u0000\u0000\u0000\u045e\u045a\u0001\u0000\u0000\u0000\u045f\u00bd"+
		"\u0001\u0000\u0000\u0000\u0460\u0461\u0003\u015e\u00af\u0000\u0461\u0462"+
		"\u0005\u0010\u0000\u0000\u0462\u0463\u0003\u00c0`\u0000\u0463\u0469\u0001"+
		"\u0000\u0000\u0000\u0464\u0465\u0005\f\u0000\u0000\u0465\u0466\u0003\u00be"+
		"_\u0000\u0466\u0467\u0005\r\u0000\u0000\u0467\u0469\u0001\u0000\u0000"+
		"\u0000\u0468\u0460\u0001\u0000\u0000\u0000\u0468\u0464\u0001\u0000\u0000"+
		"\u0000\u0469\u00bf\u0001\u0000\u0000\u0000\u046a\u046d\u0003\u00cae\u0000"+
		"\u046b\u046d\u0003\u00c2a\u0000\u046c\u046a\u0001\u0000\u0000\u0000\u046c"+
		"\u046b\u0001\u0000\u0000\u0000\u046d\u00c1\u0001\u0000\u0000\u0000\u046e"+
		"\u0475\u0003\u00ceg\u0000\u046f\u0475\u0003\u00c4b\u0000\u0470\u0471\u0005"+
		"\f\u0000\u0000\u0471\u0472\u0003\u00c2a\u0000\u0472\u0473\u0005\r\u0000"+
		"\u0000\u0473\u0475\u0001\u0000\u0000\u0000\u0474\u046e\u0001\u0000\u0000"+
		"\u0000\u0474\u046f\u0001\u0000\u0000\u0000\u0474\u0470\u0001\u0000\u0000"+
		"\u0000\u0475\u00c3\u0001\u0000\u0000\u0000\u0476\u0477\u0005\u0013\u0000"+
		"\u0000\u0477\u0478\u0005\u000e\u0000\u0000\u0478\u0479\u0003\u008eG\u0000"+
		"\u0479\u047a\u0005\u000f\u0000\u0000\u047a\u047b\u0005\u0010\u0000\u0000"+
		"\u047b\u047c\u0003\u00c6c\u0000\u047c\u00c5\u0001\u0000\u0000\u0000\u047d"+
		"\u0484\u0003\u00cae\u0000\u047e\u047f\u0005\f\u0000\u0000\u047f\u0480"+
		"\u0003\u00ceg\u0000\u0480\u0481\u0005\r\u0000\u0000\u0481\u0484\u0001"+
		"\u0000\u0000\u0000\u0482\u0484\u0003\u00c4b\u0000\u0483\u047d\u0001\u0000"+
		"\u0000\u0000\u0483\u047e\u0001\u0000\u0000\u0000\u0483\u0482\u0001\u0000"+
		"\u0000\u0000\u0484\u00c7\u0001\u0000\u0000\u0000\u0485\u048b\u0003\u00ca"+
		"e\u0000\u0486\u0487\u0005\f\u0000\u0000\u0487\u0488\u0003\u00d0h\u0000"+
		"\u0488\u0489\u0005\r\u0000\u0000\u0489\u048b\u0001\u0000\u0000\u0000\u048a"+
		"\u0485\u0001\u0000\u0000\u0000\u048a\u0486\u0001\u0000\u0000\u0000\u048b"+
		"\u00c9\u0001\u0000\u0000\u0000\u048c\u049a\u0003\u0156\u00ab\u0000\u048d"+
		"\u049a\u0003\u015a\u00ad\u0000\u048e\u049a\u0003\u0178\u00bc\u0000\u048f"+
		"\u0490\u0003\u0158\u00ac\u0000\u0490\u0491\u0005\f\u0000\u0000\u0491\u0492"+
		"\u0003\u00ccf\u0000\u0492\u0493\u0005\r\u0000\u0000\u0493\u049a\u0001"+
		"\u0000\u0000\u0000\u0494\u0495\u0005\f\u0000\u0000\u0495\u0496\u0003\u00ca"+
		"e\u0000\u0496\u0497\u0005\r\u0000\u0000\u0497\u049a\u0001\u0000\u0000"+
		"\u0000\u0498\u049a\u0003\u00d2i\u0000\u0499\u048c\u0001\u0000\u0000\u0000"+
		"\u0499\u048d\u0001\u0000\u0000\u0000\u0499\u048e\u0001\u0000\u0000\u0000"+
		"\u0499\u048f\u0001\u0000\u0000\u0000\u0499\u0494\u0001\u0000\u0000\u0000"+
		"\u0499\u0498\u0001\u0000\u0000\u0000\u049a\u00cb\u0001\u0000\u0000\u0000"+
		"\u049b\u04a1\u0003\u00cae\u0000\u049c\u049d\u0003\u00cae\u0000\u049d\u049e"+
		"\u0005\u0002\u0000\u0000\u049e\u049f\u0003\u00ccf\u0000\u049f\u04a1\u0001"+
		"\u0000\u0000\u0000\u04a0\u049b\u0001\u0000\u0000\u0000\u04a0\u049c\u0001"+
		"\u0000\u0000\u0000\u04a1\u00cd\u0001\u0000\u0000\u0000\u04a2\u04a3\u0003"+
		"\u00c8d\u0000\u04a3\u04a4\u0003\u01b8\u00dc\u0000\u04a4\u04a5\u0003\u00ca"+
		"e\u0000\u04a5\u00cf\u0001\u0000\u0000\u0000\u04a6\u04a7\u0006h\uffff\uffff"+
		"\u0000\u04a7\u04a8\u0003\u00c8d\u0000\u04a8\u04a9\u0003\u01b4\u00da\u0000"+
		"\u04a9\u04aa\u0003\u00cae\u0000\u04aa\u04b1\u0001\u0000\u0000\u0000\u04ab"+
		"\u04ac\n\u0001\u0000\u0000\u04ac\u04ad\u0003\u01b4\u00da\u0000\u04ad\u04ae"+
		"\u0003\u00cae\u0000\u04ae\u04b0\u0001\u0000\u0000\u0000\u04af\u04ab\u0001"+
		"\u0000\u0000\u0000\u04b0\u04b3\u0001\u0000\u0000\u0000\u04b1\u04af\u0001"+
		"\u0000\u0000\u0000\u04b1\u04b2\u0001\u0000\u0000\u0000\u04b2\u00d1\u0001"+
		"\u0000\u0000\u0000\u04b3\u04b1\u0001\u0000\u0000\u0000\u04b4\u04b5\u0005"+
		"\u000e\u0000\u0000\u04b5\u04b6\u0003\u00d4j\u0000\u04b6\u04b7\u0005\u000f"+
		"\u0000\u0000\u04b7\u00d3\u0001\u0000\u0000\u0000\u04b8\u04be\u0003\u00c0"+
		"`\u0000\u04b9\u04ba\u0003\u00c0`\u0000\u04ba\u04bb\u0005\u0002\u0000\u0000"+
		"\u04bb\u04bc\u0003\u00d4j\u0000\u04bc\u04be\u0001\u0000\u0000\u0000\u04bd"+
		"\u04b8\u0001\u0000\u0000\u0000\u04bd\u04b9\u0001\u0000\u0000\u0000\u04be"+
		"\u00d5\u0001\u0000\u0000\u0000\u04bf\u04c0\u0003\u015e\u00af\u0000\u04c0"+
		"\u04c1\u0003\u0142\u00a1\u0000\u04c1\u04c2\u0003\u015c\u00ae\u0000\u04c2"+
		"\u00d7\u0001\u0000\u0000\u0000\u04c3\u04c4\u0003\u009aM\u0000\u04c4\u04c5"+
		"\u0003\u0154\u00aa\u0000\u04c5\u04c6\u0003\u00b6[\u0000\u04c6\u00d9\u0001"+
		"\u0000\u0000\u0000\u04c7\u04c8\u0003\u00ba]\u0000\u04c8\u04c9\u0003\u0150"+
		"\u00a8\u0000\u04c9\u04ca\u0003\u00ba]\u0000\u04ca\u00db\u0001\u0000\u0000"+
		"\u0000\u04cb\u04cc\u0005\u0014\u0000\u0000\u04cc\u04cd\u0003\u00ecv\u0000"+
		"\u04cd\u04ce\u0005\u0015\u0000\u0000\u04ce\u04d6\u0001\u0000\u0000\u0000"+
		"\u04cf\u04d0\u0005\u0014\u0000\u0000\u04d0\u04d1\u0003\u00ecv\u0000\u04d1"+
		"\u04d2\u0005\f\u0000\u0000\u04d2\u04d3\u0003\u00deo\u0000\u04d3\u04d4"+
		"\u0005\u0016\u0000\u0000\u04d4\u04d6\u0001\u0000\u0000\u0000\u04d5\u04cb"+
		"\u0001\u0000\u0000\u0000\u04d5\u04cf\u0001\u0000\u0000\u0000\u04d6\u00dd"+
		"\u0001\u0000\u0000\u0000\u04d7\u04dd\u0003\u00e0p\u0000\u04d8\u04d9\u0003"+
		"\u00e0p\u0000\u04d9\u04da\u0005\u0002\u0000\u0000\u04da\u04db\u0003\u00de"+
		"o\u0000\u04db\u04dd\u0001\u0000\u0000\u0000\u04dc\u04d7\u0001\u0000\u0000"+
		"\u0000\u04dc\u04d8\u0001\u0000\u0000\u0000\u04dd\u00df\u0001\u0000\u0000"+
		"\u0000\u04de\u04e1\u0003\u00eew\u0000\u04df\u04e1\u0003\u00e2q\u0000\u04e0"+
		"\u04de\u0001\u0000\u0000\u0000\u04e0\u04df\u0001\u0000\u0000\u0000\u04e1"+
		"\u00e1\u0001\u0000\u0000\u0000\u04e2\u04e3\u0003r9\u0000\u04e3\u00e3\u0001"+
		"\u0000\u0000\u0000\u04e4\u04e5\u0005\u0014\u0000\u0000\u04e5\u04e6\u0003"+
		"\u00ecv\u0000\u04e6\u04e7\u0005\u0015\u0000\u0000\u04e7\u04ef\u0001\u0000"+
		"\u0000\u0000\u04e8\u04e9\u0005\u0014\u0000\u0000\u04e9\u04ea\u0003\u00ec"+
		"v\u0000\u04ea\u04eb\u0005\f\u0000\u0000\u04eb\u04ec\u0003\u00e6s\u0000"+
		"\u04ec\u04ed\u0005\u0016\u0000\u0000\u04ed\u04ef\u0001\u0000\u0000\u0000"+
		"\u04ee\u04e4\u0001\u0000\u0000\u0000\u04ee\u04e8\u0001\u0000\u0000\u0000"+
		"\u04ef\u00e5\u0001\u0000\u0000\u0000\u04f0\u04f6\u0003\u00e8t\u0000\u04f1"+
		"\u04f2\u0003\u00e8t\u0000\u04f2\u04f3\u0005\u0002\u0000\u0000\u04f3\u04f4"+
		"\u0003\u00e6s\u0000\u04f4\u04f6\u0001\u0000\u0000\u0000\u04f5\u04f0\u0001"+
		"\u0000\u0000\u0000\u04f5\u04f1\u0001\u0000\u0000\u0000\u04f6\u00e7\u0001"+
		"\u0000\u0000\u0000\u04f7\u04fa\u0003\u00eew\u0000\u04f8\u04fa\u0003\u00ea"+
		"u\u0000\u04f9\u04f7\u0001\u0000\u0000\u0000\u04f9\u04f8\u0001\u0000\u0000"+
		"\u0000\u04fa\u00e9\u0001\u0000\u0000\u0000\u04fb\u04fc\u0003\u00d8l\u0000"+
		"\u04fc\u00eb\u0001\u0000\u0000\u0000\u04fd\u04fe\u0003\u0172\u00b9\u0000"+
		"\u04fe\u00ed\u0001\u0000\u0000\u0000\u04ff\u0500\u0003\u01bc\u00de\u0000"+
		"\u0500\u0501\u0003\u00b8\\\u0000\u0501\u00ef\u0001\u0000\u0000\u0000\u0502"+
		"\u050a\u0005\u0017\u0000\u0000\u0503\u0504\u0003\u01ba\u00dd\u0000\u0504"+
		"\u0505\u0005\u0018\u0000\u0000\u0505\u0506\u0003\u01b8\u00dc\u0000\u0506"+
		"\u050a\u0001\u0000\u0000\u0000\u0507\u050a\u0005\u0019\u0000\u0000\u0508"+
		"\u050a\u0005\u001a\u0000\u0000\u0509\u0502\u0001\u0000\u0000\u0000\u0509"+
		"\u0503\u0001\u0000\u0000\u0000\u0509\u0507\u0001\u0000\u0000\u0000\u0509"+
		"\u0508\u0001\u0000\u0000\u0000\u050a\u00f1\u0001\u0000\u0000\u0000\u050b"+
		"\u050e\u0003\u00f4z\u0000\u050c\u050e\u0003\u00be_\u0000\u050d\u050b\u0001"+
		"\u0000\u0000\u0000\u050d\u050c\u0001\u0000\u0000\u0000\u050e\u00f3\u0001"+
		"\u0000\u0000\u0000\u050f\u0512\u0003\u00f6{\u0000\u0510\u0512\u0003\u0134"+
		"\u009a\u0000\u0511\u050f\u0001\u0000\u0000\u0000\u0511\u0510\u0001\u0000"+
		"\u0000\u0000\u0512\u00f5\u0001\u0000\u0000\u0000\u0513\u0514\u0005\u001b"+
		"\u0000\u0000\u0514\u0515\u0005\u000e\u0000\u0000\u0515\u0516\u0003\u008e"+
		"G\u0000\u0516\u0517\u0005\u000f\u0000\u0000\u0517\u0518\u0005\u0010\u0000"+
		"\u0000\u0518\u0519\u0003\u00f4z\u0000\u0519\u00f7\u0001\u0000\u0000\u0000"+
		"\u051a\u051d\u0003\u00fa}\u0000\u051b\u051d\u0003\u012e\u0097\u0000\u051c"+
		"\u051a\u0001\u0000\u0000\u0000\u051c\u051b\u0001\u0000\u0000\u0000\u051d"+
		"\u00f9\u0001\u0000\u0000\u0000\u051e\u0522\u0003\u00fc~\u0000\u051f\u0522"+
		"\u0003\u0106\u0083\u0000\u0520\u0522\u0003\u010c\u0086\u0000\u0521\u051e"+
		"\u0001\u0000\u0000\u0000\u0521\u051f\u0001\u0000\u0000\u0000\u0521\u0520"+
		"\u0001\u0000\u0000\u0000\u0522\u00fb\u0001\u0000\u0000\u0000\u0523\u0526"+
		"\u0003\u00fe\u007f\u0000\u0524\u0526\u0003\u0100\u0080\u0000\u0525\u0523"+
		"\u0001\u0000\u0000\u0000\u0525\u0524\u0001\u0000\u0000\u0000\u0526\u00fd"+
		"\u0001\u0000\u0000\u0000\u0527\u0528\u0003\u010a\u0085\u0000\u0528\u0529"+
		"\u0003\u014a\u00a5\u0000\u0529\u052a\u0003\u010a\u0085\u0000\u052a\u00ff"+
		"\u0001\u0000\u0000\u0000\u052b\u052e\u0003\u0102\u0081\u0000\u052c\u052e"+
		"\u0003\u0104\u0082\u0000\u052d\u052b\u0001\u0000\u0000\u0000\u052d\u052c"+
		"\u0001\u0000\u0000\u0000\u052e\u0101\u0001\u0000\u0000\u0000\u052f\u0530"+
		"\u0006\u0081\uffff\uffff\u0000\u0530\u0531\u0003\u010a\u0085\u0000\u0531"+
		"\u0532\u0003\u01b2\u00d9\u0000\u0532\u0533\u0003\u010a\u0085\u0000\u0533"+
		"\u053a\u0001\u0000\u0000\u0000\u0534\u0535\n\u0001\u0000\u0000\u0535\u0536"+
		"\u0003\u01b2\u00d9\u0000\u0536\u0537\u0003\u010a\u0085\u0000\u0537\u0539"+
		"\u0001\u0000\u0000\u0000\u0538\u0534\u0001\u0000\u0000\u0000\u0539\u053c"+
		"\u0001\u0000\u0000\u0000\u053a\u0538\u0001\u0000\u0000\u0000\u053a\u053b"+
		"\u0001\u0000\u0000\u0000\u053b\u0103\u0001\u0000\u0000\u0000\u053c\u053a"+
		"\u0001\u0000\u0000\u0000\u053d\u053e\u0006\u0082\uffff\uffff\u0000\u053e"+
		"\u053f\u0003\u010a\u0085\u0000\u053f\u0540\u0005\n\u0000\u0000\u0540\u0541"+
		"\u0003\u010a\u0085\u0000\u0541\u0547\u0001\u0000\u0000\u0000\u0542\u0543"+
		"\n\u0001\u0000\u0000\u0543\u0544\u0005\n\u0000\u0000\u0544\u0546\u0003"+
		"\u010a\u0085\u0000\u0545\u0542\u0001\u0000\u0000\u0000\u0546\u0549\u0001"+
		"\u0000\u0000\u0000\u0547\u0545\u0001\u0000\u0000\u0000\u0547\u0548\u0001"+
		"\u0000\u0000\u0000\u0548\u0105\u0001\u0000\u0000\u0000\u0549\u0547\u0001"+
		"\u0000\u0000\u0000\u054a\u054b\u0003\u014e\u00a7\u0000\u054b\u054c\u0003"+
		"\u010a\u0085\u0000\u054c\u054f\u0001\u0000\u0000\u0000\u054d\u054f\u0003"+
		"\u0108\u0084\u0000\u054e\u054a\u0001\u0000\u0000\u0000\u054e\u054d\u0001"+
		"\u0000\u0000\u0000\u054f\u0107\u0001\u0000\u0000\u0000\u0550\u0551\u0003"+
		"\u012a\u0095\u0000\u0551\u0552\u0003\u0164\u00b2\u0000\u0552\u0553\u0003"+
		"\u012a\u0095\u0000\u0553\u0109\u0001\u0000\u0000\u0000\u0554\u0557\u0003"+
		"\u010c\u0086\u0000\u0555\u0557\u0003\u0106\u0083\u0000\u0556\u0554\u0001"+
		"\u0000\u0000\u0000\u0556\u0555\u0001\u0000\u0000\u0000\u0557\u010b\u0001"+
		"\u0000\u0000\u0000\u0558\u055f\u0003\u010e\u0087\u0000\u0559\u055f\u0003"+
		"\u0112\u0089\u0000\u055a\u055b\u0005\f\u0000\u0000\u055b\u055c\u0003\u00fa"+
		"}\u0000\u055c\u055d\u0005\r\u0000\u0000\u055d\u055f\u0001\u0000\u0000"+
		"\u0000\u055e\u0558\u0001\u0000\u0000\u0000\u055e\u0559\u0001\u0000\u0000"+
		"\u0000\u055e\u055a\u0001\u0000\u0000\u0000\u055f\u010d\u0001\u0000\u0000"+
		"\u0000\u0560\u0561\u0003\u0148\u00a4\u0000\u0561\u0562\u0005\u000e\u0000"+
		"\u0000\u0562\u0563\u0003\u0110\u0088\u0000\u0563\u0564\u0005\u000f\u0000"+
		"\u0000\u0564\u0565\u0005\u0010\u0000\u0000\u0565\u0566\u0003\u010a\u0085"+
		"\u0000\u0566\u010f\u0001\u0000\u0000\u0000\u0567\u056d\u0003\u0178\u00bc"+
		"\u0000\u0568\u0569\u0003\u0178\u00bc\u0000\u0569\u056a\u0005\u0002\u0000"+
		"\u0000\u056a\u056b\u0003\u0110\u0088\u0000\u056b\u056d\u0001\u0000\u0000"+
		"\u0000\u056c\u0567\u0001\u0000\u0000\u0000\u056c\u0568\u0001\u0000\u0000"+
		"\u0000\u056d\u0111\u0001\u0000\u0000\u0000\u056e\u0572\u0003\u0114\u008a"+
		"\u0000\u056f\u0572\u0003\u0116\u008b\u0000\u0570\u0572\u0003\u011c\u008e"+
		"\u0000\u0571\u056e\u0001\u0000\u0000\u0000\u0571\u056f\u0001\u0000\u0000"+
		"\u0000\u0571\u0570\u0001\u0000\u0000\u0000\u0572\u0113\u0001\u0000\u0000"+
		"\u0000\u0573\u0574\u0003\u011e\u008f\u0000\u0574\u0115\u0001\u0000\u0000"+
		"\u0000\u0575\u0578\u0003\u0118\u008c\u0000\u0576\u0578\u0003\u011a\u008d"+
		"\u0000\u0577\u0575\u0001\u0000\u0000\u0000\u0577\u0576\u0001\u0000\u0000"+
		"\u0000\u0578\u0117\u0001\u0000\u0000\u0000\u0579\u057a\u0003\u0124\u0092"+
		"\u0000\u057a\u0119\u0001\u0000\u0000\u0000\u057b\u057c\u0003\u012a\u0095"+
		"\u0000\u057c\u057d\u0003\u0160\u00b0\u0000\u057d\u057e\u0003\u012a\u0095"+
		"\u0000\u057e\u011b\u0001\u0000\u0000\u0000\u057f\u0580\u0003\u0126\u0093"+
		"\u0000\u0580\u011d\u0001\u0000\u0000\u0000\u0581\u0588\u0003\u0166\u00b3"+
		"\u0000\u0582\u0583\u0003\u0168\u00b4\u0000\u0583\u0584\u0005\f\u0000\u0000"+
		"\u0584\u0585\u0003\u0128\u0094\u0000\u0585\u0586\u0005\r\u0000\u0000\u0586"+
		"\u0588\u0001\u0000\u0000\u0000\u0587\u0581\u0001\u0000\u0000\u0000\u0587"+
		"\u0582\u0001\u0000\u0000\u0000\u0588\u011f\u0001\u0000\u0000\u0000\u0589"+
		"\u058c\u0003\u0176\u00bb\u0000\u058a\u058c\u0003\u0122\u0091\u0000\u058b"+
		"\u0589\u0001\u0000\u0000\u0000\u058b\u058a\u0001\u0000\u0000\u0000\u058c"+
		"\u0121\u0001\u0000\u0000\u0000\u058d\u058e\u0003\u0124\u0092\u0000\u058e"+
		"\u0123\u0001\u0000\u0000\u0000\u058f\u0596\u0003\u016a\u00b5\u0000\u0590"+
		"\u0591\u0003\u016c\u00b6\u0000\u0591\u0592\u0005\f\u0000\u0000\u0592\u0593"+
		"\u0003\u0128\u0094\u0000\u0593\u0594\u0005\r\u0000\u0000\u0594\u0596\u0001"+
		"\u0000\u0000\u0000\u0595\u058f\u0001\u0000\u0000\u0000\u0595\u0590\u0001"+
		"\u0000\u0000\u0000\u0596\u0125\u0001\u0000\u0000\u0000\u0597\u059e\u0003"+
		"\u016e\u00b7\u0000\u0598\u0599\u0003\u0170\u00b8\u0000\u0599\u059a\u0005"+
		"\f\u0000\u0000\u059a\u059b\u0003\u0128\u0094\u0000\u059b\u059c\u0005\r"+
		"\u0000\u0000\u059c\u059e\u0001\u0000\u0000\u0000\u059d\u0597\u0001\u0000"+
		"\u0000\u0000\u059d\u0598\u0001\u0000\u0000\u0000\u059e\u0127\u0001\u0000"+
		"\u0000\u0000\u059f\u05a5\u0003\u012a\u0095\u0000\u05a0\u05a1\u0003\u012a"+
		"\u0095\u0000\u05a1\u05a2\u0005\u0002\u0000\u0000\u05a2\u05a3\u0003\u0128"+
		"\u0094\u0000\u05a3\u05a5\u0001\u0000\u0000\u0000\u05a4\u059f\u0001\u0000"+
		"\u0000\u0000\u05a4\u05a0\u0001\u0000\u0000\u0000\u05a5\u0129\u0001\u0000"+
		"\u0000\u0000\u05a6\u05a9\u0003\u012c\u0096\u0000\u05a7\u05a9\u0003\u0178"+
		"\u00bc\u0000\u05a8\u05a6\u0001\u0000\u0000\u0000\u05a8\u05a7\u0001\u0000"+
		"\u0000\u0000\u05a9\u012b\u0001\u0000\u0000\u0000\u05aa\u05ae\u0003\u011e"+
		"\u008f\u0000\u05ab\u05ae\u0003\u0120\u0090\u0000\u05ac\u05ae\u0003\u0126"+
		"\u0093\u0000\u05ad\u05aa\u0001\u0000\u0000\u0000\u05ad\u05ab\u0001\u0000"+
		"\u0000\u0000\u05ad\u05ac\u0001\u0000\u0000\u0000\u05ae\u012d\u0001\u0000"+
		"\u0000\u0000\u05af\u05b0\u0003\u0130\u0098\u0000\u05b0\u05b1\u0003\u0150"+
		"\u00a8\u0000\u05b1\u05b2\u0003\u0130\u0098\u0000\u05b2\u05b8\u0001\u0000"+
		"\u0000\u0000\u05b3\u05b4\u0005\f\u0000\u0000\u05b4\u05b5\u0003\u012e\u0097"+
		"\u0000\u05b5\u05b6\u0005\r\u0000\u0000\u05b6\u05b8\u0001\u0000\u0000\u0000"+
		"\u05b7\u05af\u0001\u0000\u0000\u0000\u05b7\u05b3\u0001\u0000\u0000\u0000"+
		"\u05b8\u012f\u0001\u0000\u0000\u0000\u05b9\u05bf\u0005\u0012\u0000\u0000"+
		"\u05ba\u05bb\u0005\u000e\u0000\u0000\u05bb\u05bc\u0003\u0132\u0099\u0000"+
		"\u05bc\u05bd\u0005\u000f\u0000\u0000\u05bd\u05bf\u0001\u0000\u0000\u0000"+
		"\u05be\u05b9\u0001\u0000\u0000\u0000\u05be\u05ba\u0001\u0000\u0000\u0000"+
		"\u05bf\u0131\u0001\u0000\u0000\u0000\u05c0\u05c6\u0003\u00fa}\u0000\u05c1"+
		"\u05c2\u0003\u00fa}\u0000\u05c2\u05c3\u0005\u0002\u0000\u0000\u05c3\u05c4"+
		"\u0003\u0132\u0099\u0000\u05c4\u05c6\u0001\u0000\u0000\u0000\u05c5\u05c0"+
		"\u0001\u0000\u0000\u0000\u05c5\u05c1\u0001\u0000\u0000\u0000\u05c6\u0133"+
		"\u0001\u0000\u0000\u0000\u05c7\u05cd\u0003\u0136\u009b\u0000\u05c8\u05c9"+
		"\u0005\f\u0000\u0000\u05c9\u05ca\u0003\u0134\u009a\u0000\u05ca\u05cb\u0005"+
		"\r\u0000\u0000\u05cb\u05cd\u0001\u0000\u0000\u0000\u05cc\u05c7\u0001\u0000"+
		"\u0000\u0000\u05cc\u05c8\u0001\u0000\u0000\u0000\u05cd\u0135\u0001\u0000"+
		"\u0000\u0000\u05ce\u05cf\u0006\u009b\uffff\uffff\u0000\u05cf\u05d0\u0003"+
		"\u0138\u009c\u0000\u05d0\u05d7\u0001\u0000\u0000\u0000\u05d1\u05d2\n\u0001"+
		"\u0000\u0000\u05d2\u05d3\u0003\u01b2\u00d9\u0000\u05d3\u05d4\u0003\u0138"+
		"\u009c\u0000\u05d4\u05d6\u0001\u0000\u0000\u0000\u05d5\u05d1\u0001\u0000"+
		"\u0000\u0000\u05d6\u05d9\u0001\u0000\u0000\u0000\u05d7\u05d5\u0001\u0000"+
		"\u0000\u0000\u05d7\u05d8\u0001\u0000\u0000\u0000\u05d8\u0137\u0001\u0000"+
		"\u0000\u0000\u05d9\u05d7\u0001\u0000\u0000\u0000\u05da\u05e4\u0003\u0112"+
		"\u0089\u0000\u05db\u05dc\u0005\u001c\u0000\u0000\u05dc\u05e4\u0003\u0112"+
		"\u0089\u0000\u05dd\u05de\u0005\u001c\u0000\u0000\u05de\u05df\u0005\f\u0000"+
		"\u0000\u05df\u05e0\u0003\u0112\u0089\u0000\u05e0\u05e1\u0005\r\u0000\u0000"+
		"\u05e1\u05e4\u0001\u0000\u0000\u0000\u05e2\u05e4\u0003\u0108\u0084\u0000"+
		"\u05e3\u05da\u0001\u0000\u0000\u0000\u05e3\u05db\u0001\u0000\u0000\u0000"+
		"\u05e3\u05dd\u0001\u0000\u0000\u0000\u05e3\u05e2\u0001\u0000\u0000\u0000"+
		"\u05e4\u0139\u0001\u0000\u0000\u0000\u05e5\u05e9\u0003\u0148\u00a4\u0000"+
		"\u05e6\u05e9\u0003\u0140\u00a0\u0000\u05e7\u05e9\u0003\u013e\u009f\u0000"+
		"\u05e8\u05e5\u0001\u0000\u0000\u0000\u05e8\u05e6\u0001\u0000\u0000\u0000"+
		"\u05e8\u05e7\u0001\u0000\u0000\u0000\u05e9\u013b\u0001\u0000\u0000\u0000"+
		"\u05ea\u05ed\u0003\u014e\u00a7\u0000\u05eb\u05ed\u0003\u00f0x\u0000\u05ec"+
		"\u05ea\u0001\u0000\u0000\u0000\u05ec\u05eb\u0001\u0000\u0000\u0000\u05ed"+
		"\u013d\u0001\u0000\u0000\u0000\u05ee\u05ef\u0007\u0000\u0000\u0000\u05ef"+
		"\u013f\u0001\u0000\u0000\u0000\u05f0\u05f1\u0007\u0001\u0000\u0000\u05f1"+
		"\u0141\u0001\u0000\u0000\u0000\u05f2\u05f3\u0005!\u0000\u0000\u05f3\u0143"+
		"\u0001\u0000\u0000\u0000\u05f4\u05f7\u0003\u014e\u00a7\u0000\u05f5\u05f7"+
		"\u0003\u00f0x\u0000\u05f6\u05f4\u0001\u0000\u0000\u0000\u05f6\u05f5\u0001"+
		"\u0000\u0000\u0000\u05f7\u0145\u0001\u0000\u0000\u0000\u05f8\u05f9\u0003"+
		"\u0148\u00a4\u0000\u05f9\u0147\u0001\u0000\u0000\u0000\u05fa\u05fe\u0005"+
		"\u001b\u0000\u0000\u05fb\u05fe\u0005\"\u0000\u0000\u05fc\u05fe\u0003\u01bc"+
		"\u00de\u0000\u05fd\u05fa\u0001\u0000\u0000\u0000\u05fd\u05fb\u0001\u0000"+
		"\u0000\u0000\u05fd\u05fc\u0001\u0000\u0000\u0000\u05fe\u0149\u0001\u0000"+
		"\u0000\u0000\u05ff\u0607\u0005#\u0000\u0000\u0600\u0607\u0005$\u0000\u0000"+
		"\u0601\u0607\u0005%\u0000\u0000\u0602\u0607\u0005&\u0000\u0000\u0603\u0604"+
		"\u0005\u001c\u0000\u0000\u0604\u0607\u0003\u01b2\u00d9\u0000\u0605\u0607"+
		"\u0005\'\u0000\u0000\u0606\u05ff\u0001\u0000\u0000\u0000\u0606\u0600\u0001"+
		"\u0000\u0000\u0000\u0606\u0601\u0001\u0000\u0000\u0000\u0606\u0602\u0001"+
		"\u0000\u0000\u0000\u0606\u0603\u0001\u0000\u0000\u0000\u0606\u0605\u0001"+
		"\u0000\u0000\u0000\u0607\u014b\u0001\u0000\u0000\u0000\u0608\u060b\u0003"+
		"\u01b2\u00d9\u0000\u0609\u060b\u0005\n\u0000\u0000\u060a\u0608\u0001\u0000"+
		"\u0000\u0000\u060a\u0609\u0001\u0000\u0000\u0000\u060b\u014d\u0001\u0000"+
		"\u0000\u0000\u060c\u060d\u0005\u001c\u0000\u0000\u060d\u014f\u0001\u0000"+
		"\u0000\u0000\u060e\u060f\u0005(\u0000\u0000\u060f\u0151\u0001\u0000\u0000"+
		"\u0000\u0610\u0611\u0005)\u0000\u0000\u0611\u0153\u0001\u0000\u0000\u0000"+
		"\u0612\u0613\u0005*\u0000\u0000\u0613\u0155\u0001\u0000\u0000\u0000\u0614"+
		"\u0615\u0003\u0158\u00ac\u0000\u0615\u0157\u0001\u0000\u0000\u0000\u0616"+
		"\u0617\u0003\u0198\u00cc\u0000\u0617\u0159\u0001\u0000\u0000\u0000\u0618"+
		"\u0619\u0003\u019a\u00cd\u0000\u0619\u015b\u0001\u0000\u0000\u0000\u061a"+
		"\u061d\u0003\u015e\u00af\u0000\u061b\u061d\u0003\u016a\u00b5\u0000\u061c"+
		"\u061a\u0001\u0000\u0000\u0000\u061c\u061b\u0001\u0000\u0000\u0000\u061d"+
		"\u015d\u0001\u0000\u0000\u0000\u061e\u0621\u0003\u0166\u00b3\u0000\u061f"+
		"\u0621\u0003\u016e\u00b7\u0000\u0620\u061e\u0001\u0000\u0000\u0000\u0620"+
		"\u061f\u0001\u0000\u0000\u0000\u0621\u015f\u0001\u0000\u0000\u0000\u0622"+
		"\u0623\u0003\u0162\u00b1\u0000\u0623\u0161\u0001\u0000\u0000\u0000\u0624"+
		"\u0625\u0005+\u0000\u0000\u0625\u0163\u0001\u0000\u0000\u0000\u0626\u0627"+
		"\u0005,\u0000\u0000\u0627\u0165\u0001\u0000\u0000\u0000\u0628\u0629\u0003"+
		"\u0168\u00b4\u0000\u0629\u0167\u0001\u0000\u0000\u0000\u062a\u062b\u0003"+
		"\u0198\u00cc\u0000\u062b\u0169\u0001\u0000\u0000\u0000\u062c\u062d\u0003"+
		"\u016c\u00b6\u0000\u062d\u016b\u0001\u0000\u0000\u0000\u062e\u062f\u0003"+
		"\u019a\u00cd\u0000\u062f\u016d\u0001\u0000\u0000\u0000\u0630\u0631\u0003"+
		"\u0170\u00b8\u0000\u0631\u016f\u0001\u0000\u0000\u0000\u0632\u0633\u0003"+
		"\u019c\u00ce\u0000\u0633\u0171\u0001\u0000\u0000\u0000\u0634\u0637\u0003"+
		"\u016a\u00b5\u0000\u0635\u0637\u0003\u016e\u00b7\u0000\u0636\u0634\u0001"+
		"\u0000\u0000\u0000\u0636\u0635\u0001\u0000\u0000\u0000\u0637\u0173\u0001"+
		"\u0000\u0000\u0000\u0638\u0639\u0007\u0002\u0000\u0000\u0639\u0175\u0001"+
		"\u0000\u0000\u0000\u063a\u063d\u0003\u019e\u00cf\u0000\u063b\u063d\u0003"+
		"\u01aa\u00d5\u0000\u063c\u063a\u0001\u0000\u0000\u0000\u063c\u063b\u0001"+
		"\u0000\u0000\u0000\u063d\u0177\u0001\u0000\u0000\u0000\u063e\u063f\u0003"+
		"\u01b0\u00d8\u0000\u063f\u0179\u0001\u0000\u0000\u0000\u0640\u0641\u0003"+
		"\u018a\u00c5\u0000\u0641\u017b\u0001\u0000\u0000\u0000\u0642\u0643\u0005"+
		"\u0002\u0000\u0000\u0643\u0646\u0003\u017e\u00bf\u0000\u0644\u0646\u0003"+
		"\u01a2\u00d1\u0000\u0645\u0642\u0001\u0000\u0000\u0000\u0645\u0644\u0001"+
		"\u0000\u0000\u0000\u0646\u017d\u0001\u0000\u0000\u0000\u0647\u0648\u0003"+
		"\u0192\u00c9\u0000\u0648\u017f\u0001\u0000\u0000\u0000\u0649\u064a\u0005"+
		"2\u0000\u0000\u064a\u064b\u0003\u01a0\u00d0\u0000\u064b\u064c\u0003\u0182"+
		"\u00c1\u0000\u064c\u064d\u0005\u0003\u0000\u0000\u064d\u0181\u0001\u0000"+
		"\u0000\u0000\u064e\u0657\u0003\u01a2\u00d1\u0000\u064f\u0650\u0005\u0002"+
		"\u0000\u0000\u0650\u0657\u0003\u0184\u00c2\u0000\u0651\u0652\u0005\u0002"+
		"\u0000\u0000\u0652\u0653\u0003\u0184\u00c2\u0000\u0653\u0654\u0005\u0002"+
		"\u0000\u0000\u0654\u0655\u0003\u0188\u00c4\u0000\u0655\u0657\u0001\u0000"+
		"\u0000\u0000\u0656\u064e\u0001\u0000\u0000\u0000\u0656\u064f\u0001\u0000"+
		"\u0000\u0000\u0656\u0651\u0001\u0000\u0000\u0000\u0657\u0183\u0001\u0000"+
		"\u0000\u0000\u0658\u0659\u0005\u000e\u0000\u0000\u0659\u065a\u0003\u0186"+
		"\u00c3\u0000\u065a\u065b\u0005\u000f\u0000\u0000\u065b\u065e\u0001\u0000"+
		"\u0000\u0000\u065c\u065e\u0003\u01b4\u00da\u0000\u065d\u0658\u0001\u0000"+
		"\u0000\u0000\u065d\u065c\u0001\u0000\u0000\u0000\u065e\u0185\u0001\u0000"+
		"\u0000\u0000\u065f\u0665\u0003\u0196\u00cb\u0000\u0660\u0661\u0003\u0196"+
		"\u00cb\u0000\u0661\u0662\u0005\u0002\u0000\u0000\u0662\u0663\u0003\u0186"+
		"\u00c3\u0000\u0663\u0665\u0001\u0000\u0000\u0000\u0664\u065f\u0001\u0000"+
		"\u0000\u0000\u0664\u0660\u0001\u0000\u0000\u0000\u0665\u0187\u0001\u0000"+
		"\u0000\u0000\u0666\u0667\u0003\u0196\u00cb\u0000\u0667\u0189\u0001\u0000"+
		"\u0000\u0000\u0668\u066f\u0003\u018c\u00c6\u0000\u0669\u066a\u0003\u018c"+
		"\u00c6\u0000\u066a\u066b\u0005\u0010\u0000\u0000\u066b\u066c\u0003\u018a"+
		"\u00c5\u0000\u066c\u066f\u0001\u0000\u0000\u0000\u066d\u066f\u0003\u0192"+
		"\u00c9\u0000\u066e\u0668\u0001\u0000\u0000\u0000\u066e\u0669\u0001\u0000"+
		"\u0000\u0000\u066e\u066d\u0001\u0000\u0000\u0000\u066f\u018b\u0001\u0000"+
		"\u0000\u0000\u0670\u0677\u0003\u0198\u00cc\u0000\u0671\u0677\u0003\u018e"+
		"\u00c7\u0000\u0672\u0677\u0003\u0178\u00bc\u0000\u0673\u0677\u0003\u019e"+
		"\u00cf\u0000\u0674\u0677\u0003\u01aa\u00d5\u0000\u0675\u0677\u0003\u0190"+
		"\u00c8\u0000\u0676\u0670\u0001\u0000\u0000\u0000\u0676\u0671\u0001\u0000"+
		"\u0000\u0000\u0676\u0672\u0001\u0000\u0000\u0000\u0676\u0673\u0001\u0000"+
		"\u0000\u0000\u0676\u0674\u0001\u0000\u0000\u0000\u0676\u0675\u0001\u0000"+
		"\u0000\u0000\u0677\u018d\u0001\u0000\u0000\u0000\u0678\u0679\u0003\u0198"+
		"\u00cc\u0000\u0679\u067a\u0005\f\u0000\u0000\u067a\u067b\u0003\u0194\u00ca"+
		"\u0000\u067b\u067c\u0005\r\u0000\u0000\u067c\u018f\u0001\u0000\u0000\u0000"+
		"\u067d\u067e\u00053\u0000\u0000\u067e\u067f\u0003\u0018\f\u0000\u067f"+
		"\u0680\u0005\r\u0000\u0000\u0680\u0692\u0001\u0000\u0000\u0000\u0681\u0682"+
		"\u00054\u0000\u0000\u0682\u0683\u0003v;\u0000\u0683\u0684\u0005\r\u0000"+
		"\u0000\u0684\u0692\u0001\u0000\u0000\u0000\u0685\u0686\u00055\u0000\u0000"+
		"\u0686\u0687\u0003\u00f8|\u0000\u0687\u0688\u0005\r\u0000\u0000\u0688"+
		"\u0692\u0001\u0000\u0000\u0000\u0689\u068a\u00056\u0000\u0000\u068a\u068b"+
		"\u0003\u0134\u009a\u0000\u068b\u068c\u0005\r\u0000\u0000\u068c\u0692\u0001"+
		"\u0000\u0000\u0000\u068d\u068e\u00057\u0000\u0000\u068e\u068f\u0003\u012a"+
		"\u0095\u0000\u068f\u0690\u0005\r\u0000\u0000\u0690\u0692\u0001\u0000\u0000"+
		"\u0000\u0691\u067d\u0001\u0000\u0000\u0000\u0691\u0681\u0001\u0000\u0000"+
		"\u0000\u0691\u0685\u0001\u0000\u0000\u0000\u0691\u0689\u0001\u0000\u0000"+
		"\u0000\u0691\u068d\u0001\u0000\u0000\u0000\u0692\u0191\u0001\u0000\u0000"+
		"\u0000\u0693\u0699\u0005\u0012\u0000\u0000\u0694\u0695\u0005\u000e\u0000"+
		"\u0000\u0695\u0696\u0003\u0194\u00ca\u0000\u0696\u0697\u0005\u000f\u0000"+
		"\u0000\u0697\u0699\u0001\u0000\u0000\u0000\u0698\u0693\u0001\u0000\u0000"+
		"\u0000\u0698\u0694\u0001\u0000\u0000\u0000\u0699\u0193\u0001\u0000\u0000"+
		"\u0000\u069a\u06a0\u0003\u018a\u00c5\u0000\u069b\u069c\u0003\u018a\u00c5"+
		"\u0000\u069c\u069d\u0005\u0002\u0000\u0000\u069d\u069e\u0003\u0194\u00ca"+
		"\u0000\u069e\u06a0\u0001\u0000\u0000\u0000\u069f\u069a\u0001\u0000\u0000"+
		"\u0000\u069f\u069b\u0001\u0000\u0000\u0000\u06a0\u0195\u0001\u0000\u0000"+
		"\u0000\u06a1\u06a4\u0003\u0198\u00cc\u0000\u06a2\u06a4\u0003\u01ca\u00e5"+
		"\u0000\u06a3\u06a1\u0001\u0000\u0000\u0000\u06a3\u06a2\u0001\u0000\u0000"+
		"\u0000\u06a4\u0197\u0001\u0000\u0000\u0000\u06a5\u06a8\u0005G\u0000\u0000"+
		"\u06a6\u06a8\u0003\u01a8\u00d4\u0000\u06a7\u06a5\u0001\u0000\u0000\u0000"+
		"\u06a7\u06a6\u0001\u0000\u0000\u0000\u06a8\u0199\u0001\u0000\u0000\u0000"+
		"\u06a9\u06aa\u0003\u01ac\u00d6\u0000\u06aa\u019b\u0001\u0000\u0000\u0000"+
		"\u06ab\u06ac\u0003\u01ae\u00d7\u0000\u06ac\u019d\u0001\u0000\u0000\u0000"+
		"\u06ad\u06b1\u0003\u01ca\u00e5\u0000\u06ae\u06b1\u0003\u01c4\u00e2\u0000"+
		"\u06af\u06b1\u0003\u01be\u00df\u0000\u06b0\u06ad\u0001\u0000\u0000\u0000"+
		"\u06b0\u06ae\u0001\u0000\u0000\u0000\u06b0\u06af\u0001\u0000\u0000\u0000"+
		"\u06b1\u019f\u0001\u0000\u0000\u0000\u06b2\u06b3\u0003\u01a8\u00d4\u0000"+
		"\u06b3\u01a1\u0001\u0000\u0000\u0000\u06b4\u06b5\u0001\u0000\u0000\u0000"+
		"\u06b5\u01a3\u0001\u0000\u0000\u0000\u06b6\u06b9\u0003\u01a6\u00d3\u0000"+
		"\u06b7\u06b9\u0005E\u0000\u0000\u06b8\u06b6\u0001\u0000\u0000\u0000\u06b8"+
		"\u06b7\u0001\u0000\u0000\u0000\u06b9\u01a5\u0001\u0000\u0000\u0000\u06ba"+
		"\u06bb\u00058\u0000\u0000\u06bb\u01a7\u0001\u0000\u0000\u0000\u06bc\u06bd"+
		"\u0003\u01e6\u00f3\u0000\u06bd\u06be\u0003\u01e8\u00f4\u0000\u06be\u06bf"+
		"\u0003\u01e8\u00f4\u0000\u06bf\u06c0\u00059\u0000\u0000\u06c0\u06c1\u0003"+
		"\u01e6\u00f3\u0000\u06c1\u01a9\u0001\u0000\u0000\u0000\u06c2\u06c3\u0005"+
		"I\u0000\u0000\u06c3\u06c4\u0003\u01e4\u00f2\u0000\u06c4\u06c5\u00059\u0000"+
		"\u0000\u06c5\u06c6\u0005I\u0000\u0000\u06c6\u01ab\u0001\u0000\u0000\u0000"+
		"\u06c7\u06c8\u0005T\u0000\u0000\u06c8\u06c9\u0005S\u0000\u0000\u06c9\u06ca"+
		"\u00059\u0000\u0000\u06ca\u01ad\u0001\u0000\u0000\u0000\u06cb\u06cc\u0005"+
		"T\u0000\u0000\u06cc\u06cd\u0005T\u0000\u0000\u06cd\u06ce\u0005S\u0000"+
		"\u0000\u06ce\u06cf\u00059\u0000\u0000\u06cf\u01af\u0001\u0000\u0000\u0000"+
		"\u06d0\u06d1\u0005R\u0000\u0000\u06d1\u06d2\u0005S\u0000\u0000\u06d2\u06d3"+
		"\u00059\u0000\u0000\u06d3\u01b1\u0001\u0000\u0000\u0000\u06d4\u06d5\u0005"+
		":\u0000\u0000\u06d5\u01b3\u0001\u0000\u0000\u0000\u06d6\u06d7\u00059\u0000"+
		"\u0000\u06d7\u01b5\u0001\u0000\u0000\u0000\u06d8\u06d9\u0005;\u0000\u0000"+
		"\u06d9\u01b7\u0001\u0000\u0000\u0000\u06da\u06db\u0005<\u0000\u0000\u06db"+
		"\u01b9\u0001\u0000\u0000\u0000\u06dc\u06dd\u0005=\u0000\u0000\u06dd\u01bb"+
		"\u0001\u0000\u0000\u0000\u06de\u06df\u0005>\u0000\u0000\u06df\u01bd\u0001"+
		"\u0000\u0000\u0000\u06e0\u06e1\u0005\f\u0000\u0000\u06e1\u06e6\u0003\u01c0"+
		"\u00e0\u0000\u06e2\u06e3\u0003\u01c2\u00e1\u0000\u06e3\u06e4\u0005\r\u0000"+
		"\u0000\u06e4\u06e6\u0001\u0000\u0000\u0000\u06e5\u06e0\u0001\u0000\u0000"+
		"\u0000\u06e5\u06e2\u0001\u0000\u0000\u0000\u06e6\u01bf\u0001\u0000\u0000"+
		"\u0000\u06e7\u06e8\u0005J\u0000\u0000\u06e8\u06e9\u0003\u01c2\u00e1\u0000"+
		"\u06e9\u01c1\u0001\u0000\u0000\u0000\u06ea\u06eb\u0005\f\u0000\u0000\u06eb"+
		"\u06f0\u0003\u01d6\u00eb\u0000\u06ec\u06ed\u0003\u01d4\u00ea\u0000\u06ed"+
		"\u06ee\u0005\r\u0000\u0000\u06ee\u06f0\u0001\u0000\u0000\u0000\u06ef\u06ea"+
		"\u0001\u0000\u0000\u0000\u06ef\u06ec\u0001\u0000\u0000\u0000\u06f0\u01c3"+
		"\u0001\u0000\u0000\u0000\u06f1\u06f2\u0005\f\u0000\u0000\u06f2\u06f7\u0003"+
		"\u01c6\u00e3\u0000\u06f3\u06f4\u0003\u01c8\u00e4\u0000\u06f4\u06f5\u0005"+
		"\r\u0000\u0000\u06f5\u06f7\u0001\u0000\u0000\u0000\u06f6\u06f1\u0001\u0000"+
		"\u0000\u0000\u06f6\u06f3\u0001\u0000\u0000\u0000\u06f7\u01c5\u0001\u0000"+
		"\u0000\u0000\u06f8\u06f9\u0005J\u0000\u0000\u06f9\u06fa\u0003\u01c8\u00e4"+
		"\u0000\u06fa\u01c7\u0001\u0000\u0000\u0000\u06fb\u06fc\u0003\u01d0\u00e8"+
		"\u0000\u06fc\u06fd\u0003\u01e0\u00f0\u0000\u06fd\u06fe\u0003\u01d2\u00e9"+
		"\u0000\u06fe\u01c9\u0001\u0000\u0000\u0000\u06ff\u0700\u0005\f\u0000\u0000"+
		"\u0700\u0705\u0003\u01cc\u00e6\u0000\u0701\u0702\u0003\u01ce\u00e7\u0000"+
		"\u0702\u0703\u0005\r\u0000\u0000\u0703\u0705\u0001\u0000\u0000\u0000\u0704"+
		"\u06ff\u0001\u0000\u0000\u0000\u0704\u0701\u0001\u0000\u0000\u0000\u0705"+
		"\u01cb\u0001\u0000\u0000\u0000\u0706\u0707\u0005J\u0000\u0000\u0707\u0708"+
		"\u0003\u01ce\u00e7\u0000\u0708\u01cd\u0001\u0000\u0000\u0000\u0709\u070a"+
		"\u0003\u01d0\u00e8\u0000\u070a\u01cf\u0001\u0000\u0000\u0000\u070b\u070c"+
		"\u0005\f\u0000\u0000\u070c\u0711\u0005N\u0000\u0000\u070d\u070e\u0003"+
		"\u01d2\u00e9\u0000\u070e\u070f\u0005\r\u0000\u0000\u070f\u0711\u0001\u0000"+
		"\u0000\u0000\u0710\u070b\u0001\u0000\u0000\u0000\u0710\u070d\u0001\u0000"+
		"\u0000\u0000\u0711\u01d1\u0001\u0000\u0000\u0000\u0712\u0713\u0005O\u0000"+
		"\u0000\u0713\u0714\u0005P\u0000\u0000\u0714\u0715\u00059\u0000\u0000\u0715"+
		"\u01d3\u0001\u0000\u0000\u0000\u0716\u0717\u0005\f\u0000\u0000\u0717\u071e"+
		"\u0003\u01d0\u00e8\u0000\u0718\u0719\u0003\u01d6\u00eb\u0000\u0719\u071a"+
		"\u0005\r\u0000\u0000\u071a\u071b\u0005L\u0000\u0000\u071b\u071c\u0003"+
		"\u01da\u00ed\u0000\u071c\u071e\u0001\u0000\u0000\u0000\u071d\u0716\u0001"+
		"\u0000\u0000\u0000\u071d\u0718\u0001\u0000\u0000\u0000\u071e\u01d5\u0001"+
		"\u0000\u0000\u0000\u071f\u0720\u0003\u01d0\u00e8\u0000\u0720\u0721\u0003"+
		"\u01d8\u00ec\u0000\u0721\u01d7\u0001\u0000\u0000\u0000\u0722\u0723\u0005"+
		"K\u0000\u0000\u0723\u0724\u0005P\u0000\u0000\u0724\u0725\u0005P\u0000"+
		"\u0000\u0725\u0726\u00059\u0000\u0000\u0726\u01d9\u0001\u0000\u0000\u0000"+
		"\u0727\u0728\u0005\f\u0000\u0000\u0728\u072d\u0003\u01dc\u00ee\u0000\u0729"+
		"\u072a\u0003\u01de\u00ef\u0000\u072a\u072b\u0005\r\u0000\u0000\u072b\u072d"+
		"\u0001\u0000\u0000\u0000\u072c\u0727\u0001\u0000\u0000\u0000\u072c\u0729"+
		"\u0001\u0000\u0000\u0000\u072d\u01db\u0001\u0000\u0000\u0000\u072e\u072f"+
		"\u0005J\u0000\u0000\u072f\u0730\u0003\u01de\u00ef\u0000\u0730\u01dd\u0001"+
		"\u0000\u0000\u0000\u0731\u0732\u0005P\u0000\u0000\u0732\u0733\u0005P\u0000"+
		"\u0000\u0733\u0734\u00059\u0000\u0000\u0734\u01df\u0001\u0000\u0000\u0000"+
		"\u0735\u0736\u0005M\u0000\u0000\u0736\u01e1\u0001\u0000\u0000\u0000\u0737"+
		"\u0738\u0003\u01ea\u00f5\u0000\u0738\u01e3\u0001\u0000\u0000\u0000\u0739"+
		"\u073a\u0005?\u0000\u0000\u073a\u073b\u0007\u0003\u0000\u0000\u073b\u01e5"+
		"\u0001\u0000\u0000\u0000\u073c\u073d\u0005A\u0000\u0000\u073d\u01e7\u0001"+
		"\u0000\u0000\u0000\u073e\u073f\u0005?\u0000\u0000\u073f\u0740\u0007\u0004"+
		"\u0000\u0000\u0740\u01e9\u0001\u0000\u0000\u0000\u0741\u0742\u0005B\u0000"+
		"\u0000\u0742\u01eb\u0001\u0000\u0000\u0000\u0743\u0744\u0005C\u0000\u0000"+
		"\u0744\u01ed\u0001\u0000\u0000\u0000\u0086\u01f1\u01f8\u0200\u023f\u0245"+
		"\u024a\u0252\u0257\u0260\u026d\u027a\u0287\u028d\u0291\u029a\u02aa\u02b2"+
		"\u02c1\u02c5\u02cf\u02d3\u02ea\u02f1\u02f8\u0303\u030b\u0312\u0319\u032a"+
		"\u0333\u033d\u0342\u034b\u0355\u0362\u0370\u0382\u038a\u038e\u0396\u03a3"+
		"\u03b0\u03b6\u03ba\u03c3\u03d3\u03d7\u03df\u03ed\u03f5\u0401\u040f\u041e"+
		"\u0425\u042c\u0434\u043b\u0446\u0450\u0457\u045e\u0468\u046c\u0474\u0483"+
		"\u048a\u0499\u04a0\u04b1\u04bd\u04d5\u04dc\u04e0\u04ee\u04f5\u04f9\u0509"+
		"\u050d\u0511\u051c\u0521\u0525\u052d\u053a\u0547\u054e\u0556\u055e\u056c"+
		"\u0571\u0577\u0587\u058b\u0595\u059d\u05a4\u05a8\u05ad\u05b7\u05be\u05c5"+
		"\u05cc\u05d7\u05e3\u05e8\u05ec\u05f6\u05fd\u0606\u060a\u061c\u0620\u0636"+
		"\u063c\u0645\u0656\u065d\u0664\u066e\u0676\u0691\u0698\u069f\u06a3\u06a7"+
		"\u06b0\u06b8\u06e5\u06ef\u06f6\u0704\u0710\u071d\u072c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}