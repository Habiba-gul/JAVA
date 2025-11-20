public class methods {
    static int students(int a, int b,int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        int a=90;
        int b=87;
        int c=67;
        int sum =students(a, b, c);
        System.out.println(sum);
        int x=89; int y=79; int z=78;
        int add=students(x, y, z);
        System.out.println(add);
        //methods are called for object by creating new if their is no static mean static keyword allow to use a method directly without creating obj
    }
}
