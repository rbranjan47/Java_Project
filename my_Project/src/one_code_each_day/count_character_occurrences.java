package one_code_each_day;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class count_character_occurrences {

    public static void count_character_occurrences_check(String sentence) {
        for (int p = 0; p < sentence.length() - 1; p++) {
            char[] chars = sentence.toCharArray();
            if (chars[p] >= 'A' && chars[p] <= 'Z') {
                chars[p] = (char) (chars[p] + 32);
            }
        }
        for (int i = 0; i < sentence.length() - 1; i++) {
            boolean alreadyCounted = false;
            for (int j = 1; j < i; j++) {
                if (sentence.charAt(i) == sentence.charAt(j)) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) continue;
            int count = 1;
            for (int k = i + 1; k < sentence.length(); k++) {
                if (sentence.charAt(k) == sentence.charAt(i)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Duplicate characters: " + sentence.charAt(i) + " count: " + count);
            }
        }
    }

    public static void count_character_occurrences_check_using_hashmap(String sentence) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character chars : sentence.toCharArray()) {
            map.put(chars, map.getOrDefault(chars, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entries : map.entrySet()) {
            if (entries.getValue() > 1) {
                System.out.println("Duplicate string: " + entries.getKey() + " , count: " + entries.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String sentence = "Bangalore- City with unlimited hustle and dreams!";
        count_character_occurrences_check(sentence);

        count_character_occurrences_check_using_hashmap(sentence);
    }
}
