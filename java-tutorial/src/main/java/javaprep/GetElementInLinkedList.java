package javaprep;

import java.util.LinkedList;

/**
 * Created by pmukkamala on 5/29/18.
 */
public class GetElementInLinkedList {

    public static void main(String[] args) {

        // Creating javaprep.LinkedList of String Elements
        LinkedList<String> linkedlist = new LinkedList<String>();

        // Populating it with String values
        linkedlist.add("AA");
        linkedlist.add("BB");
        linkedlist.add("CC");
        linkedlist.add("DD");
        linkedlist.add("EE");

        for (int i = 0; i < linkedlist.size(); i ++) {

            String element = linkedlist.get(i);
            System.out.println("Element at index " + i + ": " + element);
        }
    }
}