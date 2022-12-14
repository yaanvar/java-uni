package ru.mirea.lab23;
import org.w3c.dom.Node;

import java.util.LinkedList;

public class LinkedQueue extends AbstractQueue {
    private LinkedList<Object> queue;

    public LinkedQueue(){
        queue = new LinkedList<>();
    }

    protected void enquequeExecute(Object element){
        queue.add(element);
    }

    protected Object elementExecute(){
        return queue.getFirst();
    }

    protected Object dequeueExecute(){
        return queue.removeFirst();
    }

    protected String showExecute(){
        String tmp = "LinkedQueue: ";
        for(Object element : queue) tmp+= element.toString() + " ";
        return tmp;
    }
}