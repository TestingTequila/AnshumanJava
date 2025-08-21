package com.janbask.constructorCalling;

public class CC extends AC {
    public CC() {
        super("Ron");
        System.out.println("CC constructor...");
    }

    public CC(String s) {
        super("Kerrie");
        System.out.println("C parametrized constructor..." + s);
    }

    @Override
    public void m1() {
        System.out.println("class CC m1 method...");
    }

}
