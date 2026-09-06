package one_code_each_day.Strings_Code;

public class string_character_count {
    public static void string_character_count_find_with_also_duplicate(String strs) {
        String[] strs_array = strs.split("");
        for (int i = 0; i < strs_array.length - 1; i++) {
            boolean isCounted = false;
            for (int j = 1; j < i; j++) {
                if (strs_array[i].equals(strs_array[j])) {
                    isCounted = true;
                    break;
                }
            }
            int count = 1;
            if (isCounted) continue;
            for (int k = i + 1; k < strs_array.length; k++) {
                if (strs_array[i].equals(strs_array[k])) {
                    count++;
                }
            }
            System.out.println("Character: " + strs_array[i] + " count: " + count);
        }
    }


    public static void main(String[] args) {
        string_character_count_find_with_also_duplicate("hello world");
    }
}
