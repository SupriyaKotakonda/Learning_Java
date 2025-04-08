package ex_16_Arrays;

public class Arrays_01 {
    public static void main(String[] args) {
        int a = 10;
        int[] marks = {90, 91, 87, 76, 85};
        boolean[] results = {true, false, true, false, true};
        String[] names = {"Supriya", "Siddhi", "Shivani", "Shivendra"};
        System.out.println(marks.length);
        System.out.println(results.length);
        System.out.println(names.length);
        System.out.println(marks[0]);
//        System.out.println(marks[6]); //ArrayIndexOutOfBoundsException
//        System.out.println(marks[-1]); //ArrayIndexOutOfBoundsException
        System.out.println(results[0]);
        System.out.println(names.length);



    }
}
