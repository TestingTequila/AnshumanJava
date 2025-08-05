package com.janbask.recap;

public abstract class AbstractionConcept {
    private int x;
    private String name;

    public int getX() {
        return x;
    }

    public AbstractionConcept(int x, String name) {
        System.out.println("This is Parent Class Constructor...");
        this.x = x;
        this.name = name;

    }

    public abstract void addition();

    public void subtraction() {
        System.out.println("Subtraction...");
    }

    public void multiplication() {
        System.out.println("multiplication...");
    }

    public void division() {
        System.out.println("division...");
    }

}
