package com.ankit.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(4.6, 7.9, 9.9);
//        // Box box2 = new Box(box1);
//        System.out.println(box1.h + " " + box1.l + " " + box1.w);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box3.h + " " + box3.weight);

//          Box box5 = new BoxWeight(2,3, 4, 1);
//        System.out.println(box5.w);

        // there are many variable in both parent and chld classes
        // you are given access to variable that are in ref type i.e. BoxWeight
        // hence, you should access to weight variable
        // this also means that the one you are trying to access shoud be initalised
        // but here, when the obj itself is of type parent class, how will we call constructor
        // ths is why error
//        BoxWeight box6 = new Box(2, 3, 4);
//        System.out.println(box6);

        Box.greeting();

        BoxWeight box = new BoxWeight();
        BoxWeight.greeting(); // you can inherit but cannot override

       // BoxPrice box = new BoxPrice(5, 6, 200);
    }
}
