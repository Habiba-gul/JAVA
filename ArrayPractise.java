public class ArrayPractise {

    public static void main(String[] args) {
       /* //AN ARRAY OF 5 FLOAT AND CALCULATE SUM
        float[] values={34.5f,67.3f,10.0f,40.5f,55.6f};
        float sum=0;
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            sum+=values[i];
            
        }
        System.out.println("sum is "+sum);*/ 

       /* 
       //A NUM IS PRESENT IN ARR OR NOT
        float[] values={34.5f,67.3f,10.0f,40.5f,55.6f};
        float num=10.0f;
        boolean isinARRAY=false;
        for (int i = 0; i < values.length; i++) {
            if (num==values[i]) {
                isinARRAY=true;
                break;
            } 
            }
        if (isinARRAY) {
                System.out.println("the value is present in array");
            }
            else{
                System.out.println("is not present in array");
            } */

       /* 
     // CALCULATE AVG MARKS OF PHYSICS
    float[] PHYSICS={75.9f,45.6f,91.3f,69.5f,80.0f};
    float sum=0;
    for (float marks : PHYSICS) {
        sum+=marks;
    }
    float avg=sum/PHYSICS.length;
    System.out.println("avg is : "+avg);
    */

    /*Find the largest number in an integer array. */
    //  int[] arr={2,4,8,9,4,6};
    //  int largest= arr[0];
    //  for (int i = 0; i < arr.length; i++) {
    //     if (arr[i]>largest) {
    //         largest=arr[i];
    //  }

    //     }
    //     System.out.println("largestis "+largest);
    /*Find the smallest number in an array */
    

    //    int[] arr={87,4,8,9,4,6};
    //    int smallest= arr[0];
    //      for (int i = 0; i <arr.length; i++) {
    //          if (arr[i]<smallest) {
    //             smallest=arr[i];
    //            }

    //          }
    //      System.out.println("largestis "+smallest);
/*Count how many even and odd numbers are in an array */
    int[] arr={8,4,88,9,4,6};
       int even= 0;
       int odd=0;
         for (int i = 0; i <arr.length; i++) {
             if (arr[i]%2==0) {
                even++;
               }

             }
         System.out.println("even numumber are "+even);
    
         for (int i = 0; i < arr.length; i++) {
            
            if (arr[i]%2!=0) {
                odd++;
            }

         }
         System.out.println("odd is: "+odd);
        }
}