import java.util.*;
public class armsbttwo {
	
	public static boolean armstrong(int num) {
		
		int rem, sum =0;
		int temp = num;
		while(temp>0) {
			rem = temp%10;
			sum = sum + (rem*rem*rem);
			temp = temp/10;
		}
		return num==sum;
	
		
		
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting number");
		int start = sc.nextInt();
		System.out.println("Enter Ending number");
		int end = sc.nextInt();
		System.out.println("Armstrong number beetween "+start +" to " +end);
		for(int num = start; num<=end; num++) {
		if(armstrong(num)) {
			System.out.print(num+" ");
		}
		}
	}

}
