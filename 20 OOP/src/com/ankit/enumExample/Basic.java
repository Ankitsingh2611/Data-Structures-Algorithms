package com.ankit.enumExample;

public class Basic implements A{
    @Override
    public void hello() {
        System.out.println("Hey how are you");
    }

    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // thses are enum constants
        //public, static and final
        //since its final we cant create enums
        // type is week


        Week() {
            System.out.println("Constructor called for " + this);
        }
        //this is not public or protected, only private or default
        //why? we dont want to create new objects
        //this is not the enum concept, thats why

        // initially: public static final week monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week = Week.Monday;
     //   week.hello();
        System.out.println(Week.valueOf("Monday"));
//        for (Week day:
//             Week.values()) {
//            System.out.println(day);
//        }
        System.out.println(week.ordinal());
    }
}
