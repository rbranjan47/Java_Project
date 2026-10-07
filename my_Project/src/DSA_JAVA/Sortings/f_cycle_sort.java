package DSA_JAVA.Sortings;


// Cycle sort - Cycle sort is an in-place, non-comparison based sorting algorithm that is based on the idea of placing each element in its correct position.
//              It is particularly useful when the range of input values is known and limited.
//              The algorithm works by identifying cycles in the permutation of the array and rotating them to their correct positions.
//              Time Complexity: O(n^2) in the worst case, but it can be more efficient than other O(n^2) algorithms for certain types of input.
//              Space Complexity: O(1) because it is an in-place sorting algorithm.
//              Example: Given an array [3, 1, 5, 2, 4], the cycle sort algorithm will sort it to [1, 2, 3, 4, 5].
//
//            Sudo code: function cycleSort(arr)
//                        n = length(arr)
//                        for cycle_start from 0 to n-2
//                            item = arr[cycle_start]
//                            pos = cycle_start
//                            for i from cycle_start+1 to n-1
//                                if arr[i] < item
//                                    pos += 1
//                            if pos == cycle_start
//                                continue
//                            while item == arr[pos]
//                                pos += 1
//                            swap item and arr[pos]
//                            while pos != cycle_start
//                                pos = cycle_start
//                                for i from cycle_start+1 to n-1
//                                    if arr[i] < item
//                                        pos += 1
//                                while item == arr[pos]
//                                    pos += 1
//                                swap item and arr[pos]
//

public class f_cycle_sort {
    public static void cycle_sort(int[] arr) {
        int arr_length = arr.length;
        for (int cycle_start = 0; cycle_start < arr_length - 1; cycle_start++) {
            int item = arr[cycle_start];
            int pos = cycle_start;

            for (int i = cycle_start + 1; i < arr_length; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }

            if (pos == cycle_start) {
                continue;
            }

            while (item == arr[pos]) {
                pos++;
            }

            if (pos != cycle_start) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }

            while (pos != cycle_start) {
                pos = cycle_start;

                for (int i = cycle_start + 1; i < arr_length; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }

                while (item == arr[pos]) {
                    pos++;
                }

                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 4};
        cycle_sort(arr);
        System.out.print("Sorted array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
