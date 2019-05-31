package com.company;

public class Function {
    private Node head;
    private int size;

    public Function() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertFirst(String employeeId, String employeeName) {
        Node node = new Node(employeeId, employeeName);
        if (isEmpty()) {
            head = node;
            size++;
            System.out.println("\nData entered successfully !");
        } else {
            node.next = head;
            head = node;
            size++;
            System.out.println("\nData entered successfully !");
        }
    }

    public void insertMiddle(String employeeId, String employeeName, String refId) {
        Node node = new Node(employeeId, employeeName);
        Node temp = head;
        while (!temp.employeeId.equals(refId)) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        System.out.println("\nData entered successfully !");
    }


    public void insertLast(String employeeId, String employeeName) {
        Node node = new Node(employeeId, employeeName);
        Node temp;
        if (isEmpty()) {
            head = node;
            head.next = null;
            System.out.println("\nData entered successfully !");
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            System.out.println("\nData entered successfully !");
        }
    }

    public Node deleteFirst() {
        if (isEmpty()) {
            System.out.println("\nData is empty !");
            return null;
        } else {
            Node temp = head;
            head = head.next;
            System.out.println("\nDelete data successfully !");
            return temp;
        }
    }

    public void deleteMiddle(String refId) {
        Node temp = head;
        Node newTemp = null;
        while (!temp.employeeId.equals(refId)) {
            newTemp = temp;
            temp = temp.next;
        }
        newTemp.next = temp.next;
        System.out.println("\nDelete data successfully !");
        temp.next = null;
    }

    public Node deleteLast() {
        if (!isEmpty()) {
            Node temp, current;
            current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            temp = current.next;
            current.next = null;
            System.out.println("\nDelete data successfully !");
            return temp;
        } else {
            Node temp = head;
            head = null;
            System.out.println("\nData is empty !");
            return temp;
        }
    }

    public void show() {
        Node current = head;
        if (current == null) {
            System.out.println("\nData is empty !");
        } else {
            while (current != null) {
                current.showData();
                current = current.next;
            }
            System.out.println();
        }
    }
}
