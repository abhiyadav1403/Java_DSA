package PracticeFile.Inheritance;

class  vehicle{
    vehicle(){
        System.out.println("This is vehicle");
    }
}

class Car extends vehicle{
    Car (){
            System.out.println("This is car");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car c = new Car();

    }
}
