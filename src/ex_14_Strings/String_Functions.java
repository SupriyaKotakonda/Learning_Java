package ex_14_Strings;

public class String_Functions {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);

        String s1 = "PQQRS ";
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(2));
        System.out.println(s1.concat("T"));
        System.out.println(s1.contains("P"));
        System.out.println(s1.equals("PQRS"));
        System.out.println(s1.isEmpty());
        System.out.println(s1.replace("P", "T"));
        System.out.println(s1.substring(1, 3));
        System.out.println(s1.trim());
        System.out.println(s1.indexOf("Q"));
        System.out.println(s1.lastIndexOf("Q"));
        System.out.println(s1.startsWith("P"));
        System.out.println(s1.endsWith("S"));
        System.out.println(s1.compareTo("PQRS"));
        System.out.println(s1.compareToIgnoreCase("pqrs"));



    }
}
