package DSA_JAVA.Sortings;


// 2. Selection Sort (Unstable): This is an in-place comparison sorting algorithm. It has an O(n^2) time complexity, which makes it inefficient on large lists, and generally performs worse than the similar insertion sort.
//                    The algorithm divides the input list into two parts: a sorted sublist of items which is built up from left to right at the front (left) of the list and a sublist of the remaining unsorted items that occupy the rest of the list. Initially, the sorted sublist is empty and the unsorted sublist is the entire input list.
//                    The algorithm proceeds by finding the smallest (or largest, depending on sorting order) element in the unsorted sublist, exchanging it with the leftmost unsorted element (putting it in sorted order), and moving the sublist boundaries one element to the right.
//                   Time Complexity: O(n^2) in all cases.
//                   Space Complexity: O(1) because it is an in-place sorting algorithm.
//                   Example: Given an array [64, 25, 12, 22, 11], the selection sort algorithm will sort it to [11, 12, 22, 25, 64].
//                   Pseudocode:
//                   function selectionSort(arr)
//                       n = length(arr)
//                       for i from 0 to n-1
//                           minIndex = i
//                           for j from i+1 to n
//                               if arr[j] < arr[minIndex]
//                                   minIndex = j
//                           swap arr[minIndex] and arr[i]
//                   return arr

public class b_selection__sort {
    public static void b_selection_sort_naive_implementation(int[] arr) {
        int arr_length = arr.length;
        for (int i = 0; i < arr_length - 1; i++) {
            int minimum_index = i;
            for (int j = i + 1; j < arr_length; j++) {
                if (arr[j] < arr[minimum_index]) {
                    minimum_index = j;
                    // swap the value
                }
            }
            int temp = arr[minimum_index];
            arr[minimum_index] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr_length; i++) {
            System.out.print(arr[i] +", ");
        }
    }

    public static void main(String[] args) {
        int arr[] =  { 64, 25, 12, 22, 11 };
        b_selection_sort_naive_implementation(arr);
    }
}
