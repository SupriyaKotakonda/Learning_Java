package ex_16_Arrays;

public class Arrays_02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Second way to declare an array
        int[] arr2 = new int[5]; // Fixed size
        int  arr3[] = new int[5]; // Fixed size
        int marks = 90;
        String[] names = new String[5]; // Fixed size
        names[0] = "John";
        names[1] = "Doe";
        names[2] = "susan";

        System.out.println(arr);
        System.out.println(names[0]);
        System.out.println(arr[2]);

    }
}
