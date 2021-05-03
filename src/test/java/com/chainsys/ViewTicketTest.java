package com.chainsys;



import org.junit.Test;

public class ViewTicketTest {

	@Test
	public void testcase1() {
        ViewTicket.view("poovi@gmail.com", "pass1234");

	}
	@Test
	public void testcase2() {
        Home.displayTickets();

	}


}
