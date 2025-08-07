package com.janbask.updatingObject;

public class ExecutingUpdates {
    public static void main(String[] args) {
        A a = new A();
        a.setA(12);
        a.setB(14);
        System.out.println(a.getA());
        System.out.println(a.getB());

        System.out.println("=================================");

        A1 a1 = new A1(100, 200);
        System.out.println(a1.getA());
        System.out.println(a1.getB());

        System.out.println("=====updating the values=========");

        a1.setA(1);
        a1.setB(2);
        System.out.println(a1.getA());
        System.out.println(a1.getB());

        System.out.println("======A2=========================");

        A2 a2 = new A2(120, 78);
        System.out.println(a2.getA());
        System.out.println(a2.getB());

        System.out.println("=====updating the values=========");

        a2.updateA3(a2, 12, 8);
        System.out.println(a2.getA());
        System.out.println(a2.getB());

        System.out.println("======A3=========================");
        A3 a3= new A3();
        a3.setA(23);
        a3.setB(32);
        System.out.println(a3.getA());
        System.out.println(a3.getB());

        System.out.println("=====updating the values=========");
        a3.updateA3(a3, 40, 60);
        System.out.println(a3.getA());
        System.out.println(a3.getB());


    }
}
