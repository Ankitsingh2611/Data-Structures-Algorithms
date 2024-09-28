public class TufArmstrong {
    public static void main(String[] args) {
        int n = 153;
        int dump = n;
        int sum = 0;
        while(n>0){
            int ld = n%10;
            sum = sum + (int)Math.pow(ld,3);
            n = n/10;

        }
        if(sum == dump){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not a Armstrong Number");
            }
    }
}
