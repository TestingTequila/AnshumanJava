package com.janbask.usageOfThisKeyword;

public class TestECommerce
{
    public static void main(String[] args) {
        ECommerce eCommerce = new ECommerce();
        eCommerce.login("ashish@gmail.com", "test@1234").searchProduct("macbook").addToCart("macbook").logout();
//        eCommerce.login("asddas", "rter");
//        eCommerce.searchProduct("macbook");
//        eCommerce.addToCart("macbook");
//        eCommerce.doPayment("asadas@123");
//        eCommerce.generateId();
//        eCommerce.logout();
    }
}
