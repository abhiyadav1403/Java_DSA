package oops_java.Abstaction;

import javax.smartcardio.Card;
import java.util.Scanner;

abstract class Payments{
    abstract void pay(double amount);

    void paymentMessage(){
        System.out.println("Payment Processing......");
    }
}

class CashPayment extends Payments{
    public void pay(double amount){
        System.out.println("Payments Successfull");
        System.out.println("Amount:"+ amount);
    }
}
class CardPayment extends Payments{
    public  void pay(double amount){
        System.out.println("Cardpayment Successfull....");
        System.out.println("Amount: " +amount);
    }
}

class UpiPayment extends Payments{
    public void pay(double amount){
        System.out.println("UPI Payment Successfull....");
        System.out.println("Amount: " +amount);
    }
}

class  NetBanking extends Payments{
    public void pay(double amount){
        System.out.println("NetBanking  Successfull....");
        System.out.println("Amount: " +amount);
    }
}



public class PaymentsMethods {
//    public  static void ChoicePayments(Payments p){
//        p.pay(400.00);

//    }
    public static void main(String[] args) {
//        ChoicePayments(new CashPayment());
//        ChoicePayments(new CardPayment());
//        ChoicePayments(new UpiPayment());
//        ChoicePayments(new NetBanking());

//        Payments p =new CardPayment();
//        p.pay(500.00);
//
//        Payments p;
//        p = new CashPayment();
//        p.paymentMessage();
//        p.pay(599.00);
//
//        p= new CardPayment();
//        p.paymentMessage();
//        p.pay(3000.0);
//
//        p= new UpiPayment();
//        p.paymentMessage();
//        p.pay(342.0);
//
//        p= new NetBanking();
//        p.paymentMessage();
//        p.pay(999.0);


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your amount:");
        double amount = sc.nextDouble();


        System.out.println("Choice Payment methods");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("3. Upi");
        System.out.println("4. Netbanking");


        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        Payments p;

        switch(choice){
            case 1:
                p= new CashPayment();
                p.pay(amount);
                break;

            case 2:
                p = new CardPayment();
                p.pay(amount);
                break;
            case 3:
                p = new UpiPayment();
                p.pay(amount);
                break;
            case 4:
                p = new NetBanking();
                p.pay(amount);
                break;

            default:
                System.out.println("Invalid Payments methods");
                return;
        }

    }
}
