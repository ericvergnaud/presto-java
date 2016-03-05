package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestEquals extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedEqBoolean() throws Exception {
		checkInterpretedOutput("equals/eqBoolean.pec");
	}

	@Test
	public void testCompiledEqBoolean() throws Exception {
		checkCompiledOutput("equals/eqBoolean.pec");
	}

	@Test
	public void testInterpretedEqCharacter() throws Exception {
		checkInterpretedOutput("equals/eqCharacter.pec");
	}

	@Test
	public void testCompiledEqCharacter() throws Exception {
		checkCompiledOutput("equals/eqCharacter.pec");
	}

	@Test
	public void testInterpretedEqDate() throws Exception {
		checkInterpretedOutput("equals/eqDate.pec");
	}

	@Test
	public void testCompiledEqDate() throws Exception {
		checkCompiledOutput("equals/eqDate.pec");
	}

	@Test
	public void testInterpretedEqDateTime() throws Exception {
		checkInterpretedOutput("equals/eqDateTime.pec");
	}

	@Test
	public void testCompiledEqDateTime() throws Exception {
		checkCompiledOutput("equals/eqDateTime.pec");
	}

	@Test
	public void testInterpretedEqDecimal() throws Exception {
		checkInterpretedOutput("equals/eqDecimal.pec");
	}

	@Test
	public void testCompiledEqDecimal() throws Exception {
		checkCompiledOutput("equals/eqDecimal.pec");
	}

	@Test
	public void testInterpretedEqDict() throws Exception {
		checkInterpretedOutput("equals/eqDict.pec");
	}

	@Test
	public void testCompiledEqDict() throws Exception {
		checkCompiledOutput("equals/eqDict.pec");
	}

	@Test
	public void testInterpretedEqInteger() throws Exception {
		checkInterpretedOutput("equals/eqInteger.pec");
	}

	@Test
	public void testCompiledEqInteger() throws Exception {
		checkCompiledOutput("equals/eqInteger.pec");
	}

	@Test
	public void testInterpretedEqList() throws Exception {
		checkInterpretedOutput("equals/eqList.pec");
	}

	@Test
	public void testCompiledEqList() throws Exception {
		checkCompiledOutput("equals/eqList.pec");
	}

	@Test
	public void testInterpretedEqPeriod() throws Exception {
		checkInterpretedOutput("equals/eqPeriod.pec");
	}

	@Test
	public void testCompiledEqPeriod() throws Exception {
		checkCompiledOutput("equals/eqPeriod.pec");
	}

	@Test
	public void testInterpretedEqRange() throws Exception {
		checkInterpretedOutput("equals/eqRange.pec");
	}

	@Test
	public void testCompiledEqRange() throws Exception {
		checkCompiledOutput("equals/eqRange.pec");
	}

	@Test
	public void testInterpretedEqSet() throws Exception {
		checkInterpretedOutput("equals/eqSet.pec");
	}

	@Test
	public void testCompiledEqSet() throws Exception {
		checkCompiledOutput("equals/eqSet.pec");
	}

	@Test
	public void testInterpretedEqText() throws Exception {
		checkInterpretedOutput("equals/eqText.pec");
	}

	@Test
	public void testCompiledEqText() throws Exception {
		checkCompiledOutput("equals/eqText.pec");
	}

	@Test
	public void testInterpretedEqTime() throws Exception {
		checkInterpretedOutput("equals/eqTime.pec");
	}

	@Test
	public void testCompiledEqTime() throws Exception {
		checkCompiledOutput("equals/eqTime.pec");
	}

	@Test
	public void testInterpretedIsBoolean() throws Exception {
		checkInterpretedOutput("equals/isBoolean.pec");
	}

	@Test
	public void testCompiledIsBoolean() throws Exception {
		checkCompiledOutput("equals/isBoolean.pec");
	}

	@Test
	public void testInterpretedIsInstance() throws Exception {
		checkInterpretedOutput("equals/isInstance.pec");
	}

	@Test
	public void testCompiledIsInstance() throws Exception {
		checkCompiledOutput("equals/isInstance.pec");
	}

	@Test
	public void testInterpretedIsNotBoolean() throws Exception {
		checkInterpretedOutput("equals/isNotBoolean.pec");
	}

	@Test
	public void testCompiledIsNotBoolean() throws Exception {
		checkCompiledOutput("equals/isNotBoolean.pec");
	}

	@Test
	public void testInterpretedIsNotInstance() throws Exception {
		checkInterpretedOutput("equals/isNotInstance.pec");
	}

	@Test
	public void testCompiledIsNotInstance() throws Exception {
		checkCompiledOutput("equals/isNotInstance.pec");
	}

	@Test
	public void testInterpretedNeqBoolean() throws Exception {
		checkInterpretedOutput("equals/neqBoolean.pec");
	}

	@Test
	public void testCompiledNeqBoolean() throws Exception {
		checkCompiledOutput("equals/neqBoolean.pec");
	}

	@Test
	public void testInterpretedNeqCharacter() throws Exception {
		checkInterpretedOutput("equals/neqCharacter.pec");
	}

	@Test
	public void testCompiledNeqCharacter() throws Exception {
		checkCompiledOutput("equals/neqCharacter.pec");
	}

	@Test
	public void testInterpretedNeqDate() throws Exception {
		checkInterpretedOutput("equals/neqDate.pec");
	}

	@Test
	public void testCompiledNeqDate() throws Exception {
		checkCompiledOutput("equals/neqDate.pec");
	}

	@Test
	public void testInterpretedNeqDateTime() throws Exception {
		checkInterpretedOutput("equals/neqDateTime.pec");
	}

	@Test
	public void testCompiledNeqDateTime() throws Exception {
		checkCompiledOutput("equals/neqDateTime.pec");
	}

	@Test
	public void testInterpretedNeqDecimal() throws Exception {
		checkInterpretedOutput("equals/neqDecimal.pec");
	}

	@Test
	public void testCompiledNeqDecimal() throws Exception {
		checkCompiledOutput("equals/neqDecimal.pec");
	}

	@Test
	public void testInterpretedNeqDict() throws Exception {
		checkInterpretedOutput("equals/neqDict.pec");
	}

	@Test
	public void testCompiledNeqDict() throws Exception {
		checkCompiledOutput("equals/neqDict.pec");
	}

	@Test
	public void testInterpretedNeqInteger() throws Exception {
		checkInterpretedOutput("equals/neqInteger.pec");
	}

	@Test
	public void testCompiledNeqInteger() throws Exception {
		checkCompiledOutput("equals/neqInteger.pec");
	}

	@Test
	public void testInterpretedNeqList() throws Exception {
		checkInterpretedOutput("equals/neqList.pec");
	}

	@Test
	public void testCompiledNeqList() throws Exception {
		checkCompiledOutput("equals/neqList.pec");
	}

	@Test
	public void testInterpretedNeqPeriod() throws Exception {
		checkInterpretedOutput("equals/neqPeriod.pec");
	}

	@Test
	public void testCompiledNeqPeriod() throws Exception {
		checkCompiledOutput("equals/neqPeriod.pec");
	}

	@Test
	public void testInterpretedNeqRange() throws Exception {
		checkInterpretedOutput("equals/neqRange.pec");
	}

	@Test
	public void testCompiledNeqRange() throws Exception {
		checkCompiledOutput("equals/neqRange.pec");
	}

	@Test
	public void testInterpretedNeqSet() throws Exception {
		checkInterpretedOutput("equals/neqSet.pec");
	}

	@Test
	public void testCompiledNeqSet() throws Exception {
		checkCompiledOutput("equals/neqSet.pec");
	}

	@Test
	public void testInterpretedNeqText() throws Exception {
		checkInterpretedOutput("equals/neqText.pec");
	}

	@Test
	public void testCompiledNeqText() throws Exception {
		checkCompiledOutput("equals/neqText.pec");
	}

	@Test
	public void testInterpretedNeqTime() throws Exception {
		checkInterpretedOutput("equals/neqTime.pec");
	}

	@Test
	public void testCompiledNeqTime() throws Exception {
		checkCompiledOutput("equals/neqTime.pec");
	}

	@Test
	public void testInterpretedReqText() throws Exception {
		checkInterpretedOutput("equals/reqText.pec");
	}

	@Test
	public void testCompiledReqText() throws Exception {
		checkCompiledOutput("equals/reqText.pec");
	}

}

