package com.streams;

import java.util.*;
import java.util.stream.Collectors;

public class SortByLength {
    public static void main(String args[]){
        List<String> names = Arrays.asList("Roshiiii","Ankit","Ritika","Shivam","Ketan","Sandy");
        List<String> sortedName = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedName);
    }

}
