package com.janbask.callbyvaluereference;

public class CBR {
    private int a;
    private int b;

    public CBR(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public  void updateValues(CBR cbr)
    {
        cbr.a =100;
        cbr.b =50;
//        OR
//        setA(100);
//        setB(50);
    }
}
