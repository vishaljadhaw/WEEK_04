package com.Day_05.Regex.Basic_Junit_Problems;


    public class Calculator {



        public static int add ( int a, int b){
            return a + b;
        }
        public static int multiply ( int a, int b){
            return a * b;
        }
        public static int subtract ( int a, int b){
            return a - b;
        }
        public static int divide ( int a, int b){
            if (b == 0) {
                System.out.println("Cannot divide by zero");
            }
            return a / b;
        }




    }
}
