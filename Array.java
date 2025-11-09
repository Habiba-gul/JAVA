import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //we use arrays to store list of numbers records etc of same data type
        int[] Numbers=new int[6]; //new create obj of arr int and 6 is size

        Numbers[0]=2;
         Numbers[1]=7;
        Numbers[2]=8;
         Numbers[3]=8;
        Numbers[4]=7;
        // with this only address of arrays prints 
       //System.out.println(Numbers); 
       //to print array we use array package
      System.out.println( Arrays.toString(Numbers));
            //we can assign valuse to array at initializing stage
            int[] Arr ={1,3,7,9,3};
           
            System.out.println( Arr.length);
             Arrays.sort(Arr);  //sort is used to arrange num in assending order
            System.out.println(Arrays.toString(Arr));
          
            
            


    }
}
