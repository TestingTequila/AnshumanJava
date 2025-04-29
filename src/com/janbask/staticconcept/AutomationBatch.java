package com.janbask.staticconcept;

public class AutomationBatch
{
     String studentName;
     int age;
     int mobileNumber;
     static String trainersName;

     public void m1()
     {
         System.out.println("non-static method m1");
         AutomationBatch ab = new AutomationBatch();
         ab.m2();
     }

    public void m2()
    {
        System.out.println("non-static method m2");
    }

    public static void m3()
    {
        System.out.println("static method m3");
        AutomationBatch ab = new AutomationBatch();
        ab.m1();
    }

    public static void m4()
    {
        System.out.println("static method m4");
        AutomationBatch.m3();
        AutomationBatch ab = new AutomationBatch();
        ab.m2();
    }

}
