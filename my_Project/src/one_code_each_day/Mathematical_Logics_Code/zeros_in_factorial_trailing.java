package one_code_each_day.Mathematical_Logics_Code;

import java.math.BigInteger;

public class zeros_in_factorial_trailing {
    public static int check_zeros_in_factorial_trailing(int number) {
        if (number == 1) return 1;
        BigInteger resultNumber = BigInteger.valueOf(1);
        for (int i = 2; i <= number; i++) {
            resultNumber = resultNumber.multiply(BigInteger.valueOf(i));
        }
        System.out.println(resultNumber);
        int count = 0;
        while (resultNumber.remainder(BigInteger.TEN).equals(BigInteger.ZERO)) {
            count++;
            resultNumber = resultNumber.divide(BigInteger.TEN);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(check_zeros_in_factorial_trailing(30));
    }
}
