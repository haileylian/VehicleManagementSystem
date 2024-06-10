import SimpleFactory.Vehicle;
import SimpleFactory.VehicleFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class for VehicleFactory.
 * It tests the creation of different types of vehicles and the handling of invalid vehicle types.
 *
 */
public class VehicleFactoryTest {

    /**
     * Test case for creating a car.
     * It verifies that the car is created with the correct attributes.
     */
    @Test
    public void testCreateCar() {
        Vehicle car = VehicleFactory.createVehicle("car", "red");
        assertEquals("car", car.getType());
        assertEquals("four-cylinder", car.getEngine());
        assertEquals(4, car.getWheels());
        assertEquals("red", car.getColor());
    }

    /**
     * Test case for creating a motorcycle.
     * It verifies that the motorcycle is created with the correct attributes.
     */
    @Test
    public void testCreateMotorcycle() {
        Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle", "blue");
        assertEquals("motorcycle", motorcycle.getType());
        assertEquals("V-twins", motorcycle.getEngine());
        assertEquals(2, motorcycle.getWheels());
        assertEquals("blue", motorcycle.getColor());
    }

    /**
     * Test case for creating an invalid vehicle type.
     * It verifies that an IllegalArgumentException is thrown when an invalid vehicle type is provided.
     */
    @Test
    public void testCreateInvalidVehicle() {
        assertThrows(IllegalArgumentException.class, () -> {
            VehicleFactory.createVehicle("invalid", "red");
        });
    }
}