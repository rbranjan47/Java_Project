package one_code_each_day.Mathematical_Logics_Code;

public class swap_without_temp_variables {
    public static void swap_without_temp_variables_check_using_addition(int num1, int num2) {
        System.out.println("Before swapping:" + num1 + " " + num2);
        int total = num1 + num2;
        num1 = total - num1;
        num2 = total - num2;

        System.out.println("After swapping:" + num1 + " " + num2);
    }

    public static void swap_without_temp_variables_check_for_string(String str1, String str2) {
        System.out.println(str1);
        System.out.println(str2);

        str1 = str1 + str2;

        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println(str1);
        System.out.println(str2);
    }

    public static void main(String[] args) {
        swap_without_temp_variables_check_using_addition(3, 5);
        swap_without_temp_variables_check_for_string("hello", "world");

        System.out.println("Hello".substring(2));
    }
}
