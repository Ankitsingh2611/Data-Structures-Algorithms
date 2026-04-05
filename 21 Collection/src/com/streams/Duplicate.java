package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        List<String> Fruits = Arrays.asList("Apple", "Banana", "Cherry","Apple", "Orange", "Banana", "Apple");
        System.out.println(Fruits.stream().collect(Collectors.toMap(k->k, v->1,(x,y)->x+y)));
    }
}
