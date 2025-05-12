package com.janbask.encapsulation;

public class TestCompany3
{
    public static void main(String[] args) {
        Company3 company3 = new Company3("Jessica", 10000);
        System.out.println(company3.getName() + " : " + company3.getSalary());
        company3.setName("Rohit");
        company3.setSalary(8000);
        System.out.println(company3.getName() + " : " + company3.getSalary());


    }
}
