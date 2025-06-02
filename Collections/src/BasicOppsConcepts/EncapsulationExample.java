package BasicOppsConcepts;

// Encapsulated class
class Student {
    // Private data members (data hiding)
    private String name;
    private int age;

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Must be positive.");
        }
    }
}

// Main class to use Student
public class EncapsulationExample {
    public static void main(String[] args) {
        Student student = new Student();

        // Setting values using setters
        student.setName("Alice");
        student.setAge(20);

        // Getting values using getters
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}
