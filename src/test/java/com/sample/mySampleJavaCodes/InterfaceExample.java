package com.sample.mySampleJavaCodes;

// Interface example

interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
    static void eat() {
        System.out.println("this is from static method");
    }

}

// Pig "implements" the Animal interface
class Cat implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("My cat says: come on man!");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("zzzzddccvfffzz");
    }
}

class InterfaceMain {
    public static void main(String[] args) {
        Cat myCat = new Cat();  // Create a Cat object
        myCat.animalSound();
        myCat.sleep();
        Animal.eat(); //this is static method and no need object
    }
}

