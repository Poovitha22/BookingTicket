package com.chainsys.service;

public class CancelTicket {
	/**
	 *check the valid email and password......
	 * @param email
	 * @param password
	 * @return
	 */
	public static boolean login(String email,String password)
	{
		boolean valid=email.equals("poovi@gmail.com") && password.equals("Pass@1234");
		return valid;
		
	}

	public static void main(String[] args) {
		String email="poovi@gmail.com";
        System.out.println("ENTER THE EMAILID :"+email);
    	String password="Pass@1234";
        System.out.println("ENTER THE PASSWORD :"+password);
        System.out.println("SUBMIT");
        //CancelTicket.login(email, password);
	    boolean isvalid=CancelTicket.login(email,password);
	    if(isvalid) 
	    {
	        System.out.println("YOUR BOOKING IS CANCELLED");
	        System.out.println("YOUR AMOUNT WILL BE RETURNED SOON");
	    }
	    else
	    {
	    	System.out.println("ENTER THE VALID CRENDIALS");
	    }



	}

}
