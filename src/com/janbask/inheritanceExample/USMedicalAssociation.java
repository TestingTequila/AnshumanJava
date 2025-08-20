package com.janbask.inheritanceExample;

public interface USMedicalAssociation extends WHO, UHO{
    public void cardioServices();

    public void neuroServices();

    public void physioServices();
    public void emergencyServices();

    public static void calculateTax(){
        System.out.println("USMA---Apply Tax of 30%");
    }

    default void cafeServices()
    {
        System.out.println("Interface default Method....");
    }
}
