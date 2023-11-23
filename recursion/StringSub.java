import java.util.*;

public class StringSub {
    // First Recursion
    static void findSubSeq(String str, int Stringlength, int i, ArrayList<String> list) {

        if (i == Stringlength) {
            System.out.println(list);
            return;
        }
        char singleChar = str.charAt(i);
        if (list.size() == 0) {
            ;
            list.add("");
        }
        addSubSeq(list, list.size(), 0, singleChar);
        findSubSeq(str, Stringlength, i += 1, list);
    }

    // Second Recursion
    static void addSubSeq(ArrayList<String> list, int end, int start, char singleChar) {
        if (start == end) return;
        String s = list.get(start) + singleChar;
        if (!list.contains(s))
            list.add(s);
        addSubSeq(list, end, start += 1, singleChar);
    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String split = scanner.nextLine();
        scanner.close();
        ArrayList<String> list = new ArrayList<>();
        findSubSeq(split, split.length(), 0, list);
    }
}