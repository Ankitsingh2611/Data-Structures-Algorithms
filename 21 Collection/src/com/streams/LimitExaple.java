package com.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitExaple {
    public static void main(String[] args) {
        List<Integer> collect = Stream.iterate(1, x -> x+1).limit(100).collect(Collectors.toList());
        System.out.println(collect);
    }
}
