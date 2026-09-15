package DSA_JAVA.Sortings;

public class a_bubble_sort {

    // 1. Bubble Sort (Stable): This is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
    //                 The pass through the list is repeated until the list is sorted. The algorithm gets its name because smaller elements "bubble" to the top of the list.

    //                Time Complexity: O(n^2) in the average and worst case, O(n) in the best case (when the array is already sorted).
    //                Space Complexity: O(1) because it is an in-place sorting algorithm.

    //                Example: Given an array [5, 2, 9, 1, 5, 6], the bubble sort algorithm will sort it to [1, 2, 5, 5, 6, 9].

    //                Pseudocode:
    //                function bubbleSort(arr)
    //                    n = length(arr)
    //                    for i from 0 to n-1
    //                        for j from 0 to n-i-1
    //                            if arr[j] > arr[j+1]
    //                                swap arr[j] and arr[j+1]
    //                   return arr

    public static void bubble_sort_check(int[] arr) {
        int arr_length = arr.length;
        for (int i = 0; i < arr_length; i++) {
            for (int j = 0; j < arr_length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int arr_value : arr) {
            System.out.print(arr_value + ", ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 9, 2, 8, 3, 7, 4, 6, 5};
        bubble_sort_check(arr);
    }
}
