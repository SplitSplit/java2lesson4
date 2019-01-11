package ru.ponomaryov.se.stack;

import ru.ponomaryov.se.LinkedList;
import ru.ponomaryov.se.SimpleLinkedListImpl;

public class LinkedStackImpl implements Stack {

    private LinkedList linkedList;

    public LinkedStackImpl() {
        this.linkedList = new SimpleLinkedListImpl();
    }

    @Override
    public void push(int value) {
        linkedList.add(value);
    }

    @Override
    public int pop() {
        return linkedList.remove();
    }

    @Override
    public int peek() {
        return linkedList.getFirstElement().getData();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }
}
