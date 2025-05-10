package org.example.HideDataImplementation.Interface;

public class Example implements Vehicle, Human {



    @Override
    public void method1() {
        System.out.println("This is method 1");
    }

    @Override
    public void method2() {
        System.out.println("This is method 2");
    }

    @Override
    public void method4() {
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }


    @Override
    public void method3() {
        System.out.println("This is method 3");
    }


    public static void main(String[] args) {
        Example obj = new Example();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        System.out.println(A);
        System.out.println(NAME);
    }
}



interface Vehicle{

    int A = 10;
    String NAME = "Farhan";

    void method1();
    void method2();
    void method4();

    default void method5(){
        System.out.println("This is default concreate method");
    }

}

interface Human {

    void method3();
    void method4();
}


