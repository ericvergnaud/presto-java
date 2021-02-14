package prompto.parser;

public interface ILocation {
	
	static ILocation first(ILocation l1, ILocation l2) {
		// assumption is that both locations come fromthe same parsing
		return l1.getTokenIndex() < l2.getTokenIndex() ? l1 : l2;
	}

	static ILocation last(ILocation l1, ILocation l2) {
		// assumption is that both locations come fromthe same parsing
		return l1.getTokenIndex() > l2.getTokenIndex() ? l1 : l2;
	}

	int getTokenIndex();
	int getLine();
	int getColumn();
	
	default boolean isNotAfter(ILocation other) {
		// assumption is that both locations come fromthe same parsing
		return this.getTokenIndex() < other.getTokenIndex();
	}
	
	default boolean isNotBefore(ILocation other) {
		// assumption is that both locations come fromthe same parsing
		return this.getTokenIndex() > other.getTokenIndex();
	}
	

}
