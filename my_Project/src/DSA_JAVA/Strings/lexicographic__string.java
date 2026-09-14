package DSA_JAVA.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lexicographic__string {
    public static void lexicographic__string__check__using_permutation(String prefix, String sortedStr, List<String> resultStr) {
        if (sortedStr.isEmpty()) {
            resultStr.add(prefix);
            return;
        }

        for (int i = 0; i < sortedStr.length(); i++) {
            lexicographic__string__check__using_permutation(prefix + sortedStr.charAt(i), sortedStr.substring(0, i) + sortedStr.substring(i + 1), resultStr);
        }
    }

    public static void main(String[] args) {
        String str = "CBA";
        List<String> lists = new ArrayList<>();
        char[] strChars = str.toCharArray();
        Arrays.sort(strChars);
        String sortedString = new String(strChars);

        lexicographic__string__check__using_permutation("", sortedString, lists);

        //checking lexicographic
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).equals(str)) {
                System.out.println(lists.indexOf(lists.get(i)) + 1);
            }
        }
    }
}
