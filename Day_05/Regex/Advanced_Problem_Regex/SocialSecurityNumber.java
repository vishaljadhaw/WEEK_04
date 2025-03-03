package com.Day_05.Regex.Advanced_Problem_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SocialSecurityNumber {
    public static void main(String[] args) {
        String[] ssnSamples = {"123-45-6789", "123456789"};

        // Regex pattern for SSN (Format: XXX-XX-XXXX)
        String regex = "^(?!000|666|9\\d{2})\\d{3}-(?!00)\\d{2}-(?!0000)\\d{4}$";

        // Compile regex
        Pattern pattern = Pattern.compile(regex);

        for (String ssn : ssnSamples) {
            Matcher matcher = pattern.matcher(ssn);
            if (matcher.matches())
                {
                    System.out.println(ssn + " is valid");
                }
                else
                {
                    System.out.println(ssn+" is invalid");
                }
                }
                }
            }
