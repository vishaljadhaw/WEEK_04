package com.Day_05.Regex.ReplaceandModifyStrings_Regex;

public class CensorBadWord {
    public static void main(String[] args) {
        String input="This is a damn bad example with some stupid words.";
        input=input.replace("damn","****");
        input=input.replace("stupid","****");
        System.out.println(input);
        }
}
