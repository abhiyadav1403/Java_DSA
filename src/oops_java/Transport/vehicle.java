package oops_java.Transport;

public class vehicle {

    public String name;

    public String model;

    public int noOfTyres;

    vehicle(){
        this.name = "";
        this.model = "";
        this.noOfTyres= -1;
    }

    vehicle(String name, String model, int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres= noOfTyres;
    }
     void startEngine(){
        System.out.println("Engine is starting of %s : %s\n" + " "+ name + " "+ model);
    }
    void stopEngine(){
        System.out.println("Engine is stoping of %s :%s\n"+name + " "+model);

    }

}
