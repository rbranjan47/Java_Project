package one_code_each_day.Mathematical_Logics_Code;

public class fibonaaci_series {
    static int a = 0;
    static int b = 1;
    static int nextTerm = 0;

    public static int fibonnaci_series_using_recursion(int num) {
        if (num > 0) {
            nextTerm = a + b;
            a = b;
            b = nextTerm;

            System.out.print(nextTerm + " , ");
            fibonnaci_series_using_recursion(num - 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        fibonnaci_series_using_recursion(4);
    }
}
