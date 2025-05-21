package com.janbask.callbyvaluereference;

public class TestCBR {
    public static void main(String[] args) {
        CBR cbr = new CBR(12, 8);
        System.out.println(cbr.getA());
        System.out.println(cbr.getB());

        System.out.println("====updating the value of a and b within the same object====");
        cbr.setA(20);
        cbr.setB(5);
        System.out.println(cbr.getA());
        System.out.println(cbr.getB());

        System.out.println("=======updating the value of a and b within the same object using Call By Reference======");
        cbr.updateValues(cbr);
        System.out.println(cbr.getA());
        System.out.println(cbr.getB());
    }
}
