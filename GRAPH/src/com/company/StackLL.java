/*
Author  : Maulana Rasoky Nasution
Website : https://mul-code.blogspot.com
*/
package com.company;

public class StackLL<T> implements StackInterface<T> {

    private Node top;
    private int size;

    StackLL() {
        this.top = null;
        this.size = 0;
    }

    private class Node {
        private T data;
        private Node next;

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(T data) {
            this(data, null);
        }

        T getData() {
            return data;
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
    public void push(T data) {
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
    public T pop() {
        Node temp = null;
        if (isEmpty()) {
            System.out.println("Data is empty !");
        } else {
            temp = top;
            top = top.getNext();
            temp.setNext(null);
            size--;
        }
        assert temp != null;
        return temp.getData();
    }
}
