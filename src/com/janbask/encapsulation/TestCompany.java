package com.janbask.encapsulation;

public class TestCompany
{
    public static void main(String[] args)
    {
        Company company = new Company();
//        company.name = "Jessica";
//        company.salary = 10000;
        company.setName("Jessica");
        company.setSalary(10000);


        System.out.println(" Pay " + company.getName() + " a salary of " + company.getSalary());
    }
}
