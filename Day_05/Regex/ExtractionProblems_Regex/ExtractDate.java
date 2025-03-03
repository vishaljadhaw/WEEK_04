package com.Day_05.Regex.ExtractionProblems_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDate {
    public static void main(String[] args) {
        String text="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        String regex="\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);

        while (matcher.find())
        {

            System.out.print(matcher.group()+", ");
        }
    }
}
