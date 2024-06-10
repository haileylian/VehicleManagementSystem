package Builder;
import SimpleFactory.Vehicle;

/**
 * Interface for building a {@link Vehicle}.
 * This interface defines the methods required for building different parts of a vehicle.
 * Implementations of this interface will provide the actual building logic.
 *
 */
public interface VehicleBuilder {

    /**
     * Sets the type of the vehicle.
     *
     * @param type the type of the vehicle
     * @return the current instance of {@code VehicleBuilder}
     */
    VehicleBuilder buildType(String type);

    /**
     * Sets the engine of the vehicle.
     *
     * @param engine the engine of the vehicle
     * @return the current instance of {@code VehicleBuilder}
     */
    VehicleBuilder buildEngine(String engine);

    /**
     * Sets the number of wheels of the vehicle.
     *
     * @param wheels the number of wheels of the vehicle
     * @return the current instance of {@code VehicleBuilder}
     */
    VehicleBuilder buildWheels(int wheels);

    /**
     * Sets the color of the vehicle.
     *
     * @param color the color of the vehicle
     * @return the current instance of {@code VehicleBuilder}
     */
    VehicleBuilder buildColor(String color);

    /**
     * Retrieves the constructed {@link Vehicle}.
     *
     * @return the constructed vehicle
     */
    Vehicle getVehicle();
}