package org.example.OOPs.Encapsulation;

public class Encap2 extends Encap {




    public static void main(String[] args) {
        Encap2 obj = new Encap2();
        obj.setUsername("Tayyab@gmail.com");
        obj.setPassword("Tayyab@123");


        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());

    }
}
