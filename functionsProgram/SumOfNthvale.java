// WAP to print sum of  1+2+3+.............................n
package functionsProgram;

import java.util.Scanner;

public class SumOfNthvale {
    static int nsum(int a){
        int value=0;
        for(int i=1;i<=a;i++)value+=i;
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for nth sum: ");
        int value=sc.nextInt();
        sc.close();
        System.out.println("The sum of nth values is "+ nsum(value));
    }
}
