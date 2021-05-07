package com.chainsys.service;

import com.chainsys.user.Login;

public class ViewTicket {

	public static void main(String[] args) {

		String email = "poovi@gmail.com";
		System.out.println("ENTER THE EMAILID :" + email);
		String password = "Pass@1234";
		System.out.println("ENTER THE PASSWORD :" + password);
		System.out.println("SUBMIT");
		System.out.println("VIEW YOUR BOOKING DETAILS");
		Login.login(email, password);
		Busbooking.bookingRoutes(3); // Route No:3
		BillAmount.bustype(3, 3);// Display the bustype and amount
		// Home.bookingRoutes(4); //Route No:4
		// Home.bustype(4,4);//Display the bustype and amount
		// view tickets details
		BillAmount.displayTickets();

	}

}
