package DSA_JAVA.Sortings;

public class kth_smallest_element_array_sorting {

    // To solve this problem-
    // 1. Sort the Array
    // 2. And, then find that kth element at (k-1) position in the array

    // Sorting using bubble sort
    public static int[] bubble_sort(int[] arr) {
        int arr_length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr_length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Sorting using selection sort
    public static int[] selection_sort(int[] arr) {
        int arr_length = arr.length;
        for (int i = 0; i < arr_length - 1; i++) {
            int selected_index = i;

            for (int j = i + 1; j < arr_length; j++) {
                if (arr[j] < arr[selected_index]) {
                    selected_index = j;
                }
            }

            // after finding the minimum selected index, swap the value
            int temp = arr[i];
            arr[i] = arr[selected_index];
            arr[selected_index] = temp;
        }
        return arr;
    }

    // Sorting using quick sort - 1. lomuto partitions and then quick sort
    public static int lomuto_partitions(int[] arr, int low_point, int high_point) {
        //pivot element- last element of array
        int pivot = arr[high_point];
        // swapping index
        int i = low_point - 1;
        for (int j = low_point; j <= high_point - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap the current element with next element
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // if not the smaller element then swap the element with last element
        int temp = arr[i + 1];
        arr[i + 1] = arr[high_point];
        arr[high_point] = temp;

        return i + 1;
    }

    public static int[] quick_sort_using_lomuto_partitions(int[] arr, int low_point, int high_point) {
        if (low_point < high_point) {
            int partitions_point = lomuto_partitions(arr, low_point, high_point);
            quick_sort_using_lomuto_partitions(arr, low_point, partitions_point - 1);
            quick_sort_using_lomuto_partitions(arr, partitions_point + 1, high_point);
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {22, 34, 67, 21, 2, 98, 106, 15};

        int bubble_sorted_arr[] = bubble_sort(arr);
        System.out.println("Bubble Sorted: ");
        for (int values : bubble_sorted_arr) {
            System.out.print(values + ", ");
        }
        System.out.println();
        int selection_sorted_arr[] = selection_sort(arr);
        System.out.println("Selection Sorted: ");
        for (int values : selection_sorted_arr) {
            System.out.print(values + ", ");
        }
        System.out.println();
        int quick_sorted_arr[] = quick_sort_using_lomuto_partitions(arr, 0, arr.length - 1);
        System.out.println("Quick Sorted: ");
        for (int values : quick_sorted_arr) {
            System.out.print(values + ", ");
        }

        System.out.println();
        // To get the kth smallest
        int k = 4;
        System.out.println(k + "th smallest number is " + arr[k - 1]);
    }
}
