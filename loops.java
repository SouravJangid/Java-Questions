// import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // if first alpha of a reserved word is small then it is a keyword
        // if first alpha of a reserved word is Capital then it is a Class
        // Scanner sc =new Scanner(System.in);
        // System.out.println("Enter a number ");
        // int n = sc.nextInt();

        String newArray[]={"Ram", "Shyam", "Mohan "};
        for(String name : newArray){
           System.out.println(name);
        }
        int i =0;
        do{
            System.out.println(i);
            i++;
        }while(i<5);

        int j =0;
        while(j<5){
            System.out.println(j);
            j++;
        }
    }
}