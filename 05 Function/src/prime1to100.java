import java.util.Scanner;

public class prime1to100 {
	
	  public static void main(String[] args) {
	        int start = 1;
	        int end = 100;
	        printPrimesInRange(start, end);
	    }

	    public static void printPrimesInRange(int start, int end) {
	        if (start > end) {
	            System.out.println("Invalid range.");
	            return;
	        }
	        for (int i = start; i <= end; i++) {
	            if (isPrime(i)) {
	                System.out.println(i);
	            }
	        }
	    }

	    private static boolean isPrime(int number) {
	        if (number <= 1) return false;
	        if (number == 2) return true; // 2 is the only even prime number
	        if (number % 2 == 0) return false; // Eliminate even numbers greater than 2

	        // Check for factors from 3 up to the square root of the number
	        for (int i = 3; i * i <= number; i += 2) {
	            if (number % i == 0) return false;
	        }
	        return true;
	    }
	}