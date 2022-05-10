package com.company.q6;

public class Node<T> {
    //attributes
    private T value;
    private Node<T> next;



    public Node(T value) {
        this.value = value;
        this.next = null;
    }


    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    //return true if there is a next node
    public boolean hasNext() {

        return this.next != null;
    }
    public T getValue() {
        return value;
    }


    public void setValue(T value) {

        this.value = value;
    }


    public Node<T> getNext() {

        return next;
    }


    public void setNext(Node<T> next) {

        this.next = next;
    }

}
