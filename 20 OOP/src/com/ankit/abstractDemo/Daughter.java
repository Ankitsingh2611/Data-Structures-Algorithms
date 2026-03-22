package com.ankit.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(16);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am going to be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Iron Man");
    }
}
