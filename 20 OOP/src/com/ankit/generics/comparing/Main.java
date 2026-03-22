package com.ankit.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student ankit = new Student(56, 89.5f);
        Student rahul = new Student(69, 75.55f);
        Student arpit = new Student(2, 78.55f);
        Student karan = new Student(65, 76.55f);
        Student sachin = new Student(99, 85.55f);

        Student[] list = {ankit, rahul, arpit, karan, sachin};
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks - o2.marks);
//            }
//        });

 //       Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));

        if (ankit.compareTo(rahul) <0){
            System.out.println(ankit.compareTo(rahul));
            System.out.println("Rahul has more marks");
        }
    }
}
