package com.chainsys;

public class Registration {
	public static void registrationUser(String username,String password,String email,long mobileNo) {
		System.out.println("REGISTRATION SUCCESSFULLY!!!!!");

	}
	public static boolean login(String username,String password)
	{
		boolean valid=username.equals("poovi") && password.length()>=8;
		return valid;
		
	}

	public static void main(String[] args) {
		String username="poovi";
		String password="pass1234";
		String email="poovi@gmail.com";
		long mobileNo=9629324387L;
		Registration.registrationUser(username, password, email, mobileNo);
	    boolean valid=Registration.login(username, password);
	    if(valid) {
	    	System.out.println("LOGIN SUCCESSFULLY!!!!!");
	    }
	    else
	    {
	    	System.out.println("INVALID LOGIN CREDENTIALS");
	    }

	}

}
