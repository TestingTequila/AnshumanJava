package com.janbask.usageOfThisKeyword;

public class TestThisConstructor
{
    public static void main(String[] args) {
//        Registration registration = new Registration("Jason", "Roger",29, 6, 'm' );
//        System.out.println(registration.fName);
//        System.out.println(registration.lName);
//        System.out.println(registration.age);
//        System.out.println(registration.totalExp);
//        System.out.println(registration.gender);

        Registration registration = new Registration("Jason", "Roger");
        System.out.println(registration.fName);
        System.out.println(registration.lName);
        System.out.println(registration.age);
        System.out.println(registration.totalExp);
        System.out.println(registration.gender);

    }
}
