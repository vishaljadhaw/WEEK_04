package com.Day_05.Regex.Advanced_Problem_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWord {
    public static void main(String[] args) {
        String text="This is is a repeated repeated word test.";
        String regex="\\b(\\w+)\\b(?:\\s+\\1\\b)+";

        Pattern pattern=Pattern.compile(regex);
            Matcher matcher=pattern.matcher(text);

            while(matcher.find())
            {
                System.out.print(matcher.group()+" ");
            }
    }

}
