package one_code_each_day.Arrays_Code;

import java.util.Arrays;

public class left_rotate_array {
    public static int[] left_rotate_array_check(int[] arr) {
        int temp = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(left_rotate_array_check(arr)));
    }
}
