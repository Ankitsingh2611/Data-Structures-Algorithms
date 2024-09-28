//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();
        System.out.println(isEligibleToVote(age) ? "You are eligible to vote." : "You are not eligible to vote.");
    }
    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }
}
