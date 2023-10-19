//  A Insurance Company have a following polices (Insurance Premium Calculation program)
// 		User Input :
//                     a. Person Name
//                     b. Person gender
//                     c. Person Age
//                     d. Person city (Metro or Non-Metro)
// 	Conditions:
// 		if person age is 25 to 35 and gender is male and city is metro , Output is Premium is 6%
// 		if person age is 25 to 40 and gender is male and city is non-metro, Output is Premium 4%
// 		if person age is 25 to 42 and gender is female and city is Metro, Output is Premium 3%
// 		if person age is 25 to 45 and gender is female and city is non-metro , output is Premium 2%
// 		else
//  		Not Insured
package functionsProgram;

import java.util.Scanner;

public class Insorance {

   static int check(int a,String g,String c){
             int su=0;
            switch(g){
                case "male":
                {
                    if(c=="matro")
                        su=1;
                    else
                        su=2;
                }break;
                case "female":{
                    
                    if(c=="matro")
                        su=3;
                    else
                        su=4;
                }
            }
            if(su==1){
                return 6;
            }
            
            if(su==2){
                return 4;
            }
            
            if(su==3){
                return 3;
            }
            
            if(su==4){
                return 2;
            }
            return 0;
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your gender : ");
        String gender = sc.nextLine();
        System.out.print("Enter your city name : ");
        String city_name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.close();
        System.out.println("------------------Your Detailsf Is--------------------------");
        System.out.println("The person name is "+name);
        System.out.println("The age of person is "+ age);
        System.out.println("The gender of person is "+gender);
        System.out.println("Your city is "+ city_name);
        if(age>25)
        System.out.println("The Premimum is "+ check(age, gender.toLowerCase(), city_name.toLowerCase())+"%");
        else
        System.out.println("Not Insured");
    }
}
