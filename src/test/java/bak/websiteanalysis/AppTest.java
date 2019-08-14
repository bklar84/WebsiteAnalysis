package bak.websiteanalysis;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class AppTest {
    
	@Before
	public void setup() {
		
	}
	
	@Test public void testAppHasAUsageMessage() {
        App classUnderTest = new App();
        assertNotNull("app should have a usage message", classUnderTest.getUsageMessage());
    }
}
