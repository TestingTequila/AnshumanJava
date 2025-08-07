package com.janbask.updatingObject;

public class A3
{

    private int a;
    private int b;
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

    public  void updateA3(A3 a3, int a, int b)
    {
        this.a =a;
        this.b =b;
    }
    // Value of a and b can't be updated as we haven't created any method to update these values






}
