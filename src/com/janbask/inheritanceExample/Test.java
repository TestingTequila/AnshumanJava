package com.janbask.inheritanceExample;

public class Test {
    public static void main(String[] args) {
        System.out.println("=======Fortis Hospital Services=======");
        FortisHospital fh = new FortisHospital();
        fh.cardioServices();
        fh.neuroServices();
        fh.physioServices();

        fh.entServices();
        fh.dentalServices();

        fh.oncoServices();
        fh.gynicServices();
        fh.oncoServices();

        fh.medicalTraining();
        fh.medicalInsurance();

        System.out.println("====Top Casting- Fortis & USMedicalAssociation=======");

        USMedicalAssociation usma = new FortisHospital();
        usma.cardioServices();
        usma.neuroServices();
        usma.physioServices();

        //USMedicalAssociation usm = new USMedicalAssociation(); Cannot create object of an interface

        System.out.println("====Top Casting- Fortis & UKMedicalAssociation=======");

        UKMedicalAssociation ukma = new FortisHospital();
        ukma.entServices();
        ukma.dentalServices();

        System.out.println("====Top Casting- Fortis & IndianMedicalAssociation=======");

        IndianMedicalAssociation ima = new FortisHospital();
        ima.oncoServices();
        ima.gynicServices();
        ima.orthoServices();


        //RemoteWebDriver driver = new ChromeDriver();
    }
}
