package one_code_each_day.Arrays_Code;


import java.util.HashSet;
import java.util.Set;

public class duplicate_number_in_array {


    // this method will find duplicate and return their count
    public static void duplicate_number_in_array_check_using_hashmap(int[] integer_array) {
        Set<Integer> sets = new HashSet<>();
        for (int i = 0; i < integer_array.length; i++) {
            if (sets.contains(integer_array[i])) {
                continue;
            }
            sets.add(integer_array[i]);

            int count = 1;
            for (int j = i + 1; j < integer_array.length; j++) {
                if (integer_array[i] == integer_array[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Duplicate: " + integer_array[i] + " repeating " + count + " times");
            }
        }
    }

    public static void main(String[] args) {
        int[] integer_array = {2, 1, 2, 3, 4, 6, 7, 100, 10, 4};
        duplicate_number_in_array_check_using_hashmap(integer_array);
    }
}
