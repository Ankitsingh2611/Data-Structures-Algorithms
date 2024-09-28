import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int i = 0;
        int n = str.length();
        int j = n-1;
        boolean isPalindrome = true;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}
