package com.janbask.inheritanceExample;

public interface USMedicalAssociation extends WHO, UHO{
    public void cardioServices();

    public void neuroServices();

    public void physioServices();
    public void emergencyServices();
}
