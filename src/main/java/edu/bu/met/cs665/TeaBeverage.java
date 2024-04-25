package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

public abstract class TeaBeverage implements Beverage {
    protected String name;
    protected double price;
    protected List<Condiment> condiments;

    public TeaBeverage(String name, double price) {
        this.name = name;
        this.price = price;
        this.condiments = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public List<Condiment> getCondiments() {
        return condiments;
    }

    @Override
    public void addCondiment(Condiment condiment) {
        if (condiments.size() < 6) {
            if (condiment instanceof Sugar && getCondimentCount(Sugar.class) < 3) {
                condiments.add(condiment);
            } else if (condiment instanceof Milk && getCondimentCount(Milk.class) < 3) {
                condiments.add(condiment);
            } else {
                System.out.println("Cannot add more than 3 units of a single condiment.");
            }
        } else {
            System.out.println("Cannot add more than 6 condiments.");
        }
    }

    private int getCondimentCount(Class<? extends Condiment> condimentClass) {
        return (int) condiments.stream()
                .filter(condimentClass::isInstance)
                .count();
    }
}
