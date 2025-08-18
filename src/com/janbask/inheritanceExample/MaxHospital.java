package com.janbask.inheritanceExample;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class MaxHospital extends ColumbiaHospital
{
    public void medicalRnD()
    {
        System.out.println("Max Hospital -- medicalRnD");
    }

    public void medicalNews()
    {
        System.out.println("Max Hospital -- medicalNews");
    }

    //This method cannot be overridden as this is final
    public final void governmentMedicalInsurances()
    {
        System.out.println("Max Hospital -- governmentMedicalInsurances");
    }

    @Override
    public void inHouseervices() {
        System.out.println("Max Hospital -- inHouseervices");

    }
}
