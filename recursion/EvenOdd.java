import java.util.*;
public class EvenOdd {
    public static void evennum(int vla){
        if(vla==0) return;
        if(vla%2==0){
            System.out.println(vla+" is even");
        }
        else{
            System.out.println(vla+" is odd");
        }
       evennum(vla-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        evennum(n);
        scanner.close();
    }
}
