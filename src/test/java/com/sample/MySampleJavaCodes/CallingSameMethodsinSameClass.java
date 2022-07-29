package com.sample.MySampleJavaCodes;

public class CallingSameMethodsinSameClass {

    /* CallingMethodsInSameClass.java
     *
     * illustrates how to call static methods a class
     * from a method in the same class
     */

    public static class CallingMethodsInSameClass
    {
        public static void main(String[] args) {
            printOne();
            printOne();
            printTwo();
        }

        public static void printOne() {
            System.out.println("Hello World");
        }

        public static void printTwo() {
            printOne();
            printOne();
        }
    }
}
