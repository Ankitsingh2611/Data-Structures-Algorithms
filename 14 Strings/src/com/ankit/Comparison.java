package com.ankit;

public class Comparison {
    public static void main(String[] args) {
        String a = "Ankit";
        String b = "Ankit";
        String c = a;
//        System.out.println(c == a);
        // ==
//        System.out.println(a == b);

        String name1 = new String("Ankit");
        String name2 = new String("Ankit");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

    }
}