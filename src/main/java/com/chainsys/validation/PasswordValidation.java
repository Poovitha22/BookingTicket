package com.chainsys.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
	//This function is used to validate the password
    public static boolean isValidPassword(String password)
    {
        // Regex to check valid password.......
         String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        Pattern p = Pattern.compile(regex);
        // If the password is empty
        // return false
        if (password == null) {
            return false;
        }
        //matcher method is used to find matching between given password with regular expression........
        Matcher m = p.matcher(password);
        //If matches return the password
        return m.matches();
      }

	
}
