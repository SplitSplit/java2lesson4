package ru.ponomaryov.se;

public class TwoSideLinkListImpl
        extends SimpleLinkedListImpl
        implements TwoSideLinkList {

    private Node lastElement;

    @Override
    public void addLast(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            firstElement = node;
        } else {
            lastElement.setNextElement(node);
        }
        lastElement = node;
        size++;
    }

    @Override
    public void addFirst(int value) {
        boolean wasEmpty = isEmpty();
        super.add(value);
        if (wasEmpty) {
            lastElement = firstElement;
        }
    }

    @Override
    public int remove() {
        int removeValue = super.remove();
        if (isEmpty()) {
            lastElement = null;
        }
        return removeValue;
    }

    @Override
    public int remove(int value) {
        Node currentNode = firstElement;
        Node previousNode = null;
        while (currentNode != null) {
            if (currentNode.getData() == value) {
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextElement();
        }
        if (currentNode == null) {
            return -1;
        }

        if (firstElement == currentNode) {
            firstElement = currentNode.getNextElement();
        } else if(lastElement == currentNode){
            lastElement = previousNode;
            previousNode.setNextElement(currentNode.getNextElement());
        } else {
            previousNode.setNextElement(currentNode.getNextElement());
        }

        size--;
        if (isEmpty()) {
            lastElement = null;
        }
        return currentNode.getData();
    }
}
