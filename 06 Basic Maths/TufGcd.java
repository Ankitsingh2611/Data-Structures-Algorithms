public class TufGcd {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.println("GCD is: " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        while(a > 0 && b > 0){
            if(a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
            if(a == 0){
                return b;
            }
            if(b == 0){
                return a;
            }
        }
        return a == 0 ? b : a;
    }
}