package functionsProgram;

import java.util.Scanner;
public class Fibonacci {
    static int fab(int a){
        if(a==0)return 0;
        if(a==1)return 1;
        return (fab(a-2)+fab(a-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.print("Enter a number ");
        int n =sc.nextInt();
        sc.close();
        for(int i=0; i<=n;i++){
            System.out.print(fab(i)+" + ");
        }
}
                        
}