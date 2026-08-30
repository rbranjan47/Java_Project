package one_code_each_day.Arrays_Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverse_array {
    public static Object[] reverse_array_check(int[] arr) {
        List<Integer> arr_lists = new ArrayList<>();
        for (int arr_value : arr) {
            arr_lists.add(arr_value);
        }

        Collections.reverse(arr_lists);
        return arr_lists.toArray();
    }

    public static int[] reverse_array_check_using_swap(int[] arr) {
        int min_value = 0;
        int max_value = arr.length - 1;
        while (min_value < max_value) {
            int temp = arr[min_value];
            arr[min_value] = arr[max_value];
            arr[max_value] = temp;
            min_value++;
            max_value--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arr2[] = {5, 3, 8, 10};
        System.out.println(Arrays.toString(reverse_array_check(arr1)));
        System.out.println(Arrays.toString(reverse_array_check(arr2)));

        System.out.println(Arrays.toString(reverse_array_check_using_swap(arr1)));
        System.out.println(Arrays.toString(reverse_array_check_using_swap(arr2)));
    }
}
