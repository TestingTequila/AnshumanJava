package com.janbask.constructorCalling;

public abstract class AC
{
//    public AC()
//    {
//        System.out.println("AC constructor...");
//    }

    public AC(String s)
    {
        System.out.println("AC parametrized constructor..." + s);
    }

    public AC(int i)
    {
        System.out.println("AC int parametrized constructor..." + i);
    }
    int x;
    String name;

    public abstract void m1();

    public void m2()
    {
        System.out.println("m2 method....");
    }
}
