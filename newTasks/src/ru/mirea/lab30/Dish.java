package ru.mirea.lab30;

public final class Dish extends MenuItem {
    public Dish(String name, String description, int cost) {
        super(name, description, cost);
    }

    @Override
    public String toString() {
        return " " + getName() + " " + getDescription() + " " + getCost();
    }
}