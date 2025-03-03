package com.Day_05.Regex.Basic_Regex_Problems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicensePlate {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the license plate number");
        String licensePlateNumber=sc.nextLine();
        String regex="[A-Z]{2}[0-9]{4}";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(licensePlateNumber);

        if(matcher.matches())
        {
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }


    }
}
