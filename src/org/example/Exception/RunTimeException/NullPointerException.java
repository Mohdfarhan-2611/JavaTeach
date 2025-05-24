package org.example.Exception.RunTimeException;

public class NullPointerException {


    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Null pointer exception "+e.getMessage());
        }

        System.out.println("After try");
    }
}
