package one_code_each_day.Strings_Code;

public class reverse_string_order {
    public static String reverse_string_order_naive_solutions(String str) {
        String[] str_array = str.split(" ");
        StringBuilder strBuilder = new StringBuilder();
        for (int i = str_array.length - 1; i >= 0; i--) {
            strBuilder.append(str_array[i] + " ");
        }
        return String.valueOf(strBuilder);
    }

    public static void main(String[] args) {
        String str = "Hello World. This is a hello message!";
        System.out.println(reverse_string_order_naive_solutions(str));
    }
}
