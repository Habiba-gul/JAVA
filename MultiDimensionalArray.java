import java.util.Arrays;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        //multi-dimension is array of arrays
        int[][] numbers=new int[3][2];
        numbers[0][0]=1;
         numbers[0][1]=2;
          numbers[1][0]=3;
           numbers[1][1]=1;
           //it gives ref address becouse in two dimesion we dont use this state
          // System.out.print(Arrays.toString(numbers));

          //we use deepto string for 2 dimensional array
          System.out.println(Arrays.deepToString(numbers));

          //compile time intialaization
          int[][] Arr={{1,2,3},{4,5,6},{5,3,8}};
          System.out.println(Arrays.deepToString(Arr));
          //DISPLAY 2D ARRAY USINF FOR
          int[][] scores={{1,2,3},{4,5,6},{6,7,8}};
          for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j <scores[i].length; j++) {
                System.out.print(scores[i][j]);
            }
            System.out.println();
          }

    }
    
}
