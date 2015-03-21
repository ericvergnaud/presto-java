package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestEnums extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testCategoryEnum() throws Exception {
		checkOutput("enums/categoryEnum.e");
	}

	@Test
	public void testIntegerEnum() throws Exception {
		checkOutput("enums/integerEnum.e");
	}

	@Test
	public void testTextEnum() throws Exception {
		checkOutput("enums/textEnum.e");
	}

}

