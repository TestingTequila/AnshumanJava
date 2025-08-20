package com.janbask.inheritanceExample;

public interface IndianMedicalAssociation {
    public void oncoServices();

    public void gynicServices();

    public void orthoServices();

    public void emergencyServices();

    public static void calculateTax(){
        System.out.println("IMA---Apply Tax of 30%");
    }
}
