package one_code_each_day.Strings_Code;

public class left_most_repeating_character {

    // Naive Solutions
    public static int left_most_repeating_character_check(String str) {
        String[] str_array = str.split("");
        for (int i = 0; i < str_array.length - 1; i++) {
            for (int j = i + 1; j < str_array.length; j++) {
                if (str_array[i].equals(str_array[j])) {
                    return i;
                }
            }
        }
        return -1;
    }

    // Efficient way to solve this problem
    public static int left_most_repeating_character_check_efficient_approach(String str) {
        int CHAR = 256;
        int result = -1;
        boolean[] visited = new boolean[CHAR];
        for (int i = str.length() - 1; i >= 0; i--) {
            if (visited[str.charAt(i)])
                result = i;
            else
                visited[str.charAt(i)] = true;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(left_most_repeating_character_check("abbc"));
        System.out.println(left_most_repeating_character_check("abcd"));
        System.out.println(left_most_repeating_character_check("geeksforgeeks"));

        System.out.println(left_most_repeating_character_check_efficient_approach("abbc"));
        System.out.println(left_most_repeating_character_check_efficient_approach("abcd"));
        System.out.println(left_most_repeating_character_check_efficient_approach("geeksforgeeks"));
    }
}
