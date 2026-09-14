package DSA_JAVA.Sortings;

public class abc__sorting {


    // Sorting - In DSA, sorting is the process of arranging data in a particular order. The most common orders are ascending and descending.
    //           Sorting is important because it makes searching and analyzing data more efficient.

    // 1. Bubble Sort: This is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
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


    // 2. Selection Sort: This is an in-place comparison sorting algorithm. It has an O(n^2) time complexity, which makes it inefficient on large lists, and generally performs worse than the similar insertion sort.
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


    // 3. Insertion Sort: This is a simple sorting algorithm that builds the final sorted array (or list) one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. However, insertion sort provides several advantages:
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


    // 4. Merge Sort: This is an efficient, stable, comparison-based, divide and conquer sorting algorithm. Most implementations produce a stable sort, meaning that the implementation preserves the input order of equal elements in the sorted output.
    //                Merge sort is a divide and conquer algorithm that was invented by John von Neumann in 1945.
    //                Time Complexity: O(n log n) in all cases.
    //                Space Complexity: O(n) because it requires additional space for the temporary arrays used in the merging process.
    //                Example: Given an array [38, 27, 43, 3, 9, 82, 10], the merge sort algorithm will sort it to [3, 9, 10, 27, 38, 43, 82].
    //                Pseudocode:
    //                function mergeSort(arr)
    //                    if length(arr) > 1
    //                        mid = length(arr) / 2
    //                        leftHalf = arr[0..mid-1]
    //                        rightHalf = arr[mid..length(arr)-1]
    //                        mergeSort(leftHalf)
    //                        mergeSort(rightHalf)
    //                        merge(leftHalf, rightHalf, arr)
    //                return arr

    // 5. Quick Sort: This is an efficient, in-place sorting algorithm that, on average, makes O(n log n) comparisons to sort n items. In the worst case, it makes O(n^2) comparisons, though this behavior is rare. Quick sort is a divide and conquer algorithm.
    //                It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot.
    //                The sub-arrays are then sorted recursively.
    //                Time Complexity: O(n log n) on average, O(n^2) in the worst case.
    //                Space Complexity: O(log n) due to the recursive stack space.
    //                Example: Given an array [10, 7, 8, 9, 1, 5], the quick sort algorithm will sort it to [1, 5, 7, 8, 9, 10].
    //                Pseudocode:
    //                function quickSort(arr, low, high)
    //                    if low < high
    //                        pi = partition(arr, low, high)
    //                        quickSort(arr, low, pi - 1)
    //                        quickSort(arr, pi + 1, high)
    //                return arr

    // 6. Heap Sort: This is a comparison-based sorting technique based on a binary heap data structure. It is similar to selection sort where we first find the maximum element and place the maximum element at the end. We repeat the same process for the remaining elements.
    //                Time Complexity: O(n log n) in all cases.
    //                Space Complexity: O(1) because it is an in-place sorting algorithm.
    //                Example: Given an array [12, 11, 13, 5, 6, 7], the heap sort algorithm will sort it to [5, 6, 7, 11, 12, 13].
    //                Pseudocode:
    //                function heapSort(arr)
    //                    n = length(arr)
    //                    buildMaxHeap(arr, n)
    //                    for i from n-1 to 1
    //                        swap arr[0] and arr[i]
    //                        heapify(arr, 0, i)
    //                return arr

    // 7. Counting Sort: This is an integer sorting algorithm that operates by counting the number of objects that have distinct key values (kind of hashing). Then doing some arithmetic to calculate the position of each key value in the output sequence.
    //                Time Complexity: O(n + k) where n is the number of elements in the input array and k is the range of the input.
    //                Space Complexity: O(k) where k is the range of the input.
    //                Example: Given an array [4, 2, 2, 8, 3, 3, 1], the counting sort algorithm will sort it to [1, 2, 2, 3, 3, 4, 8].
    //                Pseudocode:
    //                function countingSort(arr, k)
    //                    count = array of size k initialized to 0
    //                    for i from 0 to length(arr)-1
    //                        count[arr[i]]++
    //                    for i from 1 to k-1
    //                        count[i] += count[i-1]
    //                    output = array of size length(arr)
    //                   for i from length(arr)-1 to 0
    //                        output[count[arr[i]]-1] = arr[i]
    //                        count[arr[i]]--
    //                    return output


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
