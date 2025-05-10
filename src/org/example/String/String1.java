package org.example.String;

public class String1 {

    public static void main(String[] args) {
         String name = "HelloWorldIAmHere";
         String[] nameArray = name.split("(?=[A-Z])");


        String name2 = "Farhan    Tayyab";
        String[] name2Array = name2.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String n : name2Array){
            sb.append(n);
        }

        System.out.println(sb.toString());


    }
}
