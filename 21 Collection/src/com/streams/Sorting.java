package com.streams;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sorting {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Ankit", "Ritika");
        name.stream().sorted((a,b)-> a.length()-b.length()).toList();
        System.out.println(name);
    }
}
