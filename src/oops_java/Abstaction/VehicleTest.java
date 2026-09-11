package oops_java.Abstaction;

abstract class Vehicle{
    abstract void start();
}

class Car extends Vehicle{
    void start(){
        System.out.println("Car starts with key");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike starts with self-start");
    }
}
class Bus extends Vehicle{
    void start(){
        System.out.println("Bus starts with engine");
    }
}
public class VehicleTest {
    public static void startEngine(Vehicle v){
        v.start();
    }

    public static void main(String[] args) {

        startEngine(new Car());
        startEngine(new Bike());
        startEngine(new Bus());

    }
}
