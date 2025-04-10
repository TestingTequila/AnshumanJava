package com.janbask.jdk;

public class JavaBasics {
    public static void main(String[] args) {

        byte b = 127;
        //short s =32767;
//        int i =2147483647;
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//
//        long l =2147483648L;

        byte b1 = 10;
        byte b2 = 20;
        //short sum =b1+b2;
        int i = 12;

        //Decimal
        //float-4 byte [up to 6 decimal places]
        //double-8 byte

        float f = 12.12345687890F;
        System.out.println(f);

        double d = 12.1234567890876543210;
        System.out.println(d);

        double d1 = 12;
        System.out.println(d1);

        boolean bl = true; //[~1 bit]{true, false}

//        char c = 'c'; // 2 byte [1-9, a-z, A-Z, !@#$%^&*()_+]
//        System.out.println(c);
//        char c1 = '6';
//        System.out.println(c1);

        System.out.println("-------------------------------------");

        char c1 = 'a';//97
        char c2 = 'b';//98
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 + c2); //a+b
        // password --> qbttxpse
        int num =(int) c1;
        int newNumber = num+1;

        System.out.println((int)c1);
        System.out.println((char)newNumber);

        System.out.println("--------------------Examples------------------");
        System.out.println(c1+c2); //195
        System.out.println((int)c1+(int)c2);//195
        char x ='0';
        char cc = 'a';
        System.out.println(cc+x); //97
        System.out.println(2+cc);
        System.out.println(cc + '0');




    }
}
