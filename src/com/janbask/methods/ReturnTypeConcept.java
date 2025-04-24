package com.janbask.methods;

public class ReturnTypeConcept
{
    public  void addition1(int a, int b)
    {
        int sum= a+b;
        System.out.println("Addition1: " + sum);
    }

    public  int addition2(int a, int b)
    {
        int sum= a+b;
        System.out.println("Addition2: " + sum);
        return a;
    }
}
