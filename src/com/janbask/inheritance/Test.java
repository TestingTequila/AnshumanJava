package com.janbask.inheritance;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.addition(12, 4);

        B b = new B();
        b.addition(12, 4);
        b.subtraction(12, 4);

        C c = new C();
        c.addition(12, 4);
        c.subtraction(12, 4);
        c.multiplication(12, 4);

        D d = new D();
        d.addition(12, 4);
        d.subtraction(12, 4);
        d.multiplication(12, 4);
        d.division(12, 4);

    }
}
