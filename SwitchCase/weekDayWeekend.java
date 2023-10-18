package SwitchCase;
import java.util.Scanner;

public class weekDayWeekend {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the day :");
        String day =sc.nextLine();
        switch(day){
            case "sunday":
            case "saturday":
            System.out.println("Weekend");
             break  ;
             default:
             System.out.println("WeekDay");
            
        }
        sc.close();
    }
}
