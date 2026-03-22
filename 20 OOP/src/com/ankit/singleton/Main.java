package com.ankit.singleton;

import com.ankit.access.A;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // all 3 ref variable are pointing to just one object

        A a = new A(10, "Ankit");
        a.getNum();
    }
}
