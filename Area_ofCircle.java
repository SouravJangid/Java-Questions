import java.util.Scanner;

public class Area_ofCircle {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter radius of circle ");
         float r = sc.nextInt();

         System.out.println("Area is " +2*1.41*r);
         sc.close();
    }
    
}
