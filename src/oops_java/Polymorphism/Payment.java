package oops_java.Polymorphism;

import java.lang.Override;

class Payments{
    void pay(int amount){
        System.out.println("makding payments methods......");
    }

    void pay(int a, String currency){
        System.out.println("use to currency which of the country");
    }

    void showReceipt(String paymentMethod, int amount) {

        System.out.println("================================");
        System.out.println("       PAYMENT SUCCESSFUL");
        System.out.println("================================");
        System.out.println("Payment Method : " + paymentMethod);
        System.out.println("Amount         : ₹" + amount);
        System.out.println("Status         : SUCCESS");
        System.out.println("================================");
    }
}
