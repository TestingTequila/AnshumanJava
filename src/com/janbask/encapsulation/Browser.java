package com.janbask.encapsulation;

public class Browser
{
    private   void checkOS()
    {
        System.out.println("Checking OS....");
    }

    private  void checkRAM()
    {
        System.out.println("Checking RAM....");
    }

    private  void checkVersion()
    {
        System.out.println("Checking Browser Version.......");
    }


    public  void launchBrowser()
    {
        checkOS();
        checkRAM();
        checkVersion();
        System.out.println("Launching Browser.......");
    }
}
