package com.Day_05.Regex.Advanced_Problem_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an IP address: ");
        String ip = scanner.nextLine();


        // Define the regex pattern for IPv4 validation
        String ipPattern = "^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";

        // Compile and match the pattern
        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(ip);

        // Print result
        if (matcher.matches()) {
            System.out.println(ip + " is a valid IPv4 address.");
        } else {
            System.out.println(ip + " is NOT a valid IPv4 address.");
        }
    }
}
