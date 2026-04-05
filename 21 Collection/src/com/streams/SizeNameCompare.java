package com.streams;

import java.util.Arrays;
import java.util.List;

public class SizeNameCompare {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ankit", "Arpit", "Ritika");
        System.out.println(names.stream().filter(x-> x.length()>5).toList());
    }
}
