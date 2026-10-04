package DSA_JAVA.Sortings;

public class array_sorting_based_on_types {

    public static int[] array_sorting_based_on_types_check_odd_even(int[] arr) {
        // This sorting based on swapping concept. The same concept which we used to move all zero present in the array to end
        // To start-
        // 1. Initialize a variable for write index
        // 2. Now, using a loop check if element is satisfying the conditions
        // 3. And then if condition satisfy then swap with i (read_index) with write index

        int write_index = 0;
        for (int read_index = 0; read_index < arr.length; read_index++) {
            if (arr[read_index] % 2 == 0) {
                int temp = arr[read_index];
                arr[read_index] = arr[write_index];
                arr[write_index] = temp;

                write_index++;
            }
        }
        return arr;
    }

    public static int[] array_sorting_based_on_types_check_positive_negative(int[] arr) {
        // This sorting based on swapping concept. The same concept which we used to move all zero present in the array to end
        // To start-
        // 1. Initialize a variable for write index
        // 2. Now, using a loop check if element is satisfying the conditions
        // 3. And then if condition satisfy then swap with i (read_index) with write index

        int write_index = 0;
        for (int read_index = 0; read_index < arr.length; read_index++) {
            if (arr[read_index] < 0) {
                int temp = arr[read_index];
                arr[read_index] = arr[write_index];
                arr[write_index] = temp;

                write_index++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {22, 34, 67, 21, 2, 98, -9, 106, 15, -1};
        int[] array_sorted_based_on_odd_even_type = array_sorting_based_on_types_check_positive_negative(arr);
        for (int values : array_sorted_based_on_odd_even_type) {
            System.out.print(values + ", ");
        }
    }
}
