package com.janbask.statements;

public class IfElseIfStatement2
{

    public static void main(String[] args) {
        String browserName = "Chrome";
        if(browserName.equalsIgnoreCase("IE"))
        {
            System.out.println("Launch IE Browser...");
        }
        else if (browserName.equalsIgnoreCase("Firefox"))
        {
            System.out.println("Launch Firefox Browser...");
        }
        else if (browserName.equalsIgnoreCase("Edge"))
        {
            System.out.println("Launch Edge Browser...");
        }
        else if (browserName.equalsIgnoreCase("Chrome"))
        {
            System.out.println("Launch Chrome Browser...");
        }
        else
        {
            System.out.println("Please enter a correct browser name...");
        }

    }
}
