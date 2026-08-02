package one_code_each_day;

//A Number that when squared ends with the number itself is known as the Automorphic Number. Let's try and understand the concept of Automorphic Number,
//Example
//Input : 5
//Output : 25
//Explanation : Number = 5
//when squared you get 25
//as 25 ends with 5

public class automorphic_number_string {
    public static boolean automorphic_number_string_check(String num) {
        String[] given_number_arrays = num.split("");
        int given_number_last_digit = Integer.parseInt(given_number_arrays[given_number_arrays.length - 1]);
        System.out.println(given_number_last_digit);
        String[] square_number_arrays = String.valueOf((Integer.valueOf(num) * Integer.valueOf(num))).split("");
        int square_number_last_digit = Integer.parseInt(square_number_arrays[square_number_arrays.length - 1]);
        System.out.println(square_number_last_digit);
        if (given_number_last_digit == square_number_last_digit) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
       if(automorphic_number_string_check("9")){
           System.out.println("Automorphic number!");
       } else{
           System.out.println("Not a automorphic number");
       }
    }
}
