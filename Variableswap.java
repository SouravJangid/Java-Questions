public class Variableswap {
    public static void main(String[] args) {
        int a = 10 ;
        int b =5 ;
        System.out.println("value of a is " +a );
        System.out.println("value of b is " +b );

        a = a+b ;
        b =a-b;
        a= a-b ;
       System.out.println("value of a is " +a );
        System.out.println("value of b is " +b );


        System.out.println();

        int x =10;
        int y =5 ;
         System.out.println("value of x is " +x );
        System.out.println("value of y is " +y );
        x =x*y;
        y =x/y;
        x = x/y;
         System.out.println("value of x is " +x );
        System.out.println("value of y is " +y );



    }
}
