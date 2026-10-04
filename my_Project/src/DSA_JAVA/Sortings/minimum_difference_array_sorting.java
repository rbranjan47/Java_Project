package DSA_JAVA.Sortings;

public class minimum_difference_array_sorting {

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

        int quick_sorted_arr[] = quick_sort_using_lomuto_partitions(arr, 0, arr.length - 1);
        System.out.println("Quick Sorted: ");
        for (int values : quick_sorted_arr) {
            System.out.print(values + ", ");
        }
        System.out.println();

//        Now, subtract first and second element for the minimum difference
//        System.out.println("Minimum difference: " + (arr[1] - arr[0]));  -- This is buggy solution

        // To find minimum value
        int minDiff = Integer.MAX_VALUE;
        for (int k = 1; k < arr.length; k++) {
            minDiff = Math.min(minDiff, arr[k] - arr[k - 1]);
        }
        System.out.println("Minimum difference: " + minDiff);
    }
}
