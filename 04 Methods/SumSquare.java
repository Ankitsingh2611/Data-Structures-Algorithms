//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

public class SumSquare {
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        // Check if the given triplet is a Pythagorean triplet or not
        return (a * a + b * b == c * c) || (a * a
        + c * c == b * b) || (b * b + c * c == a
        * a);
        }
        }
 
