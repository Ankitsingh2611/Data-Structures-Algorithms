package com.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountWordOccur {
    public static void main(String[] args) {
        String Sentence = "hello world hello java world";
        System.out.println(Arrays.stream(Sentence.split(" ")).collect(Collectors.groupingBy(x->x, Collectors.counting())));
    }
}
