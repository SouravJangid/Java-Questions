import java.util.*;
public class StringSubSeq {
    static ArrayList<String> findSubSeq(String str){
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<str.length();i++) {
            char singleChar = str.charAt(i);
            if(list.size()==0){
                list.add("");
                list.add(""+singleChar);
                continue;
            }
            int listSize = list.size();
            for(int j=0;j<listSize;j++) {
            String s = list.get(j)+singleChar;
            if(!list.contains(s))
              list.add(s);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner scanner =new Scanner(System.in);
        String split = scanner.nextLine();
        scanner.close();
       System.out.println(findSubSeq(split));
    }
}
