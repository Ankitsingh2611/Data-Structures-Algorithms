import java.util.Scanner;

public class leapYear {

	
	public static void leapY(int n) {
		if( n%4==0 && n%100!=0 || n%400==0) {
			System.out.println("leap Year");
		} else {
			System.out.println("Not leap Year");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = sc.nextInt();
		leapY(year);
	}

}
