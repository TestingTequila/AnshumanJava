package com.janbask.abstraction;

public class Executing
{
    public static void main(String[] args) {
        System.out.println("=====================Car============");

        Car car= new Car();
        car.start();
        car.refuel();
        car.stop();

        System.out.println("=====================BMW============");

       BMW bmw = new BMW();
       bmw.start();
       bmw.refuel();
       bmw.autoParking();
       bmw.stop();

        System.out.println("========TopCasting==================");
        Car car1=new BMW();
        car1.start();
        car1.refuel();
        car1.stop();
        car1.m1(12, 56);

        System.out.println("=====================================");
        BMW bmw1= new BMW();
        bmw1.start();//BMW Stat
        bmw1.refuel(); //Car refuel
        bmw1.stop();   //Car Stop
        bmw1.autoParking(); // BMW auto parking

        System.out.println("================Down casting==========");
       BMW bmw2 = (BMW)new Car(); // Down Casting is not possible in Java at compile time


    }
}
