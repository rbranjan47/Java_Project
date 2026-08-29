package one_code_each_day.Arrays_Code;

public class second_largest_element {

    public static int second_largest_element_check(int[] integerArray) {
        int largestElement = integerArray[1];
        int secondLargestElement = 0;
        int thirdLargestElement = 0;

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] > largestElement) {
                largestElement = integerArray[i];
            }
        }

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] > secondLargestElement && integerArray[i] != largestElement) {
                secondLargestElement = integerArray[i];
            }
        }

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] > thirdLargestElement && integerArray[i] != largestElement && integerArray[i] != secondLargestElement) {
                thirdLargestElement = integerArray[i];
            }
        }
        return thirdLargestElement;
    }

    public static void main(String[] args) {
        int[] integerArrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 11, -1, 12};
        int[] integerArrays1 = {12, 12, 12, 7, 6};
        System.out.println(second_largest_element_check(integerArrays));
        System.out.println(second_largest_element_check(integerArrays1));
    }
}
