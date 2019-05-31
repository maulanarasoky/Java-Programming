/*
Author  : Maulana Rasoky Nasution
Website : https://mul-code.blogspot.com
*/
package com.company;

public interface StackInterface<T> {

    boolean isEmpty();

    void push(T data);

    T pop();
}
