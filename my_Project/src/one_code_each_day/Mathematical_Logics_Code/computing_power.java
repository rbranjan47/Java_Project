package one_code_each_day.Mathematical_Logics_Code;

public class computing_power {
    public static int computing_power_nail_solution(int inputNumber, int power) {
        int multiplicationNumber = 1;
        for (int i = 1; i <= power; i++) {
            multiplicationNumber = multiplicationNumber * inputNumber;
        }
        return multiplicationNumber;
    }

    public static int computing_power_math_power_solution(int inputNumber, int power) {
        return (int) Math.pow(inputNumber, power);
    }

    public static int computing_power_recursion_solution(int inputNumber, int power) {
        if (power % 2 == 0) {
            return computing_power_math_power_solution(inputNumber, power / 2) * computing_power_math_power_solution(inputNumber, power / 2);
        } else
            return computing_power_math_power_solution(inputNumber, power - 1) * inputNumber;
    }

    public static void main(String[] args) {
        System.out.println(computing_power_nail_solution(2, 3));
        System.out.println(computing_power_nail_solution(2, 0));

        System.out.println(computing_power_math_power_solution(2, 3));
        System.out.println(computing_power_math_power_solution(2, 0));

        System.out.println(computing_power_recursion_solution(2, 3));
        System.out.println(computing_power_recursion_solution(2, 0));
    }
}
