package one_code_each_day;

public class prime_number_string {
    public static boolean prime_number_check(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (prime_number_check(7)) {
            System.out.println("Prime number!");
        } else {
            System.out.println("Not a prime number!");
        }
    }
}
