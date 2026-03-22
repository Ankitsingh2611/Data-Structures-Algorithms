package com.ankit.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ankit = new Human(26, "Ankit");
//        Human twin = new Human(ankit);

        Human twin = (Human) ankit.clone();
        System.out.println(twin.age + " "+ twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(ankit.arr));
    }
}
