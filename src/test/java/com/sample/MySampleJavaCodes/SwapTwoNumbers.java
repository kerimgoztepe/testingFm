package com.sample.MySampleJavaCodes;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        //first write two numbers
        double first = 1.8, second = 4.67;

        System.out.println("**Before swap**");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // first value
        double temporary = first;

        // here we assign value of second is to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("**After swap**");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}

