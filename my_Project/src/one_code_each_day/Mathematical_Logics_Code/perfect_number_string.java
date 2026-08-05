package one_code_each_day.Mathematical_Logics_Code;

// If number divisors sum = number, then it is a perfect number
// Example- 6 (3,2,1) = 3 + 2 + 1 = 6
// Logic - Add all the values less than given number which divides given number and remainder is 0.

public class perfect_number_string {

    public static boolean perfect_number(String num) {
        int number = Integer.valueOf(num);
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        if (perfect_number("6")) {
            System.out.println("Perfect number!");
        } else {
            System.out.println("Not a perfect number!");
        }
    }
}
