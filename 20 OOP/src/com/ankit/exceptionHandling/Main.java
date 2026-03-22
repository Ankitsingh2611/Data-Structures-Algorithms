package com.ankit.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            //          int c = a/b;
            //           divide(a,b);
            //           throw new Exception("Just for fun");
            //      } catch (Exception e){

            String name = "Ankit";
            if (name.equals("Ankit")) {
                throw new MyException("name is Ankit");
            }
        } catch (MyException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Normal Exception");
        } finally {
            System.out.println("This will always execute");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
