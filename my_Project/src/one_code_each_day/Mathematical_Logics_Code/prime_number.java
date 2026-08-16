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

    public static boolean prime_number_check_using_efficient(int num) {
        if (num == 1) return false;
        if (num == 2 || num == 3 || num == 5) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i <= Math.sqrt(num); i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(prime_number_check(5));
        System.out.println(prime_number_check(27));
        System.out.println(prime_number_check(28));
        System.out.println(prime_number_check(67));
        System.out.println(prime_number_check(79));
        System.out.println(prime_number_check(111));
        System.out.println("-----------------------");
        System.out.println(prime_number_check_using_square_root(5));
        System.out.println(prime_number_check_using_square_root(27));
        System.out.println(prime_number_check_using_square_root(28));
        System.out.println(prime_number_check_using_square_root(67));
        System.out.println(prime_number_check_using_square_root(79));
        System.out.println(prime_number_check_using_square_root(111));
        System.out.println("-----------------------");
        System.out.println(prime_number_check_using_efficient(5));
        System.out.println(prime_number_check_using_efficient(27));
        System.out.println(prime_number_check_using_efficient(28));
        System.out.println(prime_number_check_using_efficient(67));
        System.out.println(prime_number_check_using_efficient(79));
        System.out.println(prime_number_check_using_efficient(111));
        System.out.println(prime_number_check_using_efficient(2));
        System.out.println(prime_number_check_using_efficient(3));
        System.out.println(prime_number_check_using_efficient(5));
        System.out.println(prime_number_check_using_efficient(7));
    }
}
