package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOpFilter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ankit", "Arpit", "Rahul", "Roshi", "Ritik");
      //  List<String> ans = list.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        Stream<String> filterStream = list.stream().filter(x -> x.startsWith("A"));
        long ans = list.stream().filter(x-> x.startsWith("A")).count();
        System.out.println(ans);
    }
}
