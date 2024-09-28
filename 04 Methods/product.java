
import java.util.Scanner;

//Define a method that returns the product of two numbers entered by user.

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Product is" +Product(a,b));
    }
    public static int Product(int a, int b) {
        return a * b;
}
}
