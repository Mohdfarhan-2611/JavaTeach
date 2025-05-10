package org.example.OOPs.Inheritance.Hierarchical;

public class Daughter extends ParentClass {

    public void daughterHouse(){
        System.out.println("Child house");
    }

    public static void main(String[] args) {
        Daughter obj = new Daughter();
        obj.parentHouse();
        obj.daughterHouse();



    }
}
