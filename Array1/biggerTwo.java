package Array1;

public class biggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int sum1 = 0;
        int sum2 = 0;
        sum1 = a[0]+a[1];
        sum2 = b[0]+b[1];
        if (sum1>=sum2){
          return a;
        }
        else{
          return b;
        }
      }
      
}
