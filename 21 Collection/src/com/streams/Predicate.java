package com.streams;

public class Predicate {
    public static void main(String[] args) {
        java.util.function.Predicate<String> isWordStartingWithA = x -> x.startsWith("A");
        java.util.function.Predicate<String> isWordEndingWitht = x -> x.endsWith("t");

        java.util.function.Predicate<String> and = isWordStartingWithA.and(isWordEndingWitht);
       // System.out.println(isWordStartingWithA.test("Ankit"));
        System.out.println(and.test("Ankit"));
    }
}
