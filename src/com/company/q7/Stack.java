package com.company.q7;


public class Stack<T> {
    private Node<T> first;

    public Stack() {
        this.first = null;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public void push(T x) {
        this.first = new Node<T>(x, this.first);
    }

    public T pop() {
        T x = this.first.getValue();
        this.first = this.first.getNext();
        return x;
    }

    public T top() {
        return this.first.getValue();
    }

}
