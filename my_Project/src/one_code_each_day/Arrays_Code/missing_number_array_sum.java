package one_code_each_day.Arrays_Code;

public class missing_number_array_sum {

    public static int missing_number_array_sum_check(int[] integer_array, int sum) {
        int array_sum = 0;
        for (int j : integer_array) {
            array_sum += j;
        }
        return sum - array_sum;
    }

    public static void main(String[] args) {
        int[] integer_array = {2, 1, 2, 3, 4, 6, 7, 100, 10, 4};
        int sum = 150;
        System.out.println(missing_number_array_sum_check(integer_array, sum));
    }
}
