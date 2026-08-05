package one_code_each_day.Mathematical_Logics_Code;

import java.util.Scanner;
import java.util.regex.Pattern;

public class sum_of_digits_of_number {

    public static void sum_of_digits_of_given_number(String num) throws Exception {
        String[] num_array = num.split("");
        Double sum = 0.00;
        if (Double.parseDouble(num) < 0) {
            throw new Exception("Enter valid number");
        }
        // Can sum also decimal value, summing only digits
        for (int i = 0; i < num_array.length; i++) {
            if (Pattern.compile("\\d").matcher(num_array[i]).find()) {
                sum = sum + Double.parseDouble(num_array[i]);
            }
        }
        System.out.println(num + " number sum: " + sum);
    }

    public static void main(String[] args) throws Exception {
        // In O(n)
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any number: ");
        String value = scn.nextLine();

        sum_of_digits_of_given_number(value);
    }
}
