// import java.util.*;
public class SortedArray {


    static void checkArraySort(int[] st,int index0,int i,int Araaylen){
        int ran=0;
        // intitialisevalue
        if(index0<st[1])
            ran=1;
        

        // comparision
        // System.out.println(st[i]+":"+ran+":"+st[i+=1]);
        if(ran == 1){
            if(st[i]<=st[i+=1]){
                if(st[i+=1]==Araaylen){
                    System.out.print("Yes");
                    return;
                }
                checkArraySort(st, index0, i+=1, Araaylen);
            }else{
                System.out.print("not");    
                return;
            }
        }else{
            if(st[i]>st[i+=1]){
                if(st[i+=1]==Araaylen){
                    System.out.print("Yes");
                    return;
                }
                checkArraySort(st, index0, i+=1, Araaylen);
            }else{
                System.out.print("not");    
                return;
            }
        }

    }

    public static void main(String[] args) {
     int [] a = new int[]{5,4,3,2,1,0};
        checkArraySort(a, a[0], 0,a[5]);
    }
    
}
