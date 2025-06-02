package BasicOppsConcepts;

// Step 1: Create custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // pass message to Exception class constructor
    }
}

public class CustomExceptionExample {

    // Step 2: Method that declares a checked exception using throws
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18. Not eligible to vote.");
        } else {
            System.out.println("Valid age. You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            // Step 3: Call method that may throw custom exception
            validateAge(16); // You can change the age to test
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling...");
    }
}
