import java.util.Arrays;

public class multidimensionArr{
   public static void main(String[] args) {
      //multi dimension array is array of arrays...each array element is an array it self like it is combination of multiple arrays

   //2D arr
   int[][] number=new int[2][2];
   number[0][0]=1;
   number[0][1]=1;
   number[1][0]=1;
   number[1][1]=1;
    //Display an array 
    for (int i = 0; i < number.length; i++) {
        for (int j = 0; j < number[i].length; j++) {
            System.out.print(number[i][j]);
            System.err.print(" ");
        }
        System.out.println();
         }
}
   }




