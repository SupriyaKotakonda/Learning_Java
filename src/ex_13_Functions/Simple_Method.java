package ex_13_Functions;

public class Simple_Method {
    public static <string> void main(String[] args) {
//        int result = no_return();
        int i1 = return_int();
        System.out.println(i1);
        byte i2 =return_byte();
        System.out.println(i2);
        boolean i3 = return_boolean();
        System.out.println(i3);
        float i4 = return_float();
        System.out.println(i4);
        long i5 = return_long();
        System.out.println(i5);
        String i6 = return_string();
        System.out.println(i6);



    }

    static void no_return(){
        System.out.println("No return");
    }

//    int, byte, boolean, long, float, string
    static int return_int() {
        return 10;
    }
    static byte return_byte(){
            return 100;
        }


    static boolean return_boolean(){
        return true;
    }

    static float return_float(){
        return 3.14f;
    }

    static long return_long(){
        return 101l;
    }

    static String return_string(){
        return "Supriya";
    }


}
