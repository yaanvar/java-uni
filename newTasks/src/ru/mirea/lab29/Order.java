package ru.mirea.lab29;

public interface Order {
    boolean add(Item item);

    boolean remove(String name);

    int removeAll(String name);

    int getOrdersCount();

    Item[] getItemArray();

    int getTotalPrice();

    int getAmount(String name);

    Item[] getSortedArray();

    String[] getMenu();
}