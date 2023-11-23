import java.util.*;
class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of " + i+ " Element ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the value of rotation");
        int r= sc.nextInt();
        System.out.print("The new array after rotating: ");
        sc.close();
        for(int i=0; i<r; i++){
            int temp=a[0];
            for(int j=0; j<n-1; j++){
                a[j]=a[j+1];
            }
            a[n-1]=temp;
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
    
} 