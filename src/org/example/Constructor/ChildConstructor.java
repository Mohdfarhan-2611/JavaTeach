package org.example.Constructor;

public class ChildConstructor extends ParentConstructor {
    int a;
    int b;

    ChildConstructor(int a , int b){
        //super();
        //this.a=a;  //Child Instance variable
       super.a=a; //parent Instance variable

       // this.b=b;  //Child Instance variable
        super.b=b; //parent Instance variable
        System.out.println(a+b);

    }

    public static void main(String[] args) {
       ChildConstructor abc = new ChildConstructor(2,3);
    }
}
