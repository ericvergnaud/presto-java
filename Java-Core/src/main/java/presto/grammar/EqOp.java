package presto.grammar;

import presto.parser.Dialect;

public enum EqOp {
	IS,
	IS_NOT,
	IS_A,
	IS_NOT_A,
	EQUALS("=","==","=="),
	NOT_EQUALS("<>","!=","!="),
	ROUGHLY("~","~=","~=");

	String e,o,p;
	
	EqOp() {	
	}
	
	EqOp(String e, String o, String p) {
		this.e = e;
		this.o = o;
		this.p = p;
	}
	
	public String toString(Dialect dialect) {
		String s = null;
		switch(dialect) {
		case E:
			s = e;
			break;
		case O:
			s = o;
			break;
		case P:
			s = p;
			break;
		}
		if(s==null)
			s = this.name().toLowerCase().replace("_", " ");
		return s;
	}
}
