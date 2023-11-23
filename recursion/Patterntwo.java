public class Patterntwo {
    static void printRow(int n){
        if(n==0){
        return;
        }
        System.out.print("*");
        printRow(n-1);
    }
    static void printPattern(int col , int row){
        if(row==0){
            return;
        }
        printRow(col);
        System.out.println();
        printPattern(col+1, row-1);
    }
    public static void main(String[] args) {
        printPattern(1, 5);
    }
    
}
    // output
    // * 
    // ** 
    // *** 
    // **** 
    // *****
