package ru.mirea.lab30;


public class QueueNode {
    QueueNode next;
    QueueNode prev;
    Order value;

    QueueNode(Order value, Customer customer, QueueNode prev) {
        this.prev = prev;
        this.value = value;

        next = null;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
}