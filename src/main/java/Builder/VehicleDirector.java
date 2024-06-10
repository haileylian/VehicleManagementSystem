package Builder;
import SimpleFactory.Vehicle;

/**
 * This class is responsible for directing the construction of a Vehicle.
 * It uses a VehicleBuilder to construct a Vehicle with the given parameters.
 *
 */
public class VehicleDirector {
    private VehicleBuilder builder;

    /**
     * Constructor for the VehicleDirector class.
     * Initializes the builder that will be used to construct the Vehicle.
     *
     * @param builder the builder that will be used to construct the Vehicle
     */
    public VehicleDirector(VehicleBuilder builder) {
        this.builder = builder;
    }

    /**
     * Constructs a Vehicle with the given parameters.
     * The construction is directed by the builder.
     *
     * @param type the type of the vehicle
     * @param engine the engine of the vehicle
     * @param wheels the number of wheels of the vehicle
     * @param color the color of the vehicle
     * @return the constructed vehicle
     */
    public Vehicle construct(String type, String engine, int wheels, String color) {
        return builder.buildEngine(engine)
                .buildType(type)
                .buildEngine(engine)
                .buildWheels(wheels)
                .buildColor(color)
                .getVehicle();
    }
}