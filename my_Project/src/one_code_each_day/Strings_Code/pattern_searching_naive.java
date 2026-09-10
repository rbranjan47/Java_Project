package one_code_each_day.Strings_Code;

public class pattern_searching_naive {
    public static void pattern_searching_naive_solution(String mainStr, String patternStr) {
        int mainStrLength = mainStr.length();
        int patternStrLength = patternStr.length();

        for (int i = 0; i <= mainStrLength - patternStrLength; i++) {
            int j;
            for (j = 0; j < patternStrLength; j++) {
                if (mainStr.charAt(i + j) != patternStr.charAt(j)) {
                    break;
                }
            }
            if (j == patternStrLength) {
                System.out.println(i + " ");
            }
        }
    }

    public static void pattern_searching_improved_naive_solution(String mainStr, String patternStr) {
        int mainStrLength = mainStr.length();
        int patternStrLength = patternStr.length();

        for (int i = 0; i <= mainStrLength - patternStrLength; i++) {
            int j;
            for (j = 0; j < patternStrLength; j++) {
                if (mainStr.charAt(i + j) != patternStr.charAt(j)) {
                    break;
                }
            }
            if (j == patternStrLength) {
                System.out.print(i + " ");
            } else if (j == 0) {
                i++;
            } else {
                i = i + j;
            }
        }
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        String mainStr = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        String patterStr = "AAAAAAA";
        //pattern_searching_naive_solution(mainStr, patterStr);
        pattern_searching_improved_naive_solution(mainStr, patterStr);

        long endTime = System.nanoTime();
        long durationNano = endTime - startTime;

        // Conversion to milliseconds
        double durationMillis = durationNano / 1_000_000.0;
        System.out.println();
        System.out.printf("Execution time: %.3f ms%n", durationMillis);
    }
}
