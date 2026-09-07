package PracticeFile.Abstraction;

interface Playable{
    void play();
}
//class 1
class Music implements  Playable{
    @Override
    public void play() {
        System.out.println("Music playing");
    }
}

// Class 2
class Game implements Playable{

    @Override
    public void play() {
        System.out.println("Game playing");
    }
}

public class Test {
    public static void main(String[] args) {
        Playable p = new Music();
        p.play();

        Playable p1 = new Game();;
        p1.play();
    }
}
