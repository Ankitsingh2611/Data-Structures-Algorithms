package com.ankit.properties.polymorphism;

public class Circle extends Shapes{

    // this will run when the obj of circle created
    //hence it is overriding the parent method
    @Override  // this is called annotation
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
