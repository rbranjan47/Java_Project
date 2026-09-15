package DSA_JAVA.Sortings;


// Using Comparator Interface - The Comparator interface in Java is used to define a custom ordering for objects — it lets you tell Java exactly how to compare two objects, instead of relying on their "natural" ordering.
// Example -
// Arrays.sort(arr, new Comparator<Integer>() {
//     @Override
//     public int compare(Integer a, Integer b) {
//         if (a % 2 == 0 && b % 2 != 0) {
//             return -1; // a is even, b is odd, so a should come first
//         } else if (a % 2 != 0 && b % 2 == 0) {
//             return 1; // a is odd, b is even, so b should come first
//         } else {
//             return 0; // both are even or both are odd, maintain their relative order
//         }
//     }
// });

import java.util.Arrays;
import java.util.Comparator;

class even_first_odd_last_sort_class implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return (a % 2) - (b % 2);
    }
}

public class even_first_odd_last_sort {
    public static void even_first_odd_last_sort_check(int[] arr) {
        int write_index = 0;
        for (int read_index = 0; read_index < arr.length; read_index++) {
            if (arr[read_index] % 2 == 0) {
                int temp = arr[read_index];
                arr[read_index] = arr[write_index];
                arr[write_index] = temp;

                write_index++;
            }
        }

        // printing elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    // Using Arrays compare operator to sort
    public static void even_first_odd_last_sort_class_check(Integer[] arr) {
        Arrays.sort(arr, new even_first_odd_last_sort_class());

        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] integer_array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        even_first_odd_last_sort_check(integer_array);
        System.out.println("");

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        even_first_odd_last_sort_class_check(arr);
    }
}
