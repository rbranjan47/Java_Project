package one_code_each_day.Recursion;

public class sum_of_digits_recursion {
    public static int sum_of_digits_without_recursion_check(int number) {
        if (number < 0) return 0;
        int sum = 0;
        while (number > 0) {
            int remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }
        return sum;
    }

    public static int sum_of_digits_with_loop_check(int number) {
        if (number <= 0) return 0;
        String[] number_Str = String.valueOf(number).split("");
        int sum = 0;
        for (int i = 0; i < number_Str.length; i++) {
            sum = sum + Integer.valueOf(number_Str[i]);
        }
        return sum;
    }

    public static int sum_of_digits_with_recursion_check(int number) {
        if (number <= 0) return 0;
        //using recursion
        return (number % 10) + sum_of_digits_with_recursion_check(number / 10);
    }

    public static void main(String[] args) {
        System.out.println(sum_of_digits_without_recursion_check(123));
        System.out.println(sum_of_digits_without_recursion_check(987654321));
        System.out.println(sum_of_digits_with_loop_check(123));
        System.out.println(sum_of_digits_with_loop_check(987654321));
        System.out.println(sum_of_digits_with_recursion_check(123));
        System.out.println(sum_of_digits_with_recursion_check(987654321));
    }
}
