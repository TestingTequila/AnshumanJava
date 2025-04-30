package com.janbask.constructors;

public class TestUser
{
    public static void main(String[] args) {
        User user = new User("Jason", "jason.roger@gmail.com");
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.email);
        System.out.println(user.phone);
        System.out.println(user.password);
        System.out.println("=================================================");

        User user1= new User("Anshuman", 29, "anshuman@gmail.com", "test@1234", "55356");
        System.out.println(user1.name);
        System.out.println(user1.age);
        System.out.println(user1.email);
        System.out.println(user1.phone);
        System.out.println(user1.password);
    }
}
