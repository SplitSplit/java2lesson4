package ru.ponomaryov.se.stack;

public interface Stack {

    void push(int value);

    int pop();

    int peek();

    boolean isEmpty();

    boolean isFull();

    int getSize();

}
