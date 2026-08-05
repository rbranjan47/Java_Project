package one_code_each_day.Arrays_Code;

public class largest_and_smallest_array_element {
    public static int check_array_largest_element(int[] input_array) {
        int largestEle = input_array[1];
        for (int i = 0; i < input_array.length - 1; i++) {
            if (input_array[i] > largestEle) {
                largestEle = input_array[i];
            }
        }
        return largestEle;
    }

    public static int check_array_smallest_element(int[] input_array) {
        int smallestEle = input_array[1];
        for (int i = 0; i < input_array.length - 1; i++) {
            if (input_array[i] < smallestEle) {
                smallestEle = input_array[i];
            }
        }
        return smallestEle;
    }

    public static void main(String[] args) {
        int[] integer_array = {1, 2, 3, 4, 6, 7, 100, 10};
        System.out.println(check_array_largest_element(integer_array));
        System.out.println(check_array_smallest_element(integer_array));
    }
}
