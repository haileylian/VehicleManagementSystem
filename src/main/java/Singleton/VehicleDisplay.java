package Singleton;
import SimpleFactory.Vehicle;

/**
 * The VehicleDisplay class provides a method to display the vehicles managed by the VehicleManager.
 * It uses the Singleton pattern to retrieve the instance of the VehicleManager.
 */
public class VehicleDisplay {

    /**
     * Displays the vehicles managed by the VehicleManager.
     * If no vehicles have been added to the management system, it prints a message saying so.
     */
    public void displayVehicles() {
        VehicleManager manager = VehicleManager.getInstance();
        if (manager.getVehicles().isEmpty()) {
            System.out.println("No vehicles added to the management system.");
            return;
        }

        System.out.println("Vehicles added to management system:");
        for (Vehicle v : manager.getVehicles()) {
            System.out.println(v);
        }
    }
}