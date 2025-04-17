package com.janbask.classConcept;

public class TestResume
{
    public static void main(String[] args) {

     Resume  student1 = new Resume();
     student1.fName ="Anshuman";
     student1.lName = "Batra";
     student1.age =29;
     student1.isMarried = true;
     student1.totalExp=6;

     Resume student2= new Resume();
        student2.fName ="Ankita";
        student2.lName = "Tewari";
        student2.age =30;
        student2.isMarried = true;
        student2.totalExp=12;

        System.out.println("===================STUDENT1 DETAILS========");
        System.out.println(student1.fName);
        System.out.println(student1.lName);
        System.out.println(student1.totalExp);
        System.out.println(student1.age);
        System.out.println(student1.isMarried);

        System.out.println("===================STUDENT2 DETAILS========");
        System.out.println(student1.fName);
        System.out.println(student1.lName);
        System.out.println(student1.totalExp);
        System.out.println(student1.age);
        System.out.println(student1.isMarried);

    }
}
