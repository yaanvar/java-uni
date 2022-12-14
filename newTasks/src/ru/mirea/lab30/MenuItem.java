package ru.mirea.lab30;

public class MenuItem {
    String name, description;
    int cost;

    public MenuItem(String name, String description, int cost){
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }
}