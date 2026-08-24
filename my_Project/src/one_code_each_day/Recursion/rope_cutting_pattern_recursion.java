package one_code_each_day.Recursion;

public class rope_cutting_pattern_recursion {
    public static int rope_cutting_pattern_recursion_check(int n, int a, int b, int c) {
        if (n == 0) return 0;
        if (n < 0) return -1;

        int piecesWithA = rope_cutting_pattern_recursion_check(n - a, a, b, c);
        int piecesWithB = rope_cutting_pattern_recursion_check(n - b, a, b, c);
        int piecesWithC = rope_cutting_pattern_recursion_check(n - c, a, b, c);

        int maxPieces = Math.max(Math.max(piecesWithA, piecesWithB), piecesWithC);
        if (maxPieces == -1) {
            return -1;
        } else {
            return maxPieces + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(rope_cutting_pattern_recursion_check(5, 1, 2, 5));
    }
}
