package ex_16_Arrays;

import java.util.Scanner;

public class Arrays_User_Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        // int arr[] = new int[size]; // This is also correct
        // int arr[]; arr = new int[size]; // This is also correct
//        float[] arr1 = new float[size];
//        String[] arr2 = new String[size];

        for (int i=0; i<size; i++){
            System.out.println("Enter the elements of an array");
            arr[i] = sc.nextInt();
        }

        System.out.println("----------");
        for (int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}
