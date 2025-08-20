package com.janbask.advancedInheritance;

public class Test
{
    public static void main(String[] args) {

        System.out.println("====P Object=======");
        P p = new P();
        System.out.println(p.x);//10
        p.m1();

        System.out.println("====C Object=======");
        C c = new C();
        System.out.println(c.x);//20

        c.m1();
        c.m2();

        System.out.println("====C Object Top Casting=======");
        P p1= new C();
        System.out.println(p1.x);




    }
}
