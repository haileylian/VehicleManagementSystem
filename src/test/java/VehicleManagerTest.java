import SimpleFactory.Car;
import SimpleFactory.Vehicle;
import Singleton.VehicleManager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for VehicleManager.
 * It tests the singleton instance and the addition and retrieval of vehicles.
 *
 */
public class VehicleManagerTest {

    /**
     * Test case for singleton instance.
     * It verifies that the VehicleManager is a singleton by checking that two instances refer to the same object.
     */
    @Test
    public void testSingletonInstance() {
        VehicleManager manager1 = VehicleManager.getInstance();
        VehicleManager manager2 = VehicleManager.getInstance();
        assertSame(manager1, manager2);
    }

    /**
     * Test case for adding and getting vehicles.
     * It verifies that a vehicle can be added to the VehicleManager and then retrieved.
     */
    @Test
    public void testAddAndGetVehicles() {
        VehicleManager manager = VehicleManager.getInstance();
        Vehicle car = new Car();
        car.setType("Car");
        car.setEngine("four-cylinder");
        car.setWheels(4);
        car.setColor("white");

        manager.addVehicle(car);
        assertTrue(manager.getVehicles().contains(car));
    }
}