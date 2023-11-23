import java.util.*;

public class ItsOfPowe2orNot {
    static void valueOfpowe2or(int vla, int i) {
        double vlaa = vla;
        double si = i;
        int s = (int) Math.pow(2.0, si);
        if (vla == s) {
            System.out.println("Value is the power of 2");
            return;
        }
        if (vla < s) {
            System.out.println("Value is not the power of 2");
            return;
        }
        int vl = (int)vlaa;
        valueOfpowe2or(vl, i += 1);
    }

    public static void main(String[] arg) {

        System.out.print("Enter the vlalue: ");
        Scanner sc = new Scanner(System.in);
        int val=sc.nextInt();
        sc.close();
        valueOfpowe2or(val, 1);
    }

}
