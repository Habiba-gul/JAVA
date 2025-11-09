public class JavaOperations {
    public static void main(String[] args) {
        System.out.println("hey there..");
        //Arthematic expression '+''-''*''/''%'
        int result=5+7;
        System.out.println(result);
        float result2=5/7;
        System.out.println(result2);
        //increment decrement
        int x=1;
        //x++;      //x++=postfix  ++x=prefix
        //System.out.println(x);
       int y= x++;
       System.out.println(y);
       System.out.println(x);
      int z=2;
     int p=--z;
     System.out.println(p);
     System.out.println(z);
      
     //assignment op remember a=a+2 is same as a+=2
     int a=0;
     a=a+2;
     System.out.println(a);
      a+=3;                  //same for all aethematic op
      System.out.println(a);
      
// casting and type cnversion
//impicit casting automatic conversion 
//byte>short>int>long
short m=1;
int w=m+2;
System.out.println(w);
//explicit casting
double h=1.1;
double q=(int)h+2;   //to print this in int
System.out.println(q);

//conversion of incomitable data type for tjis purpose we use Integer.parsedatatype()
String b="1";
int c=Integer.parseInt(b)+2;
System.out.println(c);
String d="3.4";
float e=Float.parseFloat(d)+5.8F;
System.out.println(e);




}
}
