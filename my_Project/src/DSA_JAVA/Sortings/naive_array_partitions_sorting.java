package DSA_JAVA.Sortings;

public class naive_array_partitions_sorting {
    public static void naive_array_partitions_sorting_check(
            int[] arr, int low_point, int highest_point, int target) {

        int[] temp = new int[highest_point - low_point + 1];

        int index = 0;

        // Put elements <= pivot before pivot
        for (int i = low_point; i <= highest_point; i++) {
            if (arr[i] <= arr[target] && i != target) {
                temp[index] = arr[i];
                index++;
            }
        }

        // Put pivot
        temp[index++] = arr[target];

        // Put elements > pivot after pivot
        for (int i = low_point; i <= highest_point; i++) {
            if (arr[i] > arr[target]) {
                temp[index] = arr[i];
                index++;
            }
        }

        // Copy back
        for (int i = low_point; i <= highest_point; i++) {
            arr[i] = temp[i - low_point];
        }

        for (int value : arr) {
            System.out.print(value + ", ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 9, 2, 6, 11, 4, 7, 3, 1, 7, 8};
        naive_array_partitions_sorting_check(arr, 0, arr.length - 1, 8);
    }
}
