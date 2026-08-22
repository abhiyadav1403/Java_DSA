package oops_java.Polymorphism;

public class Main {
    public static void main(String[] args) {

//        static polymorphism

        Calculator c = new Calculator();
        System.out.println(c.add(4,3));
        System.out.println(c.add(4,3 , 3));
        System.out.println(c.add(4,3, 3,5.0));


//        Run time polymorphism

        Circule d = new Circule();
        doDrawingStuff(d);
//        d.draw();

    }
    public static void doDrawingStuff(Shape s){
        s.draw();
    }
}
