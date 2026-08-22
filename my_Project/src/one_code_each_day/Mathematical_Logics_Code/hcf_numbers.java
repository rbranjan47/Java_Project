package one_code_each_day.Mathematical_Logics_Code;

public class hcf_numbers {
    public static int hcf_numbers_check(int num1, int num2) {
        if (num2 == 0) return num1;

        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }

    // Euclidean Algorithm
    public static int hcf_numbers_check_by_euclidean_algorithm(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    public static void main(String[] args) {
        System.out.println(hcf_numbers_check(12, 24));
        System.out.println(hcf_numbers_check(12, 13));
        System.out.println(hcf_numbers_check(3, 8));
        System.out.println(hcf_numbers_check_by_euclidean_algorithm(6, 7));
        System.out.println(hcf_numbers_check_by_euclidean_algorithm(12, 13));
        System.out.println(hcf_numbers_check_by_euclidean_algorithm(6, 24));
    }
}
