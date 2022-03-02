package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRigistration {
    public static void main(String[] args) {
        //UC1 User need to enter a valid first name
        Pattern firstName = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = firstName.matcher("Gajini");
        System.out.println(matcher.find());
        System.out.println("------------1---------");
        //UC2 user need to enter a valid  last name
        Pattern lastName = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher1 = lastName.matcher("Rajesh");
        System.out.println(matcher1.find());
        System.out.println("------------2---------");
        //UC3 user need to enter a valid email
        Pattern email = Pattern.compile("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+[.][a-zA-z]{2,4}([.][a-zA-z]{2,4})?$");
        Matcher matcher2 = email.matcher("abx@gmail.com");
        System.out.println(matcher2.find());
        System.out.println("------------3---------");
        //UC4 pre-defined Mobile format
        Pattern mobile = Pattern.compile("^(\\+91|0|91)?[9876][0-9]{9}$");
        Matcher format = mobile.matcher("9059863568");
        System.out.println(format.find());
        System.out.println("------------4---------");
        // User need to follow pre defined password rules.
        // UC5  Rule1 minimum 8 characters
        Pattern rule1 = Pattern.compile("^[A-Za-z]{8,}$");
        Matcher password = rule1.matcher("rajeshkhanna");
        System.out.println(password.find());
        System.out.println("------------5-----------");
        // UC6  Rule2 Should have at least 1 upper case
        Pattern rule2 = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).{8,}$");
        Matcher password1 = rule2.matcher("njsjksklllLwk");
        System.out.println(password1.find());
        System.out.println("------------6-----------");
        // UC7  Rule3 Should have at least 1 numeric number
        Pattern rule3 = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$");
        Matcher password3 = rule3.matcher("njsjksklll7Lwk");
        System.out.println(password3.find());
        System.out.println("------------7-----------");

        // UC8  Rule4 Has exactly 1 special Character
        Pattern rule4 = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()-[{}]:;',?/*~$^+=<>]).{8,}$");
        Matcher password4 = rule4.matcher("njsjkskl@ll7Lwk");
        System.out.println(password4.find());
        System.out.println("------------8-----------");

    }
}
