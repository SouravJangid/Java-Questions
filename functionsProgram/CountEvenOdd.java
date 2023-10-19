package functionsProgram;

import java.util.Scanner;

public class CountEvenOdd {
    static int evenodd(int i){
        
                 if(i%2==0)
                 return i;
                 if(i%2!=0)
                 return i; 
        return 56;
    }
     public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter starting number");
                    int st = sc.nextInt();
                    System.out.println("Enter ending number");
                    int end = sc.nextInt();

                    System.out.println("Even numbers are ");
                    for(int i=st ;i<end ;i++){
                        System.out.print(evenodd(i));
                    }

                    System.out.println("Odd numbers are ");
                    for(int i=st ;i<end ;i++){
                        
                        System.out.print(evenodd(i));
                    }
                    sc.close();
                }
}
