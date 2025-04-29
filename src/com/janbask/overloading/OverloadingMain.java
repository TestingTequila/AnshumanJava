package com.janbask.overloading;

public class OverloadingMain {
    public static void main(String[] args) {
        System.out.println("This is my default main method");

    }

    public static void main(String[] args, int x) {
        System.out.println("This is my  main method with String array and int");
    }

    public static void main(int a, int x) {
        System.out.println("This is my  main method with int  and int");
    }

    public static void main(double a, int x) {
        System.out.println("This is my  main method with double  and int");
    }
}
