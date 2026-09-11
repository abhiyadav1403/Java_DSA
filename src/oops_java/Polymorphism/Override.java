package oops_java.Polymorphism;

class Animal{
    void sound(){
        System.out.println("Animal make a sounds");
    }
}
class Dog extends Animal{
    @java.lang.Override
    void sound(){
        System.out.println(" Dog Bark");
    }
}

class  Cat extends Animal{
    @java.lang.Override
    void sound(){
        System.out.println("Cat meous");
    }
}

public class Override {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();

        Animal b = new Cat();
        b.sound();
    }
}
