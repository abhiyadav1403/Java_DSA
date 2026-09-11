package PracticeFile.Inheritance;

interface LandVehicle{
    default void landinfo(){
        System.out.println("This is a LandVehicle");
    }
}
interface waterVehicle{
    default void waterinfo(){
        System.out.println("This is a WaterVehicle");
    }
}
class AmphioneVehicle implements LandVehicle, waterVehicle{
    AmphioneVehicle(){
    System.out.println("AmphioneVehicle");
    }
}
public class Multiple_Inheritance {
    public static void main(String[] args) {
        AmphioneVehicle a = new AmphioneVehicle();
        a.landinfo();
        a.waterinfo();

    }
}
