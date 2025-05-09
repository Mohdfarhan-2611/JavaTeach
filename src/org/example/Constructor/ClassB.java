package org.example.Constructor;

public class ClassB extends ClassA{

    ClassB(){
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {

        ClassB obj = new ClassB();

    }
}
