package com.company;

public class Function<T> implements Interface<T> {
    private Node front;
    private Node rear;
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
        return front == null;
    }

    @Override
    public void inputQueue(T data) {
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
    public T queueProcess() {
        Node temp;
        if (isEmpty()) {
            System.out.println("\nThe queue is empty !");
            return null;
        } else {
            Node node = this.front;
            System.out.println("\n===== Queue List =====");
            System.out.println("Name      : " + ((Element) node.getData()).name);
            System.out.println("Order     : " + ((Element) node.getData()).order);
            System.out.println("Total     : " + ((Element) node.getData()).total);
            System.out.println();
            System.out.println("Been processed");
            temp = front;
            front = front.getNext();
            temp.setNext(null);
        }
        size--;
        return temp.data;
    }

    @Override
    public void queueList() {
        if (isEmpty()) {
            System.out.println("\nThe queue is empty !");
        } else {
            Node node = this.front;
            while (node != null) {
                System.out.println("\n===== Queue List =====");
                System.out.println("Name      : " + ((Element) node.getData()).name);
                System.out.println("Order     : " + ((Element) node.getData()).order);
                System.out.println("Total     : " + ((Element) node.getData()).total);
                System.out.println();
                node = node.getNext();
            }
        }
    }

    @Override
    public void queueFirst() {
        if (isEmpty()) {
            System.out.println("\nThe queue is empty !");
        } else {
            Node node = this.front;
            System.out.println("\n===== Queue List =====");
            System.out.println("Name      : " + ((Element) node.getData()).name);
            System.out.println("Order     : " + ((Element) node.getData()).order);
            System.out.println("Total     : " + ((Element) node.getData()).total);
            System.out.println();
        }
    }
}
