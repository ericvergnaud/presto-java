package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestBuiltins extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedDateDayOfMonth() throws Exception {
		checkInterpretedOutput("builtins/dateDayOfMonth.poc");
	}

	@Test
	public void testCompiledDateDayOfMonth() throws Exception {
		checkCompiledOutput("builtins/dateDayOfMonth.poc");
	}

	@Test
	public void testInterpretedDateDayOfYear() throws Exception {
		checkInterpretedOutput("builtins/dateDayOfYear.poc");
	}

	@Test
	public void testCompiledDateDayOfYear() throws Exception {
		checkCompiledOutput("builtins/dateDayOfYear.poc");
	}

	@Test
	public void testInterpretedDateMonth() throws Exception {
		checkInterpretedOutput("builtins/dateMonth.poc");
	}

	@Test
	public void testCompiledDateMonth() throws Exception {
		checkCompiledOutput("builtins/dateMonth.poc");
	}

	@Test
	public void testInterpretedDateTimeDayOfMonth() throws Exception {
		checkInterpretedOutput("builtins/dateTimeDayOfMonth.poc");
	}

	@Test
	public void testCompiledDateTimeDayOfMonth() throws Exception {
		checkCompiledOutput("builtins/dateTimeDayOfMonth.poc");
	}

	@Test
	public void testInterpretedDateTimeDayOfYear() throws Exception {
		checkInterpretedOutput("builtins/dateTimeDayOfYear.poc");
	}

	@Test
	public void testCompiledDateTimeDayOfYear() throws Exception {
		checkCompiledOutput("builtins/dateTimeDayOfYear.poc");
	}

	@Test
	public void testInterpretedDateTimeHour() throws Exception {
		checkInterpretedOutput("builtins/dateTimeHour.poc");
	}

	@Test
	public void testCompiledDateTimeHour() throws Exception {
		checkCompiledOutput("builtins/dateTimeHour.poc");
	}

	@Test
	public void testInterpretedDateTimeMinute() throws Exception {
		checkInterpretedOutput("builtins/dateTimeMinute.poc");
	}

	@Test
	public void testCompiledDateTimeMinute() throws Exception {
		checkCompiledOutput("builtins/dateTimeMinute.poc");
	}

	@Test
	public void testInterpretedDateTimeMonth() throws Exception {
		checkInterpretedOutput("builtins/dateTimeMonth.poc");
	}

	@Test
	public void testCompiledDateTimeMonth() throws Exception {
		checkCompiledOutput("builtins/dateTimeMonth.poc");
	}

	@Test
	public void testInterpretedDateTimeSecond() throws Exception {
		checkInterpretedOutput("builtins/dateTimeSecond.poc");
	}

	@Test
	public void testCompiledDateTimeSecond() throws Exception {
		checkCompiledOutput("builtins/dateTimeSecond.poc");
	}

	@Test
	public void testInterpretedDateTimeYear() throws Exception {
		checkInterpretedOutput("builtins/dateTimeYear.poc");
	}

	@Test
	public void testCompiledDateTimeYear() throws Exception {
		checkCompiledOutput("builtins/dateTimeYear.poc");
	}

	@Test
	public void testInterpretedDateYear() throws Exception {
		checkInterpretedOutput("builtins/dateYear.poc");
	}

	@Test
	public void testCompiledDateYear() throws Exception {
		checkCompiledOutput("builtins/dateYear.poc");
	}

	@Test
	public void testInterpretedDictCount() throws Exception {
		checkInterpretedOutput("builtins/dictCount.poc");
	}

	@Test
	public void testCompiledDictCount() throws Exception {
		checkCompiledOutput("builtins/dictCount.poc");
	}

	@Test
	public void testInterpretedEnumName() throws Exception {
		checkInterpretedOutput("builtins/enumName.poc");
	}

	@Test
	public void testCompiledEnumName() throws Exception {
		checkCompiledOutput("builtins/enumName.poc");
	}

	@Test
	public void testInterpretedEnumSymbols() throws Exception {
		checkInterpretedOutput("builtins/enumSymbols.poc");
	}

	@Test
	public void testCompiledEnumSymbols() throws Exception {
		checkCompiledOutput("builtins/enumSymbols.poc");
	}

	@Test
	public void testInterpretedEnumValue() throws Exception {
		checkInterpretedOutput("builtins/enumValue.poc");
	}

	@Test
	public void testCompiledEnumValue() throws Exception {
		checkCompiledOutput("builtins/enumValue.poc");
	}

	@Test
	public void testInterpretedListCount() throws Exception {
		checkInterpretedOutput("builtins/listCount.poc");
	}

	@Test
	public void testCompiledListCount() throws Exception {
		checkCompiledOutput("builtins/listCount.poc");
	}

	@Test
	public void testInterpretedSetCount() throws Exception {
		checkInterpretedOutput("builtins/setCount.poc");
	}

	@Test
	public void testCompiledSetCount() throws Exception {
		checkCompiledOutput("builtins/setCount.poc");
	}

	@Test
	public void testInterpretedTextCapitalize() throws Exception {
		checkInterpretedOutput("builtins/textCapitalize.poc");
	}

	@Test
	public void testCompiledTextCapitalize() throws Exception {
		checkCompiledOutput("builtins/textCapitalize.poc");
	}

	@Test
	public void testInterpretedTextCount() throws Exception {
		checkInterpretedOutput("builtins/textCount.poc");
	}

	@Test
	public void testCompiledTextCount() throws Exception {
		checkCompiledOutput("builtins/textCount.poc");
	}

	@Test
	public void testInterpretedTextLowercase() throws Exception {
		checkInterpretedOutput("builtins/textLowercase.poc");
	}

	@Test
	public void testCompiledTextLowercase() throws Exception {
		checkCompiledOutput("builtins/textLowercase.poc");
	}

	@Test
	public void testInterpretedTextSplit() throws Exception {
		checkInterpretedOutput("builtins/textSplit.poc");
	}

	@Test
	public void testCompiledTextSplit() throws Exception {
		checkCompiledOutput("builtins/textSplit.poc");
	}

	@Test
	public void testInterpretedTextTrim() throws Exception {
		checkInterpretedOutput("builtins/textTrim.poc");
	}

	@Test
	public void testCompiledTextTrim() throws Exception {
		checkCompiledOutput("builtins/textTrim.poc");
	}

	@Test
	public void testInterpretedTextUppercase() throws Exception {
		checkInterpretedOutput("builtins/textUppercase.poc");
	}

	@Test
	public void testCompiledTextUppercase() throws Exception {
		checkCompiledOutput("builtins/textUppercase.poc");
	}

	@Test
	public void testInterpretedTimeHour() throws Exception {
		checkInterpretedOutput("builtins/timeHour.poc");
	}

	@Test
	public void testCompiledTimeHour() throws Exception {
		checkCompiledOutput("builtins/timeHour.poc");
	}

	@Test
	public void testInterpretedTimeMinute() throws Exception {
		checkInterpretedOutput("builtins/timeMinute.poc");
	}

	@Test
	public void testCompiledTimeMinute() throws Exception {
		checkCompiledOutput("builtins/timeMinute.poc");
	}

	@Test
	public void testInterpretedTimeSecond() throws Exception {
		checkInterpretedOutput("builtins/timeSecond.poc");
	}

	@Test
	public void testCompiledTimeSecond() throws Exception {
		checkCompiledOutput("builtins/timeSecond.poc");
	}

	@Test
	public void testInterpretedTupleCount() throws Exception {
		checkInterpretedOutput("builtins/tupleCount.poc");
	}

	@Test
	public void testCompiledTupleCount() throws Exception {
		checkCompiledOutput("builtins/tupleCount.poc");
	}

}
