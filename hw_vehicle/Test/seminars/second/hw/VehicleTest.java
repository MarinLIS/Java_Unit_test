package seminars.second.hw;


import org.junit.jupiter.api.Test;
import src.seminars.second.hw_vehicle.Car;
import src.seminars.second.hw_vehicle.Motorcycle;
import src.seminars.second.hw_vehicle.Vehicle;


import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testCarInstanceIsVehicle() {
        Vehicle car = new Car("Lada", "Grant", 2020);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void testCarHasFourWheels() {
        Car car = new Car("Lada", "Grant", 2020);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Honda", "BR", 2020);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void testCarSpeedAfterTestDrive() {
        Car car = new Car("Lada", "Grant", 2020);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void testMotorcycleSpeedAfterTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Honda", "BR", 2020);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void testCarSpeedAfterPark() {
        Car car = new Car("Lada", "Grant", 2020);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void testMotorcycleSpeedAfterPark() {
        Motorcycle motorcycle = new Motorcycle("Honda", "BR", 2020);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}