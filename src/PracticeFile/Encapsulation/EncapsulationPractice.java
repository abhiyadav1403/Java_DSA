package PracticeFile.Encapsulation;

//class Account{
//    private double balance;
////    setter method
//    public void setBalance(double balance){
//        if (balance >= 0){
//            this.balance = balance;
//        }
//        else{
//            System.out.println("Error : Negative balance not allow .");
//        }
//    }
//
////    getter method
//    public double getBalance(){
//        return  balance;
//    }
//}

//    Employee details
    class Employee{
        private String name;
        private double salary;


//        setter methods
        public void setName(String name){
        this.name = name;
        }

//        getter methods.
    public String getName() {
        return name;
    }


    public double getSalary() {
            return salary;
    }
    public void setSalary(double salary) {
            this.salary = salary;
    }
}
public class EncapsulationPractice {

    public static void main(String[] args) {


        Employee emp = new Employee();
        emp.setName("Shubham");
        emp.setSalary(3000);
        System.out.println(emp.getName() + "  earn$   " + emp.getSalary());

//        Account ac = new Account();
//        ac.setBalance(4000);
//        System.out.println(ac.getBalance());
    }

}
