/**
 * @author Yongxing Lian
 * @create 2024-06-09-4:55 p.m.
 */
public class Motorcycle extends Vehicle {
    public Motorcycle() {
        super();
    }

    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }
}