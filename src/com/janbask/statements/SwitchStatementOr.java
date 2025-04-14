package com.janbask.statements;

public class SwitchStatementOr
{

    public static void main(String[] args) {
        String dayOfTheWeek = "Tuesday";
        switch (dayOfTheWeek)
        {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("I have my office");
                break;
            default:
                System.out.println("Its weekend...Lets party..");
                break;

        }

    }
}
//Switch is not applicable over: long, float, double, boolean data types
//