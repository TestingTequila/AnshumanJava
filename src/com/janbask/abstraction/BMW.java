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

}
