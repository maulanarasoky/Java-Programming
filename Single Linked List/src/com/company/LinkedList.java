package com.company;

public class LinkedList<T> implements Interface<T> {
    private Node head;
    private int size;

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
        return head == null;
    }

    @Override
    public void insertFirst(T data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
            size++;
        } else {
            node.setNext(head);
            head = node;
            size++;
        }
    }

    @Override
    public void insertLast(T data) {
        Node node = new Node(data);
        Node temp;
        if (isEmpty()) {
            head = node;
            head.setNext(null);
        } else {
            temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    @Override
    public void show() {
        if (this.head == null) {
            System.out.println("Data is empty !");
        } else {
            Node node = this.head;
            while (node != null) {
                Element employeeData = (Element) node.getData();
                System.out.println("Employee Id : " + employeeData.employeeId);
                System.out.println("Employee Name : " + employeeData.employeeName);
                System.out.println();
                node = node.getNext();
            }
        }
    }
}
