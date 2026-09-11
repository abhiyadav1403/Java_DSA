package PracticeFile.Encapsulation;

class BankAccount{
    private double balance;

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        this.balance += amount;
        if(amount > 0){
            System.out.println("Deposited :" + amount);
        }
        else{
            System.out.println("Invalid Deposit ");
        }
    }

    public void withdraw(double amount){
         this.balance -= amount;
         if(amount > 0 && amount <= balance){
             System.out.println("Withdrawn : "+ amount);
         }
         else{
             System.out.println("Invalid amount ");
         }
    }

}
public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(15070);
        bankAccount.withdraw(2000);
        System.out.println("Current balance "+ bankAccount.getBalance());
    }
}
