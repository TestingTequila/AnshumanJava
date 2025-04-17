package com.janbask.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.SortedMap;

public class ArrayExample {
    public static void main(String[] args) {

        int x = 10;
        System.out.println(x);

        int[] numbers = {12, 14, 34, 56, 78, 34, 56, 77, 88, 99, 100};
//        //System.out.println(numbers.length);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);

        System.out.println("=======================WHILE LOOP==========================");

        int i =0;
        while (i<numbers.length)
        {
            System.out.println(numbers[i]);
            i++;
        }
        System.out.println("==========================FOR LOOP=====================");

        for (int j =0;j<numbers.length;j++)
        {
            System.out.println(numbers[j]);
        }

        System.out.println("==========================ADVANCED FOR LOOP=====================");

        for(int num :numbers)
        {
            System.out.println(num);
        }

        System.out.println("==========================FOR DISPLAY ONLY=====================");
        System.out.println(Arrays.toString(numbers));

        //2. dataType[] arrayName = new dataType[countOfValues];

        int[] marks = new int[5];
        System.out.println(Arrays.toString(marks));
        int num = 12;
        for(int k=0; k<=marks.length; k++)
        {
            marks[k]= num;
            num++;
        }




    }
}
