package functionsProgram;

import java.util.Scanner;

public class Simpleintrest {
    static float simpleintrest(float a, float b,float c){
        float valu = (a*b*c)/100;
        return valu;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values=");
        float p = sc.nextInt();
        float r = sc.nextInt();
        float t = sc.nextInt();
        sc.close();
        System.out.println("Simple Intrest is = "+ simpleintrest(p, r, t));
    }
}
