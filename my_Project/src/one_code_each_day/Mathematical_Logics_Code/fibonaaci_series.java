package one_code_each_day.Mathematical_Logics_Code;

public class fibonaaci_series {
    static int a = 0;
    static int b = 1;
    static int nextTerm = 0;

    public static int fibonnaci_series_using_recursion(int num) {
        if (a == 0 && b == 1 && num > 0) {
            System.out.print(a + ", ");
            if (num > 1) {
                System.out.print(b + ", ");
            }
        }

        if (num > 2) {
            nextTerm = a + b;
            a = b;
            b = nextTerm;

            System.out.print(nextTerm + ", ");
            fibonnaci_series_using_recursion(num - 1);
        }
        return 0;
    }

    public static int fibonnaci_series_using_recursion_function(int num) {
        if (num <= 1) return num;

        return fibonnaci_series_using_recursion_function(num - 1) + fibonnaci_series_using_recursion_function(num - 2);
    }

    public static void main(String[] args) {
        fibonnaci_series_using_recursion(4);
        System.out.println("");
        System.out.println("--------------------------------");

        for (int i = 0; i < 9; i++) {
            System.out.print(fibonnaci_series_using_recursion_function(i) + ", ");
        }
    }
}
