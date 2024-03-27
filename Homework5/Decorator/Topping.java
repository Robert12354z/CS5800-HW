package Homework5.Decorator;

public class Topping extends TopDecorator {
    private double toppingPrice = 0.0;

    public Topping(Food food, double toppingPrice) {
        super(food);
        this.toppingPrice = toppingPrice;
    }

    public double getPrice() {
        return food.getPrice() + toppingPrice;
    }
}
