/**
 * @author Yongxing Lian
 * @create 2024-06-08-7:49 p.m.
 */
public class CarBuilder implements VehicleBuilder {
    private Vehicle vehicle;

    public CarBuilder() {
        this.vehicle = new Car();
    }

    public VehicleBuilder buildEngine(String engine) {
        vehicle.setEngine(engine);
        return this;
    }

    public VehicleBuilder buildWheels(int wheels) {
        vehicle.setWheels(wheels);
        return this;
    }

    public VehicleBuilder buildDoors(int doors) {
        vehicle.setDoors(doors);
        return this;
    }

    public VehicleBuilder buildSeats(int seats) {
        vehicle.setSeats(seats);
        return this;
    }

    public VehicleBuilder buildTransmission(String transmission) {
        vehicle.setTransmission(transmission);
        return this;
    }

    public VehicleBuilder buildColor(String color) {
        vehicle.setColor(color);
        return this;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }
}