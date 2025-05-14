package org.example.Problem;

public class Laptop {

    private String brand;
    private String model;
    private String processor;
    private int ramSize;
    private double price;


    Laptop(){
        System.out.println("I am Default Construtor");
    }

    Laptop(String brand, String model, String processor, int ramSize, double price){
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ramSize = ramSize;
        this.price = price;
    }

    Laptop(String brand, String model, String processor){
        this.brand = brand;
        this.model = model;
        this.processor = processor;

    }


    //Display information();
    public void displayInfo(){
        System.out.println("Laptop Info: " + brand + " | " + model + " | " + processor +
                " | RAM: " + ramSize + "| Price: " + price);
    }

    //Getter & Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand2) {
        brand = brand2;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {

       // Laptop obj1 = new Laptop();

        Laptop obj2 = new Laptop("Dell", "Inspiron" , "i7", 16, 85000);
        obj2.displayInfo();
        obj2.setBrand("HP");
        obj2.displayInfo();
        System.out.println(obj2.getBrand());


      //  Laptop obj3 = new Laptop("Hp", "Pavilion ", "5");



    }
}
