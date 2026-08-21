package oops_java.Transport;

public class car  extends vehicle{
     public int noOfDoor;

     public String transmissionType;

     car(String name, String model,int noOfTyres, int noOfDoor, String transmissionType){
         super(name ,model, noOfTyres);
         this.noOfDoor= noOfDoor;
         this.transmissionType=transmissionType;

     }

     public void startAC(){
         System.out.println("AC started :"+name);
     }

}
