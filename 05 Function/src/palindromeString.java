import java.util.Scanner;

public class palindromeString {

	public static boolean pstr(String str) {
		int i = 0;
		int n = str.length();
		int j = n-1;
		boolean isPalindrome= true;
		while(i<j) {
			if(str.charAt(i)!= str.charAt(j)) {
				isPalindrome= false;
				break;
			}
			i++;
			j--;
		}
		return isPalindrome;
	}
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter");
		 String str = sc.next();
		 if (pstr(str))
	        {
	            System.out.println("Palindrome");
	        }
	        else
	        {
	            System.out.println("Not a palindrome");
	        }
	 }
}
