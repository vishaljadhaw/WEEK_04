package com.Day_05.Regex.ExtractionProblems_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllCapitalizedWords {

    public static void main(String[] args) {
        String text="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
         String regex="\\b(?!The\\b)[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);

        while(matcher.find())
        {
            System.out.print(matcher.group()+", ");
        }
    }
}
