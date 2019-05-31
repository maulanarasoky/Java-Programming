package com.company;

public interface stackInterface<T> {
    boolean isEmpty();
    void push(T element);
    T pop();
    int size();
}
