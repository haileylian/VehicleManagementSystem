import Singleton.VehicleService;
import Singleton.VehicleDisplay;

/**
 * The Main class serves as the entry point for the application.
 */
public class Main {

    /**
     * It creates a VehicleService to create vehicles, and a VehicleDisplay
     * to display the created vehicles. It then calls the methods of these
     * instances to create and display vehicles.
     *
     * @param args command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleService();
        VehicleDisplay vehicleDisplay = new VehicleDisplay();

        vehicleService.createCar();
        vehicleService.createMotorcycle();
        vehicleService.createVehicleFromFactory();

        vehicleDisplay.displayVehicles();
    }
}