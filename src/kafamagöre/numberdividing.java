package kafamagöre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class numberdividing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                // Ask for the first number
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                // Ask for the second number
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                // Perform division
                double result = num1 / num2;

                // Print the result
                System.out.println("The result is: " + result);

                // Break the loop if the division was successful
                break;

            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero. Please try again.");
                // Clear the scanner buffer
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter valid numbers. Please try again.");
                // Clear the scanner buffer
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                // Clear the scanner buffer
                scanner.nextLine();
            }
        }
        scanner.close();
    }

}
