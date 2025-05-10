package org.example.OOPs.Inheritance.Single;

public class ChildClass  extends ParentClass{

    public void childHouse(){
        System.out.println("Child house");
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.childHouse();
        obj.parentHouse();


    }
}
