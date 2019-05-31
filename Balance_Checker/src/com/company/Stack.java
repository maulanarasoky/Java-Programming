package com.company;

public class Stack<T> implements stackInterface<T> {

    public static final int capacity = 25;
    private T[] data;
    private int size = -1;

    public Stack() {
        this(capacity);
    }

    public Stack(int capacity) {
        data = (T[]) new Object[capacity];
    }

    @Override
    public boolean isEmpty() {
        if ((size == -1)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void push(T element) {
        if (size() == data.length) {
            System.out.println("Stack Overflow");
        } else {
            size = size + 1;
            data[size] = element;
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            T temp = data[size];
            data[size] = null;
            size--;
            return temp;
        }
    }

    @Override
    public int size() {
        return size + 1;
    }
}
