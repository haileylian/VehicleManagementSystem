import Builder.VehicleBuilder;

/**
 * @author Yongxing Lian
 * @create 2024-06-08-7:49 p.m.
 */
public class VehicleDirector {
    private VehicleBuilder builder;

    public VehicleDirector(VehicleBuilder builder) {
        this.builder = builder;
    }

    public Vehicles construct() {
        builder.buildEngine();
        builder.buildWheels();
        return builder.getVehicle();
    }
}