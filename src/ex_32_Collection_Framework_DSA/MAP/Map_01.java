package ex_32_Collection_Framework_DSA.MAP;

import java.util.*;

public class Map_01 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        // Map is key and value pair
        // name -> pramod
        m1.put("name","sana");
        m1.put("rollno",1);
        m1.put("phone",987654321);
        System.out.println(m1);

        Map m2 = new LinkedHashMap();
        m2.put("name","sana");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);

        Map m3 = new TreeMap();
        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210
        m3.put("firstname","sana");
        m3.put("lastname","susan");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);
        // {phone=987654321, name=pramod, rollno=1}








    }
}
