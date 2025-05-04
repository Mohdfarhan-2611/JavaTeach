package org.example.Constructor;

public class Example {

    int a;
    int b;


    Example(){
        System.out.println("Default constructor");
    }

    //2 arguments
    Example(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println(a+b);
        System.out.println("Parametrized constructor");
    }

    //3 Arguments
    Example( int a3, int b3, int c3){
        this.a=a3;
        this.b=b3;
        c3=10;

        System.out.println(a3+b3+c3);
    }

    //Constructor Overloading



    void sum(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        Example abc2 = new Example();
        abc2.sum(10, 20);

        Example abc = new Example(2, 3);
        abc.sum(2,3);

        Example xyz = new Example(10,20,30);
        xyz.sum(20, 30);


    }



}
