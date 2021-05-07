package com.chainsys;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.chainsys.service.CancelTicket;

public class CancelTicketTest {

	@Test
	public void testcase1() {
        boolean valid =CancelTicket.login("poovi@gmail.com", "Pass@1234");
        assertTrue(valid);

		
	}
	@Test
	public void testcase2() {
        boolean valid =CancelTicket.login("poovimail.com", "Pa234");
        assertFalse(valid);

		
	}
	@Test
	public void testcase3() {
        boolean valid =CancelTicket.login("435565", "787687");
        assertFalse(valid);

		
	}
}
