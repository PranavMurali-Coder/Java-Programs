package Super;

class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
        super.drive(); // Call the drive() method of the superclass
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive(); // Calls the overridden method in Car and then the superclass method
    }
}
