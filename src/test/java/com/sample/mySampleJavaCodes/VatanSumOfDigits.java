package com.sample.mySampleJavaCodes;

import org.junit.Test;

public class VatanSumOfDigits {

    public static void main(String[] args) {
        int num = 1879;
        int sum = 0;
        while (num>0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("sum = " +sum);

    }



}
