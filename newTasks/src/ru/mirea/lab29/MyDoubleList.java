package ru.mirea.lab29;

public class MyDoubleList {
    private ListElement head;

    private int size;

    MyDoubleList() {
        this.head  = null;
        this.size = 0;
    }

    MyDoubleList(Item[] items) {
        for (int i = 0; i < items.length; i++) {
            add(items[i]);
        }
    }

    public int getSize() {
        return size;
    }

    public boolean add(Item item) {
        if (head == null) {
            head = new ListElement(item, null, null);
            head.nextItem = head;
            head.prevItem = head;
        } else {
            ListElement tmp = head;
            while (tmp.nextItem != head) tmp = tmp.nextItem;
            tmp.nextItem = new ListElement(item, tmp, head);
            head.prevItem = tmp.nextItem;
        }
        size++;
        return true;
    }

    public boolean remove(String name) {
        ListElement tmp = head;
        if (tmp == null) return false;

        if (head.item.getName().equals(name)) {
            head.prevItem.nextItem = head.nextItem;
            head.nextItem.prevItem = head.prevItem;
        }
        while (tmp.nextItem != head && !tmp.item.getName().equals(name)) tmp = tmp.nextItem;

        if (tmp.nextItem != head && tmp.prevItem != head) {
            tmp.prevItem.nextItem = tmp.nextItem;
            tmp.nextItem.prevItem = tmp.prevItem;
        }
        size--;
        return true;
    }

    public int contains(Item item) {
        ListElement tmp = head;
        int count = 0;

        while (tmp != null)
            if (item.getPrice() == tmp.item.getPrice() && item.getName() == tmp.item.getName() && item.getDescription() == tmp.item.getDescription()) {
                count++;
                tmp = tmp.nextItem;
            } else
                tmp = tmp.nextItem;
        return count;
    }

    public int contains(String name) {
        ListElement tmp = head;
        int count = 0;

        while (tmp != null)
            if (name == tmp.item.getName()) {
                count++;
                tmp = tmp.nextItem;
            } else
                tmp = tmp.nextItem;
        return count;
    }

    public Item[] convertToArray() {
        ListElement tmp = head;

        Item[] newArray = new Item[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = tmp.item;
            tmp = tmp.nextItem;
        }
        return newArray;
    }

    public Item get(int i) {
        if (i > size) return null;

        int count = 0;

        ListElement tmp = head;

        while (tmp != null && count++ != i) tmp = tmp.nextItem;

        return (tmp != null) ? tmp.item : null;
    }
}