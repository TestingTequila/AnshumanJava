package com.janbask.constructors;

public class User
{
    String name;


    public User(String name, int age, String email, String password, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int age;
    String email;
    String password;
    String phone;
}
