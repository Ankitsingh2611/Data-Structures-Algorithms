import java.util.Scanner;

public class average {

	public static int batting(int n, Scanner sc) {
		int sum =0;
		for(int i = 1; i<=n; i++) {
			System.out.println("Enter score of " +i +"match");
	        int score = sc.nextInt();
	        sum = sum + score;
		}
		  return sum/n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of matches");
		int n = sc.nextInt();
		int average = batting(n, sc);
		System.out.println(average);
		
	}

}
