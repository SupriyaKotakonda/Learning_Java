package ex_16_Arrays;

import java.util.Arrays;

public class Second_Highest_In_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

//        Arrays.sort(arr);
//        System.out.println(arr[arr.length - 2]);

        int highest = 0;
        int secondHighest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest && arr[i] != highest) {
                secondHighest = arr[i];
            }
        }

        System.out.println("Second Highest: " + secondHighest);
    }
}
