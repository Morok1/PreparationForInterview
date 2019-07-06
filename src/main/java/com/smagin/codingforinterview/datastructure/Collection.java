package com.smagin.codingforinterview.datastructure;

public interface Collection<T> {
    T pop();

    void push(T value);

    boolean isEmpty();

    int getSize();
}
