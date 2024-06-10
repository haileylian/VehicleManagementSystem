import Builder.CarBuilder;
import Builder.MotorcycleBuilder;
import Builder.VehicleBuilder;
import Builder.VehicleDirector;
import SimpleFactory.Vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for VehicleDirector.
 * It tests the construction of different types of vehicles.
 *
 */
public class VehicleDirectorTest {

    /**
     * Test case for constructing a car.
     * It verifies that the car is constructed with the correct attributes.
     */
    @Test
    public void testConstructCar() {
        VehicleBuilder builder = new CarBuilder();
        VehicleDirector director = new VehicleDirector(builder);
        Vehicle car = director.construct("Car", "four-cylinder", 4, "white");

        assertEquals("Car", car.getType());
        assertEquals("four-cylinder", car.getEngine());
        assertEquals(4, car.getWheels());
        assertEquals("white", car.getColor());
    }

    /**
     * Test case for constructing a motorcycle.
     * It verifies that the motorcycle is constructed with the correct attributes.
     */
    @Test
    public void testConstructMotorcycle() {
        VehicleBuilder builder = new MotorcycleBuilder();
        VehicleDirector director = new VehicleDirector(builder);
        Vehicle motorcycle = director.construct("Motorcycle", "V-twins", 2, "black");

        assertEquals("motorcycle", motorcycle.getType());
        assertEquals("V-twins", motorcycle.getEngine());
        assertEquals(2, motorcycle.getWheels());
        assertEquals("black", motorcycle.getColor());
    }
}