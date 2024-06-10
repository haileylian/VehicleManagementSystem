package Singleton;

import Builder.CarBuilder;
import Builder.MotorcycleBuilder;
import Builder.VehicleBuilder;
import Builder.VehicleDirector;
import SimpleFactory.Vehicle;
import SimpleFactory.VehicleFactory;
import java.util.Scanner;

/**
 * The VehicleService class provides methods to create different types of vehicles.
 * It uses the Builder pattern to create Car and Motorcycle objects, and a Factory pattern to create vehicles.
 * It also uses the Singleton pattern to manage the created vehicles through a VehicleManager instance.
 */
public class VehicleService {

    private final Scanner scanner = new Scanner(System.in);
    private final VehicleManager manager = VehicleManager.getInstance();

    /**
     * Creates a Car object using the Builder pattern and adds it to the VehicleManager.
     *
     * @return the created Car object
     */
    public Vehicle createCar() {
        return createVehicle(new CarBuilder(), "Car", "four-cylinder", 4, "white");
    }

    /**
     * Creates a Motorcycle object using the Builder pattern and adds it to the VehicleManager.
     *
     * @return the created Motorcycle object
     */
    public Vehicle createMotorcycle() {
        return createVehicle(new MotorcycleBuilder(), "Motorcycle", "V-twins", 2, "Black");
    }

    /**
     * Creates a Vehicle object using the Builder pattern and adds it to the VehicleManager.
     *
     * @param builder the VehicleBuilder to use
     * @param type the type of the vehicle
     * @param engine the engine of the vehicle
     * @param wheels the number of wheels of the vehicle
     * @param color the color of the vehicle
     * @return the created Vehicle object
     */
    private Vehicle createVehicle(VehicleBuilder builder, String type, String engine, int wheels, String color) {
        VehicleDirector director = new VehicleDirector(builder);
        Vehicle vehicle = director.construct(type, engine, wheels, color);
        manager.addVehicle(vehicle);
        return vehicle;
    }

    /**
     * Creates a Vehicle object using the Factory pattern based on user input and adds it to the VehicleManager.
     *
     * @return the created Vehicle object
     */
    public Vehicle createVehicleFromFactory() {
        System.out.println("Enter the type of vehicle(car/motorcycle): ");
        String factoryType = scanner.nextLine();

        System.out.println("Enter the color of the vehicle: ");
        String color = scanner.nextLine();

        Vehicle factoryVehicle = VehicleFactory.createVehicle(factoryType, color);
        manager.addVehicle(factoryVehicle);
        return factoryVehicle;
    }
}