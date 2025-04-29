package com.janbask.staticconcept;

public class TestStatic
{
    public static void main(String[] args) {
        Static.a=12;
        Static.b=45;
        Static.m1();
        Static.m2();

        NonStatic ns = new NonStatic();
        ns.a=32;
        ns.b=44;
        ns.m1();
        ns.m2();

    }
}
