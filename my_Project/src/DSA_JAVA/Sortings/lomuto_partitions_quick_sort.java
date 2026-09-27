package DSA_JAVA.Sortings;

public class lomuto_partitions_quick_sort {

    public static void lumoto_partitions_quick_sort(int[] arr, int low_point, int high_point) {
        // low_point - This is the starting index of the array
        // high_point - This is the ending index of the array


        // pivot - This normally is the last element of the array, which is used to partition the array into two parts.
        //         The elements less than or equal to the pivot are placed on the left side, and the elements greater than the pivot are placed on the right side.
        int pivot = arr[high_point];
        int i = low_point - 1; // This is the index of the smaller element

        for (int j = low_point; j <= high_point - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i + 1] and arr[high_point]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high_point];
        arr[high_point] = temp;
    }

    public static void main(String[] args) {

        int arr[] = {30, 40, 20, 50, 80};
        int low_point = 0;
        int high_point = arr.length - 1;
        lumoto_partitions_quick_sort(arr, 0, high_point);
        System.out.print("Array after partitioning: ");
        for (int i = 0; i <= high_point; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
