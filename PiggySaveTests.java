package oop1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PiggySaveTests {

	PiggySave save;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		save = new PiggySave();
	}

	@Test
	public void test() {
		System.out.println("deposit test");
		save.deposit(100);
		save.deposit(200);
		
		assertEquals(save.withdraw(), 300);
	}
	

	
}
