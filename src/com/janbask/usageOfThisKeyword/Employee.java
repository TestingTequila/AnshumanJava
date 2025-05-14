package com.janbask.usageOfThisKeyword;

public class Employee
{
    String name;
    int salary; //global Variable

    public  void  calculateSalary(int salary)
    {
          this.salary= salary;
    }

    public  void  printName(String name)
    {
          this.name = name;
    }

}
