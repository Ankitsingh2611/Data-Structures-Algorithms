//package com.company;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        // write your code here
        int ans = sum2();
        System.out.println(ans);

        int ans2 = sum3(20,30);
        System.out.println(ans2);
    }

    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }

    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter np 1");
        int num1 = sc.nextInt();
        System.out.println("Enter np 2");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }


    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter np 1");
        int num1 = sc.nextInt();
        System.out.println("Enter np 2");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
