package DSA_JAVA.Sortings;

import java.util.ArrayList;
import java.util.List;

public class union_of_two_sorted_array {
    // This method to print the union of two sorted arrays, means to find all the unique elements present in both arrays.
    // Example- arr1 = {1, 2, 2, 3, 4, 5, 6};
    //          arr2 = {2, 2, 3, 4, 4, 5};
    //          Output = {1, 2, 3, 4, 5, 6};

    // Sudo code-
    // 1. Create a new array to store the union of the two arrays.
    // 2. Use two pointers to traverse both arrays.
    // 3. Compare the elements at the two pointers.
    // 4. If the element in the first array is smaller, add it to the union array and move the pointer in the first array forward.
    // 5. If the element in the second array is smaller, add it to the union array and move the pointer in the second array forward.
    // 6. If the elements are equal, add it to the union array and move both pointers forward.
    // 7. If there are remaining elements in either array, add them to the union array.
    // 8. Return the union array.

    // Naive solution - Time complexity is O(n*m) where n and m are the lengths of the two arrays.
    // 1. Create a new array to store the union of the two arrays.
    // 2. Use two nested loops to traverse both arrays.
    // 3. Compare the elements at the two pointers.
    // 4. If the element in the first array is smaller, add it to the union array and move the pointer in the first array forward.
    // 5. If the element in the second array is smaller, add it to the union array and move the pointer in the second array forward.
    // 6. If the elements are equal, add it to the union array and move both pointers forward.
    // 7. If there are remaining elements in either array, add them to the union array.
    // 8. Return the union array.

    public static void union_of_two_sorted_array_check(int arr1[], int arr2[]) {
        int arr1_length = arr1.length;
        int arr2_length = arr2.length;

        int i = 0;
        int j = 0;
        while (i < arr1_length && j < arr2_length) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[i]);
                j++;
            } else {
                System.out.print(arr1[i]);
                i++;
                j++;
            }
        }
        while (i < arr1_length) {
            if (i > 0 && arr1[i] != arr1[i - 1]) {
                System.out.println(arr1[i]);
                i++;
            }
        }
        while (j < arr2_length) {
            if (j > 0 && arr1[j] != arr2[j - 1]) {
                System.out.println(arr2[j]);
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 4, 5, 6};
        int arr2[] = {2, 2, 3, 4, 4, 5};

        union_of_two_sorted_array_check(arr1, arr2);
    }
}
