package com.janbask.usageOfThisKeyword;

public class Company3 {
    private String name;

   public String getName() {
      return name;
   }

   public int getSalary() {
      return salary;
   }

   private int salary;

   public void setName(String name) {
      this.name = name;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }

   public Company3(String name, int salary)
   {
      setName(name);
      setSalary(salary);
   }
}
