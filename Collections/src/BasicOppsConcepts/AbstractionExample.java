package BasicOppsConcepts;

// Abstract class
abstract class Vehicle {
    String brand = "Generic Brand";

    // Abstract method (no body)
    abstract void startEngine();

    // Non-abstract method
    void displayBrand() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

// Subclass that implements abstract method
class Car extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Car engine started with key ignition.");
    }
}

// Main class
public class AbstractionExample {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle(); ❌ Not allowed - abstract class can't be instantiated

        Vehicle myCar = new Car(); // Allowed - Car is concrete
        myCar.displayBrand();      // Calls non-abstract method
        myCar.startEngine();       // Calls overridden abstract method
    }
}
