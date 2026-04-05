package com.streams;
import java.util.Arrays;
import java.util.List;

public class SortingNum {
    public static void main(String[] args) {
        List<Integer> name = Arrays.asList(5,7,2,8,6,1);
        System.out.println(name.stream().sorted().toList());
    }
}
