// Find out the grade , according to given percentage of the user.
//         a. >=90 print ‘A’ Grade
//         b. 89 to 70 print ‘B’ Grade
//         c. 69 to 50 print ‘C’ Grade
//         d. <50 print ‘D’ Grade
package functionsProgram;

import java.util.Scanner;

public class MarksOfStudent {
    static void percentage(float totalMarks,int count){
        
        System.out.println("Total MArks : " + totalMarks);

        float percentage = (totalMarks / (count * 100)) * 100;
 
        switch ((int) percentage / 10) {
        case 9:
            System.out.println("Grade : A");
            break;
        case 8:
        case 7:
            System.out.println("Grade : B");
            break;
        case 6:
        case 5:
            System.out.println("Grade : C");
            break;
        default:
            System.out.println("Grade : D");
            break;
        }
    }
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();
        
        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
        scanner.close();
        percentage(totalMarks,count);
    }
}
