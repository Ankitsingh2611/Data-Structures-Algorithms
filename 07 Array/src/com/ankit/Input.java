package com.ankit;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of primitive
        int[] arr = new int[5];
        arr[0] = 26;
        arr[1] = 11;
        arr[2] = 13;
        arr[3] = 5;
        arr[4] = 226;
        System.out.println(arr[4]);


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

       // System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }






        // Array of objects
//        String[] str = new String[4];
//        for(int i=0; i<= str.length; i++){
//            str[i] = sc.next();
//        }
//        System.out.println(Arrays.toString(str));

        //modify
//        str[1] = "Ankit";
//        System.out.println(Arrays.toString(str));
    }

}
