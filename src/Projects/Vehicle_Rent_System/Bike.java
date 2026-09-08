package Projects.Vehicle_Rent_System;
//
//public class Bike extends Vehicle{
//    private boolean helmetIncluded;
//    public Bike(int vehicleId, String brand, double priceperDay, boolean helmetIncluded) {
//        super(vehicleId, brand, priceperDay);
//        this.helmetIncluded=helmetIncluded;
//    }
//    public boolean isHelmetIncluded() {
//        return helmetIncluded;
//    }
////    method Overriding
//    @Override
//    public double calculateRentalCost(int days) {
//        return getPriceperDay() * days;
//    }
//
//    @Override
//    public void displayVehicle() {
//        System.out.println("--------------------------------");
//        System.out.println("Vehicle Type : Bike");
//        System.out.println("Vehicle ID   : " + getVehicleId());
//        System.out.println("Brand        : " + getBrand());
//        System.out.println("Helmet       : "
//                + (helmetIncluded ? "Included" : "Not Included"));
//        System.out.println("Price/Day    : ₹" + getPriceperDay());
//        System.out.println("Status       : "
//                + (isRented() ? "Rented" : "Available"));
//        System.out.println("--------------------------------");
//    }
//}

public class Bike extends Vehicle {

    private boolean helmetIncluded;

    public Bike(
            int vehicleId,
            String brand,
            double pricePerDay,
            boolean helmetIncluded) {

        super(vehicleId, brand, pricePerDay);

        this.helmetIncluded = helmetIncluded;
    }

    public boolean isHelmetIncluded() {
        return helmetIncluded;
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
        System.out.println("Vehicle Type : Bike");
        System.out.println("Vehicle ID   : " + getVehicleId());
        System.out.println("Brand        : " + getBrand());
        System.out.println("Helmet       : "
                + (helmetIncluded ? "Included" : "Not Included"));
        System.out.println("Price/Day    : ₹" + getPricePerDay());
        System.out.println("Status       : "
                + (isRented() ? "Rented" : "Available"));
        System.out.println("--------------------------------");
    }
}
