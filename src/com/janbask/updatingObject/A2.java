package com.janbask.updatingObject;

public class A2 {

    private int a;
    private int b;

    public A2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void updateA3(A2 a2, int a, int b) {
        a2.a = a;
        a2.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }


    // Value of a and b can't be updated as we haven't created any method to update these values


}
