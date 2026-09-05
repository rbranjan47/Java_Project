package one_code_each_day.Arrays_Code;

import java.util.*;

public class maximum_difference_array {
    public static int maximum_difference_array_check_using_collection(int[] arr) {
        if (arr.length <= 1 || arr == null) {
            return 0;
        }
        // To find this, first sort and then subtract first element with last element
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            lists.add(arr[i]);
        }

        Collections.sort(lists);
        return (lists.get(lists.size() - 1) - lists.get(0));
    }

    public static int maximum_difference_array_check_finding_maximum_minimum(int[] arr) {
        int max_num = arr[0];
        int min_num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max_num) {
                max_num = arr[i];
            }
            if (arr[i] < min_num) {
                min_num = arr[i];
            }
        }
        return max_num - min_num;
    }

    public static void main(String[] args) {
        int[] arr = {20, 78, 109, 1, 89, 29, 83, 93, 03, 289};
        System.out.println(maximum_difference_array_check_using_collection(arr));

        System.out.println(maximum_difference_array_check_finding_maximum_minimum(arr));
    }
}
