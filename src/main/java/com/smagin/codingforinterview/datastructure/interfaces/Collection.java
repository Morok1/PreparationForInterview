package com.smagin.codingforinterview.datastructure.interfaces;

public interface Collection<T> {
    T pop();

    void push(T value);

    boolean isEmpty();

    int getSize();
}
