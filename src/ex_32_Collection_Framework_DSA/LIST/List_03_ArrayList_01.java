package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;


public class List_03_ArrayList_01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sana");
        arrayList.add(null);
        arrayList.add("ksp");
        arrayList.add("ksp"); // Duplicate is allowed.
        arrayList.add(123); // Different data type is allowed.
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l = new ArrayList(); // Dynamic Dispatch
        l.add("123");
        l.add("456");
        System.out.println(l);
        System.out.println(l.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());


    }
}
