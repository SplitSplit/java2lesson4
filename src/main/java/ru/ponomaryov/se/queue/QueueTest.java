package ru.ponomaryov.se.queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue queue = new LinkedQueueImpl();
        insert(queue, 2);
        insert(queue, 1);
        insert(queue, 4);
        insert(queue, 5);
        insert(queue, 3);

        //System.out.println("Size: " + queue.getSize());
        //System.out.println("Peek: " + queue.peek());
        //System.out.println("Remove top: " + remove(queue));
        //System.out.println("Size: " + queue.getSize());
        //System.out.println("Peek: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println(remove(queue));
        }
    }

    private static int remove(Queue queue) {
        return !queue.isEmpty() ? queue.remove() : -1;
    }

    private static void insert(Queue queue, int val) {
        if (!queue.isFull()) {
            queue.insert(val);
        }
    }

}
