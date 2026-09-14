package one_code_each_day.Strings_Code;

public class check__string_rotations {
    public static boolean check__string_rotations_check(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        String combined_str1 = str1 + str1;
        if (combined_str1.contains(str2)) {
            return true;
        }
        return false;
    }

    public static void check__string_rotations_check_using_pattern_search_algorithm(String str1, String str2) {

        // Here we have to write pattern searching algorithm not subsequence
        String combined_str1 = str1 + str1;
        int str1_index = combined_str1.length();
        int str2_index = str2.length();

        for (int i = 0; i <= str1_index - str2_index; i++) {
            int j;
            for (j = 0; j < str2_index; j++) {
                if (combined_str1.charAt(i + j) != str2.charAt(j)) {
                    break;
                }
            }
            if (j == str2_index) {
                System.out.println("Anagram Rotations");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(check__string_rotations_check("ABCD", "BCDA") ? "Anagram Rotations" : "Not an Anagram Rotations");

        System.out.println(check__string_rotations_check("ABCD", "CDBA") ? "Anagram Rotations" : "Not an Anagram Rotations");

        check__string_rotations_check_using_pattern_search_algorithm("ABCD", "BCDA");
    }
}
