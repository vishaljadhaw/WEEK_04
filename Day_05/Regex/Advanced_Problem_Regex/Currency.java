package com.Day_05.Regex.Advanced_Problem_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency
{
    public static void main(String[] args) {
        String text="The price is $45.99, and the discount is 10.50.";
        String regex="\\$?\\d+(\\.\\d{1,2})?";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);

        while(matcher.find())
        {
            System.out.print(matcher.group()+", ");
        }
    }
}
