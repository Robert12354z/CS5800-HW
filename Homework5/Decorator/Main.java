package Homework5.Decorator;

public class Main {

    public static void main(String[] args) {
        Food burger = new ConcreteFood(10.0);
        System.out.println("Base price: $" + burger.getPrice());

        burger = new Topping(burger, 2.0);
        System.out.println("Price after adding topping: $" + burger.getPrice());

        burger = new Topping(burger, 3.0);
        System.out.println("Price after adding another topping: $" + burger.getPrice());

        Order order = new Order();
        order.addFood(burger);
        System.out.println("Total price: $" + order.calculateTotal());


    }
    
}
