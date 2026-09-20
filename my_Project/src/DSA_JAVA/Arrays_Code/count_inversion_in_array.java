package DSA_JAVA.Arrays_Code;

public class count_inversion_in_array {
    // Inversion - A pair in array that forms an inversion when i < j and arr[i] > arr[j]

    public static void count_inversion_in_array_check(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        count_inversion_in_array_check(arr);
    }
}
