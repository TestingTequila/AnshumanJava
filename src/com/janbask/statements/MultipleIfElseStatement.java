package com.janbask.statements;

public class MultipleIfElseStatement
{
    int a =10;
    public static void main(String[] args) {
        if(true)
        {
            System.out.println("Condition 1");
        }
        if(false)
        {
            System.out.println("Condition 2");
        }
        if(true)
        {
            System.out.println("Condition 3");
        }
        if(true)
        {
            System.out.println("Condition 4");
        }
        if(false)
        {
            System.out.println("Condition 5");
        }
        else
        {
            System.out.println("None of the above condition matches...");
        }
    }
}
