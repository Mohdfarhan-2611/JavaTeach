package org.example.String;

public class String2 {


    public static void main(String[] args) {
        String s1 = "Farhan";
        String s2 = new String("Farhan");
        String s3 = "Farhan";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);

    }
}
