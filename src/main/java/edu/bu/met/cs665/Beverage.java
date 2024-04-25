package edu.bu.met.cs665;

import java.util.List;

public interface Beverage {
    String getName();
    double getPrice();
    List<Condiment> getCondiments();
    void addCondiment(Condiment condiment);
}