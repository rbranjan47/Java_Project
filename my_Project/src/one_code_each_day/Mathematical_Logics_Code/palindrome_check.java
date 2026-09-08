package one_code_each_day.Mathematical_Logics_Code;

public class palindrome_check {
    public static void palindrome_check_function(String value) {
//        int value_int = Integer.parseInt(value);
        String first_part;
        String second_part;
        //Using substring
        if (value.length() % 2 == 0) {
            first_part = value.substring(0, (value.length()) / 2);
            second_part = value.substring((value.length()) / 2);
        } else {
            first_part = value.substring(0, (value.length() + 1) / 2);
            second_part = value.substring((value.length() - 1) / 2);
        }
        second_part = String.valueOf(new StringBuilder(second_part).reverse());
        if (first_part.equals(second_part)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static void palindrome_check_without_using_inbuilt_methods(String value) {
//        if (value instanceof String) {
//            String reversedString = null;
//            for (int i = value.length() - 1; i >= 0; i--) {
//                reversedString = String.valueOf(new StringBuilder().append(value.charAt(i)));
//            }
//            if (reversedString.equals(value)) {
//                System.out.println("Palindrome");
//            } else {
//                System.out.println("Not a palindrome");
//            }
//        } else {
        int value_int = Integer.parseInt(value);
        int reversed_int = 0;
        int temp_int = value_int;
        while (temp_int != 0) {
            int last_digit = temp_int % 10;
            reversed_int = reversed_int * 10 + last_digit;
            temp_int = temp_int / 10;
        }

        if (reversed_int == value_int) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        //}
    }

    public static void main(String[] args) {
        palindrome_check_function("1221");
        palindrome_check_function("ABBA");
        palindrome_check_function("MOM");
        palindrome_check_function("RADAR");
        palindrome_check_function("tenet");
        palindrome_check_function("12321");
        palindrome_check_function("987656789");

        palindrome_check_without_using_inbuilt_methods("122421");
        palindrome_check_without_using_inbuilt_methods("987656789");
    }
}
