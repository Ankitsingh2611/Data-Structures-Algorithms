// package com.company;

import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] nums) {
        nums[0]=99;
    }


}
