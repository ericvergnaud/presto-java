package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestIterate extends BaseOParserTest {

	@Test
	public void testForEachExpression() throws Exception {
		compareResourceOEO("iterate/forEachExpression.poc");
	}

	@Test
	public void testForEachIntegerList() throws Exception {
		compareResourceOEO("iterate/forEachIntegerList.poc");
	}

}

