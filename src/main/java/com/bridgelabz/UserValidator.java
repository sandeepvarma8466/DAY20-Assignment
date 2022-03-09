package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidator {
    public boolean validateEmailAddress(String email){
        Pattern pattern = Pattern.compile("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@([0-9a-zA-Z])+[.][a-zA-z]{2,4}([.][a-zA-z]{2,4})?$");
        return pattern.matcher(email).matches();
    }
}
