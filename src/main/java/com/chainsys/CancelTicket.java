package com.chainsys;

public class CancelTicket {
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
        System.out.println("YOUR BOOKING IS CANCELLED");
        CancelTicket.view(email, password);


	}

}
