package kafamagöre;

import java.util.Scanner;

public class max {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        // Initialize maxNumber with the minimum possible integer value
        int maxNumber = Integer.MIN_VALUE;

        // Read 5 numbers from the user
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int currentNumber = scanner.nextInt();

            // Compare with the current maxNumber and update if necessary
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }

        // Print the maximum number
        System.out.println("The maximum number is: " + maxNumber);

        // Close the scanner
        scanner.close();
    }


}
