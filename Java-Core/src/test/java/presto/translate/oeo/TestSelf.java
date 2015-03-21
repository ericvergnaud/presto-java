package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSelf extends BaseOParserTest {

	@Test
	public void testSelfAsParameter() throws Exception {
		compareResourceOEO("self/selfAsParameter.o");
	}

	@Test
	public void testSelfMember() throws Exception {
		compareResourceOEO("self/selfMember.o");
	}

}

