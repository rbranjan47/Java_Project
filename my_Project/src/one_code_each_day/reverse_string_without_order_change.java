package one_code_each_day;

public class reverse_string_without_order_change {
    public static StringBuilder reverse_string_without_order_change_check(String sentence) {
        StringBuilder newString = new StringBuilder();
        String[] sentence_arrays = sentence.split(" ");
        for (int i = 0; i < sentence_arrays.length; i++) {
            for (int j = sentence_arrays[i].length() - 1; j >= 0; j--) {
                newString.append(sentence_arrays[i].charAt(j));
            }
            if (i != sentence_arrays.length - 1) {
                newString.append(" ");
            }
        }
        return newString;
    }

    //This revered but changed the order
    public static String reverse_string_with_order_change_using_stringBuilder(String sentence) {
        StringBuilder sentence_stringBuilder = new StringBuilder(sentence);
        sentence_stringBuilder.reverse();
        return new String(sentence_stringBuilder);
    }

    public static String reverse_string_without_order_change_using_stringBuilder(String sentence) {
        String[] sentence_arrays = sentence.split(" ");
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < sentence_arrays.length; i++) {
            StringBuilder sentence_arrays_stringBuilder = new StringBuilder(sentence_arrays[i]);
            sentence_arrays_stringBuilder.reverse();
            newString.append(sentence_arrays_stringBuilder);

            if (i != sentence_arrays.length - 1) {
                newString.append(" ");
            }
        }
        return new String(newString);
    }

    public static void main(String[] args) {
        String sentence = "Bangalore- City with unlimited hustle and dreams!";
        StringBuilder reversedString01 = reverse_string_without_order_change_check(sentence);
        System.out.println(reversedString01);

        String reversedString02 = reverse_string_with_order_change_using_stringBuilder(sentence);
        System.out.println(reversedString02);
        String reversedString03 = reverse_string_without_order_change_using_stringBuilder(sentence);
        System.out.println(reversedString03);
    }
}
