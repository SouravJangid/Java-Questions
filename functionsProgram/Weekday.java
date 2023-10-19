package functionsProgram;

import java.util.Scanner;

public class Weekday {
    static void weekd(String day){
                    switch(day){
						case "sunday":
						case "saturday":
						System.out.println("Weekend");
						break  ;
						default:
						System.out.println("WeekDay");
						
					}
    }
    public static void main(String[] args) {
					Scanner sc =new Scanner(System.in);
					System.out.println("Enter the day :");
					String day =sc.nextLine();
					weekd(day.toLowerCase());
                    sc.close();
				}
}
