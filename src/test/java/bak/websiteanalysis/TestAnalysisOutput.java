package bak.websiteanalysis;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;

public class TestAnalysisOutput {
	final String home = System.getProperty("user.dir");
	java.nio.file.Path outputLocation =
			java.nio.file.Paths.get(home, "output");

	@Test
	public void testOutputDirectoryWasCreated() {
		File f = new File(outputLocation.toString());
		assertTrue("output directory should exist", f.exists());
	}
	
	@Test
	public void testOutputFileNameConforms() {

	}
	
	@Test
	public void testHasOutputFileCreationMessage() {
		assertNotNull("app should have a usage message",
				AnalysisOutput.outputCreationSuccess("MessageTest"));
	}
	
	@Test
	public void testJsonFileCreated() {
		
	}
	
	@Test
	public void testExcelHeaderCreated() {
		
	}
	
	@Test
	public void testExcelFileCreated() {
		
	}
	
	@Test
	public void testTextFileCreated() {
		
	}
	
}
