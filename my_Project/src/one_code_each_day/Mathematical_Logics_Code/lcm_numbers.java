package one_code_each_day.Mathematical_Logics_Code;

public class lcm_numbers {
    public static int hcf_numbers_check(int num1, int num2) {
        if (num1 <= 0 && num2 <= 0) return 0;
        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }

    public static int lcm_numbers_check(int num1, int num2) {
        return (num1 * num2) / hcf_numbers_check(num1, num2);
    }

    public static void main(String[] args) {
       System.out.println( lcm_numbers_check(12, 15));
    }
}
