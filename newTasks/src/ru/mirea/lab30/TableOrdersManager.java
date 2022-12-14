package ru.mirea.lab30;
import java.util.ArrayList;

public class TableOrdersManager implements OrdersManager{

    Order[] orders;
    int maxTables;

    TableOrdersManager(int maxTables){
        this.maxTables = maxTables;
        orders = new Order[maxTables];
    }

    public void add(Order order, int TableNumber){
        if (TableNumber < orders.length && TableNumber > 0 && orders[TableNumber] == null){
            orders[TableNumber] = order;
        }
    }

    public void addItem(MenuItem item, int TableNumber){
        if (TableNumber < orders.length && TableNumber > 0){
            orders[TableNumber].add(item);
        }
    }

    public Order getOrder(int TableNumber){
        if (TableNumber < orders.length && TableNumber > 0 ){
            return orders[TableNumber];
        }
        return null;
    }

    public int freeTableNumber(){
        for(int i = 0; i < orders.length; i++){
            if(orders[i] == null) {
                return i + 1;
            }
        }
        return -1;
    }

    public int[] freeTableNumbers(){
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < orders.length; i++){
            if(orders[i] == null) {
                al.add(i + 1);
            }
        }
        return al.stream().mapToInt(i -> i).toArray();
    }

    public void remove(int TableNumber){
        if (TableNumber < orders.length && TableNumber > 0){
            orders[TableNumber] = null;
        }
    }

    public void removeAll(Order order){
        int i = 0;
        for(Order orderTmp : orders){
            if(order == orderTmp) orders[i] = null;
            i++;
        }
    }

    public void remove(Order order){
        int i = 0;
        for(Order orderTmp : orders){
            if(order == orderTmp){
                orders[i] = null;
                return;
            }
            i++;
        }
    }

    @Override
    public int itemsQuantity(String itemName) {
        int total = 0;
        for(Order order : orders){
            for(MenuItem item : order.getItems()){
                if(item.getName() == itemName) total++;
            }
        }
        return total;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int total = 0;
        for(Order order : orders){
            for(MenuItem menuItem : order.getItems()){
                if(menuItem == item) total++;
            }
        }
        return total;
    }

    @Override
    public Order[] getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int total = 0;
        for(Order order : orders){
            for(MenuItem item : order.getItems()){
                total+=item.getCost();
            }
        }
        return total;
    }

    @Override
    public int ordersQuantity() {
        return orders.length;
    }
}