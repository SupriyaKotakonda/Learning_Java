package ex_32_Collection_Framework_DSA.LIST;

import java.util.LinkedList;

public class List_04_LinkedList_02 {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList();


        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        System.out.println("LinkedList: " + animals);

        // Accessing elements
        System.out.println("First element: " + animals.getFirst());
        System.out.println("Last element: " + animals.getLast());

        // Removing elements
        animals.removeFirst();
        animals.removeLast();
        System.out.println("LinkedList after removal: " + animals);

        System.out.println("Size of LinkedList: " + animals.size());




    }
}
