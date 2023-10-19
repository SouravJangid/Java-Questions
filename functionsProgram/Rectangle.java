package functionsProgram;

import java.util.Scanner;

public class Rectangle {
    static void Area(double length ,double width)
   {
       double area;
       area =length * width;
       System.out.println("Area of rectangle is : "+ area);
    }
    static void Perimeter(double length, double width)
    {
        double perimeter;
        perimeter = 2 * (length +width);
        System.out.println("Perimeter of rectangle is : " + perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
       double width= sc.nextDouble();
       sc.close();
        Area(length,width);
        Perimeter(length,width);
        }
}