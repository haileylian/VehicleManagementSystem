import java.util.ArrayList;

/**
 * @author Yongxing Lian
 * @create 2024-06-09-4:14 p.m.
 */

public class MotorcycleBuilder implements VehicleBuilder {
    private Vehicle vehicle;

    public MotorcycleBuilder() {
        this.vehicle = new Motorcycle();
    }

    @Override
    public void buildEngine() {
        vehicle.setEngine("Motorcycle engine");
    }

    @Override
    public void buildWheels() {
        vehicle.setWheels(2);
    }

    @Override
    public Vehicle getVehicle() {
        return this.vehicle;
    }
}