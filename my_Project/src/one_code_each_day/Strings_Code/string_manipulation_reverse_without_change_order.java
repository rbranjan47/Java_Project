package one_code_each_day.Strings_Code;

public class string_manipulation_reverse_without_change_order {

    //Method to change the order
    public static StringBuilder reverse_string_without_change_order(String str) {
        StringBuilder reversedStr = new StringBuilder("");
        String[] strSplitted = str.split(" ");
        for (int i = 0; i < strSplitted.length; i++) {
            for (int j = strSplitted[i].length() - 1; j >= 0; j--) {
                reversedStr.append(strSplitted[i].charAt(j));
            }
        }
        return new StringBuilder(String.join(" ", reversedStr));
    }

    public static StringBuilder reverse_string_without_change_order_2(String str){
        StringBuilder reversedStr = new StringBuilder("");
        String[] strSplitted = str.split(" ");
        for (int i = 0; i < strSplitted.length; i++) {
            StringBuilder reversedStr_insideLoop = new StringBuilder("");
            reversedStr_insideLoop.append(strSplitted[i]);
            reversedStr.append(reversedStr_insideLoop.reverse());
        }
        return reversedStr;
    }
    public static void main(String[] args) {
        String name = "Geeks for Geeks";
        StringBuilder reversedName = reverse_string_without_change_order(name);
        StringBuilder reversedName2 = reverse_string_without_change_order_2(name);

        System.out.println(reversedName);
        System.out.println(reversedName2);
    }
}
