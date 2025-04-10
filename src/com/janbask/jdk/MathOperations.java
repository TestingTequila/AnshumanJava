package com.janbask.jdk;

public class MathOperations
{
    public static void main(String[] args) {

        //1. I/I = I

        System.out.println(10/2); //5
        System.out.println(10/3); //3

        //2. Decimal in N or D = D [D/I=D, I/D=D, D/D=D]
        System.out.println(10/2.0);//5.0
        System.out.println(10.0/2); //5.0
        System.out.println(10.0/2.0);//5.0
        System.out.println(10.0/3); //3.3333333333333335

        //3. Modulo Operator(%)
        System.out.println(10%2);//0
        System.out.println(10%3);//1
        System.out.println("============================Increment & Decrement Operator===========================");

        //Increment & Decrement Operator
        //1. post-Increment
        int a = 1;
        int b =a++; //Assignment and increment will happen in this step
        System.out.println(a);//2
        System.out.println(b);//1

        int c = -99;
        int d = c++;
        System.out.println(c);//-98
        System.out.println(d);//-99

        int z = 100;
        int y =z++;
        System.out.println(z);//101
        System.out.println(y);//100


    }
}
