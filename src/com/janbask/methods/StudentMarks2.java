package com.janbask.methods;

public class StudentMarks2
{
    public  int displayMarks(String studentName)
    {
         int marks = -1;

        if(studentName.equals("Jason"))
        {
            marks= 100;
        }
        else if (studentName.equals("Roger"))
        {
            marks= 80;
        }
        else if (studentName.equals("Kerrie"))
        {
            marks= 92;
        }
        else if (studentName.equals("Mary"))
        {
            marks= 65;
        }
        else if (studentName.equals("Shivani"))
        {
            marks= 99;
        }
        return marks;
    }
}
