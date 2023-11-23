import java.util.Scanner;

public class Name10time {
    static void name10(String name,int t){
        if(t==0){
            return;
        }
        System.out.println(name);
        name10(name,t-=1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        sc.close();
        name10(name,10);
    }
}
