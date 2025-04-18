package com.janbask.classConcept;

public class TesUser
{
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Anshuman";
        u1.age =29;
        u1.City = "Chandigarh";

        User u2 = new User();
        u2.name = "Jason";
        u2.age =23;
        u2.City = "NJ";

        User u3 = new User();
        u3.name = "Kerry";
        u3.age =42;
        u3.City = "London";

        System.out.println(u1.name + " : " + u1.age +" : " + u1.City);
        System.out.println(u2.name + " : " + u2.age +" : " + u2.City);
        System.out.println(u3.name + " : " + u3.age +" : " + u3.City);

        u1=u2; //u1 has broken its original connection and have started pointing where u2 is pointing
        System.out.println("======================u1=u2========================");
        System.out.println(u1.name + " : " + u1.age +" : " + u1.City);//Jason
        System.out.println(u2.name + " : " + u2.age +" : " + u2.City);//Jason
        System.out.println(u3.name + " : " + u3.age +" : " + u3.City);//Kerry


        u2=u3; //u2 has broken its original connection and have started pointing where u3 is pointing
        System.out.println("======================u2=u3========================");
        System.out.println(u1.name + " : " + u1.age +" : " + u1.City);//Jason
        System.out.println(u2.name + " : " + u2.age +" : " + u2.City);//Kerry
        System.out.println(u3.name + " : " + u3.age +" : " + u3.City);//Kerry

        u3=u1; //u3 has broken its original connection and have started pointing where u1 is pointing
        System.out.println("======================u3=u1========================");
        System.out.println(u1.name + " : " + u1.age +" : " + u1.City);//Jason
        System.out.println(u2.name + " : " + u2.age +" : " + u2.City);//Kerry
        System.out.println(u3.name + " : " + u3.age +" : " + u3.City);//Jason

        u1=u2=u3;
        System.out.println("======================u1=u2=u3========================");
        System.out.println(u1.name + " : " + u1.age +" : " + u1.City);//Jason
        System.out.println(u2.name + " : " + u2.age +" : " + u2.City);//Jason
        System.out.println(u3.name + " : " + u3.age +" : " + u3.City);//Jason

    }
}
