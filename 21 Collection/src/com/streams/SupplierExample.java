package com.streams;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> giveHelloWorld = () -> "Hello world";
        System.out.println(giveHelloWorld.get());
    }
}
