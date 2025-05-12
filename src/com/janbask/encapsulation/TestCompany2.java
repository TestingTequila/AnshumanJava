package com.janbask.encapsulation;

public class TestCompany2
{
    public static void main(String[] args) {
        Company2 company2 = new Company2("Jessica", 10000);
        System.out.println(company2.getName() + " : " + company2.getSalary());

        Company2 company21 = new Company2("Rohit", 8000);
    }
}
