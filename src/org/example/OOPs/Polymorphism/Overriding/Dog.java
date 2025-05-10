package org.example.OOPs.Polymorphism.Overriding;

public class Dog extends Animal {


    public static void makeSound(){
        System.out.println("Dog Barks");
    }



    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();  //Method Hiding
        makeSound();



    }
}
