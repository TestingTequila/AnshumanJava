package com.janbask.staticconcept;

public class Automobile
{
    String carName;
    String color;
    double price;
    final static int WheelCount=4;

    public void start()
    {
        System.out.println("Car start......");
    }

    public static void stop()
    {
        System.out.println("Car stop......");
        //static int x; cannot make local variable as static
    }
}
