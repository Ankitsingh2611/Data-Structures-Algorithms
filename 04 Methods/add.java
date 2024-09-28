
import java.util.Scanner;

//Write a program to print the sum of two numbers entered by user by defining your own method.

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum of two numbers is: "+add(a,b));
    }
    public static int add(int a,int b)
    {
        return a+b;
        
    }
    
}
