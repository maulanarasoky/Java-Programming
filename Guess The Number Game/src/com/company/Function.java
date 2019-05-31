package com.company;

public class Function<T> implements Interface<T> {
    private Node top;
    int point;
    int size;

    private class Node {
        private T data;
        Node next;

        Node(T data) {
            this(data, null);
        }

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        Node getNext() {
            return next;
        }

        void setNext(Node next) {
            this.next = next;
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void pushCorrect(T data) {
        Node node = new Node(data);
        if (isEmpty()) {
            top = node;
        } else {
            node.setNext(top);
            top = node;
        }
        size++;
    }

    @Override
    public void pushPoint(T data) {
        Node node = new Node(data);
        if (isEmpty()) {
            top = node;
        } else {
            node.setNext(top);
            top = node;
        }
        point++;
    }

    @Override
    public void popAll() {
        Node temp;
        if (isEmpty()) {
            System.out.println();
        } else {
            while (top != null) {
                temp = top;
                top = temp.getNext();
                size--;
            }
            size = 0;
        }
    }
}
