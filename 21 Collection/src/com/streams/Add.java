package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Add {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());
    }
}
