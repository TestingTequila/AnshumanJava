package com.janbask.encapsulation;

public class Company2 {
    private String name;

   public String getName() {
      return name;
   }

   public int getSalary() {
      return salary;
   }

   private int salary;

   public Company2(String name, int salary)
   {
      this.name = name;
      this.salary = salary;
   }
}
