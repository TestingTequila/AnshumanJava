package com.janbask.inheritancewithAbstraction;

public abstract class Base
{
    public abstract void addition(int a, int b);

    public  void subtraction(int a, int b)
    {
        System.out.println("Subtraction: " + (a-b));
    }

    public void multiplication(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public  void division(int a, int b)
    {
        System.out.println("Division: " + (a/b));
    }
}
