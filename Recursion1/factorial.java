package Recursion1;

public class factorial {
    public int factorial(int n) {
        if (n == 1){
          return 1;
        } 
       return n * factorial(n-1);
     }
     
}
