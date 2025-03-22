package ex_13_Functions;

public class User_Defined_One {
    public static void main(String[] args) {
        int Addition = sum_of_numbers(4,3);
        System.out.println(Addition);

        int Subtraction = sub_of_numbers(4,3);
        System.out.println(Subtraction);
    }

    static int sum_of_numbers(int a, int b){
        return a+b;
    }

    static int sub_of_numbers(int a, int b){
        return a-b;
    }



}


