import java.util.Scanner;

public class factorial {
	
	
	public static void series(int n) {
		  System.out.print("The divisors of " + n + " are: ");
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				 System.out.print(i + " ");
			}
		}
		 System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		series(n);
		
	}

}
