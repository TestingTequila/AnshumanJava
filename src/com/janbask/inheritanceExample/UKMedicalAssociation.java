package com.janbask.inheritanceExample;

public interface UKMedicalAssociation {
    public void entServices();

    public void dentalServices();
    public void emergencyServices();

    public static void calculateTax(){
        System.out.println("UKMA---Apply Tax of 30%");
    }
}
