package com.sample.mySampleJavaCodes;

import org.testng.annotations.Test;

@Test

public class TryAndCatchSample1 {
    public void example1() {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }


@Test
public void example2() {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
           System.out.println("Something went wrong.");
       } finally {
           System.out.println("The 'try catch' is finished.");
      }
   }
}