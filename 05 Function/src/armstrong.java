import java.util.Scanner;

public class armstrong {
	
	public static void arms(int n) {
		int temp = n, rem;
		int sum = 0;
		while(temp>0) {
			rem = temp%10;
			sum = sum + (rem*rem*rem);
			temp = temp/10;
		}
		if(n==sum) {
			System.out.println("Armstrong");
		} else
			System.out.println(" not Armstrong");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		 arms(n); 
		

	}

}
