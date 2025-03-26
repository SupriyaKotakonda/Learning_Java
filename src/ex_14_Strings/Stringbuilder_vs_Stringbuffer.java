package ex_14_Strings;

public class Stringbuilder_vs_Stringbuffer {
    public static void main(String[] args) {

        // String - 90%
        String s1 = "Supriya";
        String s2 = new String("Supriya");


        // less than <10% used.
        StringBuffer s3 = new StringBuffer("Supriya");
        StringBuilder s4 = new StringBuilder("Supriya");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
