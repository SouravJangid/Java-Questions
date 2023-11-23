public class Pattern {

    static void printRow(int n){
        if(n==0){
        return;}
        System.out.print("*");
        printRow(n-1);
    }

    static void printPattern(int col , int row){
        if(row==0){
            return;
        }
        printRow(col);
        System.out.println();
        printPattern(col , row-1);
    }
    public static void main(String[] args) {
      printPattern(5,5); 
    }
    
}

// output 

// *****
// ***** 
// ***** 
// ***** 
// *****