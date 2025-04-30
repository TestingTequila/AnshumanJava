package com.janbask.constructors;

public class TestEmployee
{
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("=======Global Variable==============");
        System.out.println(employee.empName);
        System.out.println(employee.totalExp);
        System.out.println("=======Parameter==============");
        employee.setDetails("Jason", 7);
        System.out.println("=======Local Variable==============");
        employee.myDetails();
    }
}
