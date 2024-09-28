package com.ankit;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);
//        list.add(69);
//        list.add(26);
//        list.add(13);
//        list.add(16);
//        list.add(3);
//        list.add(9);
//        list.add(15);
//        list.add(29);
//        list.add(55);
//        list.add(45);
//        list.add(64);
//        list.add(11);
//        list.add(22);
//        list.add(69);
//        list.add(26);
//        list.add(13);
//        list.add(16);
//        list.add(3);
//        list.add(9);
//        list.add(15);
//        list.add(29);
//        list.add(55);
//        list.add(45);
//        list.add(64);
//        list.add(11);
//        list.add(22);

       // System.out.println(list.contains(26));


//        System.out.println(list);
//        list.set(0, 99);
//        list.remove(10);
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i));
        }
    }
}
