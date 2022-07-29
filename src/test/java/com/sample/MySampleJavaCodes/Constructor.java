package com.sample.MySampleJavaCodes;

import org.apache.commons.lang3.builder.ToStringExclude;

public class Constructor {

        String name = "John";
        int age = 30;
        // below const. example
        Constructor(){
            this.name="John Berger";
            this.age=30;
        }

        public static void main(String[] args) {
            Constructor obj1 = new Constructor();
            Constructor obj2= new Constructor();

            System.out.println("name is = "+obj1.name+"| age is "+obj1.age);


        }


    }


