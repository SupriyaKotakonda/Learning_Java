package ex_16_Arrays;

public class Arrays_Max_Min {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int Max_Output = giveMax(arr);
        System.out.println(Max_Output);
        int Min_Output = giveMin(arr);
        System.out.println(Min_Output);

    }

    private static int giveMin(int[] arr) {
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }


    private static int giveMax(int[] arr) {
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
    return max;
}
}
