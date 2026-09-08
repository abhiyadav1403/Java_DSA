package Projects.Vehicle_Rent_System;
//
//public abstract class Vehicle{
//    private int vehicleId;
//    private String brand;
//    private double priceperDay;
//    private boolean rented;
//
//    public Vehicle(int vehicleId, String brand, double priceperDay) {
//        this.vehicleId = vehicleId;
//        this.brand = brand;
//        this.priceperDay = priceperDay;
//        this.rented = rented;
//    }
//
//    public int getVehicleId() {
//        return  vehicleId;
//    }
//    public String getBrand() {
//        return brand;
//    }
//    public double getPriceperDay() {
//        return priceperDay;
//    }
//    public boolean isRented() {
//        return rented;
//    }
//
////    Rent vehicle
//    public void rentVehicle() {
//        if(!rented) {
//            rented = true;
//            System.out.println("Vehicle has been rent successfully");
//        }
//        else{
//            System.out.println("Vehicle is already rented!");
//        }
//    }
//
////    Return Vehicle
//    public void returnVehicle() {
//        if(rented) {
//            rented = false;
//            System.out.println("Vehicle return successfully");
//        }
//        else{
//            System.out.println("Vehicle was not rented!");
//        }
//    }
//
////    Abstract method
//    public abstract double calculateRentalCost(int days);
//
////    display vehicle
//    public abstract void displayVehicle();
//}

public abstract class Vehicle {

    private int vehicleId;
    private String brand;
    private double pricePerDay;
    private boolean rented;

    // Constructor
    public Vehicle(int vehicleId, String brand, double pricePerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
        this.rented = false;
    }

    // Getters
    public int getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public boolean isRented() {
        return rented;
    }

    // Rent vehicle
    public void rentVehicle() {

        if (!rented) {
            rented = true;
            System.out.println("Vehicle rented successfully!");
        } else {
            System.out.println("Vehicle is already rented!");
        }
    }

    // Return vehicle
    public void returnVehicle() {

        if (rented) {
            rented = false;
            System.out.println("Vehicle returned successfully!");
        } else {
            System.out.println("Vehicle is not currently rented!");
        }
    }

    // Abstract methods
    public abstract double calculateRentalCost(int days);

    public abstract void displayVehicle();
}
