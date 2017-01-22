package prompto.parser;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import prompto.declaration.DeclarationList;
import prompto.expression.IFetchExpression;
import prompto.parser.EParser;
import prompto.problem.IProblemListener;
import prompto.type.IType;


public class ECleverParser extends EParser implements IParser {

	IProblemListener problemListener;
	String path = "";

	public ECleverParser(String input) {
		this(new ANTLRInputStream(input));
	}
	
	public ECleverParser(InputStream input) throws IOException {
		this(new ANTLRInputStream(input));
	}
	
	public ECleverParser(String path, InputStream input) throws IOException {
		this(new ANTLRInputStream(input));
		setPath(path);
	}

	public ECleverParser(CharStream input) {
		this(new EIndentingLexer(input));
	}
	
	public ECleverParser(EIndentingLexer lexer) {
		this(new CommonTokenStream(lexer));
	}

	public ECleverParser(TokenStream input) {
		super(input);
		this.setErrorHandler(new ErrorStrategy());
	}

	@Override
	public void setProblemListener(IProblemListener problemListener) {
		this.removeErrorListeners();
		if(problemListener!=null)
			this.addErrorListener((ANTLRErrorListener)problemListener);
		getLexer().setProblemListener(problemListener);
		this.problemListener = problemListener;
	}
	
	@Override
	public EIndentingLexer getLexer() {
		return (EIndentingLexer)this.getInputStream().getTokenSource();
	}
	
	public int equalToken() {
		return EParser.EQ;
	};

	public void setPath(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}

	@Override
	public DeclarationList parse(String path, InputStream data) throws Exception {
		setPath(path);
		getLexer().reset(data);
		setInputStream(new CommonTokenStream(getLexer()));
		return parse_declaration_list();
	}
	
	@FunctionalInterface
	static interface ParseMethod {
		ParseTree parse();
	}
	
	public DeclarationList parse_declaration_list() throws Exception {
		return this.<DeclarationList>doParse(this::declaration_list, true);
	}
	
	public IType parse_standalone_type() throws Exception {
		return this.<IType>doParse(this::category_or_any_type, false);
	}

	public IFetchExpression parse_fetch_store_expression() throws Exception {
		return this.<IFetchExpression>doParse(this::fetch_store_expression, false);
	}
	
	private <T extends Object> T doParse(ParseMethod method, boolean addLF) {
		getLexer().setAddLF(addLF);
		ParseTree tree = method.parse();
		EPromptoBuilder builder = new EPromptoBuilder(this);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(builder, tree);
		return builder.<T>getNodeValue(tree);
	}

	
}