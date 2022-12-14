package ru.mirea.lab30;

public final class Drink extends MenuItem implements Alcoholable {
    private final DrinkTypeEnum type;
    private final double alcoholVol;

    public Drink(String name, String description, int cost, DrinkTypeEnum type, double alcoholVol) {
        super(name, description, cost);
        this.type = type;
        this.alcoholVol = alcoholVol;
    }

    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return type.isAlcohol();
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }

    @Override
    public String toString() {
        return " " + getName() + " " + getDescription() + " " + getCost();
    }
}