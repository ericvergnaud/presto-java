package prompto.problems.o;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestProblems extends BaseOParserTest {

	@Test
	public void testAbstractCallback() throws Exception {
		checkProblems("problems/abstractCallback.poc");
	}

	@Test
	public void testAbstractCategory() throws Exception {
		checkProblems("problems/abstractCategory.poc");
	}

	@Test
	public void testAbstractMethod() throws Exception {
		checkProblems("problems/abstractMethod.poc");
	}

	@Test
	public void testDeepAbstractCategory() throws Exception {
		checkProblems("problems/deepAbstractCategory.poc");
	}

	@Test
	public void testDeepAbstractMethod() throws Exception {
		checkProblems("problems/deepAbstractMethod.poc");
	}

	@Test
	public void testDeepUnknownMethod() throws Exception {
		checkProblems("problems/deepUnknownMethod.poc");
	}

	@Test
	public void testNoMatchingPrototype() throws Exception {
		checkProblems("problems/noMatchingPrototype.poc");
	}

	@Test
	public void testUnknownItemType() throws Exception {
		checkProblems("problems/unknownItemType.poc");
	}

	@Test
	public void testUnknownMethod() throws Exception {
		checkProblems("problems/unknownMethod.poc");
	}

	@Test
	public void testUnknownType() throws Exception {
		checkProblems("problems/unknownType.poc");
	}

}

