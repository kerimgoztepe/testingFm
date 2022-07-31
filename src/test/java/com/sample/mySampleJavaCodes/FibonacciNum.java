package com.sample.mySampleJavaCodes;

public class FibonacciNum {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int c = 0;
        for (int i = 0; i<5; i++ ) {
            c = a+b;
            a=b;
            b=c;

        }
        System.out.println("fibonacci numbers are = "+c);



    }
}
