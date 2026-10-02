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


public class e_quick_sort_using_lomuto_partitions {
    public static void quick_sort_using_lomuto_partitions(int arr[], int low_point, int high_point) {

        if (low_point < high_point) {
            int partition_point = lomuto_partitions(arr, low_point, high_point);

            quick_sort_using_lomuto_partitions(arr, low_point, partition_point - 1);
            quick_sort_using_lomuto_partitions(arr, partition_point + 1, high_point);
        }
    }

    public static int lomuto_partitions(int[] arr, int low_point, int high_point) {
        // taking last element as pivot element
        int pivot_element = arr[high_point];
        int j = low_point - 1;

        // Checking if arr element is smaller than pivot element
        for (int i = low_point; i <= high_point - 1; i++) {
            if (arr[i] < pivot_element) {
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[j + 1];
        arr[j + 1] = arr[high_point];
        arr[high_point] = temp;
        return j + 1;
    }

    public static void main(String[] args) {
        int arr[] = {30, 40, 20, 50, 80};
        int low_point = 0;
        int high_point = arr.length - 1;
        quick_sort_using_lomuto_partitions(arr, 0, high_point);
        System.out.print("Array after partitioning: ");
        for (int i = 0; i <= high_point; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
