package SimpleFactory;
/**
 * This class is a factory for creating Vehicle objects.
 * It provides a static method to create a Vehicle of a specific type with a specific color.
 * The type of the vehicle is determined by the provided type parameter.
 * If the type is not recognized, an IllegalArgumentException is thrown.
 *
 */
public class VehicleFactory {

    /**
     * Creates a Vehicle of a specific type with a specific color.
     * The type of the vehicle is determined by the provided type parameter.
     * If the type is not recognized, an IllegalArgumentException is thrown.
     *
     * @param type the type of the vehicle to create
     * @param color the color of the vehicle to create
     * @return the created vehicle
     * @throws IllegalArgumentException if the provided type is not recognized
     */
    public static Vehicle createVehicle(String type, String color) {
        Vehicle vehicle;
        switch (type.toLowerCase()) {
            case "car":
                vehicle = new Car();
                vehicle.setType("car");
                vehicle.setEngine("four-cylinder");
                vehicle.setWheels(4);
                break;
            case "motorcycle":
                vehicle = new Motorcycle();
                vehicle.setType("motorcycle");
                vehicle.setEngine("V-twins");
                vehicle.setWheels(2);
                break;
            default:
                throw new IllegalArgumentException("Invalid vehicle type");
        }
        vehicle.setColor(color);
        return vehicle;
    }
}