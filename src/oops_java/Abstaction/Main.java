//package oops_java.Abstaction;
//
//abstract class Brid{
//    abstract void fly();
//
//    abstract  void eat();
//}
//class Sparrow extends Brid {
//    @Override
//    void fly(){
//        System.out.println("Sparrow fly");
//    }
//
//    @Override
//    void eat(){
//        System.out.println("Sparrow eat");
//    }
//}
//class Crow extends Brid {
//    @Override
//    void fly() {
//        System.out.println("Crow fly");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Crow eat");
//    }
//}
//
//public class Main {
//
//    public static void toBridStuffing(Brid b) {
//        b.fly();
//        b.eat();
//    }
//
//    public static void main(String[] args) {
//        /*Brid b = new Sparrow();
//        b.fly();
//        b.eat();*/
//
//        toBridStuffing(new Sparrow());
//        toBridStuffing(new Crow());
//    }
//}
//

//  Interface Method
package oops_java.Abstaction;

interface Brid{
     void fly();

     void eat();
}
class Sparrow implements Brid {


    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eating");
    }


}
class Crow implements Brid {

    @Override
    public void fly() {
        System.out.println("Crow flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow eating");

    }
}

public class Main {

    public static void toBridStuffing(Brid b) {
        b.fly();
        b.eat();
    }

    public static void main(String[] args) {
        /*Brid b = new Sparrow();
        b.fly();
        b.eat();*/

        toBridStuffing(new Sparrow());
        toBridStuffing(new Crow());
    }
}


















