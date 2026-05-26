package one_code_each_day;

public class greatest_of__given_numbers {

    //This method will return the greatest number from given list/array of number
    public static int check_greatest_number(int[] num_list) {
        int greatest_num = num_list[0];
        for (int i = 1; i < num_list.length; i++){
            // Here I've stored the first element of array/list as maximum value and then comparing with the remaining values
            // If I am getting maximum value from the 1st position, then I am storing it as maximum value and doing again and again
            if(num_list[i] > greatest_num){
                greatest_num = num_list[i];
            }
        }
        return greatest_num;
    }

    public static void main(String[] args) {
        int[] values =  {12, 15, 20, 25, 100, 30, 40, 200, 10};

        System.out.println(check_greatest_number(values));
    }
}
