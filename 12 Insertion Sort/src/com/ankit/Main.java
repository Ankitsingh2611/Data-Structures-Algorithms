package com.ankit;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {14, -5, 1, 22, -13, 0};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        //for (int i = 0; i <= arr.length -2; i++)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j>0; j--){
                if (arr[j]< arr[j-1]){
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}