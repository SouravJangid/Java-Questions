//      +
//      +
//      +
//      +
// +++++++++++
//      +
//      +
//      +
//      +
public class Pattern10 {
    public static void printPattern(int n) 
    { 
        int i, j; 
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) { 
                    if(i==n/2||j==n/2)
                    System.out.print("+");
                    else
                    System.out.print(" "); 
                } 
            
            System.out.println(); 
        } 
    } 
    public static void main(String args[]) 
    { 
        int n = 10; 
        printPattern(n); 
    }
}
