package com.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SumValueMap {
    public static void main(String[] args) {
        Map<String , Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);
        System.out.println(items.values().stream().reduce(Integer::sum));
        System.out.println(items.values().stream().collect(Collectors.summarizingInt(x->x)));
    }
}
