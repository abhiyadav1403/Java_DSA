package PracticeFile.Inheritance;
class SolarySystem{
    void solar(){
        System.out.println("This is solary system:");
    }
}
//interface for fare
interface fare{
    default void fareinfo(){
        System.out.println("This is Fare:");
    }
}
class Earth extends SolarySystem{
    void earthinfo(){
        System.out.println("This is earth:");
    }
}
class Mars extends SolarySystem implements fare{
    void marsinfo(){
        System.out.println("This is Mars:");
    }
}

public class Hybrid_Inheritance {
    public static void main(String[] args) {
        Earth e = new Earth();
        Mars m = new Mars();
        e.earthinfo();
        e.solar();
        m.fareinfo();
        m.marsinfo();
        m.solar();

    }
}
