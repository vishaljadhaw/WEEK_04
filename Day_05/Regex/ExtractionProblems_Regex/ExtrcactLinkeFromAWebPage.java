package com.Day_05.Regex.ExtractionProblems_Regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtrcactLinkeFromAWebPage {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        String regex = "\\bhttps?://[\\w.-]+(?:\\.[a-zA-Z]{2,})+\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find())
        {
            System.out.println(matcher.group());
        }


    }
}
