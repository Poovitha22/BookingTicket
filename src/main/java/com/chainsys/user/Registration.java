package com.chainsys.user;

public class Registration {
	public static void registrationUser(String username, String password, String email, long mobileNo) {
		System.out.println("USER NAME : " + username + ", PASSWORD : " + password + ", EMAILID :" + email
				+ ", MOBILENO : " + mobileNo);
		System.out.println("REGISTRATION SUCCESSFULLY!!!!!");

	}

	public static void main(String[] args) {
		String username = "poovi";
		String password = "Pass@1234";
		String email = "poovi@gmail.com";
		long mobileNo = 9629324387L;
		Registration.registrationUser(username, password, email, mobileNo);
	}

}
