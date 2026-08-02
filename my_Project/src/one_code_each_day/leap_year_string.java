package one_code_each_day;

public class leap_year_string {

    public static boolean leap_year_string_check(int num) {
        if (num % 400 == 0 || (num % 100 != 0 && num % 4 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        if (leap_year_string_check(2024)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
