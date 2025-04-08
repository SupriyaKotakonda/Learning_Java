package ex_16_Arrays;

import java.util.Arrays;

public class Arrays_Print {
    public static void main(String[] args) {
        int[] marks = {90, 80, 70, 60, 50};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println("__________________________");

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        Arrays.sort(marks);
        System.out.println("__________________________");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
