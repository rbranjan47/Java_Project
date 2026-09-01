package one_code_each_day.Mathematical_Logics_Code;

public class swap_without_temp_variables {
    public static void swap_without_temp_variables_check_suing_addition(int num1, int num2) {
        System.out.println("Before swapping:" + num1 + " " + num2);
        int total = num1 + num2;
        num1 = total - num1;
        num2 = total - num2;

        System.out.println("After swapping:" + num1 + " " + num2);
    }

    public static void main(String[] args) {
        swap_without_temp_variables_check_suing_addition(3, 5);
    }
}
