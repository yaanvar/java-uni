package ru.mirea.lab29;

public class InternetOrder implements Order {
    MyDoubleList internetOrders;

    InternetOrder() {
        internetOrders = new MyDoubleList();
    }

    InternetOrder(Item[] items) {
        internetOrders = new MyDoubleList(items);
    }

    public void getOrder(Item[] order) {
        for (Item item : order) internetOrders.add(item);
    }

    @Override
    public String[] getMenu() {
        String[] str = new String[internetOrders.getSize()];
        for (int i = 0; i < internetOrders.getSize(); i++) {
            str[i] = internetOrders.get(i).getName() + " " + internetOrders.get(i).getDescription() + " " + internetOrders.get(i).getPrice();
        }
        return str;
    }

    @Override
    public boolean add(Item item) {
        return internetOrders.add(item);
    }

    @Override
    public boolean remove(String name) {
        return internetOrders.remove(name);
    }

    @Override
    public int removeAll(String name) {
        int count = internetOrders.contains(name);
        while (internetOrders.contains(name) != 0) remove(name);
        return count;
    }

    @Override
    public int getOrdersCount() {
        return internetOrders.getSize();
    }

    @Override
    public Item[] getItemArray() {
        return internetOrders.convertToArray();
    }

    @Override
    public int getTotalPrice() {
        Item[] items = internetOrders.convertToArray();
        int total = 0;
        for (Item item : items) total += item.getPrice();
        return total;
    }

    @Override
    public int getAmount(String name) {
        return internetOrders.contains(name);
    }

    @Override
    public Item[] getSortedArray() {
        Item[] items = internetOrders.convertToArray();

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
