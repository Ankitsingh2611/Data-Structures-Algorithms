package com.ankit;

public class Ceiling {
    public static void main(String[] args) {
        int arr[] = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 10;
        int ans = ceil(arr, target);
        System.out.println(ans);
    }

    public static int ceil(int[] arr, int target) {
        if (target>arr[arr.length-1]){
            return -1;
        }
        int start =0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while (start<=end){

            int mid = start + (end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (target<arr[mid]){
                    end=mid-1;
                } else {
                    start= mid+1;
                }
            } else {
                if (target>arr[mid]){
                    end= mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return arr[start];
    }
}

