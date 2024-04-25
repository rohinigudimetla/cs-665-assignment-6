/**
 Name: ROHINI GUDIMETLA
 Course: CS-665 Software Designs & Patterns
 Date: 04/25/2024
 File Name: VendingMachine.java
 Description: Manages the Beverage Vending Machine operations, including beverage selection, condiment addition, and dispensing.
 */
package edu.bu.met.cs665;

public class VendingMachine {
    private Beverage beverage;

    public VendingMachine(Beverage beverage) {
        this.beverage = beverage;
    }

    public void selectBeverage() {
        System.out.println("You selected: " + beverage.getName());
    }

    public void addCondiment(Condiment condiment) {
        beverage.addCondiment(condiment);
    }

    public void insertMoney(double amount) {
        if (amount >= beverage.getPrice()) {
            System.out.println("Please take your change: " + (amount - beverage.getPrice()));
            dispenseBeverage();
        } else {
            System.out.println("Please insert more money.");
        }
    }

    private void dispenseBeverage() {
        System.out.println("Dispensing: " + beverage.getName());
        System.out.println("Condiments: " + beverage.getCondiments());
    }
}