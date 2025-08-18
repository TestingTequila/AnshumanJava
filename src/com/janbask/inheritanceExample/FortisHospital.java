package com.janbask.inheritanceExample;

public class FortisHospital extends  MaxHospital implements USMedicalAssociation, UKMedicalAssociation, IndianMedicalAssociation {

    @Override
    public void cardioServices() {
        System.out.println("FH----cardioServices");
    }

    @Override
    public void neuroServices() {
        System.out.println("FH----neuroServices");
    }

    @Override
    public void physioServices() {
        System.out.println("FH----physioServices");
    }

    @Override
    public void emergencyServices() {
        System.out.println("FH----emergencyServices");
    }

    @Override
    public void entServices() {
        System.out.println("FH----entServices");
    }

    @Override
    public void dentalServices() {
        System.out.println("FH----dentalServices");
    }

    @Override
    public void oncoServices() {
        System.out.println("FH----oncoServices");

    }

    @Override
    public void gynicServices() {
        System.out.println("FH----gynicServices");
    }

    @Override
    public void orthoServices() {
        System.out.println("FH----orthoServices");
    }

    public void medicalTraining() {
        System.out.println("FH----medicalTraining");
    }

    public void medicalInsurance() {
        System.out.println("FH----medicalInsurance");

    }

    @Override
    public void medicalNews()
    {
        System.out.println("Fortis Hospital -- medicalNews");
    }

    @Override
    public void covidVaccination() {
        System.out.println("Fortis Hospital -- covidVaccination");

    }

    @Override
    public void bplServices() {
        System.out.println("Fortis Hospital -- bplServices");

    }

//    @Override [cannot be overridden as this method in final in parent class
//    public final void governmentMedicalInsurances()
//    {
//        System.out.println("Max Hospital -- governmentMedicalInsurances");
//    }
}
