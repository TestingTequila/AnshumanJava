package com.janbask.usageOfThisKeyword;

public class Registration {
    String fName;
    String lName;
    int age;
    int totalExp;
    char gender;

    public Registration(String fName, String lName, int age, int totalExp, char gender) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
        this.totalExp = totalExp;
    }

    public Registration(String fName, String lName) {
        this(fName, lName, 18, 5, 'M');
        this.fName = fName;
        this.lName = lName;
    }

    public Registration(int age, int totalExp, char gender) {
        this("Anshuman", "Batra");
        this.age = age;
        this.gender = gender;
        this.totalExp = totalExp;
    }
}
