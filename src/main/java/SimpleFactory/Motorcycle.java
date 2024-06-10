package SimpleFactory;

/**
 * This class represents a Motorcycle, which is a type of Vehicle.
 * It provides the concrete implementation for the start and stop methods defined in the Vehicle class.
 *
 */
public class Motorcycle extends Vehicle {

    /**
     * Constructor for the Motorcycle class.
     * Calls the superclass constructor to initialize the Vehicle attributes.
     */
    public Motorcycle() {
        super();
    }

    /**
     * Starts the motorcycle.
     * This method overrides the start method in the Vehicle class.
     */
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    /**
     * Stops the motorcycle.
     * This method overrides the stop method in the Vehicle class.
     */
    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }
}