package one_code_each_day.Recursion;

import java.util.HashSet;
import java.util.Set;

public class subset_sum_recursion {

    public static void subset_sum_recursion_check_without_recursion(int sum, int[] lists) {
        Set<Integer> sets = new HashSet<>();
        int count = 0;
        for (int i = 0; i < lists.length; i++) {
            int first_number = lists[i];
            int difference_number = sum - first_number;
            if (sets.contains(difference_number)) {
                System.out.println("Sets: " + first_number + " " + difference_number);
                count++;
            }
            sets.add(first_number);
        }
        System.out.println("Total Subset: " + count);
    }

    public static int subset_sum_recursion_check(int sum, int[] lists, int index) {
        if (index == 0) return (sum == 0) ? 1 : 0;
        return subset_sum_recursion_check(sum, lists, index - 1) + subset_sum_recursion_check(sum - lists[index - 1], lists, index - 1);
    }

    public static void main(String[] args) {
        int[] lists = {1, 2, 3, 4, 5, 6, 7, 4, 8};
        int sum = 8;
        subset_sum_recursion_check_without_recursion(sum, lists);

        //Total subsets without duplicates- {8}, {1, 7}, {2, 6}, {3, 5}, {1, 2, 5}, {1, 3, 4}, {2, 3, 3}, {4, 4}
        int totalSubsets = subset_sum_recursion_check(sum, lists, lists.length);
        System.out.println("Total Subsets: " + totalSubsets); // 8
    }
}
