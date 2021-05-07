package com.chainsys;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.chainsys.user.Login;

public class LoginTest {

	@Test
	public void testValidemailvalidpassword() {  //valid email and password......
	      String email="poovi@gmail.com";
          String password="Pass@1234";
		  boolean actual=Login.login(email, password);
		  assertTrue(actual);
	
		}
	@Test
	public void testValidemailInvalidpassword() {   //valid email and invalid password......
		String email="poovi@gmail.com";
        String password="1234";
		boolean actual=Login.login(email, password);
		assertFalse(actual);
	}
	@Test
	public void testInValidemailvalidpassword() {   //invalid email and valid password......
		String email="gmail.com";
        String password="Pass@1234";
		boolean actual=Login.login(email, password);
		assertFalse(actual);
	}
	@Test
	public void testInValidemailInvalidpassword() {   // invalid email and password......
		String email="venkat@gmail.com";
        String password="1234";
		boolean actual=Login.login(email, password);
		assertFalse(actual);
	}

}
