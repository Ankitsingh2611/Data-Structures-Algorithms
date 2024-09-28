//package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 5, 55, 6, 4);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
