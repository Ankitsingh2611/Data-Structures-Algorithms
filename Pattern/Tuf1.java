/*
      *.*.*.*
      *.*.*.*
      *.*.*.*
      *.*.*.*
 */




  public class Tuf1 {
      public static void print1(int n) {
          for (int i = 0; i < n; i++) {
              for (int j = 0; j < n; j++) {
                  System.out.print("* ");
              }
              System.out.println();
          }
      }
  
      public static void main(String[] args) {
          int n = 5; // assign a value to n
          System.out.println("Printing a " + n + "x" + n + " square:");
          print1(n);
      }
  }