import java.util.Scanner;

public class fabonnacci {

	
	public static int series(int n) {
		int a=0, b= 1;
		 
		System.out.print(a + " " +b + " ");
		for (int i = 3; i <= n; i++) {
		int c= a+b;
		System.out.print(c + " ");
		a= b;
		b= c;
		
		
	}
		 return a+b;	
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		series(n);
	}

}
