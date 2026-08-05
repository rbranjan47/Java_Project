package one_code_each_day.Mathematical_Logics_Code;

public class smallest_of__given_numbers {
    //This method will return the smallest number from given list/array of number
    public static int check_smallest_number(int[] num_list) {
        int greatest_num = num_list[0];
        for (int i = 1; i < num_list.length; i++) {
            if (num_list[i] < greatest_num) {
                greatest_num = num_list[i];
            }
        }
        return greatest_num;
    }

    public static void main(String[] args) {
        int[] values = {12, 15, 20, 25, 100, 30, 40, 200};

        System.out.println(check_smallest_number(values));
    }

}
