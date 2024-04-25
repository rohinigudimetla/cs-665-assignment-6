package edu.bu.met.cs665;

public class Milk implements Condiment {
    private static final double UNIT_COST = 0.5;

    @Override
    public double getCost() {
        return UNIT_COST;
    }
}
