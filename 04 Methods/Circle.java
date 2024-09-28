
import java.util.Scanner;

//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);  
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);
    }
    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
    
}
