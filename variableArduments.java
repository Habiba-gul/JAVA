public class variableArduments {  
    //for diffrent arguments we make methods like
   /*  static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }*/
   //if we follow this pattren every time we need to create a seprate methods s insted of this we can use vararr 
    static int sum(int...arr){
        //avalible as int[] arr
        int result=0;
        for (int a : arr) {
            result+=a;
        }
        return result;
    }
    

    public static void main(String[] args) {
      /*  int a=8; 
    int b=9;
    int sum=sum(a, b);
    System.out.println(sum);
    int x=9;
    int y=7;
    int z=6;
    int add =sum(x, y, z);
    System.out.println(add);*/

    System.out.println("the sum od 4 and 5 is: "+sum(4,5));
    System.out.println("the sum od 4 ,6 and 5 is: "+sum(4,6,5));
    System.out.println("the sum od 4 ,6,9 and 5 is: "+sum(4,6,9,5));
    }

}
