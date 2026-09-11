package oops_java.Polymorphism;

import java.util.Scanner;

public class PaymentsApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount:");
        int amount = sc.nextInt();

        System.out.println("Choose you payment methods:");
        System.out.println("1. cash");
        System.out.println("2. card");
        System.out.println("3. upi");
        System.out.println("4. netbanking");

        System.out.println("Enter your choose:");
        int choice = sc.nextInt();

        Payments payment;

        switch (choice){
            case 1:
                payment = new CashPayment();
                payment.pay(amount);
                break;

            case 2:
                payment = new CardPayment();
                payment.pay(amount);
                break;

            case 3:
                payment = new UpiPayment();
                payment.pay(amount);
                break;

            case 4:
                payment = new NetBanking();
                payment.pay(amount);
                break;

            default:
                System.out.println("Invalid choice");
        }



//        Payments a;
//
////        a = new CashPayment();
//        System.out.println("Enter amount:");
//        a.pay(sc.nextInt());
////        a.pay(500);
//        a.pay(500, "INR");
//
//        a= new CardPayment();
//        a.pay(500);
//        a.pay(500, "INR");
//
//        a = new UpiPayment();
//        a.pay(500);
//        a.pay(500, "INR");
//
//        a = new NetBanking();
//        a.pay(500);
//        a.pay(500, "INR");
    }
}
