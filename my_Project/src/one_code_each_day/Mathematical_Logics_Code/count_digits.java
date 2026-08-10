package one_code_each_day.Mathematical_Logics_Code;

public class count_digits {
    public static int count_digits_given_number(int number) {
        if (number < 0) return 0;
        return String.valueOf(number).length();
    }

    public static int count_digits_given_number_using_loop(int number) {
        int count = 0;
        while (number > 0) {
            number = (number / 10);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count_digits_given_number(222222222));
        System.out.println(count_digits_given_number_using_loop(222222222));
    }
}
