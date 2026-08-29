package one_code_each_day.Arrays_Code;

public class check_arraySorted {
    public static boolean check_arrayAscendingSorted_NaiveCheck(int[] arr) {
        if (arr == null || arr.length < 2) {
            return true;
        }

        boolean checkSortedAscendingOrder = true;
        // Checking using naive solution
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                checkSortedAscendingOrder = false;
                break;
            }
        }
        return checkSortedAscendingOrder;
    }

    public static boolean check_arrayDescendingSorted_NaiveCheck(int[] arr) {
        if (arr == null || arr.length < 2) {
            return true;
        }

        boolean checkSortedDescendingOrder = true;
        // Checking using naive solution
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                checkSortedDescendingOrder = false;
                break;
            }
        }
        return checkSortedDescendingOrder;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arr2[] = {5, 3, 8, 10};
        System.out.println(check_arrayAscendingSorted_NaiveCheck(arr1) || check_arrayDescendingSorted_NaiveCheck(arr1));
        System.out.println(check_arrayAscendingSorted_NaiveCheck(arr2) || check_arrayDescendingSorted_NaiveCheck(arr2));
    }
}
