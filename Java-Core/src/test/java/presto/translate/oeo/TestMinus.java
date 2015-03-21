package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestMinus extends BaseOParserTest {

	@Test
	public void testMinusDecimal() throws Exception {
		compareResourceOEO("minus/minusDecimal.o");
	}

	@Test
	public void testMinusInteger() throws Exception {
		compareResourceOEO("minus/minusInteger.o");
	}

	@Test
	public void testMinusPeriod() throws Exception {
		compareResourceOEO("minus/minusPeriod.o");
	}

}

