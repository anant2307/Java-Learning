package BasicOppsConcepts;

// Abstract class example
abstract class Animal {
    // final variable (constant)
    final String type = "Animal";

    // static method
    static void showCategory() {
        System.out.println("Category: Living Being");
    }

    // abstract method
    abstract void sound();
}

// Subclass implementing the abstract method
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class NonAccessModifier {
    public static void main(String[] args) {
        // Static method call without object
        Animal.showCategory();

        // Create Dog object
        Dog dog = new Dog();
        System.out.println("Type: " + dog.type); // final variable
        dog.sound(); // abstract method implemented
    }
}
