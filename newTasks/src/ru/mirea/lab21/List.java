package ru.mirea.lab21;

public class List {

    private Object[] elements;
    private int size;

    List(int size) {
        this.size = size;
        this.elements = new Object[size];
    }

    public void setElementAt(int index, Object e) {
        if (index < 0 || index > this.size) {
            throw  new IndexOutOfBoundsException("Выход за границы массива");
        } else {
            this.elements[index] = e;
        }
    }

    public Object elementAt(int index) {
        if (index < 0 || index > this.size) {
            throw  new IndexOutOfBoundsException("Выход за границы массива");
        } else {
            return elements[index];
        }
    }

    public static void showAllElements(List list) {
        for (int i = 0; i < list.size; i++) {
            System.out.println(list.elementAt(i).getClass() + "   " + list.elementAt(i));
        }
    }

    public static void main(String[] args) {
        List storage = new List(5);
        storage.setElementAt(0, "Hello");
        storage.setElementAt(1, 123);
        storage.setElementAt(2, 456.7);
        storage.setElementAt(3, true);
        storage.setElementAt(4, 3423);

        showAllElements(storage);

    }
}