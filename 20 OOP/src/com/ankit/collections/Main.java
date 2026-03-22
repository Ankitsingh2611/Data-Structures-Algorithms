package com.ankit.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();

//        list2.add(34);
//        list2.add(78);
//        list2.add(55);
//        list2.add(89);
//        System.out.println(list2);

        List<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        System.out.println(vector);
    }
}
