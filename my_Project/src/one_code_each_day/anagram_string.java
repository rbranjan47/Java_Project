package one_code_each_day;

//Anagram- a word or phrase made by mixing up the letters of another word or phrase, using all the original letters exactly once

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

    public static void main(String[] args) {
        String sentence1 = "fired";
        String sentence2 = "fried";
        if (!anagram_string_check(sentence1, sentence2)) {
            System.out.println("Not an anagram! ");
        } else {
            System.out.println("Anagram!");
        }
    }
}
