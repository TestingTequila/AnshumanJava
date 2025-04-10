package com.janbask.jdk;

public class StringConcatenation {
    public static void main(String[] args) {

        String x = "Hello";
        String y = "World";
        int a = 100;
        int b = 200;
        System.out.println(x + y);
        System.out.println(a + b);
        System.out.println(a + x);//100Hello
        System.out.println(a + b + x);//300Hello
        System.out.println(a + b + x + y);//300HelloWorld
        System.out.println(x + a + y + b);//Hello100World200
        System.out.println(a + b + x + y);//300HelloWorld
        System.out.println(x + y + a + b);//HelloWorld100200
        System.out.println(x + y + (a + b));//HelloWorld300

        char c1 = 'a';
        char c2 = 'b';
        System.out.println(c1+""+c2);//ab
        System.out.println((int)c1+""+(int)c2);//9798

    }
}
