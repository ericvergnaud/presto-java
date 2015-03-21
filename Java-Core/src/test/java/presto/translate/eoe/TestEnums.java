package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestEnums extends BaseEParserTest {

	@Test
	public void testCategoryEnum() throws Exception {
		compareResourceEOE("enums/categoryEnum.e");
	}

	@Test
	public void testIntegerEnum() throws Exception {
		compareResourceEOE("enums/integerEnum.e");
	}

	@Test
	public void testTextEnum() throws Exception {
		compareResourceEOE("enums/textEnum.e");
	}

}

