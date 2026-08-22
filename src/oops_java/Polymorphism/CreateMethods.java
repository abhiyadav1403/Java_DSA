package oops_java.Polymorphism;

import java.lang.Override;

class CashPayment extends Payments {

    @Override
    void pay(int amount) {
        showReceipt("Cash",amount);
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

class CardPayment extends Payments {

    @Override
    void pay(int amount) {
        showReceipt("Cash",amount);
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

class UpiPayment extends Payments {

    @Override
    void pay(int amount) {
        showReceipt("Cash",amount);
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


class NetBanking extends Payments {

    @Override
    void pay(int amount) {
        showReceipt("Cash",amount);
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