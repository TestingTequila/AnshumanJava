package com.janbask.statements;

public class IfElseStatementConcepts2
{
    //if Statement:
    public static void main(String[] args) {

        System.out.println(10>1);
        System.out.println(10==100);

        int age =19;
        String nationality = "Japanese";
        if(age>=18)
        {
            System.out.println("He can Vote as he is above 18....");
            if(nationality.equalsIgnoreCase("Indian"))
            {
                System.out.println("This person can vote ....");
            }
            else
            {
                System.out.println("This person cannot Vote....");
            }
        }
        else
        {
            System.out.println("He can not Vote as he is below 18....");
        }


    }
}
