public class Factorial {
    public static void main(String[] args) {
        int res = check(5);
        System.out.println("sum = " + res);
    }

    static int check(int num) {

        if (num >= 1) {
            return num * check(num - 1);
        } else
            return 1;
    }

}
