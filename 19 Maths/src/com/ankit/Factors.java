package com.ankit;

import java.util.ArrayList;

public class Factors {

    public static void main(String[] args) {
	// write your code here
     //   factors1(20);
      //  factors2(36);
        factors3(20);
    }
    // o(n)
    static void factors1(int n){
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                System.out.println(i + " ");
            }
        }
    }
    // o(sqrt(n))
    static void factors2(int n){
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if (n%i==0){
                if (n/i==i){
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }
    //both time and space with O(sqrt(n))
    static void factors3(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < Math.sqrt(n) ; i++) {
            if (n % i ==0){
                if (n/i == i){
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
