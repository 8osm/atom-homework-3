package com.osm8.javatom;

public class Application {
    public static void main(String[] args) {
        System.out.println("Started");
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return b == 0 ? -1 : a / b;
    }
}
