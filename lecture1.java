public class lecture1 {
    public static void main(String[] args) {
        String name = "Ram";
        String name2= name ;

        System.out.println(name ==name2);
        String name3 = "Ram";
        System.out.println(name==name2);
        System.out.println(name2==name3);

        String name4= new String("Ram");
        System.out.println(name ==name4);   // == comapre address 
        System.out.println(name.equals(name4));       // but equals compare value 


        String myname1 = "RAm";
        String myname2 = "Ram";
        System.out.println(myname1.equalsIgnoreCase(myname2));

        System.out.println("Aman".compareTo("Dman"));

    int a=10;
    int b =8;
    // a+=b;
    // System.out.println(a);

    System.out.println(a&b);
    System.out.println(10^4);

    //    0 0 --> 0
    //    0 1 --> 1
    //    1 0 --> 1
    //    1 1 --> 0

    //   10 -->  1 0 1 0
    //   4  -->  0 1 0 0
  // o/p XOR --> 1 1 1 0  --> 14

     int c =10>>2;     // bit shift
     System.out.println(c);
     



    }
}
