package Singleton;

import SimpleFactory.Vehicle; /**
 * @author Yongxing Lian
 * @create 2024-06-10-2:15 a.m.
 */
package Singleton;

import SimpleFactory.Vehicle;

public class VehicleDisplay {

    public void displayVehicles() {
        VehicleManager manager = VehicleManager.getInstance();
        if (manager.getVehicles().isEmpty()) {
            System.out.println("No vehicles added to the management system.");
            return;
        }

        System.out.println("Vehicles added to management system:");
        for (Vehicle v : manager.getVehicles()) {
            System.out.println(v);
        }
    }
}