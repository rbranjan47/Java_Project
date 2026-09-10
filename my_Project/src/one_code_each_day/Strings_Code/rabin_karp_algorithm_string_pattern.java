package one_code_each_day.Strings_Code;

import java.util.ArrayList;
import java.util.List;

public class rabin_karp_algorithm_string_pattern {
    // d is the alphabet size (256 covers extended ASCII)
    private static final int D = 256;
    // A large prime modulus to minimize collisions while avoiding overflow
    private static final long Q = 1_000_000_007L;

    public static List<Integer> rabin_karp_algorithm_string_pattern_check(String text, String pattern) {
        List<Integer> matches = new ArrayList<>();
        int m = pattern.length();
        int n = text.length();

        if (m == 0 || n < m) {
            return matches;
        }

        long patternHash = 0;
        long textHash = 0;
        long h = 1; // Represents (D^(m-1)) % Q

        // Precompute h = (D^(m - 1)) % Q
        for (int i = 0; i < m - 1; i++) {
            h = (h * D) % Q;
        }

        // Calculate initial hash values for pattern and first window of text
        for (int i = 0; i < m; i++) {
            patternHash = (D * patternHash + pattern.charAt(i)) % Q;
            textHash = (D * textHash + text.charAt(i)) % Q;
        }

        // Slide the window across the text
        for (int i = 0; i <= n - m; i++) {
            // Check hash match first
            if (patternHash == textHash) {
                // Verify character-by-character to eliminate spurious hits (collisions)
                boolean match = true;
                for (int j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    matches.add(i);
                }
            }

            // Compute rolling hash for the next window: text[i+1 ... i+m]
            if (i < n - m) {
                textHash = (D * (textHash - text.charAt(i) * h) + text.charAt(i + m)) % Q;

                // Handle negative modulus result in Java
                if (textHash < 0) {
                    textHash += Q;
                }
            }
        }

        return matches;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        String mainStr = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        String patterStr = "AAAAAAA";
        //pattern_searching_naive_solution(mainStr, patterStr);
        System.out.print(rabin_karp_algorithm_string_pattern_check(mainStr, patterStr));

        long endTime = System.nanoTime();
        long durationNano = endTime - startTime;

        // Conversion to milliseconds
        double durationMillis = durationNano / 1_000_000.0;
        System.out.println();
        System.out.printf("Execution time: %.3f ms%n", durationMillis);
    }
}
