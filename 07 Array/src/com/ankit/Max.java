package com.ankit;

public class Max {
    public static void main(String[] args) {
        int[] arr = {16, 26, 39 , 55, 6};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}