//package com.company;

import java.util.Scanner;

public class String {
    public static void main(String[] args) {
//        java.lang.String message = greet();
//        System.out.println(message);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        java.lang.String name = sc.next();
        java.lang.String personalised = myGreet(Integer.parseInt(name));
        System.out.println(personalised);
    }

     static java.lang.String myGreet(int name) {
        java.lang.String message = "Hello" +name;
        return message;
    }

    static java.lang.String greet(){
        java.lang.String greeting = "Hello Ankit";
        return greeting;
    }
}
