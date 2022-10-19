package org.example;

public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        String numrer1 = "10";
        String number2 = "1";
        System.out.println("sum = " + binOps.sum(numrer1, number2));
        System.out.println("mult = " + binOps.mult(numrer1, number2));
    }
}