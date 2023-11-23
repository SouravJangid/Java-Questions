public class Sumdigit {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        int lastdigit=n%10;
        return lastdigit+sum(n/10);
        }
    




    public static void main(String[] args) {
        int r=sum(1234);
        System.out.println(r);
    }
}
