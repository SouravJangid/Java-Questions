import java.util.*;

public class Prime {

  /*
   * // static void values(int n, int i) {
   * // if (i == n)
   * // return;
   * // if(n==2)System.out.println(n);
   * // if(n>2){
   * 
   * // check(i, i/2);
   * // }
   * // values(n, i += 1);
   * // }
   * 
   * // static void check(int n, int i) {
   * // int g=0;
   * // if(n%i==0) { g=1;}
   * // if(g==0) {
   * // System.out.println(n);
   * // }
   * // check(n, i-=1);
   * // }
   * // public static void main(String[] args) {
   * // Scanner sc = new Scanner(System.in);
   * // System.out.print("Enter the number: ");
   * // int n = sc.nextInt();
   * // sc.close();
   * // values(n, 2);
   * // }
   */

  static boolean prime(int n, int i) {

    if (n <= 2) {
      if (n == 1 || n == 0) {
        return false;
      } else {
        return true;
      }
    }
    if (n % i == 0) {
      return false;
    }
    if (i * i > n) {
      return true;
    }
    return prime(n, i + 1);

  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the range number:");
    int n = scan.nextInt();
    scan.close();
    int i;
    for (i = 1; i <= n; i++) {
      boolean r = prime(i, 2);
      if (r)System.out.print(" " + i);
    }

  }
}