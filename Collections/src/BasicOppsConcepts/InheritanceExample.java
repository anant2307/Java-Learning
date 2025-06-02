package BasicOppsConcepts;

// Superclass
class Employee {
    int empId;
    String name;

    // Constructor
    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
        System.out.println("Employee constructor called");
    }

    // Method to display employee info
    void displayInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
    }
}

// Subclass
class Manager extends Employee {
    String department;

    // Constructor
    Manager(int empId, String name, String department) {
        super(empId, name); // Call Employee constructor
        this.department = department;
        System.out.println("Manager constructor called");
    }

    // Method to display manager info
    void displayDetails() {
        displayInfo(); // inherited method
        System.out.println("Department: " + department);
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Manager mgr = new Manager(101, "Alice", "IT");
        mgr.displayDetails();
    }
}
