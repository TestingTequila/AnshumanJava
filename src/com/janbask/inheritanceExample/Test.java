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
        fh.emergencyServices();
        fh.medicalRnD();
        fh.medicalNews();
        fh.inHouseervices();

        System.out.println("====Top Casting- Fortis & USMedicalAssociation=======");

        USMedicalAssociation usma = new FortisHospital();
        usma.cardioServices();
        usma.neuroServices();
        usma.physioServices();
        usma.emergencyServices();


        //USMedicalAssociation usm = new USMedicalAssociation(); Cannot create object of an interface

        System.out.println("====Top Casting- Fortis & UKMedicalAssociation=======");

        UKMedicalAssociation ukma = new FortisHospital();
        ukma.entServices();
        ukma.dentalServices();
        ukma.emergencyServices();

        System.out.println("====Top Casting- Fortis & IndianMedicalAssociation=======");

        IndianMedicalAssociation ima = new FortisHospital();
        ima.oncoServices();
        ima.gynicServices();
        ima.orthoServices();
        ima.emergencyServices();

        System.out.println("====Top Casting- Fortis & MaxHospital=======");
        MaxHospital maxHospital = new FortisHospital();
        maxHospital.medicalNews();
        maxHospital.medicalRnD();
        maxHospital.inHouseervices();

        System.out.println("====Top Casting- Fortis & ColumbiaHospital=======");
        ColumbiaHospital ch = new FortisHospital();
        ch.ambulanceServices();
        ch.inHouseervices();


        //RemoteWebDriver driver = new ChromeDriver();
    }
}
