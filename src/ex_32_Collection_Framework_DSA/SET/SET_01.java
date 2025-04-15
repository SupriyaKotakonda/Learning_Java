package ex_32_Collection_Framework_DSA.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SET_01 {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("susan");
        hs.add("sana");
        hs.add("ksp");
        System.out.println(hs);
    }
}
