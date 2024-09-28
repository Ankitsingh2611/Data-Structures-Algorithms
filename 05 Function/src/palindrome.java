import java.util.Scanner;

public class palindrome {
 
	
	public static boolean pal(int n) {
		int sum = 0, rem;
		int temp=n;
		while(temp>0) {
			rem = temp%10;
			sum = sum*10 + rem;
			temp =temp/10;
		}
		return n == sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int n= sc.nextInt();
     if(pal(n))
     {
			System.out.println("Polinomial");
		} else {
			System.out.println("Not Polinomial");
		}
	}

}
