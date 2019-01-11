package ru.ponomaryov.se.queue;

import ru.ponomaryov.se.TwoSideLinkList;
import ru.ponomaryov.se.TwoSideLinkListImpl;

public class LinkedQueueImpl implements Queue {

    private TwoSideLinkList twoSideLinkList;

    public LinkedQueueImpl() {
        this.twoSideLinkList = new TwoSideLinkListImpl();
    }


    @Override
    public void insert(int value) {
        twoSideLinkList.addLast(value);
    }

    @Override
    public int remove() {
        return twoSideLinkList.remove();
    }

    @Override
    public int peek() {
        return twoSideLinkList.getFirstElement().getData();
    }

    @Override
    public boolean isEmpty() {
        return twoSideLinkList.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int getSize() {
        return twoSideLinkList.getSize();
    }
}
