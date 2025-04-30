package com.janbask.constructors;

public class Company
{

    public Company()
    {
        System.out.println("======This is default Constructor=====");
        companyName = "Microsoft";
        empCount =500;
    }

    public Company(String companyName, int empCount)
    {
        System.out.println("======This is parametrized Constructor=====");
        this.companyName = companyName;
        this.empCount=empCount;

    }

    String companyName;
    int empCount;
}
