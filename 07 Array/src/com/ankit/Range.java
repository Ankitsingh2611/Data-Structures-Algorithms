package com.ankit;

public class Range {
    public static void main(String[] args) {
        int[] arr = {16, 26, 39, 55, 6};
        System.out.println(maxRange(arr, 1, 3));
    }

    static int maxRange(int[] arr, int start, int end) {

        // use
//        if(end>start){
//            return -1;
//        }
//        if(arr==null){
//            return -1;
//        }
//        if (arr.length ==0){
//            return -1;
//        }


        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
