package oops_java.Abstaction;


interface  Playable{
    void play();
}
class Music implements Playable{
    @Override
    public void play(){
        System.out.println("Playing music");
    }
}

class Game implements Playable{
    @Override
    public void play(){
        System.out.println("Playing game");
    }
}



public class TestInterface {

    public static void toPlayStuffing(Playable p){
        p.play();
    }

    public static void main(String[] args) {

        toPlayStuffing(new Music());
        toPlayStuffing(new Game());

//        Playable p = new Music();
//        p.play();
//        Playable p1 = new Game();
//        p1.play();

    }
}
