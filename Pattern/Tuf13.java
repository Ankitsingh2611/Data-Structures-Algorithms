/*
1
2  3
4  5  6
7  8  9  10
11  12  13  14  15
 */



public class Tuf13 {
    
    static void pattern13(int N)
    {
         // starting number.
         int num =1;
          
          // Outer loop for the number of rows.
          for(int i=1;i<=N;i++){
              
              // Inner loop will loop for i times and
              // print numbers increasing by 1 each time.
              for(int j=1;j<=i;j++){
                  System.out.print(num + " ");
                  num =num+1;
              }
              // As soon as the numbers for each iteration are printed, we move to the
              // next row and give a line break otherwise all numbers
              // would get printed in 1 line.
              System.out.println();
             
          }
    }
    
        public static void main(String[] args) {
            
            // Here, we have taken the value of N as 5.
            // We can also take input from the user.
            int N = 5;
            pattern13(N);
        }
    }