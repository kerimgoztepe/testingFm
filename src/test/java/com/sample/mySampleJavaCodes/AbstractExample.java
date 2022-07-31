package com.sample.mySampleJavaCodes;

    // Abstract class
    abstract class Animal1 {
        // Abstract method (does not have a body)
        public abstract void animalSound();

        // Regular method
        public void sleep() {
            System.out.println(" Zzzz Zzz");
        }
    }

// Subclass (inherit from Animal)
class Dog extends Animal1 {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The dog says: woof woof");
    }


    public static void main(String[] args) {
       Dog myDog = new Dog(); // Create a Pig object
        myDog.animalSound();
        myDog.sleep();
    }
}




