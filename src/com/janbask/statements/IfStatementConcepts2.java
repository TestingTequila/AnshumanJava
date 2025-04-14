package com.janbask.statements;

public class IfStatementConcepts2
{
    //if Statement:
    public static void main(String[] args) {

        System.out.println(10>1);
        System.out.println(10==100);

        int age =19;
        String nationality = "Indian";
        if(age>=18)
        {
            System.out.println("He can Vote as he is above 18....");
            if(nationality.equalsIgnoreCase("Indian"))
            {
                System.out.println("This person can vote ....");
            }
        }


    }
}
