package one_code_each_day.Arrays_Code;

import java.util.Arrays;

public class right_rotate_array {
    public static int[] right_rotate_array_check(int[] arr, int num) {
        if (arr.length <= 0 || arr == null) {
            return arr;
        }

        num = num % arr.length;
        if (num < 0) {
            num = num + arr.length;
        }

        while (num > 0) {
            int temp = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = temp;
            num--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(right_rotate_array_check(arr, 1)));
    }
}
