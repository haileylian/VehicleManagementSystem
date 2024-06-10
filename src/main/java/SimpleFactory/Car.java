/**
 * @author Yongxing Lian
 * @create 2024-06-09-4:53 p.m.
 */
public class Car extends Vehicle {
    public Car() {
        super();
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}