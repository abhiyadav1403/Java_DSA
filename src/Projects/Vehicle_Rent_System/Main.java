package Projects.Vehicle_Rent_System;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Vehicle> vehicles = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        create vehicle
        vehicles.add(new Car(101,"Toyota", 2000.0, 7));
        vehicles.add(new Car(102,"Honda", 1500, 5));
        vehicles.add(new Car(103,"Maruti", 2000.0, 5));
        vehicles.add(new Car(104,"Honda Varnua", 2500, 4));
        vehicles.add(new Car(105, "Hona Creta", 1200,5));
        vehicles.add(new Bike(201,"Royal Enfield", 100, true));
        vehicles.add(new Bike(202,"Yamha", 1000,true));
        vehicles.add(new Bike(203, "Kavasaki", 800, false));
        vehicles.add(new Bike(204, "Hero", 800, false));
        vehicles.add(new Bike(205, "Honda Shine", 800, true));
        vehicles.add(new Bike(206, "Plasure", 800, true));


        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println("       VEHICLE RENTAL SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Display Vehicles");
            System.out.println("2. Rent Vehicle");
            System.out.println("3. Return Vehicle");
            System.out.println("4. Calculate Rental Cost");
            System.out.println("5. Exit");
            System.out.println("6. Add Vehicle");
            System.out.println("7. Search Vehicle");
            System.out.println("8. Show Available Vehicles");
            System.out.println("=================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayVehicles();
                    break;
                case 2:
                    rentVehile();
                    break;
                case 3:
                    returnVehicle();
                    break;
                case 4:
                    calculateRentalCost();
                    break;
                case 5:
                    System.out.println("Thank you for using Rental System");
                    break;

                case 6:
                    addVehicle();
                    break;

                case 7:
                    searchVehicle();
                    break;

                case 8:
                    showAvailableVehicles();
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
            while(choice !=5);
            sc.close();
        }

//        display Vehicle
        public static void displayVehicles(){

            System.out.println("\n========== VEHICLES ==========");

            for(Vehicle vehicle: vehicles){
                vehicle.displayVehicle();
            }
        }

//        Find vehicle
public static Vehicle findVehicle(int vehicleId) {

    for (Vehicle vehicle : vehicles) {

        if (vehicle.getVehicleId() == vehicleId) {
            return vehicle;
        }
    }

    return null;
}

//        Rect Vehicle
    public static void rentVehile(){
        System.out.println("\n========== RENT VEHICLE ==========");

        System.out.print("Enter Vehicle ID: ");
        int vehicleId = sc.nextInt();

        Vehicle vehicle = findVehicle(vehicleId);

        if(vehicle == null){
            System.out.println("Vehicle not found");
            return;
        }
        vehicle.rentVehicle();
    }
//    Return Vehicle
    public static void returnVehicle(){

        System.out.println("\n========== RETURN VEHICLE ==========");

        System.out.print("Enter Vehicle ID: ");
        int vehicleId = sc.nextInt();

        Vehicle vehicle = findVehicle(vehicleId);
        if(vehicle == null){
            System.out.println("Vehile not found");
            return;
        }
        vehicle.returnVehicle();
    }

//    Calculate Rent Cost

    public static void calculateRentalCost(){
        System.out.println("\n========== RENTAL COST ==========");

        System.out.print("Enter Vehicle ID: ");
        int vehicleId = sc.nextInt();

        Vehicle vehicle = findVehicle(vehicleId);

        if(vehicle == null){
            System.out.println("Vehicle not found");

            return;
        }
        if(!vehicle.isRented()){
            System.out.println("Vehicle is not currntly found ");

            return;
        }
        System.out.println("Enter number of days:");
        int days = sc.nextInt();

        if(days < 0 ){
            System.out.println("Days must be greater than 0!");
            return;
        }

        double originalCost =
                vehicle.getPricePerDay() * days;

        double finalCost =
                vehicle.calculateRentalCost(days);

        double discount =
                originalCost - finalCost;


        System.out.println("--------------------------------");
        System.out.println("Vehicle        : " + vehicle.getBrand());
        System.out.println("Price per day  : ₹" + vehicle.getPricePerDay());
        System.out.println("Days           : " + days);
        System.out.println("Original Cost  : ₹" + originalCost);
        System.out.println("Discount       : ₹" + discount);
        System.out.println("Final Cost     : ₹" + finalCost);
        System.out.println("--------------------------------");

    }

    public static void addVehicle() {

        System.out.println("\n========== ADD VEHICLE ==========");

        System.out.println("1. Car");
        System.out.println("2. Bike");

        System.out.print("Choose vehicle type: ");
        int type = sc.nextInt();

        System.out.print("Enter Vehicle ID: ");
        int vehicleId = sc.nextInt();

        // Check duplicate ID
        if (findVehicle(vehicleId) != null) {
            System.out.println("Vehicle ID already exists!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        // Ask price from user
        System.out.print("Enter Price Per Day: ₹");
        double pricePerDay = sc.nextDouble();

        Vehicle vehicle;

        if (type == 1) {

            System.out.print("Enter Number of Seats: ");
            int seats = sc.nextInt();

            vehicle = new Car(
                    vehicleId,
                    brand,
                    pricePerDay,
                    seats
            );

        } else if (type == 2) {

            System.out.print("Is Helmet Included? (true/false): ");
            boolean helmet = sc.nextBoolean();

            vehicle = new Bike(
                    vehicleId,
                    brand,
                    pricePerDay,
                    helmet
            );

        } else {

            System.out.println("Invalid vehicle type!");
            return;
        }

        vehicles.add(vehicle);

        System.out.println("Vehicle added successfully!");
    }
    // ==========================================
    // 7. SEARCH VEHICLE
    // ==========================================

    public static void searchVehicle() {

        System.out.println("\n========== SEARCH VEHICLE ==========");

        System.out.print("Enter Vehicle ID: ");
        int vehicleId = sc.nextInt();

        Vehicle vehicle = findVehicle(vehicleId);

        if (vehicle == null) {

            System.out.println(
                    "Vehicle not found!"
            );

        } else {

            System.out.println(
                    "Vehicle found!"
            );

            vehicle.displayVehicle();
        }
    }

    // ==========================================
    // 8. SHOW AVAILABLE VEHICLES
    // ==========================================

    public static void showAvailableVehicles() {

        System.out.println(
                "\n========== AVAILABLE VEHICLES =========="
        );

        boolean found = false;

        for (Vehicle vehicle : vehicles) {

            if (!vehicle.isRented()) {

                vehicle.displayVehicle();

                found = true;
            }
        }

        if (!found) {

            System.out.println(
                    "No vehicles are currently available."
            );
        }
    }
}
