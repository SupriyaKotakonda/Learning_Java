package ex_32_Collection_Framework_DSA.LIST;

import java.util.*;

public class List_04_LinkedList_03 {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList(); // // Arrays Format - Continuous


        List mylist2 = new LinkedList(); // Doubly Linked List.

        mylist2.add("susan");
        mylist2.add("sana");
        mylist2.add("rk");
        mylist2.add("ksp");
        mylist2.add("sana");
        mylist2.add("joy");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);
        System.out.println(mylist2);

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("sana"));
        System.out.println(mylist2.indexOf("sana"));





    }
}
