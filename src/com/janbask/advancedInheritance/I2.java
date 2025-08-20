package com.janbask.advancedInheritance;

public interface I2 extends I1
{
    @Override
    default void m1()
    {
        System.out.println("m1 method Override....");
        //I1.My_User_ID=12;
    }
}
