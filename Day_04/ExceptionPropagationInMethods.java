package com.Day_04;

class ExceptionPropagationInMethod {

    // Method that throws an ArithmeticException
    static void method1() {
        int result = 10 / 0; // This will cause an ArithmeticException
    }

    // Method that calls method1()
    static void method2() {
        method1();
    }

    // Main method that calls method2() and handles the exception
    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}