package Homework5.Decorator;

import java.util.ArrayList;

public class Order {
    private ArrayList<Food> order = new ArrayList<Food>();
    private CustomerLoyalty loyalty;
    private double discount;

    public Order(CustomerLoyalty loyalty) {
        this.loyalty = loyalty;
    }

    public void addFood(Food food) {
        order.add(food);
    }
    

    public double calculateTotal() {
        double total = 0.0;

        if (loyalty.getLoyal()) {
            discount = loyalty.getDiscount();
        } else {
            discount = 0.0;
        }

        for (Food food : order) {
            total += food.getPrice();
        }

        total = total - (total * discount);
        return total;
    }
}
