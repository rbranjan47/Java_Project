package one_code_each_day.Strings_Code;

//Anagram- a word or phrase made by mixing up the letters of another word or phrase, using all the original letters exactly once

import java.util.Arrays;

public class anagram_string {
    public static boolean anagram_string_check(String sentence1, String sentence2) {
        boolean anagramCheck = false;
        String[] sentence1_array = sentence1.split("");
        if (sentence1.length() != sentence2.length()) {
            return false;
        }
        for (int i = 0; i < sentence1_array.length; i++) {
            if (sentence2.contains(sentence1_array[i])) {
                anagramCheck = true;
            } else {
                anagramCheck = false;
                break;
            }
        }
        return anagramCheck;
    }

    public static boolean anagram_check_removing_character(String sentence1, String sentence2) {
        String[] sentence_array1 = sentence1.split("");
        String temporary_sentence2 = sentence2;
        if (sentence1.length() != temporary_sentence2.length()) {
            return false;
        }
        for (int i = 0; i < sentence_array1.length; i++) {
            if (temporary_sentence2.contains(sentence_array1[i])) {
                temporary_sentence2 = temporary_sentence2.replace(sentence_array1[i], "");
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean anagram_check_sorting(String sentence1, String sentence2) {
        if (sentence1.length() != sentence2.length()) {
            return false;
        }
        char[] sentence1_array = sentence1.toCharArray();
        char[] sentence2_array = sentence2.toCharArray();
        Arrays.sort(sentence1_array);
        Arrays.sort(sentence2_array);
        if (Arrays.equals(sentence1_array, sentence2_array)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String sentence1 = "abb";
        String sentence2 = "bab";
        if (!anagram_check_removing_character(sentence1, sentence2)) {
            System.out.println("Not an anagram!");
        } else {
            System.out.println("Anagram!");
        }

        if (!anagram_string_check(sentence1, sentence2)) {
            System.out.println("Not an anagram!");
        } else {
            System.out.println("Anagram!");
        }

        System.out.println(anagram_check_sorting(sentence1, sentence2) ? "Anagram!" : "Not an anagram!");
    }
}
