package one_code_each_day.Strings_Code;

import java.util.Map;
import java.util.HashMap;

public class first_non_repeating_character {
    public static void first_non_repeating_character_check(String sentence) {
        char[] chars = sentence.toCharArray();
        Map<Character, Integer> maps = new HashMap<>();
        for (Character chars_fetch : chars) {
            maps.put(chars_fetch, maps.getOrDefault(chars_fetch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entries : maps.entrySet()) {
            if (entries.getValue() > 1) {
                System.out.println("Repeating character: " + entries.getKey() + " , repeated: " + entries.getValue());
            } else {
                System.out.println("Non-Repeating character: " + entries.getKey() + " , repeated: " + entries.getValue());
            }
        }
    }

    public static void first_non_repeating_character_check_naive_solutions(String sentence1) {

        String sentence = sentence1.toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            boolean isChecked = false;
            for (int j = 1; j < i; j++) {
                if (sentence.charAt(i) == sentence.charAt(j)) {
                    isChecked = true;
                    break;
                }
            }

            if (isChecked) continue;
            int count = 1;
            for (int k = i + 1; k < sentence.length() - 1; k++) {
                if (sentence.charAt(k) == sentence.charAt(i)) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println("Duplicate character: " + sentence.charAt(i) + count);
            } else {
                System.out.println("No-Duplicate character: " + sentence.charAt(i) + count);
            }
        }
    }

    public static void main(String[] args) {
        String sentence = "Bangalore- City with unlimited hustle and dreams!";
        first_non_repeating_character_check(sentence);
        first_non_repeating_character_check_naive_solutions(sentence);
    }
}
