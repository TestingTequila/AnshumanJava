package com.janbask.usageOfThisKeyword;

public class Register {
    private String fName;

    public String getfName() {
        return fName;
    }

    public Register setfName(String fName) {
        this.fName = fName;
        return this;
    }

    public String getlName() {
        return lName;
    }

    public Register setlName(String lName) {
        this.lName = lName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Register setAge(int age) {
        this.age = age;
        return this;
    }

    public int getTotalExp() {
        return totalExp;
    }

    public Register setTotalExp(int totalExp) {
        this.totalExp = totalExp;
        return this;
    }

    public char getGender() {
        return gender;
    }

    public Register setGender(char gender) {
        this.gender = gender;
        return this;
    }

    private String lName;
    private int age;
    private int totalExp;
    private char gender;


}
