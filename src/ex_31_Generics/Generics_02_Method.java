package ex_31_Generics;

public class Generics_02_Method {
    public static void main(String[] args) {

        temp_sum(3,4);
        temp_sum(3.34,4.45);
        temp_sum("supriya","ksp");


    }

    static <G> G temp_sum(G a, G b){  //<T> T can be anything
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
