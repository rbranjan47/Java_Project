package DSA_JAVA.Sortings;

// Quick Sort (Unstable): This is an efficient, in-place sorting algorithm that, on average, makes O(n log n) comparisons to sort n items.
//                In the worst case, it makes O(n^2) comparisons, though this behavior is rare. Quick sort is a divide and conquer algorithm.
//                It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot.
//                The sub-arrays are then sorted recursively.
//                Time Complexity: O(n log n) on average, O(n^2) in the worst case.
//                Space Complexity: O(log n) due to the recursive stack space.
//                Example: Given an array [10, 7, 8, 9, 1, 5], the quick sort algorithm will sort it to [1, 5, 7, 8, 9, 10].
//
//                Pseudocode:
//                function quickSort(arr, low, high)
//                    if low < high
//                        pi = partition(arr, low, high)
//                        quickSort(arr, low, pi - 1)
//                        quickSort(arr, pi + 1, high)
//                return arr

public class e_quick_sort {

}
