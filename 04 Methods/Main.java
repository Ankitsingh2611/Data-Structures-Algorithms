// package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        sum();
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

/*
return_type name(argument){
     //body
     return statement;
     }
 */