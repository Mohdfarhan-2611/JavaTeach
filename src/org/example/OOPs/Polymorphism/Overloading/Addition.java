package org.example.OOPs.Polymorphism.Overloading;

public class Addition {

    public void sum(int a, int b){
        System.out.println(a+b);
    }

    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }


    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.sum(2, 3);
        obj.sum(3,4,5);
    }
}
