package com.janbask.constructors;


public class TestCompany
{
    public static void main(String[] args) {
        Company company1 = new Company();
        System.out.println(company1.companyName);
        System.out.println(company1.empCount);

        Company company2 = new Company();
        System.out.println(company2.companyName);
        System.out.println(company2.empCount);

        System.out.println("===Calling parametrized Constructor========");
        Company company3 = new Company("Adobe", 350);
        System.out.println(company3.companyName);
        System.out.println(company3.empCount);

        Company company4 = new Company("" +
                "Nagarro", 1500);
        System.out.println(company4.companyName);
        System.out.println(company4.empCount);
    }
}
