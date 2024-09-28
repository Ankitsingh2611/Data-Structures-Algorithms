//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class EvenOddChecker {

    // Function to check if a number is even or odd
    static java.lang.String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "The number is even.";
        } else {
            return "The number is odd.";
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        // Call the checkEvenOdd function and print the result
        java.lang.String result = checkEvenOdd(num);
        System.out.println(result);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

