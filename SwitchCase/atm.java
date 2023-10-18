package SwitchCase;
import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    int i=0;
    while( i <7){ 
    System.out.println("Enter your option \n 1 : Check Balance \n 2 : Deposit Money \n 3 : Withdraw Money \n 4:Exit ");
    System.out.println("Enter your choice ");
    int n =sc.nextInt();

    int moneyBalance =0;
    switch(n){
        case 1:
        System.out.println("Money Balance is :"+ moneyBalance);
        break;

        case 2:
        System.out.println("Enter money you want to deposit :");
        int deposit =sc.nextInt();
        moneyBalance+=deposit;
        System.out.println("Your current balance is "+moneyBalance);
        break;


        case 3:
         System.out.println("Enter money you want to Withdraw :");
        int withdraw =sc.nextInt();
        
        if(withdraw>moneyBalance){
            System.out.println("Not enough amount \n");
        }
        else{ 
        //  System.out.println("Enter money you want to Withdraw :");
        // int withdraw =sc.nextInt();
        moneyBalance-=withdraw;
        System.out.println("Your Current balance is "+moneyBalance);
        }
        break;

        case 4:
          i=7;
          break ;
    }
    i++ ;
}
sc.close();


    
    }

}
