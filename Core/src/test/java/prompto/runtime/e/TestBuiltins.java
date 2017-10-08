package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestBuiltins extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedBooleanText() throws Exception {
		checkInterpretedOutput("builtins/booleanText.pec");
	}

	@Test
	public void testCompiledBooleanText() throws Exception {
		checkCompiledOutput("builtins/booleanText.pec");
	}

	@Test
	public void testInterpretedCategoryText() throws Exception {
		checkInterpretedOutput("builtins/categoryText.pec");
	}

	@Test
	public void testCompiledCategoryText() throws Exception {
		checkCompiledOutput("builtins/categoryText.pec");
	}

	@Test
	public void testInterpretedCharCodePoint() throws Exception {
		checkInterpretedOutput("builtins/charCodePoint.pec");
	}

	@Test
	public void testCompiledCharCodePoint() throws Exception {
		checkCompiledOutput("builtins/charCodePoint.pec");
	}

	@Test
	public void testInterpretedCharText() throws Exception {
		checkInterpretedOutput("builtins/charText.pec");
	}

	@Test
	public void testCompiledCharText() throws Exception {
		checkCompiledOutput("builtins/charText.pec");
	}

	@Test
	public void testInterpretedDateDayOfMonth() throws Exception {
		checkInterpretedOutput("builtins/dateDayOfMonth.pec");
	}

	@Test
	public void testCompiledDateDayOfMonth() throws Exception {
		checkCompiledOutput("builtins/dateDayOfMonth.pec");
	}

	@Test
	public void testInterpretedDateDayOfYear() throws Exception {
		checkInterpretedOutput("builtins/dateDayOfYear.pec");
	}

	@Test
	public void testCompiledDateDayOfYear() throws Exception {
		checkCompiledOutput("builtins/dateDayOfYear.pec");
	}

	@Test
	public void testInterpretedDateMonth() throws Exception {
		checkInterpretedOutput("builtins/dateMonth.pec");
	}

	@Test
	public void testCompiledDateMonth() throws Exception {
		checkCompiledOutput("builtins/dateMonth.pec");
	}

	@Test
	public void testInterpretedDateText() throws Exception {
		checkInterpretedOutput("builtins/dateText.pec");
	}

	@Test
	public void testCompiledDateText() throws Exception {
		checkCompiledOutput("builtins/dateText.pec");
	}

	@Test
	public void testInterpretedDateTimeDayOfMonth() throws Exception {
		checkInterpretedOutput("builtins/dateTimeDayOfMonth.pec");
	}

	@Test
	public void testCompiledDateTimeDayOfMonth() throws Exception {
		checkCompiledOutput("builtins/dateTimeDayOfMonth.pec");
	}

	@Test
	public void testInterpretedDateTimeDayOfYear() throws Exception {
		checkInterpretedOutput("builtins/dateTimeDayOfYear.pec");
	}

	@Test
	public void testCompiledDateTimeDayOfYear() throws Exception {
		checkCompiledOutput("builtins/dateTimeDayOfYear.pec");
	}

	@Test
	public void testInterpretedDateTimeHour() throws Exception {
		checkInterpretedOutput("builtins/dateTimeHour.pec");
	}

	@Test
	public void testCompiledDateTimeHour() throws Exception {
		checkCompiledOutput("builtins/dateTimeHour.pec");
	}

	@Test
	public void testInterpretedDateTimeMilli() throws Exception {
		checkInterpretedOutput("builtins/dateTimeMilli.pec");
	}

	@Test
	public void testCompiledDateTimeMilli() throws Exception {
		checkCompiledOutput("builtins/dateTimeMilli.pec");
	}

	@Test
	public void testInterpretedDateTimeMinute() throws Exception {
		checkInterpretedOutput("builtins/dateTimeMinute.pec");
	}

	@Test
	public void testCompiledDateTimeMinute() throws Exception {
		checkCompiledOutput("builtins/dateTimeMinute.pec");
	}

	@Test
	public void testInterpretedDateTimeMonth() throws Exception {
		checkInterpretedOutput("builtins/dateTimeMonth.pec");
	}

	@Test
	public void testCompiledDateTimeMonth() throws Exception {
		checkCompiledOutput("builtins/dateTimeMonth.pec");
	}

	@Test
	public void testInterpretedDateTimeSecond() throws Exception {
		checkInterpretedOutput("builtins/dateTimeSecond.pec");
	}

	@Test
	public void testCompiledDateTimeSecond() throws Exception {
		checkCompiledOutput("builtins/dateTimeSecond.pec");
	}

	@Test
	public void testInterpretedDateTimeText() throws Exception {
		checkInterpretedOutput("builtins/dateTimeText.pec");
	}

	@Test
	public void testCompiledDateTimeText() throws Exception {
		checkCompiledOutput("builtins/dateTimeText.pec");
	}

	@Test
	public void testInterpretedDateTimeYear() throws Exception {
		checkInterpretedOutput("builtins/dateTimeYear.pec");
	}

	@Test
	public void testCompiledDateTimeYear() throws Exception {
		checkCompiledOutput("builtins/dateTimeYear.pec");
	}

	@Test
	public void testInterpretedDateYear() throws Exception {
		checkInterpretedOutput("builtins/dateYear.pec");
	}

	@Test
	public void testCompiledDateYear() throws Exception {
		checkCompiledOutput("builtins/dateYear.pec");
	}

	@Test
	public void testInterpretedDecimalText() throws Exception {
		checkInterpretedOutput("builtins/decimalText.pec");
	}

	@Test
	public void testCompiledDecimalText() throws Exception {
		checkCompiledOutput("builtins/decimalText.pec");
	}

	@Test
	public void testInterpretedDictCount() throws Exception {
		checkInterpretedOutput("builtins/dictCount.pec");
	}

	@Test
	public void testCompiledDictCount() throws Exception {
		checkCompiledOutput("builtins/dictCount.pec");
	}

	@Test
	public void testInterpretedDictKeys() throws Exception {
		checkInterpretedOutput("builtins/dictKeys.pec");
	}

	@Test
	public void testCompiledDictKeys() throws Exception {
		checkCompiledOutput("builtins/dictKeys.pec");
	}

	@Test
	public void testInterpretedDictText() throws Exception {
		checkInterpretedOutput("builtins/dictText.pec");
	}

	@Test
	public void testCompiledDictText() throws Exception {
		checkCompiledOutput("builtins/dictText.pec");
	}

	@Test
	public void testInterpretedDictValues() throws Exception {
		checkInterpretedOutput("builtins/dictValues.pec");
	}

	@Test
	public void testCompiledDictValues() throws Exception {
		checkCompiledOutput("builtins/dictValues.pec");
	}

	@Test
	public void testInterpretedDocumentText() throws Exception {
		checkInterpretedOutput("builtins/documentText.pec");
	}

	@Test
	public void testCompiledDocumentText() throws Exception {
		checkCompiledOutput("builtins/documentText.pec");
	}

	@Test
	public void testInterpretedEnumName() throws Exception {
		checkInterpretedOutput("builtins/enumName.pec");
	}

	@Test
	public void testCompiledEnumName() throws Exception {
		checkCompiledOutput("builtins/enumName.pec");
	}

	@Test
	public void testInterpretedEnumSymbols() throws Exception {
		checkInterpretedOutput("builtins/enumSymbols.pec");
	}

	@Test
	public void testCompiledEnumSymbols() throws Exception {
		checkCompiledOutput("builtins/enumSymbols.pec");
	}

	@Test
	public void testInterpretedEnumValue() throws Exception {
		checkInterpretedOutput("builtins/enumValue.pec");
	}

	@Test
	public void testCompiledEnumValue() throws Exception {
		checkCompiledOutput("builtins/enumValue.pec");
	}

	@Test
	public void testInterpretedIntegerFormat() throws Exception {
		checkInterpretedOutput("builtins/integerFormat.pec");
	}

	@Test
	public void testCompiledIntegerFormat() throws Exception {
		checkCompiledOutput("builtins/integerFormat.pec");
	}

	@Test
	public void testInterpretedIntegerText() throws Exception {
		checkInterpretedOutput("builtins/integerText.pec");
	}

	@Test
	public void testCompiledIntegerText() throws Exception {
		checkCompiledOutput("builtins/integerText.pec");
	}

	@Test
	public void testInterpretedListCount() throws Exception {
		checkInterpretedOutput("builtins/listCount.pec");
	}

	@Test
	public void testCompiledListCount() throws Exception {
		checkCompiledOutput("builtins/listCount.pec");
	}

	@Test
	public void testInterpretedListText() throws Exception {
		checkInterpretedOutput("builtins/listText.pec");
	}

	@Test
	public void testCompiledListText() throws Exception {
		checkCompiledOutput("builtins/listText.pec");
	}

	@Test
	public void testInterpretedPeriodText() throws Exception {
		checkInterpretedOutput("builtins/periodText.pec");
	}

	@Test
	public void testCompiledPeriodText() throws Exception {
		checkCompiledOutput("builtins/periodText.pec");
	}

	@Test
	public void testInterpretedSetCount() throws Exception {
		checkInterpretedOutput("builtins/setCount.pec");
	}

	@Test
	public void testCompiledSetCount() throws Exception {
		checkCompiledOutput("builtins/setCount.pec");
	}

	@Test
	public void testInterpretedSetText() throws Exception {
		checkInterpretedOutput("builtins/setText.pec");
	}

	@Test
	public void testCompiledSetText() throws Exception {
		checkCompiledOutput("builtins/setText.pec");
	}

	@Test
	public void testInterpretedTextCapitalize() throws Exception {
		checkInterpretedOutput("builtins/textCapitalize.pec");
	}

	@Test
	public void testCompiledTextCapitalize() throws Exception {
		checkCompiledOutput("builtins/textCapitalize.pec");
	}

	@Test
	public void testInterpretedTextCount() throws Exception {
		checkInterpretedOutput("builtins/textCount.pec");
	}

	@Test
	public void testCompiledTextCount() throws Exception {
		checkCompiledOutput("builtins/textCount.pec");
	}

	@Test
	public void testInterpretedTextLowercase() throws Exception {
		checkInterpretedOutput("builtins/textLowercase.pec");
	}

	@Test
	public void testCompiledTextLowercase() throws Exception {
		checkCompiledOutput("builtins/textLowercase.pec");
	}

	@Test
	public void testInterpretedTextReplace() throws Exception {
		checkInterpretedOutput("builtins/textReplace.pec");
	}

	@Test
	public void testCompiledTextReplace() throws Exception {
		checkCompiledOutput("builtins/textReplace.pec");
	}

	@Test
	public void testInterpretedTextReplaceAll() throws Exception {
		checkInterpretedOutput("builtins/textReplaceAll.pec");
	}

	@Test
	public void testCompiledTextReplaceAll() throws Exception {
		checkCompiledOutput("builtins/textReplaceAll.pec");
	}

	@Test
	public void testInterpretedTextSplit() throws Exception {
		checkInterpretedOutput("builtins/textSplit.pec");
	}

	@Test
	public void testCompiledTextSplit() throws Exception {
		checkCompiledOutput("builtins/textSplit.pec");
	}

	@Test
	public void testInterpretedTextText() throws Exception {
		checkInterpretedOutput("builtins/textText.pec");
	}

	@Test
	public void testCompiledTextText() throws Exception {
		checkCompiledOutput("builtins/textText.pec");
	}

	@Test
	public void testInterpretedTextTrim() throws Exception {
		checkInterpretedOutput("builtins/textTrim.pec");
	}

	@Test
	public void testCompiledTextTrim() throws Exception {
		checkCompiledOutput("builtins/textTrim.pec");
	}

	@Test
	public void testInterpretedTextUppercase() throws Exception {
		checkInterpretedOutput("builtins/textUppercase.pec");
	}

	@Test
	public void testCompiledTextUppercase() throws Exception {
		checkCompiledOutput("builtins/textUppercase.pec");
	}

	@Test
	public void testInterpretedTimeHour() throws Exception {
		checkInterpretedOutput("builtins/timeHour.pec");
	}

	@Test
	public void testCompiledTimeHour() throws Exception {
		checkCompiledOutput("builtins/timeHour.pec");
	}

	@Test
	public void testInterpretedTimeMilli() throws Exception {
		checkInterpretedOutput("builtins/timeMilli.pec");
	}

	@Test
	public void testCompiledTimeMilli() throws Exception {
		checkCompiledOutput("builtins/timeMilli.pec");
	}

	@Test
	public void testInterpretedTimeMinute() throws Exception {
		checkInterpretedOutput("builtins/timeMinute.pec");
	}

	@Test
	public void testCompiledTimeMinute() throws Exception {
		checkCompiledOutput("builtins/timeMinute.pec");
	}

	@Test
	public void testInterpretedTimeSecond() throws Exception {
		checkInterpretedOutput("builtins/timeSecond.pec");
	}

	@Test
	public void testCompiledTimeSecond() throws Exception {
		checkCompiledOutput("builtins/timeSecond.pec");
	}

	@Test
	public void testInterpretedTimeText() throws Exception {
		checkInterpretedOutput("builtins/timeText.pec");
	}

	@Test
	public void testCompiledTimeText() throws Exception {
		checkCompiledOutput("builtins/timeText.pec");
	}

	@Test
	public void testInterpretedTupleCount() throws Exception {
		checkInterpretedOutput("builtins/tupleCount.pec");
	}

	@Test
	public void testCompiledTupleCount() throws Exception {
		checkCompiledOutput("builtins/tupleCount.pec");
	}

	@Test
	public void testInterpretedTupleText() throws Exception {
		checkInterpretedOutput("builtins/tupleText.pec");
	}

	@Test
	public void testCompiledTupleText() throws Exception {
		checkCompiledOutput("builtins/tupleText.pec");
	}

	@Test
	public void testInterpretedUuidText() throws Exception {
		checkInterpretedOutput("builtins/uuidText.pec");
	}

	@Test
	public void testCompiledUuidText() throws Exception {
		checkCompiledOutput("builtins/uuidText.pec");
	}

}

