package ru.ponomaryov.se;

public class Node {

    private final int data;
    private Node nextElement;

    public Node(int data) {
        this.data = data;
    }

    public Node getNextElement() {
        return nextElement;
    }

    public void setNextElement(Node nextElement) {
        this.nextElement = nextElement;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        return "{" + data + "}";
    }
}
