package SimpleFactory;

/**
 * This abstract class represents a Vehicle.
 * It provides the structure for specific types of vehicles that will extend this class.
 * It includes attributes common to all vehicles and abstract methods that each specific vehicle should implement.
 *
 */
public abstract class Vehicle {
    private String type;
    private String engine;
    private int wheels;
    private String color;

    /**
     * Default constructor for the Vehicle class.
     */
    public Vehicle() {
        // Default constructor
    }

    /**
     * Gets the type of the vehicle.
     *
     * @return the type of the vehicle
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the vehicle.
     *
     * @param type the type of the vehicle
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the engine of the vehicle.
     *
     * @return the engine of the vehicle
     */
    public String getEngine() {
        return engine;
    }

    /**
     * Sets the engine of the vehicle.
     *
     * @param engine the engine of the vehicle
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * Gets the number of wheels of the vehicle.
     *
     * @return the number of wheels of the vehicle
     */
    public int getWheels() {
        return wheels;
    }

    /**
     * Sets the number of wheels of the vehicle.
     *
     * @param wheels the number of wheels of the vehicle
     */
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    /**
     * Gets the color of the vehicle.
     *
     * @return the color of the vehicle
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the vehicle.
     *
     * @param color the color of the vehicle
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Abstract method for starting the vehicle.
     * The specific implementation is provided by the classes that extend this class.
     */
    public abstract void start();

    /**
     * Abstract method for stopping the vehicle.
     * The specific implementation is provided by the classes that extend this class.
     */
    public abstract void stop();

    /**
     * Returns a string representation of the vehicle.
     *
     * @return a string representation of the vehicle
     */
    @Override
    public String toString() {
        return "added vehicle{" +
                "type='" + type + '\'' +
                ", engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                '}';
    }
}