package one_code_each_day.Arrays_Code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayLeaders {
    public static List<Integer> arrayLeaders_check(int[] arr) {
        ArrayList<Integer> lists = new ArrayList<Integer>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                lists.add(arr[i]);
            }
        }
        if (!lists.contains(arr[arr.length - 1])) {
            lists.add(arr[arr.length - 1]);
        }
        return lists;
    }


    public static List<Integer> arrayLeaders_check_help(int[] arr) {
        ArrayList<Integer> lists = new ArrayList<Integer>();
        if (arr == null || arr.length == 0) {
            return lists;
        }

        int size = arr.length;
        int currentMax = arr[size - 1];
        lists.add(currentMax);

        //Checking from the right side of the array
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] >= currentMax) {
                currentMax = arr[i];
                lists.add(currentMax);
            }
        }
        Collections.reverse(lists);
        return lists;
    }


    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 17, 3, 5, 2};
        int arr2[] = {53, 32, 9, 55, 64, 59, 65, 90};
        System.out.println(arrayLeaders_check(arr));
        System.out.println(arrayLeaders_check(arr2));


        System.out.println(arrayLeaders_check_help(arr));
        System.out.println(arrayLeaders_check_help(arr2));
    }
}
