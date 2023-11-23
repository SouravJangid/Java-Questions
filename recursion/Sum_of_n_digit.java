public class Sum_of_n_digit {
    static int check(int n) {

        if (n == 0) {
            return 0;
        }
        return n + check(n - 1);
    }

    public static void main(String[] args) {
        int res = check(5);
        System.out.println("sum = " +res);
    }

}
