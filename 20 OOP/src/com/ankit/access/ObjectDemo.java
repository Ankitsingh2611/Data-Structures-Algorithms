package com.ankit.access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
      //  return super.hashCode();
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(26, 98.5f);
        ObjectDemo obj2 = new ObjectDemo(45, 99.5f);

//        if (obj < obj2){
//            System.out.println("obj is less than obj2");
//        }
        if (obj == obj2){
            System.out.println("obj is equal to obj2");
        }
        if (obj.equals(obj2)){
            System.out.println("obj is equal to obj2");
        }

        System.out.println(obj2.getClass().getName());

//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
