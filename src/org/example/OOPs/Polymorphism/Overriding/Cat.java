package org.example.OOPs.Polymorphism.Overriding;

public class Cat extends Animal {


    public static void makeSound(){
        System.out.println("Cat meow");
    }
    public static void main(String[] args) {
        Animal animal1 = new Cat();  //Dynamic Dispatch
       // WebDriver driver = new ChromDriver() //Dynamic Dispatch
        animal1.makeSound();

    }
}
