package Homework5.Decorator;

import java.util.ArrayList;

public class Order {
    private ArrayList<Food> order = new ArrayList<Food>();

    public void addFood(Food food) {
        order.add(food);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Food food : order) {
            total += food.getPrice();
        }
        return total;
    }
}
