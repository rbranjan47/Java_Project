package one_code_each_day.Arrays_Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class largest_possible_number_given_array {
    public static String largest_possible_number_given_array_check(int[] arr) {
        List<String> lists = new ArrayList<>();
        for (Integer arr_str_values : arr) {
            lists.add(String.valueOf(arr_str_values));
        }

        lists.sort((a, b) -> (b + a).compareTo(a + b));

        if (lists.equals("0")) return "0";

        StringBuilder strBuilder = new StringBuilder();
        for (String str_value : lists) {
            strBuilder.append(str_value);
        }
        return String.valueOf(strBuilder);
    }

    public static void main(String[] args) {
        int[] integer_array = new int[]{2, 1, 2, 3, 4, 6, 7, 100, 10, 4};
        System.out.println(largest_possible_number_given_array_check(integer_array));
    }
}
