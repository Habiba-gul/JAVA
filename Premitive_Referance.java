import java.util.Date;;

public class Premitive_Referance {
    public static void main(String[] args) {
        // premitive stores values directly like int float etc;
        int marks=65;
        byte data=4;
        float mark=27.00F;
        double m=897.0005646d;
        long y=9876543L;
        System.out.println(marks);
        System.out.println(data);
        System.out.println(mark);
        System.out.println(m);
        System.out.println(y);
        //also boolean which is condtion based like true or false 

        //referance refers to obj dont stores actual value 
        Date now=new Date() ;
        now.getTime();
        System.out.println(now);
        //string is a refe type
        String msg=new String("HELLO THERE!!!");
       System.out.println(msg);
       System.out.println( msg.length());
      // escape seq
      //escp seq represant things that cant be type directly eg new line qutes or backlash 
      String msge ="\"HELLO WORLD\""; // \" add quotes
      System.out.println(msge);

      String hey="\\kindly\\";  // \\ add a backslash 
      System.out.println(hey);

      String h="hi\thow are you doing.\b?"; // \t add a space \b move backspace remove space of char 
      System.out.println(h);

       


    }
    
}
