package one_code_each_day.Strings_Code;

public class subsequence_string {

    // Subsequence- a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.
    // Example - for abc , the subsequences are a, b, c, ab, ac, bc, abc and "" (empty string)

    public static boolean isSubsequence(String sub_str, String main_str) {
        int sub_str_index = 0;
        int main_str_index = 0;

        while (sub_str_index < sub_str.length() && main_str_index < main_str.length()) {
            if (sub_str.charAt(sub_str_index) == main_str.charAt(main_str_index)) {
                sub_str_index++;
            }
            main_str_index++;
        }

        if (sub_str_index == sub_str.length()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc")); // true
        System.out.println(isSubsequence("a", "abcde")); // true
        System.out.println(isSubsequence("da", "abcde")); // false
    }
}
