package com.company;

public interface Interface<T> {
    boolean isEmpty();

    void insertFirst(T data);

    void insertMiddle(T data, int index);

    void insertLast(T data);

    void insertBefore(T data, int index);

    void insertAfter(T data, int index);

    void deleteFirst();

    void deleteMiddle(int index);

    void deleteLast();

    void deleteBefore(int index);

    void deleteAfter(int index);

    void findEmployeeName(String employeeName);

    void findEmployeeId(String employeeId);

    void show();

    void showInverse();
}
