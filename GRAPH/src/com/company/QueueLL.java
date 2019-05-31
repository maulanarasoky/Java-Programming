/*
Author  : Maulana Rasoky Nasution
Website : https://mul-code.blogspot.com
*/
package com.company;

public class QueueLL<T> implements QueueInterface<T> {

    private Node front;
    private Node rear;
    private int size;

     QueueLL() {
        this.front = null;
        this.rear = null;
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

        Node getNext() {
            return next;
        }

        void setNext(Node next) {
            this.next = next;
        }
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public void enQueue(T data) {
        Node node = new Node(data);
        if (isEmpty()) {
            front = rear = node;
        } else {
            rear.setNext(node);
            rear = node;
        }
        size++;
    }

    @Override
    public T deQueue() {
        Node temp = null;
        if (isEmpty()) {
            System.out.println("Data is empty !");
        } else {
            temp = front;
            front = front.getNext();
            temp.setNext(null);
            size--;
        }
        assert temp != null;
        return temp.data;
    }

}
