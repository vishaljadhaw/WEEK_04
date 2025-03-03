package com.Day_05.Regex.Basic_Regex_Problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorCode {
    public static void main(String[] args) {

        String [] input={"#FFA500","#FFA500","#123"};
        String regex="#[0-9A-Fa-f]{6}";

        Pattern pattern=Pattern.compile(regex);
        for(int i=0;i<input.length;i++)
        {
            Matcher matcher=pattern.matcher(input[i]);
            if ((matcher.matches()))
            {
                System.out.println("Valid");
            }
            else {
                System.out.println("Invalid");
            }
        }

    }
}
