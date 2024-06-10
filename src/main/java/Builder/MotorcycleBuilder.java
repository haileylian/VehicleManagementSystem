package Builder;
import SimpleFactory.Motorcycle;
import SimpleFactory.Vehicle;

/**
 * This class implements the VehicleBuilder interface for a Motorcycle.
 * It provides the concrete implementation for the methods defined in the VehicleBuilder interface.
 * Each method returns an instance of MotorcycleBuilder, allowing for method chaining.
 *
 */
public class MotorcycleBuilder implements VehicleBuilder {
    private Vehicle vehicle;

    /**
     * Constructor for the MotorcycleBuilder class.
     * Initializes a new Motorcycle object and sets its type to "motorcycle".
     */
    public MotorcycleBuilder() {
        this.vehicle = new Motorcycle();
        this.vehicle.setType("motorcycle");
    }

    /**
     * Sets the type of the motorcycle.
     *
     * @param type the type of the motorcycle
     * @return the current instance of MotorcycleBuilder
     */
    @Override
    public VehicleBuilder buildType(String type) {
        vehicle.setEngine(type);
        return this;
    }

    /**
     * Sets the engine of the motorcycle.
     *
     * @param engine the engine of the motorcycle
     * @return the current instance of MotorcycleBuilder
     */
    @Override
    public VehicleBuilder buildEngine(String engine) {
        vehicle.setEngine(engine);
        return this;
    }

    /**
     * Sets the number of wheels of the motorcycle.
     *
     * @param wheels the number of wheels of the motorcycle
     * @return the current instance of MotorcycleBuilder
     */
    @Override
    public VehicleBuilder buildWheels(int wheels) {
        vehicle.setWheels(wheels);
        return this;
    }

    /**
     * Sets the color of the motorcycle.
     *
     * @param color the color of the motorcycle
     * @return the current instance of MotorcycleBuilder
     */
    @Override
    public VehicleBuilder buildColor(String color) {
        vehicle.setColor(color);
        return this;
    }

    /**
     * Returns the constructed Motorcycle.
     *
     * @return the constructed motorcycle
     */
    @Override
    public Vehicle getVehicle() {
        return this.vehicle;
    }
}