package one_code_each_day.Strings_Code;

import java.util.HashSet;

public class string__count_duplicates {
    public static void count_duplicate(String str) {
        // This method will also include duplicate counting of each character. i.e. it will go to each character and count again and show the duplicate output
        // To avoid this we can use hashset- Hashset will check and not allow to count for duplicate
        HashSet<Character> hashset = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (hashset.contains(str.charAt(i))) continue;

            int count = 0;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("Character " + str.charAt(i) + " repeats " + (count + 1) + " times!");
            }
            hashset.add(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        String name = "Geeks for geeks";
        count_duplicate(name);
    }
}
