import java.util.Scanner;

public class armstrongbttwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int start = sc.nextInt();
        System.out.println("Enter the second number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are: ");
        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int sum = 0, rem;
        int temp = num;
        while (temp > 0) {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }
        return sum == num;
    }
}