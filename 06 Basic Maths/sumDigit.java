import java.util.*;
public class sumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no you want to add:");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp>0){
          int  rem = temp%10;
          temp = temp/10;
            sum = sum + rem;
        }
        System.out.println(sum);
    }
}
