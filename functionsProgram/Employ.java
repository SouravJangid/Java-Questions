// WAP to calculate net salary of employee, take basic salary of employee and calculate
//  	HRA 30% of basic salary, 
// 	DA 20% of the basic salary, 
// 	TA 10% of the basic salary and 
// 	Net salary is sum up of basic salary+ allowances-pf.
//  Pf is 1400 fix. 
    
package functionsProgram;

import java.util.Scanner;

public class Employ {
    static void netsalary(double salary){
      double pf=1400;
      double da=salary * 0.2;
        double ta = salary * 0.1;
        System.out.println("Net Salary of the Employee is "+ (salary+da+ta-pf));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        sc.close();
        netsalary(salary);
    }
}
