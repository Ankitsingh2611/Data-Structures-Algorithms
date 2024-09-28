package com.ankit;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7 , 3, 14, 28};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
    static int min(int[] arr){
        int min =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    static int max(int[] arr){
    int max =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
