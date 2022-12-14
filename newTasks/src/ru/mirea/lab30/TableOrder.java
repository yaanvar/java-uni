package ru.mirea.lab30;


import java.util.ArrayList;
import java.util.Comparator;

public class TableOrder implements Order {
    MyDoubleList restaurantOrders = new MyDoubleList();

    @Override
    public String[] getMenu() {
        String[] str = new String[restaurantOrders.size()];
        for (int i = 0; i < restaurantOrders.size(); i++) {
            str[i] = restaurantOrders.get(i).getName() + " " + restaurantOrders.get(i).getDescription() + " " + restaurantOrders.get(i).getCost();
        }
        return str;
    }

    @Override
    public ArrayList<MenuItem> getItems() {
        return restaurantOrders.convertToAL();
    }

    @Override
    public boolean add(MenuItem item) {
        return restaurantOrders.add(item);
    }

    @Override
    public String[] itemsNames() {
        String[] str = new String[restaurantOrders.size()];
        for (int i = 0; i < restaurantOrders.size(); i++)
            str[i] = restaurantOrders.get(i).getName();
        return str;
    }

    @Override
    public int itemsQuantity(String itemName) {
        return restaurantOrders.contains(itemName);
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return restaurantOrders.contains(item);
    }

    @Override
    public int itemsQuantity() {
        return restaurantOrders.size();
    }

    @Override
    public boolean remove(String name) {
        return restaurantOrders.remove(name);
    }

    @Override
    public boolean remove(MenuItem item) {
        return restaurantOrders.remove(item);
    }

    @Override
    public int removeAll(String name) {
        int count = restaurantOrders.contains(name);
        while (restaurantOrders.contains(name) != 0) remove(name);
        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        int count = restaurantOrders.contains(item);
        while (restaurantOrders.contains(item) != 0) restaurantOrders.remove(item);
        return count;
    }

    @Override
    public ArrayList<MenuItem> sortedItemsByCostDesc() {
        ArrayList<MenuItem> al = restaurantOrders.convertToAL();
        al.sort(Comparator.comparing(MenuItem::getCost));
        return al;
    }

    @Override
    public double costTotal() {
        ArrayList<MenuItem> al = restaurantOrders.convertToAL();
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