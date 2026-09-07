package PracticeFile.Polymorphism;
class Animal {
    void sound() {
        System.out.println("Animal make a sound.");
    }
}
class Dog extends  Animal{
    @Override
    void sound() {
        System.out.println("Dog barks");

    }
}
class cat extends Animal{
    @Override
    void sound(){
        System.out.println("cat meows");
    }
}

public class Method_override {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();

        a = new cat();
        a.sound();

    }
}
