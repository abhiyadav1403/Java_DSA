package PracticeFile.Inheritance;

class Vehicle{
    Vehicle(){
        System.out.println("This is vehicle.");
    }
}
class Bike extends Vehicle{
    Bike(){
        System.out.println("This is Bike.");
    }
}
class Bus extends Bike {
    Bus(){
        System.out.println("This is bus.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Bus b = new Bus();

    }
}
