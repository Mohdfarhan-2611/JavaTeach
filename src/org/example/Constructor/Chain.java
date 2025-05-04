package org.example.Constructor;

public class Chain {

    int a;
    int b;

    Chain(){
        //this(2,3);  //Constructor Chaining
        this(3,4,5);
        System.out.println("Default Constuctor");
    }

    Chain(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println(a+b);
        System.out.println("Paramerterized constructor");
    }

    Chain(int a, int b, int c){
        this.a=a;
        this.b=b;
        c=20;
        System.out.println(a+b+c);
        System.out.println("3 arguments");
    }

    public static void main(String[] args) {
        Chain abc = new Chain();
    }
}
