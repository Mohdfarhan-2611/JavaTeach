package org.example.OOPs.Inheritance.Hierarchical;

import org.example.OOPs.Inheritance.MultiLevel.ParentClass;

public class Son extends ParentClass {

    public void sonHouse(){
        System.out.println("Grandparen house");
    }

    public static void main(String[] args) {
        Son obj = new Son();
        obj.parentHouse();
        obj.sonHouse();

    }
}
