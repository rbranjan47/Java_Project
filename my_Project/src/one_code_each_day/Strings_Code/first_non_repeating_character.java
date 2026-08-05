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

    public static void main(String[] args) {
        String sentence = "Bangalore- City with unlimited hustle and dreams!";
        first_non_repeating_character_check(sentence);
    }
}
