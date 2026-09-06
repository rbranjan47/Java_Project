package one_code_each_day.Strings_Code;

public class left_most_non_repeating_character {

    // Naive solutions
    public static int left_most_non_repeating_character_check(String str) {
        String[] str_array = str.split("");
        for (int i = 0; i < str_array.length - 1; i++) {
            boolean checkFlag = false;
            for (int j = 0; j < str_array.length; j++) {
                if (i != j && str_array[i].equals(str_array[j])) {
                    checkFlag = true;
                    break;
                }
            }
            if(checkFlag == false){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(left_most_non_repeating_character_check("apple"));
        System.out.println(left_most_non_repeating_character_check("abcd"));
        System.out.println(left_most_non_repeating_character_check("geeksforgeeks"));
    }
}
