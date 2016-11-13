package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestAdd extends BaseEParserTest {

	@Test
	public void testAddCharacter() throws Exception {
		compareResourceESE("add/addCharacter.pec");
	}

	@Test
	public void testAddDate() throws Exception {
		compareResourceESE("add/addDate.pec");
	}

	@Test
	public void testAddDateTime() throws Exception {
		compareResourceESE("add/addDateTime.pec");
	}

	@Test
	public void testAddDecimal() throws Exception {
		compareResourceESE("add/addDecimal.pec");
	}

	@Test
	public void testAddDecimalEnum() throws Exception {
		compareResourceESE("add/addDecimalEnum.pec");
	}

	@Test
	public void testAddDict() throws Exception {
		compareResourceESE("add/addDict.pec");
	}

	@Test
	public void testAddInteger() throws Exception {
		compareResourceESE("add/addInteger.pec");
	}

	@Test
	public void testAddIntegerEnum() throws Exception {
		compareResourceESE("add/addIntegerEnum.pec");
	}

	@Test
	public void testAddList() throws Exception {
		compareResourceESE("add/addList.pec");
	}

	@Test
	public void testAddPeriod() throws Exception {
		compareResourceESE("add/addPeriod.pec");
	}

	@Test
	public void testAddSet() throws Exception {
		compareResourceESE("add/addSet.pec");
	}

	@Test
	public void testAddTextCharacter() throws Exception {
		compareResourceESE("add/addTextCharacter.pec");
	}

	@Test
	public void testAddTextDecimal() throws Exception {
		compareResourceESE("add/addTextDecimal.pec");
	}

	@Test
	public void testAddTextEnum() throws Exception {
		compareResourceESE("add/addTextEnum.pec");
	}

	@Test
	public void testAddTextInteger() throws Exception {
		compareResourceESE("add/addTextInteger.pec");
	}

	@Test
	public void testAddTextText() throws Exception {
		compareResourceESE("add/addTextText.pec");
	}

	@Test
	public void testAddTime() throws Exception {
		compareResourceESE("add/addTime.pec");
	}

	@Test
	public void testAddTuple() throws Exception {
		compareResourceESE("add/addTuple.pec");
	}

}

