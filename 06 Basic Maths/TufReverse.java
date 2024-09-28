import java.util.Scanner;

public class TufReverse {
    public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array");
    int revNum = 0;
    n = sc.nextInt();
    while(n>0){
        int ld = n%10;
        revNum = revNum*10 + ld;
        n = n/10;
    }
    System.out.println("Reverse of the number is: "+revNum);
    }
}
