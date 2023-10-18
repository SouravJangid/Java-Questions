import java.util.Scanner;

public class inputScanner {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int I =sc.nextInt();
        System.out.println(I);

        sc.close();  
           // input stream is closed |

        System.out.println("Enter a string");
        String s = sc.next();
        System.out.println("String is "+s);
    }
}
