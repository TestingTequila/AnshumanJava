package com.janbask.classConcept;

public class TestCompany
{
    public static void main(String[] args) {
      Company company1   = new Company();
      company1.name ="TCS";
      company1.address = "Banglore";
      company1.turnover = 70;
      company1.employeeCount =5000;

        System.out.println(company1.name);
        System.out.println(company1.address);
        System.out.println(company1.turnover);
        System.out.println(company1.employeeCount);

      Company company2   = new Company();
      company2.name ="Infosys";
      company2.address = "Gurgaon";
      company2.turnover = 60;
      company2.employeeCount =3000;
      System.out.println("======Before Pointing to Null ");

      System.out.println( company2.name);
      System.out.println( company2.address);
      System.out.println( company2.turnover);
      System.out.println( company2.employeeCount);

      System.out.println("======After Pointing to Null ");
      company2 = null;

      System.out.println( company2.name);
      System.out.println( company2.address);
      System.out.println( company2.turnover);
      System.out.println( company2.employeeCount);

      new Company().name="Adobe"; //No reference Object, not a good way to create object without reference variable
      new Company().address = "Noida";
      new Company().turnover =45;
      new Company().employeeCount =1000;

      System.gc();
    }
}
