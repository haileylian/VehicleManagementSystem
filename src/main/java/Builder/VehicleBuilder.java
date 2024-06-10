/**
 * @author Yongxing Lian
 * @create 2024-06-08-7:48 p.m.
 */
public interface VehicleBuilder {
    VehicleBuilder buildEngine(String engine);
    VehicleBuilder buildWheels(int wheels);
    VehicleBuilder buildDoors(int doors);
    VehicleBuilder buildSeats(int seats);
    VehicleBuilder buildTransmission(String transmission);
    VehicleBuilder buildColor(String color);
    Vehicles getVehicle();
}