package com.janbask.staticconcept;

public class TestAutomobile
{
    public static void main(String[] args) {
        Automobile car1 = new Automobile();
        car1.carName = "Audi";
        car1.color = "White";
        car1.price =32423;
        //Automobile.WheelCount=5;cannot update as this is final
        System.out.println(car1.carName+ ", "+ car1.color+", "+ car1.price+ ", "+ Automobile.WheelCount);

        Automobile car2 = new Automobile();
        car2.carName = "Tesla";
        car2.color = "Blue";
        car2.price =765756;
        System.out.println(car2.carName+ ", "+ car2.color+", "+ car2.price+ ", "+ Automobile.WheelCount);

        Automobile car3 = new Automobile();
        car3.carName = "BMW";
        car3.color = "Red";
        car3.price =98767;
        System.out.println(car3.carName+ ", "+ car3.color+", "+ car3.price+ ", "+ Automobile.WheelCount);
    }
}
