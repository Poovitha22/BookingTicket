package com.chainsys.validation;

import java.util.regex.Pattern;

public class EmailValidation {
	//This function is used to validate the password......
    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        // If the password is empty
        // return false
        if (email == null)
            return false;
        //matcher method is used to find matching between given email with regular expression........
        // return the password
        return pat.matcher(email).matches();
    }



}
