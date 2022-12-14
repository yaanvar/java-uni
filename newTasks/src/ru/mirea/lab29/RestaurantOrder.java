package ru.mirea.lab29;

public class RestaurantOrder implements Order {
    MyDoubleList restaurantOrders = new MyDoubleList();

    @Override
    public String[] getMenu() {
        String[] str = new String[restaurantOrders.getSize()];
        for (int i = 0; i < restaurantOrders.getSize(); i++) {
            str[i] = restaurantOrders.get(i).getName() + " " + restaurantOrders.get(i).getDescription() + " " + restaurantOrders.get(i).getPrice();
        }
        return str;
    }

    @Override
    public boolean add(Item item) {
        return restaurantOrders.add(item);
    }

    @Override
    public boolean remove(String name) {
        return restaurantOrders.remove(name);
    }

    @Override
    public int removeAll(String name) {
        int count = restaurantOrders.contains(name);
        while (restaurantOrders.contains(name) != 0) remove(name);
        return count;
    }

    @Override
    public int getOrdersCount() {
        return restaurantOrders.getSize();
    }

    @Override
    public Item[] getItemArray() {
        return restaurantOrders.convertToArray();
    }

    @Override
    public int getTotalPrice() {
        Item[] items = restaurantOrders.convertToArray();
        int total = 0;
        for (Item item : items) total += item.getPrice();
        return total;
    }

    @Override
    public int getAmount(String name) {
        return restaurantOrders.contains(name);
    }

    @Override
    public Item[] getSortedArray() {
        Item[] items = restaurantOrders.convertToArray();

        for (int i = 0; i < items.length; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[i].getPrice() < items[j].getPrice()) {
                    Item tmpItem = items[i];
                    items[i] = items[j];
                    items[j] = tmpItem;
                }
            }
        }
        return items;
    }
}