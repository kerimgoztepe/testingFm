package com.sample.mySampleJavaCodes;

public class ObjectTest {

    int x = 5;
    final int num2 = 10;
    String y = "Object test";

    public static void main(String[] args) {
        ObjectTest myObj = new ObjectTest();
        ObjectTest myObj2 = new ObjectTest();
        System.out.println(myObj.x);
        System.out.println(myObj2.y);
        System.out.println(myObj.y);
        System.out.println(myObj2.num2);

        myObj.x = 40;
        //myObj.num2 =22; when you try to change it, you can not. because it is final
        System.out.println(myObj.x);
        System.out.println();
    }


}
