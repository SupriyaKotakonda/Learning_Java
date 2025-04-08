package ex_16_Arrays;

public class Sum_Of_Arrays {
    public static void main(String[] args) {
        int[] arr = {20,12,24,34};
        int sum = 0;
//        for (int i = 0;i<arr.length; i++){
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);

        for (int n : arr){ // for each loop -- enhanced for loop
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
