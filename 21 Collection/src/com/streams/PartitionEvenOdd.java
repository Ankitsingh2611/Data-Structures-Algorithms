package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionEvenOdd {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);
        System.out.println(l1.stream().collect(Collectors.partitioningBy(x->x%2==0)));
    }
}
