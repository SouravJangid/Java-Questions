import java.util.*;
public class Solidsqure {
    public static void star(int size) {
      if (size == 0) {
        return;
      }
      System.out.print("*");
       star(size-1);
    }
    public static void pattern(int row , int col){
      if(row == 0) {
        return;
      }
      star(col);
      System.out.println();
      pattern(row-1, col);
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        sc.close();
        pattern(n,n);
      }
      
}
