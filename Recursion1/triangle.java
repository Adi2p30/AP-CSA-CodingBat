package Recursion1;

public class triangle {
    public int triangle(int rows) {
        if (rows == 0){
          return 0;
        } else{
         return rows + triangle(rows-1);
        }
      }
      
}
