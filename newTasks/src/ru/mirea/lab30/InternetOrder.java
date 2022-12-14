package ru.mirea.lab30;


import java.util.ArrayList;
import java.util.Comparator;

public class InternetOrder implements Order {
    MyDoubleList InternetOrder = new MyDoubleList();

    @Override
    public String[] getMenu() {
        String[] str = new String[InternetOrder.size()];
        for (int i = 0; i < InternetOrder.size(); i++) {
            str[i] = InternetOrder.get(i).getName() + " " + InternetOrder.get(i).getDescription() + " " + InternetOrder.get(i).getCost();
        }
        return str;
    }

    @Override
    public ArrayList<MenuItem> getItems() {
        return InternetOrder.convertToAL();
    }

    @Override
    public boolean add(MenuItem item) {
        return InternetOrder.add(item);
    }

    @Override
    public String[] itemsNames() {
        String[] str = new String[InternetOrder.size()];
        for (int i = 0; i < InternetOrder.size(); i++)
            str[i] = InternetOrder.get(i).getName();
        return str;
    }

    @Override
    public int itemsQuantity(String itemName) {
        return InternetOrder.contains(itemName);
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return InternetOrder.contains(item);
    }

    @Override
    public int itemsQuantity() {
        return InternetOrder.size();
    }

    @Override
    public boolean remove(String name) {
        return InternetOrder.remove(name);
    }

    @Override
    public boolean remove(MenuItem item) {
        return InternetOrder.remove(item);
    }

    @Override
    public int removeAll(String name) {
        int count = InternetOrder.contains(name);
        while (InternetOrder.contains(name) != 0) remove(name);
        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        int count = InternetOrder.contains(item);
        while (InternetOrder.contains(item) != 0) InternetOrder.remove(item);
        return count;
    }

    @Override
    public ArrayList<MenuItem> sortedItemsByCostDesc() {
        ArrayList<MenuItem> al = InternetOrder.convertToAL();
        al.sort(Comparator.comparing(MenuItem::getCost));
        return al;
    }

    @Override
    public double costTotal() {
        ArrayList<MenuItem> al = InternetOrder.convertToAL();
        int total = 0;
        for (MenuItem item : al) total += item.getCost();
        return total;
    }

    @Override
    public Customer getCustomer() {
        return null;
    }

    @Override
    public void setCustomer(Customer newCustomer) {
    }
}
