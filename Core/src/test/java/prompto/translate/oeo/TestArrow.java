package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestArrow extends BaseOParserTest {

	@Test
	public void testSort1() throws Exception {
		compareResourceOEO("arrow/sort1.poc");
	}

	@Test
	public void testSort1_desc() throws Exception {
		compareResourceOEO("arrow/sort1_desc.poc");
	}

	@Test
	public void testSort2() throws Exception {
		compareResourceOEO("arrow/sort2.poc");
	}

	@Test
	public void testSort2_desc() throws Exception {
		compareResourceOEO("arrow/sort2_desc.poc");
	}

}

