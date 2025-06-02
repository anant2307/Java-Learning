package BasicOppsConcepts;
import java.util.Scanner;



// Superclass
class Shape {
    public void area() {
        System.out.println("Area calculation not defined for generic shape.");
    }
}

// Subclass 1
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Subclass 2
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Subclass 3
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }
}

// Main class
public class PolymorphismExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shape shape;

        System.out.println("Choose Shape: 1. Circle  2. Rectangle  3. Triangle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius); // Runtime polymorphism
                break;

            case 2:
                System.out.print("Enter length and width: ");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width); // Runtime polymorphism
                break;

            case 3:
                System.out.print("Enter base and height: ");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                shape = new Triangle(base, height); // Runtime polymorphism
                break;

            default:
                shape = new Shape();
                break;
        }

        System.out.println();
        shape.area(); // Calls the overridden method
        scanner.close();
    }
}
