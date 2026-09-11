package oops_java.Transport;

public class Main {
    public static void main(String[] args) {
//        car c = new car("maruti", "800",4,5,"Auto");
//        c.startEngine();
//        c.startAC();
//        c.stopEngine();

        MotorCycle m = new MotorCycle("Splendor", "Hero",2,"U","Soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
