package functionsProgram;

import java.util.Scanner;

public class PosNeg {
    static String checkPosNeg(int x)
    {
    if (x > 0)
            return "Positive";
 
        else if (x < 0)
            return "Negative";
 
        else
            return "zero";
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        sc.close();
        System.out.println(Number + " is "
                           + checkPosNeg(Number));
    }
}
