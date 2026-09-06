package one_code_each_day.Mathematical_Logics_Code;

public class numberToBinary {

    public static String numberToBinaryCheck(int number) {
        if (number == 0) return null;

        StringBuilder binaryStr = new StringBuilder();
        while (number > 0) {
            int remainder = number % 2;
            binaryStr.insert(0, remainder);
            number = number / 2;
        }
        return String.valueOf(binaryStr);
    }

    public static void main(String[] args) {
        System.out.println(numberToBinaryCheck(4444));
    }
}
