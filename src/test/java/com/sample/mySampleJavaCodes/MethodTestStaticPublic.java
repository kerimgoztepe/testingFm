package com.sample.mySampleJavaCodes;

public class MethodTestStaticPublic {
    public void myNewMethod() {
        //this is a method
        System.out.println("Hello man");
    }

    static void myNewMethod2 (){
        //this is a static method
        System.out.println("Caio Ragazzo");
    }

    public static void main(String[] args) {
        MethodTestStaticPublic newTest = new MethodTestStaticPublic();
        newTest.myNewMethod(); //you have to create ob=bject to run method
        myNewMethod2();        //for static method, you don't need object
    }
}
