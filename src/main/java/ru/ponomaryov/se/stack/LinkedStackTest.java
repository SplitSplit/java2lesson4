package ru.ponomaryov.se.stack;

public class LinkedStackTest {

    public static void main(String[] args) {
        LinkedStackImpl stack = new LinkedStackImpl();
        pushToStack(stack, 1);
        pushToStack(stack, 2);
        pushToStack(stack, 3);
        pushToStack(stack, 4);
        pushToStack(stack, 5);
        pushToStack(stack, 6);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.getSize());

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    private static int popFromStack(LinkedStackImpl stack) {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return -1;
    }

    private static void pushToStack(LinkedStackImpl stack, int value) {
            stack.push(value);
    }

}
