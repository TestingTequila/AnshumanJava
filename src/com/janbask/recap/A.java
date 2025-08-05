package com.janbask.recap;

import com.janbask.recap.AbstractionConcept;

public class A extends AbstractionConcept
{

    int x;
    String name;
    public A(int x, String name) {
        super(x, name);
        System.out.println("This is Class A Constructor...");
    }

    public A(String name, int x) {
        super(x, name);
        System.out.println("This is Class A Constructor...");
    }

    @Override
    public void addition() {
        System.out.println("Implementing addition by class A");
    }
}
