package com.janbask.usageOfThisKeyword;

public class TestRegister
{
    public static void main(String[] args) {
        Register register = new Register();
        register.setfName("Jason").setGender('F').setTotalExp(12).setlName("Roger").setAge(44);

        System.out.println(register.getfName());
        System.out.println(register.getAge());
        System.out.println(register.getGender());
        System.out.println(register.getTotalExp());
        System.out.println(register.getlName());

    }
}
