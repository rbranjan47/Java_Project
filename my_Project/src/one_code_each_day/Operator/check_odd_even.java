package one_code_each_day.Operator;

public class check_odd_even {

    public static void check_odd_even_number(int num) {
        // Checking odd and even number using bitwise operator
        // Even number have last bit 0 and odd number have last bit 1
        // Here it is checking the last bit of the number using bitwise AND operator (&) with 1. If the result is 0, then the number is even, otherwise it is odd.
        if ((num & 1) == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }

    public static void main(String[] args) {
        check_odd_even_number(5);
        check_odd_even_number(10);
    }
}
