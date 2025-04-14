package com.janbask.statements;

public class SwitchStatement
{

    public static void main(String[] args) {
        String dayOfTheWeek = "Friday";
        switch (dayOfTheWeek)
        {
            case "Monday":
                System.out.println("Today is Monday...");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday...");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday...");
                break;
            case "Thursday":
                System.out.println("Today is Thursday...");
                break;
            case "Friday":
                System.out.println("Today is Friday...");
                break;
            default:
                System.out.println("Its weekend...Lets party..");
                break;
            case "Sunday":
                System.out.println("Today is Sunday...");
                break;


        }

    }
}
//Switch is not applicable over: long, float, double, boolean data types
//