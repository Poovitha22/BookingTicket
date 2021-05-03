package com.chainsys;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RegistrationTest1 {

	@Test
	public void testcase1() {
		Registration.registrationUser("poovi","pass1234","poovi@gmail.com",9629324387L);
		
	}
	@Test
	public void testcase2() {
	    boolean valid=Registration.login("poovi", "pass1234");
		assertEquals(true,valid);

		
	}


}
