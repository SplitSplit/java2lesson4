package ru.ponomaryov.se;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 */
public class App {
    public static void main(String[] args) {

        //testSimpleLinkedlList();
        //testTwoSideLinkedList();
        testIterator();

    }

    private static void testIterator() {
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        Collection<Integer> collection = linkedList;
        Iterator<Integer> iterator = collection.iterator();

        for (Integer o : collection) {
            System.out.println(o);
        }

        // while (iterator.hasNext()) {
        //     int element =iterator.next();
        //     System.out.println(element);
        // }
    }

    private static void testSimpleLinkedlList() {
        LinkedList linkedList = new SimpleLinkedListImpl();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(6);

        System.out.println("Size = " + linkedList.getSize());

        linkedList.display();

        linkedList.remove();
        linkedList.remove(3);

        linkedList.display();
    }

    private static void testTwoSideLinkedList() {
        TwoSideLinkList linkedList = new TwoSideLinkListImpl();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addLast(4);
        linkedList.addLast(6);

        System.out.println("Size = " + linkedList.getSize());

        linkedList.display();

        linkedList.remove();
        linkedList.remove(6);

        linkedList.display();
    }
}
