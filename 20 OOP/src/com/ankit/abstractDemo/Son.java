package com.ankit.abstractDemo;

public class Son extends Parent{

    public Son(int age) {
        super(16);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am going to be a Coder");
    }

    @Override
    void partner() {
        System.out.println("I love Paper potts");
    }
}
