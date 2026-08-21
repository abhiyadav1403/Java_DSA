package oops_java.inheritance;
class Animals{
     void eat(){
        System.out.println("Eating......");
    }
}
class Dogs extends Animals{
    void bark(){
        System.out.println("Barking......");

    }
}

class Puppy extends Animals{
    void weep(){
        System.out.println("Weeping....");
    }
}
public class TypeOfInheritance {
    public static void main(String[] args) {

//        single inheritance

        Dogs dog = new Dogs();
        dog.eat();
        dog.bark();


//         multilevel inheritance
        System.out.println("MultiLevel Inheritance.....................");
        Puppy p = new Puppy();
        p.eat();
        p.weep();

//        Hierachical inheritance
        Puppy d = new Puppy();
        d.eat();
        p.weep();

    }


//    a.bark()




}
