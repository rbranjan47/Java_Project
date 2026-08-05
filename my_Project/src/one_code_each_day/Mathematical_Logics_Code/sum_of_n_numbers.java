package one_code_each_day.Mathematical_Logics_Code;

import java.util.Scanner;

public class sum_of_n_numbers {

    /*This is to sum of n numbers.
        i.e. if given n = 5, then 5 + 4 + 3 + 2 + 1 = 15
        We know 1 formula, i.e. n(n+1)/2
        */
    public static double find_sum_of_n_numbers(String value) {
        Double re_number = Double.parseDouble(value);
        if (re_number <= 0) {
            System.out.println("Invalid number, Please enter positive number!");
            return 0;
        } else {
            double sum = (double) (re_number * (re_number + 1)) / 2;
            return sum;
        }
    }

    //Using recursion- DSA
    public static double find_sum_of_n_numbers_recursion(String value){
       if(Double.parseDouble(value) > 0.00){
           Double re_number = Double.parseDouble(value);
           return re_number + find_sum_of_n_numbers_recursion(String.valueOf(re_number-1.00));
       } else {
           return 0.00;
       }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any number: ");
        String value = scn.nextLine();

        if (find_sum_of_n_numbers(value) == 0) {
        } else {
            System.out.println(find_sum_of_n_numbers(value));
        }

        System.out.print("Using Recursion: ");
        System.out.println(find_sum_of_n_numbers_recursion(value));
    }
}
