package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameStartWithA {
    public static void main(String[] args) {
        //Find list of employees whose name starts with alphabet A
        List<String> names = Arrays.asList("Ankit", "Arpit", "Roshi","Ritik", "Shivam");
        List<String> a = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(a);
    }
}
