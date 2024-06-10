package SimpleFactory;

/**
 * This class represents a Car, which is a type of Vehicle.
 * It provides the concrete implementation for the start and stop methods defined in the Vehicle class.
 *
 */
public class Car extends Vehicle {
    /**
     * Constructor for the Car class.
     * Calls the superclass constructor to initialize the Vehicle attributes.
     */
    public Car() {
        super();
    }
    /**
     * Starts the car.
     * This method overrides the start method in the Vehicle class.
     */
    @Override
    public void start() {
        System.out.println("Car started");
    }
    /**
     * Stops the car.
     * This method overrides the stop method in the Vehicle class.
     */
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}