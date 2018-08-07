// Generated from OParser.g4 by ANTLR 4.7.1
package prompto.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OParser extends AbstractParser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, WS=2, LF=3, COMMENT=4, JAVA=5, CSHARP=6, PYTHON2=7, PYTHON3=8, 
		JAVASCRIPT=9, SWIFT=10, COLON=11, SEMI=12, COMMA=13, RANGE=14, DOT=15, 
		LPAR=16, RPAR=17, LBRAK=18, RBRAK=19, LCURL=20, RCURL=21, QMARK=22, XMARK=23, 
		AMP=24, AMP2=25, PIPE=26, PIPE2=27, PLUS=28, MINUS=29, STAR=30, SLASH=31, 
		BSLASH=32, PERCENT=33, GT=34, GTE=35, LT=36, LTE=37, LTGT=38, LTCOLONGT=39, 
		EQ=40, XEQ=41, EQ2=42, TEQ=43, TILDE=44, LARROW=45, RARROW=46, BOOLEAN=47, 
		CHARACTER=48, TEXT=49, INTEGER=50, DECIMAL=51, DATE=52, TIME=53, DATETIME=54, 
		PERIOD=55, VERSION=56, METHOD_T=57, CODE=58, DOCUMENT=59, BLOB=60, IMAGE=61, 
		UUID=62, ITERATOR=63, CURSOR=64, HTML=65, ABSTRACT=66, ALL=67, ALWAYS=68, 
		AND=69, ANY=70, AS=71, ASC=72, ATTR=73, ATTRIBUTE=74, ATTRIBUTES=75, BINDINGS=76, 
		BREAK=77, BY=78, CASE=79, CATCH=80, CATEGORY=81, CLASS=82, CLOSE=83, CONTAINS=84, 
		DEF=85, DEFAULT=86, DEFINE=87, DELETE=88, DESC=89, DO=90, DOING=91, EACH=92, 
		ELSE=93, ENUM=94, ENUMERATED=95, EXCEPT=96, EXECUTE=97, EXPECTING=98, 
		EXTENDS=99, FETCH=100, FILTERED=101, FINALLY=102, FLUSH=103, FOR=104, 
		FROM=105, GETTER=106, HAS=107, IF=108, IN=109, INDEX=110, INVOKE=111, 
		IS=112, MATCHING=113, METHOD=114, METHODS=115, MODULO=116, MUTABLE=117, 
		NATIVE=118, NONE=119, NOT=120, NOTHING=121, NULL=122, ON=123, ONE=124, 
		OPEN=125, OPERATOR=126, OR=127, ORDER=128, OTHERWISE=129, PASS=130, RAISE=131, 
		READ=132, RECEIVING=133, RESOURCE=134, RETURN=135, RETURNING=136, ROWS=137, 
		SELF=138, SETTER=139, SINGLETON=140, SORTED=141, STORABLE=142, STORE=143, 
		SWITCH=144, TEST=145, THIS=146, THROW=147, TO=148, TRY=149, VERIFYING=150, 
		WIDGET=151, WITH=152, WHEN=153, WHERE=154, WHILE=155, WRITE=156, BOOLEAN_LITERAL=157, 
		CHAR_LITERAL=158, MIN_INTEGER=159, MAX_INTEGER=160, SYMBOL_IDENTIFIER=161, 
		TYPE_IDENTIFIER=162, VARIABLE_IDENTIFIER=163, NATIVE_IDENTIFIER=164, DOLLAR_IDENTIFIER=165, 
		ARONDBASE_IDENTIFIER=166, TEXT_LITERAL=167, UUID_LITERAL=168, INTEGER_LITERAL=169, 
		HEXA_LITERAL=170, DECIMAL_LITERAL=171, DATETIME_LITERAL=172, TIME_LITERAL=173, 
		DATE_LITERAL=174, PERIOD_LITERAL=175, VERSION_LITERAL=176;
	public static final int
		RULE_enum_category_declaration = 0, RULE_enum_native_declaration = 1, 
		RULE_category_symbol = 2, RULE_native_symbol = 3, RULE_attribute_declaration = 4, 
		RULE_concrete_widget_declaration = 5, RULE_native_widget_declaration = 6, 
		RULE_concrete_category_declaration = 7, RULE_singleton_category_declaration = 8, 
		RULE_derived_list = 9, RULE_category_method_list = 10, RULE_operator_method_declaration = 11, 
		RULE_setter_method_declaration = 12, RULE_native_setter_declaration = 13, 
		RULE_getter_method_declaration = 14, RULE_native_getter_declaration = 15, 
		RULE_native_resource_declaration = 16, RULE_native_category_declaration = 17, 
		RULE_native_category_bindings = 18, RULE_native_category_binding_list = 19, 
		RULE_abstract_method_declaration = 20, RULE_concrete_method_declaration = 21, 
		RULE_native_method_declaration = 22, RULE_test_method_declaration = 23, 
		RULE_assertion = 24, RULE_typed_argument = 25, RULE_statement_or_list = 26, 
		RULE_statement = 27, RULE_flush_statement = 28, RULE_store_statement = 29, 
		RULE_with_resource_statement = 30, RULE_with_singleton_statement = 31, 
		RULE_switch_statement = 32, RULE_switch_case_statement = 33, RULE_for_each_statement = 34, 
		RULE_do_while_statement = 35, RULE_while_statement = 36, RULE_if_statement = 37, 
		RULE_else_if_statement_list = 38, RULE_raise_statement = 39, RULE_try_statement = 40, 
		RULE_catch_statement = 41, RULE_break_statement = 42, RULE_return_statement = 43, 
		RULE_method_call = 44, RULE_method_selector = 45, RULE_callable_parent = 46, 
		RULE_callable_selector = 47, RULE_x_expression = 48, RULE_expression = 49, 
		RULE_an_expression = 50, RULE_closure_expression = 51, RULE_instance_expression = 52, 
		RULE_method_expression = 53, RULE_blob_expression = 54, RULE_document_expression = 55, 
		RULE_write_statement = 56, RULE_filtered_list_expression = 57, RULE_fetch_store_expression = 58, 
		RULE_sorted_expression = 59, RULE_selector_expression = 60, RULE_constructor_expression = 61, 
		RULE_copy_from = 62, RULE_argument_assignment_list = 63, RULE_argument_assignment = 64, 
		RULE_assign_instance_statement = 65, RULE_child_instance = 66, RULE_assign_tuple_statement = 67, 
		RULE_null_literal = 68, RULE_declaration_list = 69, RULE_declarations = 70, 
		RULE_declaration = 71, RULE_annotation_constructor = 72, RULE_annotation_identifier = 73, 
		RULE_resource_declaration = 74, RULE_enum_declaration = 75, RULE_native_symbol_list = 76, 
		RULE_category_symbol_list = 77, RULE_symbol_list = 78, RULE_attribute_constraint = 79, 
		RULE_list_literal = 80, RULE_set_literal = 81, RULE_expression_list = 82, 
		RULE_range_literal = 83, RULE_typedef = 84, RULE_primary_type = 85, RULE_native_type = 86, 
		RULE_category_type = 87, RULE_mutable_category_type = 88, RULE_code_type = 89, 
		RULE_category_declaration = 90, RULE_widget_declaration = 91, RULE_type_identifier_list = 92, 
		RULE_method_identifier = 93, RULE_identifier_or_keyword = 94, RULE_nospace_hyphen_identifier_or_keyword = 95, 
		RULE_nospace_identifier_or_keyword = 96, RULE_identifier = 97, RULE_variable_identifier = 98, 
		RULE_attribute_identifier = 99, RULE_type_identifier = 100, RULE_symbol_identifier = 101, 
		RULE_argument_list = 102, RULE_argument = 103, RULE_operator_argument = 104, 
		RULE_named_argument = 105, RULE_code_argument = 106, RULE_category_or_any_type = 107, 
		RULE_any_type = 108, RULE_member_method_declaration_list = 109, RULE_member_method_declaration = 110, 
		RULE_native_member_method_declaration_list = 111, RULE_native_member_method_declaration = 112, 
		RULE_native_category_binding = 113, RULE_python_category_binding = 114, 
		RULE_python_module = 115, RULE_javascript_category_binding = 116, RULE_javascript_module = 117, 
		RULE_variable_identifier_list = 118, RULE_attribute_identifier_list = 119, 
		RULE_method_declaration = 120, RULE_comment_statement = 121, RULE_native_statement_list = 122, 
		RULE_native_statement = 123, RULE_python_native_statement = 124, RULE_javascript_native_statement = 125, 
		RULE_statement_list = 126, RULE_assertion_list = 127, RULE_switch_case_statement_list = 128, 
		RULE_catch_statement_list = 129, RULE_literal_collection = 130, RULE_atomic_literal = 131, 
		RULE_literal_list_literal = 132, RULE_selectable_expression = 133, RULE_this_expression = 134, 
		RULE_parenthesis_expression = 135, RULE_literal_expression = 136, RULE_collection_literal = 137, 
		RULE_tuple_literal = 138, RULE_dict_literal = 139, RULE_document_literal = 140, 
		RULE_expression_tuple = 141, RULE_dict_entry_list = 142, RULE_dict_entry = 143, 
		RULE_slice_arguments = 144, RULE_assign_variable_statement = 145, RULE_assignable_instance = 146, 
		RULE_is_expression = 147, RULE_read_all_expression = 148, RULE_read_one_expression = 149, 
		RULE_order_by_list = 150, RULE_order_by = 151, RULE_operator = 152, RULE_keyword = 153, 
		RULE_new_token = 154, RULE_key_token = 155, RULE_module_token = 156, RULE_value_token = 157, 
		RULE_symbols_token = 158, RULE_assign = 159, RULE_multiply = 160, RULE_divide = 161, 
		RULE_idivide = 162, RULE_modulo = 163, RULE_lfs = 164, RULE_lfp = 165, 
		RULE_javascript_statement = 166, RULE_javascript_expression = 167, RULE_javascript_primary_expression = 168, 
		RULE_javascript_this_expression = 169, RULE_javascript_new_expression = 170, 
		RULE_javascript_selector_expression = 171, RULE_javascript_method_expression = 172, 
		RULE_javascript_arguments = 173, RULE_javascript_item_expression = 174, 
		RULE_javascript_parenthesis_expression = 175, RULE_javascript_identifier_expression = 176, 
		RULE_javascript_literal_expression = 177, RULE_javascript_identifier = 178, 
		RULE_python_statement = 179, RULE_python_expression = 180, RULE_python_primary_expression = 181, 
		RULE_python_self_expression = 182, RULE_python_selector_expression = 183, 
		RULE_python_method_expression = 184, RULE_python_argument_list = 185, 
		RULE_python_ordinal_argument_list = 186, RULE_python_named_argument_list = 187, 
		RULE_python_parenthesis_expression = 188, RULE_python_identifier_expression = 189, 
		RULE_python_literal_expression = 190, RULE_python_identifier = 191, RULE_java_statement = 192, 
		RULE_java_expression = 193, RULE_java_primary_expression = 194, RULE_java_this_expression = 195, 
		RULE_java_new_expression = 196, RULE_java_selector_expression = 197, RULE_java_method_expression = 198, 
		RULE_java_arguments = 199, RULE_java_item_expression = 200, RULE_java_parenthesis_expression = 201, 
		RULE_java_identifier_expression = 202, RULE_java_class_identifier_expression = 203, 
		RULE_java_literal_expression = 204, RULE_java_identifier = 205, RULE_csharp_statement = 206, 
		RULE_csharp_expression = 207, RULE_csharp_primary_expression = 208, RULE_csharp_this_expression = 209, 
		RULE_csharp_new_expression = 210, RULE_csharp_selector_expression = 211, 
		RULE_csharp_method_expression = 212, RULE_csharp_arguments = 213, RULE_csharp_item_expression = 214, 
		RULE_csharp_parenthesis_expression = 215, RULE_csharp_identifier_expression = 216, 
		RULE_csharp_literal_expression = 217, RULE_csharp_identifier = 218, RULE_jsx_expression = 219, 
		RULE_jsx_element = 220, RULE_jsx_fragment = 221, RULE_jsx_fragment_start = 222, 
		RULE_jsx_fragment_end = 223, RULE_jsx_self_closing = 224, RULE_jsx_opening = 225, 
		RULE_jsx_closing = 226, RULE_jsx_element_name = 227, RULE_jsx_identifier = 228, 
		RULE_jsx_attribute = 229, RULE_jsx_attribute_value = 230, RULE_jsx_children = 231, 
		RULE_jsx_child = 232, RULE_jsx_text = 233, RULE_css_expression = 234, 
		RULE_css_field = 235, RULE_css_identifier = 236, RULE_css_value = 237, 
		RULE_css_text = 238;
	public static final String[] ruleNames = {
		"enum_category_declaration", "enum_native_declaration", "category_symbol", 
		"native_symbol", "attribute_declaration", "concrete_widget_declaration", 
		"native_widget_declaration", "concrete_category_declaration", "singleton_category_declaration", 
		"derived_list", "category_method_list", "operator_method_declaration", 
		"setter_method_declaration", "native_setter_declaration", "getter_method_declaration", 
		"native_getter_declaration", "native_resource_declaration", "native_category_declaration", 
		"native_category_bindings", "native_category_binding_list", "abstract_method_declaration", 
		"concrete_method_declaration", "native_method_declaration", "test_method_declaration", 
		"assertion", "typed_argument", "statement_or_list", "statement", "flush_statement", 
		"store_statement", "with_resource_statement", "with_singleton_statement", 
		"switch_statement", "switch_case_statement", "for_each_statement", "do_while_statement", 
		"while_statement", "if_statement", "else_if_statement_list", "raise_statement", 
		"try_statement", "catch_statement", "break_statement", "return_statement", 
		"method_call", "method_selector", "callable_parent", "callable_selector", 
		"x_expression", "expression", "an_expression", "closure_expression", "instance_expression", 
		"method_expression", "blob_expression", "document_expression", "write_statement", 
		"filtered_list_expression", "fetch_store_expression", "sorted_expression", 
		"selector_expression", "constructor_expression", "copy_from", "argument_assignment_list", 
		"argument_assignment", "assign_instance_statement", "child_instance", 
		"assign_tuple_statement", "null_literal", "declaration_list", "declarations", 
		"declaration", "annotation_constructor", "annotation_identifier", "resource_declaration", 
		"enum_declaration", "native_symbol_list", "category_symbol_list", "symbol_list", 
		"attribute_constraint", "list_literal", "set_literal", "expression_list", 
		"range_literal", "typedef", "primary_type", "native_type", "category_type", 
		"mutable_category_type", "code_type", "category_declaration", "widget_declaration", 
		"type_identifier_list", "method_identifier", "identifier_or_keyword", 
		"nospace_hyphen_identifier_or_keyword", "nospace_identifier_or_keyword", 
		"identifier", "variable_identifier", "attribute_identifier", "type_identifier", 
		"symbol_identifier", "argument_list", "argument", "operator_argument", 
		"named_argument", "code_argument", "category_or_any_type", "any_type", 
		"member_method_declaration_list", "member_method_declaration", "native_member_method_declaration_list", 
		"native_member_method_declaration", "native_category_binding", "python_category_binding", 
		"python_module", "javascript_category_binding", "javascript_module", "variable_identifier_list", 
		"attribute_identifier_list", "method_declaration", "comment_statement", 
		"native_statement_list", "native_statement", "python_native_statement", 
		"javascript_native_statement", "statement_list", "assertion_list", "switch_case_statement_list", 
		"catch_statement_list", "literal_collection", "atomic_literal", "literal_list_literal", 
		"selectable_expression", "this_expression", "parenthesis_expression", 
		"literal_expression", "collection_literal", "tuple_literal", "dict_literal", 
		"document_literal", "expression_tuple", "dict_entry_list", "dict_entry", 
		"slice_arguments", "assign_variable_statement", "assignable_instance", 
		"is_expression", "read_all_expression", "read_one_expression", "order_by_list", 
		"order_by", "operator", "keyword", "new_token", "key_token", "module_token", 
		"value_token", "symbols_token", "assign", "multiply", "divide", "idivide", 
		"modulo", "lfs", "lfp", "javascript_statement", "javascript_expression", 
		"javascript_primary_expression", "javascript_this_expression", "javascript_new_expression", 
		"javascript_selector_expression", "javascript_method_expression", "javascript_arguments", 
		"javascript_item_expression", "javascript_parenthesis_expression", "javascript_identifier_expression", 
		"javascript_literal_expression", "javascript_identifier", "python_statement", 
		"python_expression", "python_primary_expression", "python_self_expression", 
		"python_selector_expression", "python_method_expression", "python_argument_list", 
		"python_ordinal_argument_list", "python_named_argument_list", "python_parenthesis_expression", 
		"python_identifier_expression", "python_literal_expression", "python_identifier", 
		"java_statement", "java_expression", "java_primary_expression", "java_this_expression", 
		"java_new_expression", "java_selector_expression", "java_method_expression", 
		"java_arguments", "java_item_expression", "java_parenthesis_expression", 
		"java_identifier_expression", "java_class_identifier_expression", "java_literal_expression", 
		"java_identifier", "csharp_statement", "csharp_expression", "csharp_primary_expression", 
		"csharp_this_expression", "csharp_new_expression", "csharp_selector_expression", 
		"csharp_method_expression", "csharp_arguments", "csharp_item_expression", 
		"csharp_parenthesis_expression", "csharp_identifier_expression", "csharp_literal_expression", 
		"csharp_identifier", "jsx_expression", "jsx_element", "jsx_fragment", 
		"jsx_fragment_start", "jsx_fragment_end", "jsx_self_closing", "jsx_opening", 
		"jsx_closing", "jsx_element_name", "jsx_identifier", "jsx_attribute", 
		"jsx_attribute_value", "jsx_children", "jsx_child", "jsx_text", "css_expression", 
		"css_field", "css_identifier", "css_value", "css_text"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", null, null, null, "'Java:'", "'C#:'", "'Python2:'", "'Python3:'", 
		"'JavaScript:'", "'Swift:'", "':'", "';'", null, "'..'", null, null, null, 
		null, null, null, null, null, "'!'", "'&'", "'&&'", "'|'", "'||'", null, 
		"'-'", "'*'", "'/'", "'\\'", "'%'", "'>'", "'>='", "'<'", "'<='", "'<>'", 
		"'<:>'", "'='", "'!='", "'=='", "'~='", "'~'", "'<-'", "'->'", "'Boolean'", 
		"'Character'", "'Text'", "'Integer'", "'Decimal'", "'Date'", "'Time'", 
		"'DateTime'", "'Period'", "'Version'", "'Method'", "'Code'", "'Document'", 
		"'Blob'", "'Image'", "'Uuid'", "'Iterator'", "'Cursor'", "'Html'", "'abstract'", 
		"'all'", "'always'", "'and'", "'any'", "'as'", null, "'attr'", "'attribute'", 
		"'attributes'", "'bindings'", "'break'", "'by'", "'case'", "'catch'", 
		"'category'", "'class'", "'close'", "'contains'", "'def'", "'default'", 
		"'define'", "'delete'", null, "'do'", "'doing'", "'each'", "'else'", "'enum'", 
		"'enumerated'", "'except'", "'execute'", "'expecting'", "'extends'", "'fetch'", 
		"'filtered'", "'finally'", "'flush'", "'for'", "'from'", "'getter'", "'has'", 
		"'if'", "'in'", "'index'", "'invoke'", "'is'", "'matching'", "'method'", 
		"'methods'", "'modulo'", "'mutable'", "'native'", "'None'", "'not'", null, 
		"'null'", "'on'", "'one'", "'open'", "'operator'", "'or'", "'order'", 
		"'otherwise'", "'pass'", "'raise'", "'read'", "'receiving'", "'resource'", 
		"'return'", "'returning'", "'rows'", "'self'", "'setter'", "'singleton'", 
		"'sorted'", "'storable'", "'store'", "'switch'", "'test'", "'this'", "'throw'", 
		"'to'", "'try'", "'verifying'", "'widget'", "'with'", "'when'", "'where'", 
		"'while'", "'write'", null, null, "'MIN_INTEGER'", "'MAX_INTEGER'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "WS", "LF", "COMMENT", "JAVA", "CSHARP", "PYTHON2", "PYTHON3", 
		"JAVASCRIPT", "SWIFT", "COLON", "SEMI", "COMMA", "RANGE", "DOT", "LPAR", 
		"RPAR", "LBRAK", "RBRAK", "LCURL", "RCURL", "QMARK", "XMARK", "AMP", "AMP2", 
		"PIPE", "PIPE2", "PLUS", "MINUS", "STAR", "SLASH", "BSLASH", "PERCENT", 
		"GT", "GTE", "LT", "LTE", "LTGT", "LTCOLONGT", "EQ", "XEQ", "EQ2", "TEQ", 
		"TILDE", "LARROW", "RARROW", "BOOLEAN", "CHARACTER", "TEXT", "INTEGER", 
		"DECIMAL", "DATE", "TIME", "DATETIME", "PERIOD", "VERSION", "METHOD_T", 
		"CODE", "DOCUMENT", "BLOB", "IMAGE", "UUID", "ITERATOR", "CURSOR", "HTML", 
		"ABSTRACT", "ALL", "ALWAYS", "AND", "ANY", "AS", "ASC", "ATTR", "ATTRIBUTE", 
		"ATTRIBUTES", "BINDINGS", "BREAK", "BY", "CASE", "CATCH", "CATEGORY", 
		"CLASS", "CLOSE", "CONTAINS", "DEF", "DEFAULT", "DEFINE", "DELETE", "DESC", 
		"DO", "DOING", "EACH", "ELSE", "ENUM", "ENUMERATED", "EXCEPT", "EXECUTE", 
		"EXPECTING", "EXTENDS", "FETCH", "FILTERED", "FINALLY", "FLUSH", "FOR", 
		"FROM", "GETTER", "HAS", "IF", "IN", "INDEX", "INVOKE", "IS", "MATCHING", 
		"METHOD", "METHODS", "MODULO", "MUTABLE", "NATIVE", "NONE", "NOT", "NOTHING", 
		"NULL", "ON", "ONE", "OPEN", "OPERATOR", "OR", "ORDER", "OTHERWISE", "PASS", 
		"RAISE", "READ", "RECEIVING", "RESOURCE", "RETURN", "RETURNING", "ROWS", 
		"SELF", "SETTER", "SINGLETON", "SORTED", "STORABLE", "STORE", "SWITCH", 
		"TEST", "THIS", "THROW", "TO", "TRY", "VERIFYING", "WIDGET", "WITH", "WHEN", 
		"WHERE", "WHILE", "WRITE", "BOOLEAN_LITERAL", "CHAR_LITERAL", "MIN_INTEGER", 
		"MAX_INTEGER", "SYMBOL_IDENTIFIER", "TYPE_IDENTIFIER", "VARIABLE_IDENTIFIER", 
		"NATIVE_IDENTIFIER", "DOLLAR_IDENTIFIER", "ARONDBASE_IDENTIFIER", "TEXT_LITERAL", 
		"UUID_LITERAL", "INTEGER_LITERAL", "HEXA_LITERAL", "DECIMAL_LITERAL", 
		"DATETIME_LITERAL", "TIME_LITERAL", "DATE_LITERAL", "PERIOD_LITERAL", 
		"VERSION_LITERAL"
	};
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
	public String getGrammarFileName() { return "OParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Enum_category_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_identifier_listContext attrs;
		public Type_identifierContext derived;
		public Category_symbol_listContext symbols;
		public TerminalNode ENUMERATED() { return getToken(OParser.ENUMERATED, 0); }
		public TerminalNode CATEGORY() { return getToken(OParser.CATEGORY, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public Category_symbol_listContext category_symbol_list() {
			return getRuleContext(Category_symbol_listContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode EXTENDS() { return getToken(OParser.EXTENDS, 0); }
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
		}
		public Enum_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterEnum_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitEnum_category_declaration(this);
		}
	}

	public final Enum_category_declarationContext enum_category_declaration() throws RecognitionException {
		Enum_category_declarationContext _localctx = new Enum_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_enum_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(ENUMERATED);
			setState(479);
			match(CATEGORY);
			setState(480);
			((Enum_category_declarationContext)_localctx).name = type_identifier();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(481);
				match(LPAR);
				setState(482);
				((Enum_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				setState(483);
				match(RPAR);
				}
			}

			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(487);
				match(EXTENDS);
				setState(488);
				((Enum_category_declarationContext)_localctx).derived = type_identifier();
				}
			}

			setState(491);
			match(LCURL);
			setState(492);
			((Enum_category_declarationContext)_localctx).symbols = category_symbol_list();
			setState(493);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_native_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Native_typeContext typ;
		public Native_symbol_listContext symbols;
		public TerminalNode ENUMERATED() { return getToken(OParser.ENUMERATED, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Native_typeContext native_type() {
			return getRuleContext(Native_typeContext.class,0);
		}
		public Native_symbol_listContext native_symbol_list() {
			return getRuleContext(Native_symbol_listContext.class,0);
		}
		public Enum_native_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_native_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterEnum_native_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitEnum_native_declaration(this);
		}
	}

	public final Enum_native_declarationContext enum_native_declaration() throws RecognitionException {
		Enum_native_declarationContext _localctx = new Enum_native_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_enum_native_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(ENUMERATED);
			setState(496);
			((Enum_native_declarationContext)_localctx).name = type_identifier();
			setState(497);
			match(LPAR);
			setState(498);
			((Enum_native_declarationContext)_localctx).typ = native_type();
			setState(499);
			match(RPAR);
			setState(500);
			match(LCURL);
			setState(501);
			((Enum_native_declarationContext)_localctx).symbols = native_symbol_list();
			setState(502);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Category_symbolContext extends ParserRuleContext {
		public Symbol_identifierContext name;
		public Argument_assignment_listContext args;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public Category_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategory_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategory_symbol(this);
		}
	}

	public final Category_symbolContext category_symbol() throws RecognitionException {
		Category_symbolContext _localctx = new Category_symbolContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_category_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			((Category_symbolContext)_localctx).name = symbol_identifier();
			setState(505);
			match(LPAR);
			setState(506);
			((Category_symbolContext)_localctx).args = argument_assignment_list(0);
			setState(507);
			match(RPAR);
			setState(508);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_symbolContext extends ParserRuleContext {
		public Symbol_identifierContext name;
		public ExpressionContext exp;
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Native_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_symbol(this);
		}
	}

	public final Native_symbolContext native_symbol() throws RecognitionException {
		Native_symbolContext _localctx = new Native_symbolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_native_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			((Native_symbolContext)_localctx).name = symbol_identifier();
			setState(511);
			match(EQ);
			setState(512);
			((Native_symbolContext)_localctx).exp = expression(0);
			setState(513);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_declarationContext extends ParserRuleContext {
		public Attribute_identifierContext name;
		public TypedefContext typ;
		public Attribute_constraintContext match;
		public Variable_identifier_listContext indices;
		public TerminalNode ATTRIBUTE() { return getToken(OParser.ATTRIBUTE, 0); }
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Attribute_identifierContext attribute_identifier() {
			return getRuleContext(Attribute_identifierContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public TerminalNode STORABLE() { return getToken(OParser.STORABLE, 0); }
		public TerminalNode WITH() { return getToken(OParser.WITH, 0); }
		public TerminalNode INDEX() { return getToken(OParser.INDEX, 0); }
		public Attribute_constraintContext attribute_constraint() {
			return getRuleContext(Attribute_constraintContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Variable_identifier_listContext variable_identifier_list() {
			return getRuleContext(Variable_identifier_listContext.class,0);
		}
		public Attribute_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAttribute_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAttribute_declaration(this);
		}
	}

	public final Attribute_declarationContext attribute_declaration() throws RecognitionException {
		Attribute_declarationContext _localctx = new Attribute_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(515);
				match(STORABLE);
				}
			}

			setState(518);
			match(ATTRIBUTE);
			setState(519);
			((Attribute_declarationContext)_localctx).name = attribute_identifier();
			setState(520);
			match(COLON);
			setState(521);
			((Attribute_declarationContext)_localctx).typ = typedef(0);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==MATCHING) {
				{
				setState(522);
				((Attribute_declarationContext)_localctx).match = attribute_constraint();
				}
			}

			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(525);
				match(WITH);
				setState(526);
				match(INDEX);
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(527);
					match(LPAR);
					setState(528);
					((Attribute_declarationContext)_localctx).indices = variable_identifier_list();
					setState(529);
					match(RPAR);
					}
				}

				}
			}

			setState(535);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concrete_widget_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Type_identifierContext derived;
		public Category_method_listContext methods;
		public TerminalNode WIDGET() { return getToken(OParser.WIDGET, 0); }
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public Category_method_listContext category_method_list() {
			return getRuleContext(Category_method_listContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(OParser.EXTENDS, 0); }
		public Concrete_widget_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete_widget_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConcrete_widget_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConcrete_widget_declaration(this);
		}
	}

	public final Concrete_widget_declarationContext concrete_widget_declaration() throws RecognitionException {
		Concrete_widget_declarationContext _localctx = new Concrete_widget_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_concrete_widget_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(WIDGET);
			setState(538);
			((Concrete_widget_declarationContext)_localctx).name = type_identifier();
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(539);
				match(EXTENDS);
				setState(540);
				((Concrete_widget_declarationContext)_localctx).derived = type_identifier();
				}
			}

			setState(543);
			((Concrete_widget_declarationContext)_localctx).methods = category_method_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_widget_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Native_category_bindingsContext bindings;
		public Native_member_method_declaration_listContext methods;
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
		public TerminalNode WIDGET() { return getToken(OParser.WIDGET, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Native_category_bindingsContext native_category_bindings() {
			return getRuleContext(Native_category_bindingsContext.class,0);
		}
		public Native_member_method_declaration_listContext native_member_method_declaration_list() {
			return getRuleContext(Native_member_method_declaration_listContext.class,0);
		}
		public Native_widget_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_widget_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_widget_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_widget_declaration(this);
		}
	}

	public final Native_widget_declarationContext native_widget_declaration() throws RecognitionException {
		Native_widget_declarationContext _localctx = new Native_widget_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_native_widget_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(NATIVE);
			setState(546);
			match(WIDGET);
			setState(547);
			((Native_widget_declarationContext)_localctx).name = type_identifier();
			setState(548);
			match(LCURL);
			setState(549);
			((Native_widget_declarationContext)_localctx).bindings = native_category_bindings();
			setState(550);
			((Native_widget_declarationContext)_localctx).methods = native_member_method_declaration_list();
			setState(551);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concrete_category_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_identifier_listContext attrs;
		public Derived_listContext derived;
		public Category_method_listContext methods;
		public TerminalNode CATEGORY() { return getToken(OParser.CATEGORY, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Category_method_listContext category_method_list() {
			return getRuleContext(Category_method_listContext.class,0);
		}
		public TerminalNode STORABLE() { return getToken(OParser.STORABLE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode EXTENDS() { return getToken(OParser.EXTENDS, 0); }
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
		}
		public Derived_listContext derived_list() {
			return getRuleContext(Derived_listContext.class,0);
		}
		public Concrete_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConcrete_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConcrete_category_declaration(this);
		}
	}

	public final Concrete_category_declarationContext concrete_category_declaration() throws RecognitionException {
		Concrete_category_declarationContext _localctx = new Concrete_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_concrete_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(553);
				match(STORABLE);
				}
			}

			setState(556);
			match(CATEGORY);
			setState(557);
			((Concrete_category_declarationContext)_localctx).name = type_identifier();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(558);
				match(LPAR);
				setState(559);
				((Concrete_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				setState(560);
				match(RPAR);
				}
			}

			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(564);
				match(EXTENDS);
				setState(565);
				((Concrete_category_declarationContext)_localctx).derived = derived_list(0);
				}
			}

			setState(568);
			((Concrete_category_declarationContext)_localctx).methods = category_method_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Singleton_category_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_identifier_listContext attrs;
		public Category_method_listContext methods;
		public TerminalNode SINGLETON() { return getToken(OParser.SINGLETON, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Category_method_listContext category_method_list() {
			return getRuleContext(Category_method_listContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
		}
		public Singleton_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleton_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSingleton_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSingleton_category_declaration(this);
		}
	}

	public final Singleton_category_declarationContext singleton_category_declaration() throws RecognitionException {
		Singleton_category_declarationContext _localctx = new Singleton_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_singleton_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(SINGLETON);
			setState(571);
			((Singleton_category_declarationContext)_localctx).name = type_identifier();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(572);
				match(LPAR);
				setState(573);
				((Singleton_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				setState(574);
				match(RPAR);
				}
			}

			setState(578);
			((Singleton_category_declarationContext)_localctx).methods = category_method_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Derived_listContext extends ParserRuleContext {
		public Derived_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derived_list; }
	 
		public Derived_listContext() { }
		public void copyFrom(Derived_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DerivedListItemContext extends Derived_listContext {
		public Derived_listContext items;
		public Type_identifierContext item;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Derived_listContext derived_list() {
			return getRuleContext(Derived_listContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public DerivedListItemContext(Derived_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDerivedListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDerivedListItem(this);
		}
	}
	public static class DerivedListContext extends Derived_listContext {
		public Type_identifierContext item;
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public DerivedListContext(Derived_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDerivedList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDerivedList(this);
		}
	}

	public final Derived_listContext derived_list() throws RecognitionException {
		return derived_list(0);
	}

	private Derived_listContext derived_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Derived_listContext _localctx = new Derived_listContext(_ctx, _parentState);
		Derived_listContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_derived_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DerivedListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(581);
			((DerivedListContext)_localctx).item = type_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DerivedListItemContext(new Derived_listContext(_parentctx, _parentState));
					((DerivedListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_derived_list);
					setState(583);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(584);
					match(COMMA);
					setState(585);
					((DerivedListItemContext)_localctx).item = type_identifier();
					}
					} 
				}
				setState(590);
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

	public static class Category_method_listContext extends ParserRuleContext {
		public Category_method_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_method_list; }
	 
		public Category_method_listContext() { }
		public void copyFrom(Category_method_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyCategoryMethodListContext extends Category_method_listContext {
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public EmptyCategoryMethodListContext(Category_method_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterEmptyCategoryMethodList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitEmptyCategoryMethodList(this);
		}
	}
	public static class CurlyCategoryMethodListContext extends Category_method_listContext {
		public Member_method_declaration_listContext items;
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Member_method_declaration_listContext member_method_declaration_list() {
			return getRuleContext(Member_method_declaration_listContext.class,0);
		}
		public CurlyCategoryMethodListContext(Category_method_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCurlyCategoryMethodList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCurlyCategoryMethodList(this);
		}
	}

	public final Category_method_listContext category_method_list() throws RecognitionException {
		Category_method_listContext _localctx = new Category_method_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_category_method_list);
		int _la;
		try {
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				_localctx = new EmptyCategoryMethodListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(SEMI);
				}
				break;
			case LCURL:
				_localctx = new CurlyCategoryMethodListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				match(LCURL);
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BOOLEAN - 47)) | (1L << (CHARACTER - 47)) | (1L << (TEXT - 47)) | (1L << (INTEGER - 47)) | (1L << (DECIMAL - 47)) | (1L << (DATE - 47)) | (1L << (TIME - 47)) | (1L << (DATETIME - 47)) | (1L << (PERIOD - 47)) | (1L << (VERSION - 47)) | (1L << (CODE - 47)) | (1L << (DOCUMENT - 47)) | (1L << (BLOB - 47)) | (1L << (IMAGE - 47)) | (1L << (UUID - 47)) | (1L << (ITERATOR - 47)) | (1L << (CURSOR - 47)) | (1L << (HTML - 47)) | (1L << (ABSTRACT - 47)) | (1L << (GETTER - 47)))) != 0) || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (METHOD - 114)) | (1L << (OPERATOR - 114)) | (1L << (SETTER - 114)) | (1L << (TYPE_IDENTIFIER - 114)))) != 0)) {
					{
					setState(593);
					((CurlyCategoryMethodListContext)_localctx).items = member_method_declaration_list();
					}
				}

				setState(596);
				match(RCURL);
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

	public static class Operator_method_declarationContext extends ParserRuleContext {
		public TypedefContext typ;
		public OperatorContext op;
		public Operator_argumentContext arg;
		public Statement_listContext stmts;
		public TerminalNode OPERATOR() { return getToken(OParser.OPERATOR, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Operator_argumentContext operator_argument() {
			return getRuleContext(Operator_argumentContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Operator_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperator_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperator_method_declaration(this);
		}
	}

	public final Operator_method_declarationContext operator_method_declaration() throws RecognitionException {
		Operator_method_declarationContext _localctx = new Operator_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operator_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BOOLEAN - 47)) | (1L << (CHARACTER - 47)) | (1L << (TEXT - 47)) | (1L << (INTEGER - 47)) | (1L << (DECIMAL - 47)) | (1L << (DATE - 47)) | (1L << (TIME - 47)) | (1L << (DATETIME - 47)) | (1L << (PERIOD - 47)) | (1L << (VERSION - 47)) | (1L << (CODE - 47)) | (1L << (DOCUMENT - 47)) | (1L << (BLOB - 47)) | (1L << (IMAGE - 47)) | (1L << (UUID - 47)) | (1L << (ITERATOR - 47)) | (1L << (CURSOR - 47)) | (1L << (HTML - 47)))) != 0) || _la==TYPE_IDENTIFIER) {
				{
				setState(599);
				((Operator_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(602);
			match(OPERATOR);
			setState(603);
			((Operator_method_declarationContext)_localctx).op = operator();
			setState(604);
			match(LPAR);
			setState(605);
			((Operator_method_declarationContext)_localctx).arg = operator_argument();
			setState(606);
			match(RPAR);
			setState(607);
			match(LCURL);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (BREAK - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (RETURN - 135)) | (1L << (STORE - 135)) | (1L << (SWITCH - 135)) | (1L << (THROW - 135)) | (1L << (TRY - 135)) | (1L << (WITH - 135)) | (1L << (WHILE - 135)) | (1L << (WRITE - 135)) | (1L << (SYMBOL_IDENTIFIER - 135)) | (1L << (TYPE_IDENTIFIER - 135)) | (1L << (VARIABLE_IDENTIFIER - 135)))) != 0)) {
				{
				setState(608);
				((Operator_method_declarationContext)_localctx).stmts = statement_list();
				}
			}

			setState(611);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_method_declarationContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public TerminalNode SETTER() { return getToken(OParser.SETTER, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Setter_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSetter_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSetter_method_declaration(this);
		}
	}

	public final Setter_method_declarationContext setter_method_declaration() throws RecognitionException {
		Setter_method_declarationContext _localctx = new Setter_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_setter_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(SETTER);
			setState(614);
			((Setter_method_declarationContext)_localctx).name = variable_identifier();
			setState(615);
			match(LCURL);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (BREAK - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (RETURN - 135)) | (1L << (STORE - 135)) | (1L << (SWITCH - 135)) | (1L << (THROW - 135)) | (1L << (TRY - 135)) | (1L << (WITH - 135)) | (1L << (WHILE - 135)) | (1L << (WRITE - 135)) | (1L << (SYMBOL_IDENTIFIER - 135)) | (1L << (TYPE_IDENTIFIER - 135)) | (1L << (VARIABLE_IDENTIFIER - 135)))) != 0)) {
				{
				setState(616);
				((Setter_method_declarationContext)_localctx).stmts = statement_list();
				}
			}

			setState(619);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_setter_declarationContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Native_statement_listContext stmts;
		public TerminalNode SETTER() { return getToken(OParser.SETTER, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
		public Native_statement_listContext native_statement_list() {
			return getRuleContext(Native_statement_listContext.class,0);
		}
		public Native_setter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_setter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_setter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_setter_declaration(this);
		}
	}

	public final Native_setter_declarationContext native_setter_declaration() throws RecognitionException {
		Native_setter_declarationContext _localctx = new Native_setter_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_native_setter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(621);
				match(NATIVE);
				}
			}

			setState(624);
			match(SETTER);
			setState(625);
			((Native_setter_declarationContext)_localctx).name = variable_identifier();
			setState(626);
			match(LCURL);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT))) != 0)) {
				{
				setState(627);
				((Native_setter_declarationContext)_localctx).stmts = native_statement_list();
				}
			}

			setState(630);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_method_declarationContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public TerminalNode GETTER() { return getToken(OParser.GETTER, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Getter_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterGetter_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitGetter_method_declaration(this);
		}
	}

	public final Getter_method_declarationContext getter_method_declaration() throws RecognitionException {
		Getter_method_declarationContext _localctx = new Getter_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_getter_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(GETTER);
			setState(633);
			((Getter_method_declarationContext)_localctx).name = variable_identifier();
			setState(634);
			match(LCURL);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (BREAK - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (RETURN - 135)) | (1L << (STORE - 135)) | (1L << (SWITCH - 135)) | (1L << (THROW - 135)) | (1L << (TRY - 135)) | (1L << (WITH - 135)) | (1L << (WHILE - 135)) | (1L << (WRITE - 135)) | (1L << (SYMBOL_IDENTIFIER - 135)) | (1L << (TYPE_IDENTIFIER - 135)) | (1L << (VARIABLE_IDENTIFIER - 135)))) != 0)) {
				{
				setState(635);
				((Getter_method_declarationContext)_localctx).stmts = statement_list();
				}
			}

			setState(638);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_getter_declarationContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Native_statement_listContext stmts;
		public TerminalNode GETTER() { return getToken(OParser.GETTER, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
		public Native_statement_listContext native_statement_list() {
			return getRuleContext(Native_statement_listContext.class,0);
		}
		public Native_getter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_getter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_getter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_getter_declaration(this);
		}
	}

	public final Native_getter_declarationContext native_getter_declaration() throws RecognitionException {
		Native_getter_declarationContext _localctx = new Native_getter_declarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_native_getter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(640);
				match(NATIVE);
				}
			}

			setState(643);
			match(GETTER);
			setState(644);
			((Native_getter_declarationContext)_localctx).name = variable_identifier();
			setState(645);
			match(LCURL);
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT))) != 0)) {
				{
				setState(646);
				((Native_getter_declarationContext)_localctx).stmts = native_statement_list();
				}
			}

			setState(649);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_resource_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_identifier_listContext attrs;
		public Native_category_bindingsContext bindings;
		public Native_member_method_declaration_listContext methods;
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
		public TerminalNode RESOURCE() { return getToken(OParser.RESOURCE, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Native_category_bindingsContext native_category_bindings() {
			return getRuleContext(Native_category_bindingsContext.class,0);
		}
		public TerminalNode STORABLE() { return getToken(OParser.STORABLE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
		}
		public Native_member_method_declaration_listContext native_member_method_declaration_list() {
			return getRuleContext(Native_member_method_declaration_listContext.class,0);
		}
		public Native_resource_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_resource_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_resource_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_resource_declaration(this);
		}
	}

	public final Native_resource_declarationContext native_resource_declaration() throws RecognitionException {
		Native_resource_declarationContext _localctx = new Native_resource_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_native_resource_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(651);
				match(STORABLE);
				}
			}

			setState(654);
			match(NATIVE);
			setState(655);
			match(RESOURCE);
			setState(656);
			((Native_resource_declarationContext)_localctx).name = type_identifier();
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(657);
				match(LPAR);
				setState(658);
				((Native_resource_declarationContext)_localctx).attrs = attribute_identifier_list();
				setState(659);
				match(RPAR);
				}
			}

			setState(663);
			match(LCURL);
			setState(664);
			((Native_resource_declarationContext)_localctx).bindings = native_category_bindings();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BOOLEAN - 47)) | (1L << (CHARACTER - 47)) | (1L << (TEXT - 47)) | (1L << (INTEGER - 47)) | (1L << (DECIMAL - 47)) | (1L << (DATE - 47)) | (1L << (TIME - 47)) | (1L << (DATETIME - 47)) | (1L << (PERIOD - 47)) | (1L << (VERSION - 47)) | (1L << (CODE - 47)) | (1L << (DOCUMENT - 47)) | (1L << (BLOB - 47)) | (1L << (IMAGE - 47)) | (1L << (UUID - 47)) | (1L << (ITERATOR - 47)) | (1L << (CURSOR - 47)) | (1L << (HTML - 47)) | (1L << (ANY - 47)) | (1L << (GETTER - 47)))) != 0) || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (METHOD - 114)) | (1L << (NATIVE - 114)) | (1L << (SETTER - 114)) | (1L << (TYPE_IDENTIFIER - 114)))) != 0)) {
				{
				setState(665);
				((Native_resource_declarationContext)_localctx).methods = native_member_method_declaration_list();
				}
			}

			setState(668);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_category_declarationContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Attribute_identifier_listContext attrs;
		public Native_category_bindingsContext bindings;
		public Native_member_method_declaration_listContext methods;
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
		public TerminalNode CATEGORY() { return getToken(OParser.CATEGORY, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Native_category_bindingsContext native_category_bindings() {
			return getRuleContext(Native_category_bindingsContext.class,0);
		}
		public TerminalNode STORABLE() { return getToken(OParser.STORABLE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
		}
		public Native_member_method_declaration_listContext native_member_method_declaration_list() {
			return getRuleContext(Native_member_method_declaration_listContext.class,0);
		}
		public Native_category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_category_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_category_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_category_declaration(this);
		}
	}

	public final Native_category_declarationContext native_category_declaration() throws RecognitionException {
		Native_category_declarationContext _localctx = new Native_category_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_native_category_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORABLE) {
				{
				setState(670);
				match(STORABLE);
				}
			}

			setState(673);
			match(NATIVE);
			setState(674);
			match(CATEGORY);
			setState(675);
			((Native_category_declarationContext)_localctx).name = type_identifier();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(676);
				match(LPAR);
				setState(677);
				((Native_category_declarationContext)_localctx).attrs = attribute_identifier_list();
				setState(678);
				match(RPAR);
				}
			}

			setState(682);
			match(LCURL);
			setState(683);
			((Native_category_declarationContext)_localctx).bindings = native_category_bindings();
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BOOLEAN - 47)) | (1L << (CHARACTER - 47)) | (1L << (TEXT - 47)) | (1L << (INTEGER - 47)) | (1L << (DECIMAL - 47)) | (1L << (DATE - 47)) | (1L << (TIME - 47)) | (1L << (DATETIME - 47)) | (1L << (PERIOD - 47)) | (1L << (VERSION - 47)) | (1L << (CODE - 47)) | (1L << (DOCUMENT - 47)) | (1L << (BLOB - 47)) | (1L << (IMAGE - 47)) | (1L << (UUID - 47)) | (1L << (ITERATOR - 47)) | (1L << (CURSOR - 47)) | (1L << (HTML - 47)) | (1L << (ANY - 47)) | (1L << (GETTER - 47)))) != 0) || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (METHOD - 114)) | (1L << (NATIVE - 114)) | (1L << (SETTER - 114)) | (1L << (TYPE_IDENTIFIER - 114)))) != 0)) {
				{
				setState(684);
				((Native_category_declarationContext)_localctx).methods = native_member_method_declaration_list();
				}
			}

			setState(687);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_category_bindingsContext extends ParserRuleContext {
		public Native_category_binding_listContext items;
		public TerminalNode CATEGORY() { return getToken(OParser.CATEGORY, 0); }
		public TerminalNode BINDINGS() { return getToken(OParser.BINDINGS, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Native_category_binding_listContext native_category_binding_list() {
			return getRuleContext(Native_category_binding_listContext.class,0);
		}
		public Native_category_bindingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_category_bindings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_category_bindings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_category_bindings(this);
		}
	}

	public final Native_category_bindingsContext native_category_bindings() throws RecognitionException {
		Native_category_bindingsContext _localctx = new Native_category_bindingsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_native_category_bindings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(CATEGORY);
			setState(690);
			match(BINDINGS);
			setState(691);
			match(LCURL);
			setState(692);
			((Native_category_bindingsContext)_localctx).items = native_category_binding_list(0);
			setState(693);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_category_binding_listContext extends ParserRuleContext {
		public Native_category_binding_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_category_binding_list; }
	 
		public Native_category_binding_listContext() { }
		public void copyFrom(Native_category_binding_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NativeCategoryBindingListItemContext extends Native_category_binding_listContext {
		public Native_category_binding_listContext items;
		public Native_category_bindingContext item;
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Native_category_binding_listContext native_category_binding_list() {
			return getRuleContext(Native_category_binding_listContext.class,0);
		}
		public Native_category_bindingContext native_category_binding() {
			return getRuleContext(Native_category_bindingContext.class,0);
		}
		public NativeCategoryBindingListItemContext(Native_category_binding_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeCategoryBindingListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeCategoryBindingListItem(this);
		}
	}
	public static class NativeCategoryBindingListContext extends Native_category_binding_listContext {
		public Native_category_bindingContext item;
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Native_category_bindingContext native_category_binding() {
			return getRuleContext(Native_category_bindingContext.class,0);
		}
		public NativeCategoryBindingListContext(Native_category_binding_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeCategoryBindingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeCategoryBindingList(this);
		}
	}

	public final Native_category_binding_listContext native_category_binding_list() throws RecognitionException {
		return native_category_binding_list(0);
	}

	private Native_category_binding_listContext native_category_binding_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Native_category_binding_listContext _localctx = new Native_category_binding_listContext(_ctx, _parentState);
		Native_category_binding_listContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_native_category_binding_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NativeCategoryBindingListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(696);
			((NativeCategoryBindingListContext)_localctx).item = native_category_binding();
			setState(697);
			match(SEMI);
			}
			_ctx.stop = _input.LT(-1);
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NativeCategoryBindingListItemContext(new Native_category_binding_listContext(_parentctx, _parentState));
					((NativeCategoryBindingListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_native_category_binding_list);
					setState(699);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(700);
					((NativeCategoryBindingListItemContext)_localctx).item = native_category_binding();
					setState(701);
					match(SEMI);
					}
					} 
				}
				setState(707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class Abstract_method_declarationContext extends ParserRuleContext {
		public TypedefContext typ;
		public Method_identifierContext name;
		public Argument_listContext args;
		public TerminalNode ABSTRACT() { return getToken(OParser.ABSTRACT, 0); }
		public TerminalNode METHOD() { return getToken(OParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Abstract_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAbstract_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAbstract_method_declaration(this);
		}
	}

	public final Abstract_method_declarationContext abstract_method_declaration() throws RecognitionException {
		Abstract_method_declarationContext _localctx = new Abstract_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_abstract_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(ABSTRACT);
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BOOLEAN - 47)) | (1L << (CHARACTER - 47)) | (1L << (TEXT - 47)) | (1L << (INTEGER - 47)) | (1L << (DECIMAL - 47)) | (1L << (DATE - 47)) | (1L << (TIME - 47)) | (1L << (DATETIME - 47)) | (1L << (PERIOD - 47)) | (1L << (VERSION - 47)) | (1L << (CODE - 47)) | (1L << (DOCUMENT - 47)) | (1L << (BLOB - 47)) | (1L << (IMAGE - 47)) | (1L << (UUID - 47)) | (1L << (ITERATOR - 47)) | (1L << (CURSOR - 47)) | (1L << (HTML - 47)))) != 0) || _la==TYPE_IDENTIFIER) {
				{
				setState(709);
				((Abstract_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(712);
			match(METHOD);
			setState(713);
			((Abstract_method_declarationContext)_localctx).name = method_identifier();
			setState(714);
			match(LPAR);
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BOOLEAN - 47)) | (1L << (CHARACTER - 47)) | (1L << (TEXT - 47)) | (1L << (INTEGER - 47)) | (1L << (DECIMAL - 47)) | (1L << (DATE - 47)) | (1L << (TIME - 47)) | (1L << (DATETIME - 47)) | (1L << (PERIOD - 47)) | (1L << (VERSION - 47)) | (1L << (CODE - 47)) | (1L << (DOCUMENT - 47)) | (1L << (BLOB - 47)) | (1L << (IMAGE - 47)) | (1L << (UUID - 47)) | (1L << (ITERATOR - 47)) | (1L << (CURSOR - 47)) | (1L << (HTML - 47)) | (1L << (ANY - 47)))) != 0) || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (MUTABLE - 117)) | (1L << (TYPE_IDENTIFIER - 117)) | (1L << (VARIABLE_IDENTIFIER - 117)))) != 0)) {
				{
				setState(715);
				((Abstract_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(718);
			match(RPAR);
			setState(719);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Concrete_method_declarationContext extends ParserRuleContext {
		public TypedefContext typ;
		public Method_identifierContext name;
		public Argument_listContext args;
		public Statement_listContext stmts;
		public TerminalNode METHOD() { return getToken(OParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Concrete_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concrete_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConcrete_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConcrete_method_declaration(this);
		}
	}

	public final Concrete_method_declarationContext concrete_method_declaration() throws RecognitionException {
		Concrete_method_declarationContext _localctx = new Concrete_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_concrete_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BOOLEAN - 47)) | (1L << (CHARACTER - 47)) | (1L << (TEXT - 47)) | (1L << (INTEGER - 47)) | (1L << (DECIMAL - 47)) | (1L << (DATE - 47)) | (1L << (TIME - 47)) | (1L << (DATETIME - 47)) | (1L << (PERIOD - 47)) | (1L << (VERSION - 47)) | (1L << (CODE - 47)) | (1L << (DOCUMENT - 47)) | (1L << (BLOB - 47)) | (1L << (IMAGE - 47)) | (1L << (UUID - 47)) | (1L << (ITERATOR - 47)) | (1L << (CURSOR - 47)) | (1L << (HTML - 47)))) != 0) || _la==TYPE_IDENTIFIER) {
				{
				setState(721);
				((Concrete_method_declarationContext)_localctx).typ = typedef(0);
				}
			}

			setState(724);
			match(METHOD);
			setState(725);
			((Concrete_method_declarationContext)_localctx).name = method_identifier();
			setState(726);
			match(LPAR);
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BOOLEAN - 47)) | (1L << (CHARACTER - 47)) | (1L << (TEXT - 47)) | (1L << (INTEGER - 47)) | (1L << (DECIMAL - 47)) | (1L << (DATE - 47)) | (1L << (TIME - 47)) | (1L << (DATETIME - 47)) | (1L << (PERIOD - 47)) | (1L << (VERSION - 47)) | (1L << (CODE - 47)) | (1L << (DOCUMENT - 47)) | (1L << (BLOB - 47)) | (1L << (IMAGE - 47)) | (1L << (UUID - 47)) | (1L << (ITERATOR - 47)) | (1L << (CURSOR - 47)) | (1L << (HTML - 47)) | (1L << (ANY - 47)))) != 0) || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (MUTABLE - 117)) | (1L << (TYPE_IDENTIFIER - 117)) | (1L << (VARIABLE_IDENTIFIER - 117)))) != 0)) {
				{
				setState(727);
				((Concrete_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(730);
			match(RPAR);
			setState(731);
			match(LCURL);
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (BREAK - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (RETURN - 135)) | (1L << (STORE - 135)) | (1L << (SWITCH - 135)) | (1L << (THROW - 135)) | (1L << (TRY - 135)) | (1L << (WITH - 135)) | (1L << (WHILE - 135)) | (1L << (WRITE - 135)) | (1L << (SYMBOL_IDENTIFIER - 135)) | (1L << (TYPE_IDENTIFIER - 135)) | (1L << (VARIABLE_IDENTIFIER - 135)))) != 0)) {
				{
				setState(732);
				((Concrete_method_declarationContext)_localctx).stmts = statement_list();
				}
			}

			setState(735);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_method_declarationContext extends ParserRuleContext {
		public Category_or_any_typeContext typ;
		public Method_identifierContext name;
		public Argument_listContext args;
		public Native_statement_listContext stmts;
		public TerminalNode METHOD() { return getToken(OParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public Native_statement_listContext native_statement_list() {
			return getRuleContext(Native_statement_listContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Native_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_method_declaration(this);
		}
	}

	public final Native_method_declarationContext native_method_declaration() throws RecognitionException {
		Native_method_declarationContext _localctx = new Native_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_native_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BOOLEAN - 47)) | (1L << (CHARACTER - 47)) | (1L << (TEXT - 47)) | (1L << (INTEGER - 47)) | (1L << (DECIMAL - 47)) | (1L << (DATE - 47)) | (1L << (TIME - 47)) | (1L << (DATETIME - 47)) | (1L << (PERIOD - 47)) | (1L << (VERSION - 47)) | (1L << (CODE - 47)) | (1L << (DOCUMENT - 47)) | (1L << (BLOB - 47)) | (1L << (IMAGE - 47)) | (1L << (UUID - 47)) | (1L << (ITERATOR - 47)) | (1L << (CURSOR - 47)) | (1L << (HTML - 47)) | (1L << (ANY - 47)))) != 0) || _la==TYPE_IDENTIFIER) {
				{
				setState(737);
				((Native_method_declarationContext)_localctx).typ = category_or_any_type();
				}
			}

			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(740);
				match(NATIVE);
				}
			}

			setState(743);
			match(METHOD);
			setState(744);
			((Native_method_declarationContext)_localctx).name = method_identifier();
			setState(745);
			match(LPAR);
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BOOLEAN - 47)) | (1L << (CHARACTER - 47)) | (1L << (TEXT - 47)) | (1L << (INTEGER - 47)) | (1L << (DECIMAL - 47)) | (1L << (DATE - 47)) | (1L << (TIME - 47)) | (1L << (DATETIME - 47)) | (1L << (PERIOD - 47)) | (1L << (VERSION - 47)) | (1L << (CODE - 47)) | (1L << (DOCUMENT - 47)) | (1L << (BLOB - 47)) | (1L << (IMAGE - 47)) | (1L << (UUID - 47)) | (1L << (ITERATOR - 47)) | (1L << (CURSOR - 47)) | (1L << (HTML - 47)) | (1L << (ANY - 47)))) != 0) || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (MUTABLE - 117)) | (1L << (TYPE_IDENTIFIER - 117)) | (1L << (VARIABLE_IDENTIFIER - 117)))) != 0)) {
				{
				setState(746);
				((Native_method_declarationContext)_localctx).args = argument_list();
				}
			}

			setState(749);
			match(RPAR);
			setState(750);
			match(LCURL);
			setState(751);
			((Native_method_declarationContext)_localctx).stmts = native_statement_list();
			setState(752);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Test_method_declarationContext extends ParserRuleContext {
		public Token name;
		public Statement_listContext stmts;
		public Assertion_listContext exps;
		public Symbol_identifierContext error;
		public TerminalNode TEST() { return getToken(OParser.TEST, 0); }
		public TerminalNode METHOD() { return getToken(OParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public List<TerminalNode> LCURL() { return getTokens(OParser.LCURL); }
		public TerminalNode LCURL(int i) {
			return getToken(OParser.LCURL, i);
		}
		public List<TerminalNode> RCURL() { return getTokens(OParser.RCURL); }
		public TerminalNode RCURL(int i) {
			return getToken(OParser.RCURL, i);
		}
		public TerminalNode VERIFYING() { return getToken(OParser.VERIFYING, 0); }
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Assertion_listContext assertion_list() {
			return getRuleContext(Assertion_listContext.class,0);
		}
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public Test_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTest_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTest_method_declaration(this);
		}
	}

	public final Test_method_declarationContext test_method_declaration() throws RecognitionException {
		Test_method_declarationContext _localctx = new Test_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_test_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(TEST);
			setState(755);
			match(METHOD);
			setState(756);
			((Test_method_declarationContext)_localctx).name = match(TEXT_LITERAL);
			setState(757);
			match(LPAR);
			setState(758);
			match(RPAR);
			setState(759);
			match(LCURL);
			setState(760);
			((Test_method_declarationContext)_localctx).stmts = statement_list();
			setState(761);
			match(RCURL);
			setState(762);
			match(VERIFYING);
			setState(770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				{
				{
				setState(763);
				match(LCURL);
				setState(764);
				((Test_method_declarationContext)_localctx).exps = assertion_list();
				setState(765);
				match(RCURL);
				}
				}
				break;
			case SYMBOL_IDENTIFIER:
				{
				{
				setState(767);
				((Test_method_declarationContext)_localctx).error = symbol_identifier();
				setState(768);
				match(SEMI);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AssertionContext extends ParserRuleContext {
		public ExpressionContext exp;
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssertion(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			((AssertionContext)_localctx).exp = expression(0);
			setState(773);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typed_argumentContext extends ParserRuleContext {
		public Category_or_any_typeContext typ;
		public Attribute_identifier_listContext attrs;
		public Variable_identifierContext name;
		public Literal_expressionContext value;
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
		public Attribute_identifier_listContext attribute_identifier_list() {
			return getRuleContext(Attribute_identifier_listContext.class,0);
		}
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Typed_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTyped_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTyped_argument(this);
		}
	}

	public final Typed_argumentContext typed_argument() throws RecognitionException {
		Typed_argumentContext _localctx = new Typed_argumentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typed_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			((Typed_argumentContext)_localctx).typ = category_or_any_type();
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(776);
				match(LPAR);
				setState(777);
				((Typed_argumentContext)_localctx).attrs = attribute_identifier_list();
				setState(778);
				match(RPAR);
				}
			}

			setState(782);
			((Typed_argumentContext)_localctx).name = variable_identifier();
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(783);
				match(EQ);
				setState(784);
				((Typed_argumentContext)_localctx).value = literal_expression();
				}
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

	public static class Statement_or_listContext extends ParserRuleContext {
		public Statement_or_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_or_list; }
	 
		public Statement_or_listContext() { }
		public void copyFrom(Statement_or_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CurlyStatementListContext extends Statement_or_listContext {
		public Statement_listContext items;
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public CurlyStatementListContext(Statement_or_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCurlyStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCurlyStatementList(this);
		}
	}
	public static class SingleStatementContext extends Statement_or_listContext {
		public StatementContext stmt;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleStatementContext(Statement_or_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSingleStatement(this);
		}
	}

	public final Statement_or_listContext statement_or_list() throws RecognitionException {
		Statement_or_listContext _localctx = new Statement_or_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statement_or_list);
		try {
			setState(794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case BREAK:
			case DELETE:
			case DO:
			case FLUSH:
			case FOR:
			case IF:
			case METHOD:
			case RETURN:
			case STORE:
			case SWITCH:
			case THROW:
			case TRY:
			case WITH:
			case WHILE:
			case WRITE:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				_localctx = new SingleStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(787);
				((SingleStatementContext)_localctx).stmt = statement();
				}
				break;
			case LCURL:
				_localctx = new CurlyStatementListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(788);
				match(LCURL);
				setState(792);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(789);
					((CurlyStatementListContext)_localctx).items = statement_list();
					setState(790);
					match(RCURL);
					}
					break;
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommentStatementContext extends StatementContext {
		public Comment_statementContext decl;
		public Comment_statementContext comment_statement() {
			return getRuleContext(Comment_statementContext.class,0);
		}
		public CommentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCommentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCommentStatement(this);
		}
	}
	public static class StoreStatementContext extends StatementContext {
		public Store_statementContext stmt;
		public Store_statementContext store_statement() {
			return getRuleContext(Store_statementContext.class,0);
		}
		public StoreStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterStoreStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitStoreStatement(this);
		}
	}
	public static class WithSingletonStatementContext extends StatementContext {
		public With_singleton_statementContext stmt;
		public With_singleton_statementContext with_singleton_statement() {
			return getRuleContext(With_singleton_statementContext.class,0);
		}
		public WithSingletonStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWithSingletonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWithSingletonStatement(this);
		}
	}
	public static class WriteStatementContext extends StatementContext {
		public Write_statementContext stmt;
		public Write_statementContext write_statement() {
			return getRuleContext(Write_statementContext.class,0);
		}
		public WriteStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWriteStatement(this);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public While_statementContext stmt;
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWhileStatement(this);
		}
	}
	public static class WithResourceStatementContext extends StatementContext {
		public With_resource_statementContext stmt;
		public With_resource_statementContext with_resource_statement() {
			return getRuleContext(With_resource_statementContext.class,0);
		}
		public WithResourceStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWithResourceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWithResourceStatement(this);
		}
	}
	public static class RaiseStatementContext extends StatementContext {
		public Raise_statementContext stmt;
		public Raise_statementContext raise_statement() {
			return getRuleContext(Raise_statementContext.class,0);
		}
		public RaiseStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRaiseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRaiseStatement(this);
		}
	}
	public static class BreakStatementContext extends StatementContext {
		public Break_statementContext stmt;
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public BreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitBreakStatement(this);
		}
	}
	public static class AssignInstanceStatementContext extends StatementContext {
		public Assign_instance_statementContext stmt;
		public Assign_instance_statementContext assign_instance_statement() {
			return getRuleContext(Assign_instance_statementContext.class,0);
		}
		public AssignInstanceStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssignInstanceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssignInstanceStatement(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public If_statementContext stmt;
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIfStatement(this);
		}
	}
	public static class SwitchStatementContext extends StatementContext {
		public Switch_statementContext stmt;
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public SwitchStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSwitchStatement(this);
		}
	}
	public static class TryStatementContext extends StatementContext {
		public Try_statementContext stmt;
		public Try_statementContext try_statement() {
			return getRuleContext(Try_statementContext.class,0);
		}
		public TryStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTryStatement(this);
		}
	}
	public static class MethodCallStatementContext extends StatementContext {
		public Method_callContext stmt;
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public MethodCallStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethodCallStatement(this);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public Return_statementContext stmt;
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitReturnStatement(this);
		}
	}
	public static class AssignTupleStatementContext extends StatementContext {
		public Assign_tuple_statementContext stmt;
		public Assign_tuple_statementContext assign_tuple_statement() {
			return getRuleContext(Assign_tuple_statementContext.class,0);
		}
		public AssignTupleStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssignTupleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssignTupleStatement(this);
		}
	}
	public static class ClosureStatementContext extends StatementContext {
		public Concrete_method_declarationContext decl;
		public Concrete_method_declarationContext concrete_method_declaration() {
			return getRuleContext(Concrete_method_declarationContext.class,0);
		}
		public ClosureStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterClosureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitClosureStatement(this);
		}
	}
	public static class FlushStatementContext extends StatementContext {
		public Flush_statementContext stmt;
		public Flush_statementContext flush_statement() {
			return getRuleContext(Flush_statementContext.class,0);
		}
		public FlushStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFlushStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFlushStatement(this);
		}
	}
	public static class DoWhileStatementContext extends StatementContext {
		public Do_while_statementContext stmt;
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public DoWhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDoWhileStatement(this);
		}
	}
	public static class ForEachStatementContext extends StatementContext {
		public For_each_statementContext stmt;
		public For_each_statementContext for_each_statement() {
			return getRuleContext(For_each_statementContext.class,0);
		}
		public ForEachStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitForEachStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new MethodCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				((MethodCallStatementContext)_localctx).stmt = method_call();
				setState(797);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new AssignInstanceStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				((AssignInstanceStatementContext)_localctx).stmt = assign_instance_statement();
				}
				break;
			case 3:
				_localctx = new AssignTupleStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(800);
				((AssignTupleStatementContext)_localctx).stmt = assign_tuple_statement();
				}
				break;
			case 4:
				_localctx = new StoreStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(801);
				((StoreStatementContext)_localctx).stmt = store_statement();
				}
				break;
			case 5:
				_localctx = new FlushStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(802);
				((FlushStatementContext)_localctx).stmt = flush_statement();
				}
				break;
			case 6:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(803);
				((BreakStatementContext)_localctx).stmt = break_statement();
				}
				break;
			case 7:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(804);
				((ReturnStatementContext)_localctx).stmt = return_statement();
				}
				break;
			case 8:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(805);
				((IfStatementContext)_localctx).stmt = if_statement();
				}
				break;
			case 9:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(806);
				((SwitchStatementContext)_localctx).stmt = switch_statement();
				}
				break;
			case 10:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(807);
				((ForEachStatementContext)_localctx).stmt = for_each_statement();
				}
				break;
			case 11:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(808);
				((WhileStatementContext)_localctx).stmt = while_statement();
				}
				break;
			case 12:
				_localctx = new DoWhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(809);
				((DoWhileStatementContext)_localctx).stmt = do_while_statement();
				}
				break;
			case 13:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(810);
				((TryStatementContext)_localctx).stmt = try_statement();
				}
				break;
			case 14:
				_localctx = new RaiseStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(811);
				((RaiseStatementContext)_localctx).stmt = raise_statement();
				}
				break;
			case 15:
				_localctx = new WriteStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(812);
				((WriteStatementContext)_localctx).stmt = write_statement();
				}
				break;
			case 16:
				_localctx = new WithResourceStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(813);
				((WithResourceStatementContext)_localctx).stmt = with_resource_statement();
				}
				break;
			case 17:
				_localctx = new WithSingletonStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(814);
				((WithSingletonStatementContext)_localctx).stmt = with_singleton_statement();
				}
				break;
			case 18:
				_localctx = new ClosureStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(815);
				((ClosureStatementContext)_localctx).decl = concrete_method_declaration();
				}
				break;
			case 19:
				_localctx = new CommentStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(816);
				((CommentStatementContext)_localctx).decl = comment_statement();
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

	public static class Flush_statementContext extends ParserRuleContext {
		public TerminalNode FLUSH() { return getToken(OParser.FLUSH, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Flush_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flush_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFlush_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFlush_statement(this);
		}
	}

	public final Flush_statementContext flush_statement() throws RecognitionException {
		Flush_statementContext _localctx = new Flush_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_flush_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(FLUSH);
			setState(820);
			match(LPAR);
			setState(821);
			match(RPAR);
			setState(822);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Store_statementContext extends ParserRuleContext {
		public Expression_listContext to_del;
		public Expression_listContext to_add;
		public TerminalNode DELETE() { return getToken(OParser.DELETE, 0); }
		public List<TerminalNode> LPAR() { return getTokens(OParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(OParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(OParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(OParser.RPAR, i);
		}
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public List<Expression_listContext> expression_list() {
			return getRuleContexts(Expression_listContext.class);
		}
		public Expression_listContext expression_list(int i) {
			return getRuleContext(Expression_listContext.class,i);
		}
		public TerminalNode STORE() { return getToken(OParser.STORE, 0); }
		public TerminalNode AND() { return getToken(OParser.AND, 0); }
		public Store_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterStore_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitStore_statement(this);
		}
	}

	public final Store_statementContext store_statement() throws RecognitionException {
		Store_statementContext _localctx = new Store_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_store_statement);
		try {
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				match(DELETE);
				setState(825);
				match(LPAR);
				setState(826);
				((Store_statementContext)_localctx).to_del = expression_list();
				setState(827);
				match(RPAR);
				setState(828);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				match(STORE);
				setState(831);
				match(LPAR);
				setState(832);
				((Store_statementContext)_localctx).to_add = expression_list();
				setState(833);
				match(RPAR);
				setState(834);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(836);
				match(DELETE);
				setState(837);
				match(LPAR);
				setState(838);
				((Store_statementContext)_localctx).to_del = expression_list();
				setState(839);
				match(RPAR);
				setState(840);
				match(AND);
				setState(841);
				match(STORE);
				setState(842);
				match(LPAR);
				setState(843);
				((Store_statementContext)_localctx).to_add = expression_list();
				setState(844);
				match(RPAR);
				setState(845);
				match(SEMI);
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

	public static class With_resource_statementContext extends ParserRuleContext {
		public Assign_variable_statementContext stmt;
		public Statement_or_listContext stmts;
		public TerminalNode WITH() { return getToken(OParser.WITH, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Assign_variable_statementContext assign_variable_statement() {
			return getRuleContext(Assign_variable_statementContext.class,0);
		}
		public Statement_or_listContext statement_or_list() {
			return getRuleContext(Statement_or_listContext.class,0);
		}
		public With_resource_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_resource_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWith_resource_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWith_resource_statement(this);
		}
	}

	public final With_resource_statementContext with_resource_statement() throws RecognitionException {
		With_resource_statementContext _localctx = new With_resource_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_with_resource_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(WITH);
			setState(850);
			match(LPAR);
			setState(851);
			((With_resource_statementContext)_localctx).stmt = assign_variable_statement();
			setState(852);
			match(RPAR);
			setState(853);
			((With_resource_statementContext)_localctx).stmts = statement_or_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_singleton_statementContext extends ParserRuleContext {
		public Type_identifierContext typ;
		public Statement_or_listContext stmts;
		public TerminalNode WITH() { return getToken(OParser.WITH, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Statement_or_listContext statement_or_list() {
			return getRuleContext(Statement_or_listContext.class,0);
		}
		public With_singleton_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_singleton_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWith_singleton_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWith_singleton_statement(this);
		}
	}

	public final With_singleton_statementContext with_singleton_statement() throws RecognitionException {
		With_singleton_statementContext _localctx = new With_singleton_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_with_singleton_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(WITH);
			setState(856);
			match(LPAR);
			setState(857);
			((With_singleton_statementContext)_localctx).typ = type_identifier();
			setState(858);
			match(RPAR);
			setState(859);
			((With_singleton_statementContext)_localctx).stmts = statement_or_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_statementContext extends ParserRuleContext {
		public ExpressionContext exp;
		public Switch_case_statement_listContext cases;
		public Statement_listContext stmts;
		public TerminalNode SWITCH() { return getToken(OParser.SWITCH, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Switch_case_statement_listContext switch_case_statement_list() {
			return getRuleContext(Switch_case_statement_listContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(OParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSwitch_statement(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(SWITCH);
			setState(862);
			match(LPAR);
			setState(863);
			((Switch_statementContext)_localctx).exp = expression(0);
			setState(864);
			match(RPAR);
			setState(865);
			match(LCURL);
			setState(866);
			((Switch_statementContext)_localctx).cases = switch_case_statement_list();
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(867);
				match(DEFAULT);
				setState(868);
				match(COLON);
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (BREAK - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (RETURN - 135)) | (1L << (STORE - 135)) | (1L << (SWITCH - 135)) | (1L << (THROW - 135)) | (1L << (TRY - 135)) | (1L << (WITH - 135)) | (1L << (WHILE - 135)) | (1L << (WRITE - 135)) | (1L << (SYMBOL_IDENTIFIER - 135)) | (1L << (TYPE_IDENTIFIER - 135)) | (1L << (VARIABLE_IDENTIFIER - 135)))) != 0)) {
					{
					setState(869);
					((Switch_statementContext)_localctx).stmts = statement_list();
					}
				}

				}
			}

			setState(874);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_case_statementContext extends ParserRuleContext {
		public Switch_case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case_statement; }
	 
		public Switch_case_statementContext() { }
		public void copyFrom(Switch_case_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomicSwitchCaseContext extends Switch_case_statementContext {
		public Atomic_literalContext exp;
		public Statement_listContext stmts;
		public TerminalNode CASE() { return getToken(OParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public Atomic_literalContext atomic_literal() {
			return getRuleContext(Atomic_literalContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public AtomicSwitchCaseContext(Switch_case_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAtomicSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAtomicSwitchCase(this);
		}
	}
	public static class CollectionSwitchCaseContext extends Switch_case_statementContext {
		public Literal_collectionContext exp;
		public Statement_listContext stmts;
		public TerminalNode CASE() { return getToken(OParser.CASE, 0); }
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public Literal_collectionContext literal_collection() {
			return getRuleContext(Literal_collectionContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public CollectionSwitchCaseContext(Switch_case_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCollectionSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCollectionSwitchCase(this);
		}
	}

	public final Switch_case_statementContext switch_case_statement() throws RecognitionException {
		Switch_case_statementContext _localctx = new Switch_case_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_switch_case_statement);
		int _la;
		try {
			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new AtomicSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				match(CASE);
				setState(877);
				((AtomicSwitchCaseContext)_localctx).exp = atomic_literal();
				setState(878);
				match(COLON);
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (BREAK - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (RETURN - 135)) | (1L << (STORE - 135)) | (1L << (SWITCH - 135)) | (1L << (THROW - 135)) | (1L << (TRY - 135)) | (1L << (WITH - 135)) | (1L << (WHILE - 135)) | (1L << (WRITE - 135)) | (1L << (SYMBOL_IDENTIFIER - 135)) | (1L << (TYPE_IDENTIFIER - 135)) | (1L << (VARIABLE_IDENTIFIER - 135)))) != 0)) {
					{
					setState(879);
					((AtomicSwitchCaseContext)_localctx).stmts = statement_list();
					}
				}

				}
				break;
			case 2:
				_localctx = new CollectionSwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				match(CASE);
				setState(883);
				match(IN);
				setState(884);
				((CollectionSwitchCaseContext)_localctx).exp = literal_collection();
				setState(885);
				match(COLON);
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (BREAK - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (RETURN - 135)) | (1L << (STORE - 135)) | (1L << (SWITCH - 135)) | (1L << (THROW - 135)) | (1L << (TRY - 135)) | (1L << (WITH - 135)) | (1L << (WHILE - 135)) | (1L << (WRITE - 135)) | (1L << (SYMBOL_IDENTIFIER - 135)) | (1L << (TYPE_IDENTIFIER - 135)) | (1L << (VARIABLE_IDENTIFIER - 135)))) != 0)) {
					{
					setState(886);
					((CollectionSwitchCaseContext)_localctx).stmts = statement_list();
					}
				}

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

	public static class For_each_statementContext extends ParserRuleContext {
		public Variable_identifierContext name1;
		public Variable_identifierContext name2;
		public ExpressionContext source;
		public Statement_or_listContext stmts;
		public TerminalNode FOR() { return getToken(OParser.FOR, 0); }
		public TerminalNode EACH() { return getToken(OParser.EACH, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public List<Variable_identifierContext> variable_identifier() {
			return getRuleContexts(Variable_identifierContext.class);
		}
		public Variable_identifierContext variable_identifier(int i) {
			return getRuleContext(Variable_identifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_or_listContext statement_or_list() {
			return getRuleContext(Statement_or_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public For_each_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFor_each_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFor_each_statement(this);
		}
	}

	public final For_each_statementContext for_each_statement() throws RecognitionException {
		For_each_statementContext _localctx = new For_each_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_for_each_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(FOR);
			setState(892);
			match(EACH);
			setState(893);
			match(LPAR);
			setState(894);
			((For_each_statementContext)_localctx).name1 = variable_identifier();
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(895);
				match(COMMA);
				setState(896);
				((For_each_statementContext)_localctx).name2 = variable_identifier();
				}
			}

			setState(899);
			match(IN);
			setState(900);
			((For_each_statementContext)_localctx).source = expression(0);
			setState(901);
			match(RPAR);
			setState(902);
			((For_each_statementContext)_localctx).stmts = statement_or_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_statementContext extends ParserRuleContext {
		public Statement_listContext stmts;
		public ExpressionContext exp;
		public TerminalNode DO() { return getToken(OParser.DO, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public TerminalNode WHILE() { return getToken(OParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDo_while_statement(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_do_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(DO);
			setState(905);
			match(LCURL);
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (BREAK - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (RETURN - 135)) | (1L << (STORE - 135)) | (1L << (SWITCH - 135)) | (1L << (THROW - 135)) | (1L << (TRY - 135)) | (1L << (WITH - 135)) | (1L << (WHILE - 135)) | (1L << (WRITE - 135)) | (1L << (SYMBOL_IDENTIFIER - 135)) | (1L << (TYPE_IDENTIFIER - 135)) | (1L << (VARIABLE_IDENTIFIER - 135)))) != 0)) {
				{
				setState(906);
				((Do_while_statementContext)_localctx).stmts = statement_list();
				}
			}

			setState(909);
			match(RCURL);
			setState(910);
			match(WHILE);
			setState(911);
			match(LPAR);
			setState(912);
			((Do_while_statementContext)_localctx).exp = expression(0);
			setState(913);
			match(RPAR);
			setState(914);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public ExpressionContext exp;
		public Statement_or_listContext stmts;
		public TerminalNode WHILE() { return getToken(OParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_or_listContext statement_or_list() {
			return getRuleContext(Statement_or_listContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(WHILE);
			setState(917);
			match(LPAR);
			setState(918);
			((While_statementContext)_localctx).exp = expression(0);
			setState(919);
			match(RPAR);
			setState(920);
			((While_statementContext)_localctx).stmts = statement_or_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public ExpressionContext exp;
		public Statement_or_listContext stmts;
		public Else_if_statement_listContext elseIfs;
		public Statement_or_listContext elseStmts;
		public TerminalNode IF() { return getToken(OParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Statement_or_listContext> statement_or_list() {
			return getRuleContexts(Statement_or_listContext.class);
		}
		public Statement_or_listContext statement_or_list(int i) {
			return getRuleContext(Statement_or_listContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(OParser.ELSE, 0); }
		public Else_if_statement_listContext else_if_statement_list() {
			return getRuleContext(Else_if_statement_listContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(IF);
			setState(923);
			match(LPAR);
			setState(924);
			((If_statementContext)_localctx).exp = expression(0);
			setState(925);
			match(RPAR);
			setState(926);
			((If_statementContext)_localctx).stmts = statement_or_list();
			setState(928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(927);
				((If_statementContext)_localctx).elseIfs = else_if_statement_list(0);
				}
				break;
			}
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(930);
				match(ELSE);
				setState(931);
				((If_statementContext)_localctx).elseStmts = statement_or_list();
				}
				break;
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

	public static class Else_if_statement_listContext extends ParserRuleContext {
		public Else_if_statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement_list; }
	 
		public Else_if_statement_listContext() { }
		public void copyFrom(Else_if_statement_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseIfStatementListContext extends Else_if_statement_listContext {
		public ExpressionContext exp;
		public Statement_or_listContext stmts;
		public TerminalNode ELSE() { return getToken(OParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(OParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_or_listContext statement_or_list() {
			return getRuleContext(Statement_or_listContext.class,0);
		}
		public ElseIfStatementListContext(Else_if_statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterElseIfStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitElseIfStatementList(this);
		}
	}
	public static class ElseIfStatementListItemContext extends Else_if_statement_listContext {
		public Else_if_statement_listContext items;
		public ExpressionContext exp;
		public Statement_or_listContext stmts;
		public TerminalNode ELSE() { return getToken(OParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(OParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Else_if_statement_listContext else_if_statement_list() {
			return getRuleContext(Else_if_statement_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_or_listContext statement_or_list() {
			return getRuleContext(Statement_or_listContext.class,0);
		}
		public ElseIfStatementListItemContext(Else_if_statement_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterElseIfStatementListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitElseIfStatementListItem(this);
		}
	}

	public final Else_if_statement_listContext else_if_statement_list() throws RecognitionException {
		return else_if_statement_list(0);
	}

	private Else_if_statement_listContext else_if_statement_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Else_if_statement_listContext _localctx = new Else_if_statement_listContext(_ctx, _parentState);
		Else_if_statement_listContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_else_if_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ElseIfStatementListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(935);
			match(ELSE);
			setState(936);
			match(IF);
			setState(937);
			match(LPAR);
			setState(938);
			((ElseIfStatementListContext)_localctx).exp = expression(0);
			setState(939);
			match(RPAR);
			setState(940);
			((ElseIfStatementListContext)_localctx).stmts = statement_or_list();
			}
			_ctx.stop = _input.LT(-1);
			setState(952);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElseIfStatementListItemContext(new Else_if_statement_listContext(_parentctx, _parentState));
					((ElseIfStatementListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_else_if_statement_list);
					setState(942);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(943);
					match(ELSE);
					setState(944);
					match(IF);
					setState(945);
					match(LPAR);
					setState(946);
					((ElseIfStatementListItemContext)_localctx).exp = expression(0);
					setState(947);
					match(RPAR);
					setState(948);
					((ElseIfStatementListItemContext)_localctx).stmts = statement_or_list();
					}
					} 
				}
				setState(954);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class Raise_statementContext extends ParserRuleContext {
		public ExpressionContext exp;
		public TerminalNode THROW() { return getToken(OParser.THROW, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Raise_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRaise_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRaise_statement(this);
		}
	}

	public final Raise_statementContext raise_statement() throws RecognitionException {
		Raise_statementContext _localctx = new Raise_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_raise_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(THROW);
			setState(956);
			((Raise_statementContext)_localctx).exp = expression(0);
			setState(957);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_statementContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Statement_listContext stmts;
		public Catch_statement_listContext handlers;
		public Statement_listContext anyStmts;
		public Statement_listContext finalStmts;
		public TerminalNode TRY() { return getToken(OParser.TRY, 0); }
		public List<TerminalNode> LPAR() { return getTokens(OParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(OParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(OParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(OParser.RPAR, i);
		}
		public List<TerminalNode> LCURL() { return getTokens(OParser.LCURL); }
		public TerminalNode LCURL(int i) {
			return getToken(OParser.LCURL, i);
		}
		public List<TerminalNode> RCURL() { return getTokens(OParser.RCURL); }
		public TerminalNode RCURL(int i) {
			return getToken(OParser.RCURL, i);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode CATCH() { return getToken(OParser.CATCH, 0); }
		public TerminalNode ANY() { return getToken(OParser.ANY, 0); }
		public TerminalNode FINALLY() { return getToken(OParser.FINALLY, 0); }
		public List<Statement_listContext> statement_list() {
			return getRuleContexts(Statement_listContext.class);
		}
		public Statement_listContext statement_list(int i) {
			return getRuleContext(Statement_listContext.class,i);
		}
		public Catch_statement_listContext catch_statement_list() {
			return getRuleContext(Catch_statement_listContext.class,0);
		}
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTry_statement(this);
		}
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_try_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			match(TRY);
			setState(960);
			match(LPAR);
			setState(961);
			((Try_statementContext)_localctx).name = variable_identifier();
			setState(962);
			match(RPAR);
			setState(963);
			match(LCURL);
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (BREAK - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (RETURN - 135)) | (1L << (STORE - 135)) | (1L << (SWITCH - 135)) | (1L << (THROW - 135)) | (1L << (TRY - 135)) | (1L << (WITH - 135)) | (1L << (WHILE - 135)) | (1L << (WRITE - 135)) | (1L << (SYMBOL_IDENTIFIER - 135)) | (1L << (TYPE_IDENTIFIER - 135)) | (1L << (VARIABLE_IDENTIFIER - 135)))) != 0)) {
				{
				setState(964);
				((Try_statementContext)_localctx).stmts = statement_list();
				}
			}

			setState(967);
			match(RCURL);
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(968);
				((Try_statementContext)_localctx).handlers = catch_statement_list();
				}
				break;
			}
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(971);
				match(CATCH);
				setState(972);
				match(LPAR);
				setState(973);
				match(ANY);
				setState(974);
				match(RPAR);
				setState(975);
				match(LCURL);
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (BREAK - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (RETURN - 135)) | (1L << (STORE - 135)) | (1L << (SWITCH - 135)) | (1L << (THROW - 135)) | (1L << (TRY - 135)) | (1L << (WITH - 135)) | (1L << (WHILE - 135)) | (1L << (WRITE - 135)) | (1L << (SYMBOL_IDENTIFIER - 135)) | (1L << (TYPE_IDENTIFIER - 135)) | (1L << (VARIABLE_IDENTIFIER - 135)))) != 0)) {
					{
					setState(976);
					((Try_statementContext)_localctx).anyStmts = statement_list();
					}
				}

				setState(979);
				match(RCURL);
				}
				break;
			}
			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(982);
				match(FINALLY);
				setState(983);
				match(LCURL);
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (BREAK - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (RETURN - 135)) | (1L << (STORE - 135)) | (1L << (SWITCH - 135)) | (1L << (THROW - 135)) | (1L << (TRY - 135)) | (1L << (WITH - 135)) | (1L << (WHILE - 135)) | (1L << (WRITE - 135)) | (1L << (SYMBOL_IDENTIFIER - 135)) | (1L << (TYPE_IDENTIFIER - 135)) | (1L << (VARIABLE_IDENTIFIER - 135)))) != 0)) {
					{
					setState(984);
					((Try_statementContext)_localctx).finalStmts = statement_list();
					}
				}

				setState(987);
				match(RCURL);
				}
				break;
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

	public static class Catch_statementContext extends ParserRuleContext {
		public Catch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_statement; }
	 
		public Catch_statementContext() { }
		public void copyFrom(Catch_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CatchAtomicStatementContext extends Catch_statementContext {
		public Symbol_identifierContext name;
		public Statement_listContext stmts;
		public TerminalNode CATCH() { return getToken(OParser.CATCH, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public CatchAtomicStatementContext(Catch_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCatchAtomicStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCatchAtomicStatement(this);
		}
	}
	public static class CatchCollectionStatementContext extends Catch_statementContext {
		public Symbol_listContext exp;
		public Statement_listContext stmts;
		public TerminalNode CATCH() { return getToken(OParser.CATCH, 0); }
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Symbol_listContext symbol_list() {
			return getRuleContext(Symbol_listContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public CatchCollectionStatementContext(Catch_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCatchCollectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCatchCollectionStatement(this);
		}
	}

	public final Catch_statementContext catch_statement() throws RecognitionException {
		Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_catch_statement);
		int _la;
		try {
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new CatchAtomicStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				match(CATCH);
				setState(991);
				match(LPAR);
				setState(992);
				((CatchAtomicStatementContext)_localctx).name = symbol_identifier();
				setState(993);
				match(RPAR);
				setState(994);
				match(LCURL);
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (BREAK - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (RETURN - 135)) | (1L << (STORE - 135)) | (1L << (SWITCH - 135)) | (1L << (THROW - 135)) | (1L << (TRY - 135)) | (1L << (WITH - 135)) | (1L << (WHILE - 135)) | (1L << (WRITE - 135)) | (1L << (SYMBOL_IDENTIFIER - 135)) | (1L << (TYPE_IDENTIFIER - 135)) | (1L << (VARIABLE_IDENTIFIER - 135)))) != 0)) {
					{
					setState(995);
					((CatchAtomicStatementContext)_localctx).stmts = statement_list();
					}
				}

				setState(998);
				match(RCURL);
				}
				break;
			case 2:
				_localctx = new CatchCollectionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1000);
				match(CATCH);
				setState(1001);
				match(IN);
				setState(1002);
				match(LPAR);
				setState(1003);
				((CatchCollectionStatementContext)_localctx).exp = symbol_list();
				setState(1004);
				match(RPAR);
				setState(1005);
				match(LCURL);
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (BREAK - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (RETURN - 135)) | (1L << (STORE - 135)) | (1L << (SWITCH - 135)) | (1L << (THROW - 135)) | (1L << (TRY - 135)) | (1L << (WITH - 135)) | (1L << (WHILE - 135)) | (1L << (WRITE - 135)) | (1L << (SYMBOL_IDENTIFIER - 135)) | (1L << (TYPE_IDENTIFIER - 135)) | (1L << (VARIABLE_IDENTIFIER - 135)))) != 0)) {
					{
					setState(1006);
					((CatchCollectionStatementContext)_localctx).stmts = statement_list();
					}
				}

				setState(1009);
				match(RCURL);
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

	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(OParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitBreak_statement(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			match(BREAK);
			setState(1014);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext exp;
		public TerminalNode RETURN() { return getToken(OParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			match(RETURN);
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (EXECUTE - 97)) | (1L << (FETCH - 97)) | (1L << (FILTERED - 97)) | (1L << (MUTABLE - 97)) | (1L << (NULL - 97)) | (1L << (READ - 97)) | (1L << (SELF - 97)) | (1L << (SORTED - 97)) | (1L << (THIS - 97)) | (1L << (BOOLEAN_LITERAL - 97)) | (1L << (CHAR_LITERAL - 97)) | (1L << (MIN_INTEGER - 97)) | (1L << (MAX_INTEGER - 97)))) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (SYMBOL_IDENTIFIER - 161)) | (1L << (TYPE_IDENTIFIER - 161)) | (1L << (VARIABLE_IDENTIFIER - 161)) | (1L << (TEXT_LITERAL - 161)) | (1L << (UUID_LITERAL - 161)) | (1L << (INTEGER_LITERAL - 161)) | (1L << (HEXA_LITERAL - 161)) | (1L << (DECIMAL_LITERAL - 161)) | (1L << (DATETIME_LITERAL - 161)) | (1L << (TIME_LITERAL - 161)) | (1L << (DATE_LITERAL - 161)) | (1L << (PERIOD_LITERAL - 161)) | (1L << (VERSION_LITERAL - 161)))) != 0)) {
				{
				setState(1017);
				((Return_statementContext)_localctx).exp = expression(0);
				}
			}

			setState(1020);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_callContext extends ParserRuleContext {
		public Method_selectorContext method;
		public Argument_assignment_listContext args;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Method_selectorContext method_selector() {
			return getRuleContext(Method_selectorContext.class,0);
		}
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			((Method_callContext)_localctx).method = method_selector();
			setState(1023);
			match(LPAR);
			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (EXECUTE - 97)) | (1L << (FETCH - 97)) | (1L << (FILTERED - 97)) | (1L << (MUTABLE - 97)) | (1L << (NULL - 97)) | (1L << (READ - 97)) | (1L << (SELF - 97)) | (1L << (SORTED - 97)) | (1L << (THIS - 97)) | (1L << (BOOLEAN_LITERAL - 97)) | (1L << (CHAR_LITERAL - 97)) | (1L << (MIN_INTEGER - 97)) | (1L << (MAX_INTEGER - 97)))) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (SYMBOL_IDENTIFIER - 161)) | (1L << (TYPE_IDENTIFIER - 161)) | (1L << (VARIABLE_IDENTIFIER - 161)) | (1L << (TEXT_LITERAL - 161)) | (1L << (UUID_LITERAL - 161)) | (1L << (INTEGER_LITERAL - 161)) | (1L << (HEXA_LITERAL - 161)) | (1L << (DECIMAL_LITERAL - 161)) | (1L << (DATETIME_LITERAL - 161)) | (1L << (TIME_LITERAL - 161)) | (1L << (DATE_LITERAL - 161)) | (1L << (PERIOD_LITERAL - 161)) | (1L << (VERSION_LITERAL - 161)))) != 0)) {
				{
				setState(1024);
				((Method_callContext)_localctx).args = argument_assignment_list(0);
				}
			}

			setState(1027);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_selectorContext extends ParserRuleContext {
		public Method_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_selector; }
	 
		public Method_selectorContext() { }
		public void copyFrom(Method_selectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodParentContext extends Method_selectorContext {
		public Callable_parentContext parent;
		public Method_identifierContext name;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Callable_parentContext callable_parent() {
			return getRuleContext(Callable_parentContext.class,0);
		}
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public MethodParentContext(Method_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethodParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethodParent(this);
		}
	}
	public static class MethodNameContext extends Method_selectorContext {
		public Method_identifierContext name;
		public Method_identifierContext method_identifier() {
			return getRuleContext(Method_identifierContext.class,0);
		}
		public MethodNameContext(Method_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethodName(this);
		}
	}

	public final Method_selectorContext method_selector() throws RecognitionException {
		Method_selectorContext _localctx = new Method_selectorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_method_selector);
		try {
			setState(1034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				_localctx = new MethodNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1029);
				((MethodNameContext)_localctx).name = method_identifier();
				}
				break;
			case 2:
				_localctx = new MethodParentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1030);
				((MethodParentContext)_localctx).parent = callable_parent(0);
				setState(1031);
				match(DOT);
				setState(1032);
				((MethodParentContext)_localctx).name = method_identifier();
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

	public static class Callable_parentContext extends ParserRuleContext {
		public Callable_parentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callable_parent; }
	 
		public Callable_parentContext() { }
		public void copyFrom(Callable_parentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallableSelectorContext extends Callable_parentContext {
		public Callable_parentContext parent;
		public Callable_selectorContext select;
		public Callable_parentContext callable_parent() {
			return getRuleContext(Callable_parentContext.class,0);
		}
		public Callable_selectorContext callable_selector() {
			return getRuleContext(Callable_selectorContext.class,0);
		}
		public CallableSelectorContext(Callable_parentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCallableSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCallableSelector(this);
		}
	}
	public static class CallableRootContext extends Callable_parentContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CallableRootContext(Callable_parentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCallableRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCallableRoot(this);
		}
	}

	public final Callable_parentContext callable_parent() throws RecognitionException {
		return callable_parent(0);
	}

	private Callable_parentContext callable_parent(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Callable_parentContext _localctx = new Callable_parentContext(_ctx, _parentState);
		Callable_parentContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_callable_parent, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CallableRootContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1037);
			((CallableRootContext)_localctx).name = identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1043);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CallableSelectorContext(new Callable_parentContext(_parentctx, _parentState));
					((CallableSelectorContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_callable_parent);
					setState(1039);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1040);
					((CallableSelectorContext)_localctx).select = callable_selector();
					}
					} 
				}
				setState(1045);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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

	public static class Callable_selectorContext extends ParserRuleContext {
		public Callable_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callable_selector; }
	 
		public Callable_selectorContext() { }
		public void copyFrom(Callable_selectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallableItemSelectorContext extends Callable_selectorContext {
		public ExpressionContext exp;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallableItemSelectorContext(Callable_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCallableItemSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCallableItemSelector(this);
		}
	}
	public static class CallableMemberSelectorContext extends Callable_selectorContext {
		public Variable_identifierContext name;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public CallableMemberSelectorContext(Callable_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCallableMemberSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCallableMemberSelector(this);
		}
	}

	public final Callable_selectorContext callable_selector() throws RecognitionException {
		Callable_selectorContext _localctx = new Callable_selectorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_callable_selector);
		try {
			setState(1052);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CallableMemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1046);
				match(DOT);
				setState(1047);
				((CallableMemberSelectorContext)_localctx).name = variable_identifier();
				}
				break;
			case LBRAK:
				_localctx = new CallableItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1048);
				match(LBRAK);
				setState(1049);
				((CallableItemSelectorContext)_localctx).exp = expression(0);
				setState(1050);
				match(RBRAK);
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

	public static class X_expressionContext extends ParserRuleContext {
		public Css_expressionContext css_expression() {
			return getRuleContext(Css_expressionContext.class,0);
		}
		public X_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterX_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitX_expression(this);
		}
	}

	public final X_expressionContext x_expression() throws RecognitionException {
		X_expressionContext _localctx = new X_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_x_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			css_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntDivideExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public IdivideContext idivide() {
			return getRuleContext(IdivideContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IntDivideExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIntDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIntDivideExpression(this);
		}
	}
	public static class HasAnyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode HAS() { return getToken(OParser.HAS, 0); }
		public TerminalNode ANY() { return getToken(OParser.ANY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HasAnyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterHasAnyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitHasAnyExpression(this);
		}
	}
	public static class HasExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode HAS() { return getToken(OParser.HAS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HasExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterHasExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitHasExpression(this);
		}
	}
	public static class TernaryExpressionContext extends ExpressionContext {
		public ExpressionContext test;
		public ExpressionContext ifTrue;
		public ExpressionContext ifFalse;
		public TerminalNode QMARK() { return getToken(OParser.QMARK, 0); }
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTernaryExpression(this);
		}
	}
	public static class NotEqualsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode XEQ() { return getToken(OParser.XEQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotEqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNotEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNotEqualsExpression(this);
		}
	}
	public static class InExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitInExpression(this);
		}
	}
	public static class IsAnExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public An_expressionContext right;
		public TerminalNode IS() { return getToken(OParser.IS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public An_expressionContext an_expression() {
			return getRuleContext(An_expressionContext.class,0);
		}
		public IsAnExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIsAnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIsAnExpression(this);
		}
	}
	public static class JsxExpressionContext extends ExpressionContext {
		public Jsx_expressionContext exp;
		public Jsx_expressionContext jsx_expression() {
			return getRuleContext(Jsx_expressionContext.class,0);
		}
		public JsxExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsxExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsxExpression(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public TerminalNode XMARK() { return getToken(OParser.XMARK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNotExpression(this);
		}
	}
	public static class GreaterThanExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterGreaterThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitGreaterThanExpression(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode PIPE2() { return getToken(OParser.PIPE2, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOrExpression(this);
		}
	}
	public static class CodeExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public TerminalNode CODE() { return getToken(OParser.CODE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCodeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCodeExpression(this);
		}
	}
	public static class LessThanOrEqualExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LTE() { return getToken(OParser.LTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessThanOrEqualExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLessThanOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLessThanOrEqualExpression(this);
		}
	}
	public static class NotHasAnyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public TerminalNode HAS() { return getToken(OParser.HAS, 0); }
		public TerminalNode ANY() { return getToken(OParser.ANY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotHasAnyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNotHasAnyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNotHasAnyExpression(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode AMP2() { return getToken(OParser.AMP2, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAndExpression(this);
		}
	}
	public static class NotHasExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public TerminalNode HAS() { return getToken(OParser.HAS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotHasExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNotHasExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNotHasExpression(this);
		}
	}
	public static class ClosureExpressionContext extends ExpressionContext {
		public Closure_expressionContext exp;
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public ClosureExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterClosureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitClosureExpression(this);
		}
	}
	public static class NotHasAllExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public TerminalNode HAS() { return getToken(OParser.HAS, 0); }
		public TerminalNode ALL() { return getToken(OParser.ALL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotHasAllExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNotHasAllExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNotHasAllExpression(this);
		}
	}
	public static class ContainsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode CONTAINS() { return getToken(OParser.CONTAINS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ContainsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterContainsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitContainsExpression(this);
		}
	}
	public static class NotContainsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public TerminalNode CONTAINS() { return getToken(OParser.CONTAINS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotContainsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNotContainsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNotContainsExpression(this);
		}
	}
	public static class MultiplyExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMultiplyExpression(this);
		}
	}
	public static class RoughlyEqualsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode TEQ() { return getToken(OParser.TEQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RoughlyEqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRoughlyEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRoughlyEqualsExpression(this);
		}
	}
	public static class IsNotAnExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public An_expressionContext right;
		public TerminalNode IS() { return getToken(OParser.IS, 0); }
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public An_expressionContext an_expression() {
			return getRuleContext(An_expressionContext.class,0);
		}
		public IsNotAnExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIsNotAnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIsNotAnExpression(this);
		}
	}
	public static class ExecuteExpressionContext extends ExpressionContext {
		public Variable_identifierContext name;
		public TerminalNode EXECUTE() { return getToken(OParser.EXECUTE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public ExecuteExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterExecuteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitExecuteExpression(this);
		}
	}
	public static class MethodExpressionContext extends ExpressionContext {
		public Method_expressionContext exp;
		public Method_expressionContext method_expression() {
			return getRuleContext(Method_expressionContext.class,0);
		}
		public MethodExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethodExpression(this);
		}
	}
	public static class GreaterThanOrEqualExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode GTE() { return getToken(OParser.GTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterThanOrEqualExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterGreaterThanOrEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitGreaterThanOrEqualExpression(this);
		}
	}
	public static class NotInExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotInExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNotInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNotInExpression(this);
		}
	}
	public static class IteratorExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public Variable_identifierContext name;
		public ExpressionContext source;
		public TerminalNode FOR() { return getToken(OParser.FOR, 0); }
		public TerminalNode EACH() { return getToken(OParser.EACH, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public IteratorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIteratorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIteratorExpression(this);
		}
	}
	public static class IsNotExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode IS() { return getToken(OParser.IS, 0); }
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IsNotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIsNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIsNotExpression(this);
		}
	}
	public static class DivideExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public DivideContext divide() {
			return getRuleContext(DivideContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivideExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDivideExpression(this);
		}
	}
	public static class IsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode IS() { return getToken(OParser.IS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIsExpression(this);
		}
	}
	public static class MinusExpressionContext extends ExpressionContext {
		public ExpressionContext exp;
		public TerminalNode MINUS() { return getToken(OParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMinusExpression(this);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(OParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(OParser.MINUS, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAddExpression(this);
		}
	}
	public static class HasAllExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode HAS() { return getToken(OParser.HAS, 0); }
		public TerminalNode ALL() { return getToken(OParser.ALL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HasAllExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterHasAllExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitHasAllExpression(this);
		}
	}
	public static class InstanceExpressionContext extends ExpressionContext {
		public Instance_expressionContext exp;
		public Instance_expressionContext instance_expression() {
			return getRuleContext(Instance_expressionContext.class,0);
		}
		public InstanceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterInstanceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitInstanceExpression(this);
		}
	}
	public static class CssExpressionContext extends ExpressionContext {
		public Css_expressionContext exp;
		public Css_expressionContext css_expression() {
			return getRuleContext(Css_expressionContext.class,0);
		}
		public CssExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCssExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCssExpression(this);
		}
	}
	public static class CastExpressionContext extends ExpressionContext {
		public Category_or_any_typeContext right;
		public ExpressionContext left;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCastExpression(this);
		}
	}
	public static class ModuloExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ModuloContext modulo() {
			return getRuleContext(ModuloContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ModuloExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterModuloExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitModuloExpression(this);
		}
	}
	public static class LessThanExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLessThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLessThanExpression(this);
		}
	}
	public static class EqualsExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode EQ2() { return getToken(OParser.EQ2, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitEqualsExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				_localctx = new CssExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1057);
				((CssExpressionContext)_localctx).exp = css_expression();
				}
				break;
			case 2:
				{
				_localctx = new JsxExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1058);
				((JsxExpressionContext)_localctx).exp = jsx_expression();
				}
				break;
			case 3:
				{
				_localctx = new InstanceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1059);
				((InstanceExpressionContext)_localctx).exp = instance_expression(0);
				}
				break;
			case 4:
				{
				_localctx = new MethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1060);
				((MethodExpressionContext)_localctx).exp = method_expression();
				}
				break;
			case 5:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1061);
				match(MINUS);
				setState(1062);
				((MinusExpressionContext)_localctx).exp = expression(36);
				}
				break;
			case 6:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1063);
				match(XMARK);
				setState(1064);
				((NotExpressionContext)_localctx).exp = expression(35);
				}
				break;
			case 7:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1065);
				match(LPAR);
				setState(1066);
				((CastExpressionContext)_localctx).right = category_or_any_type();
				setState(1067);
				match(RPAR);
				setState(1068);
				((CastExpressionContext)_localctx).left = expression(29);
				}
				break;
			case 8:
				{
				_localctx = new CodeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1070);
				match(CODE);
				setState(1071);
				match(LPAR);
				setState(1072);
				((CodeExpressionContext)_localctx).exp = expression(0);
				setState(1073);
				match(RPAR);
				}
				break;
			case 9:
				{
				_localctx = new ExecuteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1075);
				match(EXECUTE);
				setState(1076);
				match(LPAR);
				setState(1077);
				((ExecuteExpressionContext)_localctx).name = variable_identifier();
				setState(1078);
				match(RPAR);
				}
				break;
			case 10:
				{
				_localctx = new ClosureExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1080);
				((ClosureExpressionContext)_localctx).exp = closure_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1083);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1084);
						multiply();
						setState(1085);
						((MultiplyExpressionContext)_localctx).right = expression(35);
						}
						break;
					case 2:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((DivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1087);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(1088);
						divide();
						setState(1089);
						((DivideExpressionContext)_localctx).right = expression(34);
						}
						break;
					case 3:
						{
						_localctx = new ModuloExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ModuloExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1091);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1092);
						modulo();
						setState(1093);
						((ModuloExpressionContext)_localctx).right = expression(33);
						}
						break;
					case 4:
						{
						_localctx = new IntDivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IntDivideExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1095);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1096);
						idivide();
						setState(1097);
						((IntDivideExpressionContext)_localctx).right = expression(32);
						}
						break;
					case 5:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1099);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1100);
						((AddExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1101);
						((AddExpressionContext)_localctx).right = expression(31);
						}
						break;
					case 6:
						{
						_localctx = new LessThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1102);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1103);
						match(LT);
						setState(1104);
						((LessThanExpressionContext)_localctx).right = expression(29);
						}
						break;
					case 7:
						{
						_localctx = new LessThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1105);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1106);
						match(LTE);
						setState(1107);
						((LessThanOrEqualExpressionContext)_localctx).right = expression(28);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1108);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1109);
						match(GT);
						setState(1110);
						((GreaterThanExpressionContext)_localctx).right = expression(27);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanOrEqualExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanOrEqualExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1111);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1112);
						match(GTE);
						setState(1113);
						((GreaterThanOrEqualExpressionContext)_localctx).right = expression(26);
						}
						break;
					case 10:
						{
						_localctx = new IsNotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsNotExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1114);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1115);
						match(IS);
						setState(1116);
						match(NOT);
						setState(1117);
						((IsNotExpressionContext)_localctx).right = expression(23);
						}
						break;
					case 11:
						{
						_localctx = new IsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1118);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1119);
						match(IS);
						setState(1120);
						((IsExpressionContext)_localctx).right = expression(22);
						}
						break;
					case 12:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1121);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1122);
						match(EQ2);
						setState(1123);
						((EqualsExpressionContext)_localctx).right = expression(21);
						}
						break;
					case 13:
						{
						_localctx = new NotEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1124);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1125);
						match(XEQ);
						setState(1126);
						((NotEqualsExpressionContext)_localctx).right = expression(20);
						}
						break;
					case 14:
						{
						_localctx = new RoughlyEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RoughlyEqualsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1127);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1128);
						match(TEQ);
						setState(1129);
						((RoughlyEqualsExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 15:
						{
						_localctx = new ContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1130);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1131);
						match(CONTAINS);
						setState(1132);
						((ContainsExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 16:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1133);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1134);
						match(IN);
						setState(1135);
						((InExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 17:
						{
						_localctx = new HasExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1136);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1137);
						match(HAS);
						setState(1138);
						((HasExpressionContext)_localctx).right = expression(16);
						}
						break;
					case 18:
						{
						_localctx = new HasAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1139);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1140);
						match(HAS);
						setState(1141);
						match(ALL);
						setState(1142);
						((HasAllExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 19:
						{
						_localctx = new HasAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((HasAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1143);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1144);
						match(HAS);
						setState(1145);
						match(ANY);
						setState(1146);
						((HasAnyExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 20:
						{
						_localctx = new NotContainsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotContainsExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1147);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1148);
						match(NOT);
						setState(1149);
						match(CONTAINS);
						setState(1150);
						((NotContainsExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 21:
						{
						_localctx = new NotInExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotInExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1151);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1152);
						match(NOT);
						setState(1153);
						match(IN);
						setState(1154);
						((NotInExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 22:
						{
						_localctx = new NotHasExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotHasExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1155);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1156);
						match(NOT);
						setState(1157);
						match(HAS);
						setState(1158);
						((NotHasExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 23:
						{
						_localctx = new NotHasAllExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotHasAllExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1159);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1160);
						match(NOT);
						setState(1161);
						match(HAS);
						setState(1162);
						match(ALL);
						setState(1163);
						((NotHasAllExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 24:
						{
						_localctx = new NotHasAnyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((NotHasAnyExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1164);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1165);
						match(NOT);
						setState(1166);
						match(HAS);
						setState(1167);
						match(ANY);
						setState(1168);
						((NotHasAnyExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 25:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1169);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1170);
						match(PIPE2);
						setState(1171);
						((OrExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 26:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1172);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1173);
						match(AMP2);
						setState(1174);
						((AndExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 27:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExpressionContext)_localctx).test = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1175);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1176);
						match(QMARK);
						setState(1177);
						((TernaryExpressionContext)_localctx).ifTrue = expression(0);
						setState(1178);
						match(COLON);
						setState(1179);
						((TernaryExpressionContext)_localctx).ifFalse = expression(6);
						}
						break;
					case 28:
						{
						_localctx = new IsNotAnExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsNotAnExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1181);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1182);
						match(IS);
						setState(1183);
						match(NOT);
						setState(1184);
						((IsNotAnExpressionContext)_localctx).right = an_expression();
						}
						break;
					case 29:
						{
						_localctx = new IsAnExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IsAnExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1185);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1186);
						match(IS);
						setState(1187);
						((IsAnExpressionContext)_localctx).right = an_expression();
						}
						break;
					case 30:
						{
						_localctx = new IteratorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((IteratorExpressionContext)_localctx).exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1188);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1189);
						match(FOR);
						setState(1190);
						match(EACH);
						setState(1191);
						match(LPAR);
						setState(1192);
						((IteratorExpressionContext)_localctx).name = variable_identifier();
						setState(1193);
						match(IN);
						setState(1194);
						((IteratorExpressionContext)_localctx).source = expression(0);
						setState(1195);
						match(RPAR);
						}
						break;
					}
					} 
				}
				setState(1201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class An_expressionContext extends ParserRuleContext {
		public Category_or_any_typeContext typ;
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public An_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAn_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAn_expression(this);
		}
	}

	public final An_expressionContext an_expression() throws RecognitionException {
		An_expressionContext _localctx = new An_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_an_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
			setState(1203);
			match(VARIABLE_IDENTIFIER);
			setState(1204);
			((An_expressionContext)_localctx).typ = category_or_any_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closure_expressionContext extends ParserRuleContext {
		public Type_identifierContext name;
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Closure_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterClosure_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitClosure_expression(this);
		}
	}

	public final Closure_expressionContext closure_expression() throws RecognitionException {
		Closure_expressionContext _localctx = new Closure_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_closure_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			((Closure_expressionContext)_localctx).name = type_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instance_expressionContext extends ParserRuleContext {
		public Instance_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_expression; }
	 
		public Instance_expressionContext() { }
		public void copyFrom(Instance_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectorExpressionContext extends Instance_expressionContext {
		public Instance_expressionContext parent;
		public Selector_expressionContext selector;
		public Instance_expressionContext instance_expression() {
			return getRuleContext(Instance_expressionContext.class,0);
		}
		public Selector_expressionContext selector_expression() {
			return getRuleContext(Selector_expressionContext.class,0);
		}
		public SelectorExpressionContext(Instance_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSelectorExpression(this);
		}
	}
	public static class SelectableExpressionContext extends Instance_expressionContext {
		public Selectable_expressionContext parent;
		public Selectable_expressionContext selectable_expression() {
			return getRuleContext(Selectable_expressionContext.class,0);
		}
		public SelectableExpressionContext(Instance_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSelectableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSelectableExpression(this);
		}
	}

	public final Instance_expressionContext instance_expression() throws RecognitionException {
		return instance_expression(0);
	}

	private Instance_expressionContext instance_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Instance_expressionContext _localctx = new Instance_expressionContext(_ctx, _parentState);
		Instance_expressionContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_instance_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SelectableExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1209);
			((SelectableExpressionContext)_localctx).parent = selectable_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SelectorExpressionContext(new Instance_expressionContext(_parentctx, _parentState));
					((SelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_instance_expression);
					setState(1211);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1212);
					((SelectorExpressionContext)_localctx).selector = selector_expression();
					}
					} 
				}
				setState(1217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class Method_expressionContext extends ParserRuleContext {
		public Blob_expressionContext blob_expression() {
			return getRuleContext(Blob_expressionContext.class,0);
		}
		public Document_expressionContext document_expression() {
			return getRuleContext(Document_expressionContext.class,0);
		}
		public Filtered_list_expressionContext filtered_list_expression() {
			return getRuleContext(Filtered_list_expressionContext.class,0);
		}
		public Fetch_store_expressionContext fetch_store_expression() {
			return getRuleContext(Fetch_store_expressionContext.class,0);
		}
		public Read_all_expressionContext read_all_expression() {
			return getRuleContext(Read_all_expressionContext.class,0);
		}
		public Read_one_expressionContext read_one_expression() {
			return getRuleContext(Read_one_expressionContext.class,0);
		}
		public Sorted_expressionContext sorted_expression() {
			return getRuleContext(Sorted_expressionContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Constructor_expressionContext constructor_expression() {
			return getRuleContext(Constructor_expressionContext.class,0);
		}
		public Method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethod_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethod_expression(this);
		}
	}

	public final Method_expressionContext method_expression() throws RecognitionException {
		Method_expressionContext _localctx = new Method_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_method_expression);
		try {
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				blob_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1219);
				document_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1220);
				filtered_list_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1221);
				fetch_store_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1222);
				read_all_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1223);
				read_one_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1224);
				sorted_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1225);
				method_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1226);
				constructor_expression();
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

	public static class Blob_expressionContext extends ParserRuleContext {
		public TerminalNode BLOB() { return getToken(OParser.BLOB, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Blob_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blob_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterBlob_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitBlob_expression(this);
		}
	}

	public final Blob_expressionContext blob_expression() throws RecognitionException {
		Blob_expressionContext _localctx = new Blob_expressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_blob_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			match(BLOB);
			setState(1230);
			match(LPAR);
			setState(1231);
			expression(0);
			setState(1232);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Document_expressionContext extends ParserRuleContext {
		public TerminalNode DOCUMENT() { return getToken(OParser.DOCUMENT, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Document_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDocument_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDocument_expression(this);
		}
	}

	public final Document_expressionContext document_expression() throws RecognitionException {
		Document_expressionContext _localctx = new Document_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_document_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			match(DOCUMENT);
			setState(1235);
			match(LPAR);
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (EXECUTE - 97)) | (1L << (FETCH - 97)) | (1L << (FILTERED - 97)) | (1L << (MUTABLE - 97)) | (1L << (NULL - 97)) | (1L << (READ - 97)) | (1L << (SELF - 97)) | (1L << (SORTED - 97)) | (1L << (THIS - 97)) | (1L << (BOOLEAN_LITERAL - 97)) | (1L << (CHAR_LITERAL - 97)) | (1L << (MIN_INTEGER - 97)) | (1L << (MAX_INTEGER - 97)))) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (SYMBOL_IDENTIFIER - 161)) | (1L << (TYPE_IDENTIFIER - 161)) | (1L << (VARIABLE_IDENTIFIER - 161)) | (1L << (TEXT_LITERAL - 161)) | (1L << (UUID_LITERAL - 161)) | (1L << (INTEGER_LITERAL - 161)) | (1L << (HEXA_LITERAL - 161)) | (1L << (DECIMAL_LITERAL - 161)) | (1L << (DATETIME_LITERAL - 161)) | (1L << (TIME_LITERAL - 161)) | (1L << (DATE_LITERAL - 161)) | (1L << (PERIOD_LITERAL - 161)) | (1L << (VERSION_LITERAL - 161)))) != 0)) {
				{
				setState(1236);
				expression(0);
				}
			}

			setState(1239);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_statementContext extends ParserRuleContext {
		public ExpressionContext what;
		public ExpressionContext target;
		public TerminalNode WRITE() { return getToken(OParser.WRITE, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode TO() { return getToken(OParser.TO, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Write_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterWrite_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitWrite_statement(this);
		}
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(WRITE);
			setState(1242);
			match(LPAR);
			setState(1243);
			((Write_statementContext)_localctx).what = expression(0);
			setState(1244);
			match(RPAR);
			setState(1245);
			match(TO);
			setState(1246);
			((Write_statementContext)_localctx).target = expression(0);
			setState(1247);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Filtered_list_expressionContext extends ParserRuleContext {
		public ExpressionContext source;
		public Variable_identifierContext name;
		public ExpressionContext predicate;
		public TerminalNode FILTERED() { return getToken(OParser.FILTERED, 0); }
		public List<TerminalNode> LPAR() { return getTokens(OParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(OParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(OParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(OParser.RPAR, i);
		}
		public TerminalNode WITH() { return getToken(OParser.WITH, 0); }
		public TerminalNode WHERE() { return getToken(OParser.WHERE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Filtered_list_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filtered_list_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFiltered_list_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFiltered_list_expression(this);
		}
	}

	public final Filtered_list_expressionContext filtered_list_expression() throws RecognitionException {
		Filtered_list_expressionContext _localctx = new Filtered_list_expressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_filtered_list_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			match(FILTERED);
			setState(1250);
			match(LPAR);
			setState(1251);
			((Filtered_list_expressionContext)_localctx).source = expression(0);
			setState(1252);
			match(RPAR);
			setState(1253);
			match(WITH);
			setState(1254);
			match(LPAR);
			setState(1255);
			((Filtered_list_expressionContext)_localctx).name = variable_identifier();
			setState(1256);
			match(RPAR);
			setState(1257);
			match(WHERE);
			setState(1258);
			match(LPAR);
			setState(1259);
			((Filtered_list_expressionContext)_localctx).predicate = expression(0);
			setState(1260);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fetch_store_expressionContext extends ParserRuleContext {
		public Fetch_store_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_store_expression; }
	 
		public Fetch_store_expressionContext() { }
		public void copyFrom(Fetch_store_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FetchOneContext extends Fetch_store_expressionContext {
		public Mutable_category_typeContext typ;
		public ExpressionContext predicate;
		public TerminalNode FETCH() { return getToken(OParser.FETCH, 0); }
		public TerminalNode ONE() { return getToken(OParser.ONE, 0); }
		public TerminalNode WHERE() { return getToken(OParser.WHERE, 0); }
		public List<TerminalNode> LPAR() { return getTokens(OParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(OParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(OParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(OParser.RPAR, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public FetchOneContext(Fetch_store_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFetchOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFetchOne(this);
		}
	}
	public static class FetchManyContext extends Fetch_store_expressionContext {
		public Mutable_category_typeContext typ;
		public ExpressionContext xstart;
		public ExpressionContext xstop;
		public ExpressionContext predicate;
		public Order_by_listContext orderby;
		public TerminalNode FETCH() { return getToken(OParser.FETCH, 0); }
		public TerminalNode WHERE() { return getToken(OParser.WHERE, 0); }
		public List<TerminalNode> LPAR() { return getTokens(OParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(OParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(OParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(OParser.RPAR, i);
		}
		public TerminalNode ORDER() { return getToken(OParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(OParser.BY, 0); }
		public TerminalNode ALL() { return getToken(OParser.ALL, 0); }
		public TerminalNode ROWS() { return getToken(OParser.ROWS, 0); }
		public TerminalNode TO() { return getToken(OParser.TO, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Order_by_listContext order_by_list() {
			return getRuleContext(Order_by_listContext.class,0);
		}
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public FetchManyContext(Fetch_store_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFetchMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFetchMany(this);
		}
	}

	public final Fetch_store_expressionContext fetch_store_expression() throws RecognitionException {
		Fetch_store_expressionContext _localctx = new Fetch_store_expressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_fetch_store_expression);
		int _la;
		try {
			setState(1313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				_localctx = new FetchOneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1262);
				match(FETCH);
				setState(1263);
				match(ONE);
				setState(1268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(1264);
					match(LPAR);
					setState(1265);
					((FetchOneContext)_localctx).typ = mutable_category_type();
					setState(1266);
					match(RPAR);
					}
				}

				setState(1270);
				match(WHERE);
				setState(1271);
				match(LPAR);
				setState(1272);
				((FetchOneContext)_localctx).predicate = expression(0);
				setState(1273);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new FetchManyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1275);
				match(FETCH);
				setState(1296);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALL:
					{
					{
					setState(1276);
					match(ALL);
					setState(1281);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						setState(1277);
						match(LPAR);
						setState(1278);
						((FetchManyContext)_localctx).typ = mutable_category_type();
						setState(1279);
						match(RPAR);
						}
						break;
					}
					}
					}
					break;
				case LPAR:
				case ROWS:
					{
					{
					setState(1287);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LPAR) {
						{
						setState(1283);
						match(LPAR);
						setState(1284);
						((FetchManyContext)_localctx).typ = mutable_category_type();
						setState(1285);
						match(RPAR);
						}
					}

					setState(1289);
					match(ROWS);
					setState(1290);
					match(LPAR);
					setState(1291);
					((FetchManyContext)_localctx).xstart = expression(0);
					setState(1292);
					match(TO);
					setState(1293);
					((FetchManyContext)_localctx).xstop = expression(0);
					setState(1294);
					match(RPAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(1298);
					match(WHERE);
					setState(1299);
					match(LPAR);
					setState(1300);
					((FetchManyContext)_localctx).predicate = expression(0);
					setState(1301);
					match(RPAR);
					}
					break;
				}
				setState(1311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(1305);
					match(ORDER);
					setState(1306);
					match(BY);
					setState(1307);
					match(LPAR);
					setState(1308);
					((FetchManyContext)_localctx).orderby = order_by_list();
					setState(1309);
					match(RPAR);
					}
					break;
				}
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

	public static class Sorted_expressionContext extends ParserRuleContext {
		public Instance_expressionContext source;
		public Instance_expressionContext key;
		public TerminalNode SORTED() { return getToken(OParser.SORTED, 0); }
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public List<Instance_expressionContext> instance_expression() {
			return getRuleContexts(Instance_expressionContext.class);
		}
		public Instance_expressionContext instance_expression(int i) {
			return getRuleContext(Instance_expressionContext.class,i);
		}
		public TerminalNode DESC() { return getToken(OParser.DESC, 0); }
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Key_tokenContext key_token() {
			return getRuleContext(Key_tokenContext.class,0);
		}
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
		public Sorted_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sorted_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSorted_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSorted_expression(this);
		}
	}

	public final Sorted_expressionContext sorted_expression() throws RecognitionException {
		Sorted_expressionContext _localctx = new Sorted_expressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_sorted_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			match(SORTED);
			setState(1317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESC) {
				{
				setState(1316);
				match(DESC);
				}
			}

			setState(1319);
			match(LPAR);
			setState(1320);
			((Sorted_expressionContext)_localctx).source = instance_expression(0);
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1321);
				match(COMMA);
				setState(1322);
				key_token();
				setState(1323);
				match(EQ);
				setState(1324);
				((Sorted_expressionContext)_localctx).key = instance_expression(0);
				}
			}

			setState(1328);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selector_expressionContext extends ParserRuleContext {
		public Selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_expression; }
	 
		public Selector_expressionContext() { }
		public void copyFrom(Selector_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SliceSelectorContext extends Selector_expressionContext {
		public Slice_argumentsContext xslice;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public Slice_argumentsContext slice_arguments() {
			return getRuleContext(Slice_argumentsContext.class,0);
		}
		public SliceSelectorContext(Selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSliceSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSliceSelector(this);
		}
	}
	public static class MemberSelectorContext extends Selector_expressionContext {
		public Variable_identifierContext name;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public MemberSelectorContext(Selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMemberSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMemberSelector(this);
		}
	}
	public static class ItemSelectorContext extends Selector_expressionContext {
		public ExpressionContext exp;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ItemSelectorContext(Selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterItemSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitItemSelector(this);
		}
	}

	public final Selector_expressionContext selector_expression() throws RecognitionException {
		Selector_expressionContext _localctx = new Selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_selector_expression);
		try {
			setState(1340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				_localctx = new MemberSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1330);
				match(DOT);
				setState(1331);
				((MemberSelectorContext)_localctx).name = variable_identifier();
				}
				break;
			case 2:
				_localctx = new ItemSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1332);
				match(LBRAK);
				setState(1333);
				((ItemSelectorContext)_localctx).exp = expression(0);
				setState(1334);
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new SliceSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1336);
				match(LBRAK);
				setState(1337);
				((SliceSelectorContext)_localctx).xslice = slice_arguments();
				setState(1338);
				match(RBRAK);
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

	public static class Constructor_expressionContext extends ParserRuleContext {
		public Constructor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_expression; }
	 
		public Constructor_expressionContext() { }
		public void copyFrom(Constructor_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstructorFromContext extends Constructor_expressionContext {
		public Mutable_category_typeContext typ;
		public Copy_fromContext copyExp;
		public Argument_assignment_listContext args;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public Copy_fromContext copy_from() {
			return getRuleContext(Copy_fromContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public ConstructorFromContext(Constructor_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConstructorFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConstructorFrom(this);
		}
	}
	public static class ConstructorNoFromContext extends Constructor_expressionContext {
		public Mutable_category_typeContext typ;
		public Argument_assignment_listContext args;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Mutable_category_typeContext mutable_category_type() {
			return getRuleContext(Mutable_category_typeContext.class,0);
		}
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public ConstructorNoFromContext(Constructor_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConstructorNoFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConstructorNoFrom(this);
		}
	}

	public final Constructor_expressionContext constructor_expression() throws RecognitionException {
		Constructor_expressionContext _localctx = new Constructor_expressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_constructor_expression);
		int _la;
		try {
			setState(1358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				_localctx = new ConstructorFromContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1342);
				((ConstructorFromContext)_localctx).typ = mutable_category_type();
				setState(1343);
				match(LPAR);
				setState(1344);
				((ConstructorFromContext)_localctx).copyExp = copy_from();
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1345);
					match(COMMA);
					setState(1346);
					((ConstructorFromContext)_localctx).args = argument_assignment_list(0);
					}
				}

				setState(1349);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new ConstructorNoFromContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1351);
				((ConstructorNoFromContext)_localctx).typ = mutable_category_type();
				setState(1352);
				match(LPAR);
				setState(1354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (EXECUTE - 97)) | (1L << (FETCH - 97)) | (1L << (FILTERED - 97)) | (1L << (MUTABLE - 97)) | (1L << (NULL - 97)) | (1L << (READ - 97)) | (1L << (SELF - 97)) | (1L << (SORTED - 97)) | (1L << (THIS - 97)) | (1L << (BOOLEAN_LITERAL - 97)) | (1L << (CHAR_LITERAL - 97)) | (1L << (MIN_INTEGER - 97)) | (1L << (MAX_INTEGER - 97)))) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (SYMBOL_IDENTIFIER - 161)) | (1L << (TYPE_IDENTIFIER - 161)) | (1L << (VARIABLE_IDENTIFIER - 161)) | (1L << (TEXT_LITERAL - 161)) | (1L << (UUID_LITERAL - 161)) | (1L << (INTEGER_LITERAL - 161)) | (1L << (HEXA_LITERAL - 161)) | (1L << (DECIMAL_LITERAL - 161)) | (1L << (DATETIME_LITERAL - 161)) | (1L << (TIME_LITERAL - 161)) | (1L << (DATE_LITERAL - 161)) | (1L << (PERIOD_LITERAL - 161)) | (1L << (VERSION_LITERAL - 161)))) != 0)) {
					{
					setState(1353);
					((ConstructorNoFromContext)_localctx).args = argument_assignment_list(0);
					}
				}

				setState(1356);
				match(RPAR);
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

	public static class Copy_fromContext extends ParserRuleContext {
		public ExpressionContext exp;
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Copy_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCopy_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCopy_from(this);
		}
	}

	public final Copy_fromContext copy_from() throws RecognitionException {
		Copy_fromContext _localctx = new Copy_fromContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_copy_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			match(FROM);
			setState(1361);
			assign();
			setState(1362);
			((Copy_fromContext)_localctx).exp = expression(0);
			setState(1363);
			if (!(this.willNotBe(this.equalToken()))) throw new FailedPredicateException(this, "$parser.willNotBe($parser.equalToken())");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_assignment_listContext extends ParserRuleContext {
		public Argument_assignment_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_assignment_list; }
	 
		public Argument_assignment_listContext() { }
		public void copyFrom(Argument_assignment_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionAssignmentListContext extends Argument_assignment_listContext {
		public ExpressionContext exp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionAssignmentListContext(Argument_assignment_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterExpressionAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitExpressionAssignmentList(this);
		}
	}
	public static class ArgumentAssignmentListContext extends Argument_assignment_listContext {
		public Argument_assignmentContext item;
		public Argument_assignmentContext argument_assignment() {
			return getRuleContext(Argument_assignmentContext.class,0);
		}
		public ArgumentAssignmentListContext(Argument_assignment_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArgumentAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArgumentAssignmentList(this);
		}
	}
	public static class ArgumentAssignmentListItemContext extends Argument_assignment_listContext {
		public Argument_assignment_listContext items;
		public Argument_assignmentContext item;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Argument_assignment_listContext argument_assignment_list() {
			return getRuleContext(Argument_assignment_listContext.class,0);
		}
		public Argument_assignmentContext argument_assignment() {
			return getRuleContext(Argument_assignmentContext.class,0);
		}
		public ArgumentAssignmentListItemContext(Argument_assignment_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArgumentAssignmentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArgumentAssignmentListItem(this);
		}
	}

	public final Argument_assignment_listContext argument_assignment_list() throws RecognitionException {
		return argument_assignment_list(0);
	}

	private Argument_assignment_listContext argument_assignment_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Argument_assignment_listContext _localctx = new Argument_assignment_listContext(_ctx, _parentState);
		Argument_assignment_listContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_argument_assignment_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1366);
				((ExpressionAssignmentListContext)_localctx).exp = expression(0);
				setState(1367);
				if (!(this.willNotBe(this.equalToken()))) throw new FailedPredicateException(this, "$parser.willNotBe($parser.equalToken())");
				}
				break;
			case 2:
				{
				_localctx = new ArgumentAssignmentListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1369);
				((ArgumentAssignmentListContext)_localctx).item = argument_assignment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentAssignmentListItemContext(new Argument_assignment_listContext(_parentctx, _parentState));
					((ArgumentAssignmentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_argument_assignment_list);
					setState(1372);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1373);
					match(COMMA);
					setState(1374);
					((ArgumentAssignmentListItemContext)_localctx).item = argument_assignment();
					}
					} 
				}
				setState(1379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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

	public static class Argument_assignmentContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public ExpressionContext exp;
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Argument_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArgument_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArgument_assignment(this);
		}
	}

	public final Argument_assignmentContext argument_assignment() throws RecognitionException {
		Argument_assignmentContext _localctx = new Argument_assignmentContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_argument_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			((Argument_assignmentContext)_localctx).name = variable_identifier();
			setState(1384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(1381);
				assign();
				setState(1382);
				((Argument_assignmentContext)_localctx).exp = expression(0);
				}
				break;
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

	public static class Assign_instance_statementContext extends ParserRuleContext {
		public Assignable_instanceContext inst;
		public ExpressionContext exp;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Assignable_instanceContext assignable_instance() {
			return getRuleContext(Assignable_instanceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_instance_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_instance_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssign_instance_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssign_instance_statement(this);
		}
	}

	public final Assign_instance_statementContext assign_instance_statement() throws RecognitionException {
		Assign_instance_statementContext _localctx = new Assign_instance_statementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_assign_instance_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			((Assign_instance_statementContext)_localctx).inst = assignable_instance(0);
			setState(1387);
			assign();
			setState(1388);
			((Assign_instance_statementContext)_localctx).exp = expression(0);
			setState(1389);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Child_instanceContext extends ParserRuleContext {
		public Child_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_child_instance; }
	 
		public Child_instanceContext() { }
		public void copyFrom(Child_instanceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberInstanceContext extends Child_instanceContext {
		public Variable_identifierContext name;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public MemberInstanceContext(Child_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMemberInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMemberInstance(this);
		}
	}
	public static class ItemInstanceContext extends Child_instanceContext {
		public ExpressionContext exp;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ItemInstanceContext(Child_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterItemInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitItemInstance(this);
		}
	}

	public final Child_instanceContext child_instance() throws RecognitionException {
		Child_instanceContext _localctx = new Child_instanceContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_child_instance);
		try {
			setState(1397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new MemberInstanceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1391);
				match(DOT);
				setState(1392);
				((MemberInstanceContext)_localctx).name = variable_identifier();
				}
				break;
			case LBRAK:
				_localctx = new ItemInstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1393);
				match(LBRAK);
				setState(1394);
				((ItemInstanceContext)_localctx).exp = expression(0);
				setState(1395);
				match(RBRAK);
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

	public static class Assign_tuple_statementContext extends ParserRuleContext {
		public Variable_identifier_listContext items;
		public ExpressionContext exp;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Variable_identifier_listContext variable_identifier_list() {
			return getRuleContext(Variable_identifier_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_tuple_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_tuple_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssign_tuple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssign_tuple_statement(this);
		}
	}

	public final Assign_tuple_statementContext assign_tuple_statement() throws RecognitionException {
		Assign_tuple_statementContext _localctx = new Assign_tuple_statementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assign_tuple_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			((Assign_tuple_statementContext)_localctx).items = variable_identifier_list();
			setState(1400);
			assign();
			setState(1401);
			((Assign_tuple_statementContext)_localctx).exp = expression(0);
			setState(1402);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_literalContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(OParser.NULL, 0); }
		public Null_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNull_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNull_literal(this);
		}
	}

	public final Null_literalContext null_literal() throws RecognitionException {
		Null_literalContext _localctx = new Null_literalContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_listContext extends ParserRuleContext {
		public Declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_list; }
	 
		public Declaration_listContext() { }
		public void copyFrom(Declaration_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FullDeclarationListContext extends Declaration_listContext {
		public LfsContext lfs() {
			return getRuleContext(LfsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(OParser.EOF, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public FullDeclarationListContext(Declaration_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterFullDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitFullDeclarationList(this);
		}
	}

	public final Declaration_listContext declaration_list() throws RecognitionException {
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declaration_list);
		int _la;
		try {
			_localctx = new FullDeclarationListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ANY - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (CATEGORY - 64)) | (1L << (ENUMERATED - 64)) | (1L << (METHOD - 64)) | (1L << (NATIVE - 64)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (SINGLETON - 140)) | (1L << (STORABLE - 140)) | (1L << (TEST - 140)) | (1L << (WIDGET - 140)) | (1L << (TYPE_IDENTIFIER - 140)) | (1L << (ARONDBASE_IDENTIFIER - 140)))) != 0)) {
				{
				setState(1406);
				declarations();
				}
			}

			setState(1409);
			lfs();
			setState(1410);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			declaration();
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ANY - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (CATEGORY - 64)) | (1L << (ENUMERATED - 64)) | (1L << (METHOD - 64)) | (1L << (NATIVE - 64)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (SINGLETON - 140)) | (1L << (STORABLE - 140)) | (1L << (TEST - 140)) | (1L << (WIDGET - 140)) | (1L << (TYPE_IDENTIFIER - 140)) | (1L << (ARONDBASE_IDENTIFIER - 140)))) != 0)) {
				{
				{
				setState(1413);
				lfp();
				setState(1414);
				declaration();
				}
				}
				setState(1420);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Attribute_declarationContext attribute_declaration() {
			return getRuleContext(Attribute_declarationContext.class,0);
		}
		public Category_declarationContext category_declaration() {
			return getRuleContext(Category_declarationContext.class,0);
		}
		public Resource_declarationContext resource_declaration() {
			return getRuleContext(Resource_declarationContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Widget_declarationContext widget_declaration() {
			return getRuleContext(Widget_declarationContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public List<Comment_statementContext> comment_statement() {
			return getRuleContexts(Comment_statementContext.class);
		}
		public Comment_statementContext comment_statement(int i) {
			return getRuleContext(Comment_statementContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public List<Annotation_constructorContext> annotation_constructor() {
			return getRuleContexts(Annotation_constructorContext.class);
		}
		public Annotation_constructorContext annotation_constructor(int i) {
			return getRuleContext(Annotation_constructorContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1421);
				comment_statement();
				setState(1422);
				lfp();
				}
				}
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARONDBASE_IDENTIFIER) {
				{
				{
				setState(1429);
				annotation_constructor();
				setState(1430);
				lfp();
				}
				}
				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(1437);
				attribute_declaration();
				}
				break;
			case 2:
				{
				setState(1438);
				category_declaration();
				}
				break;
			case 3:
				{
				setState(1439);
				resource_declaration();
				}
				break;
			case 4:
				{
				setState(1440);
				enum_declaration();
				}
				break;
			case 5:
				{
				setState(1441);
				widget_declaration();
				}
				break;
			case 6:
				{
				setState(1442);
				method_declaration();
				}
				break;
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

	public static class Annotation_constructorContext extends ParserRuleContext {
		public Annotation_identifierContext name;
		public Literal_expressionContext exp;
		public Annotation_identifierContext annotation_identifier() {
			return getRuleContext(Annotation_identifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Annotation_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAnnotation_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAnnotation_constructor(this);
		}
	}

	public final Annotation_constructorContext annotation_constructor() throws RecognitionException {
		Annotation_constructorContext _localctx = new Annotation_constructorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_annotation_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			((Annotation_constructorContext)_localctx).name = annotation_identifier();
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(1446);
				match(LPAR);
				setState(1447);
				((Annotation_constructorContext)_localctx).exp = literal_expression();
				setState(1448);
				match(RPAR);
				}
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

	public static class Annotation_identifierContext extends ParserRuleContext {
		public TerminalNode ARONDBASE_IDENTIFIER() { return getToken(OParser.ARONDBASE_IDENTIFIER, 0); }
		public Annotation_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAnnotation_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAnnotation_identifier(this);
		}
	}

	public final Annotation_identifierContext annotation_identifier() throws RecognitionException {
		Annotation_identifierContext _localctx = new Annotation_identifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_annotation_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			match(ARONDBASE_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resource_declarationContext extends ParserRuleContext {
		public Native_resource_declarationContext native_resource_declaration() {
			return getRuleContext(Native_resource_declarationContext.class,0);
		}
		public Resource_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterResource_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitResource_declaration(this);
		}
	}

	public final Resource_declarationContext resource_declaration() throws RecognitionException {
		Resource_declarationContext _localctx = new Resource_declarationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_resource_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			native_resource_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_declarationContext extends ParserRuleContext {
		public Enum_category_declarationContext enum_category_declaration() {
			return getRuleContext(Enum_category_declarationContext.class,0);
		}
		public Enum_native_declarationContext enum_native_declaration() {
			return getRuleContext(Enum_native_declarationContext.class,0);
		}
		public Enum_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterEnum_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitEnum_declaration(this);
		}
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_enum_declaration);
		try {
			setState(1458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1456);
				enum_category_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1457);
				enum_native_declaration();
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

	public static class Native_symbol_listContext extends ParserRuleContext {
		public List<Native_symbolContext> native_symbol() {
			return getRuleContexts(Native_symbolContext.class);
		}
		public Native_symbolContext native_symbol(int i) {
			return getRuleContext(Native_symbolContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Native_symbol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_symbol_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_symbol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_symbol_list(this);
		}
	}

	public final Native_symbol_listContext native_symbol_list() throws RecognitionException {
		Native_symbol_listContext _localctx = new Native_symbol_listContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_native_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			native_symbol();
			setState(1466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYMBOL_IDENTIFIER) {
				{
				{
				setState(1461);
				lfp();
				setState(1462);
				native_symbol();
				}
				}
				setState(1468);
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

	public static class Category_symbol_listContext extends ParserRuleContext {
		public List<Category_symbolContext> category_symbol() {
			return getRuleContexts(Category_symbolContext.class);
		}
		public Category_symbolContext category_symbol(int i) {
			return getRuleContext(Category_symbolContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Category_symbol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_symbol_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategory_symbol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategory_symbol_list(this);
		}
	}

	public final Category_symbol_listContext category_symbol_list() throws RecognitionException {
		Category_symbol_listContext _localctx = new Category_symbol_listContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_category_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			category_symbol();
			setState(1475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYMBOL_IDENTIFIER) {
				{
				{
				setState(1470);
				lfp();
				setState(1471);
				category_symbol();
				}
				}
				setState(1477);
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

	public static class Symbol_listContext extends ParserRuleContext {
		public List<Symbol_identifierContext> symbol_identifier() {
			return getRuleContexts(Symbol_identifierContext.class);
		}
		public Symbol_identifierContext symbol_identifier(int i) {
			return getRuleContext(Symbol_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Symbol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSymbol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSymbol_list(this);
		}
	}

	public final Symbol_listContext symbol_list() throws RecognitionException {
		Symbol_listContext _localctx = new Symbol_listContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_symbol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			symbol_identifier();
			setState(1483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1479);
				match(COMMA);
				setState(1480);
				symbol_identifier();
				}
				}
				setState(1485);
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

	public static class Attribute_constraintContext extends ParserRuleContext {
		public Attribute_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_constraint; }
	 
		public Attribute_constraintContext() { }
		public void copyFrom(Attribute_constraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MatchingSetContext extends Attribute_constraintContext {
		public Set_literalContext source;
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public Set_literalContext set_literal() {
			return getRuleContext(Set_literalContext.class,0);
		}
		public MatchingSetContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMatchingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMatchingSet(this);
		}
	}
	public static class MatchingPatternContext extends Attribute_constraintContext {
		public Token text;
		public TerminalNode MATCHING() { return getToken(OParser.MATCHING, 0); }
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public MatchingPatternContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMatchingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMatchingPattern(this);
		}
	}
	public static class MatchingListContext extends Attribute_constraintContext {
		public List_literalContext source;
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public List_literalContext list_literal() {
			return getRuleContext(List_literalContext.class,0);
		}
		public MatchingListContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMatchingList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMatchingList(this);
		}
	}
	public static class MatchingRangeContext extends Attribute_constraintContext {
		public Range_literalContext source;
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public Range_literalContext range_literal() {
			return getRuleContext(Range_literalContext.class,0);
		}
		public MatchingRangeContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMatchingRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMatchingRange(this);
		}
	}
	public static class MatchingExpressionContext extends Attribute_constraintContext {
		public ExpressionContext exp;
		public TerminalNode MATCHING() { return getToken(OParser.MATCHING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchingExpressionContext(Attribute_constraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMatchingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMatchingExpression(this);
		}
	}

	public final Attribute_constraintContext attribute_constraint() throws RecognitionException {
		Attribute_constraintContext _localctx = new Attribute_constraintContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_attribute_constraint);
		try {
			setState(1496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				_localctx = new MatchingListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1486);
				match(IN);
				setState(1487);
				((MatchingListContext)_localctx).source = list_literal();
				}
				break;
			case 2:
				_localctx = new MatchingSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1488);
				match(IN);
				setState(1489);
				((MatchingSetContext)_localctx).source = set_literal();
				}
				break;
			case 3:
				_localctx = new MatchingRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1490);
				match(IN);
				setState(1491);
				((MatchingRangeContext)_localctx).source = range_literal();
				}
				break;
			case 4:
				_localctx = new MatchingPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1492);
				match(MATCHING);
				setState(1493);
				((MatchingPatternContext)_localctx).text = match(TEXT_LITERAL);
				}
				break;
			case 5:
				_localctx = new MatchingExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1494);
				match(MATCHING);
				setState(1495);
				((MatchingExpressionContext)_localctx).exp = expression(0);
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

	public static class List_literalContext extends ParserRuleContext {
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public List_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterList_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitList_literal(this);
		}
	}

	public final List_literalContext list_literal() throws RecognitionException {
		List_literalContext _localctx = new List_literalContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1498);
				match(MUTABLE);
				}
			}

			setState(1501);
			match(LBRAK);
			setState(1503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (EXECUTE - 97)) | (1L << (FETCH - 97)) | (1L << (FILTERED - 97)) | (1L << (MUTABLE - 97)) | (1L << (NULL - 97)) | (1L << (READ - 97)) | (1L << (SELF - 97)) | (1L << (SORTED - 97)) | (1L << (THIS - 97)) | (1L << (BOOLEAN_LITERAL - 97)) | (1L << (CHAR_LITERAL - 97)) | (1L << (MIN_INTEGER - 97)) | (1L << (MAX_INTEGER - 97)))) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (SYMBOL_IDENTIFIER - 161)) | (1L << (TYPE_IDENTIFIER - 161)) | (1L << (VARIABLE_IDENTIFIER - 161)) | (1L << (TEXT_LITERAL - 161)) | (1L << (UUID_LITERAL - 161)) | (1L << (INTEGER_LITERAL - 161)) | (1L << (HEXA_LITERAL - 161)) | (1L << (DECIMAL_LITERAL - 161)) | (1L << (DATETIME_LITERAL - 161)) | (1L << (TIME_LITERAL - 161)) | (1L << (DATE_LITERAL - 161)) | (1L << (PERIOD_LITERAL - 161)) | (1L << (VERSION_LITERAL - 161)))) != 0)) {
				{
				setState(1502);
				expression_list();
				}
			}

			setState(1505);
			match(RBRAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_literalContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Set_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSet_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSet_literal(this);
		}
	}

	public final Set_literalContext set_literal() throws RecognitionException {
		Set_literalContext _localctx = new Set_literalContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_set_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1507);
				match(MUTABLE);
				}
			}

			setState(1510);
			match(LT);
			setState(1512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (EXECUTE - 97)) | (1L << (FETCH - 97)) | (1L << (FILTERED - 97)) | (1L << (MUTABLE - 97)) | (1L << (NULL - 97)) | (1L << (READ - 97)) | (1L << (SELF - 97)) | (1L << (SORTED - 97)) | (1L << (THIS - 97)) | (1L << (BOOLEAN_LITERAL - 97)) | (1L << (CHAR_LITERAL - 97)) | (1L << (MIN_INTEGER - 97)) | (1L << (MAX_INTEGER - 97)))) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (SYMBOL_IDENTIFIER - 161)) | (1L << (TYPE_IDENTIFIER - 161)) | (1L << (VARIABLE_IDENTIFIER - 161)) | (1L << (TEXT_LITERAL - 161)) | (1L << (UUID_LITERAL - 161)) | (1L << (INTEGER_LITERAL - 161)) | (1L << (HEXA_LITERAL - 161)) | (1L << (DECIMAL_LITERAL - 161)) | (1L << (DATETIME_LITERAL - 161)) | (1L << (TIME_LITERAL - 161)) | (1L << (DATE_LITERAL - 161)) | (1L << (PERIOD_LITERAL - 161)) | (1L << (VERSION_LITERAL - 161)))) != 0)) {
				{
				setState(1511);
				expression_list();
				}
			}

			setState(1514);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			expression(0);
			setState(1521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1517);
				match(COMMA);
				setState(1518);
				expression(0);
				}
				}
				setState(1523);
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

	public static class Range_literalContext extends ParserRuleContext {
		public ExpressionContext low;
		public ExpressionContext high;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RANGE() { return getToken(OParser.RANGE, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Range_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRange_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRange_literal(this);
		}
	}

	public final Range_literalContext range_literal() throws RecognitionException {
		Range_literalContext _localctx = new Range_literalContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_range_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			match(LBRAK);
			setState(1525);
			((Range_literalContext)_localctx).low = expression(0);
			setState(1526);
			match(RANGE);
			setState(1527);
			((Range_literalContext)_localctx).high = expression(0);
			setState(1528);
			match(RBRAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefContext extends ParserRuleContext {
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
	 
		public TypedefContext() { }
		public void copyFrom(TypedefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IteratorTypeContext extends TypedefContext {
		public TypedefContext i;
		public TerminalNode ITERATOR() { return getToken(OParser.ITERATOR, 0); }
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public IteratorTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIteratorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIteratorType(this);
		}
	}
	public static class SetTypeContext extends TypedefContext {
		public TypedefContext s;
		public TerminalNode LTGT() { return getToken(OParser.LTGT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public SetTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSetType(this);
		}
	}
	public static class ListTypeContext extends TypedefContext {
		public TypedefContext l;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public ListTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitListType(this);
		}
	}
	public static class DictTypeContext extends TypedefContext {
		public TypedefContext d;
		public TerminalNode LTCOLONGT() { return getToken(OParser.LTCOLONGT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public DictTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDictType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDictType(this);
		}
	}
	public static class CursorTypeContext extends TypedefContext {
		public TypedefContext c;
		public TerminalNode CURSOR() { return getToken(OParser.CURSOR, 0); }
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public CursorTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCursorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCursorType(this);
		}
	}
	public static class PrimaryTypeContext extends TypedefContext {
		public Primary_typeContext p;
		public Primary_typeContext primary_type() {
			return getRuleContext(Primary_typeContext.class,0);
		}
		public PrimaryTypeContext(TypedefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPrimaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPrimaryType(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		return typedef(0);
	}

	private TypedefContext typedef(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypedefContext _localctx = new TypedefContext(_ctx, _parentState);
		TypedefContext _prevctx = _localctx;
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_typedef, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case HTML:
			case TYPE_IDENTIFIER:
				{
				_localctx = new PrimaryTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1531);
				((PrimaryTypeContext)_localctx).p = primary_type();
				}
				break;
			case CURSOR:
				{
				_localctx = new CursorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1532);
				match(CURSOR);
				setState(1533);
				match(LT);
				setState(1534);
				((CursorTypeContext)_localctx).c = typedef(0);
				setState(1535);
				match(GT);
				}
				break;
			case ITERATOR:
				{
				_localctx = new IteratorTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1537);
				match(ITERATOR);
				setState(1538);
				match(LT);
				setState(1539);
				((IteratorTypeContext)_localctx).i = typedef(0);
				setState(1540);
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1551);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
					case 1:
						{
						_localctx = new SetTypeContext(new TypedefContext(_parentctx, _parentState));
						((SetTypeContext)_localctx).s = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1544);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1545);
						match(LTGT);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypedefContext(_parentctx, _parentState));
						((ListTypeContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1546);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1547);
						match(LBRAK);
						setState(1548);
						match(RBRAK);
						}
						break;
					case 3:
						{
						_localctx = new DictTypeContext(new TypedefContext(_parentctx, _parentState));
						((DictTypeContext)_localctx).d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typedef);
						setState(1549);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1550);
						match(LTCOLONGT);
						}
						break;
					}
					} 
				}
				setState(1555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
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

	public static class Primary_typeContext extends ParserRuleContext {
		public Primary_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_type; }
	 
		public Primary_typeContext() { }
		public void copyFrom(Primary_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NativeTypeContext extends Primary_typeContext {
		public Native_typeContext n;
		public Native_typeContext native_type() {
			return getRuleContext(Native_typeContext.class,0);
		}
		public NativeTypeContext(Primary_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeType(this);
		}
	}
	public static class CategoryTypeContext extends Primary_typeContext {
		public Category_typeContext c;
		public Category_typeContext category_type() {
			return getRuleContext(Category_typeContext.class,0);
		}
		public CategoryTypeContext(Primary_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategoryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategoryType(this);
		}
	}

	public final Primary_typeContext primary_type() throws RecognitionException {
		Primary_typeContext _localctx = new Primary_typeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_primary_type);
		try {
			setState(1558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case HTML:
				_localctx = new NativeTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1556);
				((NativeTypeContext)_localctx).n = native_type();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new CategoryTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1557);
				((CategoryTypeContext)_localctx).c = category_type();
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

	public static class Native_typeContext extends ParserRuleContext {
		public Native_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_type; }
	 
		public Native_typeContext() { }
		public void copyFrom(Native_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PeriodTypeContext extends Native_typeContext {
		public TerminalNode PERIOD() { return getToken(OParser.PERIOD, 0); }
		public PeriodTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPeriodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPeriodType(this);
		}
	}
	public static class HtmlTypeContext extends Native_typeContext {
		public TerminalNode HTML() { return getToken(OParser.HTML, 0); }
		public HtmlTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterHtmlType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitHtmlType(this);
		}
	}
	public static class BooleanTypeContext extends Native_typeContext {
		public TerminalNode BOOLEAN() { return getToken(OParser.BOOLEAN, 0); }
		public BooleanTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitBooleanType(this);
		}
	}
	public static class DocumentTypeContext extends Native_typeContext {
		public TerminalNode DOCUMENT() { return getToken(OParser.DOCUMENT, 0); }
		public DocumentTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDocumentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDocumentType(this);
		}
	}
	public static class CharacterTypeContext extends Native_typeContext {
		public TerminalNode CHARACTER() { return getToken(OParser.CHARACTER, 0); }
		public CharacterTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCharacterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCharacterType(this);
		}
	}
	public static class VersionTypeContext extends Native_typeContext {
		public TerminalNode VERSION() { return getToken(OParser.VERSION, 0); }
		public VersionTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterVersionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitVersionType(this);
		}
	}
	public static class TextTypeContext extends Native_typeContext {
		public TerminalNode TEXT() { return getToken(OParser.TEXT, 0); }
		public TextTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTextType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTextType(this);
		}
	}
	public static class ImageTypeContext extends Native_typeContext {
		public TerminalNode IMAGE() { return getToken(OParser.IMAGE, 0); }
		public ImageTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterImageType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitImageType(this);
		}
	}
	public static class TimeTypeContext extends Native_typeContext {
		public TerminalNode TIME() { return getToken(OParser.TIME, 0); }
		public TimeTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTimeType(this);
		}
	}
	public static class IntegerTypeContext extends Native_typeContext {
		public TerminalNode INTEGER() { return getToken(OParser.INTEGER, 0); }
		public IntegerTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIntegerType(this);
		}
	}
	public static class DateTimeTypeContext extends Native_typeContext {
		public TerminalNode DATETIME() { return getToken(OParser.DATETIME, 0); }
		public DateTimeTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDateTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDateTimeType(this);
		}
	}
	public static class BlobTypeContext extends Native_typeContext {
		public TerminalNode BLOB() { return getToken(OParser.BLOB, 0); }
		public BlobTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterBlobType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitBlobType(this);
		}
	}
	public static class UUIDTypeContext extends Native_typeContext {
		public TerminalNode UUID() { return getToken(OParser.UUID, 0); }
		public UUIDTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterUUIDType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitUUIDType(this);
		}
	}
	public static class DecimalTypeContext extends Native_typeContext {
		public TerminalNode DECIMAL() { return getToken(OParser.DECIMAL, 0); }
		public DecimalTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDecimalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDecimalType(this);
		}
	}
	public static class CodeTypeContext extends Native_typeContext {
		public TerminalNode CODE() { return getToken(OParser.CODE, 0); }
		public CodeTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCodeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCodeType(this);
		}
	}
	public static class DateTypeContext extends Native_typeContext {
		public TerminalNode DATE() { return getToken(OParser.DATE, 0); }
		public DateTypeContext(Native_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDateType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDateType(this);
		}
	}

	public final Native_typeContext native_type() throws RecognitionException {
		Native_typeContext _localctx = new Native_typeContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_native_type);
		try {
			setState(1576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1560);
				match(BOOLEAN);
				}
				break;
			case CHARACTER:
				_localctx = new CharacterTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1561);
				match(CHARACTER);
				}
				break;
			case TEXT:
				_localctx = new TextTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1562);
				match(TEXT);
				}
				break;
			case IMAGE:
				_localctx = new ImageTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1563);
				match(IMAGE);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1564);
				match(INTEGER);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1565);
				match(DECIMAL);
				}
				break;
			case DOCUMENT:
				_localctx = new DocumentTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1566);
				match(DOCUMENT);
				}
				break;
			case DATE:
				_localctx = new DateTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1567);
				match(DATE);
				}
				break;
			case DATETIME:
				_localctx = new DateTimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1568);
				match(DATETIME);
				}
				break;
			case TIME:
				_localctx = new TimeTypeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1569);
				match(TIME);
				}
				break;
			case PERIOD:
				_localctx = new PeriodTypeContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1570);
				match(PERIOD);
				}
				break;
			case VERSION:
				_localctx = new VersionTypeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1571);
				match(VERSION);
				}
				break;
			case CODE:
				_localctx = new CodeTypeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1572);
				match(CODE);
				}
				break;
			case BLOB:
				_localctx = new BlobTypeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1573);
				match(BLOB);
				}
				break;
			case UUID:
				_localctx = new UUIDTypeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1574);
				match(UUID);
				}
				break;
			case HTML:
				_localctx = new HtmlTypeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1575);
				match(HTML);
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

	public static class Category_typeContext extends ParserRuleContext {
		public Token t1;
		public TerminalNode TYPE_IDENTIFIER() { return getToken(OParser.TYPE_IDENTIFIER, 0); }
		public Category_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategory_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategory_type(this);
		}
	}

	public final Category_typeContext category_type() throws RecognitionException {
		Category_typeContext _localctx = new Category_typeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_category_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			((Category_typeContext)_localctx).t1 = match(TYPE_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mutable_category_typeContext extends ParserRuleContext {
		public Category_typeContext category_type() {
			return getRuleContext(Category_typeContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public Mutable_category_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutable_category_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMutable_category_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMutable_category_type(this);
		}
	}

	public final Mutable_category_typeContext mutable_category_type() throws RecognitionException {
		Mutable_category_typeContext _localctx = new Mutable_category_typeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_mutable_category_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1580);
				match(MUTABLE);
				}
			}

			setState(1583);
			category_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_typeContext extends ParserRuleContext {
		public Token t1;
		public TerminalNode CODE() { return getToken(OParser.CODE, 0); }
		public Code_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCode_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCode_type(this);
		}
	}

	public final Code_typeContext code_type() throws RecognitionException {
		Code_typeContext _localctx = new Code_typeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_code_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			((Code_typeContext)_localctx).t1 = match(CODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Category_declarationContext extends ParserRuleContext {
		public Category_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_declaration; }
	 
		public Category_declarationContext() { }
		public void copyFrom(Category_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConcreteCategoryDeclarationContext extends Category_declarationContext {
		public Concrete_category_declarationContext decl;
		public Concrete_category_declarationContext concrete_category_declaration() {
			return getRuleContext(Concrete_category_declarationContext.class,0);
		}
		public ConcreteCategoryDeclarationContext(Category_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConcreteCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConcreteCategoryDeclaration(this);
		}
	}
	public static class NativeCategoryDeclarationContext extends Category_declarationContext {
		public Native_category_declarationContext decl;
		public Native_category_declarationContext native_category_declaration() {
			return getRuleContext(Native_category_declarationContext.class,0);
		}
		public NativeCategoryDeclarationContext(Category_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeCategoryDeclaration(this);
		}
	}
	public static class SingletonCategoryDeclarationContext extends Category_declarationContext {
		public Singleton_category_declarationContext decl;
		public Singleton_category_declarationContext singleton_category_declaration() {
			return getRuleContext(Singleton_category_declarationContext.class,0);
		}
		public SingletonCategoryDeclarationContext(Category_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSingletonCategoryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSingletonCategoryDeclaration(this);
		}
	}

	public final Category_declarationContext category_declaration() throws RecognitionException {
		Category_declarationContext _localctx = new Category_declarationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_category_declaration);
		try {
			setState(1590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				_localctx = new ConcreteCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1587);
				((ConcreteCategoryDeclarationContext)_localctx).decl = concrete_category_declaration();
				}
				break;
			case 2:
				_localctx = new NativeCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1588);
				((NativeCategoryDeclarationContext)_localctx).decl = native_category_declaration();
				}
				break;
			case 3:
				_localctx = new SingletonCategoryDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1589);
				((SingletonCategoryDeclarationContext)_localctx).decl = singleton_category_declaration();
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

	public static class Widget_declarationContext extends ParserRuleContext {
		public Widget_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget_declaration; }
	 
		public Widget_declarationContext() { }
		public void copyFrom(Widget_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConcreteWidgetDeclarationContext extends Widget_declarationContext {
		public Concrete_widget_declarationContext decl;
		public Concrete_widget_declarationContext concrete_widget_declaration() {
			return getRuleContext(Concrete_widget_declarationContext.class,0);
		}
		public ConcreteWidgetDeclarationContext(Widget_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterConcreteWidgetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitConcreteWidgetDeclaration(this);
		}
	}
	public static class NativeWidgetDeclarationContext extends Widget_declarationContext {
		public Native_widget_declarationContext decl;
		public Native_widget_declarationContext native_widget_declaration() {
			return getRuleContext(Native_widget_declarationContext.class,0);
		}
		public NativeWidgetDeclarationContext(Widget_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNativeWidgetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNativeWidgetDeclaration(this);
		}
	}

	public final Widget_declarationContext widget_declaration() throws RecognitionException {
		Widget_declarationContext _localctx = new Widget_declarationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_widget_declaration);
		try {
			setState(1594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDGET:
				_localctx = new ConcreteWidgetDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1592);
				((ConcreteWidgetDeclarationContext)_localctx).decl = concrete_widget_declaration();
				}
				break;
			case NATIVE:
				_localctx = new NativeWidgetDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1593);
				((NativeWidgetDeclarationContext)_localctx).decl = native_widget_declaration();
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

	public static class Type_identifier_listContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Type_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterType_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitType_identifier_list(this);
		}
	}

	public final Type_identifier_listContext type_identifier_list() throws RecognitionException {
		Type_identifier_listContext _localctx = new Type_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_type_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			type_identifier();
			setState(1601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1597);
				match(COMMA);
				setState(1598);
				type_identifier();
				}
				}
				setState(1603);
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

	public static class Method_identifierContext extends ParserRuleContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Method_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethod_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethod_identifier(this);
		}
	}

	public final Method_identifierContext method_identifier() throws RecognitionException {
		Method_identifierContext _localctx = new Method_identifierContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_method_identifier);
		try {
			setState(1606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1604);
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1605);
				type_identifier();
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

	public static class Identifier_or_keywordContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Identifier_or_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_or_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIdentifier_or_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIdentifier_or_keyword(this);
		}
	}

	public final Identifier_or_keywordContext identifier_or_keyword() throws RecognitionException {
		Identifier_or_keywordContext _localctx = new Identifier_or_keywordContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_identifier_or_keyword);
		try {
			setState(1610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1608);
				identifier();
				}
				break;
			case JAVA:
			case CSHARP:
			case PYTHON2:
			case PYTHON3:
			case JAVASCRIPT:
			case SWIFT:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case METHOD_T:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case ABSTRACT:
			case ALL:
			case ALWAYS:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ATTR:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case BINDINGS:
			case BREAK:
			case BY:
			case CASE:
			case CATCH:
			case CATEGORY:
			case CLASS:
			case CLOSE:
			case CONTAINS:
			case DEF:
			case DEFAULT:
			case DEFINE:
			case DELETE:
			case DESC:
			case DO:
			case DOING:
			case EACH:
			case ELSE:
			case ENUM:
			case ENUMERATED:
			case EXCEPT:
			case EXECUTE:
			case EXPECTING:
			case EXTENDS:
			case FETCH:
			case FILTERED:
			case FINALLY:
			case FLUSH:
			case FOR:
			case FROM:
			case GETTER:
			case HAS:
			case IF:
			case IN:
			case INDEX:
			case INVOKE:
			case IS:
			case MATCHING:
			case METHOD:
			case METHODS:
			case MODULO:
			case MUTABLE:
			case NATIVE:
			case NONE:
			case NOT:
			case NOTHING:
			case NULL:
			case ON:
			case ONE:
			case OPEN:
			case OPERATOR:
			case OR:
			case ORDER:
			case OTHERWISE:
			case PASS:
			case RAISE:
			case READ:
			case RECEIVING:
			case RESOURCE:
			case RETURN:
			case RETURNING:
			case ROWS:
			case SELF:
			case SETTER:
			case SINGLETON:
			case SORTED:
			case STORABLE:
			case STORE:
			case SWITCH:
			case TEST:
			case THIS:
			case THROW:
			case TO:
			case TRY:
			case VERIFYING:
			case WIDGET:
			case WITH:
			case WHEN:
			case WHERE:
			case WHILE:
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1609);
				keyword();
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

	public static class Nospace_hyphen_identifier_or_keywordContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(OParser.MINUS, 0); }
		public Nospace_identifier_or_keywordContext nospace_identifier_or_keyword() {
			return getRuleContext(Nospace_identifier_or_keywordContext.class,0);
		}
		public Nospace_hyphen_identifier_or_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nospace_hyphen_identifier_or_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNospace_hyphen_identifier_or_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNospace_hyphen_identifier_or_keyword(this);
		}
	}

	public final Nospace_hyphen_identifier_or_keywordContext nospace_hyphen_identifier_or_keyword() throws RecognitionException {
		Nospace_hyphen_identifier_or_keywordContext _localctx = new Nospace_hyphen_identifier_or_keywordContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_nospace_hyphen_identifier_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			if (!(this.wasNotWhiteSpace())) throw new FailedPredicateException(this, "$parser.wasNotWhiteSpace()");
			setState(1613);
			match(MINUS);
			setState(1614);
			nospace_identifier_or_keyword();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nospace_identifier_or_keywordContext extends ParserRuleContext {
		public Identifier_or_keywordContext identifier_or_keyword() {
			return getRuleContext(Identifier_or_keywordContext.class,0);
		}
		public Nospace_identifier_or_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nospace_identifier_or_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNospace_identifier_or_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNospace_identifier_or_keyword(this);
		}
	}

	public final Nospace_identifier_or_keywordContext nospace_identifier_or_keyword() throws RecognitionException {
		Nospace_identifier_or_keywordContext _localctx = new Nospace_identifier_or_keywordContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_nospace_identifier_or_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			if (!(this.wasNotWhiteSpace())) throw new FailedPredicateException(this, "$parser.wasNotWhiteSpace()");
			setState(1617);
			identifier_or_keyword();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeIdentifierContext extends IdentifierContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public TypeIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTypeIdentifier(this);
		}
	}
	public static class SymbolIdentifierContext extends IdentifierContext {
		public Symbol_identifierContext symbol_identifier() {
			return getRuleContext(Symbol_identifierContext.class,0);
		}
		public SymbolIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSymbolIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSymbolIdentifier(this);
		}
	}
	public static class VariableIdentifierContext extends IdentifierContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public VariableIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitVariableIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_identifier);
		try {
			setState(1622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				_localctx = new VariableIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1619);
				variable_identifier();
				}
				break;
			case TYPE_IDENTIFIER:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1620);
				type_identifier();
				}
				break;
			case SYMBOL_IDENTIFIER:
				_localctx = new SymbolIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1621);
				symbol_identifier();
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

	public static class Variable_identifierContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public Variable_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterVariable_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitVariable_identifier(this);
		}
	}

	public final Variable_identifierContext variable_identifier() throws RecognitionException {
		Variable_identifierContext _localctx = new Variable_identifierContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_variable_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			match(VARIABLE_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_identifierContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode STORABLE() { return getToken(OParser.STORABLE, 0); }
		public Attribute_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAttribute_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAttribute_identifier(this);
		}
	}

	public final Attribute_identifierContext attribute_identifier() throws RecognitionException {
		Attribute_identifierContext _localctx = new Attribute_identifierContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_attribute_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			_la = _input.LA(1);
			if ( !(_la==STORABLE || _la==VARIABLE_IDENTIFIER) ) {
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

	public static class Type_identifierContext extends ParserRuleContext {
		public TerminalNode TYPE_IDENTIFIER() { return getToken(OParser.TYPE_IDENTIFIER, 0); }
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterType_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitType_identifier(this);
		}
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			match(TYPE_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Symbol_identifierContext extends ParserRuleContext {
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(OParser.SYMBOL_IDENTIFIER, 0); }
		public Symbol_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSymbol_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSymbol_identifier(this);
		}
	}

	public final Symbol_identifierContext symbol_identifier() throws RecognitionException {
		Symbol_identifierContext _localctx = new Symbol_identifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_symbol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			match(SYMBOL_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			argument();
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1633);
				match(COMMA);
				setState(1634);
				argument();
				}
				}
				setState(1639);
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

	public static class ArgumentContext extends ParserRuleContext {
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	 
		public ArgumentContext() { }
		public void copyFrom(ArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperatorArgumentContext extends ArgumentContext {
		public Operator_argumentContext arg;
		public Operator_argumentContext operator_argument() {
			return getRuleContext(Operator_argumentContext.class,0);
		}
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public OperatorArgumentContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperatorArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperatorArgument(this);
		}
	}
	public static class CodeArgumentContext extends ArgumentContext {
		public Code_argumentContext arg;
		public Code_argumentContext code_argument() {
			return getRuleContext(Code_argumentContext.class,0);
		}
		public CodeArgumentContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCodeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCodeArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_argument);
		int _la;
		try {
			setState(1645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				_localctx = new CodeArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1640);
				((CodeArgumentContext)_localctx).arg = code_argument();
				}
				break;
			case 2:
				_localctx = new OperatorArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUTABLE) {
					{
					setState(1641);
					match(MUTABLE);
					}
				}

				setState(1644);
				((OperatorArgumentContext)_localctx).arg = operator_argument();
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

	public static class Operator_argumentContext extends ParserRuleContext {
		public Named_argumentContext named_argument() {
			return getRuleContext(Named_argumentContext.class,0);
		}
		public Typed_argumentContext typed_argument() {
			return getRuleContext(Typed_argumentContext.class,0);
		}
		public Operator_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperator_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperator_argument(this);
		}
	}

	public final Operator_argumentContext operator_argument() throws RecognitionException {
		Operator_argumentContext _localctx = new Operator_argumentContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_operator_argument);
		try {
			setState(1649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1647);
				named_argument();
				}
				break;
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case ANY:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1648);
				typed_argument();
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

	public static class Named_argumentContext extends ParserRuleContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Named_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNamed_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNamed_argument(this);
		}
	}

	public final Named_argumentContext named_argument() throws RecognitionException {
		Named_argumentContext _localctx = new Named_argumentContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_named_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			variable_identifier();
			setState(1654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1652);
				match(EQ);
				setState(1653);
				literal_expression();
				}
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

	public static class Code_argumentContext extends ParserRuleContext {
		public Variable_identifierContext name;
		public Code_typeContext code_type() {
			return getRuleContext(Code_typeContext.class,0);
		}
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public Code_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCode_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCode_argument(this);
		}
	}

	public final Code_argumentContext code_argument() throws RecognitionException {
		Code_argumentContext _localctx = new Code_argumentContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_code_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			code_type();
			setState(1657);
			((Code_argumentContext)_localctx).name = variable_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Category_or_any_typeContext extends ParserRuleContext {
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public Category_or_any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_or_any_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCategory_or_any_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCategory_or_any_type(this);
		}
	}

	public final Category_or_any_typeContext category_or_any_type() throws RecognitionException {
		Category_or_any_typeContext _localctx = new Category_or_any_typeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_category_or_any_type);
		try {
			setState(1661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case TYPE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1659);
				typedef(0);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1660);
				any_type(0);
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

	public static class Any_typeContext extends ParserRuleContext {
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
	 
		public Any_typeContext() { }
		public void copyFrom(Any_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnyListTypeContext extends Any_typeContext {
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public AnyListTypeContext(Any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAnyListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAnyListType(this);
		}
	}
	public static class AnyTypeContext extends Any_typeContext {
		public TerminalNode ANY() { return getToken(OParser.ANY, 0); }
		public AnyTypeContext(Any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAnyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAnyType(this);
		}
	}
	public static class AnyDictTypeContext extends Any_typeContext {
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public AnyDictTypeContext(Any_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAnyDictType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAnyDictType(this);
		}
	}

	public final Any_typeContext any_type() throws RecognitionException {
		return any_type(0);
	}

	private Any_typeContext any_type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Any_typeContext _localctx = new Any_typeContext(_ctx, _parentState);
		Any_typeContext _prevctx = _localctx;
		int _startState = 216;
		enterRecursionRule(_localctx, 216, RULE_any_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AnyTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1664);
			match(ANY);
			}
			_ctx.stop = _input.LT(-1);
			setState(1674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1672);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
					case 1:
						{
						_localctx = new AnyListTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1666);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1667);
						match(LBRAK);
						setState(1668);
						match(RBRAK);
						}
						break;
					case 2:
						{
						_localctx = new AnyDictTypeContext(new Any_typeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_any_type);
						setState(1669);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1670);
						match(LCURL);
						setState(1671);
						match(RCURL);
						}
						break;
					}
					} 
				}
				setState(1676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
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

	public static class Member_method_declaration_listContext extends ParserRuleContext {
		public List<Member_method_declarationContext> member_method_declaration() {
			return getRuleContexts(Member_method_declarationContext.class);
		}
		public Member_method_declarationContext member_method_declaration(int i) {
			return getRuleContext(Member_method_declarationContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Member_method_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_method_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMember_method_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMember_method_declaration_list(this);
		}
	}

	public final Member_method_declaration_listContext member_method_declaration_list() throws RecognitionException {
		Member_method_declaration_listContext _localctx = new Member_method_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_member_method_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			member_method_declaration();
			setState(1683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BOOLEAN - 47)) | (1L << (CHARACTER - 47)) | (1L << (TEXT - 47)) | (1L << (INTEGER - 47)) | (1L << (DECIMAL - 47)) | (1L << (DATE - 47)) | (1L << (TIME - 47)) | (1L << (DATETIME - 47)) | (1L << (PERIOD - 47)) | (1L << (VERSION - 47)) | (1L << (CODE - 47)) | (1L << (DOCUMENT - 47)) | (1L << (BLOB - 47)) | (1L << (IMAGE - 47)) | (1L << (UUID - 47)) | (1L << (ITERATOR - 47)) | (1L << (CURSOR - 47)) | (1L << (HTML - 47)) | (1L << (ABSTRACT - 47)) | (1L << (GETTER - 47)))) != 0) || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (METHOD - 114)) | (1L << (OPERATOR - 114)) | (1L << (SETTER - 114)) | (1L << (TYPE_IDENTIFIER - 114)))) != 0)) {
				{
				{
				setState(1678);
				lfp();
				setState(1679);
				member_method_declaration();
				}
				}
				setState(1685);
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

	public static class Member_method_declarationContext extends ParserRuleContext {
		public Setter_method_declarationContext setter_method_declaration() {
			return getRuleContext(Setter_method_declarationContext.class,0);
		}
		public Getter_method_declarationContext getter_method_declaration() {
			return getRuleContext(Getter_method_declarationContext.class,0);
		}
		public Concrete_method_declarationContext concrete_method_declaration() {
			return getRuleContext(Concrete_method_declarationContext.class,0);
		}
		public Abstract_method_declarationContext abstract_method_declaration() {
			return getRuleContext(Abstract_method_declarationContext.class,0);
		}
		public Operator_method_declarationContext operator_method_declaration() {
			return getRuleContext(Operator_method_declarationContext.class,0);
		}
		public Member_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMember_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMember_method_declaration(this);
		}
	}

	public final Member_method_declarationContext member_method_declaration() throws RecognitionException {
		Member_method_declarationContext _localctx = new Member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_member_method_declaration);
		try {
			setState(1691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1686);
				setter_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1687);
				getter_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1688);
				concrete_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1689);
				abstract_method_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1690);
				operator_method_declaration();
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

	public static class Native_member_method_declaration_listContext extends ParserRuleContext {
		public List<Native_member_method_declarationContext> native_member_method_declaration() {
			return getRuleContexts(Native_member_method_declarationContext.class);
		}
		public Native_member_method_declarationContext native_member_method_declaration(int i) {
			return getRuleContext(Native_member_method_declarationContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Native_member_method_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_member_method_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_member_method_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_member_method_declaration_list(this);
		}
	}

	public final Native_member_method_declaration_listContext native_member_method_declaration_list() throws RecognitionException {
		Native_member_method_declaration_listContext _localctx = new Native_member_method_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_native_member_method_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			native_member_method_declaration();
			setState(1699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BOOLEAN - 47)) | (1L << (CHARACTER - 47)) | (1L << (TEXT - 47)) | (1L << (INTEGER - 47)) | (1L << (DECIMAL - 47)) | (1L << (DATE - 47)) | (1L << (TIME - 47)) | (1L << (DATETIME - 47)) | (1L << (PERIOD - 47)) | (1L << (VERSION - 47)) | (1L << (CODE - 47)) | (1L << (DOCUMENT - 47)) | (1L << (BLOB - 47)) | (1L << (IMAGE - 47)) | (1L << (UUID - 47)) | (1L << (ITERATOR - 47)) | (1L << (CURSOR - 47)) | (1L << (HTML - 47)) | (1L << (ANY - 47)) | (1L << (GETTER - 47)))) != 0) || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (METHOD - 114)) | (1L << (NATIVE - 114)) | (1L << (SETTER - 114)) | (1L << (TYPE_IDENTIFIER - 114)))) != 0)) {
				{
				{
				setState(1694);
				lfp();
				setState(1695);
				native_member_method_declaration();
				}
				}
				setState(1701);
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

	public static class Native_member_method_declarationContext extends ParserRuleContext {
		public Native_getter_declarationContext native_getter_declaration() {
			return getRuleContext(Native_getter_declarationContext.class,0);
		}
		public Native_setter_declarationContext native_setter_declaration() {
			return getRuleContext(Native_setter_declarationContext.class,0);
		}
		public Native_method_declarationContext native_method_declaration() {
			return getRuleContext(Native_method_declarationContext.class,0);
		}
		public Native_member_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_member_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_member_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_member_method_declaration(this);
		}
	}

	public final Native_member_method_declarationContext native_member_method_declaration() throws RecognitionException {
		Native_member_method_declarationContext _localctx = new Native_member_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_native_member_method_declaration);
		try {
			setState(1705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1702);
				native_getter_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1703);
				native_setter_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1704);
				native_method_declaration();
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

	public static class Native_category_bindingContext extends ParserRuleContext {
		public Native_category_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_category_binding; }
	 
		public Native_category_bindingContext() { }
		public void copyFrom(Native_category_bindingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Python2CategoryBindingContext extends Native_category_bindingContext {
		public Python_category_bindingContext binding;
		public TerminalNode PYTHON2() { return getToken(OParser.PYTHON2, 0); }
		public Python_category_bindingContext python_category_binding() {
			return getRuleContext(Python_category_bindingContext.class,0);
		}
		public Python2CategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython2CategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython2CategoryBinding(this);
		}
	}
	public static class Python3CategoryBindingContext extends Native_category_bindingContext {
		public Python_category_bindingContext binding;
		public TerminalNode PYTHON3() { return getToken(OParser.PYTHON3, 0); }
		public Python_category_bindingContext python_category_binding() {
			return getRuleContext(Python_category_bindingContext.class,0);
		}
		public Python3CategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython3CategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython3CategoryBinding(this);
		}
	}
	public static class JavaCategoryBindingContext extends Native_category_bindingContext {
		public Java_class_identifier_expressionContext binding;
		public TerminalNode JAVA() { return getToken(OParser.JAVA, 0); }
		public Java_class_identifier_expressionContext java_class_identifier_expression() {
			return getRuleContext(Java_class_identifier_expressionContext.class,0);
		}
		public JavaCategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaCategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaCategoryBinding(this);
		}
	}
	public static class CSharpCategoryBindingContext extends Native_category_bindingContext {
		public Csharp_identifier_expressionContext binding;
		public TerminalNode CSHARP() { return getToken(OParser.CSHARP, 0); }
		public Csharp_identifier_expressionContext csharp_identifier_expression() {
			return getRuleContext(Csharp_identifier_expressionContext.class,0);
		}
		public CSharpCategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpCategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpCategoryBinding(this);
		}
	}
	public static class JavaScriptCategoryBindingContext extends Native_category_bindingContext {
		public Javascript_category_bindingContext binding;
		public TerminalNode JAVASCRIPT() { return getToken(OParser.JAVASCRIPT, 0); }
		public Javascript_category_bindingContext javascript_category_binding() {
			return getRuleContext(Javascript_category_bindingContext.class,0);
		}
		public JavaScriptCategoryBindingContext(Native_category_bindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaScriptCategoryBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaScriptCategoryBinding(this);
		}
	}

	public final Native_category_bindingContext native_category_binding() throws RecognitionException {
		Native_category_bindingContext _localctx = new Native_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_native_category_binding);
		try {
			setState(1717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1707);
				match(JAVA);
				setState(1708);
				((JavaCategoryBindingContext)_localctx).binding = java_class_identifier_expression(0);
				}
				break;
			case CSHARP:
				_localctx = new CSharpCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1709);
				match(CSHARP);
				setState(1710);
				((CSharpCategoryBindingContext)_localctx).binding = csharp_identifier_expression(0);
				}
				break;
			case PYTHON2:
				_localctx = new Python2CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1711);
				match(PYTHON2);
				setState(1712);
				((Python2CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case PYTHON3:
				_localctx = new Python3CategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1713);
				match(PYTHON3);
				setState(1714);
				((Python3CategoryBindingContext)_localctx).binding = python_category_binding();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptCategoryBindingContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1715);
				match(JAVASCRIPT);
				setState(1716);
				((JavaScriptCategoryBindingContext)_localctx).binding = javascript_category_binding();
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

	public static class Python_category_bindingContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Python_moduleContext python_module() {
			return getRuleContext(Python_moduleContext.class,0);
		}
		public Python_category_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_category_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython_category_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython_category_binding(this);
		}
	}

	public final Python_category_bindingContext python_category_binding() throws RecognitionException {
		Python_category_bindingContext _localctx = new Python_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_python_category_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			identifier();
			setState(1721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1720);
				python_module();
				}
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

	public static class Python_moduleContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public Module_tokenContext module_token() {
			return getRuleContext(Module_tokenContext.class,0);
		}
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(OParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OParser.DOT, i);
		}
		public Python_moduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython_module(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython_module(this);
		}
	}

	public final Python_moduleContext python_module() throws RecognitionException {
		Python_moduleContext _localctx = new Python_moduleContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_python_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			match(FROM);
			setState(1724);
			module_token();
			setState(1725);
			match(COLON);
			setState(1726);
			identifier();
			setState(1731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1727);
				match(DOT);
				setState(1728);
				identifier();
				}
				}
				setState(1733);
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

	public static class Javascript_category_bindingContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(OParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OParser.DOT, i);
		}
		public Javascript_moduleContext javascript_module() {
			return getRuleContext(Javascript_moduleContext.class,0);
		}
		public Javascript_category_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_category_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_category_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_category_binding(this);
		}
	}

	public final Javascript_category_bindingContext javascript_category_binding() throws RecognitionException {
		Javascript_category_bindingContext _localctx = new Javascript_category_bindingContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_javascript_category_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1734);
			identifier();
			setState(1739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1735);
				match(DOT);
				setState(1736);
				identifier();
				}
				}
				setState(1741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1742);
				javascript_module();
				}
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

	public static class Javascript_moduleContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public Module_tokenContext module_token() {
			return getRuleContext(Module_tokenContext.class,0);
		}
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public List<Javascript_identifierContext> javascript_identifier() {
			return getRuleContexts(Javascript_identifierContext.class);
		}
		public Javascript_identifierContext javascript_identifier(int i) {
			return getRuleContext(Javascript_identifierContext.class,i);
		}
		public List<TerminalNode> SLASH() { return getTokens(OParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(OParser.SLASH, i);
		}
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Javascript_moduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_module(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_module(this);
		}
	}

	public final Javascript_moduleContext javascript_module() throws RecognitionException {
		Javascript_moduleContext _localctx = new Javascript_moduleContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_javascript_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
			match(FROM);
			setState(1746);
			module_token();
			setState(1747);
			match(COLON);
			setState(1749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(1748);
				match(SLASH);
				}
			}

			setState(1751);
			javascript_identifier();
			setState(1756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(1752);
				match(SLASH);
				setState(1753);
				javascript_identifier();
				}
				}
				setState(1758);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1759);
				match(DOT);
				setState(1760);
				javascript_identifier();
				}
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

	public static class Variable_identifier_listContext extends ParserRuleContext {
		public List<Variable_identifierContext> variable_identifier() {
			return getRuleContexts(Variable_identifierContext.class);
		}
		public Variable_identifierContext variable_identifier(int i) {
			return getRuleContext(Variable_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Variable_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterVariable_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitVariable_identifier_list(this);
		}
	}

	public final Variable_identifier_listContext variable_identifier_list() throws RecognitionException {
		Variable_identifier_listContext _localctx = new Variable_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_variable_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			variable_identifier();
			setState(1768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1764);
				match(COMMA);
				setState(1765);
				variable_identifier();
				}
				}
				setState(1770);
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

	public static class Attribute_identifier_listContext extends ParserRuleContext {
		public List<Attribute_identifierContext> attribute_identifier() {
			return getRuleContexts(Attribute_identifierContext.class);
		}
		public Attribute_identifierContext attribute_identifier(int i) {
			return getRuleContext(Attribute_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Attribute_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAttribute_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAttribute_identifier_list(this);
		}
	}

	public final Attribute_identifier_listContext attribute_identifier_list() throws RecognitionException {
		Attribute_identifier_listContext _localctx = new Attribute_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_attribute_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			attribute_identifier();
			setState(1776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1772);
				match(COMMA);
				setState(1773);
				attribute_identifier();
				}
				}
				setState(1778);
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

	public static class Method_declarationContext extends ParserRuleContext {
		public Abstract_method_declarationContext abstract_method_declaration() {
			return getRuleContext(Abstract_method_declarationContext.class,0);
		}
		public Concrete_method_declarationContext concrete_method_declaration() {
			return getRuleContext(Concrete_method_declarationContext.class,0);
		}
		public Native_method_declarationContext native_method_declaration() {
			return getRuleContext(Native_method_declarationContext.class,0);
		}
		public Test_method_declarationContext test_method_declaration() {
			return getRuleContext(Test_method_declarationContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMethod_declaration(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_method_declaration);
		try {
			setState(1783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1779);
				abstract_method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1780);
				concrete_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1781);
				native_method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1782);
				test_method_declaration();
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

	public static class Comment_statementContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(OParser.COMMENT, 0); }
		public Comment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterComment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitComment_statement(this);
		}
	}

	public final Comment_statementContext comment_statement() throws RecognitionException {
		Comment_statementContext _localctx = new Comment_statementContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_comment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_statement_listContext extends ParserRuleContext {
		public List<Native_statementContext> native_statement() {
			return getRuleContexts(Native_statementContext.class);
		}
		public Native_statementContext native_statement(int i) {
			return getRuleContext(Native_statementContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Native_statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNative_statement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNative_statement_list(this);
		}
	}

	public final Native_statement_listContext native_statement_list() throws RecognitionException {
		Native_statement_listContext _localctx = new Native_statement_listContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_native_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			native_statement();
			setState(1793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT))) != 0)) {
				{
				{
				setState(1788);
				lfp();
				setState(1789);
				native_statement();
				}
				}
				setState(1795);
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

	public static class Native_statementContext extends ParserRuleContext {
		public Native_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_statement; }
	 
		public Native_statementContext() { }
		public void copyFrom(Native_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSharpNativeStatementContext extends Native_statementContext {
		public TerminalNode CSHARP() { return getToken(OParser.CSHARP, 0); }
		public Csharp_statementContext csharp_statement() {
			return getRuleContext(Csharp_statementContext.class,0);
		}
		public CSharpNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpNativeStatement(this);
		}
	}
	public static class JavaNativeStatementContext extends Native_statementContext {
		public TerminalNode JAVA() { return getToken(OParser.JAVA, 0); }
		public Java_statementContext java_statement() {
			return getRuleContext(Java_statementContext.class,0);
		}
		public JavaNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaNativeStatement(this);
		}
	}
	public static class JavaScriptNativeStatementContext extends Native_statementContext {
		public TerminalNode JAVASCRIPT() { return getToken(OParser.JAVASCRIPT, 0); }
		public Javascript_native_statementContext javascript_native_statement() {
			return getRuleContext(Javascript_native_statementContext.class,0);
		}
		public JavaScriptNativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaScriptNativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaScriptNativeStatement(this);
		}
	}
	public static class Python2NativeStatementContext extends Native_statementContext {
		public TerminalNode PYTHON2() { return getToken(OParser.PYTHON2, 0); }
		public Python_native_statementContext python_native_statement() {
			return getRuleContext(Python_native_statementContext.class,0);
		}
		public Python2NativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython2NativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython2NativeStatement(this);
		}
	}
	public static class Python3NativeStatementContext extends Native_statementContext {
		public TerminalNode PYTHON3() { return getToken(OParser.PYTHON3, 0); }
		public Python_native_statementContext python_native_statement() {
			return getRuleContext(Python_native_statementContext.class,0);
		}
		public Python3NativeStatementContext(Native_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython3NativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython3NativeStatement(this);
		}
	}

	public final Native_statementContext native_statement() throws RecognitionException {
		Native_statementContext _localctx = new Native_statementContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_native_statement);
		try {
			setState(1806);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
				_localctx = new JavaNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1796);
				match(JAVA);
				setState(1797);
				java_statement();
				}
				break;
			case CSHARP:
				_localctx = new CSharpNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1798);
				match(CSHARP);
				setState(1799);
				csharp_statement();
				}
				break;
			case PYTHON2:
				_localctx = new Python2NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1800);
				match(PYTHON2);
				setState(1801);
				python_native_statement();
				}
				break;
			case PYTHON3:
				_localctx = new Python3NativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1802);
				match(PYTHON3);
				setState(1803);
				python_native_statement();
				}
				break;
			case JAVASCRIPT:
				_localctx = new JavaScriptNativeStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1804);
				match(JAVASCRIPT);
				setState(1805);
				javascript_native_statement();
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

	public static class Python_native_statementContext extends ParserRuleContext {
		public Python_statementContext python_statement() {
			return getRuleContext(Python_statementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Python_moduleContext python_module() {
			return getRuleContext(Python_moduleContext.class,0);
		}
		public Python_native_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_native_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython_native_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython_native_statement(this);
		}
	}

	public final Python_native_statementContext python_native_statement() throws RecognitionException {
		Python_native_statementContext _localctx = new Python_native_statementContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_python_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			python_statement();
			setState(1810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1809);
				match(SEMI);
				}
			}

			setState(1813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1812);
				python_module();
				}
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

	public static class Javascript_native_statementContext extends ParserRuleContext {
		public Javascript_statementContext javascript_statement() {
			return getRuleContext(Javascript_statementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Javascript_moduleContext javascript_module() {
			return getRuleContext(Javascript_moduleContext.class,0);
		}
		public Javascript_native_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_native_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_native_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_native_statement(this);
		}
	}

	public final Javascript_native_statementContext javascript_native_statement() throws RecognitionException {
		Javascript_native_statementContext _localctx = new Javascript_native_statementContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_javascript_native_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
			javascript_statement();
			setState(1817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1816);
				match(SEMI);
				}
			}

			setState(1820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1819);
				javascript_module();
				}
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

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			statement();
			setState(1828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (BREAK - 64)) | (1L << (DELETE - 64)) | (1L << (DO - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (IF - 64)) | (1L << (METHOD - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (RETURN - 135)) | (1L << (STORE - 135)) | (1L << (SWITCH - 135)) | (1L << (THROW - 135)) | (1L << (TRY - 135)) | (1L << (WITH - 135)) | (1L << (WHILE - 135)) | (1L << (WRITE - 135)) | (1L << (SYMBOL_IDENTIFIER - 135)) | (1L << (TYPE_IDENTIFIER - 135)) | (1L << (VARIABLE_IDENTIFIER - 135)))) != 0)) {
				{
				{
				setState(1823);
				lfp();
				setState(1824);
				statement();
				}
				}
				setState(1830);
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

	public static class Assertion_listContext extends ParserRuleContext {
		public List<AssertionContext> assertion() {
			return getRuleContexts(AssertionContext.class);
		}
		public AssertionContext assertion(int i) {
			return getRuleContext(AssertionContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Assertion_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssertion_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssertion_list(this);
		}
	}

	public final Assertion_listContext assertion_list() throws RecognitionException {
		Assertion_listContext _localctx = new Assertion_listContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_assertion_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			assertion();
			setState(1837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (EXECUTE - 97)) | (1L << (FETCH - 97)) | (1L << (FILTERED - 97)) | (1L << (MUTABLE - 97)) | (1L << (NULL - 97)) | (1L << (READ - 97)) | (1L << (SELF - 97)) | (1L << (SORTED - 97)) | (1L << (THIS - 97)) | (1L << (BOOLEAN_LITERAL - 97)) | (1L << (CHAR_LITERAL - 97)) | (1L << (MIN_INTEGER - 97)) | (1L << (MAX_INTEGER - 97)))) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (SYMBOL_IDENTIFIER - 161)) | (1L << (TYPE_IDENTIFIER - 161)) | (1L << (VARIABLE_IDENTIFIER - 161)) | (1L << (TEXT_LITERAL - 161)) | (1L << (UUID_LITERAL - 161)) | (1L << (INTEGER_LITERAL - 161)) | (1L << (HEXA_LITERAL - 161)) | (1L << (DECIMAL_LITERAL - 161)) | (1L << (DATETIME_LITERAL - 161)) | (1L << (TIME_LITERAL - 161)) | (1L << (DATE_LITERAL - 161)) | (1L << (PERIOD_LITERAL - 161)) | (1L << (VERSION_LITERAL - 161)))) != 0)) {
				{
				{
				setState(1832);
				lfp();
				setState(1833);
				assertion();
				}
				}
				setState(1839);
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

	public static class Switch_case_statement_listContext extends ParserRuleContext {
		public List<Switch_case_statementContext> switch_case_statement() {
			return getRuleContexts(Switch_case_statementContext.class);
		}
		public Switch_case_statementContext switch_case_statement(int i) {
			return getRuleContext(Switch_case_statementContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Switch_case_statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSwitch_case_statement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSwitch_case_statement_list(this);
		}
	}

	public final Switch_case_statement_listContext switch_case_statement_list() throws RecognitionException {
		Switch_case_statement_listContext _localctx = new Switch_case_statement_listContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_switch_case_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			switch_case_statement();
			setState(1846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(1841);
				lfp();
				setState(1842);
				switch_case_statement();
				}
				}
				setState(1848);
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

	public static class Catch_statement_listContext extends ParserRuleContext {
		public List<Catch_statementContext> catch_statement() {
			return getRuleContexts(Catch_statementContext.class);
		}
		public Catch_statementContext catch_statement(int i) {
			return getRuleContext(Catch_statementContext.class,i);
		}
		public List<LfpContext> lfp() {
			return getRuleContexts(LfpContext.class);
		}
		public LfpContext lfp(int i) {
			return getRuleContext(LfpContext.class,i);
		}
		public Catch_statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCatch_statement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCatch_statement_list(this);
		}
	}

	public final Catch_statement_listContext catch_statement_list() throws RecognitionException {
		Catch_statement_listContext _localctx = new Catch_statement_listContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_catch_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1849);
			catch_statement();
			setState(1855);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1850);
					lfp();
					setState(1851);
					catch_statement();
					}
					} 
				}
				setState(1857);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
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

	public static class Literal_collectionContext extends ParserRuleContext {
		public Literal_collectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_collection; }
	 
		public Literal_collectionContext() { }
		public void copyFrom(Literal_collectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralListLiteralContext extends Literal_collectionContext {
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public LiteralListLiteralContext(Literal_collectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLiteralListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLiteralListLiteral(this);
		}
	}
	public static class LiteralRangeLiteralContext extends Literal_collectionContext {
		public Atomic_literalContext low;
		public Atomic_literalContext high;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RANGE() { return getToken(OParser.RANGE, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public List<Atomic_literalContext> atomic_literal() {
			return getRuleContexts(Atomic_literalContext.class);
		}
		public Atomic_literalContext atomic_literal(int i) {
			return getRuleContext(Atomic_literalContext.class,i);
		}
		public LiteralRangeLiteralContext(Literal_collectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLiteralRangeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLiteralRangeLiteral(this);
		}
	}
	public static class LiteralSetLiteralContext extends Literal_collectionContext {
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public Literal_list_literalContext literal_list_literal() {
			return getRuleContext(Literal_list_literalContext.class,0);
		}
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public LiteralSetLiteralContext(Literal_collectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLiteralSetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLiteralSetLiteral(this);
		}
	}

	public final Literal_collectionContext literal_collection() throws RecognitionException {
		Literal_collectionContext _localctx = new Literal_collectionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_literal_collection);
		try {
			setState(1872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				_localctx = new LiteralRangeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1858);
				match(LBRAK);
				setState(1859);
				((LiteralRangeLiteralContext)_localctx).low = atomic_literal();
				setState(1860);
				match(RANGE);
				setState(1861);
				((LiteralRangeLiteralContext)_localctx).high = atomic_literal();
				setState(1862);
				match(RBRAK);
				}
				break;
			case 2:
				_localctx = new LiteralListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1864);
				match(LBRAK);
				setState(1865);
				literal_list_literal();
				setState(1866);
				match(RBRAK);
				}
				break;
			case 3:
				_localctx = new LiteralSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1868);
				match(LT);
				setState(1869);
				literal_list_literal();
				setState(1870);
				match(GT);
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

	public static class Atomic_literalContext extends ParserRuleContext {
		public Atomic_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_literal; }
	 
		public Atomic_literalContext() { }
		public void copyFrom(Atomic_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinIntegerLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode MIN_INTEGER() { return getToken(OParser.MIN_INTEGER, 0); }
		public MinIntegerLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMinIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMinIntegerLiteral(this);
		}
	}
	public static class DateLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode DATE_LITERAL() { return getToken(OParser.DATE_LITERAL, 0); }
		public DateLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDateLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDateLiteral(this);
		}
	}
	public static class BooleanLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode BOOLEAN_LITERAL() { return getToken(OParser.BOOLEAN_LITERAL, 0); }
		public BooleanLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitBooleanLiteral(this);
		}
	}
	public static class VersionLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode VERSION_LITERAL() { return getToken(OParser.VERSION_LITERAL, 0); }
		public VersionLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterVersionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitVersionLiteral(this);
		}
	}
	public static class HexadecimalLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode HEXA_LITERAL() { return getToken(OParser.HEXA_LITERAL, 0); }
		public HexadecimalLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterHexadecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitHexadecimalLiteral(this);
		}
	}
	public static class UUIDLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode UUID_LITERAL() { return getToken(OParser.UUID_LITERAL, 0); }
		public UUIDLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterUUIDLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitUUIDLiteral(this);
		}
	}
	public static class MaxIntegerLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode MAX_INTEGER() { return getToken(OParser.MAX_INTEGER, 0); }
		public MaxIntegerLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMaxIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMaxIntegerLiteral(this);
		}
	}
	public static class DateTimeLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode DATETIME_LITERAL() { return getToken(OParser.DATETIME_LITERAL, 0); }
		public DateTimeLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDateTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDateTimeLiteral(this);
		}
	}
	public static class PeriodLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode PERIOD_LITERAL() { return getToken(OParser.PERIOD_LITERAL, 0); }
		public PeriodLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPeriodLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPeriodLiteral(this);
		}
	}
	public static class DecimalLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(OParser.DECIMAL_LITERAL, 0); }
		public DecimalLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDecimalLiteral(this);
		}
	}
	public static class TextLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public TextLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTextLiteral(this);
		}
	}
	public static class NullLiteralContext extends Atomic_literalContext {
		public Null_literalContext n;
		public Null_literalContext null_literal() {
			return getRuleContext(Null_literalContext.class,0);
		}
		public NullLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNullLiteral(this);
		}
	}
	public static class IntegerLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode INTEGER_LITERAL() { return getToken(OParser.INTEGER_LITERAL, 0); }
		public IntegerLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIntegerLiteral(this);
		}
	}
	public static class TimeLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode TIME_LITERAL() { return getToken(OParser.TIME_LITERAL, 0); }
		public TimeLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTimeLiteral(this);
		}
	}
	public static class CharacterLiteralContext extends Atomic_literalContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(OParser.CHAR_LITERAL, 0); }
		public CharacterLiteralContext(Atomic_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCharacterLiteral(this);
		}
	}

	public final Atomic_literalContext atomic_literal() throws RecognitionException {
		Atomic_literalContext _localctx = new Atomic_literalContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_atomic_literal);
		try {
			setState(1889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN_INTEGER:
				_localctx = new MinIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1874);
				((MinIntegerLiteralContext)_localctx).t = match(MIN_INTEGER);
				}
				break;
			case MAX_INTEGER:
				_localctx = new MaxIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1875);
				((MaxIntegerLiteralContext)_localctx).t = match(MAX_INTEGER);
				}
				break;
			case INTEGER_LITERAL:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1876);
				((IntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case HEXA_LITERAL:
				_localctx = new HexadecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1877);
				((HexadecimalLiteralContext)_localctx).t = match(HEXA_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1878);
				((CharacterLiteralContext)_localctx).t = match(CHAR_LITERAL);
				}
				break;
			case DATE_LITERAL:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1879);
				((DateLiteralContext)_localctx).t = match(DATE_LITERAL);
				}
				break;
			case TIME_LITERAL:
				_localctx = new TimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1880);
				((TimeLiteralContext)_localctx).t = match(TIME_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new TextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1881);
				((TextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1882);
				((DecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case DATETIME_LITERAL:
				_localctx = new DateTimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1883);
				((DateTimeLiteralContext)_localctx).t = match(DATETIME_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1884);
				((BooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case PERIOD_LITERAL:
				_localctx = new PeriodLiteralContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1885);
				((PeriodLiteralContext)_localctx).t = match(PERIOD_LITERAL);
				}
				break;
			case VERSION_LITERAL:
				_localctx = new VersionLiteralContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1886);
				((VersionLiteralContext)_localctx).t = match(VERSION_LITERAL);
				}
				break;
			case UUID_LITERAL:
				_localctx = new UUIDLiteralContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1887);
				((UUIDLiteralContext)_localctx).t = match(UUID_LITERAL);
				}
				break;
			case NULL:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1888);
				((NullLiteralContext)_localctx).n = null_literal();
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

	public static class Literal_list_literalContext extends ParserRuleContext {
		public List<Atomic_literalContext> atomic_literal() {
			return getRuleContexts(Atomic_literalContext.class);
		}
		public Atomic_literalContext atomic_literal(int i) {
			return getRuleContext(Atomic_literalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Literal_list_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_list_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLiteral_list_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLiteral_list_literal(this);
		}
	}

	public final Literal_list_literalContext literal_list_literal() throws RecognitionException {
		Literal_list_literalContext _localctx = new Literal_list_literalContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_literal_list_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			atomic_literal();
			setState(1896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1892);
				match(COMMA);
				setState(1893);
				atomic_literal();
				}
				}
				setState(1898);
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

	public static class Selectable_expressionContext extends ParserRuleContext {
		public Selectable_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectable_expression; }
	 
		public Selectable_expressionContext() { }
		public void copyFrom(Selectable_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ThisExpressionContext extends Selectable_expressionContext {
		public This_expressionContext exp;
		public This_expressionContext this_expression() {
			return getRuleContext(This_expressionContext.class,0);
		}
		public ThisExpressionContext(Selectable_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitThisExpression(this);
		}
	}
	public static class ParenthesisExpressionContext extends Selectable_expressionContext {
		public Parenthesis_expressionContext exp;
		public Parenthesis_expressionContext parenthesis_expression() {
			return getRuleContext(Parenthesis_expressionContext.class,0);
		}
		public ParenthesisExpressionContext(Selectable_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitParenthesisExpression(this);
		}
	}
	public static class LiteralExpressionContext extends Selectable_expressionContext {
		public Literal_expressionContext exp;
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public LiteralExpressionContext(Selectable_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLiteralExpression(this);
		}
	}
	public static class IdentifierExpressionContext extends Selectable_expressionContext {
		public IdentifierContext exp;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExpressionContext(Selectable_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIdentifierExpression(this);
		}
	}

	public final Selectable_expressionContext selectable_expression() throws RecognitionException {
		Selectable_expressionContext _localctx = new Selectable_expressionContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_selectable_expression);
		try {
			setState(1903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				_localctx = new ParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1899);
				((ParenthesisExpressionContext)_localctx).exp = parenthesis_expression();
				}
				break;
			case 2:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1900);
				((LiteralExpressionContext)_localctx).exp = literal_expression();
				}
				break;
			case 3:
				_localctx = new IdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1901);
				((IdentifierExpressionContext)_localctx).exp = identifier();
				}
				break;
			case 4:
				_localctx = new ThisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1902);
				((ThisExpressionContext)_localctx).exp = this_expression();
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

	public static class This_expressionContext extends ParserRuleContext {
		public TerminalNode SELF() { return getToken(OParser.SELF, 0); }
		public TerminalNode THIS() { return getToken(OParser.THIS, 0); }
		public This_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_this_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterThis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitThis_expression(this);
		}
	}

	public final This_expressionContext this_expression() throws RecognitionException {
		This_expressionContext _localctx = new This_expressionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_this_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1905);
			_la = _input.LA(1);
			if ( !(_la==SELF || _la==THIS) ) {
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

	public static class Parenthesis_expressionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterParenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitParenthesis_expression(this);
		}
	}

	public final Parenthesis_expressionContext parenthesis_expression() throws RecognitionException {
		Parenthesis_expressionContext _localctx = new Parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			match(LPAR);
			setState(1908);
			expression(0);
			setState(1909);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_expressionContext extends ParserRuleContext {
		public Atomic_literalContext atomic_literal() {
			return getRuleContext(Atomic_literalContext.class,0);
		}
		public Collection_literalContext collection_literal() {
			return getRuleContext(Collection_literalContext.class,0);
		}
		public Literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLiteral_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLiteral_expression(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_literal_expression);
		try {
			setState(1913);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case MIN_INTEGER:
			case MAX_INTEGER:
			case TEXT_LITERAL:
			case UUID_LITERAL:
			case INTEGER_LITERAL:
			case HEXA_LITERAL:
			case DECIMAL_LITERAL:
			case DATETIME_LITERAL:
			case TIME_LITERAL:
			case DATE_LITERAL:
			case PERIOD_LITERAL:
			case VERSION_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1911);
				atomic_literal();
				}
				break;
			case LPAR:
			case LBRAK:
			case LT:
			case LTCOLONGT:
			case MUTABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1912);
				collection_literal();
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

	public static class Collection_literalContext extends ParserRuleContext {
		public Range_literalContext range_literal() {
			return getRuleContext(Range_literalContext.class,0);
		}
		public List_literalContext list_literal() {
			return getRuleContext(List_literalContext.class,0);
		}
		public Set_literalContext set_literal() {
			return getRuleContext(Set_literalContext.class,0);
		}
		public Dict_literalContext dict_literal() {
			return getRuleContext(Dict_literalContext.class,0);
		}
		public Tuple_literalContext tuple_literal() {
			return getRuleContext(Tuple_literalContext.class,0);
		}
		public Collection_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCollection_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCollection_literal(this);
		}
	}

	public final Collection_literalContext collection_literal() throws RecognitionException {
		Collection_literalContext _localctx = new Collection_literalContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_collection_literal);
		try {
			setState(1920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1915);
				range_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1916);
				list_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1917);
				set_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1918);
				dict_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1919);
				tuple_literal();
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

	public static class Tuple_literalContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public Expression_tupleContext expression_tuple() {
			return getRuleContext(Expression_tupleContext.class,0);
		}
		public Tuple_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterTuple_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitTuple_literal(this);
		}
	}

	public final Tuple_literalContext tuple_literal() throws RecognitionException {
		Tuple_literalContext _localctx = new Tuple_literalContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_tuple_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1922);
				match(MUTABLE);
				}
			}

			setState(1925);
			match(LPAR);
			setState(1927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (EXECUTE - 97)) | (1L << (FETCH - 97)) | (1L << (FILTERED - 97)) | (1L << (MUTABLE - 97)) | (1L << (NULL - 97)) | (1L << (READ - 97)) | (1L << (SELF - 97)) | (1L << (SORTED - 97)) | (1L << (THIS - 97)) | (1L << (BOOLEAN_LITERAL - 97)) | (1L << (CHAR_LITERAL - 97)) | (1L << (MIN_INTEGER - 97)) | (1L << (MAX_INTEGER - 97)))) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (SYMBOL_IDENTIFIER - 161)) | (1L << (TYPE_IDENTIFIER - 161)) | (1L << (VARIABLE_IDENTIFIER - 161)) | (1L << (TEXT_LITERAL - 161)) | (1L << (UUID_LITERAL - 161)) | (1L << (INTEGER_LITERAL - 161)) | (1L << (HEXA_LITERAL - 161)) | (1L << (DECIMAL_LITERAL - 161)) | (1L << (DATETIME_LITERAL - 161)) | (1L << (TIME_LITERAL - 161)) | (1L << (DATE_LITERAL - 161)) | (1L << (PERIOD_LITERAL - 161)) | (1L << (VERSION_LITERAL - 161)))) != 0)) {
				{
				setState(1926);
				expression_tuple();
				}
			}

			setState(1929);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dict_literalContext extends ParserRuleContext {
		public TerminalNode LTCOLONGT() { return getToken(OParser.LTCOLONGT, 0); }
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public Dict_entry_listContext dict_entry_list() {
			return getRuleContext(Dict_entry_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public Dict_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDict_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDict_literal(this);
		}
	}

	public final Dict_literalContext dict_literal() throws RecognitionException {
		Dict_literalContext _localctx = new Dict_literalContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_dict_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTABLE) {
				{
				setState(1931);
				match(MUTABLE);
				}
			}

			setState(1942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				{
				setState(1934);
				match(LT);
				setState(1935);
				dict_entry_list();
				setState(1936);
				match(GT);
				}
				}
				break;
			case 2:
				{
				setState(1938);
				match(LTCOLONGT);
				}
				break;
			case 3:
				{
				{
				setState(1939);
				match(LT);
				setState(1940);
				match(COLON);
				setState(1941);
				match(GT);
				}
				}
				break;
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

	public static class Document_literalContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public Dict_entry_listContext dict_entry_list() {
			return getRuleContext(Dict_entry_listContext.class,0);
		}
		public Document_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDocument_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDocument_literal(this);
		}
	}

	public final Document_literalContext document_literal() throws RecognitionException {
		Document_literalContext _localctx = new Document_literalContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_document_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1944);
			match(LCURL);
			setState(1946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (EXECUTE - 97)) | (1L << (FETCH - 97)) | (1L << (FILTERED - 97)) | (1L << (MUTABLE - 97)) | (1L << (NULL - 97)) | (1L << (READ - 97)) | (1L << (SELF - 97)) | (1L << (SORTED - 97)) | (1L << (THIS - 97)) | (1L << (BOOLEAN_LITERAL - 97)) | (1L << (CHAR_LITERAL - 97)) | (1L << (MIN_INTEGER - 97)) | (1L << (MAX_INTEGER - 97)))) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (SYMBOL_IDENTIFIER - 161)) | (1L << (TYPE_IDENTIFIER - 161)) | (1L << (VARIABLE_IDENTIFIER - 161)) | (1L << (TEXT_LITERAL - 161)) | (1L << (UUID_LITERAL - 161)) | (1L << (INTEGER_LITERAL - 161)) | (1L << (HEXA_LITERAL - 161)) | (1L << (DECIMAL_LITERAL - 161)) | (1L << (DATETIME_LITERAL - 161)) | (1L << (TIME_LITERAL - 161)) | (1L << (DATE_LITERAL - 161)) | (1L << (PERIOD_LITERAL - 161)) | (1L << (VERSION_LITERAL - 161)))) != 0)) {
				{
				setState(1945);
				dict_entry_list();
				}
			}

			setState(1948);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_tupleContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Expression_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterExpression_tuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitExpression_tuple(this);
		}
	}

	public final Expression_tupleContext expression_tuple() throws RecognitionException {
		Expression_tupleContext _localctx = new Expression_tupleContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_expression_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1950);
			expression(0);
			setState(1951);
			match(COMMA);
			setState(1960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (EXECUTE - 97)) | (1L << (FETCH - 97)) | (1L << (FILTERED - 97)) | (1L << (MUTABLE - 97)) | (1L << (NULL - 97)) | (1L << (READ - 97)) | (1L << (SELF - 97)) | (1L << (SORTED - 97)) | (1L << (THIS - 97)) | (1L << (BOOLEAN_LITERAL - 97)) | (1L << (CHAR_LITERAL - 97)) | (1L << (MIN_INTEGER - 97)) | (1L << (MAX_INTEGER - 97)))) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (SYMBOL_IDENTIFIER - 161)) | (1L << (TYPE_IDENTIFIER - 161)) | (1L << (VARIABLE_IDENTIFIER - 161)) | (1L << (TEXT_LITERAL - 161)) | (1L << (UUID_LITERAL - 161)) | (1L << (INTEGER_LITERAL - 161)) | (1L << (HEXA_LITERAL - 161)) | (1L << (DECIMAL_LITERAL - 161)) | (1L << (DATETIME_LITERAL - 161)) | (1L << (TIME_LITERAL - 161)) | (1L << (DATE_LITERAL - 161)) | (1L << (PERIOD_LITERAL - 161)) | (1L << (VERSION_LITERAL - 161)))) != 0)) {
				{
				setState(1952);
				expression(0);
				setState(1957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1953);
					match(COMMA);
					setState(1954);
					expression(0);
					}
					}
					setState(1959);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Dict_entry_listContext extends ParserRuleContext {
		public List<Dict_entryContext> dict_entry() {
			return getRuleContexts(Dict_entryContext.class);
		}
		public Dict_entryContext dict_entry(int i) {
			return getRuleContext(Dict_entryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Dict_entry_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_entry_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDict_entry_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDict_entry_list(this);
		}
	}

	public final Dict_entry_listContext dict_entry_list() throws RecognitionException {
		Dict_entry_listContext _localctx = new Dict_entry_listContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_dict_entry_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			dict_entry();
			setState(1967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1963);
				match(COMMA);
				setState(1964);
				dict_entry();
				}
				}
				setState(1969);
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

	public static class Dict_entryContext extends ParserRuleContext {
		public ExpressionContext key;
		public ExpressionContext value;
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Dict_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDict_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDict_entry(this);
		}
	}

	public final Dict_entryContext dict_entry() throws RecognitionException {
		Dict_entryContext _localctx = new Dict_entryContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_dict_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			((Dict_entryContext)_localctx).key = expression(0);
			setState(1971);
			match(COLON);
			setState(1972);
			((Dict_entryContext)_localctx).value = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Slice_argumentsContext extends ParserRuleContext {
		public Slice_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice_arguments; }
	 
		public Slice_argumentsContext() { }
		public void copyFrom(Slice_argumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SliceFirstAndLastContext extends Slice_argumentsContext {
		public ExpressionContext first;
		public ExpressionContext last;
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceFirstAndLastContext(Slice_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSliceFirstAndLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSliceFirstAndLast(this);
		}
	}
	public static class SliceLastOnlyContext extends Slice_argumentsContext {
		public ExpressionContext last;
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SliceLastOnlyContext(Slice_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSliceLastOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSliceLastOnly(this);
		}
	}
	public static class SliceFirstOnlyContext extends Slice_argumentsContext {
		public ExpressionContext first;
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SliceFirstOnlyContext(Slice_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSliceFirstOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSliceFirstOnly(this);
		}
	}

	public final Slice_argumentsContext slice_arguments() throws RecognitionException {
		Slice_argumentsContext _localctx = new Slice_argumentsContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_slice_arguments);
		try {
			setState(1983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				_localctx = new SliceFirstAndLastContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1974);
				((SliceFirstAndLastContext)_localctx).first = expression(0);
				setState(1975);
				match(COLON);
				setState(1976);
				((SliceFirstAndLastContext)_localctx).last = expression(0);
				}
				break;
			case 2:
				_localctx = new SliceFirstOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1978);
				((SliceFirstOnlyContext)_localctx).first = expression(0);
				setState(1979);
				match(COLON);
				}
				break;
			case 3:
				_localctx = new SliceLastOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1981);
				match(COLON);
				setState(1982);
				((SliceLastOnlyContext)_localctx).last = expression(0);
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

	public static class Assign_variable_statementContext extends ParserRuleContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_variable_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_variable_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssign_variable_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssign_variable_statement(this);
		}
	}

	public final Assign_variable_statementContext assign_variable_statement() throws RecognitionException {
		Assign_variable_statementContext _localctx = new Assign_variable_statementContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_assign_variable_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1985);
			variable_identifier();
			setState(1986);
			assign();
			setState(1987);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignable_instanceContext extends ParserRuleContext {
		public Assignable_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable_instance; }
	 
		public Assignable_instanceContext() { }
		public void copyFrom(Assignable_instanceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChildInstanceContext extends Assignable_instanceContext {
		public Assignable_instanceContext assignable_instance() {
			return getRuleContext(Assignable_instanceContext.class,0);
		}
		public Child_instanceContext child_instance() {
			return getRuleContext(Child_instanceContext.class,0);
		}
		public ChildInstanceContext(Assignable_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterChildInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitChildInstance(this);
		}
	}
	public static class RootInstanceContext extends Assignable_instanceContext {
		public Variable_identifierContext variable_identifier() {
			return getRuleContext(Variable_identifierContext.class,0);
		}
		public RootInstanceContext(Assignable_instanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRootInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRootInstance(this);
		}
	}

	public final Assignable_instanceContext assignable_instance() throws RecognitionException {
		return assignable_instance(0);
	}

	private Assignable_instanceContext assignable_instance(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Assignable_instanceContext _localctx = new Assignable_instanceContext(_ctx, _parentState);
		Assignable_instanceContext _prevctx = _localctx;
		int _startState = 292;
		enterRecursionRule(_localctx, 292, RULE_assignable_instance, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RootInstanceContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1990);
			variable_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1996);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChildInstanceContext(new Assignable_instanceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_assignable_instance);
					setState(1992);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1993);
					child_instance();
					}
					} 
				}
				setState(1998);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
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

	public static class Is_expressionContext extends ParserRuleContext {
		public Is_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_expression; }
	 
		public Is_expressionContext() { }
		public void copyFrom(Is_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IsATypeExpressionContext extends Is_expressionContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public Category_or_any_typeContext category_or_any_type() {
			return getRuleContext(Category_or_any_typeContext.class,0);
		}
		public IsATypeExpressionContext(Is_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIsATypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIsATypeExpression(this);
		}
	}
	public static class IsOtherExpressionContext extends Is_expressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IsOtherExpressionContext(Is_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIsOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIsOtherExpression(this);
		}
	}

	public final Is_expressionContext is_expression() throws RecognitionException {
		Is_expressionContext _localctx = new Is_expressionContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_is_expression);
		try {
			setState(2003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				_localctx = new IsATypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1999);
				if (!(this.willBeAOrAn())) throw new FailedPredicateException(this, "$parser.willBeAOrAn()");
				setState(2000);
				match(VARIABLE_IDENTIFIER);
				setState(2001);
				category_or_any_type();
				}
				break;
			case 2:
				_localctx = new IsOtherExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2002);
				expression(0);
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

	public static class Read_all_expressionContext extends ParserRuleContext {
		public ExpressionContext source;
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode ALL() { return getToken(OParser.ALL, 0); }
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_all_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_all_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRead_all_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRead_all_expression(this);
		}
	}

	public final Read_all_expressionContext read_all_expression() throws RecognitionException {
		Read_all_expressionContext _localctx = new Read_all_expressionContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_read_all_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2005);
			match(READ);
			setState(2006);
			match(ALL);
			setState(2007);
			match(FROM);
			setState(2008);
			((Read_all_expressionContext)_localctx).source = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_one_expressionContext extends ParserRuleContext {
		public ExpressionContext source;
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode ONE() { return getToken(OParser.ONE, 0); }
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Read_one_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_one_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterRead_one_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitRead_one_expression(this);
		}
	}

	public final Read_one_expressionContext read_one_expression() throws RecognitionException {
		Read_one_expressionContext _localctx = new Read_one_expressionContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_read_one_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
			match(READ);
			setState(2011);
			match(ONE);
			setState(2012);
			match(FROM);
			setState(2013);
			((Read_one_expressionContext)_localctx).source = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_listContext extends ParserRuleContext {
		public List<Order_byContext> order_by() {
			return getRuleContexts(Order_byContext.class);
		}
		public Order_byContext order_by(int i) {
			return getRuleContext(Order_byContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OParser.COMMA, i);
		}
		public Order_by_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOrder_by_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOrder_by_list(this);
		}
	}

	public final Order_by_listContext order_by_list() throws RecognitionException {
		Order_by_listContext _localctx = new Order_by_listContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_order_by_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2015);
			order_by();
			setState(2020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2016);
				match(COMMA);
				setState(2017);
				order_by();
				}
				}
				setState(2022);
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

	public static class Order_byContext extends ParserRuleContext {
		public List<Variable_identifierContext> variable_identifier() {
			return getRuleContexts(Variable_identifierContext.class);
		}
		public Variable_identifierContext variable_identifier(int i) {
			return getRuleContext(Variable_identifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(OParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OParser.DOT, i);
		}
		public TerminalNode ASC() { return getToken(OParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OParser.DESC, 0); }
		public Order_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOrder_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOrder_by(this);
		}
	}

	public final Order_byContext order_by() throws RecognitionException {
		Order_byContext _localctx = new Order_byContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_order_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
			variable_identifier();
			setState(2028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(2024);
				match(DOT);
				setState(2025);
				variable_identifier();
				}
				}
				setState(2030);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2031);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	 
		public OperatorContext() { }
		public void copyFrom(OperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperatorPlusContext extends OperatorContext {
		public TerminalNode PLUS() { return getToken(OParser.PLUS, 0); }
		public OperatorPlusContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperatorPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperatorPlus(this);
		}
	}
	public static class OperatorDivideContext extends OperatorContext {
		public DivideContext divide() {
			return getRuleContext(DivideContext.class,0);
		}
		public OperatorDivideContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperatorDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperatorDivide(this);
		}
	}
	public static class OperatorIDivideContext extends OperatorContext {
		public IdivideContext idivide() {
			return getRuleContext(IdivideContext.class,0);
		}
		public OperatorIDivideContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperatorIDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperatorIDivide(this);
		}
	}
	public static class OperatorMultiplyContext extends OperatorContext {
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public OperatorMultiplyContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperatorMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperatorMultiply(this);
		}
	}
	public static class OperatorMinusContext extends OperatorContext {
		public TerminalNode MINUS() { return getToken(OParser.MINUS, 0); }
		public OperatorMinusContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperatorMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperatorMinus(this);
		}
	}
	public static class OperatorModuloContext extends OperatorContext {
		public ModuloContext modulo() {
			return getRuleContext(ModuloContext.class,0);
		}
		public OperatorModuloContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterOperatorModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitOperatorModulo(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_operator);
		try {
			setState(2040);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new OperatorPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2034);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new OperatorMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2035);
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new OperatorMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2036);
				multiply();
				}
				break;
			case SLASH:
				_localctx = new OperatorDivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2037);
				divide();
				}
				break;
			case BSLASH:
				_localctx = new OperatorIDivideContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2038);
				idivide();
				}
				break;
			case PERCENT:
			case MODULO:
				_localctx = new OperatorModuloContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2039);
				modulo();
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode JAVA() { return getToken(OParser.JAVA, 0); }
		public TerminalNode CSHARP() { return getToken(OParser.CSHARP, 0); }
		public TerminalNode PYTHON2() { return getToken(OParser.PYTHON2, 0); }
		public TerminalNode PYTHON3() { return getToken(OParser.PYTHON3, 0); }
		public TerminalNode JAVASCRIPT() { return getToken(OParser.JAVASCRIPT, 0); }
		public TerminalNode SWIFT() { return getToken(OParser.SWIFT, 0); }
		public TerminalNode BOOLEAN() { return getToken(OParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(OParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(OParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(OParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(OParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(OParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(OParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(OParser.PERIOD, 0); }
		public TerminalNode VERSION() { return getToken(OParser.VERSION, 0); }
		public TerminalNode METHOD_T() { return getToken(OParser.METHOD_T, 0); }
		public TerminalNode CODE() { return getToken(OParser.CODE, 0); }
		public TerminalNode DOCUMENT() { return getToken(OParser.DOCUMENT, 0); }
		public TerminalNode BLOB() { return getToken(OParser.BLOB, 0); }
		public TerminalNode IMAGE() { return getToken(OParser.IMAGE, 0); }
		public TerminalNode UUID() { return getToken(OParser.UUID, 0); }
		public TerminalNode ITERATOR() { return getToken(OParser.ITERATOR, 0); }
		public TerminalNode CURSOR() { return getToken(OParser.CURSOR, 0); }
		public TerminalNode HTML() { return getToken(OParser.HTML, 0); }
		public TerminalNode ABSTRACT() { return getToken(OParser.ABSTRACT, 0); }
		public TerminalNode ALL() { return getToken(OParser.ALL, 0); }
		public TerminalNode ALWAYS() { return getToken(OParser.ALWAYS, 0); }
		public TerminalNode AND() { return getToken(OParser.AND, 0); }
		public TerminalNode ANY() { return getToken(OParser.ANY, 0); }
		public TerminalNode AS() { return getToken(OParser.AS, 0); }
		public TerminalNode ASC() { return getToken(OParser.ASC, 0); }
		public TerminalNode ATTR() { return getToken(OParser.ATTR, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(OParser.ATTRIBUTE, 0); }
		public TerminalNode ATTRIBUTES() { return getToken(OParser.ATTRIBUTES, 0); }
		public TerminalNode BINDINGS() { return getToken(OParser.BINDINGS, 0); }
		public TerminalNode BREAK() { return getToken(OParser.BREAK, 0); }
		public TerminalNode BY() { return getToken(OParser.BY, 0); }
		public TerminalNode CASE() { return getToken(OParser.CASE, 0); }
		public TerminalNode CATCH() { return getToken(OParser.CATCH, 0); }
		public TerminalNode CATEGORY() { return getToken(OParser.CATEGORY, 0); }
		public TerminalNode CLASS() { return getToken(OParser.CLASS, 0); }
		public TerminalNode CLOSE() { return getToken(OParser.CLOSE, 0); }
		public TerminalNode CONTAINS() { return getToken(OParser.CONTAINS, 0); }
		public TerminalNode DEF() { return getToken(OParser.DEF, 0); }
		public TerminalNode DEFAULT() { return getToken(OParser.DEFAULT, 0); }
		public TerminalNode DEFINE() { return getToken(OParser.DEFINE, 0); }
		public TerminalNode DELETE() { return getToken(OParser.DELETE, 0); }
		public TerminalNode DESC() { return getToken(OParser.DESC, 0); }
		public TerminalNode DO() { return getToken(OParser.DO, 0); }
		public TerminalNode DOING() { return getToken(OParser.DOING, 0); }
		public TerminalNode EACH() { return getToken(OParser.EACH, 0); }
		public TerminalNode ELSE() { return getToken(OParser.ELSE, 0); }
		public TerminalNode ENUM() { return getToken(OParser.ENUM, 0); }
		public TerminalNode ENUMERATED() { return getToken(OParser.ENUMERATED, 0); }
		public TerminalNode EXCEPT() { return getToken(OParser.EXCEPT, 0); }
		public TerminalNode EXECUTE() { return getToken(OParser.EXECUTE, 0); }
		public TerminalNode EXPECTING() { return getToken(OParser.EXPECTING, 0); }
		public TerminalNode EXTENDS() { return getToken(OParser.EXTENDS, 0); }
		public TerminalNode FETCH() { return getToken(OParser.FETCH, 0); }
		public TerminalNode FILTERED() { return getToken(OParser.FILTERED, 0); }
		public TerminalNode FINALLY() { return getToken(OParser.FINALLY, 0); }
		public TerminalNode FLUSH() { return getToken(OParser.FLUSH, 0); }
		public TerminalNode FOR() { return getToken(OParser.FOR, 0); }
		public TerminalNode FROM() { return getToken(OParser.FROM, 0); }
		public TerminalNode GETTER() { return getToken(OParser.GETTER, 0); }
		public TerminalNode HAS() { return getToken(OParser.HAS, 0); }
		public TerminalNode IF() { return getToken(OParser.IF, 0); }
		public TerminalNode IN() { return getToken(OParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(OParser.INDEX, 0); }
		public TerminalNode INVOKE() { return getToken(OParser.INVOKE, 0); }
		public TerminalNode IS() { return getToken(OParser.IS, 0); }
		public TerminalNode MATCHING() { return getToken(OParser.MATCHING, 0); }
		public TerminalNode METHOD() { return getToken(OParser.METHOD, 0); }
		public TerminalNode METHODS() { return getToken(OParser.METHODS, 0); }
		public TerminalNode MODULO() { return getToken(OParser.MODULO, 0); }
		public TerminalNode MUTABLE() { return getToken(OParser.MUTABLE, 0); }
		public TerminalNode NATIVE() { return getToken(OParser.NATIVE, 0); }
		public TerminalNode NONE() { return getToken(OParser.NONE, 0); }
		public TerminalNode NOT() { return getToken(OParser.NOT, 0); }
		public TerminalNode NOTHING() { return getToken(OParser.NOTHING, 0); }
		public TerminalNode NULL() { return getToken(OParser.NULL, 0); }
		public TerminalNode ON() { return getToken(OParser.ON, 0); }
		public TerminalNode ONE() { return getToken(OParser.ONE, 0); }
		public TerminalNode OPEN() { return getToken(OParser.OPEN, 0); }
		public TerminalNode OPERATOR() { return getToken(OParser.OPERATOR, 0); }
		public TerminalNode OR() { return getToken(OParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(OParser.ORDER, 0); }
		public TerminalNode OTHERWISE() { return getToken(OParser.OTHERWISE, 0); }
		public TerminalNode PASS() { return getToken(OParser.PASS, 0); }
		public TerminalNode RAISE() { return getToken(OParser.RAISE, 0); }
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode RECEIVING() { return getToken(OParser.RECEIVING, 0); }
		public TerminalNode RESOURCE() { return getToken(OParser.RESOURCE, 0); }
		public TerminalNode RETURN() { return getToken(OParser.RETURN, 0); }
		public TerminalNode RETURNING() { return getToken(OParser.RETURNING, 0); }
		public TerminalNode ROWS() { return getToken(OParser.ROWS, 0); }
		public TerminalNode SELF() { return getToken(OParser.SELF, 0); }
		public TerminalNode SETTER() { return getToken(OParser.SETTER, 0); }
		public TerminalNode SINGLETON() { return getToken(OParser.SINGLETON, 0); }
		public TerminalNode SORTED() { return getToken(OParser.SORTED, 0); }
		public TerminalNode STORABLE() { return getToken(OParser.STORABLE, 0); }
		public TerminalNode STORE() { return getToken(OParser.STORE, 0); }
		public TerminalNode SWITCH() { return getToken(OParser.SWITCH, 0); }
		public TerminalNode TEST() { return getToken(OParser.TEST, 0); }
		public TerminalNode THIS() { return getToken(OParser.THIS, 0); }
		public TerminalNode THROW() { return getToken(OParser.THROW, 0); }
		public TerminalNode TO() { return getToken(OParser.TO, 0); }
		public TerminalNode TRY() { return getToken(OParser.TRY, 0); }
		public TerminalNode VERIFYING() { return getToken(OParser.VERIFYING, 0); }
		public TerminalNode WIDGET() { return getToken(OParser.WIDGET, 0); }
		public TerminalNode WITH() { return getToken(OParser.WITH, 0); }
		public TerminalNode WHEN() { return getToken(OParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(OParser.WHERE, 0); }
		public TerminalNode WHILE() { return getToken(OParser.WHILE, 0); }
		public TerminalNode WRITE() { return getToken(OParser.WRITE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CLOSE - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INVOKE - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ONE - 64)) | (1L << (OPEN - 64)) | (1L << (OPERATOR - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)))) != 0)) ) {
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

	public static class New_tokenContext extends ParserRuleContext {
		public Token i1;
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public New_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterNew_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitNew_token(this);
		}
	}

	public final New_tokenContext new_token() throws RecognitionException {
		New_tokenContext _localctx = new New_tokenContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_new_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2044);
			((New_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2045);
			if (!(this.isText(((New_tokenContext)_localctx).i1,"new"))) throw new FailedPredicateException(this, "$parser.isText($i1,\"new\")");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_tokenContext extends ParserRuleContext {
		public Token i1;
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public Key_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterKey_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitKey_token(this);
		}
	}

	public final Key_tokenContext key_token() throws RecognitionException {
		Key_tokenContext _localctx = new Key_tokenContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_key_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2047);
			((Key_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2048);
			if (!(this.isText(((Key_tokenContext)_localctx).i1,"key"))) throw new FailedPredicateException(this, "$parser.isText($i1,\"key\")");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_tokenContext extends ParserRuleContext {
		public Token i1;
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public Module_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterModule_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitModule_token(this);
		}
	}

	public final Module_tokenContext module_token() throws RecognitionException {
		Module_tokenContext _localctx = new Module_tokenContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_module_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2050);
			((Module_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2051);
			if (!(this.isText(((Module_tokenContext)_localctx).i1,"module"))) throw new FailedPredicateException(this, "$parser.isText($i1,\"module\")");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_tokenContext extends ParserRuleContext {
		public Token i1;
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public Value_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterValue_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitValue_token(this);
		}
	}

	public final Value_tokenContext value_token() throws RecognitionException {
		Value_tokenContext _localctx = new Value_tokenContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_value_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			((Value_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2054);
			if (!(this.isText(((Value_tokenContext)_localctx).i1,"value"))) throw new FailedPredicateException(this, "$parser.isText($i1,\"value\")");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Symbols_tokenContext extends ParserRuleContext {
		public Token i1;
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public Symbols_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterSymbols_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitSymbols_token(this);
		}
	}

	public final Symbols_tokenContext symbols_token() throws RecognitionException {
		Symbols_tokenContext _localctx = new Symbols_tokenContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_symbols_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2056);
			((Symbols_tokenContext)_localctx).i1 = match(VARIABLE_IDENTIFIER);
			setState(2057);
			if (!(this.isText(((Symbols_tokenContext)_localctx).i1,"symbols"))) throw new FailedPredicateException(this, "$parser.isText($i1,\"symbols\")");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2059);
			match(EQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplyContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(OParser.STAR, 0); }
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitMultiply(this);
		}
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_multiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			match(STAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivideContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(OParser.SLASH, 0); }
		public DivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitDivide(this);
		}
	}

	public final DivideContext divide() throws RecognitionException {
		DivideContext _localctx = new DivideContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2063);
			match(SLASH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdivideContext extends ParserRuleContext {
		public TerminalNode BSLASH() { return getToken(OParser.BSLASH, 0); }
		public IdivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idivide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterIdivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitIdivide(this);
		}
	}

	public final IdivideContext idivide() throws RecognitionException {
		IdivideContext _localctx = new IdivideContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_idivide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2065);
			match(BSLASH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuloContext extends ParserRuleContext {
		public TerminalNode PERCENT() { return getToken(OParser.PERCENT, 0); }
		public TerminalNode MODULO() { return getToken(OParser.MODULO, 0); }
		public ModuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitModulo(this);
		}
	}

	public final ModuloContext modulo() throws RecognitionException {
		ModuloContext _localctx = new ModuloContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_modulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067);
			_la = _input.LA(1);
			if ( !(_la==PERCENT || _la==MODULO) ) {
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

	public static class LfsContext extends ParserRuleContext {
		public LfsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lfs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLfs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLfs(this);
		}
	}

	public final LfsContext lfs() throws RecognitionException {
		LfsContext _localctx = new LfsContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_lfs);
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

	public static class LfpContext extends ParserRuleContext {
		public LfpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lfp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterLfp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitLfp(this);
		}
	}

	public final LfpContext lfp() throws RecognitionException {
		LfpContext _localctx = new LfpContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_lfp);
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

	public static class Javascript_statementContext extends ParserRuleContext {
		public Javascript_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_statement; }
	 
		public Javascript_statementContext() { }
		public void copyFrom(Javascript_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavascriptStatementContext extends Javascript_statementContext {
		public Javascript_expressionContext exp;
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptStatementContext(Javascript_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptStatement(this);
		}
	}
	public static class JavascriptReturnStatementContext extends Javascript_statementContext {
		public Javascript_expressionContext exp;
		public TerminalNode RETURN() { return getToken(OParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptReturnStatementContext(Javascript_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptReturnStatement(this);
		}
	}

	public final Javascript_statementContext javascript_statement() throws RecognitionException {
		Javascript_statementContext _localctx = new Javascript_statementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_javascript_statement);
		try {
			setState(2080);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavascriptReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2073);
				match(RETURN);
				setState(2074);
				((JavascriptReturnStatementContext)_localctx).exp = javascript_expression(0);
				setState(2075);
				match(SEMI);
				}
				break;
			case LPAR:
			case LBRAK:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case UUID:
			case HTML:
			case NONE:
			case NULL:
			case READ:
			case SELF:
			case TEST:
			case THIS:
			case WRITE:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
			case DOLLAR_IDENTIFIER:
			case TEXT_LITERAL:
			case INTEGER_LITERAL:
			case DECIMAL_LITERAL:
				_localctx = new JavascriptStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2077);
				((JavascriptStatementContext)_localctx).exp = javascript_expression(0);
				setState(2078);
				match(SEMI);
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

	public static class Javascript_expressionContext extends ParserRuleContext {
		public Javascript_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_expression; }
	 
		public Javascript_expressionContext() { }
		public void copyFrom(Javascript_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavascriptSelectorExpressionContext extends Javascript_expressionContext {
		public Javascript_expressionContext parent;
		public Javascript_selector_expressionContext child;
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public Javascript_selector_expressionContext javascript_selector_expression() {
			return getRuleContext(Javascript_selector_expressionContext.class,0);
		}
		public JavascriptSelectorExpressionContext(Javascript_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptSelectorExpression(this);
		}
	}
	public static class JavascriptPrimaryExpressionContext extends Javascript_expressionContext {
		public Javascript_primary_expressionContext exp;
		public Javascript_primary_expressionContext javascript_primary_expression() {
			return getRuleContext(Javascript_primary_expressionContext.class,0);
		}
		public JavascriptPrimaryExpressionContext(Javascript_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptPrimaryExpression(this);
		}
	}

	public final Javascript_expressionContext javascript_expression() throws RecognitionException {
		return javascript_expression(0);
	}

	private Javascript_expressionContext javascript_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Javascript_expressionContext _localctx = new Javascript_expressionContext(_ctx, _parentState);
		Javascript_expressionContext _prevctx = _localctx;
		int _startState = 334;
		enterRecursionRule(_localctx, 334, RULE_javascript_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2083);
			((JavascriptPrimaryExpressionContext)_localctx).exp = javascript_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2089);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptSelectorExpressionContext(new Javascript_expressionContext(_parentctx, _parentState));
					((JavascriptSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_expression);
					setState(2085);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2086);
					((JavascriptSelectorExpressionContext)_localctx).child = javascript_selector_expression();
					}
					} 
				}
				setState(2091);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
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

	public static class Javascript_primary_expressionContext extends ParserRuleContext {
		public Javascript_this_expressionContext javascript_this_expression() {
			return getRuleContext(Javascript_this_expressionContext.class,0);
		}
		public Javascript_new_expressionContext javascript_new_expression() {
			return getRuleContext(Javascript_new_expressionContext.class,0);
		}
		public Javascript_parenthesis_expressionContext javascript_parenthesis_expression() {
			return getRuleContext(Javascript_parenthesis_expressionContext.class,0);
		}
		public Javascript_identifier_expressionContext javascript_identifier_expression() {
			return getRuleContext(Javascript_identifier_expressionContext.class,0);
		}
		public Javascript_literal_expressionContext javascript_literal_expression() {
			return getRuleContext(Javascript_literal_expressionContext.class,0);
		}
		public Javascript_method_expressionContext javascript_method_expression() {
			return getRuleContext(Javascript_method_expressionContext.class,0);
		}
		public Javascript_item_expressionContext javascript_item_expression() {
			return getRuleContext(Javascript_item_expressionContext.class,0);
		}
		public Javascript_primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_primary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_primary_expression(this);
		}
	}

	public final Javascript_primary_expressionContext javascript_primary_expression() throws RecognitionException {
		Javascript_primary_expressionContext _localctx = new Javascript_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_javascript_primary_expression);
		try {
			setState(2099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2092);
				javascript_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2093);
				javascript_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2094);
				javascript_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2095);
				javascript_identifier_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2096);
				javascript_literal_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2097);
				javascript_method_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2098);
				javascript_item_expression();
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

	public static class Javascript_this_expressionContext extends ParserRuleContext {
		public This_expressionContext this_expression() {
			return getRuleContext(This_expressionContext.class,0);
		}
		public Javascript_this_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_this_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_this_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_this_expression(this);
		}
	}

	public final Javascript_this_expressionContext javascript_this_expression() throws RecognitionException {
		Javascript_this_expressionContext _localctx = new Javascript_this_expressionContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_javascript_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2101);
			this_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_new_expressionContext extends ParserRuleContext {
		public New_tokenContext new_token() {
			return getRuleContext(New_tokenContext.class,0);
		}
		public Javascript_method_expressionContext javascript_method_expression() {
			return getRuleContext(Javascript_method_expressionContext.class,0);
		}
		public Javascript_new_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_new_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_new_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_new_expression(this);
		}
	}

	public final Javascript_new_expressionContext javascript_new_expression() throws RecognitionException {
		Javascript_new_expressionContext _localctx = new Javascript_new_expressionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_javascript_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2103);
			new_token();
			setState(2104);
			javascript_method_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_selector_expressionContext extends ParserRuleContext {
		public Javascript_selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_selector_expression; }
	 
		public Javascript_selector_expressionContext() { }
		public void copyFrom(Javascript_selector_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaScriptMemberExpressionContext extends Javascript_selector_expressionContext {
		public Javascript_identifierContext name;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Javascript_identifierContext javascript_identifier() {
			return getRuleContext(Javascript_identifierContext.class,0);
		}
		public JavaScriptMemberExpressionContext(Javascript_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaScriptMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaScriptMemberExpression(this);
		}
	}
	public static class JavaScriptItemExpressionContext extends Javascript_selector_expressionContext {
		public Javascript_item_expressionContext exp;
		public Javascript_item_expressionContext javascript_item_expression() {
			return getRuleContext(Javascript_item_expressionContext.class,0);
		}
		public JavaScriptItemExpressionContext(Javascript_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaScriptItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaScriptItemExpression(this);
		}
	}
	public static class JavaScriptMethodExpressionContext extends Javascript_selector_expressionContext {
		public Javascript_method_expressionContext method;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Javascript_method_expressionContext javascript_method_expression() {
			return getRuleContext(Javascript_method_expressionContext.class,0);
		}
		public JavaScriptMethodExpressionContext(Javascript_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaScriptMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaScriptMethodExpression(this);
		}
	}

	public final Javascript_selector_expressionContext javascript_selector_expression() throws RecognitionException {
		Javascript_selector_expressionContext _localctx = new Javascript_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_javascript_selector_expression);
		try {
			setState(2111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				_localctx = new JavaScriptMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2106);
				match(DOT);
				setState(2107);
				((JavaScriptMethodExpressionContext)_localctx).method = javascript_method_expression();
				}
				break;
			case 2:
				_localctx = new JavaScriptMemberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2108);
				match(DOT);
				setState(2109);
				((JavaScriptMemberExpressionContext)_localctx).name = javascript_identifier();
				}
				break;
			case 3:
				_localctx = new JavaScriptItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2110);
				((JavaScriptItemExpressionContext)_localctx).exp = javascript_item_expression();
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

	public static class Javascript_method_expressionContext extends ParserRuleContext {
		public Javascript_identifierContext name;
		public Javascript_argumentsContext args;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Javascript_identifierContext javascript_identifier() {
			return getRuleContext(Javascript_identifierContext.class,0);
		}
		public Javascript_argumentsContext javascript_arguments() {
			return getRuleContext(Javascript_argumentsContext.class,0);
		}
		public Javascript_method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_method_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_method_expression(this);
		}
	}

	public final Javascript_method_expressionContext javascript_method_expression() throws RecognitionException {
		Javascript_method_expressionContext _localctx = new Javascript_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_javascript_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2113);
			((Javascript_method_expressionContext)_localctx).name = javascript_identifier();
			setState(2114);
			match(LPAR);
			setState(2116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (LPAR - 16)) | (1L << (LBRAK - 16)) | (1L << (BOOLEAN - 16)) | (1L << (CHARACTER - 16)) | (1L << (TEXT - 16)) | (1L << (INTEGER - 16)) | (1L << (DECIMAL - 16)) | (1L << (DATE - 16)) | (1L << (TIME - 16)) | (1L << (DATETIME - 16)) | (1L << (PERIOD - 16)) | (1L << (VERSION - 16)) | (1L << (UUID - 16)) | (1L << (HTML - 16)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (NONE - 119)) | (1L << (NULL - 119)) | (1L << (READ - 119)) | (1L << (SELF - 119)) | (1L << (TEST - 119)) | (1L << (THIS - 119)) | (1L << (WRITE - 119)) | (1L << (BOOLEAN_LITERAL - 119)) | (1L << (CHAR_LITERAL - 119)) | (1L << (SYMBOL_IDENTIFIER - 119)) | (1L << (TYPE_IDENTIFIER - 119)) | (1L << (VARIABLE_IDENTIFIER - 119)) | (1L << (DOLLAR_IDENTIFIER - 119)) | (1L << (TEXT_LITERAL - 119)) | (1L << (INTEGER_LITERAL - 119)) | (1L << (DECIMAL_LITERAL - 119)))) != 0)) {
				{
				setState(2115);
				((Javascript_method_expressionContext)_localctx).args = javascript_arguments(0);
				}
			}

			setState(2118);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_argumentsContext extends ParserRuleContext {
		public Javascript_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_arguments; }
	 
		public Javascript_argumentsContext() { }
		public void copyFrom(Javascript_argumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavascriptArgumentListContext extends Javascript_argumentsContext {
		public Javascript_expressionContext item;
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptArgumentListContext(Javascript_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptArgumentList(this);
		}
	}
	public static class JavascriptArgumentListItemContext extends Javascript_argumentsContext {
		public Javascript_argumentsContext items;
		public Javascript_expressionContext item;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Javascript_argumentsContext javascript_arguments() {
			return getRuleContext(Javascript_argumentsContext.class,0);
		}
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public JavascriptArgumentListItemContext(Javascript_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptArgumentListItem(this);
		}
	}

	public final Javascript_argumentsContext javascript_arguments() throws RecognitionException {
		return javascript_arguments(0);
	}

	private Javascript_argumentsContext javascript_arguments(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Javascript_argumentsContext _localctx = new Javascript_argumentsContext(_ctx, _parentState);
		Javascript_argumentsContext _prevctx = _localctx;
		int _startState = 346;
		enterRecursionRule(_localctx, 346, RULE_javascript_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavascriptArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2121);
			((JavascriptArgumentListContext)_localctx).item = javascript_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavascriptArgumentListItemContext(new Javascript_argumentsContext(_parentctx, _parentState));
					((JavascriptArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_javascript_arguments);
					setState(2123);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2124);
					match(COMMA);
					setState(2125);
					((JavascriptArgumentListItemContext)_localctx).item = javascript_expression(0);
					}
					} 
				}
				setState(2130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
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

	public static class Javascript_item_expressionContext extends ParserRuleContext {
		public Javascript_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public Javascript_item_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_item_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_item_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_item_expression(this);
		}
	}

	public final Javascript_item_expressionContext javascript_item_expression() throws RecognitionException {
		Javascript_item_expressionContext _localctx = new Javascript_item_expressionContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_javascript_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2131);
			match(LBRAK);
			setState(2132);
			((Javascript_item_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2133);
			match(RBRAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_parenthesis_expressionContext extends ParserRuleContext {
		public Javascript_expressionContext exp;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Javascript_expressionContext javascript_expression() {
			return getRuleContext(Javascript_expressionContext.class,0);
		}
		public Javascript_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_parenthesis_expression(this);
		}
	}

	public final Javascript_parenthesis_expressionContext javascript_parenthesis_expression() throws RecognitionException {
		Javascript_parenthesis_expressionContext _localctx = new Javascript_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_javascript_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2135);
			match(LPAR);
			setState(2136);
			((Javascript_parenthesis_expressionContext)_localctx).exp = javascript_expression(0);
			setState(2137);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_identifier_expressionContext extends ParserRuleContext {
		public Javascript_identifierContext name;
		public Javascript_identifierContext javascript_identifier() {
			return getRuleContext(Javascript_identifierContext.class,0);
		}
		public Javascript_identifier_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_identifier_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_identifier_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_identifier_expression(this);
		}
	}

	public final Javascript_identifier_expressionContext javascript_identifier_expression() throws RecognitionException {
		Javascript_identifier_expressionContext _localctx = new Javascript_identifier_expressionContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_javascript_identifier_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2139);
			((Javascript_identifier_expressionContext)_localctx).name = javascript_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Javascript_literal_expressionContext extends ParserRuleContext {
		public Javascript_literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_literal_expression; }
	 
		public Javascript_literal_expressionContext() { }
		public void copyFrom(Javascript_literal_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavascriptIntegerLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode INTEGER_LITERAL() { return getToken(OParser.INTEGER_LITERAL, 0); }
		public JavascriptIntegerLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptIntegerLiteral(this);
		}
	}
	public static class JavascriptBooleanLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode BOOLEAN_LITERAL() { return getToken(OParser.BOOLEAN_LITERAL, 0); }
		public JavascriptBooleanLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptBooleanLiteral(this);
		}
	}
	public static class JavascriptCharacterLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(OParser.CHAR_LITERAL, 0); }
		public JavascriptCharacterLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptCharacterLiteral(this);
		}
	}
	public static class JavascriptTextLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public JavascriptTextLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptTextLiteral(this);
		}
	}
	public static class JavascriptDecimalLiteralContext extends Javascript_literal_expressionContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(OParser.DECIMAL_LITERAL, 0); }
		public JavascriptDecimalLiteralContext(Javascript_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascriptDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascriptDecimalLiteral(this);
		}
	}

	public final Javascript_literal_expressionContext javascript_literal_expression() throws RecognitionException {
		Javascript_literal_expressionContext _localctx = new Javascript_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_javascript_literal_expression);
		try {
			setState(2146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavascriptIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2141);
				((JavascriptIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavascriptDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2142);
				((JavascriptDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavascriptTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2143);
				((JavascriptTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavascriptBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2144);
				((JavascriptBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavascriptCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2145);
				((JavascriptCharacterLiteralContext)_localctx).t = match(CHAR_LITERAL);
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

	public static class Javascript_identifierContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(OParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(OParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(OParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(OParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(OParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(OParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(OParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(OParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(OParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(OParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(OParser.PERIOD, 0); }
		public TerminalNode VERSION() { return getToken(OParser.VERSION, 0); }
		public TerminalNode UUID() { return getToken(OParser.UUID, 0); }
		public TerminalNode HTML() { return getToken(OParser.HTML, 0); }
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(OParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(OParser.TEST, 0); }
		public TerminalNode SELF() { return getToken(OParser.SELF, 0); }
		public TerminalNode NONE() { return getToken(OParser.NONE, 0); }
		public TerminalNode NULL() { return getToken(OParser.NULL, 0); }
		public Javascript_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javascript_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavascript_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavascript_identifier(this);
		}
	}

	public final Javascript_identifierContext javascript_identifier() throws RecognitionException {
		Javascript_identifierContext _localctx = new Javascript_identifierContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_javascript_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2148);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BOOLEAN - 47)) | (1L << (CHARACTER - 47)) | (1L << (TEXT - 47)) | (1L << (INTEGER - 47)) | (1L << (DECIMAL - 47)) | (1L << (DATE - 47)) | (1L << (TIME - 47)) | (1L << (DATETIME - 47)) | (1L << (PERIOD - 47)) | (1L << (VERSION - 47)) | (1L << (UUID - 47)) | (1L << (HTML - 47)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (NONE - 119)) | (1L << (NULL - 119)) | (1L << (READ - 119)) | (1L << (SELF - 119)) | (1L << (TEST - 119)) | (1L << (WRITE - 119)) | (1L << (SYMBOL_IDENTIFIER - 119)) | (1L << (TYPE_IDENTIFIER - 119)) | (1L << (VARIABLE_IDENTIFIER - 119)) | (1L << (DOLLAR_IDENTIFIER - 119)))) != 0)) ) {
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

	public static class Python_statementContext extends ParserRuleContext {
		public Python_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_statement; }
	 
		public Python_statementContext() { }
		public void copyFrom(Python_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonStatementContext extends Python_statementContext {
		public Python_expressionContext exp;
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonStatementContext(Python_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonStatement(this);
		}
	}
	public static class PythonReturnStatementContext extends Python_statementContext {
		public Python_expressionContext exp;
		public TerminalNode RETURN() { return getToken(OParser.RETURN, 0); }
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonReturnStatementContext(Python_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonReturnStatement(this);
		}
	}

	public final Python_statementContext python_statement() throws RecognitionException {
		Python_statementContext _localctx = new Python_statementContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_python_statement);
		try {
			setState(2153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new PythonReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2150);
				match(RETURN);
				setState(2151);
				((PythonReturnStatementContext)_localctx).exp = python_expression(0);
				}
				break;
			case LPAR:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case UUID:
			case HTML:
			case NONE:
			case NULL:
			case READ:
			case SELF:
			case TEST:
			case THIS:
			case WRITE:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
			case DOLLAR_IDENTIFIER:
			case TEXT_LITERAL:
			case INTEGER_LITERAL:
			case DECIMAL_LITERAL:
				_localctx = new PythonStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2152);
				((PythonStatementContext)_localctx).exp = python_expression(0);
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

	public static class Python_expressionContext extends ParserRuleContext {
		public Python_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_expression; }
	 
		public Python_expressionContext() { }
		public void copyFrom(Python_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonSelectorExpressionContext extends Python_expressionContext {
		public Python_expressionContext parent;
		public Python_selector_expressionContext child;
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public Python_selector_expressionContext python_selector_expression() {
			return getRuleContext(Python_selector_expressionContext.class,0);
		}
		public PythonSelectorExpressionContext(Python_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonSelectorExpression(this);
		}
	}
	public static class PythonPrimaryExpressionContext extends Python_expressionContext {
		public Python_primary_expressionContext exp;
		public Python_primary_expressionContext python_primary_expression() {
			return getRuleContext(Python_primary_expressionContext.class,0);
		}
		public PythonPrimaryExpressionContext(Python_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonPrimaryExpression(this);
		}
	}

	public final Python_expressionContext python_expression() throws RecognitionException {
		return python_expression(0);
	}

	private Python_expressionContext python_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Python_expressionContext _localctx = new Python_expressionContext(_ctx, _parentState);
		Python_expressionContext _prevctx = _localctx;
		int _startState = 360;
		enterRecursionRule(_localctx, 360, RULE_python_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2156);
			((PythonPrimaryExpressionContext)_localctx).exp = python_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonSelectorExpressionContext(new Python_expressionContext(_parentctx, _parentState));
					((PythonSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_expression);
					setState(2158);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2159);
					((PythonSelectorExpressionContext)_localctx).child = python_selector_expression();
					}
					} 
				}
				setState(2164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
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

	public static class Python_primary_expressionContext extends ParserRuleContext {
		public Python_primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_primary_expression; }
	 
		public Python_primary_expressionContext() { }
		public void copyFrom(Python_primary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonParenthesisExpressionContext extends Python_primary_expressionContext {
		public Python_parenthesis_expressionContext exp;
		public Python_parenthesis_expressionContext python_parenthesis_expression() {
			return getRuleContext(Python_parenthesis_expressionContext.class,0);
		}
		public PythonParenthesisExpressionContext(Python_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonParenthesisExpression(this);
		}
	}
	public static class PythonIdentifierExpressionContext extends Python_primary_expressionContext {
		public Python_identifier_expressionContext exp;
		public Python_identifier_expressionContext python_identifier_expression() {
			return getRuleContext(Python_identifier_expressionContext.class,0);
		}
		public PythonIdentifierExpressionContext(Python_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonIdentifierExpression(this);
		}
	}
	public static class PythonSelfExpressionContext extends Python_primary_expressionContext {
		public Python_self_expressionContext exp;
		public Python_self_expressionContext python_self_expression() {
			return getRuleContext(Python_self_expressionContext.class,0);
		}
		public PythonSelfExpressionContext(Python_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonSelfExpression(this);
		}
	}
	public static class PythonLiteralExpressionContext extends Python_primary_expressionContext {
		public Python_literal_expressionContext exp;
		public Python_literal_expressionContext python_literal_expression() {
			return getRuleContext(Python_literal_expressionContext.class,0);
		}
		public PythonLiteralExpressionContext(Python_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonLiteralExpression(this);
		}
	}
	public static class PythonGlobalMethodExpressionContext extends Python_primary_expressionContext {
		public Python_method_expressionContext exp;
		public Python_method_expressionContext python_method_expression() {
			return getRuleContext(Python_method_expressionContext.class,0);
		}
		public PythonGlobalMethodExpressionContext(Python_primary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonGlobalMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonGlobalMethodExpression(this);
		}
	}

	public final Python_primary_expressionContext python_primary_expression() throws RecognitionException {
		Python_primary_expressionContext _localctx = new Python_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_python_primary_expression);
		try {
			setState(2170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				_localctx = new PythonSelfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2165);
				((PythonSelfExpressionContext)_localctx).exp = python_self_expression();
				}
				break;
			case 2:
				_localctx = new PythonParenthesisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2166);
				((PythonParenthesisExpressionContext)_localctx).exp = python_parenthesis_expression();
				}
				break;
			case 3:
				_localctx = new PythonIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2167);
				((PythonIdentifierExpressionContext)_localctx).exp = python_identifier_expression(0);
				}
				break;
			case 4:
				_localctx = new PythonLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2168);
				((PythonLiteralExpressionContext)_localctx).exp = python_literal_expression();
				}
				break;
			case 5:
				_localctx = new PythonGlobalMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2169);
				((PythonGlobalMethodExpressionContext)_localctx).exp = python_method_expression();
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

	public static class Python_self_expressionContext extends ParserRuleContext {
		public This_expressionContext this_expression() {
			return getRuleContext(This_expressionContext.class,0);
		}
		public Python_self_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_self_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython_self_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython_self_expression(this);
		}
	}

	public final Python_self_expressionContext python_self_expression() throws RecognitionException {
		Python_self_expressionContext _localctx = new Python_self_expressionContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_python_self_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2172);
			this_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_selector_expressionContext extends ParserRuleContext {
		public Python_selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_selector_expression; }
	 
		public Python_selector_expressionContext() { }
		public void copyFrom(Python_selector_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonMethodExpressionContext extends Python_selector_expressionContext {
		public Python_method_expressionContext exp;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Python_method_expressionContext python_method_expression() {
			return getRuleContext(Python_method_expressionContext.class,0);
		}
		public PythonMethodExpressionContext(Python_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonMethodExpression(this);
		}
	}
	public static class PythonItemExpressionContext extends Python_selector_expressionContext {
		public Python_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonItemExpressionContext(Python_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonItemExpression(this);
		}
	}

	public final Python_selector_expressionContext python_selector_expression() throws RecognitionException {
		Python_selector_expressionContext _localctx = new Python_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_python_selector_expression);
		try {
			setState(2180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new PythonMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2174);
				match(DOT);
				setState(2175);
				((PythonMethodExpressionContext)_localctx).exp = python_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new PythonItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2176);
				match(LBRAK);
				setState(2177);
				((PythonItemExpressionContext)_localctx).exp = python_expression(0);
				setState(2178);
				match(RBRAK);
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

	public static class Python_method_expressionContext extends ParserRuleContext {
		public Python_identifierContext name;
		public Python_argument_listContext args;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Python_identifierContext python_identifier() {
			return getRuleContext(Python_identifierContext.class,0);
		}
		public Python_argument_listContext python_argument_list() {
			return getRuleContext(Python_argument_listContext.class,0);
		}
		public Python_method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_method_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython_method_expression(this);
		}
	}

	public final Python_method_expressionContext python_method_expression() throws RecognitionException {
		Python_method_expressionContext _localctx = new Python_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_python_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2182);
			((Python_method_expressionContext)_localctx).name = python_identifier();
			setState(2183);
			match(LPAR);
			setState(2185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (LPAR - 16)) | (1L << (BOOLEAN - 16)) | (1L << (CHARACTER - 16)) | (1L << (TEXT - 16)) | (1L << (INTEGER - 16)) | (1L << (DECIMAL - 16)) | (1L << (DATE - 16)) | (1L << (TIME - 16)) | (1L << (DATETIME - 16)) | (1L << (PERIOD - 16)) | (1L << (VERSION - 16)) | (1L << (UUID - 16)) | (1L << (HTML - 16)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (NONE - 119)) | (1L << (NULL - 119)) | (1L << (READ - 119)) | (1L << (SELF - 119)) | (1L << (TEST - 119)) | (1L << (THIS - 119)) | (1L << (WRITE - 119)) | (1L << (BOOLEAN_LITERAL - 119)) | (1L << (CHAR_LITERAL - 119)) | (1L << (SYMBOL_IDENTIFIER - 119)) | (1L << (TYPE_IDENTIFIER - 119)) | (1L << (VARIABLE_IDENTIFIER - 119)) | (1L << (DOLLAR_IDENTIFIER - 119)) | (1L << (TEXT_LITERAL - 119)) | (1L << (INTEGER_LITERAL - 119)) | (1L << (DECIMAL_LITERAL - 119)))) != 0)) {
				{
				setState(2184);
				((Python_method_expressionContext)_localctx).args = python_argument_list();
				}
			}

			setState(2187);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_argument_listContext extends ParserRuleContext {
		public Python_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_argument_list; }
	 
		public Python_argument_listContext() { }
		public void copyFrom(Python_argument_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonOrdinalOnlyArgumentListContext extends Python_argument_listContext {
		public Python_ordinal_argument_listContext ordinal;
		public Python_ordinal_argument_listContext python_ordinal_argument_list() {
			return getRuleContext(Python_ordinal_argument_listContext.class,0);
		}
		public PythonOrdinalOnlyArgumentListContext(Python_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonOrdinalOnlyArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonOrdinalOnlyArgumentList(this);
		}
	}
	public static class PythonNamedOnlyArgumentListContext extends Python_argument_listContext {
		public Python_named_argument_listContext named;
		public Python_named_argument_listContext python_named_argument_list() {
			return getRuleContext(Python_named_argument_listContext.class,0);
		}
		public PythonNamedOnlyArgumentListContext(Python_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonNamedOnlyArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonNamedOnlyArgumentList(this);
		}
	}
	public static class PythonArgumentListContext extends Python_argument_listContext {
		public Python_ordinal_argument_listContext ordinal;
		public Python_named_argument_listContext named;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Python_ordinal_argument_listContext python_ordinal_argument_list() {
			return getRuleContext(Python_ordinal_argument_listContext.class,0);
		}
		public Python_named_argument_listContext python_named_argument_list() {
			return getRuleContext(Python_named_argument_listContext.class,0);
		}
		public PythonArgumentListContext(Python_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonArgumentList(this);
		}
	}

	public final Python_argument_listContext python_argument_list() throws RecognitionException {
		Python_argument_listContext _localctx = new Python_argument_listContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_python_argument_list);
		try {
			setState(2195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				_localctx = new PythonOrdinalOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2189);
				((PythonOrdinalOnlyArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				}
				break;
			case 2:
				_localctx = new PythonNamedOnlyArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2190);
				((PythonNamedOnlyArgumentListContext)_localctx).named = python_named_argument_list(0);
				}
				break;
			case 3:
				_localctx = new PythonArgumentListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2191);
				((PythonArgumentListContext)_localctx).ordinal = python_ordinal_argument_list(0);
				setState(2192);
				match(COMMA);
				setState(2193);
				((PythonArgumentListContext)_localctx).named = python_named_argument_list(0);
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

	public static class Python_ordinal_argument_listContext extends ParserRuleContext {
		public Python_ordinal_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_ordinal_argument_list; }
	 
		public Python_ordinal_argument_listContext() { }
		public void copyFrom(Python_ordinal_argument_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonOrdinalArgumentListContext extends Python_ordinal_argument_listContext {
		public Python_expressionContext item;
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonOrdinalArgumentListContext(Python_ordinal_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonOrdinalArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonOrdinalArgumentList(this);
		}
	}
	public static class PythonOrdinalArgumentListItemContext extends Python_ordinal_argument_listContext {
		public Python_ordinal_argument_listContext items;
		public Python_expressionContext item;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Python_ordinal_argument_listContext python_ordinal_argument_list() {
			return getRuleContext(Python_ordinal_argument_listContext.class,0);
		}
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonOrdinalArgumentListItemContext(Python_ordinal_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonOrdinalArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonOrdinalArgumentListItem(this);
		}
	}

	public final Python_ordinal_argument_listContext python_ordinal_argument_list() throws RecognitionException {
		return python_ordinal_argument_list(0);
	}

	private Python_ordinal_argument_listContext python_ordinal_argument_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Python_ordinal_argument_listContext _localctx = new Python_ordinal_argument_listContext(_ctx, _parentState);
		Python_ordinal_argument_listContext _prevctx = _localctx;
		int _startState = 372;
		enterRecursionRule(_localctx, 372, RULE_python_ordinal_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonOrdinalArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2198);
			((PythonOrdinalArgumentListContext)_localctx).item = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonOrdinalArgumentListItemContext(new Python_ordinal_argument_listContext(_parentctx, _parentState));
					((PythonOrdinalArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_ordinal_argument_list);
					setState(2200);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2201);
					match(COMMA);
					setState(2202);
					((PythonOrdinalArgumentListItemContext)_localctx).item = python_expression(0);
					}
					} 
				}
				setState(2207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
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

	public static class Python_named_argument_listContext extends ParserRuleContext {
		public Python_named_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_named_argument_list; }
	 
		public Python_named_argument_listContext() { }
		public void copyFrom(Python_named_argument_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonNamedArgumentListContext extends Python_named_argument_listContext {
		public Python_identifierContext name;
		public Python_expressionContext exp;
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
		public Python_identifierContext python_identifier() {
			return getRuleContext(Python_identifierContext.class,0);
		}
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonNamedArgumentListContext(Python_named_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonNamedArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonNamedArgumentList(this);
		}
	}
	public static class PythonNamedArgumentListItemContext extends Python_named_argument_listContext {
		public Python_named_argument_listContext items;
		public Python_identifierContext name;
		public Python_expressionContext exp;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
		public Python_named_argument_listContext python_named_argument_list() {
			return getRuleContext(Python_named_argument_listContext.class,0);
		}
		public Python_identifierContext python_identifier() {
			return getRuleContext(Python_identifierContext.class,0);
		}
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public PythonNamedArgumentListItemContext(Python_named_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonNamedArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonNamedArgumentListItem(this);
		}
	}

	public final Python_named_argument_listContext python_named_argument_list() throws RecognitionException {
		return python_named_argument_list(0);
	}

	private Python_named_argument_listContext python_named_argument_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Python_named_argument_listContext _localctx = new Python_named_argument_listContext(_ctx, _parentState);
		Python_named_argument_listContext _prevctx = _localctx;
		int _startState = 374;
		enterRecursionRule(_localctx, 374, RULE_python_named_argument_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PythonNamedArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2209);
			((PythonNamedArgumentListContext)_localctx).name = python_identifier();
			setState(2210);
			match(EQ);
			setState(2211);
			((PythonNamedArgumentListContext)_localctx).exp = python_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonNamedArgumentListItemContext(new Python_named_argument_listContext(_parentctx, _parentState));
					((PythonNamedArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_named_argument_list);
					setState(2213);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2214);
					match(COMMA);
					setState(2215);
					((PythonNamedArgumentListItemContext)_localctx).name = python_identifier();
					setState(2216);
					match(EQ);
					setState(2217);
					((PythonNamedArgumentListItemContext)_localctx).exp = python_expression(0);
					}
					} 
				}
				setState(2223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
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

	public static class Python_parenthesis_expressionContext extends ParserRuleContext {
		public Python_expressionContext exp;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Python_expressionContext python_expression() {
			return getRuleContext(Python_expressionContext.class,0);
		}
		public Python_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython_parenthesis_expression(this);
		}
	}

	public final Python_parenthesis_expressionContext python_parenthesis_expression() throws RecognitionException {
		Python_parenthesis_expressionContext _localctx = new Python_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_python_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2224);
			match(LPAR);
			setState(2225);
			((Python_parenthesis_expressionContext)_localctx).exp = python_expression(0);
			setState(2226);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Python_identifier_expressionContext extends ParserRuleContext {
		public Python_identifier_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_identifier_expression; }
	 
		public Python_identifier_expressionContext() { }
		public void copyFrom(Python_identifier_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonChildIdentifierContext extends Python_identifier_expressionContext {
		public Python_identifier_expressionContext parent;
		public Python_identifierContext name;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Python_identifier_expressionContext python_identifier_expression() {
			return getRuleContext(Python_identifier_expressionContext.class,0);
		}
		public Python_identifierContext python_identifier() {
			return getRuleContext(Python_identifierContext.class,0);
		}
		public PythonChildIdentifierContext(Python_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonChildIdentifier(this);
		}
	}
	public static class PythonPromptoIdentifierContext extends Python_identifier_expressionContext {
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(OParser.DOLLAR_IDENTIFIER, 0); }
		public PythonPromptoIdentifierContext(Python_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonPromptoIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonPromptoIdentifier(this);
		}
	}
	public static class PythonIdentifierContext extends Python_identifier_expressionContext {
		public Python_identifierContext name;
		public Python_identifierContext python_identifier() {
			return getRuleContext(Python_identifierContext.class,0);
		}
		public PythonIdentifierContext(Python_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonIdentifier(this);
		}
	}

	public final Python_identifier_expressionContext python_identifier_expression() throws RecognitionException {
		return python_identifier_expression(0);
	}

	private Python_identifier_expressionContext python_identifier_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Python_identifier_expressionContext _localctx = new Python_identifier_expressionContext(_ctx, _parentState);
		Python_identifier_expressionContext _prevctx = _localctx;
		int _startState = 378;
		enterRecursionRule(_localctx, 378, RULE_python_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new PythonPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2229);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case UUID:
			case HTML:
			case NONE:
			case NULL:
			case READ:
			case TEST:
			case THIS:
			case WRITE:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				{
				_localctx = new PythonIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2230);
				((PythonIdentifierContext)_localctx).name = python_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PythonChildIdentifierContext(new Python_identifier_expressionContext(_parentctx, _parentState));
					((PythonChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_python_identifier_expression);
					setState(2233);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2234);
					match(DOT);
					setState(2235);
					((PythonChildIdentifierContext)_localctx).name = python_identifier();
					}
					} 
				}
				setState(2240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
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

	public static class Python_literal_expressionContext extends ParserRuleContext {
		public Python_literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_literal_expression; }
	 
		public Python_literal_expressionContext() { }
		public void copyFrom(Python_literal_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PythonIntegerLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode INTEGER_LITERAL() { return getToken(OParser.INTEGER_LITERAL, 0); }
		public PythonIntegerLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonIntegerLiteral(this);
		}
	}
	public static class PythonBooleanLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode BOOLEAN_LITERAL() { return getToken(OParser.BOOLEAN_LITERAL, 0); }
		public PythonBooleanLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonBooleanLiteral(this);
		}
	}
	public static class PythonCharacterLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(OParser.CHAR_LITERAL, 0); }
		public PythonCharacterLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonCharacterLiteral(this);
		}
	}
	public static class PythonTextLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public PythonTextLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonTextLiteral(this);
		}
	}
	public static class PythonDecimalLiteralContext extends Python_literal_expressionContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(OParser.DECIMAL_LITERAL, 0); }
		public PythonDecimalLiteralContext(Python_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPythonDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPythonDecimalLiteral(this);
		}
	}

	public final Python_literal_expressionContext python_literal_expression() throws RecognitionException {
		Python_literal_expressionContext _localctx = new Python_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_python_literal_expression);
		try {
			setState(2246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new PythonIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2241);
				((PythonIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new PythonDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2242);
				((PythonDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new PythonTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2243);
				((PythonTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new PythonBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2244);
				((PythonBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new PythonCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2245);
				((PythonCharacterLiteralContext)_localctx).t = match(CHAR_LITERAL);
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

	public static class Python_identifierContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(OParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(OParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(OParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(OParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(OParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(OParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(OParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(OParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(OParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(OParser.PERIOD, 0); }
		public TerminalNode VERSION() { return getToken(OParser.VERSION, 0); }
		public TerminalNode UUID() { return getToken(OParser.UUID, 0); }
		public TerminalNode HTML() { return getToken(OParser.HTML, 0); }
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(OParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(OParser.TEST, 0); }
		public TerminalNode THIS() { return getToken(OParser.THIS, 0); }
		public TerminalNode NONE() { return getToken(OParser.NONE, 0); }
		public TerminalNode NULL() { return getToken(OParser.NULL, 0); }
		public Python_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterPython_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitPython_identifier(this);
		}
	}

	public final Python_identifierContext python_identifier() throws RecognitionException {
		Python_identifierContext _localctx = new Python_identifierContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_python_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2248);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BOOLEAN - 47)) | (1L << (CHARACTER - 47)) | (1L << (TEXT - 47)) | (1L << (INTEGER - 47)) | (1L << (DECIMAL - 47)) | (1L << (DATE - 47)) | (1L << (TIME - 47)) | (1L << (DATETIME - 47)) | (1L << (PERIOD - 47)) | (1L << (VERSION - 47)) | (1L << (UUID - 47)) | (1L << (HTML - 47)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (NONE - 119)) | (1L << (NULL - 119)) | (1L << (READ - 119)) | (1L << (TEST - 119)) | (1L << (THIS - 119)) | (1L << (WRITE - 119)) | (1L << (SYMBOL_IDENTIFIER - 119)) | (1L << (TYPE_IDENTIFIER - 119)) | (1L << (VARIABLE_IDENTIFIER - 119)))) != 0)) ) {
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

	public static class Java_statementContext extends ParserRuleContext {
		public Java_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_statement; }
	 
		public Java_statementContext() { }
		public void copyFrom(Java_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaReturnStatementContext extends Java_statementContext {
		public Java_expressionContext exp;
		public TerminalNode RETURN() { return getToken(OParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaReturnStatementContext(Java_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaReturnStatement(this);
		}
	}
	public static class JavaStatementContext extends Java_statementContext {
		public Java_expressionContext exp;
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaStatementContext(Java_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaStatement(this);
		}
	}

	public final Java_statementContext java_statement() throws RecognitionException {
		Java_statementContext _localctx = new Java_statementContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_java_statement);
		try {
			setState(2257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new JavaReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2250);
				match(RETURN);
				setState(2251);
				((JavaReturnStatementContext)_localctx).exp = java_expression(0);
				setState(2252);
				match(SEMI);
				}
				break;
			case LPAR:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case UUID:
			case HTML:
			case NONE:
			case NULL:
			case READ:
			case SELF:
			case TEST:
			case THIS:
			case WRITE:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
			case NATIVE_IDENTIFIER:
			case DOLLAR_IDENTIFIER:
			case TEXT_LITERAL:
			case INTEGER_LITERAL:
			case DECIMAL_LITERAL:
				_localctx = new JavaStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2254);
				((JavaStatementContext)_localctx).exp = java_expression(0);
				setState(2255);
				match(SEMI);
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

	public static class Java_expressionContext extends ParserRuleContext {
		public Java_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_expression; }
	 
		public Java_expressionContext() { }
		public void copyFrom(Java_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaSelectorExpressionContext extends Java_expressionContext {
		public Java_expressionContext parent;
		public Java_selector_expressionContext child;
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public Java_selector_expressionContext java_selector_expression() {
			return getRuleContext(Java_selector_expressionContext.class,0);
		}
		public JavaSelectorExpressionContext(Java_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaSelectorExpression(this);
		}
	}
	public static class JavaPrimaryExpressionContext extends Java_expressionContext {
		public Java_primary_expressionContext exp;
		public Java_primary_expressionContext java_primary_expression() {
			return getRuleContext(Java_primary_expressionContext.class,0);
		}
		public JavaPrimaryExpressionContext(Java_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaPrimaryExpression(this);
		}
	}

	public final Java_expressionContext java_expression() throws RecognitionException {
		return java_expression(0);
	}

	private Java_expressionContext java_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Java_expressionContext _localctx = new Java_expressionContext(_ctx, _parentState);
		Java_expressionContext _prevctx = _localctx;
		int _startState = 386;
		enterRecursionRule(_localctx, 386, RULE_java_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2260);
			((JavaPrimaryExpressionContext)_localctx).exp = java_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaSelectorExpressionContext(new Java_expressionContext(_parentctx, _parentState));
					((JavaSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_expression);
					setState(2262);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2263);
					((JavaSelectorExpressionContext)_localctx).child = java_selector_expression();
					}
					} 
				}
				setState(2268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
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

	public static class Java_primary_expressionContext extends ParserRuleContext {
		public Java_this_expressionContext java_this_expression() {
			return getRuleContext(Java_this_expressionContext.class,0);
		}
		public Java_new_expressionContext java_new_expression() {
			return getRuleContext(Java_new_expressionContext.class,0);
		}
		public Java_parenthesis_expressionContext java_parenthesis_expression() {
			return getRuleContext(Java_parenthesis_expressionContext.class,0);
		}
		public Java_identifier_expressionContext java_identifier_expression() {
			return getRuleContext(Java_identifier_expressionContext.class,0);
		}
		public Java_literal_expressionContext java_literal_expression() {
			return getRuleContext(Java_literal_expressionContext.class,0);
		}
		public Java_primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJava_primary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJava_primary_expression(this);
		}
	}

	public final Java_primary_expressionContext java_primary_expression() throws RecognitionException {
		Java_primary_expressionContext _localctx = new Java_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_java_primary_expression);
		try {
			setState(2274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2269);
				java_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2270);
				java_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2271);
				java_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2272);
				java_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2273);
				java_literal_expression();
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

	public static class Java_this_expressionContext extends ParserRuleContext {
		public This_expressionContext this_expression() {
			return getRuleContext(This_expressionContext.class,0);
		}
		public Java_this_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_this_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJava_this_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJava_this_expression(this);
		}
	}

	public final Java_this_expressionContext java_this_expression() throws RecognitionException {
		Java_this_expressionContext _localctx = new Java_this_expressionContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_java_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2276);
			this_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_new_expressionContext extends ParserRuleContext {
		public New_tokenContext new_token() {
			return getRuleContext(New_tokenContext.class,0);
		}
		public Java_method_expressionContext java_method_expression() {
			return getRuleContext(Java_method_expressionContext.class,0);
		}
		public Java_new_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_new_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJava_new_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJava_new_expression(this);
		}
	}

	public final Java_new_expressionContext java_new_expression() throws RecognitionException {
		Java_new_expressionContext _localctx = new Java_new_expressionContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_java_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2278);
			new_token();
			setState(2279);
			java_method_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_selector_expressionContext extends ParserRuleContext {
		public Java_selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_selector_expression; }
	 
		public Java_selector_expressionContext() { }
		public void copyFrom(Java_selector_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaItemExpressionContext extends Java_selector_expressionContext {
		public Java_item_expressionContext exp;
		public Java_item_expressionContext java_item_expression() {
			return getRuleContext(Java_item_expressionContext.class,0);
		}
		public JavaItemExpressionContext(Java_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaItemExpression(this);
		}
	}
	public static class JavaMethodExpressionContext extends Java_selector_expressionContext {
		public Java_method_expressionContext exp;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Java_method_expressionContext java_method_expression() {
			return getRuleContext(Java_method_expressionContext.class,0);
		}
		public JavaMethodExpressionContext(Java_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaMethodExpression(this);
		}
	}

	public final Java_selector_expressionContext java_selector_expression() throws RecognitionException {
		Java_selector_expressionContext _localctx = new Java_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_java_selector_expression);
		try {
			setState(2284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new JavaMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2281);
				match(DOT);
				setState(2282);
				((JavaMethodExpressionContext)_localctx).exp = java_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new JavaItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2283);
				((JavaItemExpressionContext)_localctx).exp = java_item_expression();
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

	public static class Java_method_expressionContext extends ParserRuleContext {
		public Java_identifierContext name;
		public Java_argumentsContext args;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Java_identifierContext java_identifier() {
			return getRuleContext(Java_identifierContext.class,0);
		}
		public Java_argumentsContext java_arguments() {
			return getRuleContext(Java_argumentsContext.class,0);
		}
		public Java_method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_method_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJava_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJava_method_expression(this);
		}
	}

	public final Java_method_expressionContext java_method_expression() throws RecognitionException {
		Java_method_expressionContext _localctx = new Java_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_java_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2286);
			((Java_method_expressionContext)_localctx).name = java_identifier();
			setState(2287);
			match(LPAR);
			setState(2289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (LPAR - 16)) | (1L << (BOOLEAN - 16)) | (1L << (CHARACTER - 16)) | (1L << (TEXT - 16)) | (1L << (INTEGER - 16)) | (1L << (DECIMAL - 16)) | (1L << (DATE - 16)) | (1L << (TIME - 16)) | (1L << (DATETIME - 16)) | (1L << (PERIOD - 16)) | (1L << (VERSION - 16)) | (1L << (UUID - 16)) | (1L << (HTML - 16)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (NONE - 119)) | (1L << (NULL - 119)) | (1L << (READ - 119)) | (1L << (SELF - 119)) | (1L << (TEST - 119)) | (1L << (THIS - 119)) | (1L << (WRITE - 119)) | (1L << (BOOLEAN_LITERAL - 119)) | (1L << (CHAR_LITERAL - 119)) | (1L << (SYMBOL_IDENTIFIER - 119)) | (1L << (TYPE_IDENTIFIER - 119)) | (1L << (VARIABLE_IDENTIFIER - 119)) | (1L << (NATIVE_IDENTIFIER - 119)) | (1L << (DOLLAR_IDENTIFIER - 119)) | (1L << (TEXT_LITERAL - 119)) | (1L << (INTEGER_LITERAL - 119)) | (1L << (DECIMAL_LITERAL - 119)))) != 0)) {
				{
				setState(2288);
				((Java_method_expressionContext)_localctx).args = java_arguments(0);
				}
			}

			setState(2291);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_argumentsContext extends ParserRuleContext {
		public Java_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_arguments; }
	 
		public Java_argumentsContext() { }
		public void copyFrom(Java_argumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaArgumentListItemContext extends Java_argumentsContext {
		public Java_argumentsContext items;
		public Java_expressionContext item;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Java_argumentsContext java_arguments() {
			return getRuleContext(Java_argumentsContext.class,0);
		}
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaArgumentListItemContext(Java_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaArgumentListItem(this);
		}
	}
	public static class JavaArgumentListContext extends Java_argumentsContext {
		public Java_expressionContext item;
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public JavaArgumentListContext(Java_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaArgumentList(this);
		}
	}

	public final Java_argumentsContext java_arguments() throws RecognitionException {
		return java_arguments(0);
	}

	private Java_argumentsContext java_arguments(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Java_argumentsContext _localctx = new Java_argumentsContext(_ctx, _parentState);
		Java_argumentsContext _prevctx = _localctx;
		int _startState = 398;
		enterRecursionRule(_localctx, 398, RULE_java_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2294);
			((JavaArgumentListContext)_localctx).item = java_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaArgumentListItemContext(new Java_argumentsContext(_parentctx, _parentState));
					((JavaArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_arguments);
					setState(2296);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2297);
					match(COMMA);
					setState(2298);
					((JavaArgumentListItemContext)_localctx).item = java_expression(0);
					}
					} 
				}
				setState(2303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
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

	public static class Java_item_expressionContext extends ParserRuleContext {
		public Java_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public Java_item_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_item_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJava_item_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJava_item_expression(this);
		}
	}

	public final Java_item_expressionContext java_item_expression() throws RecognitionException {
		Java_item_expressionContext _localctx = new Java_item_expressionContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_java_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2304);
			match(LBRAK);
			setState(2305);
			((Java_item_expressionContext)_localctx).exp = java_expression(0);
			setState(2306);
			match(RBRAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_parenthesis_expressionContext extends ParserRuleContext {
		public Java_expressionContext exp;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Java_expressionContext java_expression() {
			return getRuleContext(Java_expressionContext.class,0);
		}
		public Java_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJava_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJava_parenthesis_expression(this);
		}
	}

	public final Java_parenthesis_expressionContext java_parenthesis_expression() throws RecognitionException {
		Java_parenthesis_expressionContext _localctx = new Java_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_java_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2308);
			match(LPAR);
			setState(2309);
			((Java_parenthesis_expressionContext)_localctx).exp = java_expression(0);
			setState(2310);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_identifier_expressionContext extends ParserRuleContext {
		public Java_identifier_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_identifier_expression; }
	 
		public Java_identifier_expressionContext() { }
		public void copyFrom(Java_identifier_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaIdentifierContext extends Java_identifier_expressionContext {
		public Java_identifierContext name;
		public Java_identifierContext java_identifier() {
			return getRuleContext(Java_identifierContext.class,0);
		}
		public JavaIdentifierContext(Java_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaIdentifier(this);
		}
	}
	public static class JavaChildIdentifierContext extends Java_identifier_expressionContext {
		public Java_identifier_expressionContext parent;
		public Java_identifierContext name;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Java_identifier_expressionContext java_identifier_expression() {
			return getRuleContext(Java_identifier_expressionContext.class,0);
		}
		public Java_identifierContext java_identifier() {
			return getRuleContext(Java_identifierContext.class,0);
		}
		public JavaChildIdentifierContext(Java_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaChildIdentifier(this);
		}
	}

	public final Java_identifier_expressionContext java_identifier_expression() throws RecognitionException {
		return java_identifier_expression(0);
	}

	private Java_identifier_expressionContext java_identifier_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Java_identifier_expressionContext _localctx = new Java_identifier_expressionContext(_ctx, _parentState);
		Java_identifier_expressionContext _prevctx = _localctx;
		int _startState = 404;
		enterRecursionRule(_localctx, 404, RULE_java_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2313);
			((JavaIdentifierContext)_localctx).name = java_identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildIdentifierContext(new Java_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_identifier_expression);
					setState(2315);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2316);
					match(DOT);
					setState(2317);
					((JavaChildIdentifierContext)_localctx).name = java_identifier();
					}
					} 
				}
				setState(2322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
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

	public static class Java_class_identifier_expressionContext extends ParserRuleContext {
		public Java_class_identifier_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_class_identifier_expression; }
	 
		public Java_class_identifier_expressionContext() { }
		public void copyFrom(Java_class_identifier_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaClassIdentifierContext extends Java_class_identifier_expressionContext {
		public Java_identifier_expressionContext klass;
		public Java_identifier_expressionContext java_identifier_expression() {
			return getRuleContext(Java_identifier_expressionContext.class,0);
		}
		public JavaClassIdentifierContext(Java_class_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaClassIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaClassIdentifier(this);
		}
	}
	public static class JavaChildClassIdentifierContext extends Java_class_identifier_expressionContext {
		public Java_class_identifier_expressionContext parent;
		public Token name;
		public Java_class_identifier_expressionContext java_class_identifier_expression() {
			return getRuleContext(Java_class_identifier_expressionContext.class,0);
		}
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(OParser.DOLLAR_IDENTIFIER, 0); }
		public JavaChildClassIdentifierContext(Java_class_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaChildClassIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaChildClassIdentifier(this);
		}
	}

	public final Java_class_identifier_expressionContext java_class_identifier_expression() throws RecognitionException {
		return java_class_identifier_expression(0);
	}

	private Java_class_identifier_expressionContext java_class_identifier_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Java_class_identifier_expressionContext _localctx = new Java_class_identifier_expressionContext(_ctx, _parentState);
		Java_class_identifier_expressionContext _prevctx = _localctx;
		int _startState = 406;
		enterRecursionRule(_localctx, 406, RULE_java_class_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new JavaClassIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2324);
			((JavaClassIdentifierContext)_localctx).klass = java_identifier_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JavaChildClassIdentifierContext(new Java_class_identifier_expressionContext(_parentctx, _parentState));
					((JavaChildClassIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_java_class_identifier_expression);
					setState(2326);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2327);
					((JavaChildClassIdentifierContext)_localctx).name = match(DOLLAR_IDENTIFIER);
					}
					} 
				}
				setState(2332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
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

	public static class Java_literal_expressionContext extends ParserRuleContext {
		public Java_literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_literal_expression; }
	 
		public Java_literal_expressionContext() { }
		public void copyFrom(Java_literal_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JavaBooleanLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode BOOLEAN_LITERAL() { return getToken(OParser.BOOLEAN_LITERAL, 0); }
		public JavaBooleanLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaBooleanLiteral(this);
		}
	}
	public static class JavaCharacterLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode CHAR_LITERAL() { return getToken(OParser.CHAR_LITERAL, 0); }
		public JavaCharacterLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaCharacterLiteral(this);
		}
	}
	public static class JavaIntegerLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode INTEGER_LITERAL() { return getToken(OParser.INTEGER_LITERAL, 0); }
		public JavaIntegerLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaIntegerLiteral(this);
		}
	}
	public static class JavaTextLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public JavaTextLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaTextLiteral(this);
		}
	}
	public static class JavaDecimalLiteralContext extends Java_literal_expressionContext {
		public Token t;
		public TerminalNode DECIMAL_LITERAL() { return getToken(OParser.DECIMAL_LITERAL, 0); }
		public JavaDecimalLiteralContext(Java_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJavaDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJavaDecimalLiteral(this);
		}
	}

	public final Java_literal_expressionContext java_literal_expression() throws RecognitionException {
		Java_literal_expressionContext _localctx = new Java_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_java_literal_expression);
		try {
			setState(2338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new JavaIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2333);
				((JavaIntegerLiteralContext)_localctx).t = match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new JavaDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2334);
				((JavaDecimalLiteralContext)_localctx).t = match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new JavaTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2335);
				((JavaTextLiteralContext)_localctx).t = match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new JavaBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2336);
				((JavaBooleanLiteralContext)_localctx).t = match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new JavaCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2337);
				((JavaCharacterLiteralContext)_localctx).t = match(CHAR_LITERAL);
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

	public static class Java_identifierContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(OParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode NATIVE_IDENTIFIER() { return getToken(OParser.NATIVE_IDENTIFIER, 0); }
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(OParser.DOLLAR_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(OParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(OParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(OParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(OParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(OParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(OParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(OParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(OParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(OParser.PERIOD, 0); }
		public TerminalNode VERSION() { return getToken(OParser.VERSION, 0); }
		public TerminalNode UUID() { return getToken(OParser.UUID, 0); }
		public TerminalNode HTML() { return getToken(OParser.HTML, 0); }
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(OParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(OParser.TEST, 0); }
		public TerminalNode SELF() { return getToken(OParser.SELF, 0); }
		public TerminalNode NONE() { return getToken(OParser.NONE, 0); }
		public TerminalNode NULL() { return getToken(OParser.NULL, 0); }
		public Java_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJava_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJava_identifier(this);
		}
	}

	public final Java_identifierContext java_identifier() throws RecognitionException {
		Java_identifierContext _localctx = new Java_identifierContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_java_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BOOLEAN - 47)) | (1L << (CHARACTER - 47)) | (1L << (TEXT - 47)) | (1L << (INTEGER - 47)) | (1L << (DECIMAL - 47)) | (1L << (DATE - 47)) | (1L << (TIME - 47)) | (1L << (DATETIME - 47)) | (1L << (PERIOD - 47)) | (1L << (VERSION - 47)) | (1L << (UUID - 47)) | (1L << (HTML - 47)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (NONE - 119)) | (1L << (NULL - 119)) | (1L << (READ - 119)) | (1L << (SELF - 119)) | (1L << (TEST - 119)) | (1L << (WRITE - 119)) | (1L << (SYMBOL_IDENTIFIER - 119)) | (1L << (TYPE_IDENTIFIER - 119)) | (1L << (VARIABLE_IDENTIFIER - 119)) | (1L << (NATIVE_IDENTIFIER - 119)) | (1L << (DOLLAR_IDENTIFIER - 119)))) != 0)) ) {
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

	public static class Csharp_statementContext extends ParserRuleContext {
		public Csharp_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_statement; }
	 
		public Csharp_statementContext() { }
		public void copyFrom(Csharp_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSharpReturnStatementContext extends Csharp_statementContext {
		public Csharp_expressionContext exp;
		public TerminalNode RETURN() { return getToken(OParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpReturnStatementContext(Csharp_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpReturnStatement(this);
		}
	}
	public static class CSharpStatementContext extends Csharp_statementContext {
		public Csharp_expressionContext exp;
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpStatementContext(Csharp_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpStatement(this);
		}
	}

	public final Csharp_statementContext csharp_statement() throws RecognitionException {
		Csharp_statementContext _localctx = new Csharp_statementContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_csharp_statement);
		try {
			setState(2349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new CSharpReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2342);
				match(RETURN);
				setState(2343);
				((CSharpReturnStatementContext)_localctx).exp = csharp_expression(0);
				setState(2344);
				match(SEMI);
				}
				break;
			case LPAR:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case UUID:
			case HTML:
			case NONE:
			case NULL:
			case READ:
			case SELF:
			case TEST:
			case THIS:
			case WRITE:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
			case DOLLAR_IDENTIFIER:
			case TEXT_LITERAL:
			case INTEGER_LITERAL:
			case DECIMAL_LITERAL:
				_localctx = new CSharpStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2346);
				((CSharpStatementContext)_localctx).exp = csharp_expression(0);
				setState(2347);
				match(SEMI);
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

	public static class Csharp_expressionContext extends ParserRuleContext {
		public Csharp_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_expression; }
	 
		public Csharp_expressionContext() { }
		public void copyFrom(Csharp_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSharpSelectorExpressionContext extends Csharp_expressionContext {
		public Csharp_expressionContext parent;
		public Csharp_selector_expressionContext child;
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public Csharp_selector_expressionContext csharp_selector_expression() {
			return getRuleContext(Csharp_selector_expressionContext.class,0);
		}
		public CSharpSelectorExpressionContext(Csharp_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpSelectorExpression(this);
		}
	}
	public static class CSharpPrimaryExpressionContext extends Csharp_expressionContext {
		public Csharp_primary_expressionContext exp;
		public Csharp_primary_expressionContext csharp_primary_expression() {
			return getRuleContext(Csharp_primary_expressionContext.class,0);
		}
		public CSharpPrimaryExpressionContext(Csharp_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpPrimaryExpression(this);
		}
	}

	public final Csharp_expressionContext csharp_expression() throws RecognitionException {
		return csharp_expression(0);
	}

	private Csharp_expressionContext csharp_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Csharp_expressionContext _localctx = new Csharp_expressionContext(_ctx, _parentState);
		Csharp_expressionContext _prevctx = _localctx;
		int _startState = 414;
		enterRecursionRule(_localctx, 414, RULE_csharp_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpPrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2352);
			((CSharpPrimaryExpressionContext)_localctx).exp = csharp_primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpSelectorExpressionContext(new Csharp_expressionContext(_parentctx, _parentState));
					((CSharpSelectorExpressionContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_expression);
					setState(2354);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2355);
					((CSharpSelectorExpressionContext)_localctx).child = csharp_selector_expression();
					}
					} 
				}
				setState(2360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
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

	public static class Csharp_primary_expressionContext extends ParserRuleContext {
		public Csharp_this_expressionContext csharp_this_expression() {
			return getRuleContext(Csharp_this_expressionContext.class,0);
		}
		public Csharp_new_expressionContext csharp_new_expression() {
			return getRuleContext(Csharp_new_expressionContext.class,0);
		}
		public Csharp_parenthesis_expressionContext csharp_parenthesis_expression() {
			return getRuleContext(Csharp_parenthesis_expressionContext.class,0);
		}
		public Csharp_identifier_expressionContext csharp_identifier_expression() {
			return getRuleContext(Csharp_identifier_expressionContext.class,0);
		}
		public Csharp_literal_expressionContext csharp_literal_expression() {
			return getRuleContext(Csharp_literal_expressionContext.class,0);
		}
		public Csharp_primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCsharp_primary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCsharp_primary_expression(this);
		}
	}

	public final Csharp_primary_expressionContext csharp_primary_expression() throws RecognitionException {
		Csharp_primary_expressionContext _localctx = new Csharp_primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_csharp_primary_expression);
		try {
			setState(2366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2361);
				csharp_this_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2362);
				csharp_new_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2363);
				csharp_parenthesis_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2364);
				csharp_identifier_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2365);
				csharp_literal_expression();
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

	public static class Csharp_this_expressionContext extends ParserRuleContext {
		public This_expressionContext this_expression() {
			return getRuleContext(This_expressionContext.class,0);
		}
		public Csharp_this_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_this_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCsharp_this_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCsharp_this_expression(this);
		}
	}

	public final Csharp_this_expressionContext csharp_this_expression() throws RecognitionException {
		Csharp_this_expressionContext _localctx = new Csharp_this_expressionContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_csharp_this_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2368);
			this_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csharp_new_expressionContext extends ParserRuleContext {
		public New_tokenContext new_token() {
			return getRuleContext(New_tokenContext.class,0);
		}
		public Csharp_method_expressionContext csharp_method_expression() {
			return getRuleContext(Csharp_method_expressionContext.class,0);
		}
		public Csharp_new_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_new_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCsharp_new_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCsharp_new_expression(this);
		}
	}

	public final Csharp_new_expressionContext csharp_new_expression() throws RecognitionException {
		Csharp_new_expressionContext _localctx = new Csharp_new_expressionContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_csharp_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2370);
			new_token();
			setState(2371);
			csharp_method_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csharp_selector_expressionContext extends ParserRuleContext {
		public Csharp_selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_selector_expression; }
	 
		public Csharp_selector_expressionContext() { }
		public void copyFrom(Csharp_selector_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSharpMethodExpressionContext extends Csharp_selector_expressionContext {
		public Csharp_method_expressionContext exp;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Csharp_method_expressionContext csharp_method_expression() {
			return getRuleContext(Csharp_method_expressionContext.class,0);
		}
		public CSharpMethodExpressionContext(Csharp_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpMethodExpression(this);
		}
	}
	public static class CSharpItemExpressionContext extends Csharp_selector_expressionContext {
		public Csharp_item_expressionContext exp;
		public Csharp_item_expressionContext csharp_item_expression() {
			return getRuleContext(Csharp_item_expressionContext.class,0);
		}
		public CSharpItemExpressionContext(Csharp_selector_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpItemExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpItemExpression(this);
		}
	}

	public final Csharp_selector_expressionContext csharp_selector_expression() throws RecognitionException {
		Csharp_selector_expressionContext _localctx = new Csharp_selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_csharp_selector_expression);
		try {
			setState(2376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new CSharpMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2373);
				match(DOT);
				setState(2374);
				((CSharpMethodExpressionContext)_localctx).exp = csharp_method_expression();
				}
				break;
			case LBRAK:
				_localctx = new CSharpItemExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2375);
				((CSharpItemExpressionContext)_localctx).exp = csharp_item_expression();
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

	public static class Csharp_method_expressionContext extends ParserRuleContext {
		public Csharp_identifierContext name;
		public Csharp_argumentsContext args;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Csharp_identifierContext csharp_identifier() {
			return getRuleContext(Csharp_identifierContext.class,0);
		}
		public Csharp_argumentsContext csharp_arguments() {
			return getRuleContext(Csharp_argumentsContext.class,0);
		}
		public Csharp_method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_method_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCsharp_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCsharp_method_expression(this);
		}
	}

	public final Csharp_method_expressionContext csharp_method_expression() throws RecognitionException {
		Csharp_method_expressionContext _localctx = new Csharp_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_csharp_method_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2378);
			((Csharp_method_expressionContext)_localctx).name = csharp_identifier();
			setState(2379);
			match(LPAR);
			setState(2381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (LPAR - 16)) | (1L << (BOOLEAN - 16)) | (1L << (CHARACTER - 16)) | (1L << (TEXT - 16)) | (1L << (INTEGER - 16)) | (1L << (DECIMAL - 16)) | (1L << (DATE - 16)) | (1L << (TIME - 16)) | (1L << (DATETIME - 16)) | (1L << (PERIOD - 16)) | (1L << (VERSION - 16)) | (1L << (UUID - 16)) | (1L << (HTML - 16)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (NONE - 119)) | (1L << (NULL - 119)) | (1L << (READ - 119)) | (1L << (SELF - 119)) | (1L << (TEST - 119)) | (1L << (THIS - 119)) | (1L << (WRITE - 119)) | (1L << (BOOLEAN_LITERAL - 119)) | (1L << (CHAR_LITERAL - 119)) | (1L << (SYMBOL_IDENTIFIER - 119)) | (1L << (TYPE_IDENTIFIER - 119)) | (1L << (VARIABLE_IDENTIFIER - 119)) | (1L << (DOLLAR_IDENTIFIER - 119)) | (1L << (TEXT_LITERAL - 119)) | (1L << (INTEGER_LITERAL - 119)) | (1L << (DECIMAL_LITERAL - 119)))) != 0)) {
				{
				setState(2380);
				((Csharp_method_expressionContext)_localctx).args = csharp_arguments(0);
				}
			}

			setState(2383);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csharp_argumentsContext extends ParserRuleContext {
		public Csharp_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_arguments; }
	 
		public Csharp_argumentsContext() { }
		public void copyFrom(Csharp_argumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSharpArgumentListContext extends Csharp_argumentsContext {
		public Csharp_expressionContext item;
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpArgumentListContext(Csharp_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpArgumentList(this);
		}
	}
	public static class CSharpArgumentListItemContext extends Csharp_argumentsContext {
		public Csharp_argumentsContext items;
		public Csharp_expressionContext item;
		public TerminalNode COMMA() { return getToken(OParser.COMMA, 0); }
		public Csharp_argumentsContext csharp_arguments() {
			return getRuleContext(Csharp_argumentsContext.class,0);
		}
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public CSharpArgumentListItemContext(Csharp_argumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpArgumentListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpArgumentListItem(this);
		}
	}

	public final Csharp_argumentsContext csharp_arguments() throws RecognitionException {
		return csharp_arguments(0);
	}

	private Csharp_argumentsContext csharp_arguments(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Csharp_argumentsContext _localctx = new Csharp_argumentsContext(_ctx, _parentState);
		Csharp_argumentsContext _prevctx = _localctx;
		int _startState = 426;
		enterRecursionRule(_localctx, 426, RULE_csharp_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CSharpArgumentListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2386);
			((CSharpArgumentListContext)_localctx).item = csharp_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpArgumentListItemContext(new Csharp_argumentsContext(_parentctx, _parentState));
					((CSharpArgumentListItemContext)_localctx).items = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_arguments);
					setState(2388);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2389);
					match(COMMA);
					setState(2390);
					((CSharpArgumentListItemContext)_localctx).item = csharp_expression(0);
					}
					} 
				}
				setState(2395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
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

	public static class Csharp_item_expressionContext extends ParserRuleContext {
		public Csharp_expressionContext exp;
		public TerminalNode LBRAK() { return getToken(OParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(OParser.RBRAK, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public Csharp_item_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_item_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCsharp_item_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCsharp_item_expression(this);
		}
	}

	public final Csharp_item_expressionContext csharp_item_expression() throws RecognitionException {
		Csharp_item_expressionContext _localctx = new Csharp_item_expressionContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_csharp_item_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2396);
			match(LBRAK);
			setState(2397);
			((Csharp_item_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2398);
			match(RBRAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csharp_parenthesis_expressionContext extends ParserRuleContext {
		public Csharp_expressionContext exp;
		public TerminalNode LPAR() { return getToken(OParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OParser.RPAR, 0); }
		public Csharp_expressionContext csharp_expression() {
			return getRuleContext(Csharp_expressionContext.class,0);
		}
		public Csharp_parenthesis_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_parenthesis_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCsharp_parenthesis_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCsharp_parenthesis_expression(this);
		}
	}

	public final Csharp_parenthesis_expressionContext csharp_parenthesis_expression() throws RecognitionException {
		Csharp_parenthesis_expressionContext _localctx = new Csharp_parenthesis_expressionContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_csharp_parenthesis_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2400);
			match(LPAR);
			setState(2401);
			((Csharp_parenthesis_expressionContext)_localctx).exp = csharp_expression(0);
			setState(2402);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csharp_identifier_expressionContext extends ParserRuleContext {
		public Csharp_identifier_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_identifier_expression; }
	 
		public Csharp_identifier_expressionContext() { }
		public void copyFrom(Csharp_identifier_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSharpIdentifierContext extends Csharp_identifier_expressionContext {
		public Csharp_identifierContext name;
		public Csharp_identifierContext csharp_identifier() {
			return getRuleContext(Csharp_identifierContext.class,0);
		}
		public CSharpIdentifierContext(Csharp_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpIdentifier(this);
		}
	}
	public static class CSharpChildIdentifierContext extends Csharp_identifier_expressionContext {
		public Csharp_identifier_expressionContext parent;
		public Csharp_identifierContext name;
		public TerminalNode DOT() { return getToken(OParser.DOT, 0); }
		public Csharp_identifier_expressionContext csharp_identifier_expression() {
			return getRuleContext(Csharp_identifier_expressionContext.class,0);
		}
		public Csharp_identifierContext csharp_identifier() {
			return getRuleContext(Csharp_identifierContext.class,0);
		}
		public CSharpChildIdentifierContext(Csharp_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpChildIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpChildIdentifier(this);
		}
	}
	public static class CSharpPromptoIdentifierContext extends Csharp_identifier_expressionContext {
		public TerminalNode DOLLAR_IDENTIFIER() { return getToken(OParser.DOLLAR_IDENTIFIER, 0); }
		public CSharpPromptoIdentifierContext(Csharp_identifier_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpPromptoIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpPromptoIdentifier(this);
		}
	}

	public final Csharp_identifier_expressionContext csharp_identifier_expression() throws RecognitionException {
		return csharp_identifier_expression(0);
	}

	private Csharp_identifier_expressionContext csharp_identifier_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Csharp_identifier_expressionContext _localctx = new Csharp_identifier_expressionContext(_ctx, _parentState);
		Csharp_identifier_expressionContext _prevctx = _localctx;
		int _startState = 432;
		enterRecursionRule(_localctx, 432, RULE_csharp_identifier_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR_IDENTIFIER:
				{
				_localctx = new CSharpPromptoIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2405);
				match(DOLLAR_IDENTIFIER);
				}
				break;
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case UUID:
			case HTML:
			case NONE:
			case NULL:
			case READ:
			case SELF:
			case TEST:
			case WRITE:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				{
				_localctx = new CSharpIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2406);
				((CSharpIdentifierContext)_localctx).name = csharp_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CSharpChildIdentifierContext(new Csharp_identifier_expressionContext(_parentctx, _parentState));
					((CSharpChildIdentifierContext)_localctx).parent = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_csharp_identifier_expression);
					setState(2409);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2410);
					match(DOT);
					setState(2411);
					((CSharpChildIdentifierContext)_localctx).name = csharp_identifier();
					}
					} 
				}
				setState(2416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
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

	public static class Csharp_literal_expressionContext extends ParserRuleContext {
		public Csharp_literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_literal_expression; }
	 
		public Csharp_literal_expressionContext() { }
		public void copyFrom(Csharp_literal_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CSharpBooleanLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(OParser.BOOLEAN_LITERAL, 0); }
		public CSharpBooleanLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpBooleanLiteral(this);
		}
	}
	public static class CSharpIntegerLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(OParser.INTEGER_LITERAL, 0); }
		public CSharpIntegerLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpIntegerLiteral(this);
		}
	}
	public static class CSharpDecimalLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(OParser.DECIMAL_LITERAL, 0); }
		public CSharpDecimalLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpDecimalLiteral(this);
		}
	}
	public static class CSharpCharacterLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode CHAR_LITERAL() { return getToken(OParser.CHAR_LITERAL, 0); }
		public CSharpCharacterLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpCharacterLiteral(this);
		}
	}
	public static class CSharpTextLiteralContext extends Csharp_literal_expressionContext {
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public CSharpTextLiteralContext(Csharp_literal_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCSharpTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCSharpTextLiteral(this);
		}
	}

	public final Csharp_literal_expressionContext csharp_literal_expression() throws RecognitionException {
		Csharp_literal_expressionContext _localctx = new Csharp_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_csharp_literal_expression);
		try {
			setState(2422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				_localctx = new CSharpIntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2417);
				match(INTEGER_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				_localctx = new CSharpDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2418);
				match(DECIMAL_LITERAL);
				}
				break;
			case TEXT_LITERAL:
				_localctx = new CSharpTextLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2419);
				match(TEXT_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new CSharpBooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2420);
				match(BOOLEAN_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CSharpCharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2421);
				match(CHAR_LITERAL);
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

	public static class Csharp_identifierContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(OParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode SYMBOL_IDENTIFIER() { return getToken(OParser.SYMBOL_IDENTIFIER, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(OParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode BOOLEAN() { return getToken(OParser.BOOLEAN, 0); }
		public TerminalNode CHARACTER() { return getToken(OParser.CHARACTER, 0); }
		public TerminalNode TEXT() { return getToken(OParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(OParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(OParser.DECIMAL, 0); }
		public TerminalNode DATE() { return getToken(OParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(OParser.DATETIME, 0); }
		public TerminalNode PERIOD() { return getToken(OParser.PERIOD, 0); }
		public TerminalNode VERSION() { return getToken(OParser.VERSION, 0); }
		public TerminalNode UUID() { return getToken(OParser.UUID, 0); }
		public TerminalNode HTML() { return getToken(OParser.HTML, 0); }
		public TerminalNode READ() { return getToken(OParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(OParser.WRITE, 0); }
		public TerminalNode TEST() { return getToken(OParser.TEST, 0); }
		public TerminalNode SELF() { return getToken(OParser.SELF, 0); }
		public TerminalNode NONE() { return getToken(OParser.NONE, 0); }
		public TerminalNode NULL() { return getToken(OParser.NULL, 0); }
		public Csharp_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csharp_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCsharp_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCsharp_identifier(this);
		}
	}

	public final Csharp_identifierContext csharp_identifier() throws RecognitionException {
		Csharp_identifierContext _localctx = new Csharp_identifierContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_csharp_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2424);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (BOOLEAN - 47)) | (1L << (CHARACTER - 47)) | (1L << (TEXT - 47)) | (1L << (INTEGER - 47)) | (1L << (DECIMAL - 47)) | (1L << (DATE - 47)) | (1L << (TIME - 47)) | (1L << (DATETIME - 47)) | (1L << (PERIOD - 47)) | (1L << (VERSION - 47)) | (1L << (UUID - 47)) | (1L << (HTML - 47)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (NONE - 119)) | (1L << (NULL - 119)) | (1L << (READ - 119)) | (1L << (SELF - 119)) | (1L << (TEST - 119)) | (1L << (WRITE - 119)) | (1L << (SYMBOL_IDENTIFIER - 119)) | (1L << (TYPE_IDENTIFIER - 119)) | (1L << (VARIABLE_IDENTIFIER - 119)))) != 0)) ) {
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

	public static class Jsx_expressionContext extends ParserRuleContext {
		public Jsx_elementContext jsx_element() {
			return getRuleContext(Jsx_elementContext.class,0);
		}
		public Jsx_fragmentContext jsx_fragment() {
			return getRuleContext(Jsx_fragmentContext.class,0);
		}
		public Jsx_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_expression(this);
		}
	}

	public final Jsx_expressionContext jsx_expression() throws RecognitionException {
		Jsx_expressionContext _localctx = new Jsx_expressionContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_jsx_expression);
		try {
			setState(2428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2426);
				jsx_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2427);
				jsx_fragment();
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

	public static class Jsx_elementContext extends ParserRuleContext {
		public Jsx_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_element; }
	 
		public Jsx_elementContext() { }
		public void copyFrom(Jsx_elementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JsxSelfClosingContext extends Jsx_elementContext {
		public Jsx_self_closingContext jsx;
		public Jsx_self_closingContext jsx_self_closing() {
			return getRuleContext(Jsx_self_closingContext.class,0);
		}
		public JsxSelfClosingContext(Jsx_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsxSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsxSelfClosing(this);
		}
	}
	public static class JsxElementContext extends Jsx_elementContext {
		public Jsx_openingContext jsx;
		public Jsx_childrenContext children_;
		public Jsx_closingContext jsx_closing() {
			return getRuleContext(Jsx_closingContext.class,0);
		}
		public Jsx_openingContext jsx_opening() {
			return getRuleContext(Jsx_openingContext.class,0);
		}
		public Jsx_childrenContext jsx_children() {
			return getRuleContext(Jsx_childrenContext.class,0);
		}
		public JsxElementContext(Jsx_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsxElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsxElement(this);
		}
	}

	public final Jsx_elementContext jsx_element() throws RecognitionException {
		Jsx_elementContext _localctx = new Jsx_elementContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_jsx_element);
		try {
			setState(2437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				_localctx = new JsxSelfClosingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2430);
				((JsxSelfClosingContext)_localctx).jsx = jsx_self_closing();
				}
				break;
			case 2:
				_localctx = new JsxElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2431);
				((JsxElementContext)_localctx).jsx = jsx_opening();
				setState(2433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(2432);
					((JsxElementContext)_localctx).children_ = jsx_children();
					}
					break;
				}
				setState(2435);
				jsx_closing();
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

	public static class Jsx_fragmentContext extends ParserRuleContext {
		public Jsx_childrenContext children_;
		public Jsx_fragment_startContext jsx_fragment_start() {
			return getRuleContext(Jsx_fragment_startContext.class,0);
		}
		public Jsx_fragment_endContext jsx_fragment_end() {
			return getRuleContext(Jsx_fragment_endContext.class,0);
		}
		public Jsx_childrenContext jsx_children() {
			return getRuleContext(Jsx_childrenContext.class,0);
		}
		public Jsx_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_fragment(this);
		}
	}

	public final Jsx_fragmentContext jsx_fragment() throws RecognitionException {
		Jsx_fragmentContext _localctx = new Jsx_fragmentContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_jsx_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2439);
			jsx_fragment_start();
			setState(2441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(2440);
				((Jsx_fragmentContext)_localctx).children_ = jsx_children();
				}
				break;
			}
			setState(2443);
			jsx_fragment_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_fragment_startContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public TerminalNode LTGT() { return getToken(OParser.LTGT, 0); }
		public Jsx_fragment_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_fragment_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_fragment_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_fragment_start(this);
		}
	}

	public final Jsx_fragment_startContext jsx_fragment_start() throws RecognitionException {
		Jsx_fragment_startContext _localctx = new Jsx_fragment_startContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_jsx_fragment_start);
		try {
			setState(2448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2445);
				match(LT);
				setState(2446);
				match(GT);
				}
				break;
			case LTGT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2447);
				match(LTGT);
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

	public static class Jsx_fragment_endContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode SLASH() { return getToken(OParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public Jsx_fragment_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_fragment_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_fragment_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_fragment_end(this);
		}
	}

	public final Jsx_fragment_endContext jsx_fragment_end() throws RecognitionException {
		Jsx_fragment_endContext _localctx = new Jsx_fragment_endContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_jsx_fragment_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2450);
			match(LT);
			setState(2451);
			match(SLASH);
			setState(2452);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_self_closingContext extends ParserRuleContext {
		public Jsx_element_nameContext name;
		public Jsx_attributeContext attributes;
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode SLASH() { return getToken(OParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public Jsx_element_nameContext jsx_element_name() {
			return getRuleContext(Jsx_element_nameContext.class,0);
		}
		public List<Jsx_attributeContext> jsx_attribute() {
			return getRuleContexts(Jsx_attributeContext.class);
		}
		public Jsx_attributeContext jsx_attribute(int i) {
			return getRuleContext(Jsx_attributeContext.class,i);
		}
		public Jsx_self_closingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_self_closing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_self_closing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_self_closing(this);
		}
	}

	public final Jsx_self_closingContext jsx_self_closing() throws RecognitionException {
		Jsx_self_closingContext _localctx = new Jsx_self_closingContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_jsx_self_closing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2454);
			match(LT);
			setState(2455);
			((Jsx_self_closingContext)_localctx).name = jsx_element_name();
			setState(2459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CLOSE - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INVOKE - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ONE - 64)) | (1L << (OPEN - 64)) | (1L << (OPERATOR - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)))) != 0)) {
				{
				{
				setState(2456);
				((Jsx_self_closingContext)_localctx).attributes = jsx_attribute();
				}
				}
				setState(2461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2462);
			match(SLASH);
			setState(2463);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_openingContext extends ParserRuleContext {
		public Jsx_element_nameContext name;
		public Jsx_attributeContext attributes;
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public Jsx_element_nameContext jsx_element_name() {
			return getRuleContext(Jsx_element_nameContext.class,0);
		}
		public List<Jsx_attributeContext> jsx_attribute() {
			return getRuleContexts(Jsx_attributeContext.class);
		}
		public Jsx_attributeContext jsx_attribute(int i) {
			return getRuleContext(Jsx_attributeContext.class,i);
		}
		public Jsx_openingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_opening; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_opening(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_opening(this);
		}
	}

	public final Jsx_openingContext jsx_opening() throws RecognitionException {
		Jsx_openingContext _localctx = new Jsx_openingContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_jsx_opening);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2465);
			match(LT);
			setState(2466);
			((Jsx_openingContext)_localctx).name = jsx_element_name();
			setState(2470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CLOSE - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INVOKE - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ONE - 64)) | (1L << (OPEN - 64)) | (1L << (OPERATOR - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)))) != 0)) {
				{
				{
				setState(2467);
				((Jsx_openingContext)_localctx).attributes = jsx_attribute();
				}
				}
				setState(2472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2473);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_closingContext extends ParserRuleContext {
		public Jsx_element_nameContext name;
		public TerminalNode LT() { return getToken(OParser.LT, 0); }
		public TerminalNode SLASH() { return getToken(OParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(OParser.GT, 0); }
		public Jsx_element_nameContext jsx_element_name() {
			return getRuleContext(Jsx_element_nameContext.class,0);
		}
		public Jsx_closingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_closing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_closing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_closing(this);
		}
	}

	public final Jsx_closingContext jsx_closing() throws RecognitionException {
		Jsx_closingContext _localctx = new Jsx_closingContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_jsx_closing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2475);
			match(LT);
			setState(2476);
			match(SLASH);
			setState(2477);
			((Jsx_closingContext)_localctx).name = jsx_element_name();
			setState(2478);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_element_nameContext extends ParserRuleContext {
		public List<Jsx_identifierContext> jsx_identifier() {
			return getRuleContexts(Jsx_identifierContext.class);
		}
		public Jsx_identifierContext jsx_identifier(int i) {
			return getRuleContext(Jsx_identifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(OParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(OParser.DOT, i);
		}
		public Jsx_element_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_element_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_element_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_element_name(this);
		}
	}

	public final Jsx_element_nameContext jsx_element_name() throws RecognitionException {
		Jsx_element_nameContext _localctx = new Jsx_element_nameContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_jsx_element_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2480);
			jsx_identifier();
			setState(2485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(2481);
				match(DOT);
				setState(2482);
				jsx_identifier();
				}
				}
				setState(2487);
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

	public static class Jsx_identifierContext extends ParserRuleContext {
		public Identifier_or_keywordContext identifier_or_keyword() {
			return getRuleContext(Identifier_or_keywordContext.class,0);
		}
		public List<Nospace_hyphen_identifier_or_keywordContext> nospace_hyphen_identifier_or_keyword() {
			return getRuleContexts(Nospace_hyphen_identifier_or_keywordContext.class);
		}
		public Nospace_hyphen_identifier_or_keywordContext nospace_hyphen_identifier_or_keyword(int i) {
			return getRuleContext(Nospace_hyphen_identifier_or_keywordContext.class,i);
		}
		public Jsx_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_identifier(this);
		}
	}

	public final Jsx_identifierContext jsx_identifier() throws RecognitionException {
		Jsx_identifierContext _localctx = new Jsx_identifierContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_jsx_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2488);
			identifier_or_keyword();
			setState(2492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2489);
					nospace_hyphen_identifier_or_keyword();
					}
					} 
				}
				setState(2494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
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

	public static class Jsx_attributeContext extends ParserRuleContext {
		public Jsx_identifierContext name;
		public Jsx_attribute_valueContext value;
		public Jsx_identifierContext jsx_identifier() {
			return getRuleContext(Jsx_identifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(OParser.EQ, 0); }
		public Jsx_attribute_valueContext jsx_attribute_value() {
			return getRuleContext(Jsx_attribute_valueContext.class,0);
		}
		public Jsx_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_attribute(this);
		}
	}

	public final Jsx_attributeContext jsx_attribute() throws RecognitionException {
		Jsx_attributeContext _localctx = new Jsx_attributeContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_jsx_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2495);
			((Jsx_attributeContext)_localctx).name = jsx_identifier();
			setState(2498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(2496);
				match(EQ);
				setState(2497);
				((Jsx_attributeContext)_localctx).value = jsx_attribute_value();
				}
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

	public static class Jsx_attribute_valueContext extends ParserRuleContext {
		public Jsx_attribute_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_attribute_value; }
	 
		public Jsx_attribute_valueContext() { }
		public void copyFrom(Jsx_attribute_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JsxValueContext extends Jsx_attribute_valueContext {
		public ExpressionContext exp;
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JsxValueContext(Jsx_attribute_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsxValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsxValue(this);
		}
	}
	public static class JsxLiteralContext extends Jsx_attribute_valueContext {
		public TerminalNode TEXT_LITERAL() { return getToken(OParser.TEXT_LITERAL, 0); }
		public JsxLiteralContext(Jsx_attribute_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsxLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsxLiteral(this);
		}
	}

	public final Jsx_attribute_valueContext jsx_attribute_value() throws RecognitionException {
		Jsx_attribute_valueContext _localctx = new Jsx_attribute_valueContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_jsx_attribute_value);
		try {
			setState(2505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_LITERAL:
				_localctx = new JsxLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2500);
				match(TEXT_LITERAL);
				}
				break;
			case LCURL:
				_localctx = new JsxValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2501);
				match(LCURL);
				setState(2502);
				((JsxValueContext)_localctx).exp = expression(0);
				setState(2503);
				match(RCURL);
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

	public static class Jsx_childrenContext extends ParserRuleContext {
		public List<Jsx_childContext> jsx_child() {
			return getRuleContexts(Jsx_childContext.class);
		}
		public Jsx_childContext jsx_child(int i) {
			return getRuleContext(Jsx_childContext.class,i);
		}
		public Jsx_childrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_children; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_children(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_children(this);
		}
	}

	public final Jsx_childrenContext jsx_children() throws RecognitionException {
		Jsx_childrenContext _localctx = new Jsx_childrenContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_jsx_children);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2508); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2507);
					jsx_child();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2510); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jsx_childContext extends ParserRuleContext {
		public Jsx_childContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_child; }
	 
		public Jsx_childContext() { }
		public void copyFrom(Jsx_childContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JsxTextContext extends Jsx_childContext {
		public Jsx_textContext text;
		public Jsx_textContext jsx_text() {
			return getRuleContext(Jsx_textContext.class,0);
		}
		public JsxTextContext(Jsx_childContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsxText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsxText(this);
		}
	}
	public static class JsxChildContext extends Jsx_childContext {
		public Jsx_elementContext jsx;
		public Jsx_elementContext jsx_element() {
			return getRuleContext(Jsx_elementContext.class,0);
		}
		public JsxChildContext(Jsx_childContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsxChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsxChild(this);
		}
	}
	public static class JsxCodeContext extends Jsx_childContext {
		public ExpressionContext exp;
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JsxCodeContext(Jsx_childContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsxCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsxCode(this);
		}
	}

	public final Jsx_childContext jsx_child() throws RecognitionException {
		Jsx_childContext _localctx = new Jsx_childContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_jsx_child);
		int _la;
		try {
			setState(2519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
			case WS:
			case LF:
			case COMMENT:
			case JAVA:
			case CSHARP:
			case PYTHON2:
			case PYTHON3:
			case JAVASCRIPT:
			case SWIFT:
			case COLON:
			case SEMI:
			case COMMA:
			case RANGE:
			case DOT:
			case LPAR:
			case RPAR:
			case LBRAK:
			case RBRAK:
			case QMARK:
			case XMARK:
			case AMP:
			case AMP2:
			case PIPE:
			case PIPE2:
			case PLUS:
			case MINUS:
			case STAR:
			case SLASH:
			case BSLASH:
			case PERCENT:
			case GTE:
			case LTE:
			case LTGT:
			case LTCOLONGT:
			case EQ:
			case XEQ:
			case EQ2:
			case TEQ:
			case TILDE:
			case LARROW:
			case RARROW:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case METHOD_T:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case ABSTRACT:
			case ALL:
			case ALWAYS:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ATTR:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case BINDINGS:
			case BREAK:
			case BY:
			case CASE:
			case CATCH:
			case CATEGORY:
			case CLASS:
			case CLOSE:
			case CONTAINS:
			case DEF:
			case DEFAULT:
			case DEFINE:
			case DELETE:
			case DESC:
			case DO:
			case DOING:
			case EACH:
			case ELSE:
			case ENUM:
			case ENUMERATED:
			case EXCEPT:
			case EXECUTE:
			case EXPECTING:
			case EXTENDS:
			case FETCH:
			case FILTERED:
			case FINALLY:
			case FLUSH:
			case FOR:
			case FROM:
			case GETTER:
			case HAS:
			case IF:
			case IN:
			case INDEX:
			case INVOKE:
			case IS:
			case MATCHING:
			case METHOD:
			case METHODS:
			case MODULO:
			case MUTABLE:
			case NATIVE:
			case NONE:
			case NOT:
			case NOTHING:
			case NULL:
			case ON:
			case ONE:
			case OPEN:
			case OPERATOR:
			case OR:
			case ORDER:
			case OTHERWISE:
			case PASS:
			case RAISE:
			case READ:
			case RECEIVING:
			case RESOURCE:
			case RETURN:
			case RETURNING:
			case ROWS:
			case SELF:
			case SETTER:
			case SINGLETON:
			case SORTED:
			case STORABLE:
			case STORE:
			case SWITCH:
			case TEST:
			case THIS:
			case THROW:
			case TO:
			case TRY:
			case VERIFYING:
			case WIDGET:
			case WITH:
			case WHEN:
			case WHERE:
			case WHILE:
			case WRITE:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case MIN_INTEGER:
			case MAX_INTEGER:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
			case NATIVE_IDENTIFIER:
			case DOLLAR_IDENTIFIER:
			case ARONDBASE_IDENTIFIER:
			case TEXT_LITERAL:
			case UUID_LITERAL:
			case INTEGER_LITERAL:
			case HEXA_LITERAL:
			case DECIMAL_LITERAL:
			case DATETIME_LITERAL:
			case TIME_LITERAL:
			case DATE_LITERAL:
			case PERIOD_LITERAL:
			case VERSION_LITERAL:
				_localctx = new JsxTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2512);
				((JsxTextContext)_localctx).text = jsx_text();
				}
				break;
			case LT:
				_localctx = new JsxChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2513);
				((JsxChildContext)_localctx).jsx = jsx_element();
				}
				break;
			case LCURL:
				_localctx = new JsxCodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2514);
				match(LCURL);
				setState(2516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LBRAK) | (1L << LCURL) | (1L << XMARK) | (1L << MINUS) | (1L << LT) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (EXECUTE - 97)) | (1L << (FETCH - 97)) | (1L << (FILTERED - 97)) | (1L << (MUTABLE - 97)) | (1L << (NULL - 97)) | (1L << (READ - 97)) | (1L << (SELF - 97)) | (1L << (SORTED - 97)) | (1L << (THIS - 97)) | (1L << (BOOLEAN_LITERAL - 97)) | (1L << (CHAR_LITERAL - 97)) | (1L << (MIN_INTEGER - 97)) | (1L << (MAX_INTEGER - 97)))) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (SYMBOL_IDENTIFIER - 161)) | (1L << (TYPE_IDENTIFIER - 161)) | (1L << (VARIABLE_IDENTIFIER - 161)) | (1L << (TEXT_LITERAL - 161)) | (1L << (UUID_LITERAL - 161)) | (1L << (INTEGER_LITERAL - 161)) | (1L << (HEXA_LITERAL - 161)) | (1L << (DECIMAL_LITERAL - 161)) | (1L << (DATETIME_LITERAL - 161)) | (1L << (TIME_LITERAL - 161)) | (1L << (DATE_LITERAL - 161)) | (1L << (PERIOD_LITERAL - 161)) | (1L << (VERSION_LITERAL - 161)))) != 0)) {
					{
					setState(2515);
					((JsxCodeContext)_localctx).exp = expression(0);
					}
				}

				setState(2518);
				match(RCURL);
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

	public static class Jsx_textContext extends ParserRuleContext {
		public List<TerminalNode> LCURL() { return getTokens(OParser.LCURL); }
		public TerminalNode LCURL(int i) {
			return getToken(OParser.LCURL, i);
		}
		public List<TerminalNode> RCURL() { return getTokens(OParser.RCURL); }
		public TerminalNode RCURL(int i) {
			return getToken(OParser.RCURL, i);
		}
		public List<TerminalNode> LT() { return getTokens(OParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(OParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(OParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(OParser.GT, i);
		}
		public Jsx_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterJsx_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitJsx_text(this);
		}
	}

	public final Jsx_textContext jsx_text() throws RecognitionException {
		Jsx_textContext _localctx = new Jsx_textContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_jsx_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2522); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2521);
					_la = _input.LA(1);
					if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURL) | (1L << RCURL) | (1L << GT) | (1L << LT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2524); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Css_expressionContext extends ParserRuleContext {
		public Css_fieldContext field;
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public List<Css_fieldContext> css_field() {
			return getRuleContexts(Css_fieldContext.class);
		}
		public Css_fieldContext css_field(int i) {
			return getRuleContext(Css_fieldContext.class,i);
		}
		public Css_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCss_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCss_expression(this);
		}
	}

	public final Css_expressionContext css_expression() throws RecognitionException {
		Css_expressionContext _localctx = new Css_expressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_css_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2526);
			match(LCURL);
			setState(2528); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2527);
				((Css_expressionContext)_localctx).field = css_field();
				}
				}
				setState(2530); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << MINUS) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CLOSE - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INVOKE - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ONE - 64)) | (1L << (OPEN - 64)) | (1L << (OPERATOR - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)))) != 0) );
			setState(2532);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Css_fieldContext extends ParserRuleContext {
		public Css_identifierContext name;
		public Css_valueContext value;
		public TerminalNode COLON() { return getToken(OParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(OParser.SEMI, 0); }
		public Css_identifierContext css_identifier() {
			return getRuleContext(Css_identifierContext.class,0);
		}
		public Css_valueContext css_value() {
			return getRuleContext(Css_valueContext.class,0);
		}
		public Css_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCss_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCss_field(this);
		}
	}

	public final Css_fieldContext css_field() throws RecognitionException {
		Css_fieldContext _localctx = new Css_fieldContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_css_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2534);
			((Css_fieldContext)_localctx).name = css_identifier(0);
			setState(2535);
			match(COLON);
			setState(2536);
			((Css_fieldContext)_localctx).value = css_value();
			setState(2537);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Css_identifierContext extends ParserRuleContext {
		public Identifier_or_keywordContext identifier_or_keyword() {
			return getRuleContext(Identifier_or_keywordContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(OParser.MINUS, 0); }
		public Nospace_identifier_or_keywordContext nospace_identifier_or_keyword() {
			return getRuleContext(Nospace_identifier_or_keywordContext.class,0);
		}
		public Css_identifierContext css_identifier() {
			return getRuleContext(Css_identifierContext.class,0);
		}
		public List<Nospace_hyphen_identifier_or_keywordContext> nospace_hyphen_identifier_or_keyword() {
			return getRuleContexts(Nospace_hyphen_identifier_or_keywordContext.class);
		}
		public Nospace_hyphen_identifier_or_keywordContext nospace_hyphen_identifier_or_keyword(int i) {
			return getRuleContext(Nospace_hyphen_identifier_or_keywordContext.class,i);
		}
		public Css_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCss_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCss_identifier(this);
		}
	}

	public final Css_identifierContext css_identifier() throws RecognitionException {
		return css_identifier(0);
	}

	private Css_identifierContext css_identifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Css_identifierContext _localctx = new Css_identifierContext(_ctx, _parentState);
		Css_identifierContext _prevctx = _localctx;
		int _startState = 472;
		enterRecursionRule(_localctx, 472, RULE_css_identifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA:
			case CSHARP:
			case PYTHON2:
			case PYTHON3:
			case JAVASCRIPT:
			case SWIFT:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case METHOD_T:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case ABSTRACT:
			case ALL:
			case ALWAYS:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ATTR:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case BINDINGS:
			case BREAK:
			case BY:
			case CASE:
			case CATCH:
			case CATEGORY:
			case CLASS:
			case CLOSE:
			case CONTAINS:
			case DEF:
			case DEFAULT:
			case DEFINE:
			case DELETE:
			case DESC:
			case DO:
			case DOING:
			case EACH:
			case ELSE:
			case ENUM:
			case ENUMERATED:
			case EXCEPT:
			case EXECUTE:
			case EXPECTING:
			case EXTENDS:
			case FETCH:
			case FILTERED:
			case FINALLY:
			case FLUSH:
			case FOR:
			case FROM:
			case GETTER:
			case HAS:
			case IF:
			case IN:
			case INDEX:
			case INVOKE:
			case IS:
			case MATCHING:
			case METHOD:
			case METHODS:
			case MODULO:
			case MUTABLE:
			case NATIVE:
			case NONE:
			case NOT:
			case NOTHING:
			case NULL:
			case ON:
			case ONE:
			case OPEN:
			case OPERATOR:
			case OR:
			case ORDER:
			case OTHERWISE:
			case PASS:
			case RAISE:
			case READ:
			case RECEIVING:
			case RESOURCE:
			case RETURN:
			case RETURNING:
			case ROWS:
			case SELF:
			case SETTER:
			case SINGLETON:
			case SORTED:
			case STORABLE:
			case STORE:
			case SWITCH:
			case TEST:
			case THIS:
			case THROW:
			case TO:
			case TRY:
			case VERIFYING:
			case WIDGET:
			case WITH:
			case WHEN:
			case WHERE:
			case WHILE:
			case WRITE:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
				{
				setState(2540);
				identifier_or_keyword();
				}
				break;
			case MINUS:
				{
				setState(2541);
				match(MINUS);
				setState(2542);
				nospace_identifier_or_keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Css_identifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_css_identifier);
					setState(2545);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2547); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(2546);
							nospace_hyphen_identifier_or_keyword();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(2549); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(2555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
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

	public static class Css_valueContext extends ParserRuleContext {
		public Css_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_value; }
	 
		public Css_valueContext() { }
		public void copyFrom(Css_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CssTextContext extends Css_valueContext {
		public Css_textContext text;
		public Css_textContext css_text() {
			return getRuleContext(Css_textContext.class,0);
		}
		public CssTextContext(Css_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCssText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCssText(this);
		}
	}
	public static class CssValueContext extends Css_valueContext {
		public ExpressionContext exp;
		public TerminalNode LCURL() { return getToken(OParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(OParser.RCURL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CssValueContext(Css_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCssValue(this);
		}
	}

	public final Css_valueContext css_value() throws RecognitionException {
		Css_valueContext _localctx = new Css_valueContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_css_value);
		try {
			setState(2561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				_localctx = new CssValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2556);
				match(LCURL);
				setState(2557);
				((CssValueContext)_localctx).exp = expression(0);
				setState(2558);
				match(RCURL);
				}
				break;
			case SPACE:
			case LF:
			case COMMENT:
			case JAVA:
			case CSHARP:
			case PYTHON2:
			case PYTHON3:
			case JAVASCRIPT:
			case SWIFT:
			case COMMA:
			case RANGE:
			case DOT:
			case LPAR:
			case RPAR:
			case LBRAK:
			case RBRAK:
			case QMARK:
			case XMARK:
			case AMP:
			case AMP2:
			case PIPE:
			case PIPE2:
			case PLUS:
			case MINUS:
			case STAR:
			case SLASH:
			case BSLASH:
			case PERCENT:
			case GT:
			case GTE:
			case LT:
			case LTE:
			case LTGT:
			case LTCOLONGT:
			case EQ:
			case XEQ:
			case EQ2:
			case TEQ:
			case TILDE:
			case LARROW:
			case RARROW:
			case BOOLEAN:
			case CHARACTER:
			case TEXT:
			case INTEGER:
			case DECIMAL:
			case DATE:
			case TIME:
			case DATETIME:
			case PERIOD:
			case VERSION:
			case METHOD_T:
			case CODE:
			case DOCUMENT:
			case BLOB:
			case IMAGE:
			case UUID:
			case ITERATOR:
			case CURSOR:
			case HTML:
			case ABSTRACT:
			case ALL:
			case ALWAYS:
			case AND:
			case ANY:
			case AS:
			case ASC:
			case ATTR:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case BINDINGS:
			case BREAK:
			case BY:
			case CASE:
			case CATCH:
			case CATEGORY:
			case CLASS:
			case CLOSE:
			case CONTAINS:
			case DEF:
			case DEFAULT:
			case DEFINE:
			case DELETE:
			case DESC:
			case DO:
			case DOING:
			case EACH:
			case ELSE:
			case ENUM:
			case ENUMERATED:
			case EXCEPT:
			case EXECUTE:
			case EXPECTING:
			case EXTENDS:
			case FETCH:
			case FILTERED:
			case FINALLY:
			case FLUSH:
			case FOR:
			case FROM:
			case GETTER:
			case HAS:
			case IF:
			case IN:
			case INDEX:
			case INVOKE:
			case IS:
			case MATCHING:
			case METHOD:
			case METHODS:
			case MODULO:
			case MUTABLE:
			case NATIVE:
			case NONE:
			case NOT:
			case NOTHING:
			case NULL:
			case ON:
			case ONE:
			case OPEN:
			case OPERATOR:
			case OR:
			case ORDER:
			case OTHERWISE:
			case PASS:
			case RAISE:
			case READ:
			case RECEIVING:
			case RESOURCE:
			case RETURN:
			case RETURNING:
			case ROWS:
			case SELF:
			case SETTER:
			case SINGLETON:
			case SORTED:
			case STORABLE:
			case STORE:
			case SWITCH:
			case TEST:
			case THIS:
			case THROW:
			case TO:
			case TRY:
			case VERIFYING:
			case WIDGET:
			case WITH:
			case WHEN:
			case WHERE:
			case WHILE:
			case WRITE:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case MIN_INTEGER:
			case MAX_INTEGER:
			case SYMBOL_IDENTIFIER:
			case TYPE_IDENTIFIER:
			case VARIABLE_IDENTIFIER:
			case NATIVE_IDENTIFIER:
			case DOLLAR_IDENTIFIER:
			case ARONDBASE_IDENTIFIER:
			case TEXT_LITERAL:
			case UUID_LITERAL:
			case INTEGER_LITERAL:
			case HEXA_LITERAL:
			case DECIMAL_LITERAL:
			case DATETIME_LITERAL:
			case TIME_LITERAL:
			case DATE_LITERAL:
			case PERIOD_LITERAL:
			case VERSION_LITERAL:
				_localctx = new CssTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2560);
				((CssTextContext)_localctx).text = css_text();
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

	public static class Css_textContext extends ParserRuleContext {
		public List<TerminalNode> LCURL() { return getTokens(OParser.LCURL); }
		public TerminalNode LCURL(int i) {
			return getToken(OParser.LCURL, i);
		}
		public List<TerminalNode> RCURL() { return getTokens(OParser.RCURL); }
		public TerminalNode RCURL(int i) {
			return getToken(OParser.RCURL, i);
		}
		public List<TerminalNode> COLON() { return getTokens(OParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(OParser.COLON, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(OParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(OParser.SEMI, i);
		}
		public List<TerminalNode> WS() { return getTokens(OParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(OParser.WS, i);
		}
		public Css_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).enterCss_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OParserListener ) ((OParserListener)listener).exitCss_text(this);
		}
	}

	public final Css_textContext css_text() throws RecognitionException {
		Css_textContext _localctx = new Css_textContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_css_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2564); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2563);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WS) | (1L << COLON) | (1L << SEMI) | (1L << LCURL) | (1L << RCURL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(2566); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << LF) | (1L << COMMENT) | (1L << JAVA) | (1L << CSHARP) | (1L << PYTHON2) | (1L << PYTHON3) | (1L << JAVASCRIPT) | (1L << SWIFT) | (1L << COMMA) | (1L << RANGE) | (1L << DOT) | (1L << LPAR) | (1L << RPAR) | (1L << LBRAK) | (1L << RBRAK) | (1L << QMARK) | (1L << XMARK) | (1L << AMP) | (1L << AMP2) | (1L << PIPE) | (1L << PIPE2) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH) | (1L << BSLASH) | (1L << PERCENT) | (1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE) | (1L << LTGT) | (1L << LTCOLONGT) | (1L << EQ) | (1L << XEQ) | (1L << EQ2) | (1L << TEQ) | (1L << TILDE) | (1L << LARROW) | (1L << RARROW) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << TEXT) | (1L << INTEGER) | (1L << DECIMAL) | (1L << DATE) | (1L << TIME) | (1L << DATETIME) | (1L << PERIOD) | (1L << VERSION) | (1L << METHOD_T) | (1L << CODE) | (1L << DOCUMENT) | (1L << BLOB) | (1L << IMAGE) | (1L << UUID) | (1L << ITERATOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CURSOR - 64)) | (1L << (HTML - 64)) | (1L << (ABSTRACT - 64)) | (1L << (ALL - 64)) | (1L << (ALWAYS - 64)) | (1L << (AND - 64)) | (1L << (ANY - 64)) | (1L << (AS - 64)) | (1L << (ASC - 64)) | (1L << (ATTR - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (BINDINGS - 64)) | (1L << (BREAK - 64)) | (1L << (BY - 64)) | (1L << (CASE - 64)) | (1L << (CATCH - 64)) | (1L << (CATEGORY - 64)) | (1L << (CLASS - 64)) | (1L << (CLOSE - 64)) | (1L << (CONTAINS - 64)) | (1L << (DEF - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINE - 64)) | (1L << (DELETE - 64)) | (1L << (DESC - 64)) | (1L << (DO - 64)) | (1L << (DOING - 64)) | (1L << (EACH - 64)) | (1L << (ELSE - 64)) | (1L << (ENUM - 64)) | (1L << (ENUMERATED - 64)) | (1L << (EXCEPT - 64)) | (1L << (EXECUTE - 64)) | (1L << (EXPECTING - 64)) | (1L << (EXTENDS - 64)) | (1L << (FETCH - 64)) | (1L << (FILTERED - 64)) | (1L << (FINALLY - 64)) | (1L << (FLUSH - 64)) | (1L << (FOR - 64)) | (1L << (FROM - 64)) | (1L << (GETTER - 64)) | (1L << (HAS - 64)) | (1L << (IF - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INVOKE - 64)) | (1L << (IS - 64)) | (1L << (MATCHING - 64)) | (1L << (METHOD - 64)) | (1L << (METHODS - 64)) | (1L << (MODULO - 64)) | (1L << (MUTABLE - 64)) | (1L << (NATIVE - 64)) | (1L << (NONE - 64)) | (1L << (NOT - 64)) | (1L << (NOTHING - 64)) | (1L << (NULL - 64)) | (1L << (ON - 64)) | (1L << (ONE - 64)) | (1L << (OPEN - 64)) | (1L << (OPERATOR - 64)) | (1L << (OR - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ORDER - 128)) | (1L << (OTHERWISE - 128)) | (1L << (PASS - 128)) | (1L << (RAISE - 128)) | (1L << (READ - 128)) | (1L << (RECEIVING - 128)) | (1L << (RESOURCE - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNING - 128)) | (1L << (ROWS - 128)) | (1L << (SELF - 128)) | (1L << (SETTER - 128)) | (1L << (SINGLETON - 128)) | (1L << (SORTED - 128)) | (1L << (STORABLE - 128)) | (1L << (STORE - 128)) | (1L << (SWITCH - 128)) | (1L << (TEST - 128)) | (1L << (THIS - 128)) | (1L << (THROW - 128)) | (1L << (TO - 128)) | (1L << (TRY - 128)) | (1L << (VERIFYING - 128)) | (1L << (WIDGET - 128)) | (1L << (WITH - 128)) | (1L << (WHEN - 128)) | (1L << (WHERE - 128)) | (1L << (WHILE - 128)) | (1L << (WRITE - 128)) | (1L << (BOOLEAN_LITERAL - 128)) | (1L << (CHAR_LITERAL - 128)) | (1L << (MIN_INTEGER - 128)) | (1L << (MAX_INTEGER - 128)) | (1L << (SYMBOL_IDENTIFIER - 128)) | (1L << (TYPE_IDENTIFIER - 128)) | (1L << (VARIABLE_IDENTIFIER - 128)) | (1L << (NATIVE_IDENTIFIER - 128)) | (1L << (DOLLAR_IDENTIFIER - 128)) | (1L << (ARONDBASE_IDENTIFIER - 128)) | (1L << (TEXT_LITERAL - 128)) | (1L << (UUID_LITERAL - 128)) | (1L << (INTEGER_LITERAL - 128)) | (1L << (HEXA_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (DATETIME_LITERAL - 128)) | (1L << (TIME_LITERAL - 128)) | (1L << (DATE_LITERAL - 128)) | (1L << (PERIOD_LITERAL - 128)) | (1L << (VERSION_LITERAL - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		case 9:
			return derived_list_sempred((Derived_listContext)_localctx, predIndex);
		case 19:
			return native_category_binding_list_sempred((Native_category_binding_listContext)_localctx, predIndex);
		case 38:
			return else_if_statement_list_sempred((Else_if_statement_listContext)_localctx, predIndex);
		case 46:
			return callable_parent_sempred((Callable_parentContext)_localctx, predIndex);
		case 49:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 50:
			return an_expression_sempred((An_expressionContext)_localctx, predIndex);
		case 52:
			return instance_expression_sempred((Instance_expressionContext)_localctx, predIndex);
		case 62:
			return copy_from_sempred((Copy_fromContext)_localctx, predIndex);
		case 63:
			return argument_assignment_list_sempred((Argument_assignment_listContext)_localctx, predIndex);
		case 84:
			return typedef_sempred((TypedefContext)_localctx, predIndex);
		case 95:
			return nospace_hyphen_identifier_or_keyword_sempred((Nospace_hyphen_identifier_or_keywordContext)_localctx, predIndex);
		case 96:
			return nospace_identifier_or_keyword_sempred((Nospace_identifier_or_keywordContext)_localctx, predIndex);
		case 108:
			return any_type_sempred((Any_typeContext)_localctx, predIndex);
		case 146:
			return assignable_instance_sempred((Assignable_instanceContext)_localctx, predIndex);
		case 147:
			return is_expression_sempred((Is_expressionContext)_localctx, predIndex);
		case 154:
			return new_token_sempred((New_tokenContext)_localctx, predIndex);
		case 155:
			return key_token_sempred((Key_tokenContext)_localctx, predIndex);
		case 156:
			return module_token_sempred((Module_tokenContext)_localctx, predIndex);
		case 157:
			return value_token_sempred((Value_tokenContext)_localctx, predIndex);
		case 158:
			return symbols_token_sempred((Symbols_tokenContext)_localctx, predIndex);
		case 167:
			return javascript_expression_sempred((Javascript_expressionContext)_localctx, predIndex);
		case 173:
			return javascript_arguments_sempred((Javascript_argumentsContext)_localctx, predIndex);
		case 180:
			return python_expression_sempred((Python_expressionContext)_localctx, predIndex);
		case 186:
			return python_ordinal_argument_list_sempred((Python_ordinal_argument_listContext)_localctx, predIndex);
		case 187:
			return python_named_argument_list_sempred((Python_named_argument_listContext)_localctx, predIndex);
		case 189:
			return python_identifier_expression_sempred((Python_identifier_expressionContext)_localctx, predIndex);
		case 193:
			return java_expression_sempred((Java_expressionContext)_localctx, predIndex);
		case 199:
			return java_arguments_sempred((Java_argumentsContext)_localctx, predIndex);
		case 202:
			return java_identifier_expression_sempred((Java_identifier_expressionContext)_localctx, predIndex);
		case 203:
			return java_class_identifier_expression_sempred((Java_class_identifier_expressionContext)_localctx, predIndex);
		case 207:
			return csharp_expression_sempred((Csharp_expressionContext)_localctx, predIndex);
		case 213:
			return csharp_arguments_sempred((Csharp_argumentsContext)_localctx, predIndex);
		case 216:
			return csharp_identifier_expression_sempred((Csharp_identifier_expressionContext)_localctx, predIndex);
		case 236:
			return css_identifier_sempred((Css_identifierContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean derived_list_sempred(Derived_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean native_category_binding_list_sempred(Native_category_binding_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean else_if_statement_list_sempred(Else_if_statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean callable_parent_sempred(Callable_parentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 34);
		case 5:
			return precpred(_ctx, 33);
		case 6:
			return precpred(_ctx, 32);
		case 7:
			return precpred(_ctx, 31);
		case 8:
			return precpred(_ctx, 30);
		case 9:
			return precpred(_ctx, 28);
		case 10:
			return precpred(_ctx, 27);
		case 11:
			return precpred(_ctx, 26);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 22);
		case 14:
			return precpred(_ctx, 21);
		case 15:
			return precpred(_ctx, 20);
		case 16:
			return precpred(_ctx, 19);
		case 17:
			return precpred(_ctx, 18);
		case 18:
			return precpred(_ctx, 17);
		case 19:
			return precpred(_ctx, 16);
		case 20:
			return precpred(_ctx, 15);
		case 21:
			return precpred(_ctx, 14);
		case 22:
			return precpred(_ctx, 13);
		case 23:
			return precpred(_ctx, 12);
		case 24:
			return precpred(_ctx, 11);
		case 25:
			return precpred(_ctx, 10);
		case 26:
			return precpred(_ctx, 9);
		case 27:
			return precpred(_ctx, 8);
		case 28:
			return precpred(_ctx, 7);
		case 29:
			return precpred(_ctx, 6);
		case 30:
			return precpred(_ctx, 5);
		case 31:
			return precpred(_ctx, 24);
		case 32:
			return precpred(_ctx, 23);
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean an_expression_sempred(An_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return this.willBeAOrAn();
		}
		return true;
	}
	private boolean instance_expression_sempred(Instance_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean copy_from_sempred(Copy_fromContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return this.willNotBe(this.equalToken());
		}
		return true;
	}
	private boolean argument_assignment_list_sempred(Argument_assignment_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return this.willNotBe(this.equalToken());
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typedef_sempred(TypedefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 5);
		case 40:
			return precpred(_ctx, 4);
		case 41:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean nospace_hyphen_identifier_or_keyword_sempred(Nospace_hyphen_identifier_or_keywordContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return this.wasNotWhiteSpace();
		}
		return true;
	}
	private boolean nospace_identifier_or_keyword_sempred(Nospace_identifier_or_keywordContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return this.wasNotWhiteSpace();
		}
		return true;
	}
	private boolean any_type_sempred(Any_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return precpred(_ctx, 2);
		case 45:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignable_instance_sempred(Assignable_instanceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean is_expression_sempred(Is_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return this.willBeAOrAn();
		}
		return true;
	}
	private boolean new_token_sempred(New_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return this.isText(((New_tokenContext)_localctx).i1,"new");
		}
		return true;
	}
	private boolean key_token_sempred(Key_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return this.isText(((Key_tokenContext)_localctx).i1,"key");
		}
		return true;
	}
	private boolean module_token_sempred(Module_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return this.isText(((Module_tokenContext)_localctx).i1,"module");
		}
		return true;
	}
	private boolean value_token_sempred(Value_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return this.isText(((Value_tokenContext)_localctx).i1,"value");
		}
		return true;
	}
	private boolean symbols_token_sempred(Symbols_tokenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return this.isText(((Symbols_tokenContext)_localctx).i1,"symbols");
		}
		return true;
	}
	private boolean javascript_expression_sempred(Javascript_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean javascript_arguments_sempred(Javascript_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_expression_sempred(Python_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_ordinal_argument_list_sempred(Python_ordinal_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_named_argument_list_sempred(Python_named_argument_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 57:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean python_identifier_expression_sempred(Python_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 58:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_expression_sempred(Java_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 59:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_arguments_sempred(Java_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 60:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_identifier_expression_sempred(Java_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 61:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean java_class_identifier_expression_sempred(Java_class_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 62:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_expression_sempred(Csharp_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 63:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_arguments_sempred(Csharp_argumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 64:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean csharp_identifier_expression_sempred(Csharp_identifier_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 65:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean css_identifier_sempred(Css_identifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 66:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b2\u0a0b\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2\u01e8\n\2\3\2\3\2\5\2\u01ec\n\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\5\6\u0207\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u020e\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u0216\n\6\5\6\u0218\n\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\5\7\u0220\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\5\t\u022d"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0235\n\t\3\t\3\t\5\t\u0239\n\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0243\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u024d\n\13\f\13\16\13\u0250\13\13\3\f\3\f\3\f\5\f\u0255"+
		"\n\f\3\f\5\f\u0258\n\f\3\r\5\r\u025b\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0264\n\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u026c\n\16\3\16\3\16\3\17"+
		"\5\17\u0271\n\17\3\17\3\17\3\17\3\17\5\17\u0277\n\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\5\20\u027f\n\20\3\20\3\20\3\21\5\21\u0284\n\21\3\21\3\21"+
		"\3\21\3\21\5\21\u028a\n\21\3\21\3\21\3\22\5\22\u028f\n\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u0298\n\22\3\22\3\22\3\22\5\22\u029d\n\22"+
		"\3\22\3\22\3\23\5\23\u02a2\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u02ab\n\23\3\23\3\23\3\23\5\23\u02b0\n\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u02c2\n\25"+
		"\f\25\16\25\u02c5\13\25\3\26\3\26\5\26\u02c9\n\26\3\26\3\26\3\26\3\26"+
		"\5\26\u02cf\n\26\3\26\3\26\3\26\3\27\5\27\u02d5\n\27\3\27\3\27\3\27\3"+
		"\27\5\27\u02db\n\27\3\27\3\27\3\27\5\27\u02e0\n\27\3\27\3\27\3\30\5\30"+
		"\u02e5\n\30\3\30\5\30\u02e8\n\30\3\30\3\30\3\30\3\30\5\30\u02ee\n\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0305\n\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u030f\n\33\3\33\3\33\3\33\5\33\u0314\n\33\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u031b\n\34\5\34\u031d\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0334\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0352\n\37\3 \3 \3 \3 \3 \3 "+
		"\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0369\n\"\5"+
		"\"\u036b\n\"\3\"\3\"\3#\3#\3#\3#\5#\u0373\n#\3#\3#\3#\3#\3#\5#\u037a\n"+
		"#\5#\u037c\n#\3$\3$\3$\3$\3$\3$\5$\u0384\n$\3$\3$\3$\3$\3$\3%\3%\3%\5"+
		"%\u038e\n%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\5\'\u03a3\n\'\3\'\3\'\5\'\u03a7\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\7(\u03b9\n(\f(\16(\u03bc\13(\3)\3)\3)\3)\3*\3*\3*"+
		"\3*\3*\3*\5*\u03c8\n*\3*\3*\5*\u03cc\n*\3*\3*\3*\3*\3*\3*\5*\u03d4\n*"+
		"\3*\5*\u03d7\n*\3*\3*\3*\5*\u03dc\n*\3*\5*\u03df\n*\3+\3+\3+\3+\3+\3+"+
		"\5+\u03e7\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u03f2\n+\3+\3+\5+\u03f6\n+"+
		"\3,\3,\3,\3-\3-\5-\u03fd\n-\3-\3-\3.\3.\3.\5.\u0404\n.\3.\3.\3/\3/\3/"+
		"\3/\3/\5/\u040d\n/\3\60\3\60\3\60\3\60\3\60\7\60\u0414\n\60\f\60\16\60"+
		"\u0417\13\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u041f\n\61\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u043c\n\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\7\63\u04b0\n\63\f\63\16\63\u04b3\13\63\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\7\66\u04c0\n\66\f\66\16\66\u04c3\13"+
		"\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u04ce\n\67\38\3"+
		"8\38\38\38\39\39\39\59\u04d8\n9\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\5<\u04f7\n<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0504\n<\3<\3<\3<\3<\5<\u050a\n<\3<\3<\3"+
		"<\3<\3<\3<\3<\5<\u0513\n<\3<\3<\3<\3<\3<\5<\u051a\n<\3<\3<\3<\3<\3<\3"+
		"<\5<\u0522\n<\5<\u0524\n<\3=\3=\5=\u0528\n=\3=\3=\3=\3=\3=\3=\3=\5=\u0531"+
		"\n=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u053f\n>\3?\3?\3?\3?\3?\5?"+
		"\u0546\n?\3?\3?\3?\3?\3?\5?\u054d\n?\3?\3?\5?\u0551\n?\3@\3@\3@\3@\3@"+
		"\3A\3A\3A\3A\3A\5A\u055d\nA\3A\3A\3A\7A\u0562\nA\fA\16A\u0565\13A\3B\3"+
		"B\3B\3B\5B\u056b\nB\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\5D\u0578\nD\3E\3"+
		"E\3E\3E\3E\3F\3F\3G\5G\u0582\nG\3G\3G\3G\3H\3H\3H\3H\7H\u058b\nH\fH\16"+
		"H\u058e\13H\3I\3I\3I\7I\u0593\nI\fI\16I\u0596\13I\3I\3I\3I\7I\u059b\n"+
		"I\fI\16I\u059e\13I\3I\3I\3I\3I\3I\3I\5I\u05a6\nI\3J\3J\3J\3J\3J\5J\u05ad"+
		"\nJ\3K\3K\3L\3L\3M\3M\5M\u05b5\nM\3N\3N\3N\3N\7N\u05bb\nN\fN\16N\u05be"+
		"\13N\3O\3O\3O\3O\7O\u05c4\nO\fO\16O\u05c7\13O\3P\3P\3P\7P\u05cc\nP\fP"+
		"\16P\u05cf\13P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u05db\nQ\3R\5R\u05de\n"+
		"R\3R\3R\5R\u05e2\nR\3R\3R\3S\5S\u05e7\nS\3S\3S\5S\u05eb\nS\3S\3S\3T\3"+
		"T\3T\7T\u05f2\nT\fT\16T\u05f5\13T\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\5V\u0609\nV\3V\3V\3V\3V\3V\3V\3V\7V\u0612\nV\fV\16"+
		"V\u0615\13V\3W\3W\5W\u0619\nW\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\5X\u062b\nX\3Y\3Y\3Z\5Z\u0630\nZ\3Z\3Z\3[\3[\3\\\3\\\3\\\5\\\u0639"+
		"\n\\\3]\3]\5]\u063d\n]\3^\3^\3^\7^\u0642\n^\f^\16^\u0645\13^\3_\3_\5_"+
		"\u0649\n_\3`\3`\5`\u064d\n`\3a\3a\3a\3a\3b\3b\3b\3c\3c\3c\5c\u0659\nc"+
		"\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3h\7h\u0666\nh\fh\16h\u0669\13h\3i\3i\5"+
		"i\u066d\ni\3i\5i\u0670\ni\3j\3j\5j\u0674\nj\3k\3k\3k\5k\u0679\nk\3l\3"+
		"l\3l\3m\3m\5m\u0680\nm\3n\3n\3n\3n\3n\3n\3n\3n\3n\7n\u068b\nn\fn\16n\u068e"+
		"\13n\3o\3o\3o\3o\7o\u0694\no\fo\16o\u0697\13o\3p\3p\3p\3p\3p\5p\u069e"+
		"\np\3q\3q\3q\3q\7q\u06a4\nq\fq\16q\u06a7\13q\3r\3r\3r\5r\u06ac\nr\3s\3"+
		"s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u06b8\ns\3t\3t\5t\u06bc\nt\3u\3u\3u\3u\3"+
		"u\3u\7u\u06c4\nu\fu\16u\u06c7\13u\3v\3v\3v\7v\u06cc\nv\fv\16v\u06cf\13"+
		"v\3v\5v\u06d2\nv\3w\3w\3w\3w\5w\u06d8\nw\3w\3w\3w\7w\u06dd\nw\fw\16w\u06e0"+
		"\13w\3w\3w\5w\u06e4\nw\3x\3x\3x\7x\u06e9\nx\fx\16x\u06ec\13x\3y\3y\3y"+
		"\7y\u06f1\ny\fy\16y\u06f4\13y\3z\3z\3z\3z\5z\u06fa\nz\3{\3{\3|\3|\3|\3"+
		"|\7|\u0702\n|\f|\16|\u0705\13|\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u0711"+
		"\n}\3~\3~\5~\u0715\n~\3~\5~\u0718\n~\3\177\3\177\5\177\u071c\n\177\3\177"+
		"\5\177\u071f\n\177\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u0725\n\u0080"+
		"\f\u0080\16\u0080\u0728\13\u0080\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081"+
		"\u072e\n\u0081\f\u0081\16\u0081\u0731\13\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\7\u0082\u0737\n\u0082\f\u0082\16\u0082\u073a\13\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\7\u0083\u0740\n\u0083\f\u0083\16\u0083\u0743"+
		"\13\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u0753\n\u0084"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0764\n\u0085"+
		"\3\u0086\3\u0086\3\u0086\7\u0086\u0769\n\u0086\f\u0086\16\u0086\u076c"+
		"\13\u0086\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0772\n\u0087\3\u0088"+
		"\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\5\u008a\u077c"+
		"\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0783\n\u008b"+
		"\3\u008c\5\u008c\u0786\n\u008c\3\u008c\3\u008c\5\u008c\u078a\n\u008c\3"+
		"\u008c\3\u008c\3\u008d\5\u008d\u078f\n\u008d\3\u008d\3\u008d\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0799\n\u008d\3\u008e\3"+
		"\u008e\5\u008e\u079d\n\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3"+
		"\u008f\3\u008f\7\u008f\u07a6\n\u008f\f\u008f\16\u008f\u07a9\13\u008f\5"+
		"\u008f\u07ab\n\u008f\3\u0090\3\u0090\3\u0090\7\u0090\u07b0\n\u0090\f\u0090"+
		"\16\u0090\u07b3\13\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u07c2"+
		"\n\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\7\u0094\u07cd\n\u0094\f\u0094\16\u0094\u07d0\13\u0094\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\5\u0095\u07d6\n\u0095\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098"+
		"\3\u0098\7\u0098\u07e5\n\u0098\f\u0098\16\u0098\u07e8\13\u0098\3\u0099"+
		"\3\u0099\3\u0099\7\u0099\u07ed\n\u0099\f\u0099\16\u0099\u07f0\13\u0099"+
		"\3\u0099\5\u0099\u07f3\n\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\5\u009a\u07fb\n\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c"+
		"\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a3\3\u00a3"+
		"\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u0823\n\u00a8"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u082a\n\u00a9\f\u00a9"+
		"\16\u00a9\u082d\13\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\5\u00aa\u0836\n\u00aa\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0842\n\u00ad\3\u00ae"+
		"\3\u00ae\3\u00ae\5\u00ae\u0847\n\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\7\u00af\u0851\n\u00af\f\u00af\16\u00af"+
		"\u0854\13\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3"+
		"\u0865\n\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u086c\n"+
		"\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\7\u00b6\u0873\n\u00b6\f"+
		"\u00b6\16\u00b6\u0876\13\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\5\u00b7\u087d\n\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\5\u00b9\u0887\n\u00b9\3\u00ba\3\u00ba\3\u00ba\5\u00ba"+
		"\u088c\n\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\5\u00bb\u0896\n\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\7\u00bc\u089e\n\u00bc\f\u00bc\16\u00bc\u08a1\13\u00bc\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\7\u00bd\u08ae\n\u00bd\f\u00bd\16\u00bd\u08b1\13\u00bd\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u08ba\n\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\7\u00bf\u08bf\n\u00bf\f\u00bf\16\u00bf\u08c2"+
		"\13\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u08c9\n\u00c0"+
		"\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\5\u00c2\u08d4\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\7\u00c3"+
		"\u08db\n\u00c3\f\u00c3\16\u00c3\u08de\13\u00c3\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\5\u00c4\u08e5\n\u00c4\3\u00c5\3\u00c5\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u08ef\n\u00c7\3\u00c8\3\u00c8"+
		"\3\u00c8\5\u00c8\u08f4\n\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\7\u00c9\u08fe\n\u00c9\f\u00c9\16\u00c9\u0901"+
		"\13\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\7\u00cc\u0911\n\u00cc"+
		"\f\u00cc\16\u00cc\u0914\13\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\7\u00cd\u091b\n\u00cd\f\u00cd\16\u00cd\u091e\13\u00cd\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0925\n\u00ce\3\u00cf\3\u00cf\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0930\n\u00d0"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\7\u00d1\u0937\n\u00d1\f\u00d1"+
		"\16\u00d1\u093a\13\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2"+
		"\u0941\n\u00d2\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5"+
		"\3\u00d5\5\u00d5\u094b\n\u00d5\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0950\n"+
		"\u00d6\3\u00d6\3\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\7\u00d7\u095a\n\u00d7\f\u00d7\16\u00d7\u095d\13\u00d7\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da"+
		"\5\u00da\u096a\n\u00da\3\u00da\3\u00da\3\u00da\7\u00da\u096f\n\u00da\f"+
		"\u00da\16\u00da\u0972\13\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\5\u00db\u0979\n\u00db\3\u00dc\3\u00dc\3\u00dd\3\u00dd\5\u00dd\u097f\n"+
		"\u00dd\3\u00de\3\u00de\3\u00de\5\u00de\u0984\n\u00de\3\u00de\3\u00de\5"+
		"\u00de\u0988\n\u00de\3\u00df\3\u00df\5\u00df\u098c\n\u00df\3\u00df\3\u00df"+
		"\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0993\n\u00e0\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e2\3\u00e2\3\u00e2\7\u00e2\u099c\n\u00e2\f\u00e2\16\u00e2"+
		"\u099f\13\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e3\3\u00e3\3\u00e3\7\u00e3"+
		"\u09a7\n\u00e3\f\u00e3\16\u00e3\u09aa\13\u00e3\3\u00e3\3\u00e3\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e5\3\u00e5\3\u00e5\7\u00e5\u09b6"+
		"\n\u00e5\f\u00e5\16\u00e5\u09b9\13\u00e5\3\u00e6\3\u00e6\7\u00e6\u09bd"+
		"\n\u00e6\f\u00e6\16\u00e6\u09c0\13\u00e6\3\u00e7\3\u00e7\3\u00e7\5\u00e7"+
		"\u09c5\n\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u09cc\n"+
		"\u00e8\3\u00e9\6\u00e9\u09cf\n\u00e9\r\u00e9\16\u00e9\u09d0\3\u00ea\3"+
		"\u00ea\3\u00ea\3\u00ea\5\u00ea\u09d7\n\u00ea\3\u00ea\5\u00ea\u09da\n\u00ea"+
		"\3\u00eb\6\u00eb\u09dd\n\u00eb\r\u00eb\16\u00eb\u09de\3\u00ec\3\u00ec"+
		"\6\u00ec\u09e3\n\u00ec\r\u00ec\16\u00ec\u09e4\3\u00ec\3\u00ec\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee"+
		"\u09f2\n\u00ee\3\u00ee\3\u00ee\6\u00ee\u09f6\n\u00ee\r\u00ee\16\u00ee"+
		"\u09f7\7\u00ee\u09fa\n\u00ee\f\u00ee\16\u00ee\u09fd\13\u00ee\3\u00ef\3"+
		"\u00ef\3\u00ef\3\u00ef\3\u00ef\5\u00ef\u0a04\n\u00ef\3\u00f0\6\u00f0\u0a07"+
		"\n\u00f0\r\u00f0\16\u00f0\u0a08\3\u00f0\2\32\24(N^dj\u0080\u00aa\u00da"+
		"\u0126\u0150\u015c\u016a\u0176\u0178\u017c\u0184\u0190\u0196\u0198\u01a0"+
		"\u01ac\u01b2\u01da\u00f1\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc"+
		"\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4"+
		"\u01d6\u01d8\u01da\u01dc\u01de\2\16\3\2\36\37\4\2\u0090\u0090\u00a5\u00a5"+
		"\4\2\u008c\u008c\u0094\u0094\4\2JJ[[\4\2\7\f\61\u009e\4\2##vv\r\2\61:"+
		"@@CCyy||\u0086\u0086\u008c\u008c\u0093\u0093\u009e\u009e\u00a3\u00a5\u00a7"+
		"\u00a7\13\2\61:@@CCyy||\u0086\u0086\u0093\u0094\u009e\u009e\u00a3\u00a5"+
		"\f\2\61:@@CCyy||\u0086\u0086\u008c\u008c\u0093\u0093\u009e\u009e\u00a3"+
		"\u00a7\f\2\61:@@CCyy||\u0086\u0086\u008c\u008c\u0093\u0093\u009e\u009e"+
		"\u00a3\u00a5\5\2\26\27$$&&\5\2\4\4\r\16\26\27\2\u0a9a\2\u01e0\3\2\2\2"+
		"\4\u01f1\3\2\2\2\6\u01fa\3\2\2\2\b\u0200\3\2\2\2\n\u0206\3\2\2\2\f\u021b"+
		"\3\2\2\2\16\u0223\3\2\2\2\20\u022c\3\2\2\2\22\u023c\3\2\2\2\24\u0246\3"+
		"\2\2\2\26\u0257\3\2\2\2\30\u025a\3\2\2\2\32\u0267\3\2\2\2\34\u0270\3\2"+
		"\2\2\36\u027a\3\2\2\2 \u0283\3\2\2\2\"\u028e\3\2\2\2$\u02a1\3\2\2\2&\u02b3"+
		"\3\2\2\2(\u02b9\3\2\2\2*\u02c6\3\2\2\2,\u02d4\3\2\2\2.\u02e4\3\2\2\2\60"+
		"\u02f4\3\2\2\2\62\u0306\3\2\2\2\64\u0309\3\2\2\2\66\u031c\3\2\2\28\u0333"+
		"\3\2\2\2:\u0335\3\2\2\2<\u0351\3\2\2\2>\u0353\3\2\2\2@\u0359\3\2\2\2B"+
		"\u035f\3\2\2\2D\u037b\3\2\2\2F\u037d\3\2\2\2H\u038a\3\2\2\2J\u0396\3\2"+
		"\2\2L\u039c\3\2\2\2N\u03a8\3\2\2\2P\u03bd\3\2\2\2R\u03c1\3\2\2\2T\u03f5"+
		"\3\2\2\2V\u03f7\3\2\2\2X\u03fa\3\2\2\2Z\u0400\3\2\2\2\\\u040c\3\2\2\2"+
		"^\u040e\3\2\2\2`\u041e\3\2\2\2b\u0420\3\2\2\2d\u043b\3\2\2\2f\u04b4\3"+
		"\2\2\2h\u04b8\3\2\2\2j\u04ba\3\2\2\2l\u04cd\3\2\2\2n\u04cf\3\2\2\2p\u04d4"+
		"\3\2\2\2r\u04db\3\2\2\2t\u04e3\3\2\2\2v\u0523\3\2\2\2x\u0525\3\2\2\2z"+
		"\u053e\3\2\2\2|\u0550\3\2\2\2~\u0552\3\2\2\2\u0080\u055c\3\2\2\2\u0082"+
		"\u0566\3\2\2\2\u0084\u056c\3\2\2\2\u0086\u0577\3\2\2\2\u0088\u0579\3\2"+
		"\2\2\u008a\u057e\3\2\2\2\u008c\u0581\3\2\2\2\u008e\u0586\3\2\2\2\u0090"+
		"\u0594\3\2\2\2\u0092\u05a7\3\2\2\2\u0094\u05ae\3\2\2\2\u0096\u05b0\3\2"+
		"\2\2\u0098\u05b4\3\2\2\2\u009a\u05b6\3\2\2\2\u009c\u05bf\3\2\2\2\u009e"+
		"\u05c8\3\2\2\2\u00a0\u05da\3\2\2\2\u00a2\u05dd\3\2\2\2\u00a4\u05e6\3\2"+
		"\2\2\u00a6\u05ee\3\2\2\2\u00a8\u05f6\3\2\2\2\u00aa\u0608\3\2\2\2\u00ac"+
		"\u0618\3\2\2\2\u00ae\u062a\3\2\2\2\u00b0\u062c\3\2\2\2\u00b2\u062f\3\2"+
		"\2\2\u00b4\u0633\3\2\2\2\u00b6\u0638\3\2\2\2\u00b8\u063c\3\2\2\2\u00ba"+
		"\u063e\3\2\2\2\u00bc\u0648\3\2\2\2\u00be\u064c\3\2\2\2\u00c0\u064e\3\2"+
		"\2\2\u00c2\u0652\3\2\2\2\u00c4\u0658\3\2\2\2\u00c6\u065a\3\2\2\2\u00c8"+
		"\u065c\3\2\2\2\u00ca\u065e\3\2\2\2\u00cc\u0660\3\2\2\2\u00ce\u0662\3\2"+
		"\2\2\u00d0\u066f\3\2\2\2\u00d2\u0673\3\2\2\2\u00d4\u0675\3\2\2\2\u00d6"+
		"\u067a\3\2\2\2\u00d8\u067f\3\2\2\2\u00da\u0681\3\2\2\2\u00dc\u068f\3\2"+
		"\2\2\u00de\u069d\3\2\2\2\u00e0\u069f\3\2\2\2\u00e2\u06ab\3\2\2\2\u00e4"+
		"\u06b7\3\2\2\2\u00e6\u06b9\3\2\2\2\u00e8\u06bd\3\2\2\2\u00ea\u06c8\3\2"+
		"\2\2\u00ec\u06d3\3\2\2\2\u00ee\u06e5\3\2\2\2\u00f0\u06ed\3\2\2\2\u00f2"+
		"\u06f9\3\2\2\2\u00f4\u06fb\3\2\2\2\u00f6\u06fd\3\2\2\2\u00f8\u0710\3\2"+
		"\2\2\u00fa\u0712\3\2\2\2\u00fc\u0719\3\2\2\2\u00fe\u0720\3\2\2\2\u0100"+
		"\u0729\3\2\2\2\u0102\u0732\3\2\2\2\u0104\u073b\3\2\2\2\u0106\u0752\3\2"+
		"\2\2\u0108\u0763\3\2\2\2\u010a\u0765\3\2\2\2\u010c\u0771\3\2\2\2\u010e"+
		"\u0773\3\2\2\2\u0110\u0775\3\2\2\2\u0112\u077b\3\2\2\2\u0114\u0782\3\2"+
		"\2\2\u0116\u0785\3\2\2\2\u0118\u078e\3\2\2\2\u011a\u079a\3\2\2\2\u011c"+
		"\u07a0\3\2\2\2\u011e\u07ac\3\2\2\2\u0120\u07b4\3\2\2\2\u0122\u07c1\3\2"+
		"\2\2\u0124\u07c3\3\2\2\2\u0126\u07c7\3\2\2\2\u0128\u07d5\3\2\2\2\u012a"+
		"\u07d7\3\2\2\2\u012c\u07dc\3\2\2\2\u012e\u07e1\3\2\2\2\u0130\u07e9\3\2"+
		"\2\2\u0132\u07fa\3\2\2\2\u0134\u07fc\3\2\2\2\u0136\u07fe\3\2\2\2\u0138"+
		"\u0801\3\2\2\2\u013a\u0804\3\2\2\2\u013c\u0807\3\2\2\2\u013e\u080a\3\2"+
		"\2\2\u0140\u080d\3\2\2\2\u0142\u080f\3\2\2\2\u0144\u0811\3\2\2\2\u0146"+
		"\u0813\3\2\2\2\u0148\u0815\3\2\2\2\u014a\u0817\3\2\2\2\u014c\u0819\3\2"+
		"\2\2\u014e\u0822\3\2\2\2\u0150\u0824\3\2\2\2\u0152\u0835\3\2\2\2\u0154"+
		"\u0837\3\2\2\2\u0156\u0839\3\2\2\2\u0158\u0841\3\2\2\2\u015a\u0843\3\2"+
		"\2\2\u015c\u084a\3\2\2\2\u015e\u0855\3\2\2\2\u0160\u0859\3\2\2\2\u0162"+
		"\u085d\3\2\2\2\u0164\u0864\3\2\2\2\u0166\u0866\3\2\2\2\u0168\u086b\3\2"+
		"\2\2\u016a\u086d\3\2\2\2\u016c\u087c\3\2\2\2\u016e\u087e\3\2\2\2\u0170"+
		"\u0886\3\2\2\2\u0172\u0888\3\2\2\2\u0174\u0895\3\2\2\2\u0176\u0897\3\2"+
		"\2\2\u0178\u08a2\3\2\2\2\u017a\u08b2\3\2\2\2\u017c\u08b9\3\2\2\2\u017e"+
		"\u08c8\3\2\2\2\u0180\u08ca\3\2\2\2\u0182\u08d3\3\2\2\2\u0184\u08d5\3\2"+
		"\2\2\u0186\u08e4\3\2\2\2\u0188\u08e6\3\2\2\2\u018a\u08e8\3\2\2\2\u018c"+
		"\u08ee\3\2\2\2\u018e\u08f0\3\2\2\2\u0190\u08f7\3\2\2\2\u0192\u0902\3\2"+
		"\2\2\u0194\u0906\3\2\2\2\u0196\u090a\3\2\2\2\u0198\u0915\3\2\2\2\u019a"+
		"\u0924\3\2\2\2\u019c\u0926\3\2\2\2\u019e\u092f\3\2\2\2\u01a0\u0931\3\2"+
		"\2\2\u01a2\u0940\3\2\2\2\u01a4\u0942\3\2\2\2\u01a6\u0944\3\2\2\2\u01a8"+
		"\u094a\3\2\2\2\u01aa\u094c\3\2\2\2\u01ac\u0953\3\2\2\2\u01ae\u095e\3\2"+
		"\2\2\u01b0\u0962\3\2\2\2\u01b2\u0969\3\2\2\2\u01b4\u0978\3\2\2\2\u01b6"+
		"\u097a\3\2\2\2\u01b8\u097e\3\2\2\2\u01ba\u0987\3\2\2\2\u01bc\u0989\3\2"+
		"\2\2\u01be\u0992\3\2\2\2\u01c0\u0994\3\2\2\2\u01c2\u0998\3\2\2\2\u01c4"+
		"\u09a3\3\2\2\2\u01c6\u09ad\3\2\2\2\u01c8\u09b2\3\2\2\2\u01ca\u09ba\3\2"+
		"\2\2\u01cc\u09c1\3\2\2\2\u01ce\u09cb\3\2\2\2\u01d0\u09ce\3\2\2\2\u01d2"+
		"\u09d9\3\2\2\2\u01d4\u09dc\3\2\2\2\u01d6\u09e0\3\2\2\2\u01d8\u09e8\3\2"+
		"\2\2\u01da\u09f1\3\2\2\2\u01dc\u0a03\3\2\2\2\u01de\u0a06\3\2\2\2\u01e0"+
		"\u01e1\7a\2\2\u01e1\u01e2\7S\2\2\u01e2\u01e7\5\u00caf\2\u01e3\u01e4\7"+
		"\22\2\2\u01e4\u01e5\5\u00f0y\2\u01e5\u01e6\7\23\2\2\u01e6\u01e8\3\2\2"+
		"\2\u01e7\u01e3\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01ea"+
		"\7e\2\2\u01ea\u01ec\5\u00caf\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2"+
		"\u01ec\u01ed\3\2\2\2\u01ed\u01ee\7\26\2\2\u01ee\u01ef\5\u009cO\2\u01ef"+
		"\u01f0\7\27\2\2\u01f0\3\3\2\2\2\u01f1\u01f2\7a\2\2\u01f2\u01f3\5\u00ca"+
		"f\2\u01f3\u01f4\7\22\2\2\u01f4\u01f5\5\u00aeX\2\u01f5\u01f6\7\23\2\2\u01f6"+
		"\u01f7\7\26\2\2\u01f7\u01f8\5\u009aN\2\u01f8\u01f9\7\27\2\2\u01f9\5\3"+
		"\2\2\2\u01fa\u01fb\5\u00ccg\2\u01fb\u01fc\7\22\2\2\u01fc\u01fd\5\u0080"+
		"A\2\u01fd\u01fe\7\23\2\2\u01fe\u01ff\7\16\2\2\u01ff\7\3\2\2\2\u0200\u0201"+
		"\5\u00ccg\2\u0201\u0202\7*\2\2\u0202\u0203\5d\63\2\u0203\u0204\7\16\2"+
		"\2\u0204\t\3\2\2\2\u0205\u0207\7\u0090\2\2\u0206\u0205\3\2\2\2\u0206\u0207"+
		"\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\7L\2\2\u0209\u020a\5\u00c8e\2"+
		"\u020a\u020b\7\r\2\2\u020b\u020d\5\u00aaV\2\u020c\u020e\5\u00a0Q\2\u020d"+
		"\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0217\3\2\2\2\u020f\u0210\7\u009a"+
		"\2\2\u0210\u0215\7p\2\2\u0211\u0212\7\22\2\2\u0212\u0213\5\u00eex\2\u0213"+
		"\u0214\7\23\2\2\u0214\u0216\3\2\2\2\u0215\u0211\3\2\2\2\u0215\u0216\3"+
		"\2\2\2\u0216\u0218\3\2\2\2\u0217\u020f\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021a\7\16\2\2\u021a\13\3\2\2\2\u021b\u021c\7\u0099"+
		"\2\2\u021c\u021f\5\u00caf\2\u021d\u021e\7e\2\2\u021e\u0220\5\u00caf\2"+
		"\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222"+
		"\5\26\f\2\u0222\r\3\2\2\2\u0223\u0224\7x\2\2\u0224\u0225\7\u0099\2\2\u0225"+
		"\u0226\5\u00caf\2\u0226\u0227\7\26\2\2\u0227\u0228\5&\24\2\u0228\u0229"+
		"\5\u00e0q\2\u0229\u022a\7\27\2\2\u022a\17\3\2\2\2\u022b\u022d\7\u0090"+
		"\2\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u022f\7S\2\2\u022f\u0234\5\u00caf\2\u0230\u0231\7\22\2\2\u0231\u0232"+
		"\5\u00f0y\2\u0232\u0233\7\23\2\2\u0233\u0235\3\2\2\2\u0234\u0230\3\2\2"+
		"\2\u0234\u0235\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0237\7e\2\2\u0237\u0239"+
		"\5\24\13\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2"+
		"\u023a\u023b\5\26\f\2\u023b\21\3\2\2\2\u023c\u023d\7\u008e\2\2\u023d\u0242"+
		"\5\u00caf\2\u023e\u023f\7\22\2\2\u023f\u0240\5\u00f0y\2\u0240\u0241\7"+
		"\23\2\2\u0241\u0243\3\2\2\2\u0242\u023e\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0245\5\26\f\2\u0245\23\3\2\2\2\u0246\u0247\b\13"+
		"\1\2\u0247\u0248\5\u00caf\2\u0248\u024e\3\2\2\2\u0249\u024a\f\3\2\2\u024a"+
		"\u024b\7\17\2\2\u024b\u024d\5\u00caf\2\u024c\u0249\3\2\2\2\u024d\u0250"+
		"\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\25\3\2\2\2\u0250"+
		"\u024e\3\2\2\2\u0251\u0258\7\16\2\2\u0252\u0254\7\26\2\2\u0253\u0255\5"+
		"\u00dco\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\3\2\2\2"+
		"\u0256\u0258\7\27\2\2\u0257\u0251\3\2\2\2\u0257\u0252\3\2\2\2\u0258\27"+
		"\3\2\2\2\u0259\u025b\5\u00aaV\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2"+
		"\2\u025b\u025c\3\2\2\2\u025c\u025d\7\u0080\2\2\u025d\u025e\5\u0132\u009a"+
		"\2\u025e\u025f\7\22\2\2\u025f\u0260\5\u00d2j\2\u0260\u0261\7\23\2\2\u0261"+
		"\u0263\7\26\2\2\u0262\u0264\5\u00fe\u0080\2\u0263\u0262\3\2\2\2\u0263"+
		"\u0264\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\7\27\2\2\u0266\31\3\2\2"+
		"\2\u0267\u0268\7\u008d\2\2\u0268\u0269\5\u00c6d\2\u0269\u026b\7\26\2\2"+
		"\u026a\u026c\5\u00fe\u0080\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c"+
		"\u026d\3\2\2\2\u026d\u026e\7\27\2\2\u026e\33\3\2\2\2\u026f\u0271\7x\2"+
		"\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273"+
		"\7\u008d\2\2\u0273\u0274\5\u00c6d\2\u0274\u0276\7\26\2\2\u0275\u0277\5"+
		"\u00f6|\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\3\2\2\2"+
		"\u0278\u0279\7\27\2\2\u0279\35\3\2\2\2\u027a\u027b\7l\2\2\u027b\u027c"+
		"\5\u00c6d\2\u027c\u027e\7\26\2\2\u027d\u027f\5\u00fe\u0080\2\u027e\u027d"+
		"\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\7\27\2\2"+
		"\u0281\37\3\2\2\2\u0282\u0284\7x\2\2\u0283\u0282\3\2\2\2\u0283\u0284\3"+
		"\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\7l\2\2\u0286\u0287\5\u00c6d\2\u0287"+
		"\u0289\7\26\2\2\u0288\u028a\5\u00f6|\2\u0289\u0288\3\2\2\2\u0289\u028a"+
		"\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\7\27\2\2\u028c!\3\2\2\2\u028d"+
		"\u028f\7\u0090\2\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290"+
		"\3\2\2\2\u0290\u0291\7x\2\2\u0291\u0292\7\u0088\2\2\u0292\u0297\5\u00ca"+
		"f\2\u0293\u0294\7\22\2\2\u0294\u0295\5\u00f0y\2\u0295\u0296\7\23\2\2\u0296"+
		"\u0298\3\2\2\2\u0297\u0293\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2"+
		"\2\2\u0299\u029a\7\26\2\2\u029a\u029c\5&\24\2\u029b\u029d\5\u00e0q\2\u029c"+
		"\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\7\27"+
		"\2\2\u029f#\3\2\2\2\u02a0\u02a2\7\u0090\2\2\u02a1\u02a0\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\7x\2\2\u02a4\u02a5\7S\2"+
		"\2\u02a5\u02aa\5\u00caf\2\u02a6\u02a7\7\22\2\2\u02a7\u02a8\5\u00f0y\2"+
		"\u02a8\u02a9\7\23\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a6\3\2\2\2\u02aa\u02ab"+
		"\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\7\26\2\2\u02ad\u02af\5&\24\2"+
		"\u02ae\u02b0\5\u00e0q\2\u02af\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0"+
		"\u02b1\3\2\2\2\u02b1\u02b2\7\27\2\2\u02b2%\3\2\2\2\u02b3\u02b4\7S\2\2"+
		"\u02b4\u02b5\7N\2\2\u02b5\u02b6\7\26\2\2\u02b6\u02b7\5(\25\2\u02b7\u02b8"+
		"\7\27\2\2\u02b8\'\3\2\2\2\u02b9\u02ba\b\25\1\2\u02ba\u02bb\5\u00e4s\2"+
		"\u02bb\u02bc\7\16\2\2\u02bc\u02c3\3\2\2\2\u02bd\u02be\f\3\2\2\u02be\u02bf"+
		"\5\u00e4s\2\u02bf\u02c0\7\16\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02bd\3\2\2"+
		"\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4)"+
		"\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c8\7D\2\2\u02c7\u02c9\5\u00aaV\2"+
		"\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb"+
		"\7t\2\2\u02cb\u02cc\5\u00bc_\2\u02cc\u02ce\7\22\2\2\u02cd\u02cf\5\u00ce"+
		"h\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0"+
		"\u02d1\7\23\2\2\u02d1\u02d2\7\16\2\2\u02d2+\3\2\2\2\u02d3\u02d5\5\u00aa"+
		"V\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6"+
		"\u02d7\7t\2\2\u02d7\u02d8\5\u00bc_\2\u02d8\u02da\7\22\2\2\u02d9\u02db"+
		"\5\u00ceh\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2"+
		"\2\u02dc\u02dd\7\23\2\2\u02dd\u02df\7\26\2\2\u02de\u02e0\5\u00fe\u0080"+
		"\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2"+
		"\7\27\2\2\u02e2-\3\2\2\2\u02e3\u02e5\5\u00d8m\2\u02e4\u02e3\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02e8\7x\2\2\u02e7\u02e6\3\2"+
		"\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\7t\2\2\u02ea"+
		"\u02eb\5\u00bc_\2\u02eb\u02ed\7\22\2\2\u02ec\u02ee\5\u00ceh\2\u02ed\u02ec"+
		"\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\7\23\2\2"+
		"\u02f0\u02f1\7\26\2\2\u02f1\u02f2\5\u00f6|\2\u02f2\u02f3\7\27\2\2\u02f3"+
		"/\3\2\2\2\u02f4\u02f5\7\u0093\2\2\u02f5\u02f6\7t\2\2\u02f6\u02f7\7\u00a9"+
		"\2\2\u02f7\u02f8\7\22\2\2\u02f8\u02f9\7\23\2\2\u02f9\u02fa\7\26\2\2\u02fa"+
		"\u02fb\5\u00fe\u0080\2\u02fb\u02fc\7\27\2\2\u02fc\u0304\7\u0098\2\2\u02fd"+
		"\u02fe\7\26\2\2\u02fe\u02ff\5\u0100\u0081\2\u02ff\u0300\7\27\2\2\u0300"+
		"\u0305\3\2\2\2\u0301\u0302\5\u00ccg\2\u0302\u0303\7\16\2\2\u0303\u0305"+
		"\3\2\2\2\u0304\u02fd\3\2\2\2\u0304\u0301\3\2\2\2\u0305\61\3\2\2\2\u0306"+
		"\u0307\5d\63\2\u0307\u0308\7\16\2\2\u0308\63\3\2\2\2\u0309\u030e\5\u00d8"+
		"m\2\u030a\u030b\7\22\2\2\u030b\u030c\5\u00f0y\2\u030c\u030d\7\23\2\2\u030d"+
		"\u030f\3\2\2\2\u030e\u030a\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2"+
		"\2\2\u0310\u0313\5\u00c6d\2\u0311\u0312\7*\2\2\u0312\u0314\5\u0112\u008a"+
		"\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\65\3\2\2\2\u0315\u031d"+
		"\58\35\2\u0316\u031a\7\26\2\2\u0317\u0318\5\u00fe\u0080\2\u0318\u0319"+
		"\7\27\2\2\u0319\u031b\3\2\2\2\u031a\u0317\3\2\2\2\u031a\u031b\3\2\2\2"+
		"\u031b\u031d\3\2\2\2\u031c\u0315\3\2\2\2\u031c\u0316\3\2\2\2\u031d\67"+
		"\3\2\2\2\u031e\u031f\5Z.\2\u031f\u0320\7\16\2\2\u0320\u0334\3\2\2\2\u0321"+
		"\u0334\5\u0084C\2\u0322\u0334\5\u0088E\2\u0323\u0334\5<\37\2\u0324\u0334"+
		"\5:\36\2\u0325\u0334\5V,\2\u0326\u0334\5X-\2\u0327\u0334\5L\'\2\u0328"+
		"\u0334\5B\"\2\u0329\u0334\5F$\2\u032a\u0334\5J&\2\u032b\u0334\5H%\2\u032c"+
		"\u0334\5R*\2\u032d\u0334\5P)\2\u032e\u0334\5r:\2\u032f\u0334\5> \2\u0330"+
		"\u0334\5@!\2\u0331\u0334\5,\27\2\u0332\u0334\5\u00f4{\2\u0333\u031e\3"+
		"\2\2\2\u0333\u0321\3\2\2\2\u0333\u0322\3\2\2\2\u0333\u0323\3\2\2\2\u0333"+
		"\u0324\3\2\2\2\u0333\u0325\3\2\2\2\u0333\u0326\3\2\2\2\u0333\u0327\3\2"+
		"\2\2\u0333\u0328\3\2\2\2\u0333\u0329\3\2\2\2\u0333\u032a\3\2\2\2\u0333"+
		"\u032b\3\2\2\2\u0333\u032c\3\2\2\2\u0333\u032d\3\2\2\2\u0333\u032e\3\2"+
		"\2\2\u0333\u032f\3\2\2\2\u0333\u0330\3\2\2\2\u0333\u0331\3\2\2\2\u0333"+
		"\u0332\3\2\2\2\u03349\3\2\2\2\u0335\u0336\7i\2\2\u0336\u0337\7\22\2\2"+
		"\u0337\u0338\7\23\2\2\u0338\u0339\7\16\2\2\u0339;\3\2\2\2\u033a\u033b"+
		"\7Z\2\2\u033b\u033c\7\22\2\2\u033c\u033d\5\u00a6T\2\u033d\u033e\7\23\2"+
		"\2\u033e\u033f\7\16\2\2\u033f\u0352\3\2\2\2\u0340\u0341\7\u0091\2\2\u0341"+
		"\u0342\7\22\2\2\u0342\u0343\5\u00a6T\2\u0343\u0344\7\23\2\2\u0344\u0345"+
		"\7\16\2\2\u0345\u0352\3\2\2\2\u0346\u0347\7Z\2\2\u0347\u0348\7\22\2\2"+
		"\u0348\u0349\5\u00a6T\2\u0349\u034a\7\23\2\2\u034a\u034b\7G\2\2\u034b"+
		"\u034c\7\u0091\2\2\u034c\u034d\7\22\2\2\u034d\u034e\5\u00a6T\2\u034e\u034f"+
		"\7\23\2\2\u034f\u0350\7\16\2\2\u0350\u0352\3\2\2\2\u0351\u033a\3\2\2\2"+
		"\u0351\u0340\3\2\2\2\u0351\u0346\3\2\2\2\u0352=\3\2\2\2\u0353\u0354\7"+
		"\u009a\2\2\u0354\u0355\7\22\2\2\u0355\u0356\5\u0124\u0093\2\u0356\u0357"+
		"\7\23\2\2\u0357\u0358\5\66\34\2\u0358?\3\2\2\2\u0359\u035a\7\u009a\2\2"+
		"\u035a\u035b\7\22\2\2\u035b\u035c\5\u00caf\2\u035c\u035d\7\23\2\2\u035d"+
		"\u035e\5\66\34\2\u035eA\3\2\2\2\u035f\u0360\7\u0092\2\2\u0360\u0361\7"+
		"\22\2\2\u0361\u0362\5d\63\2\u0362\u0363\7\23\2\2\u0363\u0364\7\26\2\2"+
		"\u0364\u036a\5\u0102\u0082\2\u0365\u0366\7X\2\2\u0366\u0368\7\r\2\2\u0367"+
		"\u0369\5\u00fe\u0080\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036b"+
		"\3\2\2\2\u036a\u0365\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c"+
		"\u036d\7\27\2\2\u036dC\3\2\2\2\u036e\u036f\7Q\2\2\u036f\u0370\5\u0108"+
		"\u0085\2\u0370\u0372\7\r\2\2\u0371\u0373\5\u00fe\u0080\2\u0372\u0371\3"+
		"\2\2\2\u0372\u0373\3\2\2\2\u0373\u037c\3\2\2\2\u0374\u0375\7Q\2\2\u0375"+
		"\u0376\7o\2\2\u0376\u0377\5\u0106\u0084\2\u0377\u0379\7\r\2\2\u0378\u037a"+
		"\5\u00fe\u0080\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037c\3"+
		"\2\2\2\u037b\u036e\3\2\2\2\u037b\u0374\3\2\2\2\u037cE\3\2\2\2\u037d\u037e"+
		"\7j\2\2\u037e\u037f\7^\2\2\u037f\u0380\7\22\2\2\u0380\u0383\5\u00c6d\2"+
		"\u0381\u0382\7\17\2\2\u0382\u0384\5\u00c6d\2\u0383\u0381\3\2\2\2\u0383"+
		"\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\7o\2\2\u0386\u0387\5d\63"+
		"\2\u0387\u0388\7\23\2\2\u0388\u0389\5\66\34\2\u0389G\3\2\2\2\u038a\u038b"+
		"\7\\\2\2\u038b\u038d\7\26\2\2\u038c\u038e\5\u00fe\u0080\2\u038d\u038c"+
		"\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\7\27\2\2"+
		"\u0390\u0391\7\u009d\2\2\u0391\u0392\7\22\2\2\u0392\u0393\5d\63\2\u0393"+
		"\u0394\7\23\2\2\u0394\u0395\7\16\2\2\u0395I\3\2\2\2\u0396\u0397\7\u009d"+
		"\2\2\u0397\u0398\7\22\2\2\u0398\u0399\5d\63\2\u0399\u039a\7\23\2\2\u039a"+
		"\u039b\5\66\34\2\u039bK\3\2\2\2\u039c\u039d\7n\2\2\u039d\u039e\7\22\2"+
		"\2\u039e\u039f\5d\63\2\u039f\u03a0\7\23\2\2\u03a0\u03a2\5\66\34\2\u03a1"+
		"\u03a3\5N(\2\u03a2\u03a1\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a6\3\2\2"+
		"\2\u03a4\u03a5\7_\2\2\u03a5\u03a7\5\66\34\2\u03a6\u03a4\3\2\2\2\u03a6"+
		"\u03a7\3\2\2\2\u03a7M\3\2\2\2\u03a8\u03a9\b(\1\2\u03a9\u03aa\7_\2\2\u03aa"+
		"\u03ab\7n\2\2\u03ab\u03ac\7\22\2\2\u03ac\u03ad\5d\63\2\u03ad\u03ae\7\23"+
		"\2\2\u03ae\u03af\5\66\34\2\u03af\u03ba\3\2\2\2\u03b0\u03b1\f\3\2\2\u03b1"+
		"\u03b2\7_\2\2\u03b2\u03b3\7n\2\2\u03b3\u03b4\7\22\2\2\u03b4\u03b5\5d\63"+
		"\2\u03b5\u03b6\7\23\2\2\u03b6\u03b7\5\66\34\2\u03b7\u03b9\3\2\2\2\u03b8"+
		"\u03b0\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba\u03b8\3\2\2\2\u03ba\u03bb\3\2"+
		"\2\2\u03bbO\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd\u03be\7\u0095\2\2\u03be"+
		"\u03bf\5d\63\2\u03bf\u03c0\7\16\2\2\u03c0Q\3\2\2\2\u03c1\u03c2\7\u0097"+
		"\2\2\u03c2\u03c3\7\22\2\2\u03c3\u03c4\5\u00c6d\2\u03c4\u03c5\7\23\2\2"+
		"\u03c5\u03c7\7\26\2\2\u03c6\u03c8\5\u00fe\u0080\2\u03c7\u03c6\3\2\2\2"+
		"\u03c7\u03c8\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cb\7\27\2\2\u03ca\u03cc"+
		"\5\u0104\u0083\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03d6\3"+
		"\2\2\2\u03cd\u03ce\7R\2\2\u03ce\u03cf\7\22\2\2\u03cf\u03d0\7H\2\2\u03d0"+
		"\u03d1\7\23\2\2\u03d1\u03d3\7\26\2\2\u03d2\u03d4\5\u00fe\u0080\2\u03d3"+
		"\u03d2\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\7\27"+
		"\2\2\u03d6\u03cd\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03de\3\2\2\2\u03d8"+
		"\u03d9\7h\2\2\u03d9\u03db\7\26\2\2\u03da\u03dc\5\u00fe\u0080\2\u03db\u03da"+
		"\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03df\7\27\2\2"+
		"\u03de\u03d8\3\2\2\2\u03de\u03df\3\2\2\2\u03dfS\3\2\2\2\u03e0\u03e1\7"+
		"R\2\2\u03e1\u03e2\7\22\2\2\u03e2\u03e3\5\u00ccg\2\u03e3\u03e4\7\23\2\2"+
		"\u03e4\u03e6\7\26\2\2\u03e5\u03e7\5\u00fe\u0080\2\u03e6\u03e5\3\2\2\2"+
		"\u03e6\u03e7\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\7\27\2\2\u03e9\u03f6"+
		"\3\2\2\2\u03ea\u03eb\7R\2\2\u03eb\u03ec\7o\2\2\u03ec\u03ed\7\22\2\2\u03ed"+
		"\u03ee\5\u009eP\2\u03ee\u03ef\7\23\2\2\u03ef\u03f1\7\26\2\2\u03f0\u03f2"+
		"\5\u00fe\u0080\2\u03f1\u03f0\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\3"+
		"\2\2\2\u03f3\u03f4\7\27\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03e0\3\2\2\2\u03f5"+
		"\u03ea\3\2\2\2\u03f6U\3\2\2\2\u03f7\u03f8\7O\2\2\u03f8\u03f9\7\16\2\2"+
		"\u03f9W\3\2\2\2\u03fa\u03fc\7\u0089\2\2\u03fb\u03fd\5d\63\2\u03fc\u03fb"+
		"\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\7\16\2\2"+
		"\u03ffY\3\2\2\2\u0400\u0401\5\\/\2\u0401\u0403\7\22\2\2\u0402\u0404\5"+
		"\u0080A\2\u0403\u0402\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405\3\2\2\2"+
		"\u0405\u0406\7\23\2\2\u0406[\3\2\2\2\u0407\u040d\5\u00bc_\2\u0408\u0409"+
		"\5^\60\2\u0409\u040a\7\21\2\2\u040a\u040b\5\u00bc_\2\u040b\u040d\3\2\2"+
		"\2\u040c\u0407\3\2\2\2\u040c\u0408\3\2\2\2\u040d]\3\2\2\2\u040e\u040f"+
		"\b\60\1\2\u040f\u0410\5\u00c4c\2\u0410\u0415\3\2\2\2\u0411\u0412\f\3\2"+
		"\2\u0412\u0414\5`\61\2\u0413\u0411\3\2\2\2\u0414\u0417\3\2\2\2\u0415\u0413"+
		"\3\2\2\2\u0415\u0416\3\2\2\2\u0416_\3\2\2\2\u0417\u0415\3\2\2\2\u0418"+
		"\u0419\7\21\2\2\u0419\u041f\5\u00c6d\2\u041a\u041b\7\24\2\2\u041b\u041c"+
		"\5d\63\2\u041c\u041d\7\25\2\2\u041d\u041f\3\2\2\2\u041e\u0418\3\2\2\2"+
		"\u041e\u041a\3\2\2\2\u041fa\3\2\2\2\u0420\u0421\5\u01d6\u00ec\2\u0421"+
		"c\3\2\2\2\u0422\u0423\b\63\1\2\u0423\u043c\5\u01d6\u00ec\2\u0424\u043c"+
		"\5\u01b8\u00dd\2\u0425\u043c\5j\66\2\u0426\u043c\5l\67\2\u0427\u0428\7"+
		"\37\2\2\u0428\u043c\5d\63&\u0429\u042a\7\31\2\2\u042a\u043c\5d\63%\u042b"+
		"\u042c\7\22\2\2\u042c\u042d\5\u00d8m\2\u042d\u042e\7\23\2\2\u042e\u042f"+
		"\5d\63\37\u042f\u043c\3\2\2\2\u0430\u0431\7<\2\2\u0431\u0432\7\22\2\2"+
		"\u0432\u0433\5d\63\2\u0433\u0434\7\23\2\2\u0434\u043c\3\2\2\2\u0435\u0436"+
		"\7c\2\2\u0436\u0437\7\22\2\2\u0437\u0438\5\u00c6d\2\u0438\u0439\7\23\2"+
		"\2\u0439\u043c\3\2\2\2\u043a\u043c\5h\65\2\u043b\u0422\3\2\2\2\u043b\u0424"+
		"\3\2\2\2\u043b\u0425\3\2\2\2\u043b\u0426\3\2\2\2\u043b\u0427\3\2\2\2\u043b"+
		"\u0429\3\2\2\2\u043b\u042b\3\2\2\2\u043b\u0430\3\2\2\2\u043b\u0435\3\2"+
		"\2\2\u043b\u043a\3\2\2\2\u043c\u04b1\3\2\2\2\u043d\u043e\f$\2\2\u043e"+
		"\u043f\5\u0142\u00a2\2\u043f\u0440\5d\63%\u0440\u04b0\3\2\2\2\u0441\u0442"+
		"\f#\2\2\u0442\u0443\5\u0144\u00a3\2\u0443\u0444\5d\63$\u0444\u04b0\3\2"+
		"\2\2\u0445\u0446\f\"\2\2\u0446\u0447\5\u0148\u00a5\2\u0447\u0448\5d\63"+
		"#\u0448\u04b0\3\2\2\2\u0449\u044a\f!\2\2\u044a\u044b\5\u0146\u00a4\2\u044b"+
		"\u044c\5d\63\"\u044c\u04b0\3\2\2\2\u044d\u044e\f \2\2\u044e\u044f\t\2"+
		"\2\2\u044f\u04b0\5d\63!\u0450\u0451\f\36\2\2\u0451\u0452\7&\2\2\u0452"+
		"\u04b0\5d\63\37\u0453\u0454\f\35\2\2\u0454\u0455\7\'\2\2\u0455\u04b0\5"+
		"d\63\36\u0456\u0457\f\34\2\2\u0457\u0458\7$\2\2\u0458\u04b0\5d\63\35\u0459"+
		"\u045a\f\33\2\2\u045a\u045b\7%\2\2\u045b\u04b0\5d\63\34\u045c\u045d\f"+
		"\30\2\2\u045d\u045e\7r\2\2\u045e\u045f\7z\2\2\u045f\u04b0\5d\63\31\u0460"+
		"\u0461\f\27\2\2\u0461\u0462\7r\2\2\u0462\u04b0\5d\63\30\u0463\u0464\f"+
		"\26\2\2\u0464\u0465\7,\2\2\u0465\u04b0\5d\63\27\u0466\u0467\f\25\2\2\u0467"+
		"\u0468\7+\2\2\u0468\u04b0\5d\63\26\u0469\u046a\f\24\2\2\u046a\u046b\7"+
		"-\2\2\u046b\u04b0\5d\63\25\u046c\u046d\f\23\2\2\u046d\u046e\7V\2\2\u046e"+
		"\u04b0\5d\63\24\u046f\u0470\f\22\2\2\u0470\u0471\7o\2\2\u0471\u04b0\5"+
		"d\63\23\u0472\u0473\f\21\2\2\u0473\u0474\7m\2\2\u0474\u04b0\5d\63\22\u0475"+
		"\u0476\f\20\2\2\u0476\u0477\7m\2\2\u0477\u0478\7E\2\2\u0478\u04b0\5d\63"+
		"\21\u0479\u047a\f\17\2\2\u047a\u047b\7m\2\2\u047b\u047c\7H\2\2\u047c\u04b0"+
		"\5d\63\20\u047d\u047e\f\16\2\2\u047e\u047f\7z\2\2\u047f\u0480\7V\2\2\u0480"+
		"\u04b0\5d\63\17\u0481\u0482\f\r\2\2\u0482\u0483\7z\2\2\u0483\u0484\7o"+
		"\2\2\u0484\u04b0\5d\63\16\u0485\u0486\f\f\2\2\u0486\u0487\7z\2\2\u0487"+
		"\u0488\7m\2\2\u0488\u04b0\5d\63\r\u0489\u048a\f\13\2\2\u048a\u048b\7z"+
		"\2\2\u048b\u048c\7m\2\2\u048c\u048d\7E\2\2\u048d\u04b0\5d\63\f\u048e\u048f"+
		"\f\n\2\2\u048f\u0490\7z\2\2\u0490\u0491\7m\2\2\u0491\u0492\7H\2\2\u0492"+
		"\u04b0\5d\63\13\u0493\u0494\f\t\2\2\u0494\u0495\7\35\2\2\u0495\u04b0\5"+
		"d\63\n\u0496\u0497\f\b\2\2\u0497\u0498\7\33\2\2\u0498\u04b0\5d\63\t\u0499"+
		"\u049a\f\7\2\2\u049a\u049b\7\30\2\2\u049b\u049c\5d\63\2\u049c\u049d\7"+
		"\r\2\2\u049d\u049e\5d\63\b\u049e\u04b0\3\2\2\2\u049f\u04a0\f\32\2\2\u04a0"+
		"\u04a1\7r\2\2\u04a1\u04a2\7z\2\2\u04a2\u04b0\5f\64\2\u04a3\u04a4\f\31"+
		"\2\2\u04a4\u04a5\7r\2\2\u04a5\u04b0\5f\64\2\u04a6\u04a7\f\3\2\2\u04a7"+
		"\u04a8\7j\2\2\u04a8\u04a9\7^\2\2\u04a9\u04aa\7\22\2\2\u04aa\u04ab\5\u00c6"+
		"d\2\u04ab\u04ac\7o\2\2\u04ac\u04ad\5d\63\2\u04ad\u04ae\7\23\2\2\u04ae"+
		"\u04b0\3\2\2\2\u04af\u043d\3\2\2\2\u04af\u0441\3\2\2\2\u04af\u0445\3\2"+
		"\2\2\u04af\u0449\3\2\2\2\u04af\u044d\3\2\2\2\u04af\u0450\3\2\2\2\u04af"+
		"\u0453\3\2\2\2\u04af\u0456\3\2\2\2\u04af\u0459\3\2\2\2\u04af\u045c\3\2"+
		"\2\2\u04af\u0460\3\2\2\2\u04af\u0463\3\2\2\2\u04af\u0466\3\2\2\2\u04af"+
		"\u0469\3\2\2\2\u04af\u046c\3\2\2\2\u04af\u046f\3\2\2\2\u04af\u0472\3\2"+
		"\2\2\u04af\u0475\3\2\2\2\u04af\u0479\3\2\2\2\u04af\u047d\3\2\2\2\u04af"+
		"\u0481\3\2\2\2\u04af\u0485\3\2\2\2\u04af\u0489\3\2\2\2\u04af\u048e\3\2"+
		"\2\2\u04af\u0493\3\2\2\2\u04af\u0496\3\2\2\2\u04af\u0499\3\2\2\2\u04af"+
		"\u049f\3\2\2\2\u04af\u04a3\3\2\2\2\u04af\u04a6\3\2\2\2\u04b0\u04b3\3\2"+
		"\2\2\u04b1\u04af\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2e\3\2\2\2\u04b3\u04b1"+
		"\3\2\2\2\u04b4\u04b5\6\64$\3\u04b5\u04b6\7\u00a5\2\2\u04b6\u04b7\5\u00d8"+
		"m\2\u04b7g\3\2\2\2\u04b8\u04b9\5\u00caf\2\u04b9i\3\2\2\2\u04ba\u04bb\b"+
		"\66\1\2\u04bb\u04bc\5\u010c\u0087\2\u04bc\u04c1\3\2\2\2\u04bd\u04be\f"+
		"\3\2\2\u04be\u04c0\5z>\2\u04bf\u04bd\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1"+
		"\u04bf\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2k\3\2\2\2\u04c3\u04c1\3\2\2\2"+
		"\u04c4\u04ce\5n8\2\u04c5\u04ce\5p9\2\u04c6\u04ce\5t;\2\u04c7\u04ce\5v"+
		"<\2\u04c8\u04ce\5\u012a\u0096\2\u04c9\u04ce\5\u012c\u0097\2\u04ca\u04ce"+
		"\5x=\2\u04cb\u04ce\5Z.\2\u04cc\u04ce\5|?\2\u04cd\u04c4\3\2\2\2\u04cd\u04c5"+
		"\3\2\2\2\u04cd\u04c6\3\2\2\2\u04cd\u04c7\3\2\2\2\u04cd\u04c8\3\2\2\2\u04cd"+
		"\u04c9\3\2\2\2\u04cd\u04ca\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04cc\3\2"+
		"\2\2\u04cem\3\2\2\2\u04cf\u04d0\7>\2\2\u04d0\u04d1\7\22\2\2\u04d1\u04d2"+
		"\5d\63\2\u04d2\u04d3\7\23\2\2\u04d3o\3\2\2\2\u04d4\u04d5\7=\2\2\u04d5"+
		"\u04d7\7\22\2\2\u04d6\u04d8\5d\63\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3"+
		"\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\7\23\2\2\u04daq\3\2\2\2\u04db\u04dc"+
		"\7\u009e\2\2\u04dc\u04dd\7\22\2\2\u04dd\u04de\5d\63\2\u04de\u04df\7\23"+
		"\2\2\u04df\u04e0\7\u0096\2\2\u04e0\u04e1\5d\63\2\u04e1\u04e2\7\16\2\2"+
		"\u04e2s\3\2\2\2\u04e3\u04e4\7g\2\2\u04e4\u04e5\7\22\2\2\u04e5\u04e6\5"+
		"d\63\2\u04e6\u04e7\7\23\2\2\u04e7\u04e8\7\u009a\2\2\u04e8\u04e9\7\22\2"+
		"\2\u04e9\u04ea\5\u00c6d\2\u04ea\u04eb\7\23\2\2\u04eb\u04ec\7\u009c\2\2"+
		"\u04ec\u04ed\7\22\2\2\u04ed\u04ee\5d\63\2\u04ee\u04ef\7\23\2\2\u04efu"+
		"\3\2\2\2\u04f0\u04f1\7f\2\2\u04f1\u04f6\7~\2\2\u04f2\u04f3\7\22\2\2\u04f3"+
		"\u04f4\5\u00b2Z\2\u04f4\u04f5\7\23\2\2\u04f5\u04f7\3\2\2\2\u04f6\u04f2"+
		"\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9\7\u009c\2"+
		"\2\u04f9\u04fa\7\22\2\2\u04fa\u04fb\5d\63\2\u04fb\u04fc\7\23\2\2\u04fc"+
		"\u0524\3\2\2\2\u04fd\u0512\7f\2\2\u04fe\u0503\7E\2\2\u04ff\u0500\7\22"+
		"\2\2\u0500\u0501\5\u00b2Z\2\u0501\u0502\7\23\2\2\u0502\u0504\3\2\2\2\u0503"+
		"\u04ff\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0513\3\2\2\2\u0505\u0506\7\22"+
		"\2\2\u0506\u0507\5\u00b2Z\2\u0507\u0508\7\23\2\2\u0508\u050a\3\2\2\2\u0509"+
		"\u0505\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\7\u008b"+
		"\2\2\u050c\u050d\7\22\2\2\u050d\u050e\5d\63\2\u050e\u050f\7\u0096\2\2"+
		"\u050f\u0510\5d\63\2\u0510\u0511\7\23\2\2\u0511\u0513\3\2\2\2\u0512\u04fe"+
		"\3\2\2\2\u0512\u0509\3\2\2\2\u0513\u0519\3\2\2\2\u0514\u0515\7\u009c\2"+
		"\2\u0515\u0516\7\22\2\2\u0516\u0517\5d\63\2\u0517\u0518\7\23\2\2\u0518"+
		"\u051a\3\2\2\2\u0519\u0514\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u0521\3\2"+
		"\2\2\u051b\u051c\7\u0082\2\2\u051c\u051d\7P\2\2\u051d\u051e\7\22\2\2\u051e"+
		"\u051f\5\u012e\u0098\2\u051f\u0520\7\23\2\2\u0520\u0522\3\2\2\2\u0521"+
		"\u051b\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0524\3\2\2\2\u0523\u04f0\3\2"+
		"\2\2\u0523\u04fd\3\2\2\2\u0524w\3\2\2\2\u0525\u0527\7\u008f\2\2\u0526"+
		"\u0528\7[\2\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0529\3\2"+
		"\2\2\u0529\u052a\7\22\2\2\u052a\u0530\5j\66\2\u052b\u052c\7\17\2\2\u052c"+
		"\u052d\5\u0138\u009d\2\u052d\u052e\7*\2\2\u052e\u052f\5j\66\2\u052f\u0531"+
		"\3\2\2\2\u0530\u052b\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532\3\2\2\2\u0532"+
		"\u0533\7\23\2\2\u0533y\3\2\2\2\u0534\u0535\7\21\2\2\u0535\u053f\5\u00c6"+
		"d\2\u0536\u0537\7\24\2\2\u0537\u0538\5d\63\2\u0538\u0539\7\25\2\2\u0539"+
		"\u053f\3\2\2\2\u053a\u053b\7\24\2\2\u053b\u053c\5\u0122\u0092\2\u053c"+
		"\u053d\7\25\2\2\u053d\u053f\3\2\2\2\u053e\u0534\3\2\2\2\u053e\u0536\3"+
		"\2\2\2\u053e\u053a\3\2\2\2\u053f{\3\2\2\2\u0540\u0541\5\u00b2Z\2\u0541"+
		"\u0542\7\22\2\2\u0542\u0545\5~@\2\u0543\u0544\7\17\2\2\u0544\u0546\5\u0080"+
		"A\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0547\3\2\2\2\u0547"+
		"\u0548\7\23\2\2\u0548\u0551\3\2\2\2\u0549\u054a\5\u00b2Z\2\u054a\u054c"+
		"\7\22\2\2\u054b\u054d\5\u0080A\2\u054c\u054b\3\2\2\2\u054c\u054d\3\2\2"+
		"\2\u054d\u054e\3\2\2\2\u054e\u054f\7\23\2\2\u054f\u0551\3\2\2\2\u0550"+
		"\u0540\3\2\2\2\u0550\u0549\3\2\2\2\u0551}\3\2\2\2\u0552\u0553\7k\2\2\u0553"+
		"\u0554\5\u0140\u00a1\2\u0554\u0555\5d\63\2\u0555\u0556\6@&\3\u0556\177"+
		"\3\2\2\2\u0557\u0558\bA\1\2\u0558\u0559\5d\63\2\u0559\u055a\6A\'\3\u055a"+
		"\u055d\3\2\2\2\u055b\u055d\5\u0082B\2\u055c\u0557\3\2\2\2\u055c\u055b"+
		"\3\2\2\2\u055d\u0563\3\2\2\2\u055e\u055f\f\3\2\2\u055f\u0560\7\17\2\2"+
		"\u0560\u0562\5\u0082B\2\u0561\u055e\3\2\2\2\u0562\u0565\3\2\2\2\u0563"+
		"\u0561\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0081\3\2\2\2\u0565\u0563\3\2"+
		"\2\2\u0566\u056a\5\u00c6d\2\u0567\u0568\5\u0140\u00a1\2\u0568\u0569\5"+
		"d\63\2\u0569\u056b\3\2\2\2\u056a\u0567\3\2\2\2\u056a\u056b\3\2\2\2\u056b"+
		"\u0083\3\2\2\2\u056c\u056d\5\u0126\u0094\2\u056d\u056e\5\u0140\u00a1\2"+
		"\u056e\u056f\5d\63\2\u056f\u0570\7\16\2\2\u0570\u0085\3\2\2\2\u0571\u0572"+
		"\7\21\2\2\u0572\u0578\5\u00c6d\2\u0573\u0574\7\24\2\2\u0574\u0575\5d\63"+
		"\2\u0575\u0576\7\25\2\2\u0576\u0578\3\2\2\2\u0577\u0571\3\2\2\2\u0577"+
		"\u0573\3\2\2\2\u0578\u0087\3\2\2\2\u0579\u057a\5\u00eex\2\u057a\u057b"+
		"\5\u0140\u00a1\2\u057b\u057c\5d\63\2\u057c\u057d\7\16\2\2\u057d\u0089"+
		"\3\2\2\2\u057e\u057f\7|\2\2\u057f\u008b\3\2\2\2\u0580\u0582\5\u008eH\2"+
		"\u0581\u0580\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0584"+
		"\5\u014a\u00a6\2\u0584\u0585\7\2\2\3\u0585\u008d\3\2\2\2\u0586\u058c\5"+
		"\u0090I\2\u0587\u0588\5\u014c\u00a7\2\u0588\u0589\5\u0090I\2\u0589\u058b"+
		"\3\2\2\2\u058a\u0587\3\2\2\2\u058b\u058e\3\2\2\2\u058c\u058a\3\2\2\2\u058c"+
		"\u058d\3\2\2\2\u058d\u008f\3\2\2\2\u058e\u058c\3\2\2\2\u058f\u0590\5\u00f4"+
		"{\2\u0590\u0591\5\u014c\u00a7\2\u0591\u0593\3\2\2\2\u0592\u058f\3\2\2"+
		"\2\u0593\u0596\3\2\2\2\u0594\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u059c"+
		"\3\2\2\2\u0596\u0594\3\2\2\2\u0597\u0598\5\u0092J\2\u0598\u0599\5\u014c"+
		"\u00a7\2\u0599\u059b\3\2\2\2\u059a\u0597\3\2\2\2\u059b\u059e\3\2\2\2\u059c"+
		"\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u05a5\3\2\2\2\u059e\u059c\3\2"+
		"\2\2\u059f\u05a6\5\n\6\2\u05a0\u05a6\5\u00b6\\\2\u05a1\u05a6\5\u0096L"+
		"\2\u05a2\u05a6\5\u0098M\2\u05a3\u05a6\5\u00b8]\2\u05a4\u05a6\5\u00f2z"+
		"\2\u05a5\u059f\3\2\2\2\u05a5\u05a0\3\2\2\2\u05a5\u05a1\3\2\2\2\u05a5\u05a2"+
		"\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a5\u05a4\3\2\2\2\u05a6\u0091\3\2\2\2\u05a7"+
		"\u05ac\5\u0094K\2\u05a8\u05a9\7\22\2\2\u05a9\u05aa\5\u0112\u008a\2\u05aa"+
		"\u05ab\7\23\2\2\u05ab\u05ad\3\2\2\2\u05ac\u05a8\3\2\2\2\u05ac\u05ad\3"+
		"\2\2\2\u05ad\u0093\3\2\2\2\u05ae\u05af\7\u00a8\2\2\u05af\u0095\3\2\2\2"+
		"\u05b0\u05b1\5\"\22\2\u05b1\u0097\3\2\2\2\u05b2\u05b5\5\2\2\2\u05b3\u05b5"+
		"\5\4\3\2\u05b4\u05b2\3\2\2\2\u05b4\u05b3\3\2\2\2\u05b5\u0099\3\2\2\2\u05b6"+
		"\u05bc\5\b\5\2\u05b7\u05b8\5\u014c\u00a7\2\u05b8\u05b9\5\b\5\2\u05b9\u05bb"+
		"\3\2\2\2\u05ba\u05b7\3\2\2\2\u05bb\u05be\3\2\2\2\u05bc\u05ba\3\2\2\2\u05bc"+
		"\u05bd\3\2\2\2\u05bd\u009b\3\2\2\2\u05be\u05bc\3\2\2\2\u05bf\u05c5\5\6"+
		"\4\2\u05c0\u05c1\5\u014c\u00a7\2\u05c1\u05c2\5\6\4\2\u05c2\u05c4\3\2\2"+
		"\2\u05c3\u05c0\3\2\2\2\u05c4\u05c7\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c5\u05c6"+
		"\3\2\2\2\u05c6\u009d\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c8\u05cd\5\u00ccg"+
		"\2\u05c9\u05ca\7\17\2\2\u05ca\u05cc\5\u00ccg\2\u05cb\u05c9\3\2\2\2\u05cc"+
		"\u05cf\3\2\2\2\u05cd\u05cb\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u009f\3\2"+
		"\2\2\u05cf\u05cd\3\2\2\2\u05d0\u05d1\7o\2\2\u05d1\u05db\5\u00a2R\2\u05d2"+
		"\u05d3\7o\2\2\u05d3\u05db\5\u00a4S\2\u05d4\u05d5\7o\2\2\u05d5\u05db\5"+
		"\u00a8U\2\u05d6\u05d7\7s\2\2\u05d7\u05db\7\u00a9\2\2\u05d8\u05d9\7s\2"+
		"\2\u05d9\u05db\5d\63\2\u05da\u05d0\3\2\2\2\u05da\u05d2\3\2\2\2\u05da\u05d4"+
		"\3\2\2\2\u05da\u05d6\3\2\2\2\u05da\u05d8\3\2\2\2\u05db\u00a1\3\2\2\2\u05dc"+
		"\u05de\7w\2\2\u05dd\u05dc\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\3\2"+
		"\2\2\u05df\u05e1\7\24\2\2\u05e0\u05e2\5\u00a6T\2\u05e1\u05e0\3\2\2\2\u05e1"+
		"\u05e2\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\7\25\2\2\u05e4\u00a3\3"+
		"\2\2\2\u05e5\u05e7\7w\2\2\u05e6\u05e5\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7"+
		"\u05e8\3\2\2\2\u05e8\u05ea\7&\2\2\u05e9\u05eb\5\u00a6T\2\u05ea\u05e9\3"+
		"\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ed\7$\2\2\u05ed"+
		"\u00a5\3\2\2\2\u05ee\u05f3\5d\63\2\u05ef\u05f0\7\17\2\2\u05f0\u05f2\5"+
		"d\63\2\u05f1\u05ef\3\2\2\2\u05f2\u05f5\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f3"+
		"\u05f4\3\2\2\2\u05f4\u00a7\3\2\2\2\u05f5\u05f3\3\2\2\2\u05f6\u05f7\7\24"+
		"\2\2\u05f7\u05f8\5d\63\2\u05f8\u05f9\7\20\2\2\u05f9\u05fa\5d\63\2\u05fa"+
		"\u05fb\7\25\2\2\u05fb\u00a9\3\2\2\2\u05fc\u05fd\bV\1\2\u05fd\u0609\5\u00ac"+
		"W\2\u05fe\u05ff\7B\2\2\u05ff\u0600\7&\2\2\u0600\u0601\5\u00aaV\2\u0601"+
		"\u0602\7$\2\2\u0602\u0609\3\2\2\2\u0603\u0604\7A\2\2\u0604\u0605\7&\2"+
		"\2\u0605\u0606\5\u00aaV\2\u0606\u0607\7$\2\2\u0607\u0609\3\2\2\2\u0608"+
		"\u05fc\3\2\2\2\u0608\u05fe\3\2\2\2\u0608\u0603\3\2\2\2\u0609\u0613\3\2"+
		"\2\2\u060a\u060b\f\7\2\2\u060b\u0612\7(\2\2\u060c\u060d\f\6\2\2\u060d"+
		"\u060e\7\24\2\2\u060e\u0612\7\25\2\2\u060f\u0610\f\5\2\2\u0610\u0612\7"+
		")\2\2\u0611\u060a\3\2\2\2\u0611\u060c\3\2\2\2\u0611\u060f\3\2\2\2\u0612"+
		"\u0615\3\2\2\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u00ab\3\2"+
		"\2\2\u0615\u0613\3\2\2\2\u0616\u0619\5\u00aeX\2\u0617\u0619\5\u00b0Y\2"+
		"\u0618\u0616\3\2\2\2\u0618\u0617\3\2\2\2\u0619\u00ad\3\2\2\2\u061a\u062b"+
		"\7\61\2\2\u061b\u062b\7\62\2\2\u061c\u062b\7\63\2\2\u061d\u062b\7?\2\2"+
		"\u061e\u062b\7\64\2\2\u061f\u062b\7\65\2\2\u0620\u062b\7=\2\2\u0621\u062b"+
		"\7\66\2\2\u0622\u062b\78\2\2\u0623\u062b\7\67\2\2\u0624\u062b\79\2\2\u0625"+
		"\u062b\7:\2\2\u0626\u062b\7<\2\2\u0627\u062b\7>\2\2\u0628\u062b\7@\2\2"+
		"\u0629\u062b\7C\2\2\u062a\u061a\3\2\2\2\u062a\u061b\3\2\2\2\u062a\u061c"+
		"\3\2\2\2\u062a\u061d\3\2\2\2\u062a\u061e\3\2\2\2\u062a\u061f\3\2\2\2\u062a"+
		"\u0620\3\2\2\2\u062a\u0621\3\2\2\2\u062a\u0622\3\2\2\2\u062a\u0623\3\2"+
		"\2\2\u062a\u0624\3\2\2\2\u062a\u0625\3\2\2\2\u062a\u0626\3\2\2\2\u062a"+
		"\u0627\3\2\2\2\u062a\u0628\3\2\2\2\u062a\u0629\3\2\2\2\u062b\u00af\3\2"+
		"\2\2\u062c\u062d\7\u00a4\2\2\u062d\u00b1\3\2\2\2\u062e\u0630\7w\2\2\u062f"+
		"\u062e\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0632\5\u00b0"+
		"Y\2\u0632\u00b3\3\2\2\2\u0633\u0634\7<\2\2\u0634\u00b5\3\2\2\2\u0635\u0639"+
		"\5\20\t\2\u0636\u0639\5$\23\2\u0637\u0639\5\22\n\2\u0638\u0635\3\2\2\2"+
		"\u0638\u0636\3\2\2\2\u0638\u0637\3\2\2\2\u0639\u00b7\3\2\2\2\u063a\u063d"+
		"\5\f\7\2\u063b\u063d\5\16\b\2\u063c\u063a\3\2\2\2\u063c\u063b\3\2\2\2"+
		"\u063d\u00b9\3\2\2\2\u063e\u0643\5\u00caf\2\u063f\u0640\7\17\2\2\u0640"+
		"\u0642\5\u00caf\2\u0641\u063f\3\2\2\2\u0642\u0645\3\2\2\2\u0643\u0641"+
		"\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u00bb\3\2\2\2\u0645\u0643\3\2\2\2\u0646"+
		"\u0649\5\u00c6d\2\u0647\u0649\5\u00caf\2\u0648\u0646\3\2\2\2\u0648\u0647"+
		"\3\2\2\2\u0649\u00bd\3\2\2\2\u064a\u064d\5\u00c4c\2\u064b\u064d\5\u0134"+
		"\u009b\2\u064c\u064a\3\2\2\2\u064c\u064b\3\2\2\2\u064d\u00bf\3\2\2\2\u064e"+
		"\u064f\6a,\3\u064f\u0650\7\37\2\2\u0650\u0651\5\u00c2b\2\u0651\u00c1\3"+
		"\2\2\2\u0652\u0653\6b-\3\u0653\u0654\5\u00be`\2\u0654\u00c3\3\2\2\2\u0655"+
		"\u0659\5\u00c6d\2\u0656\u0659\5\u00caf\2\u0657\u0659\5\u00ccg\2\u0658"+
		"\u0655\3\2\2\2\u0658\u0656\3\2\2\2\u0658\u0657\3\2\2\2\u0659\u00c5\3\2"+
		"\2\2\u065a\u065b\7\u00a5\2\2\u065b\u00c7\3\2\2\2\u065c\u065d\t\3\2\2\u065d"+
		"\u00c9\3\2\2\2\u065e\u065f\7\u00a4\2\2\u065f\u00cb\3\2\2\2\u0660\u0661"+
		"\7\u00a3\2\2\u0661\u00cd\3\2\2\2\u0662\u0667\5\u00d0i\2\u0663\u0664\7"+
		"\17\2\2\u0664\u0666\5\u00d0i\2\u0665\u0663\3\2\2\2\u0666\u0669\3\2\2\2"+
		"\u0667\u0665\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u00cf\3\2\2\2\u0669\u0667"+
		"\3\2\2\2\u066a\u0670\5\u00d6l\2\u066b\u066d\7w\2\2\u066c\u066b\3\2\2\2"+
		"\u066c\u066d\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u0670\5\u00d2j\2\u066f"+
		"\u066a\3\2\2\2\u066f\u066c\3\2\2\2\u0670\u00d1\3\2\2\2\u0671\u0674\5\u00d4"+
		"k\2\u0672\u0674\5\64\33\2\u0673\u0671\3\2\2\2\u0673\u0672\3\2\2\2\u0674"+
		"\u00d3\3\2\2\2\u0675\u0678\5\u00c6d\2\u0676\u0677\7*\2\2\u0677\u0679\5"+
		"\u0112\u008a\2\u0678\u0676\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u00d5\3\2"+
		"\2\2\u067a\u067b\5\u00b4[\2\u067b\u067c\5\u00c6d\2\u067c\u00d7\3\2\2\2"+
		"\u067d\u0680\5\u00aaV\2\u067e\u0680\5\u00dan\2\u067f\u067d\3\2\2\2\u067f"+
		"\u067e\3\2\2\2\u0680\u00d9\3\2\2\2\u0681\u0682\bn\1\2\u0682\u0683\7H\2"+
		"\2\u0683\u068c\3\2\2\2\u0684\u0685\f\4\2\2\u0685\u0686\7\24\2\2\u0686"+
		"\u068b\7\25\2\2\u0687\u0688\f\3\2\2\u0688\u0689\7\26\2\2\u0689\u068b\7"+
		"\27\2\2\u068a\u0684\3\2\2\2\u068a\u0687\3\2\2\2\u068b\u068e\3\2\2\2\u068c"+
		"\u068a\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u00db\3\2\2\2\u068e\u068c\3\2"+
		"\2\2\u068f\u0695\5\u00dep\2\u0690\u0691\5\u014c\u00a7\2\u0691\u0692\5"+
		"\u00dep\2\u0692\u0694\3\2\2\2\u0693\u0690\3\2\2\2\u0694\u0697\3\2\2\2"+
		"\u0695\u0693\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u00dd\3\2\2\2\u0697\u0695"+
		"\3\2\2\2\u0698\u069e\5\32\16\2\u0699\u069e\5\36\20\2\u069a\u069e\5,\27"+
		"\2\u069b\u069e\5*\26\2\u069c\u069e\5\30\r\2\u069d\u0698\3\2\2\2\u069d"+
		"\u0699\3\2\2\2\u069d\u069a\3\2\2\2\u069d\u069b\3\2\2\2\u069d\u069c\3\2"+
		"\2\2\u069e\u00df\3\2\2\2\u069f\u06a5\5\u00e2r\2\u06a0\u06a1\5\u014c\u00a7"+
		"\2\u06a1\u06a2\5\u00e2r\2\u06a2\u06a4\3\2\2\2\u06a3\u06a0\3\2\2\2\u06a4"+
		"\u06a7\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u00e1\3\2"+
		"\2\2\u06a7\u06a5\3\2\2\2\u06a8\u06ac\5 \21\2\u06a9\u06ac\5\34\17\2\u06aa"+
		"\u06ac\5.\30\2\u06ab\u06a8\3\2\2\2\u06ab\u06a9\3\2\2\2\u06ab\u06aa\3\2"+
		"\2\2\u06ac\u00e3\3\2\2\2\u06ad\u06ae\7\7\2\2\u06ae\u06b8\5\u0198\u00cd"+
		"\2\u06af\u06b0\7\b\2\2\u06b0\u06b8\5\u01b2\u00da\2\u06b1\u06b2\7\t\2\2"+
		"\u06b2\u06b8\5\u00e6t\2\u06b3\u06b4\7\n\2\2\u06b4\u06b8\5\u00e6t\2\u06b5"+
		"\u06b6\7\13\2\2\u06b6\u06b8\5\u00eav\2\u06b7\u06ad\3\2\2\2\u06b7\u06af"+
		"\3\2\2\2\u06b7\u06b1\3\2\2\2\u06b7\u06b3\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b8"+
		"\u00e5\3\2\2\2\u06b9\u06bb\5\u00c4c\2\u06ba\u06bc\5\u00e8u\2\u06bb\u06ba"+
		"\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u00e7\3\2\2\2\u06bd\u06be\7k\2\2\u06be"+
		"\u06bf\5\u013a\u009e\2\u06bf\u06c0\7\r\2\2\u06c0\u06c5\5\u00c4c\2\u06c1"+
		"\u06c2\7\21\2\2\u06c2\u06c4\5\u00c4c\2\u06c3\u06c1\3\2\2\2\u06c4\u06c7"+
		"\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u00e9\3\2\2\2\u06c7"+
		"\u06c5\3\2\2\2\u06c8\u06cd\5\u00c4c\2\u06c9\u06ca\7\21\2\2\u06ca\u06cc"+
		"\5\u00c4c\2\u06cb\u06c9\3\2\2\2\u06cc\u06cf\3\2\2\2\u06cd\u06cb\3\2\2"+
		"\2\u06cd\u06ce\3\2\2\2\u06ce\u06d1\3\2\2\2\u06cf\u06cd\3\2\2\2\u06d0\u06d2"+
		"\5\u00ecw\2\u06d1\u06d0\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u00eb\3\2\2"+
		"\2\u06d3\u06d4\7k\2\2\u06d4\u06d5\5\u013a\u009e\2\u06d5\u06d7\7\r\2\2"+
		"\u06d6\u06d8\7!\2\2\u06d7\u06d6\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u06d9"+
		"\3\2\2\2\u06d9\u06de\5\u0166\u00b4\2\u06da\u06db\7!\2\2\u06db\u06dd\5"+
		"\u0166\u00b4\2\u06dc\u06da\3\2\2\2\u06dd\u06e0\3\2\2\2\u06de\u06dc\3\2"+
		"\2\2\u06de\u06df\3\2\2\2\u06df\u06e3\3\2\2\2\u06e0\u06de\3\2\2\2\u06e1"+
		"\u06e2\7\21\2\2\u06e2\u06e4\5\u0166\u00b4\2\u06e3\u06e1\3\2\2\2\u06e3"+
		"\u06e4\3\2\2\2\u06e4\u00ed\3\2\2\2\u06e5\u06ea\5\u00c6d\2\u06e6\u06e7"+
		"\7\17\2\2\u06e7\u06e9\5\u00c6d\2\u06e8\u06e6\3\2\2\2\u06e9\u06ec\3\2\2"+
		"\2\u06ea\u06e8\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u00ef\3\2\2\2\u06ec\u06ea"+
		"\3\2\2\2\u06ed\u06f2\5\u00c8e\2\u06ee\u06ef\7\17\2\2\u06ef\u06f1\5\u00c8"+
		"e\2\u06f0\u06ee\3\2\2\2\u06f1\u06f4\3\2\2\2\u06f2\u06f0\3\2\2\2\u06f2"+
		"\u06f3\3\2\2\2\u06f3\u00f1\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f5\u06fa\5*"+
		"\26\2\u06f6\u06fa\5,\27\2\u06f7\u06fa\5.\30\2\u06f8\u06fa\5\60\31\2\u06f9"+
		"\u06f5\3\2\2\2\u06f9\u06f6\3\2\2\2\u06f9\u06f7\3\2\2\2\u06f9\u06f8\3\2"+
		"\2\2\u06fa\u00f3\3\2\2\2\u06fb\u06fc\7\6\2\2\u06fc\u00f5\3\2\2\2\u06fd"+
		"\u0703\5\u00f8}\2\u06fe\u06ff\5\u014c\u00a7\2\u06ff\u0700\5\u00f8}\2\u0700"+
		"\u0702\3\2\2\2\u0701\u06fe\3\2\2\2\u0702\u0705\3\2\2\2\u0703\u0701\3\2"+
		"\2\2\u0703\u0704\3\2\2\2\u0704\u00f7\3\2\2\2\u0705\u0703\3\2\2\2\u0706"+
		"\u0707\7\7\2\2\u0707\u0711\5\u0182\u00c2\2\u0708\u0709\7\b\2\2\u0709\u0711"+
		"\5\u019e\u00d0\2\u070a\u070b\7\t\2\2\u070b\u0711\5\u00fa~\2\u070c\u070d"+
		"\7\n\2\2\u070d\u0711\5\u00fa~\2\u070e\u070f\7\13\2\2\u070f\u0711\5\u00fc"+
		"\177\2\u0710\u0706\3\2\2\2\u0710\u0708\3\2\2\2\u0710\u070a\3\2\2\2\u0710"+
		"\u070c\3\2\2\2\u0710\u070e\3\2\2\2\u0711\u00f9\3\2\2\2\u0712\u0714\5\u0168"+
		"\u00b5\2\u0713\u0715\7\16\2\2\u0714\u0713\3\2\2\2\u0714\u0715\3\2\2\2"+
		"\u0715\u0717\3\2\2\2\u0716\u0718\5\u00e8u\2\u0717\u0716\3\2\2\2\u0717"+
		"\u0718\3\2\2\2\u0718\u00fb\3\2\2\2\u0719\u071b\5\u014e\u00a8\2\u071a\u071c"+
		"\7\16\2\2\u071b\u071a\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071e\3\2\2\2"+
		"\u071d\u071f\5\u00ecw\2\u071e\u071d\3\2\2\2\u071e\u071f\3\2\2\2\u071f"+
		"\u00fd\3\2\2\2\u0720\u0726\58\35\2\u0721\u0722\5\u014c\u00a7\2\u0722\u0723"+
		"\58\35\2\u0723\u0725\3\2\2\2\u0724\u0721\3\2\2\2\u0725\u0728\3\2\2\2\u0726"+
		"\u0724\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u00ff\3\2\2\2\u0728\u0726\3\2"+
		"\2\2\u0729\u072f\5\62\32\2\u072a\u072b\5\u014c\u00a7\2\u072b\u072c\5\62"+
		"\32\2\u072c\u072e\3\2\2\2\u072d\u072a\3\2\2\2\u072e\u0731\3\2\2\2\u072f"+
		"\u072d\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0101\3\2\2\2\u0731\u072f\3\2"+
		"\2\2\u0732\u0738\5D#\2\u0733\u0734\5\u014c\u00a7\2\u0734\u0735\5D#\2\u0735"+
		"\u0737\3\2\2\2\u0736\u0733\3\2\2\2\u0737\u073a\3\2\2\2\u0738\u0736\3\2"+
		"\2\2\u0738\u0739\3\2\2\2\u0739\u0103\3\2\2\2\u073a\u0738\3\2\2\2\u073b"+
		"\u0741\5T+\2\u073c\u073d\5\u014c\u00a7\2\u073d\u073e\5T+\2\u073e\u0740"+
		"\3\2\2\2\u073f\u073c\3\2\2\2\u0740\u0743\3\2\2\2\u0741\u073f\3\2\2\2\u0741"+
		"\u0742\3\2\2\2\u0742\u0105\3\2\2\2\u0743\u0741\3\2\2\2\u0744\u0745\7\24"+
		"\2\2\u0745\u0746\5\u0108\u0085\2\u0746\u0747\7\20\2\2\u0747\u0748\5\u0108"+
		"\u0085\2\u0748\u0749\7\25\2\2\u0749\u0753\3\2\2\2\u074a\u074b\7\24\2\2"+
		"\u074b\u074c\5\u010a\u0086\2\u074c\u074d\7\25\2\2\u074d\u0753\3\2\2\2"+
		"\u074e\u074f\7&\2\2\u074f\u0750\5\u010a\u0086\2\u0750\u0751\7$\2\2\u0751"+
		"\u0753\3\2\2\2\u0752\u0744\3\2\2\2\u0752\u074a\3\2\2\2\u0752\u074e\3\2"+
		"\2\2\u0753\u0107\3\2\2\2\u0754\u0764\7\u00a1\2\2\u0755\u0764\7\u00a2\2"+
		"\2\u0756\u0764\7\u00ab\2\2\u0757\u0764\7\u00ac\2\2\u0758\u0764\7\u00a0"+
		"\2\2\u0759\u0764\7\u00b0\2\2\u075a\u0764\7\u00af\2\2\u075b\u0764\7\u00a9"+
		"\2\2\u075c\u0764\7\u00ad\2\2\u075d\u0764\7\u00ae\2\2\u075e\u0764\7\u009f"+
		"\2\2\u075f\u0764\7\u00b1\2\2\u0760\u0764\7\u00b2\2\2\u0761\u0764\7\u00aa"+
		"\2\2\u0762\u0764\5\u008aF\2\u0763\u0754\3\2\2\2\u0763\u0755\3\2\2\2\u0763"+
		"\u0756\3\2\2\2\u0763\u0757\3\2\2\2\u0763\u0758\3\2\2\2\u0763\u0759\3\2"+
		"\2\2\u0763\u075a\3\2\2\2\u0763\u075b\3\2\2\2\u0763\u075c\3\2\2\2\u0763"+
		"\u075d\3\2\2\2\u0763\u075e\3\2\2\2\u0763\u075f\3\2\2\2\u0763\u0760\3\2"+
		"\2\2\u0763\u0761\3\2\2\2\u0763\u0762\3\2\2\2\u0764\u0109\3\2\2\2\u0765"+
		"\u076a\5\u0108\u0085\2\u0766\u0767\7\17\2\2\u0767\u0769\5\u0108\u0085"+
		"\2\u0768\u0766\3\2\2\2\u0769\u076c\3\2\2\2\u076a\u0768\3\2\2\2\u076a\u076b"+
		"\3\2\2\2\u076b\u010b\3\2\2\2\u076c\u076a\3\2\2\2\u076d\u0772\5\u0110\u0089"+
		"\2\u076e\u0772\5\u0112\u008a\2\u076f\u0772\5\u00c4c\2\u0770\u0772\5\u010e"+
		"\u0088\2\u0771\u076d\3\2\2\2\u0771\u076e\3\2\2\2\u0771\u076f\3\2\2\2\u0771"+
		"\u0770\3\2\2\2\u0772\u010d\3\2\2\2\u0773\u0774\t\4\2\2\u0774\u010f\3\2"+
		"\2\2\u0775\u0776\7\22\2\2\u0776\u0777\5d\63\2\u0777\u0778\7\23\2\2\u0778"+
		"\u0111\3\2\2\2\u0779\u077c\5\u0108\u0085\2\u077a\u077c\5\u0114\u008b\2"+
		"\u077b\u0779\3\2\2\2\u077b\u077a\3\2\2\2\u077c\u0113\3\2\2\2\u077d\u0783"+
		"\5\u00a8U\2\u077e\u0783\5\u00a2R\2\u077f\u0783\5\u00a4S\2\u0780\u0783"+
		"\5\u0118\u008d\2\u0781\u0783\5\u0116\u008c\2\u0782\u077d\3\2\2\2\u0782"+
		"\u077e\3\2\2\2\u0782\u077f\3\2\2\2\u0782\u0780\3\2\2\2\u0782\u0781\3\2"+
		"\2\2\u0783\u0115\3\2\2\2\u0784\u0786\7w\2\2\u0785\u0784\3\2\2\2\u0785"+
		"\u0786\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u0789\7\22\2\2\u0788\u078a\5"+
		"\u011c\u008f\2\u0789\u0788\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u078b\3\2"+
		"\2\2\u078b\u078c\7\23\2\2\u078c\u0117\3\2\2\2\u078d\u078f\7w\2\2\u078e"+
		"\u078d\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0798\3\2\2\2\u0790\u0791\7&"+
		"\2\2\u0791\u0792\5\u011e\u0090\2\u0792\u0793\7$\2\2\u0793\u0799\3\2\2"+
		"\2\u0794\u0799\7)\2\2\u0795\u0796\7&\2\2\u0796\u0797\7\r\2\2\u0797\u0799"+
		"\7$\2\2\u0798\u0790\3\2\2\2\u0798\u0794\3\2\2\2\u0798\u0795\3\2\2\2\u0799"+
		"\u0119\3\2\2\2\u079a\u079c\7\26\2\2\u079b\u079d\5\u011e\u0090\2\u079c"+
		"\u079b\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u079e\3\2\2\2\u079e\u079f\7\27"+
		"\2\2\u079f\u011b\3\2\2\2\u07a0\u07a1\5d\63\2\u07a1\u07aa\7\17\2\2\u07a2"+
		"\u07a7\5d\63\2\u07a3\u07a4\7\17\2\2\u07a4\u07a6\5d\63\2\u07a5\u07a3\3"+
		"\2\2\2\u07a6\u07a9\3\2\2\2\u07a7\u07a5\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8"+
		"\u07ab\3\2\2\2\u07a9\u07a7\3\2\2\2\u07aa\u07a2\3\2\2\2\u07aa\u07ab\3\2"+
		"\2\2\u07ab\u011d\3\2\2\2\u07ac\u07b1\5\u0120\u0091\2\u07ad\u07ae\7\17"+
		"\2\2\u07ae\u07b0\5\u0120\u0091\2\u07af\u07ad\3\2\2\2\u07b0\u07b3\3\2\2"+
		"\2\u07b1\u07af\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u011f\3\2\2\2\u07b3\u07b1"+
		"\3\2\2\2\u07b4\u07b5\5d\63\2\u07b5\u07b6\7\r\2\2\u07b6\u07b7\5d\63\2\u07b7"+
		"\u0121\3\2\2\2\u07b8\u07b9\5d\63\2\u07b9\u07ba\7\r\2\2\u07ba\u07bb\5d"+
		"\63\2\u07bb\u07c2\3\2\2\2\u07bc\u07bd\5d\63\2\u07bd\u07be\7\r\2\2\u07be"+
		"\u07c2\3\2\2\2\u07bf\u07c0\7\r\2\2\u07c0\u07c2\5d\63\2\u07c1\u07b8\3\2"+
		"\2\2\u07c1\u07bc\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c2\u0123\3\2\2\2\u07c3"+
		"\u07c4\5\u00c6d\2\u07c4\u07c5\5\u0140\u00a1\2\u07c5\u07c6\5d\63\2\u07c6"+
		"\u0125\3\2\2\2\u07c7\u07c8\b\u0094\1\2\u07c8\u07c9\5\u00c6d\2\u07c9\u07ce"+
		"\3\2\2\2\u07ca\u07cb\f\3\2\2\u07cb\u07cd\5\u0086D\2\u07cc\u07ca\3\2\2"+
		"\2\u07cd\u07d0\3\2\2\2\u07ce\u07cc\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u0127"+
		"\3\2\2\2\u07d0\u07ce\3\2\2\2\u07d1\u07d2\6\u0095\61\3\u07d2\u07d3\7\u00a5"+
		"\2\2\u07d3\u07d6\5\u00d8m\2\u07d4\u07d6\5d\63\2\u07d5\u07d1\3\2\2\2\u07d5"+
		"\u07d4\3\2\2\2\u07d6\u0129\3\2\2\2\u07d7\u07d8\7\u0086\2\2\u07d8\u07d9"+
		"\7E\2\2\u07d9\u07da\7k\2\2\u07da\u07db\5d\63\2\u07db\u012b\3\2\2\2\u07dc"+
		"\u07dd\7\u0086\2\2\u07dd\u07de\7~\2\2\u07de\u07df\7k\2\2\u07df\u07e0\5"+
		"d\63\2\u07e0\u012d\3\2\2\2\u07e1\u07e6\5\u0130\u0099\2\u07e2\u07e3\7\17"+
		"\2\2\u07e3\u07e5\5\u0130\u0099\2\u07e4\u07e2\3\2\2\2\u07e5\u07e8\3\2\2"+
		"\2\u07e6\u07e4\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u012f\3\2\2\2\u07e8\u07e6"+
		"\3\2\2\2\u07e9\u07ee\5\u00c6d\2\u07ea\u07eb\7\21\2\2\u07eb\u07ed\5\u00c6"+
		"d\2\u07ec\u07ea\3\2\2\2\u07ed\u07f0\3\2\2\2\u07ee\u07ec\3\2\2\2\u07ee"+
		"\u07ef\3\2\2\2\u07ef\u07f2\3\2\2\2\u07f0\u07ee\3\2\2\2\u07f1\u07f3\t\5"+
		"\2\2\u07f2\u07f1\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3\u0131\3\2\2\2\u07f4"+
		"\u07fb\7\36\2\2\u07f5\u07fb\7\37\2\2\u07f6\u07fb\5\u0142\u00a2\2\u07f7"+
		"\u07fb\5\u0144\u00a3\2\u07f8\u07fb\5\u0146\u00a4\2\u07f9\u07fb\5\u0148"+
		"\u00a5\2\u07fa\u07f4\3\2\2\2\u07fa\u07f5\3\2\2\2\u07fa\u07f6\3\2\2\2\u07fa"+
		"\u07f7\3\2\2\2\u07fa\u07f8\3\2\2\2\u07fa\u07f9\3\2\2\2\u07fb\u0133\3\2"+
		"\2\2\u07fc\u07fd\t\6\2\2\u07fd\u0135\3\2\2\2\u07fe\u07ff\7\u00a5\2\2\u07ff"+
		"\u0800\6\u009c\62\3\u0800\u0137\3\2\2\2\u0801\u0802\7\u00a5\2\2\u0802"+
		"\u0803\6\u009d\63\3\u0803\u0139\3\2\2\2\u0804\u0805\7\u00a5\2\2\u0805"+
		"\u0806\6\u009e\64\3\u0806\u013b\3\2\2\2\u0807\u0808\7\u00a5\2\2\u0808"+
		"\u0809\6\u009f\65\3\u0809\u013d\3\2\2\2\u080a\u080b\7\u00a5\2\2\u080b"+
		"\u080c\6\u00a0\66\3\u080c\u013f\3\2\2\2\u080d\u080e\7*\2\2\u080e\u0141"+
		"\3\2\2\2\u080f\u0810\7 \2\2\u0810\u0143\3\2\2\2\u0811\u0812\7!\2\2\u0812"+
		"\u0145\3\2\2\2\u0813\u0814\7\"\2\2\u0814\u0147\3\2\2\2\u0815\u0816\t\7"+
		"\2\2\u0816\u0149\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u014b\3\2\2\2\u0819"+
		"\u081a\3\2\2\2\u081a\u014d\3\2\2\2\u081b\u081c\7\u0089\2\2\u081c\u081d"+
		"\5\u0150\u00a9\2\u081d\u081e\7\16\2\2\u081e\u0823\3\2\2\2\u081f\u0820"+
		"\5\u0150\u00a9\2\u0820\u0821\7\16\2\2\u0821\u0823\3\2\2\2\u0822\u081b"+
		"\3\2\2\2\u0822\u081f\3\2\2\2\u0823\u014f\3\2\2\2\u0824\u0825\b\u00a9\1"+
		"\2\u0825\u0826\5\u0152\u00aa\2\u0826\u082b\3\2\2\2\u0827\u0828\f\3\2\2"+
		"\u0828\u082a\5\u0158\u00ad\2\u0829\u0827\3\2\2\2\u082a\u082d\3\2\2\2\u082b"+
		"\u0829\3\2\2\2\u082b\u082c\3\2\2\2\u082c\u0151\3\2\2\2\u082d\u082b\3\2"+
		"\2\2\u082e\u0836\5\u0154\u00ab\2\u082f\u0836\5\u0156\u00ac\2\u0830\u0836"+
		"\5\u0160\u00b1\2\u0831\u0836\5\u0162\u00b2\2\u0832\u0836\5\u0164\u00b3"+
		"\2\u0833\u0836\5\u015a\u00ae\2\u0834\u0836\5\u015e\u00b0\2\u0835\u082e"+
		"\3\2\2\2\u0835\u082f\3\2\2\2\u0835\u0830\3\2\2\2\u0835\u0831\3\2\2\2\u0835"+
		"\u0832\3\2\2\2\u0835\u0833\3\2\2\2\u0835\u0834\3\2\2\2\u0836\u0153\3\2"+
		"\2\2\u0837\u0838\5\u010e\u0088\2\u0838\u0155\3\2\2\2\u0839\u083a\5\u0136"+
		"\u009c\2\u083a\u083b\5\u015a\u00ae\2\u083b\u0157\3\2\2\2\u083c\u083d\7"+
		"\21\2\2\u083d\u0842\5\u015a\u00ae\2\u083e\u083f\7\21\2\2\u083f\u0842\5"+
		"\u0166\u00b4\2\u0840\u0842\5\u015e\u00b0\2\u0841\u083c\3\2\2\2\u0841\u083e"+
		"\3\2\2\2\u0841\u0840\3\2\2\2\u0842\u0159\3\2\2\2\u0843\u0844\5\u0166\u00b4"+
		"\2\u0844\u0846\7\22\2\2\u0845\u0847\5\u015c\u00af\2\u0846\u0845\3\2\2"+
		"\2\u0846\u0847\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u0849\7\23\2\2\u0849"+
		"\u015b\3\2\2\2\u084a\u084b\b\u00af\1\2\u084b\u084c\5\u0150\u00a9\2\u084c"+
		"\u0852\3\2\2\2\u084d\u084e\f\3\2\2\u084e\u084f\7\17\2\2\u084f\u0851\5"+
		"\u0150\u00a9\2\u0850\u084d\3\2\2\2\u0851\u0854\3\2\2\2\u0852\u0850\3\2"+
		"\2\2\u0852\u0853\3\2\2\2\u0853\u015d\3\2\2\2\u0854\u0852\3\2\2\2\u0855"+
		"\u0856\7\24\2\2\u0856\u0857\5\u0150\u00a9\2\u0857\u0858\7\25\2\2\u0858"+
		"\u015f\3\2\2\2\u0859\u085a\7\22\2\2\u085a\u085b\5\u0150\u00a9\2\u085b"+
		"\u085c\7\23\2\2\u085c\u0161\3\2\2\2\u085d\u085e\5\u0166\u00b4\2\u085e"+
		"\u0163\3\2\2\2\u085f\u0865\7\u00ab\2\2\u0860\u0865\7\u00ad\2\2\u0861\u0865"+
		"\7\u00a9\2\2\u0862\u0865\7\u009f\2\2\u0863\u0865\7\u00a0\2\2\u0864\u085f"+
		"\3\2\2\2\u0864\u0860\3\2\2\2\u0864\u0861\3\2\2\2\u0864\u0862\3\2\2\2\u0864"+
		"\u0863\3\2\2\2\u0865\u0165\3\2\2\2\u0866\u0867\t\b\2\2\u0867\u0167\3\2"+
		"\2\2\u0868\u0869\7\u0089\2\2\u0869\u086c\5\u016a\u00b6\2\u086a\u086c\5"+
		"\u016a\u00b6\2\u086b\u0868\3\2\2\2\u086b\u086a\3\2\2\2\u086c\u0169\3\2"+
		"\2\2\u086d\u086e\b\u00b6\1\2\u086e\u086f\5\u016c\u00b7\2\u086f\u0874\3"+
		"\2\2\2\u0870\u0871\f\3\2\2\u0871\u0873\5\u0170\u00b9\2\u0872\u0870\3\2"+
		"\2\2\u0873\u0876\3\2\2\2\u0874\u0872\3\2\2\2\u0874\u0875\3\2\2\2\u0875"+
		"\u016b\3\2\2\2\u0876\u0874\3\2\2\2\u0877\u087d\5\u016e\u00b8\2\u0878\u087d"+
		"\5\u017a\u00be\2\u0879\u087d\5\u017c\u00bf\2\u087a\u087d\5\u017e\u00c0"+
		"\2\u087b\u087d\5\u0172\u00ba\2\u087c\u0877\3\2\2\2\u087c\u0878\3\2\2\2"+
		"\u087c\u0879\3\2\2\2\u087c\u087a\3\2\2\2\u087c\u087b\3\2\2\2\u087d\u016d"+
		"\3\2\2\2\u087e\u087f\5\u010e\u0088\2\u087f\u016f\3\2\2\2\u0880\u0881\7"+
		"\21\2\2\u0881\u0887\5\u0172\u00ba\2\u0882\u0883\7\24\2\2\u0883\u0884\5"+
		"\u016a\u00b6\2\u0884\u0885\7\25\2\2\u0885\u0887\3\2\2\2\u0886\u0880\3"+
		"\2\2\2\u0886\u0882\3\2\2\2\u0887\u0171\3\2\2\2\u0888\u0889\5\u0180\u00c1"+
		"\2\u0889\u088b\7\22\2\2\u088a\u088c\5\u0174\u00bb\2\u088b\u088a\3\2\2"+
		"\2\u088b\u088c\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u088e\7\23\2\2\u088e"+
		"\u0173\3\2\2\2\u088f\u0896\5\u0176\u00bc\2\u0890\u0896\5\u0178\u00bd\2"+
		"\u0891\u0892\5\u0176\u00bc\2\u0892\u0893\7\17\2\2\u0893\u0894\5\u0178"+
		"\u00bd\2\u0894\u0896\3\2\2\2\u0895\u088f\3\2\2\2\u0895\u0890\3\2\2\2\u0895"+
		"\u0891\3\2\2\2\u0896\u0175\3\2\2\2\u0897\u0898\b\u00bc\1\2\u0898\u0899"+
		"\5\u016a\u00b6\2\u0899\u089f\3\2\2\2\u089a\u089b\f\3\2\2\u089b\u089c\7"+
		"\17\2\2\u089c\u089e\5\u016a\u00b6\2\u089d\u089a\3\2\2\2\u089e\u08a1\3"+
		"\2\2\2\u089f\u089d\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u0177\3\2\2\2\u08a1"+
		"\u089f\3\2\2\2\u08a2\u08a3\b\u00bd\1\2\u08a3\u08a4\5\u0180\u00c1\2\u08a4"+
		"\u08a5\7*\2\2\u08a5\u08a6\5\u016a\u00b6\2\u08a6\u08af\3\2\2\2\u08a7\u08a8"+
		"\f\3\2\2\u08a8\u08a9\7\17\2\2\u08a9\u08aa\5\u0180\u00c1\2\u08aa\u08ab"+
		"\7*\2\2\u08ab\u08ac\5\u016a\u00b6\2\u08ac\u08ae\3\2\2\2\u08ad\u08a7\3"+
		"\2\2\2\u08ae\u08b1\3\2\2\2\u08af\u08ad\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0"+
		"\u0179\3\2\2\2\u08b1\u08af\3\2\2\2\u08b2\u08b3\7\22\2\2\u08b3\u08b4\5"+
		"\u016a\u00b6\2\u08b4\u08b5\7\23\2\2\u08b5\u017b\3\2\2\2\u08b6\u08b7\b"+
		"\u00bf\1\2\u08b7\u08ba\7\u00a7\2\2\u08b8\u08ba\5\u0180\u00c1\2\u08b9\u08b6"+
		"\3\2\2\2\u08b9\u08b8\3\2\2\2\u08ba\u08c0\3\2\2\2\u08bb\u08bc\f\3\2\2\u08bc"+
		"\u08bd\7\21\2\2\u08bd\u08bf\5\u0180\u00c1\2\u08be\u08bb\3\2\2\2\u08bf"+
		"\u08c2\3\2\2\2\u08c0\u08be\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u017d\3\2"+
		"\2\2\u08c2\u08c0\3\2\2\2\u08c3\u08c9\7\u00ab\2\2\u08c4\u08c9\7\u00ad\2"+
		"\2\u08c5\u08c9\7\u00a9\2\2\u08c6\u08c9\7\u009f\2\2\u08c7\u08c9\7\u00a0"+
		"\2\2\u08c8\u08c3\3\2\2\2\u08c8\u08c4\3\2\2\2\u08c8\u08c5\3\2\2\2\u08c8"+
		"\u08c6\3\2\2\2\u08c8\u08c7\3\2\2\2\u08c9\u017f\3\2\2\2\u08ca\u08cb\t\t"+
		"\2\2\u08cb\u0181\3\2\2\2\u08cc\u08cd\7\u0089\2\2\u08cd\u08ce\5\u0184\u00c3"+
		"\2\u08ce\u08cf\7\16\2\2\u08cf\u08d4\3\2\2\2\u08d0\u08d1\5\u0184\u00c3"+
		"\2\u08d1\u08d2\7\16\2\2\u08d2\u08d4\3\2\2\2\u08d3\u08cc\3\2\2\2\u08d3"+
		"\u08d0\3\2\2\2\u08d4\u0183\3\2\2\2\u08d5\u08d6\b\u00c3\1\2\u08d6\u08d7"+
		"\5\u0186\u00c4\2\u08d7\u08dc\3\2\2\2\u08d8\u08d9\f\3\2\2\u08d9\u08db\5"+
		"\u018c\u00c7\2\u08da\u08d8\3\2\2\2\u08db\u08de\3\2\2\2\u08dc\u08da\3\2"+
		"\2\2\u08dc\u08dd\3\2\2\2\u08dd\u0185\3\2\2\2\u08de\u08dc\3\2\2\2\u08df"+
		"\u08e5\5\u0188\u00c5\2\u08e0\u08e5\5\u018a\u00c6\2\u08e1\u08e5\5\u0194"+
		"\u00cb\2\u08e2\u08e5\5\u0196\u00cc\2\u08e3\u08e5\5\u019a\u00ce\2\u08e4"+
		"\u08df\3\2\2\2\u08e4\u08e0\3\2\2\2\u08e4\u08e1\3\2\2\2\u08e4\u08e2\3\2"+
		"\2\2\u08e4\u08e3\3\2\2\2\u08e5\u0187\3\2\2\2\u08e6\u08e7\5\u010e\u0088"+
		"\2\u08e7\u0189\3\2\2\2\u08e8\u08e9\5\u0136\u009c\2\u08e9\u08ea\5\u018e"+
		"\u00c8\2\u08ea\u018b\3\2\2\2\u08eb\u08ec\7\21\2\2\u08ec\u08ef\5\u018e"+
		"\u00c8\2\u08ed\u08ef\5\u0192\u00ca\2\u08ee\u08eb\3\2\2\2\u08ee\u08ed\3"+
		"\2\2\2\u08ef\u018d\3\2\2\2\u08f0\u08f1\5\u019c\u00cf\2\u08f1\u08f3\7\22"+
		"\2\2\u08f2\u08f4\5\u0190\u00c9\2\u08f3\u08f2\3\2\2\2\u08f3\u08f4\3\2\2"+
		"\2\u08f4\u08f5\3\2\2\2\u08f5\u08f6\7\23\2\2\u08f6\u018f\3\2\2\2\u08f7"+
		"\u08f8\b\u00c9\1\2\u08f8\u08f9\5\u0184\u00c3\2\u08f9\u08ff\3\2\2\2\u08fa"+
		"\u08fb\f\3\2\2\u08fb\u08fc\7\17\2\2\u08fc\u08fe\5\u0184\u00c3\2\u08fd"+
		"\u08fa\3\2\2\2\u08fe\u0901\3\2\2\2\u08ff\u08fd\3\2\2\2\u08ff\u0900\3\2"+
		"\2\2\u0900\u0191\3\2\2\2\u0901\u08ff\3\2\2\2\u0902\u0903\7\24\2\2\u0903"+
		"\u0904\5\u0184\u00c3\2\u0904\u0905\7\25\2\2\u0905\u0193\3\2\2\2\u0906"+
		"\u0907\7\22\2\2\u0907\u0908\5\u0184\u00c3\2\u0908\u0909\7\23\2\2\u0909"+
		"\u0195\3\2\2\2\u090a\u090b\b\u00cc\1\2\u090b\u090c\5\u019c\u00cf\2\u090c"+
		"\u0912\3\2\2\2\u090d\u090e\f\3\2\2\u090e\u090f\7\21\2\2\u090f\u0911\5"+
		"\u019c\u00cf\2\u0910\u090d\3\2\2\2\u0911\u0914\3\2\2\2\u0912\u0910\3\2"+
		"\2\2\u0912\u0913\3\2\2\2\u0913\u0197\3\2\2\2\u0914\u0912\3\2\2\2\u0915"+
		"\u0916\b\u00cd\1\2\u0916\u0917\5\u0196\u00cc\2\u0917\u091c\3\2\2\2\u0918"+
		"\u0919\f\3\2\2\u0919\u091b\7\u00a7\2\2\u091a\u0918\3\2\2\2\u091b\u091e"+
		"\3\2\2\2\u091c\u091a\3\2\2\2\u091c\u091d\3\2\2\2\u091d\u0199\3\2\2\2\u091e"+
		"\u091c\3\2\2\2\u091f\u0925\7\u00ab\2\2\u0920\u0925\7\u00ad\2\2\u0921\u0925"+
		"\7\u00a9\2\2\u0922\u0925\7\u009f\2\2\u0923\u0925\7\u00a0\2\2\u0924\u091f"+
		"\3\2\2\2\u0924\u0920\3\2\2\2\u0924\u0921\3\2\2\2\u0924\u0922\3\2\2\2\u0924"+
		"\u0923\3\2\2\2\u0925\u019b\3\2\2\2\u0926\u0927\t\n\2\2\u0927\u019d\3\2"+
		"\2\2\u0928\u0929\7\u0089\2\2\u0929\u092a\5\u01a0\u00d1\2\u092a\u092b\7"+
		"\16\2\2\u092b\u0930\3\2\2\2\u092c\u092d\5\u01a0\u00d1\2\u092d\u092e\7"+
		"\16\2\2\u092e\u0930\3\2\2\2\u092f\u0928\3\2\2\2\u092f\u092c\3\2\2\2\u0930"+
		"\u019f\3\2\2\2\u0931\u0932\b\u00d1\1\2\u0932\u0933\5\u01a2\u00d2\2\u0933"+
		"\u0938\3\2\2\2\u0934\u0935\f\3\2\2\u0935\u0937\5\u01a8\u00d5\2\u0936\u0934"+
		"\3\2\2\2\u0937\u093a\3\2\2\2\u0938\u0936\3\2\2\2\u0938\u0939\3\2\2\2\u0939"+
		"\u01a1\3\2\2\2\u093a\u0938\3\2\2\2\u093b\u0941\5\u01a4\u00d3\2\u093c\u0941"+
		"\5\u01a6\u00d4\2\u093d\u0941\5\u01b0\u00d9\2\u093e\u0941\5\u01b2\u00da"+
		"\2\u093f\u0941\5\u01b4\u00db\2\u0940\u093b\3\2\2\2\u0940\u093c\3\2\2\2"+
		"\u0940\u093d\3\2\2\2\u0940\u093e\3\2\2\2\u0940\u093f\3\2\2\2\u0941\u01a3"+
		"\3\2\2\2\u0942\u0943\5\u010e\u0088\2\u0943\u01a5\3\2\2\2\u0944\u0945\5"+
		"\u0136\u009c\2\u0945\u0946\5\u01aa\u00d6\2\u0946\u01a7\3\2\2\2\u0947\u0948"+
		"\7\21\2\2\u0948\u094b\5\u01aa\u00d6\2\u0949\u094b\5\u01ae\u00d8\2\u094a"+
		"\u0947\3\2\2\2\u094a\u0949\3\2\2\2\u094b\u01a9\3\2\2\2\u094c\u094d\5\u01b6"+
		"\u00dc\2\u094d\u094f\7\22\2\2\u094e\u0950\5\u01ac\u00d7\2\u094f\u094e"+
		"\3\2\2\2\u094f\u0950\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u0952\7\23\2\2"+
		"\u0952\u01ab\3\2\2\2\u0953\u0954\b\u00d7\1\2\u0954\u0955\5\u01a0\u00d1"+
		"\2\u0955\u095b\3\2\2\2\u0956\u0957\f\3\2\2\u0957\u0958\7\17\2\2\u0958"+
		"\u095a\5\u01a0\u00d1\2\u0959\u0956\3\2\2\2\u095a\u095d\3\2\2\2\u095b\u0959"+
		"\3\2\2\2\u095b\u095c\3\2\2\2\u095c\u01ad\3\2\2\2\u095d\u095b\3\2\2\2\u095e"+
		"\u095f\7\24\2\2\u095f\u0960\5\u01a0\u00d1\2\u0960\u0961\7\25\2\2\u0961"+
		"\u01af\3\2\2\2\u0962\u0963\7\22\2\2\u0963\u0964\5\u01a0\u00d1\2\u0964"+
		"\u0965\7\23\2\2\u0965\u01b1\3\2\2\2\u0966\u0967\b\u00da\1\2\u0967\u096a"+
		"\7\u00a7\2\2\u0968\u096a\5\u01b6\u00dc\2\u0969\u0966\3\2\2\2\u0969\u0968"+
		"\3\2\2\2\u096a\u0970\3\2\2\2\u096b\u096c\f\3\2\2\u096c\u096d\7\21\2\2"+
		"\u096d\u096f\5\u01b6\u00dc\2\u096e\u096b\3\2\2\2\u096f\u0972\3\2\2\2\u0970"+
		"\u096e\3\2\2\2\u0970\u0971\3\2\2\2\u0971\u01b3\3\2\2\2\u0972\u0970\3\2"+
		"\2\2\u0973\u0979\7\u00ab\2\2\u0974\u0979\7\u00ad\2\2\u0975\u0979\7\u00a9"+
		"\2\2\u0976\u0979\7\u009f\2\2\u0977\u0979\7\u00a0\2\2\u0978\u0973\3\2\2"+
		"\2\u0978\u0974\3\2\2\2\u0978\u0975\3\2\2\2\u0978\u0976\3\2\2\2\u0978\u0977"+
		"\3\2\2\2\u0979\u01b5\3\2\2\2\u097a\u097b\t\13\2\2\u097b\u01b7\3\2\2\2"+
		"\u097c\u097f\5\u01ba\u00de\2\u097d\u097f\5\u01bc\u00df\2\u097e\u097c\3"+
		"\2\2\2\u097e\u097d\3\2\2\2\u097f\u01b9\3\2\2\2\u0980\u0988\5\u01c2\u00e2"+
		"\2\u0981\u0983\5\u01c4\u00e3\2\u0982\u0984\5\u01d0\u00e9\2\u0983\u0982"+
		"\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0985\3\2\2\2\u0985\u0986\5\u01c6\u00e4"+
		"\2\u0986\u0988\3\2\2\2\u0987\u0980\3\2\2\2\u0987\u0981\3\2\2\2\u0988\u01bb"+
		"\3\2\2\2\u0989\u098b\5\u01be\u00e0\2\u098a\u098c\5\u01d0\u00e9\2\u098b"+
		"\u098a\3\2\2\2\u098b\u098c\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u098e\5\u01c0"+
		"\u00e1\2\u098e\u01bd\3\2\2\2\u098f\u0990\7&\2\2\u0990\u0993\7$\2\2\u0991"+
		"\u0993\7(\2\2\u0992\u098f\3\2\2\2\u0992\u0991\3\2\2\2\u0993\u01bf\3\2"+
		"\2\2\u0994\u0995\7&\2\2\u0995\u0996\7!\2\2\u0996\u0997\7$\2\2\u0997\u01c1"+
		"\3\2\2\2\u0998\u0999\7&\2\2\u0999\u099d\5\u01c8\u00e5\2\u099a\u099c\5"+
		"\u01cc\u00e7\2\u099b\u099a\3\2\2\2\u099c\u099f\3\2\2\2\u099d\u099b\3\2"+
		"\2\2\u099d\u099e\3\2\2\2\u099e\u09a0\3\2\2\2\u099f\u099d\3\2\2\2\u09a0"+
		"\u09a1\7!\2\2\u09a1\u09a2\7$\2\2\u09a2\u01c3\3\2\2\2\u09a3\u09a4\7&\2"+
		"\2\u09a4\u09a8\5\u01c8\u00e5\2\u09a5\u09a7\5\u01cc\u00e7\2\u09a6\u09a5"+
		"\3\2\2\2\u09a7\u09aa\3\2\2\2\u09a8\u09a6\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9"+
		"\u09ab\3\2\2\2\u09aa\u09a8\3\2\2\2\u09ab\u09ac\7$\2\2\u09ac\u01c5\3\2"+
		"\2\2\u09ad\u09ae\7&\2\2\u09ae\u09af\7!\2\2\u09af\u09b0\5\u01c8\u00e5\2"+
		"\u09b0\u09b1\7$\2\2\u09b1\u01c7\3\2\2\2\u09b2\u09b7\5\u01ca\u00e6\2\u09b3"+
		"\u09b4\7\21\2\2\u09b4\u09b6\5\u01ca\u00e6\2\u09b5\u09b3\3\2\2\2\u09b6"+
		"\u09b9\3\2\2\2\u09b7\u09b5\3\2\2\2\u09b7\u09b8\3\2\2\2\u09b8\u01c9\3\2"+
		"\2\2\u09b9\u09b7\3\2\2\2\u09ba\u09be\5\u00be`\2\u09bb\u09bd\5\u00c0a\2"+
		"\u09bc\u09bb\3\2\2\2\u09bd\u09c0\3\2\2\2\u09be\u09bc\3\2\2\2\u09be\u09bf"+
		"\3\2\2\2\u09bf\u01cb\3\2\2\2\u09c0\u09be\3\2\2\2\u09c1\u09c4\5\u01ca\u00e6"+
		"\2\u09c2\u09c3\7*\2\2\u09c3\u09c5\5\u01ce\u00e8\2\u09c4\u09c2\3\2\2\2"+
		"\u09c4\u09c5\3\2\2\2\u09c5\u01cd\3\2\2\2\u09c6\u09cc\7\u00a9\2\2\u09c7"+
		"\u09c8\7\26\2\2\u09c8\u09c9\5d\63\2\u09c9\u09ca\7\27\2\2\u09ca\u09cc\3"+
		"\2\2\2\u09cb\u09c6\3\2\2\2\u09cb\u09c7\3\2\2\2\u09cc\u01cf\3\2\2\2\u09cd"+
		"\u09cf\5\u01d2\u00ea\2\u09ce\u09cd\3\2\2\2\u09cf\u09d0\3\2\2\2\u09d0\u09ce"+
		"\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u01d1\3\2\2\2\u09d2\u09da\5\u01d4\u00eb"+
		"\2\u09d3\u09da\5\u01ba\u00de\2\u09d4\u09d6\7\26\2\2\u09d5\u09d7\5d\63"+
		"\2\u09d6\u09d5\3\2\2\2\u09d6\u09d7\3\2\2\2\u09d7\u09d8\3\2\2\2\u09d8\u09da"+
		"\7\27\2\2\u09d9\u09d2\3\2\2\2\u09d9\u09d3\3\2\2\2\u09d9\u09d4\3\2\2\2"+
		"\u09da\u01d3\3\2\2\2\u09db\u09dd\n\f\2\2\u09dc\u09db\3\2\2\2\u09dd\u09de"+
		"\3\2\2\2\u09de\u09dc\3\2\2\2\u09de\u09df\3\2\2\2\u09df\u01d5\3\2\2\2\u09e0"+
		"\u09e2\7\26\2\2\u09e1\u09e3\5\u01d8\u00ed\2\u09e2\u09e1\3\2\2";
	private static final String _serializedATNSegment1 =
		"\2\u09e3\u09e4\3\2\2\2\u09e4\u09e2\3\2\2\2\u09e4\u09e5\3\2\2\2\u09e5\u09e6"+
		"\3\2\2\2\u09e6\u09e7\7\27\2\2\u09e7\u01d7\3\2\2\2\u09e8\u09e9\5\u01da"+
		"\u00ee\2\u09e9\u09ea\7\r\2\2\u09ea\u09eb\5\u01dc\u00ef\2\u09eb\u09ec\7"+
		"\16\2\2\u09ec\u01d9\3\2\2\2\u09ed\u09ee\b\u00ee\1\2\u09ee\u09f2\5\u00be"+
		"`\2\u09ef\u09f0\7\37\2\2\u09f0\u09f2\5\u00c2b\2\u09f1\u09ed\3\2\2\2\u09f1"+
		"\u09ef\3\2\2\2\u09f2\u09fb\3\2\2\2\u09f3\u09f5\f\3\2\2\u09f4\u09f6\5\u00c0"+
		"a\2\u09f5\u09f4\3\2\2\2\u09f6\u09f7\3\2\2\2\u09f7\u09f5\3\2\2\2\u09f7"+
		"\u09f8\3\2\2\2\u09f8\u09fa\3\2\2\2\u09f9\u09f3\3\2\2\2\u09fa\u09fd\3\2"+
		"\2\2\u09fb\u09f9\3\2\2\2\u09fb\u09fc\3\2\2\2\u09fc\u01db\3\2\2\2\u09fd"+
		"\u09fb\3\2\2\2\u09fe\u09ff\7\26\2\2\u09ff\u0a00\5d\63\2\u0a00\u0a01\7"+
		"\27\2\2\u0a01\u0a04\3\2\2\2\u0a02\u0a04\5\u01de\u00f0\2\u0a03\u09fe\3"+
		"\2\2\2\u0a03\u0a02\3\2\2\2\u0a04\u01dd\3\2\2\2\u0a05\u0a07\n\r\2\2\u0a06"+
		"\u0a05\3\2\2\2\u0a07\u0a08\3\2\2\2\u0a08\u0a06\3\2\2\2\u0a08\u0a09\3\2"+
		"\2\2\u0a09\u01df\3\2\2\2\u00e8\u01e7\u01eb\u0206\u020d\u0215\u0217\u021f"+
		"\u022c\u0234\u0238\u0242\u024e\u0254\u0257\u025a\u0263\u026b\u0270\u0276"+
		"\u027e\u0283\u0289\u028e\u0297\u029c\u02a1\u02aa\u02af\u02c3\u02c8\u02ce"+
		"\u02d4\u02da\u02df\u02e4\u02e7\u02ed\u0304\u030e\u0313\u031a\u031c\u0333"+
		"\u0351\u0368\u036a\u0372\u0379\u037b\u0383\u038d\u03a2\u03a6\u03ba\u03c7"+
		"\u03cb\u03d3\u03d6\u03db\u03de\u03e6\u03f1\u03f5\u03fc\u0403\u040c\u0415"+
		"\u041e\u043b\u04af\u04b1\u04c1\u04cd\u04d7\u04f6\u0503\u0509\u0512\u0519"+
		"\u0521\u0523\u0527\u0530\u053e\u0545\u054c\u0550\u055c\u0563\u056a\u0577"+
		"\u0581\u058c\u0594\u059c\u05a5\u05ac\u05b4\u05bc\u05c5\u05cd\u05da\u05dd"+
		"\u05e1\u05e6\u05ea\u05f3\u0608\u0611\u0613\u0618\u062a\u062f\u0638\u063c"+
		"\u0643\u0648\u064c\u0658\u0667\u066c\u066f\u0673\u0678\u067f\u068a\u068c"+
		"\u0695\u069d\u06a5\u06ab\u06b7\u06bb\u06c5\u06cd\u06d1\u06d7\u06de\u06e3"+
		"\u06ea\u06f2\u06f9\u0703\u0710\u0714\u0717\u071b\u071e\u0726\u072f\u0738"+
		"\u0741\u0752\u0763\u076a\u0771\u077b\u0782\u0785\u0789\u078e\u0798\u079c"+
		"\u07a7\u07aa\u07b1\u07c1\u07ce\u07d5\u07e6\u07ee\u07f2\u07fa\u0822\u082b"+
		"\u0835\u0841\u0846\u0852\u0864\u086b\u0874\u087c\u0886\u088b\u0895\u089f"+
		"\u08af\u08b9\u08c0\u08c8\u08d3\u08dc\u08e4\u08ee\u08f3\u08ff\u0912\u091c"+
		"\u0924\u092f\u0938\u0940\u094a\u094f\u095b\u0969\u0970\u0978\u097e\u0983"+
		"\u0987\u098b\u0992\u099d\u09a8\u09b7\u09be\u09c4\u09cb\u09d0\u09d6\u09d9"+
		"\u09de\u09e4\u09f1\u09f7\u09fb\u0a03\u0a08";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}