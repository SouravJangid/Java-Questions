public class am_demo {
    public class Demo{
        public static void main(String args[]){
           String my_str = "This_is_a_sample";
           String[] split_str = my_str.split("_", 4);
           System.out.println("The split string is:");
           for (String every_Str : split_str)
           System.out.println(every_Str);
           String joined_str = String.join("_", "This", "is", "a", "sample");
           System.out.println("The joined string is:");
           System.out.println(joined_str);
        }
     }
}
