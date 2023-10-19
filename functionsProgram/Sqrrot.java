package functionsProgram;

import java.util.*;

public class Sqrrot {
    static double sqrtt(int a){
       return Math.pow(a, 0.5);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for Squre root: ");
        int value = sc.nextInt();
        sc.close();
        System.out.println("The Squre root of given value is "+sqrtt(value));
    }
}
