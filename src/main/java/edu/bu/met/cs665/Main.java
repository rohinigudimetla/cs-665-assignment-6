/**
 Name: ROHINI GUDIMETLA
 Course: CS-665 Software Designs & Patterns
 Date: 04/25/2024
 File Name: Main.java
 Description: The main entry point of the Beverage Vending Machine application.
 */

package edu.bu.met.cs665;

public class Main {
  public static void main(String[] args) {
    Beverage espresso = new Espresso();
    VendingMachine vendingMachine = new VendingMachine(espresso);

    vendingMachine.selectBeverage();
    vendingMachine.addCondiment(new Sugar());
    vendingMachine.addCondiment(new Milk());
    vendingMachine.insertMoney(4.0);
  }
}