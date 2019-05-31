/*
Author  : Maulana Rasoky Nasution
Website : https://mul-code.blogspot.com
*/
package com.company;

public interface QueueInterface<T> {
    boolean isEmpty();

    void enQueue(T data);

    T deQueue();
}
