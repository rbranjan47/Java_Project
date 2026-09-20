package DSA_JAVA.Sortings;

public class intersection_of_two_sorted_array {

    // To print the intersection of two sorted arrays, means to find the common elements present in both arrays.


    // Using naive solution
    public static void intersection_of_two_sorted_array_check(int[] arr1, int[] arr2) {
        int arr1_length = arr1.length;
        int arr2_length = arr2.length;

        for (int i = 0; i < arr1_length; i++) {
            if (i > 0 && arr1[i] == arr1[i - 1])
                continue;
            for (int j = 0; j < arr2_length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }

    //Best solution using two pointer approach
    // This is comparing element from both the element  if-
    // arr1[i] < arr2[j] then increment i
    // arr1[i] > arr2[j] then increment j
    // arr1[i] == arr2[j] then print the element and increment both i and j

    public static void intersection_of_two_sorted_array_check_using_two_pointer(int[] arr1, int[] arr2) {
        int arr1_length = arr1.length;
        int arr2_length = arr2.length;

        int i = 0, j = 0;
        while (i < arr1_length && j < arr2_length) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 4, 5, 6};
        int arr2[] = {2, 2, 3, 4, 4, 5};

        intersection_of_two_sorted_array_check(arr1, arr2);
        intersection_of_two_sorted_array_check_using_two_pointer(arr1, arr2);
    }
}
