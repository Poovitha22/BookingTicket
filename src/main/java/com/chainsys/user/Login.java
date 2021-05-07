package com.chainsys.user;

import com.chainsys.validation.EmailValidation;
import com.chainsys.validation.PasswordValidation;

public class Login {
	public static boolean login(String email,String password)
	{
		boolean valid = false;
		boolean validEmail = EmailValidation.isValid(email);
		boolean validPassword = PasswordValidation.isValidPassword(password);
		if(validEmail && validPassword) {
			valid = true;
		}
		else {
			valid = false;
		}
		return valid;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password="Pass@1234";
		String email="poovi@gmail.com";
	    boolean isvalid=Login.login(email,password);
	    if(isvalid) 
	    {
		    	System.out.println("LOGIN SUCESSFULLY!!!!!!");
		    }
		   
	    else
	    {
	    	System.out.println("INVALID EMAILID");
	    }


	}

}
