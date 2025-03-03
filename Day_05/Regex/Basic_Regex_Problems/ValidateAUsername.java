package com.Day_05.Regex.Basic_Regex_Problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAUsername {
    public static void main(String[] args) {


        String[] userName={"user_123","123user","us"};

        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        Pattern pattern= Pattern.compile(regex);
        for(int i=0;i<userName.length;i++)
        {
            Matcher matcher=pattern.matcher(userName[i]);
            if(matcher.matches())
            {
                System.out.println("Valid");
            }
            else {
                System.out.println("Invalid");
            }

        }
    }
}
