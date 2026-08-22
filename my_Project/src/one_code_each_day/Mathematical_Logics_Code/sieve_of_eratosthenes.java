package one_code_each_day.Mathematical_Logics_Code;

public class sieve_of_eratosthenes {

    // Naive Solutions
    public static void sieve_of_eratosthenes_check(int num) {
        for (int i = 2; i < num; i++) {
            if (i <= 3) {
                System.out.println(i);
                continue;
            }
            if (i % 2 == 0 || i % 3 == 0) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 5; j * j <= i; j = j + 6) {
                if (i % j == 0 || i % (j + 2) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

    // Sieve of Eratosthenes Solutions
    public static void sieve_of_eratosthenes_check_using_concept(int num) {
        int[] new_array = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            new_array[i] = i;
        }

        //Checking prime
        boolean isPrime = true;

    }

    public static void main(String[] args) {
        sieve_of_eratosthenes_check(30);

        sieve_of_eratosthenes_check_using_concept(10);
    }
}
