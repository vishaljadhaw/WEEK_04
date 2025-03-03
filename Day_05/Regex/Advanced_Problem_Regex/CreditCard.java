package com.Day_05.Regex.Advanced_Problem_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCard {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        String cardNumber = scanner.nextLine();
        scanner.close();

        // Regex patterns for Visa and MasterCard
        String visaPattern = "^4[0-9]{15}$";       // Visa: Starts with 4, 16 digits
        String masterCardPattern = "^5[1-5][0-9]{14}$";  // MasterCard: Starts with 51-55, 16 digits

        // Compile regex patterns
        Pattern visa = Pattern.compile(visaPattern);
        Pattern masterCard = Pattern.compile(masterCardPattern);

        // Match input with patterns
        Matcher visaMatcher = visa.matcher(cardNumber);
        Matcher masterCardMatcher = masterCard.matcher(cardNumber);

        // Check and print result
        if (visaMatcher.matches()) {
            System.out.println(cardNumber + " is a valid Visa card.");
        } else if (masterCardMatcher.matches()) {
            System.out.println(cardNumber + " is a valid MasterCard.");
        } else {
            System.out.println(cardNumber + " is NOT a valid Visa or MasterCard.");
        }
    }




}
