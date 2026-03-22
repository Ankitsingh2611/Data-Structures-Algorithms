package com.ankit.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;
//    double weight;

    static void greeting(){
        System.out.println("Hey, I am in box class. Greetings!");
    }

    Box () {

      //  super(); object class

        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //cube
    Box (double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the Box");
    }
}
