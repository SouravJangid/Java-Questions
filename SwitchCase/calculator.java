package SwitchCase;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the operation among :");
        System.out.println("+ , -, *, %, ^");
        String c =sc.nextLine();
        System.out.println("Enter two numbers ");
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        switch(c){
            case "+":
            System.out.println("Sum ="+(num1+num2));
             break  ;
            case "-":
            System.out.println("Difference is "+(num1-num2));
             break  ;
            case "*":
            System.out.println("Multiplication is  ="+(num1*num2));
             break  ;
            case "/":
            System.out.println("Division is  ="+(num1/num2));
             break  ;
            case "%":
            System.out.println("Reminder ="+(num1%num2));
             break  ;
            case "^":
            System.out.println("num1 raise to Power num2="+(num1^num2));
             break  ;
        }
        sc.close();
    }
    
}
