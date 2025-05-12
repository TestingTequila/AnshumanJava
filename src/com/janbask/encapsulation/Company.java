package com.janbask.encapsulation;

public class Company {
    private String name;
    private int salary;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      if(name.equals("Jessica"))
      {
         this.name = null;
      }
      else {
         this.name = name;
      }
   }

   public int getSalary() {
      return salary;
   }

   public void setSalary(int salary) {
      if(salary<1000 || salary >=10000)
      {
         this.salary=0;
      }
      else {
         this.salary = salary;
      }
   }
}
