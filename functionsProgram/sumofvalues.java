// WAP to print sum of 12+22+32+..........................n2 
package functionsProgram;

import java.util.Scanner;

public class sumofvalues {

    static int nsum(int a) {
        int value = 0;
        for (int i = 12; i <= a; i+=10)

        {
            value += i;
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value in the form of 'N2' : ");
        int value = sc.nextInt();
        sc.close();
        System.out.println("The sum of nth values is " + nsum(value));
    }
}
