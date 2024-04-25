// TestBeverage.java
package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBeverage {
    @Test
    public void testAddCondiment() {
        Beverage coffee = new Espresso();
        coffee.addCondiment(new Milk());
        assertEquals(1, coffee.getCondiments().size());
    }

    @Test
    public void testAddCondiment2() {
        Beverage tea = new BlackTea();
        tea.addCondiment(new Sugar());
        tea.addCondiment(new Sugar());
        assertEquals(2, tea.getCondiments().size());
    }

    @Test
    public void testAddCondiment3() {
        Beverage coffee = new Americano();
        for (int i = 0; i < 3; i++) {
            coffee.addCondiment(new Sugar());
        }
        assertEquals(3, coffee.getCondiments().size());
    }

    @Test
    public void testAddMoreThanThreeCondiments() {
        Beverage coffee = new LatteMacchiato();
        for (int i = 0; i < 4; i++) {
            coffee.addCondiment(new Milk());
        }
        assertEquals(3, coffee.getCondiments().size());
    }

    @Test
    public void testAddMoreThanSixCondiments() {
        Beverage tea = new GreenTea();
        for (int i = 0; i < 4; i++) {
            tea.addCondiment(new Sugar());
            tea.addCondiment(new Milk());
        }
        assertEquals(6, tea.getCondiments().size());
    }
}
