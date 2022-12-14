package ru.mirea.lab29;

import java.util.HashMap;

public class OrderManager {
    HashMap<Integer, Order> RestaurantOrders = new HashMap<Integer, Order>();
    HashMap<String, Order> InternetOrders = new HashMap<String, Order>();

    public void add(Order order, int table) throws OrderAlreadyException {
        if (RestaurantOrders.containsKey(table))
            throw new OrderAlreadyException(Integer.toString(table));
        else RestaurantOrders.put(table, order);
    }

    public void add(Order order, String address) throws OrderAlreadyException {
        if (InternetOrders.containsKey(address))
            throw new OrderAlreadyException(address);
        else InternetOrders.put(address, order);
    }

    public void addPosition(Item item, int table) throws IllegalTableNumber {
        if (RestaurantOrders.containsKey(table)) {
            Order order = RestaurantOrders.get(table);
            order.add(item);
            RestaurantOrders.replace(table, order);
        } else {
            throw new IllegalTableNumber(Integer.toString(table));
        }
    }

    public void addPosition(Item item, String address) throws IllegalAddress {
        if (InternetOrders.containsKey(address)) {
            Order order = InternetOrders.get(address);
            order.add(item);
            InternetOrders.replace(address, order);
        } else {
            throw new IllegalAddress(address);
        }
    }

    public Object getOrder(int table) {
        return RestaurantOrders.get(table);
    }

    public Object getOrder(String address) {
        return InternetOrders.get(address);
    }

    public void removeOrder(int table) {
        RestaurantOrders.remove(table);
    }

    public void removeOrderInternet(String address) {
        InternetOrders.remove(address);
    }

    public HashMap orders() {
        return RestaurantOrders;
    }

    public HashMap getInternetOrder() {
        return InternetOrders;
    }
}