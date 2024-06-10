package Singleton;

import SimpleFactory.Vehicle;
import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class to manage vehicles.
 * This class is responsible for managing a list of Vehicle objects.
 * It provides methods to add a vehicle to the list and to retrieve the list of vehicles.
 *
 */
public class VehicleManager {
    /**
     * The single instance of the class.
     */
    private static volatile VehicleManager instance;

    /**
     * List to store vehicles.
     */
    private final List<Vehicle> vehicles;

    /**
     * Private constructor to prevent instantiation.
     * Initializes the list of vehicles.
     */
    private VehicleManager() {
        vehicles = new ArrayList<>();
    }

    /**
     * Method to get the single instance of the class.
     * If the instance is null, it creates a new instance of the class.
     * This method is thread-safe.
     *
     * @return instance the single instance of the class
     */
    public static VehicleManager getInstance() {
        if (instance == null) {
            synchronized (VehicleManager.class) {
                if (instance == null) {
                    instance = new VehicleManager();
                }
            }
        }
        return instance;
    }

    /**
     * Method to add a vehicle to the list.
     *
     * @param vehicle the vehicle to add
     */
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    /**
     * Method to retrieve all vehicles from the list.
     *
     * @return a list of all vehicles
     */
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}