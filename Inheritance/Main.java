package Inheritance;

class Vehicle1 {
    public void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike1 extends Vehicle1 {
    @Override
    public void run() {
        System.out.println("Bike is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle1 obj = new Vehicle1();
        Bike1 obj1 = new Bike1();
        obj.run();
        obj1.run();
    }

}
