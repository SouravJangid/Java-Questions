import java.util.*;
public class Facto {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
          return 1;
        }
        else {
          return n * factorial(n - 1);
        }
      }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(factorial(n));
        scanner.close();
    }
}
