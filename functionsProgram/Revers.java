package functionsProgram;

import java.util.Scanner;

public class Revers {
    static int rever(int a){
        int value1, value = 0;
        while(a!=0){
            value1 =a%10;
            value = value*10 +value1;
            a/=10;
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of reverse: ");
        int value = sc.nextInt();
        sc.close();
        System.out.println("The reverse of the given value is "+rever(value));
    }
}
