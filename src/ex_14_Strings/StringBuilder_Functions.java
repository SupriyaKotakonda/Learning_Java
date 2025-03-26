package ex_14_Strings;

public class StringBuilder_Functions {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Supriya");
        sb.append(" KSP123");
        System.out.println(sb);
        System.out.println(sb.insert(0, "Hello "));
        System.out.println(sb.delete(0, 3));
        System.out.println(sb.reverse());
        System.out.println(sb.replace( 0,  1, "Hi "));
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.charAt(2));
        System.out.println(sb.indexOf("S"));
        System.out.println(sb.lastIndexOf("S"));
        System.out.println(sb.substring(0, 3));
        System.out.println(sb.substring(3));

        String str = sb.toString();
        System.out.println(str);
    }
}
