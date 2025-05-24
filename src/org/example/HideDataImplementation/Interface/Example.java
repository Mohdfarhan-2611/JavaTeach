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

    @Override
    public void method6(){
        System.out.println("This is method 6");
    }

    public static void method7(){
        System.out.println("From Class Example");
    }




    public static void main(String[] args) {
        Example obj = new Example();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        method7();
        Human.method7();
        System.out.println(A);
        System.out.println(NAME);
    }
}



interface Vehicle{

    public static final int A = 10;
    public static final String NAME = "Farhan";

    public void method1();
    public void method2();
    public void method4();
    default void method5(){
        System.out.println();
    }

}

interface Human {

    public void method3();
    public void method4();
    abstract void method6();

    public static void method7(){
        System.out.println("Human Interfacre");
    }

}


