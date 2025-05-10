package org.example.HideDataImplementation.Abstraction;

public abstract class ATM {

    //abstract methods - unimplemented methods
    public abstract void deposit();
    public abstract void withdraw();
    public abstract void checkBalance();

    //concreate method
    public static void show(){
        System.out.println("This is concreate method");
    }



}
