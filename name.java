public class name {
   public static void main(String[] args) {
    String name = "abcdefg";
    String name1 =name ;

    String name3 ="abcd";
    String name4 =new String("abcd");

    System.out.println(name1==name);
    System.out.println(name3==name);
    System.out.println(name4==name);

    System.out.println(name.compareTo(name4));

   }
}
