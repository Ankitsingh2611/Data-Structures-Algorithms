import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int num = n;

            int sum = 0, rem;
            int temp = num;
            while (temp > 0) {
                rem = temp % 10;
                sum = sum + (rem * rem * rem);
                temp = temp / 10;
            }
        

        if (n == sum) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
        
        sc.close();
    }
}
