package com.Day_05.Regex.ReplaceandModifyStrings_Regex;



public class MultipleSpaces {
    public static void main(String[] args) {
        String input = "This  is   an   example    with  multiple   spaces.";

        // Replace multiple spaces with a single space
        String output = input.replaceAll("\\s+", " ");

        System.out.println(output);
    }
}
