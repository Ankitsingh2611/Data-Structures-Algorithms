//Write a program to print the factorial of a number by defining a method named 'Factorial'. 

public class Factorial {
    public static void main (String[] args) {
        Factorial obj = new Factorial();
        System.out.println("Factorial of 5 is: " + obj.calculateFactorial(5));
    }

    public int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}