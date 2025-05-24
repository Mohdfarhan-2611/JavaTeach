package org.example.Exception.CompileTime;

public class CheckedException {


    public static void main(String[] args) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
