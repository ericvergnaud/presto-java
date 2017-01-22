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
import prompto.parser.MParser;
import prompto.problem.IProblemListener;

public class MCleverParser extends MParser implements IParser {

	IProblemListener problemListener;
	String path = "";

	public MCleverParser(String input) {
		this(new ANTLRInputStream(input));
	}
	
	public MCleverParser(InputStream input) throws IOException {
		this(new ANTLRInputStream(input));
	}
	
	public MCleverParser(String path, InputStream input) throws IOException {
		this(new ANTLRInputStream(input));
		setPath(path);
	}

	public MCleverParser(CharStream input) {
		this(new MIndentingLexer(input));
	}
	
	public MCleverParser(MIndentingLexer lexer) {
		this(new CommonTokenStream(lexer));
	}

	public MCleverParser(TokenStream input) {
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
	public MIndentingLexer getLexer() {
		return (MIndentingLexer)this.getInputStream().getTokenSource();
	}

	public int equalToken() {
		return MParser.EQ;
	};

	public void setPath(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}

	@Override
	public DeclarationList parse(String path, InputStream input) throws Exception {
		this.path = path;
		getLexer().reset(input);
		getInputStream().seek(0);
		return parse_declaration_list();
	}
	
	public DeclarationList parse_declaration_list() throws Exception {
		ParseTree tree = this.declaration_list();
		MPromptoBuilder builder = new MPromptoBuilder(this);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(builder, tree);
		return builder.<DeclarationList>getNodeValue(tree);
	}
	
}