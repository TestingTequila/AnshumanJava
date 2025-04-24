package com.janbask.methods;

public class StudentMarks
{
    public  int displayMarks(String studentName)
    {
        if(studentName.equals("Jason"))
        {
            return 100;
        }
        else if (studentName.equals("Roger"))
        {
            return 80;
        }
        else if (studentName.equals("Kerrie"))
        {
            return 92;
        }
        else if (studentName.equals("Mary"))
        {
            return 65;
        }
        else if (studentName.equals("Shivani"))
        {
            return 99;
        }
        return -1;
    }
}
