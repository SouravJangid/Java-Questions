package functionsProgram;

import java.util.Scanner;

public class Printdigits {
    static void printDigits(int value) {
        int result =0;
        while (value!=0) {
           int rn = value%10;
           result = result*10+rn;
           value/=10;
        }
        while (result!=0) {
            System.out.println(result%10);
            result/=10;
        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        sc.close();
        printDigits(n);
       }
}
