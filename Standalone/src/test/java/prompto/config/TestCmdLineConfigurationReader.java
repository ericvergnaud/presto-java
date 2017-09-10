package prompto.config;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import org.junit.Test;

import prompto.code.Version;
import prompto.utils.CmdLineParser;

public class TestCmdLineConfigurationReader {

	@Test
	public void testComplexCmdLine() {
		String[] args = { "-codeStore-factory", "prompto.store.mongo.MongoStoreFactory",
				"-codeStore-host", "localhost",
				"-codeStore-port", "27017",
				"-codeStore-dbName", "ROOT",
				"-dataStore-factory", "prompto.store.mongo.MongoStoreFactory",
				"-dataStore-host", "localhost",
				"-dataStore-port", "27017",
				"-dataStore-dbName", "CODE",
				"-resourceURLs", "awsClient.pec",
				"-applicationName", "dev-center",
				"-applicationVersion", "1.2.31.7",
				"-mainMethod", "myMethod" };
		
		Map<String, String> argsMap = CmdLineParser.parse(args);
		IConfigurationReader reader = new CmdLineConfigurationReader(argsMap);
		IStandaloneConfiguration config = new StandaloneConfiguration(reader, argsMap);
		// simple values
		assertEquals("dev-center", config.getApplicationName());
		assertEquals("myMethod", config.getMainMethod());
		// converted values
		assertEquals(Version.parse("1.2.31.7"), config.getApplicationVersion());
		URL url = Thread.currentThread().getContextClassLoader().getResource("awsClient.pec");
		assertEquals(Collections.singletonList(url), Arrays.asList(config.getResourceURLs()));
		// embedded values
		IStoreConfiguration store = config.getCodeStoreConfiguration();
		assertNotNull(store);
		assertEquals("prompto.store.mongo.MongoStoreFactory", store.getFactory());
		assertEquals("localhost", store.getHost());
		assertEquals(27017, store.getPort().intValue());
		assertEquals("ROOT", store.getDbName());
		store = config.getDataStoreConfiguration();
		assertNotNull(store);
		assertEquals("prompto.store.mongo.MongoStoreFactory", store.getFactory());
		assertEquals("localhost", store.getHost());
		assertEquals(27017, store.getPort().intValue());
		assertEquals("CODE", store.getDbName());
	}
}
