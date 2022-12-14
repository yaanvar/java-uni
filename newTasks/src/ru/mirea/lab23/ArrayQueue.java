package ru.mirea.lab23;

public class ArrayQueue {
    private int currentSize = 0;
    private int realSize = 8;
    private Object array[];



    public ArrayQueue(){
        array = new Object[realSize];
        currentSize = 0;
    }

    private void increaseRealSize( int newSize){
        if ( newSize < array.length) return;
        realSize = newSize;
        Object[] tmp = new Object[realSize];

        System.arraycopy(array, 0, tmp, 0, currentSize);

        array = tmp;

    }

    public void enqueue(Object newElement){
        if ( newElement == null) return;
        if (array.length + 1 >= realSize*0.75) increaseRealSize(realSize*2);

        array[currentSize++] = newElement;
    }


    public Object element() {
        if(isEmpty()) return null;
        return array[0];
    }


    public Object dequeue() {
        if (isEmpty()) return null;
        Object[] tmp = new Object[realSize];
        Object firstElement = array[0];
        System.arraycopy(array, 1, tmp, 0, currentSize - 1);
        currentSize--;
        array = tmp;
        return firstElement;
    }

    public int size() {
        return currentSize;
    }

    public boolean isEmpty() {
        return (currentSize == 0);
    }


    public void clear() {
        currentSize = 0;
        realSize = 8;
        array = new Object[realSize];
    }

    public String show() {
        String result = "Queue: ";
        for (int i = 0; i < currentSize; i++) result += array[i] + " ";
        return result;
    }
}
