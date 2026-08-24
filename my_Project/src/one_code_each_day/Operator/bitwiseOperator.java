package one_code_each_day.Operator;

public class bitwiseOperator {

    public static void main(String[] args){
        int a = 3;
        int b = 6;

        //1. Bitwise And Operator - Reruns 1. If BOTH bits are 1, otherwise returns 0.
        System.out.println(a & b);

        //2. Bitwise OR Operator - Returns 1 if EITHER of the bits is 1, otherwise returns 0.
        System.out.println(a | b);

        //3. Bitwise XOR Operator - Returns 1 if the bits are different, otherwise returns 0.
        // Example - 1 ^ 1 = 0, 0 ^ 0 = 0, 1 ^ 0 = 1, 0 ^ 1 = 1
        System.out.println(a ^ b);

        //4. Bitwise Not (~) Operator - Returns 1 for every 0 and 0 for every 1. It is a unary operator.
        System.out.println(~ a);
        System.out.println(~ b);

        //5. Left Shift Operator (<<) - Shifts the bits of the number to the left by the specified number of positions. Each left shift operation multiplies the number by 2
        System.out.println(a << 1); // 3 * 2 = 6 This is because the binary representation of 3 is 11, and when we shift it to the left by 1 position, we get 110, which is the binary representation of 6.
        System.out.println(b << 1); // 6 * 2 = 12 This is because the binary representation of 6 is 110, and when we shift it to the left by 1 position, we get 1100, which is the binary representation of 12.

        //6. Right Shift Operator (>>) - Shifts the bits of the number to the right by the specified number of positions. Each right shift operation divides the number by 2.
        System.out.println(a >> 1); // 3 / 2 = 1 This is because the binary representation of 3 is 11, and when we shift it to the right by 1 position, we get 1, which is the binary representation of 1.
        System.out.println(b >> 1); // 6 / 2 = 3 This is because the binary representation of 6 is 110, and when we shift it to the right

    }
}
