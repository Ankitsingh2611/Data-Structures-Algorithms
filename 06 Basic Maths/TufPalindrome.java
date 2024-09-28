import java.util.Scanner;

public class TufPalindrome {  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int revNum = 0;
    n = sc.nextInt();
    int dump = n;
    while(n>0){
        int ld = n%10;
        revNum = revNum*10 + ld;
        n = n/10;
    }
    if(dump==revNum){
        System.out.println("The number is a palindrome");
    }
    else {
        System.out.println("The number is not a palindrome");
    }
   
 
    }
}
