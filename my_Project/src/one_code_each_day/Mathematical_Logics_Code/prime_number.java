package one_code_each_day.Mathematical_Logics_Code;

public class prime_number {
    public static boolean prime_number_check(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean prime_number_check_using_square_root(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (prime_number_check_using_square_root(37)) {
            System.out.println("Prime number!");
        } else {
            System.out.println("Not a prime number!");
        }
    }
}
