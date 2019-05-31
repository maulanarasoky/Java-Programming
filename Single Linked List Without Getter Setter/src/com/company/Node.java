package com.company;

public class Node {
    String employeeId;
    String employeeName;
    Node next;

    public Node(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void showData() {
        System.out.println("Employee Id     : " + employeeId);
        System.out.println("Employee Name   : " + employeeName);
        System.out.println();
    }
}
