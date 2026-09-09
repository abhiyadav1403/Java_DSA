package Projects.Vehicle_Rent_System;

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
