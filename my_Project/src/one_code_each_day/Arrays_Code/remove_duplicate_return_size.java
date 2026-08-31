package one_code_each_day.Arrays_Code;

import java.util.*;

public class remove_duplicate_return_size {
    public static void remove_duplicate_return_size_check(int[] arr) {
        List<Integer> lists = new ArrayList<>();
        for (Integer arr_value : arr) {
            lists.add(arr_value);
        }
        for (int i = 0; i < lists.size(); i++) {
            for (int j = i + 1; j < lists.size(); j++) {
                if (lists.get(i) == lists.get(j)) {
                    lists.remove(lists.get(j));
                }
            }
        }
        System.out.println(lists);
    }

    public static void remove_duplicate_return_size_check_using_hashset(int[] arr) {
        List<Integer> lists = new ArrayList<>();
        for (Integer arr_value : arr) {
            lists.add(arr_value);
        }

        // Using hashset
        HashSet<Integer> sets = new HashSet<>(lists);
        System.out.println(sets);
    }


    public static void main(String[] args) {
        int[] integer_array = new int[]{2, 1, 2, 3, 4, 6, 7, 100, 10, 4};
        remove_duplicate_return_size_check(integer_array);
        remove_duplicate_return_size_check_using_hashset(integer_array);
    }
}
