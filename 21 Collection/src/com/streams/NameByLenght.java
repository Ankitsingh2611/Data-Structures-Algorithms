package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameByLenght {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));
    }
}
