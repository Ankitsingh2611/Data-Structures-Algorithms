package com.ankit.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(25);
        son.career();

        Daughter daughter = new Daughter(22);
        daughter.career();

        Parent.hello();
    }
}
