package com.Day_05.Regex.Advanced_Problem_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgrammingLanguage {
    public static void main(String[] args) {
        String text="I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String regex="\\b(JavaScript|Java|Python|C\\+\\+|C#|Ruby|Go|Swift|Kotlin|PHP|Perl|Rust|TypeScript|Scala|R)\\b";


        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);

        while(matcher.find())
        {
            System.out.print(matcher.group()+" ");
        }
    }
}
