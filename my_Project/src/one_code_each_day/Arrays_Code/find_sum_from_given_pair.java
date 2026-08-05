package one_code_each_day.Arrays_Code;

import java.util.*;

public class find_sum_from_given_pair {
    public static void find_sum_from_given_pair_check(int[] input_array, int sumValue) {
        Set<Integer> set_input_array = new HashSet<>();
        for (int i = 0; i < input_array.length; i++) {
            set_input_array.add(input_array[i]);
        }
        // O(n2)- Using 2 loops to sum and match
        // Adding to arraylist
        List<Integer> lists = new ArrayList<>(set_input_array);
        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.size(); j++) {
                if (lists.get(i) + lists.get(j) == sumValue) {
                    System.out.println("sum numbers are: " + lists.get(i) + " and, " + lists.get(j));
                    return;
                }
            }
        }
    }

    public static void find_sum_from_given_pair_check_using_hashset(int[] input_array, int sumValue) {
        Set<Integer> set_input_array = new HashSet<>();
        for (int i = 0; i < input_array.length; i++) {
            int current_number = input_array[i];
            int second_number = sumValue - current_number;
            if (set_input_array.contains(second_number)) {
                System.out.println("First number: " + current_number + " , second number: " + second_number);
            }
            set_input_array.add(current_number);
        }
    }

    public static void main(String[] args) {
        int[] integer_array = {1, 2, 3, 4, 6, 7, 100, 10};
        Scanner scans = new Scanner(System.in);
        System.out.println("Enter sum value: ");
        int input_sum_value = Integer.parseInt(scans.nextLine());
        find_sum_from_given_pair_check(integer_array, input_sum_value);

        find_sum_from_given_pair_check_using_hashset(integer_array, input_sum_value);
    }
}
