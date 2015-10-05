// generated: 2015-10-05T22:40:44.518
package prompto.library.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestConsole extends BaseEParserTest {

	@Before
	public void before() throws Exception {
		Out.init();
		loadDependency("console");
		loadDependency("core");
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testPrint() throws Exception {
		runTests("console/print.pec");
	}

}

