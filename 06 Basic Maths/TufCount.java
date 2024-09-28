public class TufCount {
    public static void main(String[] args) {
        System.out.println(count(12345)); // prints 5
    }

    public static int count(int n){
        int cnt = 0;
        while(n > 0){
            int lastDigit = n % 10;
            cnt = cnt + 1;
            n = n / 10;
        }
        return cnt;
    }
}