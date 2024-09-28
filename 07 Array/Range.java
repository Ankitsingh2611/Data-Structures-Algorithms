public class Range {
    public static void main(String[] args) {
        int[] arr = {16, 26, 39, 55, 6};
        System.out.println(range(arr, 1,3));
    }
    static int range(int[] arr, int start, int end){
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
