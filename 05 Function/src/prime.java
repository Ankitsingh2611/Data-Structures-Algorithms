import java.util.Scanner;

public class prime {

	
	public static boolean isPrime(int n) {
		boolean isPrime=true;
		for(int i = 2; i<=n/2;i++) {
		if(n%i==0) {
		  return false;
		}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(isPrime(n)) {
        	  System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
        }
	}


