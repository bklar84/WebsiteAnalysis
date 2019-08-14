package bak.websiteanalysis;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.junit.Before;
import org.junit.Test;

public class TestWebsite {
	final String home = System.getProperty("user.dir");
	final String invalidAbsolutePath = "zZzZzZzZ";
	final String invalidFile = "invalidFile.exe";
	final String validUrl = "https://www.google.com";
	final String invalidUrl = "ftp://192.168.1.1";
	
	java.nio.file.Path testDataLocation =
			java.nio.file.Paths.get(home, "src", "test", "data", "complete");
	
	final String[] validArgs = {testDataLocation.toString(), validUrl};
			
	String[] argsWithBadPathOnly = {invalidAbsolutePath, validUrl};
	String[] argsWithBadUrlOnly = {testDataLocation.toString(), invalidUrl};
	String[] invalidArgs = {invalidAbsolutePath, invalidUrl};
	
	Website goodArguments;
	Website badPath;
	Website badUrl;
	Website badPathAndUrl;
	
	@Before
	public void setup() {
		
		Website goodArguments = new Website(validArgs);
		Website badUrl = new Website(argsWithBadUrlOnly);
		Website badPath = new Website(argsWithBadPathOnly);
		Website badPathAndUrl = new Website(invalidArgs);
		
		}
	
	@Test(expected = IllegalArgumentException.class)
	public void testWebsiteDefaultConstructorReceiveException() {
		Website expectedException = new Website();
	}
	
	@Test
	public void testVerifyFileOrDirectoryGoodFile() throws UnsupportedEncodingException {
		String path = Test.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		String decodedPath = URLDecoder.decode(path, "UTF-8");
		
		assertTrue("file should exist",
				Website.verifyFileOrDirectory(decodedPath));
	}
	
	@Test
	public void testVerifyFileOrDirectoryBadFile() {
		assertFalse(Website.verifyFileOrDirectory(invalidFile));
	}
	
	@Test
	public void testVerifyFileOrDirectoryGoodDirectory() {
		assertTrue("directory should exist",
				Website.verifyFileOrDirectory(home));
	}
	
	@Test
	public void testVerifyFileOrDirectoryBadDirectory() {
		assertFalse(Website.verifyFileOrDirectory(invalidAbsolutePath),
				"directory should not exist");
	}
	
	@Test
	public void testValidUrlValidUrl() {
		assertTrue("URL should be valid", Website.validUrl(validUrl));
	}
	
	@Test
	public void testValidUrlInvalidUrl() {
		assertFalse(Website.validUrl(invalidUrl), "URL should be invalid");
	}
	
	@Test
	public void testHasInvalidPathMessage() {
		assertNotNull("website should have an invalid path message", 
					Website.invalidPathMessage(invalidAbsolutePath));
	}
	
	@Test
	public void testFindAllHtmlFiles() {
		
	}
}
