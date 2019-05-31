package com.company;

public class LinkedList<T> implements Interface<T> {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private T data;
        Node next;
        Node prev;

        Node(T data) {
            this(data, null, null);
        }

        Node(T data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
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

        Node getPrev() {
            return prev;
        }

        void setPrev(Node prev) {
            this.prev = prev;
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
            tail = node;
            size++;
            System.out.println("\nData entered successfully !");
        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
            size++;
            System.out.println("\nData entered successfully !");
        }
    }

    @Override
    public void insertMiddle(T data, int index) {
        Node node = new Node(data);
        if ((index >= 1) && (index <= size + 1)) {
            if (isEmpty()) {
                head = node;
                tail = node;
            } else if (index == 1) {
                node.setNext(head);
                head.setPrev(node);
                head = node;
            } else if (index == size + 1) {
                tail.setNext(node);
                node.setPrev(tail);
                tail = node;
            } else {
                Node before = search(index - 1);
                Node after = search(index);
                before.setNext(node);
                node.setPrev(before);
                after.setPrev(node);
                node.setNext(after);
            }
            size++;
            System.out.println("\nData entered successfully !");
        } else {
            System.out.println("\nData not entered successfully !");
        }

    }

    @Override
    public void insertLast(T data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
            tail = node;
            size++;
            System.out.println("\nData entered successfully !");
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
            size++;
            System.out.println("\nData entered successfully !");
        }
    }

    @Override
    public void insertBefore(T data, int index) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
            tail = node;
            size++;
            System.out.println("\nData entered successfully !");
        } else if ((index >= 1) && (index <= size + 1)) {
            if (index == size) {
                Node temp = tail.getPrev();
                tail.setPrev(node);
                node.setNext(tail);
                node.setPrev(temp);
                temp.setNext(node);
            } else if (index == 1) {
                node.setNext(head);
                head.setPrev(node);
                head = node;
            } else {
                Node before = search(index - 1);
                Node after = search(index);
                before.setNext(node);
                node.setPrev(before);
                after.setPrev(node);
                node.setNext(after);
            }
            size++;
            System.out.println("\nData entered successfully !");
        } else {
            System.out.println("\nData not entered successfully !");
        }
    }

    @Override
    public void insertAfter(T data, int index) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
            tail = node;
            size++;
            System.out.println("\nData entered successfully !");
        } else if ((index >= 1) && (index <= size)) {
            if (index == size) {
                tail.setNext(node);
                node.setPrev(tail);
                tail = node;
            } else if (index == 1) {
                Node temp = head.getNext();
                head.setNext(node);
                node.setPrev(head);
                node.setNext(temp);
                temp.setPrev(node);
            } else {
                Node after = search(index + 1);
                Node before = search(index);
                before.setNext(node);
                node.setPrev(before);
                after.setPrev(node);
                node.setNext(after);
            }
            size++;
            System.out.println("\nData entered successfully !");
        } else {
            System.out.println("\nData not entered successfully !");
        }
    }

    @Override
    public void deleteFirst() {
        if (!isEmpty()) {
            head = head.next;
            if (size == 1) {
                tail = null;
            } else {
                head.prev = null;
            }
            size--;
            System.out.println("\nDelete data successfully !");
        } else {
            System.out.println("\nData is empty !");
        }
    }

    @Override
    public void deleteMiddle(int index) {
        if (isEmpty()) {
            System.out.println("\nData is empty !");
        } else if ((index >= 1) && (index <= size)) {
            if (index == 1) {
                //implement delete first
                head = head.next;
                if (size == 1) {
                    tail = null;
                } else {
                    head.prev = null;
                }
            } else if (index == (size)) {
                //implement delete last
                tail = tail.prev;
                tail.next = null;
            } else {
                Node before = search(index - 1);
                Node after = search(index + 1);
                before.setNext(after);
                after.setPrev(before);
            }
            size--;
            System.out.println("\nDelete data successfully !");
        } else {
            System.out.println("\nDelete data not successfully !");
        }
    }

    @Override
    public void deleteLast() {
        if (!isEmpty()) {
            tail = tail.prev;
            if (size == 1) {
                head = null;
            } else {
                tail.next = null;
            }
            size--;
            System.out.println("\nDelete data successfully !");
        } else {
            System.out.println("Data is empty !");
        }
    }

    @Override
    public void deleteBefore(int index) {
        if (isEmpty()) {
            System.out.println("\nData is empty !");
        } else if ((index > 1) && (index <= size)) {
            if (index == 2) {
                head = head.next;
                head.prev = null;
            } else if (index == size) {
                Node temp = tail.getPrev();
                Node newTemp = temp.getPrev();
                tail.setPrev(newTemp);
                newTemp.setNext(tail);
            } else {
                Node before = search(index - 2);
                Node after = search(index);
                before.setNext(after);
                after.setPrev(before);
            }
            size--;
            System.out.println("\nDelete data successfully !");
        } else {
            if (index == 0) {
                System.out.println("\nPlease use Delete First instead");
            } else {
                System.out.println("\nDelete data not successfully !");
            }
        }
    }

    @Override
    public void deleteAfter(int index) {
        if (isEmpty()) {
            System.out.println("\nData is empty !");
        } else if ((index >= 1) && (index < size)) {
            if ((index == 1) && (size == 2)) {
                head.setNext(null);
            } else if (index == (size - 1)) {
                tail = tail.prev;
                tail.next = null;
            } else {
                Node before = search(index);
                Node after = search(index + 2);
                before.setNext(after);
                after.setPrev(before);
            }
            size--;
            System.out.println("\nDelete data successfully !");
        } else {
            if (index == 0) {
                System.out.println("\nPlease use Delete First instead");
            } else {
                System.out.println("\nDelete data not successfully !");
            }
        }
    }

    @Override
    public void findEmployeeName(String employeeName) {
        boolean found = false;
        Node iterator = head;
        while (!found && (iterator != null)) {
            Element element = (Element) iterator.data;
            if (employeeName.equals(element.employeeName)) {
                System.out.println();
                System.out.println("Employee ID     : " + element.employeeId);
                System.out.println("Employee Name   : " + element.employeeName);
                System.out.println("Salary          : Rp. " + element.employeeSalary);
                return;
            } else {
                iterator = iterator.next;
            }
        }
        System.out.println("\nSorry, the name of the employee you are looking for is not found :(");
    }

    @Override
    public void findEmployeeId(String employeeId) {
        boolean found = false;
        Node iterator = head;
        while (!found && (iterator != null)) {
            Element element = (Element) iterator.data;
            if (employeeId.equals(element.employeeId)) {
                System.out.println();
                System.out.println("Employee ID     : " + element.employeeId);
                System.out.println("Employee Name   : " + element.employeeName);
                System.out.println("Salary          : Rp. " + element.employeeSalary);
                return;
            } else {
                iterator = iterator.next;
            }
        }
        System.out.println("\nSorry, the ID of the employee you are looking for is not found :(");
    }

    @Override
    public void show() {
        if (this.head == null) {
            System.out.println("\nData is empty !");
        } else {
            Node node = this.head;
            System.out.println("\n===== Employee List =====\n");
            while (node != null) {
                Elements employeeData = (Elements) node.getData();
                System.out.println("Employee ID     : " + employeeData.employeeId);
                System.out.println("Employee Name   : " + employeeData.employeeName);
                System.out.println("Salary          : Rp. " + employeeData.employeeSalary);
                System.out.println();
                node = node.getNext();
            }
        }
    }

    @Override
    public void showInverse() {
        if (this.head == null) {
            System.out.println("\nData is empty !");
        } else {
            Node node = this.tail;
            System.out.println("\n===== Employee List =====\n");
            while (node != null) {
                Elements employeeData = (Elements) node.getData();
                System.out.println("Employee ID     : " + employeeData.employeeId);
                System.out.println("Employee Name   : " + employeeData.employeeName);
                System.out.println("Salary          : Rp. " + employeeData.employeeSalary);
                System.out.println();
                node = node.getPrev();
            }
        }
    }

    private Node search(int index) {
        assert (head != null && index >= 1 && index <= size);
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        assert current != null;
        return current;
    }
}
