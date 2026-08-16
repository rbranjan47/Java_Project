package one_code_each_day.Mathematical_Logics_Code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class all_divisors_of_number {
    public static List<Integer> all_divisors_of_number_check(int number) {
        List<Integer> lists = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                lists.add(i);
            }
        }
        return lists;
    }


    public static List<Integer> all_divisors_of_number_check_using_under_root(int number) {
        List<Integer> lists = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                lists.add(i);
                if (i != number / i) {
                    lists.add(number / i);
                }
            }
        }
        Collections.sort(lists);
        return lists;
    }

    public static void main(String[] args) {
        System.out.println(all_divisors_of_number_check(60));
        System.out.println(all_divisors_of_number_check_using_under_root(60));
    }
}
