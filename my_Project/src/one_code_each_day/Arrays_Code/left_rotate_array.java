package one_code_each_day.Arrays_Code;

import java.util.Arrays;

public class left_rotate_array {
    public static int[] left_rotate_array_check(int[] arr, int num) {
        // Fix 1: Handle empty arrays or arrays with 1 element (no rotation needed)
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        // Fix 2: Optimize rotations using modulo
        num = num % arr.length;

        // Handle negative rotation values if passed
        if (num < 0) {
            num += arr.length;
        }

        // here, num will check how many times this need to rotate
        while (num > 0) {
            int temp = arr[0];

            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }

            arr[arr.length - 1] = temp;
            num--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(left_rotate_array_check(arr, 1)));
    }
}
