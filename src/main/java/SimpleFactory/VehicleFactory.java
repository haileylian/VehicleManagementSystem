import Builder.CarBuilder;
import Builder.MotorcycleBuilder;
import Builder.VehicleBuilder;
import Builder.VehicleDirector;

/**
 * @author Yongxing Lian
 * @create 2024-06-08-7:49 p.m.
 */
public class VehicleFactory {
    public static Vehicles createVehicle(String type) {
        VehicleBuilder builder;
        switch (type.toLowerCase()) {
            case "car":
                builder = new CarBuilder();
                break;
            case "motorcycle":
                builder = new MotorcycleBuilder();
                break;
            default:
                throw new IllegalArgumentException("Unknown vehicle type");
        }
        VehicleDirector director = new VehicleDirector(builder);
        return director.construct();
    }
}