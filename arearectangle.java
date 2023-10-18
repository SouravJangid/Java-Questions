import java.util.Scanner;

public class arearectangle {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
         System.out.println("Enter width of rectangle ");
         int a = sc.nextInt();
         System.out.println("Enter height of rectangle ");
          int b = sc.nextInt();

          System.out.println("Area is "+ a*b);
          sc.close();
 
    }
    
}
