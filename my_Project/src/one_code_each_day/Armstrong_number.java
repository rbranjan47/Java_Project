package one_code_each_day;

import java.util.Scanner;

public class Armstrong_number {

    // Armstrong number
    // A number that equals the sum of its own digits, each raised to the power of the total number of digits
    public static void armstrong_number_check(int num) {
        int sum = 0;
        if (num > 0) {
            String[] num_spilt = String.valueOf(num).split("");
            for (int i = 0; i < num_spilt.length; i++) {
                int digit = Integer.parseInt(String.valueOf(num_spilt[i]));
                int power = num_spilt.length;
                // sum = sum + ((Integer.parseInt(String.valueOf(num_spilt[i]))) * (Integer.parseInt(String.valueOf(num_spilt[i]))) * (Integer.parseInt(String.valueOf(num_spilt[i]))));
                sum += (int) Math.pow(digit, power);
            }
            if (sum == num) {
                System.out.println("Armstrong number!");
            } else {
                System.out.println("Not an armstrong number!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any number: ");
        String value = scn.nextLine();
        armstrong_number_check(Integer.parseInt(value));
    }
}
