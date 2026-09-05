package one_code_each_day.Strings_Code;

public class abc_string {
    // String- a sequence of characters, either as a literal constant or as some kind of variable
    // Example: "abc" is a string literal, while String s = "abc"; is a string variable.

    // ASCII value of a character is the numerical representation of that character in the ASCII table. For example, the ASCII value of 'a' is 97, 'b' is 98, and 'c' is 99.
    // A- 65, B- 66, C- 67, D- 68, E- 69, F- 70, G- 71, H- 72, I- 73, J- 74, K- 75, L- 76, M- 77, N- 78, O- 79, P- 80, Q- 81, R- 82, S- 83, T- 84, U- 85, V- 86, W- 87, X- 88, Y- 89, Z- 90
    // a- 97, b- 98, c- 99, d- 100, e- 101, f- 102, g- 103, h- 104, i- 105, j- 106, k- 107, l- 108, m- 109, n- 110, o- 111, p- 112, q- 113, r- 114, s- 115, t- 116, u- 117, v- 118, w- 119, x- 120, y- 121, z- 122

    // Numbers-
    // 0- 48, 1- 49, 2- 50, 3- 51, 4- 52, 5- 53, 6- 54, 7- 55, 8- 56, 9- 57

    // Special Characters-
    // !- 33, @- 64, #- 35, $- 36, %- 37, ^- 94, &- 38, *- 42, (- 40, )- 41, _- 95, += 43
    // {- 123, }- 125, [- 91, ]- 93
    // ;- 59, :- 58, '- 39, "- 34, ,- 44, .- 46, /- 47, ?- 63, \- 92, |- 124, `- 96, ~- 126


    public static void main(String[] args) {
        String sentence = "abca";
        System.out.println(sentence);

        // String methods-
        // 1. length()- returns the length of the string
        System.out.println("Length of the string: " + sentence.length()); // Output: 4

        // 2. charAt()- returns the character at the specified index
        System.out.println("Character at index 2: " + sentence.charAt(2)); // Output: c

        // 3. substring()- returns a new string that is a substring of the original string
        System.out.println("Substring from index 1 to 3: " + sentence.substring(1, 3)); // 1 to 3 means index 1 and 2, but not 3. Output: bc

        // 4. indexOf()- returns the index of the first occurrence of the specified character or substring
        System.out.println("Index of 'c': " + sentence.indexOf('c')); // Output: 2

        // 5. lastIndexOf()- returns the index of the last occurrence of the specified character or substring
        System.out.println("Last index of 'a': " + sentence.lastIndexOf('a')); // Output: 3

        // 6. contains()- returns true if the string contains the specified character or substring
        System.out.println("Does the string contain 'b'? " + sentence.contains("b")); // Output: true

        // 7. equals()- returns true if the string is equal to the specified string
        System.out.println("Is the string equal to 'abca'? " + sentence.equals("abca")); // Output: true

        // 8. equalsIgnoreCase()- returns true if the string is equal to the specified string, ignoring case considerations
        System.out.println("Is the string equal to 'ABCA'? " + sentence.equalsIgnoreCase("ABCA")); // Output: true

        // 9. toUpperCase()- returns a new string that is the original string converted to uppercase
        System.out.println("String in uppercase: " + sentence.toUpperCase()); // Output: ABCA

        // 10. toLowerCase()- returns a new string that is the original string converted to lowercase
        System.out.println("String in lowercase: " + sentence.toLowerCase()); // Output:

        // 11. trim()- returns a new string that is the original string with leading and trailing whitespace removed
        String sentenceWithSpaces = "   abca   ";
        System.out.println("String with leading and trailing spaces removed: " + sentenceWithSpaces.trim()); // Output: abca

        // 12. replace()- returns a new string that is the original string with all occurrences of the specified character or substring replaced with the specified character or substring
        System.out.println("String with 'a' replaced with 'b': " + sentence.replace('a', 'b')); // Output: bbcb

        // 13. split()- returns an array of strings that is the original string split into substrings based on the specified delimiter
        String sentenceToSplit = "abca,defg,hijk";
        String[] splitSentence = sentenceToSplit.split(",");
        System.out.println("String split into substrings: ");
        for (String s : splitSentence) {
            System.out.println(s);
        } // output: abca defg hijk

        // 14. isEmpty()- returns true if the string is empty (length is 0)
        String emptyString = "";
        System.out.println("Is the string empty? " + emptyString.isEmpty()); // Output: true

        // 15. isBlank()- returns true if the string is empty or contains only whitespace
        String blankString = "   ";
        System.out.println("Is the string blank? " + blankString.isBlank()); // Output: true

        // 16. valueOf()- returns the string representation of the specified value
        int number = 123;
        System.out.println("String representation of the number: " + String.valueOf(number)); // Output: 123

        // 17. compareTo()- compares two strings lexicographically
        String string1 = "abc";
        String string2 = "abd";
        System.out.println("Comparing 'abc' and 'abd': " + string1.compareTo(string2)); // Output: -1 (because 'c' is less than 'd')

        // 18. compareToIgnoreCase()- compares two strings lexicographically, ignoring case considerations
        String string3 = "ABC";
        String string4 = "abc";
        System.out.println("Comparing 'ABC' and 'abc' ignoring case: " + string3.compareToIgnoreCase(string4)); // Output: 0 (because they are equal ignoring case)

        // 19. startsWith()- returns true if the string starts with the specified prefix
        System.out.println("Does the string start with 'ab'? " + sentence.startsWith("ab")); // Output: true

        // 20. endsWith()- returns true if the string ends with the specified suffix
        System.out.println("Does the string end with 'ca'? " + sentence.endsWith("ca")); // Output: true

        // 21. format()- returns a formatted string using the specified format string and arguments
        String name = "John";
        int age = 30;
        System.out.println(String.format("My name is %s and I am %d years old.", name, age)); // Output: My name is John and I am 30 years old.

        // 22. intern()- returns a canonical representation for the string object
        String internedString = sentence.intern();
        System.out.println("Interned string: " + internedString); // Output: abca

        // 23. toCharArray()- returns an array of characters that is the original string converted to a character array
        char[] charArray = sentence.toCharArray();
        System.out.println("String converted to character array: ");
        for (char c : charArray) {
            System.out.println(c);
        }  // output: a b c a

        // 24. matches()- returns true if the string matches the specified regular expression
        String regex = "^[a-z]+$"; // matches lowercase letters only
        System.out.println("Does the string match the regex? " + sentence.matches(regex)); // Output: true
    }
}
