package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToMap {
    public static void main(String[] args) {
        List<String> Fruits = Arrays.asList("Apple", "Banana", "Cherry");
        //System.out.println(Fruits.stream().collect(Collectors.toMap(x->x.length)));
    }
}
