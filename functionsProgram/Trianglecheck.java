package functionsProgram;

import java.util.Scanner;

public class Trianglecheck {
    static void checkTriangle(int x, int y, int z)
{
    if (x == y && y == z )
        System.out.println("Equilateral Triangle");
    else if (x == y || y == z || z == x )
        System.out.println("Isosceles Triangle");
    else
        System.out.println("Scalene Triangle");
}
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
  int x = sc.nextInt();
   int y = sc.nextInt();
    int z = sc.nextInt();
     sc.close();
    checkTriangle(x, y, z);
}
}
