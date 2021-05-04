package com.chainsys;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {
	public static boolean login(String email,String password)
	{
		boolean valid=email.equals("poovi@gmail.com") && password.length()>=8;
		return valid;
		
	}
	public static boolean isValid(String email)
	{
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(regex);
	}
    public static boolean isValidPassword(String password)
    {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);
        return m.matches();
      }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password="Pass@1234";
		String email="poovi@gmail.com";
	    boolean isvalid=Login.isValid(email);
	    if(isvalid) 
	    {
	    	System.out.println("VALID EMAILID");
		    boolean isValidPassword=Login.isValidPassword(password);
		    if(isValidPassword){
		    	System.out.println("VALID PASSWORD");
		    	System.out.println("LOGIN SUCESSFULLY!!!!!!");
		    }
		    else
		    {
		    	System.out.println("INVALID LOGIN CRENDIALS");
		    }
        }
	    else
	    {
	    	System.out.println("INVALID EMAILID");
	    }


	}

}
