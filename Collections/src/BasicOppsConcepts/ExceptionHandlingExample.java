package BasicOppsConcepts;

import java.util.Scanner;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input from user
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Risky code: division
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Some other error occurred: " + e.getMessage());
        } finally {
            System.out.println("This block always executes (finally).");
            scanner.close();
        }
    }

    // Method that throws exception
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Denominator is zero");
        }
        return a / b;
    }
}

