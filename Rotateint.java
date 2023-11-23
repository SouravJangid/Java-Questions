import java.util.Scanner;

public class Rotateint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        System.out.print("Enter the rotation time: ");
        int r=sc.nextInt();
        sc.close();
        int sum=n;
        int ml=1;
        while (n!=0) {
            n/=10;
            ml*=10;
        }
        ml/=10;
        System.out.println(ml);
        n=0;
        while (r!=0) {
            int rn= sum%ml;
            n=sum/ml;
            sum=rn*10+n;
            System.out.println(sum);
            r--;
        }
        System.out.println(sum);    
       }
}
