import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
       /* //we use arrays to store list of numbers records etc of same data type
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
           
         System.out.println( Arr.length); //to print array lenght
         Arrays.sort(Arr);  //sort is used to arrange num in assending order
             System.out.println(Arrays.toString(Arr));*/ 
          
            
           /*  //3 WAYS TO DECLARE AND MEMORY ALLOCATION OF AN ARRAY

            //method 1
            int[] marks;
            marks= new int[5];
            marks[0]=5;
            marks[1]=0;
            marks[2]=1;
            marks[3]=2;
            marks[4]=3;
             System.out.println(Arrays.toString(marks));
             //to print array lenght
             System.out.println("array lenght is: "+marks.length);

             //method2

        int[] Numbers=new int[6]; 

            Numbers[0]=2;
            Numbers[1]=7;
            Numbers[2]=8;
            Numbers[3]=8;
            Numbers[4]=7;
       
        System.out.println(Arrays.toString(Numbers));
        //to print array lenght
         System.out.println("array lenght is: "+Numbers.length);

        //method 3
        int[] scores={1,2,3,4};
        System.out.println(Arrays.toString(scores));
        //to print array lenght
         System.out.println("array lenght is: "+scores.length);*/

         //differ data type
         float[] num={98.6f,67.5f,78.4f};
         System.out.println(num.length);
         System.out.println(Arrays.toString(num)); 
         String[] students={"ali","alishba","miki","tasmiya","samawal"};
         System.out.println(students.length);
         System.out.println(Arrays.toString(students));

         
         //DISPLAY ARRAY
         int[] marks={12,56,78,45,90};
         for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]); //ARRAY TRAVARSAL
         }
         System.out.println();
         System.out.println("reverse array");
         //REVERSE FOR LOOP
         for (int i =marks.length-1 ; i >=0; i--) {
            System.out.println(marks[i]); //ARRAY TRAVARSAL
         }

         //ENHANCED FOR LOOP||FOR EACH LOOP ARRAY
         System.out.println();
         System.out.println("Displaying array for each loop");
         for (int m : marks) {
            System.out.println(m);
         }


    }
}
