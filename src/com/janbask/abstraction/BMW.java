package com.janbask.abstraction;

public class BMW extends Car
{
    public void autoParking()
    {
        System.out.println("BMW Auto Parking....");
    }

    @Override
    public void start()
    {
        System.out.println("BMW Start....");
    }

    @Override
    public void  m1(int x)
    {
        System.out.println("override m1 method....");
    }

    public void  m1(String x)
    {
        System.out.println("override m1 method....");
    }
    public static void  m1(int x, int y)
    {
        System.out.println("BMW static m1 method....");
    }

}
