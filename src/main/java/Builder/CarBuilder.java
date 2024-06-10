package Builder;
import SimpleFactory.Car;
import SimpleFactory.Vehicle;

/**
 * This class implements the VehicleBuilder interface for a Car.
 * It provides the concrete implementation for the methods defined in the VehicleBuilder interface.
 * Each method returns an instance of CarBuilder, allowing for method chaining.
 *
 */
public class CarBuilder implements VehicleBuilder {
    private Vehicle vehicle;

    /**
     * Constructor for the CarBuilder class.
     * Initializes a new Car object and sets its type to "car".
     */
    public CarBuilder() {
        this.vehicle = new Car();
        this.vehicle.setType("car");
    }

    /**
     * Sets the type of the car.
     *
     * @param type the type of the car
     * @return the current instance of CarBuilder
     */
    @Override
    public VehicleBuilder buildType(String type) {
        vehicle.setType(type);
        return this;
    }

    /**
     * Sets the engine of the car.
     *
     * @param engine the engine of the car
     * @return the current instance of CarBuilder
     */
    @Override
    public VehicleBuilder buildEngine(String engine) {
        vehicle.setEngine(engine);
        return this;
    }

    /**
     * Sets the number of wheels of the car.
     *
     * @param wheels the number of wheels of the car
     * @return the current instance of CarBuilder
     */
    @Override
    public VehicleBuilder buildWheels(int wheels) {
        vehicle.setWheels(wheels);
        return this;
    }

    /**
     * Sets the color of the car.
     *
     * @param color the color of the car
     * @return the current instance of CarBuilder
     */
    @Override
    public VehicleBuilder buildColor(String color) {
        vehicle.setColor(color);
        return this;
    }

    /**
     * Returns the constructed Car.
     *
     * @return the constructed car
     */
    @Override
    public Vehicle getVehicle() {
        return this.vehicle;
    }
}