import java.util.Scanner;

public class PrintDis {
public static void printDigits(int num) {
  if (num <= 0) {
    return;
  }
  else {
    int lastDigit = num % 10;
    System.out.print(lastDigit + " ");
    int remainingNumber = num / 10;
    printDigits(remainingNumber);
  }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDigits(n);
        sc.close();
    }
}
