package DSA_JAVA.Sortings;

// Insertion Sort (Stable): This is a simple sorting algorithm that builds the final sorted array (or list) one item at a time.
//                   It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. However, insertion sort provides several advantages:
//                   It is simple to implement.
//                   It is efficient on small data sets.
//                   It is stable (does not change the relative order of elements with equal keys).
//                   Time Complexity: O(n^2) in the average and worst case, O(n) in the best case (when the array is already sorted).
//                   Space Complexity: O(1) because it is an in-place sorting algorithm.
//                   Example: Given an array [12, 11, 13, 5, 6], the insertion sort algorithm will sort it to [5, 6, 11, 12, 13].
//                   Pseudocode:
//                   function insertionSort(arr)
//                       n = length(arr)
//                       for i from 1 to n-1
//                           key = arr[i]
//                           j = i - 1
//                           while j >= 0 and arr[j] > key
//                               arr[j + 1] = arr[j]
//                               j = j - 1
//                           arr[j + 1] = key
//                  return arr


public class d_insertion__sort {
    public static void d_insertion__sort__check(int[] arr) {
        int arr_length = arr.length;
        for (int i = 1; i < arr_length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                arr[j + 1] = key;
            }
        }

        // printing the array
        for (int i = 0; i < arr_length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        d_insertion__sort__check(arr);
    }
}
