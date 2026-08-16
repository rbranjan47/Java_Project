package one_code_each_day.Mathematical_Logics_Code;

import java.util.ArrayList;
import java.util.List;

public class prime_factors_number {
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

    public static List<Integer> prime_factors_number_check(int num) {
        List<Integer> factor_list = new ArrayList<>();
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                if (prime_number_check_using_efficient(i)) {
                    factor_list.add(i);
                }
            }
        }

        return factor_list;
    }

    public static void main(String[] args) {
        System.out.println(prime_factors_number_check(56));
        System.out.println(prime_factors_number_check(30030));
        System.out.println(prime_factors_number_check(96));
    }
}
