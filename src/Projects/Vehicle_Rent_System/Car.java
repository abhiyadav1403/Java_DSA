package Projects.Vehicle_Rent_System;


public class Car extends Vehicle {

    private int numberOfSeats;

    public Car(
            int vehicleId,
            String brand,
            double pricePerDay,
            int numberOfSeats) {

        super(vehicleId, brand, pricePerDay);

        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public double calculateRentalCost(int days) {

        double cost = getPricePerDay() * days;

        // 10% discount for more than 7 days
        if (days > 7) {
            cost = cost - (cost * 0.10);
        }

        return cost;
    }

    @Override
    public void displayVehicle() {

        System.out.println("--------------------------------");
        System.out.println("Vehicle Type : Car");
        System.out.println("Vehicle ID   : " + getVehicleId());
        System.out.println("Brand        : " + getBrand());
        System.out.println("Seats        : " + numberOfSeats);
        System.out.println("Price/Day    : ₹" + getPricePerDay());
        System.out.println("Status       : "
                + (isRented() ? "Rented" : "Available"));
        System.out.println("--------------------------------");
    }
}