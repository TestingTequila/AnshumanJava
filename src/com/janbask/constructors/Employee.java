package com.janbask.constructors;

public class Employee
{
    String empName;
    int totalExp;

    public void setDetails(String empName,int totalExp )
    {
        System.out.println("Emp Name: " + empName +", " + "Total Experience: " + totalExp);
    }


    public  void  myDetails()
    {
        String empName = "Ashish";
        int totalExp = 14;
        System.out.println("Emp Name: " + empName +", " + "Total Experience: " + totalExp);


    }
}
