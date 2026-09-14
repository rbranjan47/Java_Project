package DSA_JAVA.Strings;

public class anagram__string_search {
    static final int CHAR = 256;

    public static boolean anagram__string_search_check(String mainStr, String anagramStr) {
        int mainStrLength = mainStr.length();
        int anagramStrLength = anagramStr.length();
        for (int i = 0; i <= mainStrLength - anagramStrLength; i++) {
            if (anagram__string_check(mainStr, anagramStr, i))
                return true;
        }
        return false;
    }

    public static boolean anagram__string_check(String mainStr, String anagramStr, int index) {
        int count[] = new int[CHAR];
        for (int j = 0; j < anagramStr.length(); j++) {
            count[anagramStr.charAt(j)]++;
            count[mainStr.charAt(j + index)]--;
        }
        for (int k = 0; k < CHAR; k++) {
            if (count[k] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(anagram__string_search_check("geeksforgeeks", "frog") ? "Anagram search found!" : "Anagram search not found!");
    }
}
