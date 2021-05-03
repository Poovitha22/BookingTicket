package com.chainsys;


public class ViewTicket {
	public static boolean view(String email,String password)
	{
		boolean valid=email.equals("poovi@gmail.com") && password.length()>=8;
		return valid;
		
	}

	public static void main(String[] args) {
		String email="poovi@gmail.com";
        System.out.println("ENTER THE EMAILID :"+email);
    	String password="pass1234";
        System.out.println("ENTER THE PASSWORD :"+password);
        System.out.println("SUBMIT");
        System.out.println("VIEW YOUR BOOKING DETAILS");
        ViewTicket.view(email, password);
        Home.bookingRoutes(3); //Route No:3
        Home.bustype(3,3);//Display the bustype and amount
        Home.bookingRoutes(4); //Route No:4
        Home.bustype(4,4);//Display the bustype and amount
        // view tickets details
        Home.displayTickets();


	}

}
