import java.util.Scanner;

public class sumDigit {

	public static int  sumDigit(int n) {

        int temp = n;
        int sum = 0;
        while(temp>0){
          int  rem = temp%10;
          temp = temp/10;
            sum = sum + rem;
        }
        return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no you want to add:");
        int n = sc.nextInt();
        int sum =  sumDigit(n);
        System.out.print(sum);

	}

}
