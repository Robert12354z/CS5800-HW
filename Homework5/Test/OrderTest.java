package Homework5.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Homework5.Decorator.*;



public class OrderTest {
    Food burger = new ConcreteFood(10.0);

    @Test
    public void testCalculateTotal() {

        CustomerLoyalty loyalty = new CustomerLoyalty(0.15, false);

        Order order = new Order(loyalty);
    
        order.addFood(burger);

        double expected = 10.0;

        double actual = order.calculateTotal();
        
        assertEquals(expected, actual, 0.0);
    }

    @Test  
    public void testCalculateTotalWithLoyalty() {

        CustomerLoyalty loyalty = new CustomerLoyalty(0.15, true);

        Order order = new Order(loyalty);

        order.addFood(burger);

        double expected = 8.5;

        double actual = order.calculateTotal();
        
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalWithMultipleFoods() {
        CustomerLoyalty loyalty = new CustomerLoyalty(0.15, false);
        Order order = new Order(loyalty);

        Food fries = new ConcreteFood(5.0);
        order.addFood(burger);
        order.addFood(fries);

        double expected = 15.0;

        double actual = order.calculateTotal();
        
        assertEquals(expected, actual, 0.0);
    }

    @Test  
    public void testCalculateTotalWithMultipleFoodsAndLoyalty() {
        CustomerLoyalty loyalty = new CustomerLoyalty(0.15, true);
        Order order = new Order(loyalty);

        Food fries = new ConcreteFood(5.0);
        order.addFood(burger);
        order.addFood(fries);

        double expected = 12.75;

        double actual = order.calculateTotal();
        
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalWithMultipleFoodsAndMultipleLoyalty() {
        CustomerLoyalty loyalty = new CustomerLoyalty(0.15, true);
        Order order = new Order(loyalty);

        Food fries = new ConcreteFood(5.0);
        order.addFood(burger);
        order.addFood(fries);

        CustomerLoyalty loyalty2 = new CustomerLoyalty(0.10, true);
        Order order2 = new Order(loyalty2);

        Food fries2 = new ConcreteFood(5.0);
        order2.addFood(burger);
        order2.addFood(fries2);

        double expected = 12.75;

        double actual = order.calculateTotal();
        
        assertEquals(expected, actual, 0.0);

        double expected2 = 13.5;

        double actual2 = order2.calculateTotal();
        
        assertEquals(expected2, actual2, 0.0);
    }

    @Test
    public void testCalculateTotalWithMultipleToppings() {
        CustomerLoyalty loyalty = new CustomerLoyalty(0.15, false);
        Order order = new Order(loyalty);

        Food burger = new ConcreteFood(10.0);
        burger = new Topping(burger, 2.0);
        burger = new Topping(burger, 3.0);
        order.addFood(burger);

        double expected = 15.0;

        double actual = order.calculateTotal();
        
        assertEquals(expected, actual, 0.0);
    }
}
