package PracticeFile.Polymorphism;

class Calculator{
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(1,2,13));
        System.out.println(c.add(23,34));;
    }
}
