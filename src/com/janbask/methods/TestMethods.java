package com.janbask.methods;

public class TestMethods
{
    public static void main(String[] args) {
        MethodSignature ms = new MethodSignature();

        ms.addition(12,8);
        ms.subtraction(22,7);
        ms.multiplication();

        System.out.println("============================================");

        ReturnTypeConcept rtm = new ReturnTypeConcept();
        //int total1=rtm.addition1(12,8);//void
        int total2=rtm.addition2(12,8);//int
        System.out.println(total2*5);

        System.out.println("============================================");

        Employee emp = new Employee();
        String fName=emp.fullName("Anshuman", "Batra");
        System.out.println(fName + " MEDMA");

        System.out.println("==============================================");
        CalculateSalary cs = new CalculateSalary();
        double empSalary =cs.calculateSalary(6000, 3000);
        System.out.println("Salary after Bonus: " + (empSalary + 1000));

        System.out.println(cs.calculateSalary(20000, 5000));

        System.out.println("============STUDENT NAME CLASS =====================");
        StudentMarks sm = new StudentMarks();
        int studMarks=sm.displayMarks("Kerrie");
        System.out.println(studMarks);

        System.out.println(sm.displayMarks("Jason"));
        System.out.println(sm.displayMarks("Tony"));

        System.out.println("============STUDENT NAME 2 CLASS =====================");
        StudentMarks2 sm2 = new StudentMarks2();
        int studMarks2=sm2.displayMarks("Kerrie");
        System.out.println(studMarks2);

        System.out.println(sm2.displayMarks("Jason"));
        System.out.println(sm2.displayMarks("Tony"));

    }
}
