package com.company;

public interface Interface<T> {
    boolean isEmpty();

    void pushCorrect(T data);

    void pushPoint(T data);

    void popAll();
}
