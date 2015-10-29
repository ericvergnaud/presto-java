package prompto.store.solr;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.solr.client.solrj.embedded.EmbeddedSolrServer;
import org.apache.solr.core.CoreContainer;
import org.apache.solr.core.CoreDescriptor;
import org.apache.solr.core.SolrCore;
import org.junit.After;
import org.junit.Before;

public abstract class BaseSOLRTest {
	
	File solrRoot = new File("target/test-classes/solr-test");
	CoreContainer container;
	SolrCore core;
	EmbeddedSolrServer server;
			
	@Before
	public void startContainer() {
		if(container==null) {
			CoreContainer container = new CoreContainer(solrRoot.getAbsolutePath());
			container.load();
			this.container = container;
		}
	}
	
	protected void startServerWithEmptyCore(String coreName) throws Exception {
		if(server==null) {
			File coreDir = new File(solrRoot, coreName);
			if(coreDir.exists())
				delete(coreDir);
			File confDir = new File(coreDir, "conf");
			confDir.mkdir();
			copyResourceToFile("solr/solrconfig.xml", new File(confDir, "solrconfig.xml"));
			copyResourceToFile("solr/emptyschema.xml", new File(confDir, "schema.xml"));
			copyResourceToFile("solr/stopwords.txt", new File(confDir, "stopwords.txt"));
			CoreDescriptor cd = new CoreDescriptor(container, coreName, coreDir.getAbsolutePath());
			core = container.create(cd);
			server = new EmbeddedSolrServer(container, coreName);
		}
	}
	
	private void delete(File file) {
		if(!file.exists())
			return;
		if(file.isDirectory()) for(String name : file.list())
			delete(new File(file, name));
		file.delete();
	}

	private void copyResourceToFile(String resourcePath, File destination) throws IOException {
		URL inputUrl = Thread.currentThread().getContextClassLoader().getResource(resourcePath);
		FileUtils.copyURLToFile(inputUrl, destination);	
	}

	@After
	public void after() {
		shutdownServer();
		shutdownCore();
		shutdownContainer();
	}
	
	public void shutdownServer() {
		if(server!=null) {
			server.shutdown();
			server = null;
		}
	}
	
	public void shutdownCore() {
		if(core!=null) {
			if(!core.isClosed())
				core.close();
			core = null;
		}
	}
	
	public void shutdownContainer() {
		if(container!=null) {
			if(!container.isShutDown())
				container.shutdown();
			container = null;
		}
	}
	
}
