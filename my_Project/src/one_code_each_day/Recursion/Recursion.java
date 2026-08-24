package one_code_each_day.Recursion;

public class Recursion {

    // Application of Recursions-
    // - Dynamic Programming
    // - Backtracking
    // - Divide and concur (Binary search, Quick sort, and Merge sort)

    // Many Problems inherently
    // - Tower of Hanoi
    // - DPS based traversals/ Inorder/ Preorder & Postorder traversal of tree

    public static void recursion_method1(int n) {
        if (n == 0) return;
        System.out.println(n);

        recursion_method1(n - 1);

        System.out.println(n);
    }

    public static void recursion_method2(int n) {
        if (n == 0) return;
        System.out.println(n);

        recursion_method1(n - 1);

        System.out.println(n);

        recursion_method1(n - 1);
    }


    public static int recursion_method3(int n) {
        if (n == 1) {
            return 0;
        } else {
            return 1 + recursion_method3(n / 2);
        }
    }


    public static void main(String[] args) {
        recursion_method1(3);
        System.out.println("------");
        recursion_method2(3);
        System.out.println("------");
        System.out.println(recursion_method3(16));
        System.out.println(recursion_method3(32));
    }
}
