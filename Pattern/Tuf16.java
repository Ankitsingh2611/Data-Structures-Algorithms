/*
 A 
B B
C C C
D D D D
E E E E E
 */



public class Tuf16 {
    
    static void pattern16(int N)
    {
         
          // Outer loop for the number of rows.
          for(int i=0;i<N;i++){
              
              
              for(int j=0;j<=i;j++){
                  
                  // same char which is defined 
                  // is to be printed i times in that row.
                  System.out.print((char)((int)('A'+i)) + " ");
                  
              }
              // As soon as the letters for each iteration are printed, we move to the
              // next row and give a line break otherwise all letters
              // would get printed in 1 line.
              System.out.println();
             
          }
    }
    
        public static void main(String[] args) {
            
            // Here, we have taken the value of N as 5.
            // We can also take input from the user.
            int N = 5;
            pattern16(N);
        }
    }

