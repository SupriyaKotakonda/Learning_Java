package ex_32_Collection_Framework_DSA.LIST;

import java.util.Stack;

public class Stack_01 {


        public static void main(String[] args) {

            // Stack
            // List In -> First Out ( LIFO)
//        Stack s = new Stack();
//        s.add("Pramod");
//        s.add("Dutta");
//        System.out.println(s);

            Stack s = new Stack();
            s.push("a");
            s.push("b");
            s.push("c");
            s.push("d");
            System.out.println(s);

            System.out.println(s.size());
            System.out.println(s.peek());
            System.out.println(s);
            System.out.println(s.pop());
            System.out.println(s);


            System.out.println(s);
            System.out.println(s.size());
            System.out.println(s.empty());
            System.out.println(s.add("e"));
            System.out.println(s);
            System.out.println(s);
            s.add("f");
            s.add("f");
            s.push("g");
            System.out.println(s);



        }
}
