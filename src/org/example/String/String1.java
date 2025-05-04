package org.example.String;

public class String1 {

    public static void main(String[] args) {

        String name1 = "Farhan"; // 1 Object
        name1 = "Tayyab";   //new Object will be created //1 Object
        String name2 = new String("Naveen"); //2 Object
        String name3 = "Farhan"; //0 object
        String name4 = "Farhan"; //0 object
        String name5 = new String("Naveen"); //1 Object

        System.out.println(name1);
        System.out.println(name2);


        name2.equalsIgnoreCase();
        name2.length();
        name2.toString();
        name2.indexOf();
        name2.toLowerCase();
        name2.toUpperCase();

        name2.toUpperCase();
        name2.equals();

        name2.replace();
        name2.trim();
        name2.split();
        name2.substring();



    }
}
