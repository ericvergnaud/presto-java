package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestCondition extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedComplexIf() throws Exception {
		checkInterpretedOutput("condition/complexIf.pec");
	}

	@Test
	public void testCompiledComplexIf() throws Exception {
		checkCompiledOutput("condition/complexIf.pec");
	}

	@Test
	public void testInterpretedElseIf() throws Exception {
		checkInterpretedOutput("condition/elseIf.pec");
	}

	@Test
	public void testCompiledElseIf() throws Exception {
		checkCompiledOutput("condition/elseIf.pec");
	}

	@Test
	public void testInterpretedReturnIf() throws Exception {
		checkInterpretedOutput("condition/returnIf.pec");
	}

	@Test
	public void testCompiledReturnIf() throws Exception {
		checkCompiledOutput("condition/returnIf.pec");
	}

	@Test
	public void testInterpretedSimpleIf() throws Exception {
		checkInterpretedOutput("condition/simpleIf.pec");
	}

	@Test
	public void testCompiledSimpleIf() throws Exception {
		checkCompiledOutput("condition/simpleIf.pec");
	}

	@Test
	public void testInterpretedSwitch() throws Exception {
		checkInterpretedOutput("condition/switch.pec");
	}

	@Test
	public void testCompiledSwitch() throws Exception {
		checkCompiledOutput("condition/switch.pec");
	}

	@Test
	public void testInterpretedTernary() throws Exception {
		checkInterpretedOutput("condition/ternary.pec");
	}

	@Test
	public void testCompiledTernary() throws Exception {
		checkCompiledOutput("condition/ternary.pec");
	}

}

