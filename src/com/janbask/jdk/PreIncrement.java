package com.janbask.jdk;

public class PreIncrement
{
    public static void main(String[] args) {
        //Increment & Decrement Operator
        //1. pre-Increment [Increment and then Assign]
        int a = 1;
        int b =++a; //  Assignment and increment will happen in this step
        System.out.println(a);//2
        System.out.println(b);//2

        int c = -99;
        int d = ++c;
        System.out.println(c);//-98
        System.out.println(d);//-98

        int z = 100;
        int y =++z;
        System.out.println(z);//101
        System.out.println(y);//101


    }
}
