package one_code_each_day.Arrays_Code;

public class move_zeros_to_end {
    public static void move_zeros_to_end_check_swapping(int[] arr) {
        int write_index = 0;
        for (int read_index = 0; read_index < arr.length - 1; read_index++) {
            if (arr[read_index] != 0) {
                int temp = arr[read_index];
                arr[read_index] = arr[write_index];
                arr[write_index] = temp;

                write_index++;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] integer_array = new int[]{2, 1, 0, 3, 0, 6, 7, 100, 10, 4};
        move_zeros_to_end_check_swapping(integer_array);
    }
}
