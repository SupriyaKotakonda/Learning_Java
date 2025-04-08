package ex_16_Arrays;

public class Arrays_03 {
    public static void main(String[] args) {
        String[] names = {"Supriya", "kavya", "aadya"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        String[] names1 = new String[3];
        names1[0] = "sk";
        names1[1] = "kv";
        names1[2] = "ad";
        System.out.println(names1[0]);
        System.out.println(names1[1]);
        System.out.println(names1[2]);

        boolean[] b = new boolean[3];
        b[0] = true;
        b[1] = false;
        System.out.println(b[0]);
    }
}
