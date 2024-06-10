/**
 * @author Yongxing Lian
 * @create 2024-06-08-7:47 p.m.
 */

//Product class

public abstract class Vehicle {
    private String engine;
    private int wheels;
    private int doors;
    private int seats;
    private String transmission;
    private String color;


    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // Abstract methods that each vehicle should implement
    public abstract void start();
    public abstract void stop();
}