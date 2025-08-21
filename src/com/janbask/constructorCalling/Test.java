package com.janbask.constructorCalling;

public class Test
{
    public static void main(String[] args) {
        //A a = new A();
        //B b = new B();

        //A a = new B();
        //C c = new B();

        //CC cc =new CC();
        //AC ac = new CC();
        //AC ac = new AC(); cannot create object of Abstract Class
        CC cc = new CC(); // Child class constructor[be it default or parametrized] will always call parent class default constructor untill and unless it is not instructed to call the parametrized
                                    // constructor of Parent class/s.

    }
}
