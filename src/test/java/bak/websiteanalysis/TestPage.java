package bak.websiteanalysis;

import org.junit.Before;
import org.junit.Test;

public class TestPage {

	@Before
	public void setup() {
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPageDefaultConstructorReceiveException() {
		Page expectedException = new Page();
	}
	
	@Test
	public void testCreateUrlList() {
		
	}
}
