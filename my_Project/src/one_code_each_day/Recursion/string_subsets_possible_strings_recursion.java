package one_code_each_day.Recursion;

import java.util.ArrayList;
import java.util.List;

public class string_subsets_possible_strings_recursion {
    public static void string_subsets_possible_strings_recursion_check_using_loop(String str) {
        List<String> lists = new ArrayList<>();
        lists.add("");
        for (int i = 0; i < str.length(); i++) {
            int currentSize = lists.size();
            for (int j = 0; j < currentSize; j++) {
                lists.add(lists.get(j) + str.charAt(i));
            }
        }
        System.out.println(lists);
    }

    public static void string_subsets_possible_strings_recursion_check_using_recursion(String str, int index, String currentStr) {
        if (index == str.length()) {
            System.out.println("\"" + currentStr + "\"");
            return;
        }

        //Include the current character
        string_subsets_possible_strings_recursion_check_using_recursion(str, index + 1, currentStr + str.charAt(index));

        //Exclude the current character
        string_subsets_possible_strings_recursion_check_using_recursion(str, index + 1, currentStr);
    }

    public static void main(String[] args) {
        string_subsets_possible_strings_recursion_check_using_loop("ABCD");
        string_subsets_possible_strings_recursion_check_using_recursion("ABCD", 0, "");
    }
}
