package oops_java.Abstaction;

abstract class Employee{

    double salary;
    String name;
    Employee(String name, double salary){
        this.name = name;
        this.salary=salary;
    }
    abstract double CalculateSalary();

    void showname(){
        System.out.println("Employee :" + name);
    }
    void showsalary(){
        System.out.println("Salary:");
    }
}

class Developer extends Employee{

    Developer(String name, double salary) {
        super(name,salary);
    }

    @Override
    double CalculateSalary() {
        return salary;
    }
}
class Teacher extends Employee{
    Teacher(String name,double salary){
        super(name, salary);
    }

    @Override
    double CalculateSalary(){
        return salary;
    }
}
class Manager extends Employee{
    Manager(String name, double salary){
        super(name, salary);
    }
    @Override
    double CalculateSalary(){
        return salary;
    }
}

public class EmployementWork {

    public static void showEmployee(Employee e) {
        e.showname();

        double salary = e.CalculateSalary();

        System.out.println("Salary: ₹" + salary);
        System.out.println();
    }

    public static void main(String[] args) {

        showEmployee(new Developer("Rahul",5000.0));
        showEmployee(new Teacher("Abhi", 727.2));
        showEmployee(new Manager("Jyoti",50000.0));


    }
}
