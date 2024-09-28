import java.util.Scanner;

public class allSum {

	
	public static int sum(int n) {
		int sum =0;
		for(int i=1; i<=n; i++) {
			 sum = sum+i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter n no");
		int n = sc.nextInt();
		int sum = sum(n);
		System.out.println(sum);
	}

}
