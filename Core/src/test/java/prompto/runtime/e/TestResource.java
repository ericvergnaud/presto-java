package prompto.runtime.e;

import net.jcip.annotations.NotThreadSafe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

@NotThreadSafe
public class TestResource extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedReadResource() throws Exception {
		checkInterpretedOutput("resource/readResource.pec");
	}

	@Test
	public void testCompiledReadResource() throws Exception {
		checkCompiledOutput("resource/readResource.pec");
	}

	@Test
	public void testInterpretedReadWithResource() throws Exception {
		checkInterpretedOutput("resource/readWithResource.pec");
	}

	@Test
	public void testCompiledReadWithResource() throws Exception {
		checkCompiledOutput("resource/readWithResource.pec");
	}

	@Test
	public void testInterpretedWriteResource() throws Exception {
		checkInterpretedOutput("resource/writeResource.pec");
	}

	@Test
	public void testCompiledWriteResource() throws Exception {
		checkCompiledOutput("resource/writeResource.pec");
	}

	@Test
	public void testInterpretedWriteWithResource() throws Exception {
		checkInterpretedOutput("resource/writeWithResource.pec");
	}

	@Test
	public void testCompiledWriteWithResource() throws Exception {
		checkCompiledOutput("resource/writeWithResource.pec");
	}

}

