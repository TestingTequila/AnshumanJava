package com.janbask.usageOfThisKeyword;

public class ECommerce {
    public ECommerce login(String email, String password) {
        System.out.println("Login using email : " + email + " and password " + password);
        return new ECommerce();
    }

    public ECommerce login(String email, int otp) {
        System.out.println("Login using email as : " + email + " and otp " + otp);
        return this;
    }

    public ECommerce searchProduct(String productName) {
        System.out.println("Searching product : " + productName);
        return this;
    }

    public ECommerce searchProduct(String productName, int price) {
        System.out.println("Searching product : " + productName + "  and price " + price);
        return this;
    }

    public ECommerce searchProduct(String productName, int price, String brand) {
        System.out.println("Searching product : " + productName + "  and price " + price + " and brand " + brand);
        return this;
    }

    public ECommerce addToCart(String productName) {
        System.out.println(" Add the " + productName + " into the Cart....");
        return this;
    }

    public ECommerce doPayment(int CC, int cvv) {
        System.out.println("Payment Using Credit card : " + CC + " and CVV as " + cvv);
        return this;
    }

    public ECommerce doPayment(String upiId) {
        System.out.println("Payment Using UPI: " + upiId);
        return this;
    }

    public ECommerce generateId() {
        System.out.println("Product Generation id: "  + 123455);
        return this;
    }

    public void logout() {
        System.out.println("LOGOUT.....");
    }


}
